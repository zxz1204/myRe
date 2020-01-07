package com.hqyj.modules.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@RequestMapping("/test/info")
	@ResponseBody
	public String getInfo() {
	return "This is spring boot demo app.";
	}
}