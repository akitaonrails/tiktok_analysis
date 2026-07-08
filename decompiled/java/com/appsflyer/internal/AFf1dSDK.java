package com.appsflyer.internal;

import X.C786410Ut5;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes31.dex */
public final class AFf1dSDK extends AFf1lSDK {
    public static int $10 = 0;
    public static int $11 = 1;
    public static int afErrorLog = 1;
    public static int afRDLog;
    public static char[] afVerboseLog = {47458, 47457, 35995, 47459, 35998, 35976, 35988, 47460, 35992};
    public static char afWarnLog = 47459;
    public final AFg1mSDK afDebugLog;
    public final AFd1lSDK afInfoLog;
    public final String force;
    public final AFd1sSDK i;

    @Override // com.appsflyer.internal.AFf1lSDK
    public final void AFInAppEventParameterName(AFa1qSDK aFa1qSDK) {
        afErrorLog = (afRDLog + 3) % 128;
    }

    @Override // com.appsflyer.internal.AFf1lSDK
    public final void AFInAppEventType(AFa1qSDK aFa1qSDK) {
        int i = afRDLog + 33;
        afErrorLog = i % 128;
        if (i % 2 == 0) {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1lSDK
    public final void values(AFa1qSDK aFa1qSDK) {
        afErrorLog = (afRDLog + 59) % 128;
    }

    private void afInfoLog() {
        afRDLog = (afErrorLog + 109) % 128;
        this.w.valueOf("sentRegisterRequestToAF", true);
        afRDLog = (afErrorLog + 69) % 128;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventType() {
        afRDLog = (afErrorLog + 65) % 128;
        super.AFInAppEventType();
        ResponseNetwork responseNetwork = ((AFf1nSDK) this).registerClient;
        if (responseNetwork != null) {
            afErrorLog = (afRDLog + 91) % 128;
            if (responseNetwork.isSuccessful()) {
                int i = afErrorLog + 61;
                afRDLog = i % 128;
                boolean z = i % 2 != 0;
                afInfoLog();
                if (z) {
                    try {
                        throw null;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1lSDK, com.appsflyer.internal.AFf1nSDK
    public final boolean i() {
        afRDLog = (afErrorLog + 91) % 128;
        return false;
    }

    @Override // com.appsflyer.internal.AFf1lSDK
    public final void AFKeystoreWrapper(AFa1qSDK aFa1qSDK) {
        String strAFKeystoreWrapper = this.i.AFKeystoreWrapper();
        if (strAFKeystoreWrapper != null) {
            afRDLog = (afErrorLog + 49) % 128;
            aFa1qSDK.AFKeystoreWrapper("advertiserId", strAFKeystoreWrapper);
        }
        afRDLog = (afErrorLog + 85) % 128;
    }

    @Override // com.appsflyer.internal.AFf1lSDK
    public final void valueOf(AFa1qSDK aFa1qSDK) {
        boolean z;
        super.valueOf(aFa1qSDK);
        Context context = this.afInfoLog.AFKeystoreWrapper;
        AFb1vSDK aFb1vSDKAFKeystoreWrapper = AFb1vSDK.AFKeystoreWrapper();
        if (context != null) {
            if (!aFb1vSDKAFKeystoreWrapper.values()) {
                PackageManager packageManager = context.getPackageManager();
                try {
                    PackageInfo packageInfoY3 = C786410Ut5.Y3(packageManager, context.getPackageName(), 0);
                    aFa1qSDK.AFKeystoreWrapper("app_version_code", Integer.toString(packageInfoY3.versionCode));
                    aFa1qSDK.AFKeystoreWrapper("app_version_name", packageInfoY3.versionName);
                    aFa1qSDK.AFKeystoreWrapper("app_name", packageManager.getApplicationLabel(packageInfoY3.applicationInfo).toString());
                    aFa1qSDK.AFKeystoreWrapper("installDate", AFb1vSDK.AFKeystoreWrapper(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), packageInfoY3.firstInstallTime));
                } catch (Throwable th) {
                }
                this.afDebugLog.values(aFa1qSDK.AFInAppEventParameterName());
                aFa1qSDK.AFInAppEventParameterName().remove("ivc");
                String strValueOf = AFb1vSDK.valueOf();
                if (strValueOf != null) {
                    int i = afRDLog + 9;
                    afErrorLog = i % 128;
                    if (i % 2 != 0) {
                        aFa1qSDK.AFKeystoreWrapper("appUserId", strValueOf);
                    } else {
                        aFa1qSDK.AFKeystoreWrapper("appUserId", strValueOf);
                        try {
                            throw null;
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
                try {
                    aFa1qSDK.AFKeystoreWrapper("model", Build.MODEL);
                    Object[] objArr = new Object[1];
                    a("\u0002\b\u0000\b㙅", ((byte) KeyEvent.getModifierMetaStateMask()) + 6, (byte) (71 - View.combineMeasuredStates(0, 0)), objArr);
                    aFa1qSDK.AFKeystoreWrapper(((String) objArr[0]).intern(), Build.BRAND);
                } catch (Throwable th2) {
                }
                if (AppsFlyerProperties.getInstance().getBoolean("deviceTrackingDisabled", false)) {
                    int i2 = afRDLog + 55;
                    afErrorLog = i2 % 128;
                    if (i2 % 2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        aFa1qSDK.AFKeystoreWrapper("deviceTrackingDisabled", "true");
                    } else {
                        aFa1qSDK.AFKeystoreWrapper("deviceTrackingDisabled", "true");
                    }
                }
                AFb1zSDK aFb1zSDKAFInAppEventParameterName = AFb1rSDK.AFInAppEventParameterName(context.getContentResolver());
                if (aFb1zSDKAFInAppEventParameterName != null) {
                    aFa1qSDK.AFKeystoreWrapper("amazon_aid", aFb1zSDKAFInAppEventParameterName.AFInAppEventParameterName);
                    aFa1qSDK.AFKeystoreWrapper("amazon_aid_limit", String.valueOf(aFb1zSDKAFInAppEventParameterName.AFKeystoreWrapper));
                }
                aFa1qSDK.AFKeystoreWrapper("devkey", ((AFf1nSDK) this).d.AFLogger);
                aFa1qSDK.AFKeystoreWrapper("uid", AFb1kSDK.valueOf(this.afInfoLog, this.w));
                aFa1qSDK.AFKeystoreWrapper("af_gcm_token", this.force);
                aFa1qSDK.AFKeystoreWrapper("launch_counter", Integer.toString(this.w.valueOf("appsFlyerCount", 0)));
                aFa1qSDK.AFKeystoreWrapper("sdk", Integer.toString(Build.VERSION.SDK_INT));
                String strD = this.i.d();
                if (strD != null) {
                    aFa1qSDK.AFKeystoreWrapper("channel", strD);
                    return;
                }
                return;
            }
            throw new IllegalStateException("CustomerUserId not set, register is not sent");
        }
        throw new IllegalStateException("Context is not provided, can't send register request");
    }

    public AFf1dSDK(String str, AFd1kSDK aFd1kSDK) {
        super(new AFg1iSDK(aFd1kSDK.w().AFKeystoreWrapper), aFd1kSDK, str);
        this.i = aFd1kSDK.AFInAppEventType();
        this.afInfoLog = aFd1kSDK.w();
        this.force = str;
        this.afDebugLog = aFd1kSDK.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.lang.String r12, int r13, byte r14, java.lang.Object[] r15) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1dSDK.a(java.lang.String, int, byte, java.lang.Object[]):void");
    }
}
