package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.KeyStoreException;

/* JADX INFO: loaded from: classes31.dex */
public final class AFb1cSDK {
    public static final AFb1cSDK INSTANCE = new AFb1cSDK();

    public static String AFInAppEventType() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
    }

    public static String AFKeystoreWrapper() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerRICounter");
    }

    public static final void valueOf(AFd1lSDK aFd1lSDK, AFd1qSDK aFd1qSDK) {
        int i;
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (AFb1uSDK.AFInAppEventParameterName()) {
            i = 23;
        } else {
            i = 18;
        }
        if (Build.VERSION.SDK_INT >= i && !appsFlyerProperties.getBoolean("keyPropDisableAFKeystore", true)) {
            AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(aFd1lSDK.AFKeystoreWrapper);
            if (!aFKeystoreWrapper.AFInAppEventParameterName()) {
                aFKeystoreWrapper.AFKeystoreWrapper = AFb1kSDK.valueOf(aFd1lSDK, aFd1qSDK);
                aFKeystoreWrapper.AFInAppEventType = 0;
                aFKeystoreWrapper.AFInAppEventParameterName(aFKeystoreWrapper.AFKeystoreWrapper());
            } else {
                String strAFKeystoreWrapper = aFKeystoreWrapper.AFKeystoreWrapper();
                synchronized (aFKeystoreWrapper.valueOf) {
                    try {
                        aFKeystoreWrapper.AFInAppEventType++;
                        try {
                            synchronized (aFKeystoreWrapper.valueOf) {
                                try {
                                    aFKeystoreWrapper.AFInAppEventParameterName.deleteEntry(strAFKeystoreWrapper);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        } catch (KeyStoreException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
                aFKeystoreWrapper.AFInAppEventParameterName(aFKeystoreWrapper.AFKeystoreWrapper());
            }
            appsFlyerProperties.set("KSAppsFlyerId", aFKeystoreWrapper.AFInAppEventType());
            appsFlyerProperties.set("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.values()));
        }
    }
}
