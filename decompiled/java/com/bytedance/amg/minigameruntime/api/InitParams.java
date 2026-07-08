package com.bytedance.amg.minigameruntime.api;

import android.app.Application;

/* JADX INFO: loaded from: classes21.dex */
public final class InitParams {
    public final Application LIZ;
    public boolean LJ;
    public String LIZIZ = "testApp";
    public String LIZJ = "18.0.0";
    public String LIZLLL = "2.0.0";
    public JsEngineType LJFF = JsEngineType.V8;

    public final Application getApp() {
        return this.LIZ;
    }

    public final String getMAppName() {
        return this.LIZIZ;
    }

    public final String getMAppVersion() {
        return this.LIZJ;
    }

    public final boolean getMIsDebugLocateJSMode() {
        return this.LJ;
    }

    public final JsEngineType getMJSEngineType() {
        return this.LJFF;
    }

    public final String getMSdkVersion() {
        return this.LIZLLL;
    }

    public InitParams(Application application) {
        this.LIZ = application;
    }

    public final InitParams setAPPNameName(String str) {
        this.LIZIZ = str;
        return this;
    }

    public final InitParams setAppVersion(String str) {
        this.LIZJ = str;
        return this;
    }

    public final InitParams setIsDebugLocateJSMode(boolean z) {
        this.LJ = z;
        return this;
    }

    public final InitParams setJSEngineType(JsEngineType jsEngineType) {
        this.LJFF = jsEngineType;
        return this;
    }

    public final void setMAppName(String str) {
        this.LIZIZ = str;
    }

    public final void setMAppVersion(String str) {
        this.LIZJ = str;
    }

    public final void setMIsDebugLocateJSMode(boolean z) {
        this.LJ = z;
    }

    public final void setMJSEngineType(JsEngineType jsEngineType) {
        this.LJFF = jsEngineType;
    }

    public final void setMSdkVersion(String str) {
        this.LIZLLL = str;
    }

    public final InitParams setSDKVersion(String str) {
        this.LIZLLL = str;
        return this;
    }
}
