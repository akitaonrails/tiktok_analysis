package com.bef.effectsdk;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class EffectSDKBuildConfig {
    public static int ENABLE_AUDIO_EFFECT = 1;
    public static int ENABLE_BYTEBENCH = 1;
    public static int ENABLE_FFMPEG = 1;
    public static int ENABLE_IES_APPLOGGER = 1;
    public static int ENABLE_JAZZ = 1;
    public static int ENABLE_VC0 = 1;

    public static List<String> getEffectLibs() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("c++_shared");
        if (ENABLE_BYTEBENCH == 1) {
            arrayList.add("bytebench");
        }
        if (ENABLE_FFMPEG == 1) {
            arrayList.add("ttcrypto");
            arrayList.add("ttboringssl");
        }
        if (ENABLE_FFMPEG == 1) {
            arrayList.add("ttffmpeg");
        }
        if (ENABLE_IES_APPLOGGER == 1) {
            arrayList.add("iesapplogger");
        }
        arrayList.add("bytenn");
        if (ENABLE_AUDIO_EFFECT == 1) {
            arrayList.add("audioeffect");
        }
        arrayList.add("gaia_lib");
        arrayList.add("AGFX");
        if (ENABLE_JAZZ == 1) {
            arrayList.add("napi");
            arrayList.add("quick");
            arrayList.add("jazz");
        }
        if (ENABLE_VC0 == 1) {
            arrayList.add("bytevc0");
        }
        arrayList.add("effect");
        return arrayList;
    }

    public static String getAarVersion() {
        return BuildConfig.FULL_VERSION;
    }

    public static String getSdkVersion() {
        return BuildConfig.SDK_VERSION_NAME;
    }
}
