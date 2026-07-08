package com.appsflyer.internal;

import X.C1C7U;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFi1aSDK;
import com.appsflyer.internal.AFi1hSDK;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes31.dex */
public final class AFi1aSDK {
    public final AFd1kSDK AFInAppEventParameterName;
    public final List<AFi1hSDK> AFKeystoreWrapper = new ArrayList();

    public static /* synthetic */ void lambda$semisugar$AFInAppEventType$0(AFi1aSDK aFi1aSDK, Runnable runnable) {
        C1C7U.LIZ("AFi1aSDK@a07d.AFInAppEventParameterName$1L");
        aFi1aSDK.AFInAppEventType(runnable);
        C1C7U.LIZIZ("AFi1aSDK@a07d.AFInAppEventParameterName$1L");
    }

    public static /* synthetic */ void lambda$semisugar$AFKeystoreWrapper$0(AFi1aSDK aFi1aSDK, Runnable runnable) {
        C1C7U.LIZ("AFi1aSDK@a07d.values$1L");
        aFi1aSDK.AFKeystoreWrapper(runnable);
        C1C7U.LIZIZ("AFi1aSDK@a07d.values$1L");
    }

    public static /* synthetic */ void lambda$semisugar$valueOf$0() {
        C1C7U.LIZ("AFi1aSDK@a07d.AFInAppEventType$2L");
        valueOf();
        C1C7U.LIZIZ("AFi1aSDK@a07d.AFInAppEventType$2L");
    }

    public static /* synthetic */ void lambda$semisugar$values$0(AFi1aSDK aFi1aSDK, Runnable runnable) {
        C1C7U.LIZ("AFi1aSDK@a07d.valueOf$1L");
        aFi1aSDK.values(runnable);
        C1C7U.LIZIZ("AFi1aSDK@a07d.valueOf$1L");
    }

    public static /* synthetic */ void lambda$semisugar$values$1(AFi1aSDK aFi1aSDK, AFi1lSDK aFi1lSDK, Runnable runnable) {
        C1C7U.LIZ("AFi1aSDK@a07d.AFInAppEventType$1L");
        aFi1aSDK.values(aFi1lSDK, runnable);
        C1C7U.LIZIZ("AFi1aSDK@a07d.AFInAppEventType$1L");
    }

    public static /* synthetic */ void valueOf() {
    }

    public final synchronized AFi1hSDK[] AFKeystoreWrapper() {
        return (AFi1hSDK[]) this.AFKeystoreWrapper.toArray(new AFi1hSDK[0]);
    }

    public final boolean values() {
        return this.AFInAppEventParameterName.AFInAppEventType().AFInAppEventParameterName("AF_PREINSTALL_DISABLED");
    }

    public AFi1aSDK(AFd1kSDK aFd1kSDK) {
        this.AFInAppEventParameterName = aFd1kSDK;
    }

    private /* synthetic */ void AFInAppEventType(Runnable runnable) {
        AFi1jSDK aFi1jSDK = new AFi1jSDK(this.AFInAppEventParameterName.AFInAppEventType(), this.AFInAppEventParameterName.values(), AFi1fSDK.INSTAGRAM, runnable, new Runnable() { // from class: X.13ns
            @Override // java.lang.Runnable
            public final void run() {
                AFi1aSDK.lambda$semisugar$valueOf$0();
            }
        });
        AFInAppEventParameterName(aFi1jSDK);
        aFi1jSDK.values(this.AFInAppEventParameterName.w().AFKeystoreWrapper);
    }

    private /* synthetic */ void values(final Runnable runnable) {
        AFj1rSDK.values(this.AFInAppEventParameterName.AFKeystoreWrapper(), new Runnable() { // from class: X.13nt
            @Override // java.lang.Runnable
            public final void run() {
                AFi1aSDK.lambda$semisugar$AFKeystoreWrapper$0(this.LL, runnable);
            }
        }, 0L, TimeUnit.MILLISECONDS);
    }

    public final void AFInAppEventParameterName(final Runnable runnable) {
        AFInAppEventParameterName(new AFi1jSDK(this.AFInAppEventParameterName.AFInAppEventType(), this.AFInAppEventParameterName.values(), AFi1fSDK.FACEBOOK, runnable, new Runnable() { // from class: X.13nv
            @Override // java.lang.Runnable
            public final void run() {
                AFi1aSDK.lambda$semisugar$AFInAppEventType$0(this.LL, runnable);
            }
        }));
    }

    public final boolean AFKeystoreWrapper(AFa1qSDK aFa1qSDK) {
        boolean z;
        int iValueOf = this.AFInAppEventParameterName.AFInAppEventType().AFKeystoreWrapper.valueOf("appsFlyerCount", 0);
        if (iValueOf == 1 && !(aFa1qSDK instanceof AFh1oSDK)) {
            z = true;
        } else {
            z = false;
        }
        if ((this.AFInAppEventParameterName.valueOf().AFInAppEventType("newGPReferrerSent") || iValueOf != 1) && !z) {
            return false;
        }
        return true;
    }

    public final AFi1lSDK valueOf(final Runnable runnable) {
        return new AFi1lSDK(new Runnable() { // from class: X.13nu
            @Override // java.lang.Runnable
            public final void run() {
                AFi1aSDK.lambda$semisugar$values$0(this.LL, runnable);
            }
        }, this.AFInAppEventParameterName.values(), this.AFInAppEventParameterName.AFInAppEventType());
    }

    private /* synthetic */ void AFKeystoreWrapper(Runnable runnable) {
        try {
            if (AFKeystoreWrapper(new AFh1oSDK())) {
                runnable.run();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }

    public final synchronized void AFInAppEventParameterName(AFi1hSDK aFi1hSDK) {
        this.AFKeystoreWrapper.add(aFi1hSDK);
    }

    private /* synthetic */ void values(AFi1lSDK aFi1lSDK, Runnable runnable) {
        AFd1qSDK aFd1qSDKValueOf = this.AFInAppEventParameterName.valueOf();
        boolean z = false;
        int iValueOf = this.AFInAppEventParameterName.AFInAppEventType().AFKeystoreWrapper.valueOf("appsFlyerCount", 0);
        boolean zAFInAppEventType = aFd1qSDKValueOf.AFInAppEventType("newGPReferrerSent");
        if (aFi1lSDK.unregisterClient == AFi1hSDK.AFa1ySDK.NOT_STARTED) {
            z = true;
        }
        if (iValueOf == 1) {
            if (z || zAFInAppEventType) {
                runnable.run();
            }
        }
    }

    public final Runnable AFInAppEventType(final AFi1lSDK aFi1lSDK, final Runnable runnable) {
        return new Runnable() { // from class: X.13nr
            @Override // java.lang.Runnable
            public final void run() {
                AFi1aSDK.lambda$semisugar$values$1(this.LL, aFi1lSDK, runnable);
            }
        };
    }
}
