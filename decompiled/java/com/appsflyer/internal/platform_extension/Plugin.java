package com.appsflyer.internal.platform_extension;

import X.C08FF;

/* JADX INFO: loaded from: classes31.dex */
public enum Plugin {
    NATIVE("android_native"),
    UNITY("android_unity"),
    FLUTTER("android_flutter"),
    REACT_NATIVE("android_react_native"),
    ADOBE_AIR("android_adobe_air"),
    ADOBE_MOBILE("android_adobe_mobile"),
    COCOS_2DX("android_cocos2dx"),
    CORDOVA("android_cordova"),
    MPARTICLE("android_mparticle"),
    NATIVE_SCRIPT("android_native_script"),
    EXPO("android_expo"),
    UNREAL("android_unreal"),
    XAMARIN("android_xamarin"),
    CAPACITOR("android_capacitor"),
    SEGMENT("android_segment");

    public final String values;

    public static Plugin valueOf(String str) {
        return (Plugin) C08FF.LIZ(Plugin.class, str);
    }

    public final String getPluginName() {
        return this.values;
    }

    Plugin(String str) {
        this.values = str;
    }
}
