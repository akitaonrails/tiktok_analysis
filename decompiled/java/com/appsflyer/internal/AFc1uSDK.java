package com.appsflyer.internal;

import X.C1C7U;
import X.C2179971ATj;
import com.appsflyer.internal.AFe1cSDK.AnonymousClass2;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public final class AFc1uSDK implements Runnable {
    public final Map<String, Object> AFInAppEventParameterName;
    public final AFd1kSDK AFInAppEventType;
    public final AFa1qSDK values;

    @Override // java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("AFc1uSDK@a6ff.run");
        com_appsflyer_internal_AFc1uSDK_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        C1C7U.LIZIZ("AFc1uSDK@a6ff.run");
    }

    public final void com_appsflyer_internal_AFc1uSDK__run$___twin___() {
        AFe1dSDK aFf1lSDK;
        if (this.values.AFInAppEventType()) {
            AFf1cSDK aFf1cSDK = new AFf1cSDK(this.values, this.AFInAppEventType);
            aFf1cSDK.i = this.AFInAppEventParameterName;
            aFf1lSDK = aFf1cSDK;
        } else {
            aFf1lSDK = new AFf1lSDK(this.values, this.AFInAppEventType);
        }
        AFe1cSDK aFe1cSDKAfInfoLog = this.AFInAppEventType.afInfoLog();
        aFe1cSDKAfInfoLog.valueOf.execute(aFe1cSDKAfInfoLog.new AnonymousClass2(aFf1lSDK));
        if (aFf1lSDK.AFInAppEventType == AFf1zSDK.CONVERSION) {
            this.AFInAppEventType.afVerboseLog();
            if (AFe1gSDK.valueOf() && AFb1uSDK.AFKeystoreWrapper(this.AFInAppEventType.w().AFKeystoreWrapper)) {
                AFe1cSDK aFe1cSDKAfInfoLog2 = this.AFInAppEventType.afInfoLog();
                aFe1cSDKAfInfoLog2.valueOf.execute(aFe1cSDKAfInfoLog2.new AnonymousClass2(new AFf1qSDK(this.AFInAppEventType, "install")));
            }
        }
    }

    public static void com_appsflyer_internal_AFc1uSDK_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AFc1uSDK aFc1uSDK) {
        try {
            aFc1uSDK.com_appsflyer_internal_AFc1uSDK__run$___twin___();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public AFc1uSDK(AFd1kSDK aFd1kSDK, AFa1qSDK aFa1qSDK, Map<String, ? extends Object> map) {
        this.AFInAppEventType = aFd1kSDK;
        this.values = aFa1qSDK;
        this.AFInAppEventParameterName = map;
    }
}
