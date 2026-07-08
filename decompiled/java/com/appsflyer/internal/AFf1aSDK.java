package com.appsflyer.internal;

import X.C098200Yq;
import X.C189200o6;
import X.C2095008Iq;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes31.dex */
public final class AFf1aSDK {
    public final boolean AFKeystoreWrapper(String str) {
        return AFInAppEventParameterName(this, str);
    }

    public static /* synthetic */ boolean AFInAppEventParameterName(AFf1aSDK aFf1aSDK, String str) {
        return AFKeystoreWrapper(str, TimeUnit.HOURS, 1L);
    }

    public static boolean AFKeystoreWrapper(String str, TimeUnit timeUnit, long j) {
        Long lLJIILIIL;
        Object c098200Yq;
        boolean z;
        if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
            try {
                if (Math.abs(lLJIILIIL.longValue() - TimeUnit.MILLISECONDS.toSeconds(AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName().e().AFInAppEventType())) < timeUnit.toSeconds(1L)) {
                    z = true;
                } else {
                    z = false;
                }
                c098200Yq = Boolean.valueOf(z);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Boolean bool = (Boolean) c098200Yq;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }
}
