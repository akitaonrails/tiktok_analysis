package com.bytedance.amg.minigameruntime.nativebridge.api;

import android.app.Application;

/* JADX INFO: loaded from: classes21.dex */
public final class MiniGameRuntimeBridgeConfig {
    public Application LIZ;
    public int LIZIZ = -1;
    public int LIZJ = -1;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;

    public final boolean isValid() {
        return this.LIZ != null && this.LIZLLL != null && this.LIZIZ > 0 && this.LIZJ > 0;
    }

    public final Application getApp() {
        return this.LIZ;
    }

    public final String getGameDirector() {
        return this.LIZLLL;
    }

    public final int getHeight() {
        return this.LIZJ;
    }

    public final String getLaunchJSFileName() {
        return this.LJI;
    }

    public final String getTempDirectory() {
        return this.LJ;
    }

    public final String getUseDirectory() {
        return this.LJFF;
    }

    public final int getWidth() {
        return this.LIZIZ;
    }

    public final void copyFrom(MiniGameRuntimeBridgeConfig miniGameRuntimeBridgeConfig) {
        this.LIZ = miniGameRuntimeBridgeConfig.LIZ;
        this.LIZIZ = miniGameRuntimeBridgeConfig.LIZIZ;
        this.LIZJ = miniGameRuntimeBridgeConfig.LIZJ;
        String str = miniGameRuntimeBridgeConfig.LIZLLL;
        this.LIZLLL = str;
        String str2 = miniGameRuntimeBridgeConfig.LJ;
        if (str2 == null) {
            str2 = str;
        }
        this.LJ = str2;
        String str3 = miniGameRuntimeBridgeConfig.LJFF;
        if (str3 != null) {
            str = str3;
        }
        this.LJFF = str;
        String str4 = miniGameRuntimeBridgeConfig.LJI;
        if (str4 == null) {
            str4 = "game.js";
        }
        this.LJI = str4;
    }

    public final void setApp(Application application) {
        this.LIZ = application;
    }

    public final void setGameDirector(String str) {
        this.LIZLLL = str;
    }

    public final void setHeight(int i) {
        this.LIZJ = i;
    }

    public final void setLaunchJSFileName(String str) {
        this.LJI = str;
    }

    public final void setTempDirectory(String str) {
        this.LJ = str;
    }

    public final void setUseDirectory(String str) {
        this.LJFF = str;
    }

    public final void setWidth(int i) {
        this.LIZIZ = i;
    }
}
