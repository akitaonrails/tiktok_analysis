package com.bytedance.amg.minigameruntime.api;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes21.dex */
public interface IClientAdapterService {
    boolean checkHttpUrlValidity(String str);

    void emitRemoteJSCallBack(Number number, String str);

    void emitRemoteJSEvent(String str, String str2);

    String getAppLanguage();

    IClientLogger getAppLogger();

    long getFileSizeLimit();

    GameDirectoryConfig getGameArchDirectoryConfig();

    GameDirectoryConfig getGameSetupDirectoryConfig();

    GameDirectoryConfig getPluginDirectoryConfig();

    long getReadSizeLimit();

    Rect getSafeArea();

    int getStatusBarHeight();

    GameDirectoryConfig getTempDirectoryConfig();

    GameDirectoryConfig getUserDirectoryConfig();

    boolean isRemoteDebugMode();

    void sendRemoteObject(String str, long j, String str2, String str3);
}
