package com.appsflyer.internal;

import X.C0W9U;
import X.C0W9W;
import X.C1C7U;
import X.C2179971ATj;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes6.dex */
public final class AFf1xSDK extends C0W9W {
    public final Thread AFInAppEventType;

    private void bpea_origin_timer_run() {
        com_appsflyer_internal_AFf1xSDK_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("AFf1xSDK@bae5.run");
        boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
        try {
            bpea_origin_timer_run();
            if (zLJ) {
                C0W9U.LJFF();
            }
            C1C7U.LIZIZ("AFf1xSDK@bae5.run");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (zLJ) {
                C0W9U.LJFF();
            }
            throw th;
        }
    }

    public final void com_appsflyer_internal_AFf1xSDK__run$___twin___() {
        this.AFInAppEventType.interrupt();
    }

    public AFf1xSDK(Thread thread) {
        this.AFInAppEventType = thread;
    }

    public static void com_appsflyer_internal_AFf1xSDK_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AFf1xSDK aFf1xSDK) {
        try {
            aFf1xSDK.com_appsflyer_internal_AFf1xSDK__run$___twin___();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }
}
