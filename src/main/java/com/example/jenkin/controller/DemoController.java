package com.example.jenkin.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/api")
    public String sayHello() {
        return "Hello world";
    }

    @GetMapping("/api/{mes}")
    public String say(@PathVariable("mes") String mes) {
        return mes;
    }
}
