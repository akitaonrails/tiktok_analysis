package com.appsflyer.internal;

import X.C08FF;
import com.appsflyer.AFLogger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes31.dex */
public final class AFb1hSDK {
    public final AFa1ySDK AFKeystoreWrapper = new AFa1ySDK() { // from class: com.appsflyer.internal.AFb1hSDK.5
        @Override // com.appsflyer.internal.AFb1hSDK.AFa1ySDK
        public final Class<?> valueOf(String str) {
            return Class.forName(str);
        }
    };

    public interface AFa1ySDK {
        Class<?> valueOf(String str);
    }

    public final String valueOf() {
        for (AFa1uSDK aFa1uSDK : AFa1uSDK.values()) {
            if (valueOf(aFa1uSDK.afErrorLog)) {
                return aFa1uSDK.force;
            }
        }
        return AFa1uSDK.DEFAULT.force;
    }

    public enum AFa1uSDK {
        ADOBE_AIR("android_adobe_air", "com.appsflyer.adobeair.AppsFlyerExtension"),
        ADOBE_MOBILE_SDK("android_adobe_mobile", "com.appsflyer.adobeextension.AppsFlyerAdobeExtension"),
        COCOS2DX("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity"),
        CORDOVA("android_cordova", "com.appsflyer.cordova.plugin.AppsFlyerPlugin"),
        DEFAULT("android_native", "android_native"),
        FLUTTER("android_flutter", "com.appsflyer.appsflyersdk.AppsflyerSdkPlugin"),
        M_PARTICLE("android_mparticle", "com.mparticle.kits.AppsFlyerKit"),
        NATIVE_SCRIPT("android_native_script", "com.tns.NativeScriptActivity"),
        EXPO("android_expo", "expo.modules.devmenu.react.DevMenuAwareReactActivity"),
        REACT_NATIVE("android_reactNative", "com.appsflyer.reactnative.RNAppsFlyerModule"),
        UNITY("android_unity", "com.appsflyer.unity.AppsFlyerAndroidWrapper"),
        UNREAL_ENGINE("android_unreal", "com.epicgames.ue4.GameActivity"),
        XAMARIN("android_xamarin", "mono.android.Runtime"),
        CAPACITOR("android_capacitor", "capacitor.plugin.appsflyer.sdk.AppsFlyerPlugin");

        public final String afErrorLog;
        public final String force;

        public static AFa1uSDK valueOf(String str) {
            return (AFa1uSDK) C08FF.LIZ(AFa1uSDK.class, str);
        }

        AFa1uSDK(String str, String str2) {
            this.force = str;
            this.afErrorLog = str2;
        }
    }

    private boolean valueOf(String str) {
        try {
            this.AFKeystoreWrapper.valueOf(str);
            return true;
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            AFLogger.afErrorLogForExcManagerOnly("Class: " + str + " is  not found. (Platform extension)", e, true);
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AFLogger.afErrorLog(th.getMessage(), th);
            return false;
        }
    }
}
