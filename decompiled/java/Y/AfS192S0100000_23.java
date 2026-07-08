package Y;

import X.AnonymousClass0956;
import X.C09JN;
import X.C11JF;
import X.C1476910oXJ;
import X.C1510600pPe;
import X.C1511690pRP;
import X.C1C7U;
import X.C606810Nr5;
import X.RunnableC514801zW;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.TTKUserCommunicationServiceImpl;
import com.ss.android.ugc.aweme.ml.ab.SmartIdleDetectionConfig;
import com.ss.android.ugc.aweme.ml.impl.idle.SmartIdleDetectionServiceImpl;
import com.ss.android.ugc.aweme.ml.request.CAIRequestManager;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes24.dex */
public class AfS192S0100000_23 implements C09JN {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ void accept$1(AfS192S0100000_23 afS192S0100000_23, Object obj) {
        C1C7U.LIZ("GeoBlockingDepServiceImpl@377d.sam$io_reactivex_functions_Consumer$0");
        ((Function1) afS192S0100000_23.l0).invoke(obj);
        C1C7U.LIZIZ("GeoBlockingDepServiceImpl@377d.sam$io_reactivex_functions_Consumer$0");
    }

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
        }
    }

    public AfS192S0100000_23(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void accept$0(AfS192S0100000_23 afS192S0100000_23, Object obj) {
        C1C7U.LIZ("TTKUserCommunicationServiceImpl@a2d7.hitThrottle$1");
        ((TTKUserCommunicationServiceImpl) afS192S0100000_23.l0).LIZIZ();
        C1C7U.LIZIZ("TTKUserCommunicationServiceImpl@a2d7.hitThrottle$1");
    }

    public static final void accept$2(AfS192S0100000_23 afS192S0100000_23, Object obj) {
        C1C7U.LIZ("CAIRequestManager@a1fd.clientAIRequestAllData$1$1");
        if (!((C606810Nr5) obj).LIZIZ) {
            AtomicBoolean atomicBoolean = CAIRequestManager.LIZIZ;
            if (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                CAIRequestManager cAIRequestManager = CAIRequestManager.LIZ;
                Function1 function1 = (Function1) afS192S0100000_23.l0;
                cAIRequestManager.getClass();
                CAIRequestManager.LIZ(function1);
                C11JF c11jf = CAIRequestManager.LIZJ;
                if (c11jf != null) {
                    c11jf.dispose();
                }
            }
        }
        C1C7U.LIZIZ("CAIRequestManager@a1fd.clientAIRequestAllData$1$1");
    }

    public static final void accept$3(AfS192S0100000_23 afS192S0100000_23, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C1C7U.LIZ("PlayerKitInitHelper@d98f.init$1L");
        C1476910oXJ.LJFF(zBooleanValue);
        C1C7U.LIZIZ("PlayerKitInitHelper@d98f.init$1L");
    }

    public static final void accept$4(AfS192S0100000_23 afS192S0100000_23, Object obj) {
        C1C7U.LIZ("TTMFeatureInfoImpl@f855.backgroundSwitch$1");
        if (((C606810Nr5) obj).LIZIZ) {
            C1511690pRP.LIZIZ(new RunnableC514801zW((Runnable) afS192S0100000_23.l0, 120));
        }
        C1C7U.LIZIZ("TTMFeatureInfoImpl@f855.backgroundSwitch$1");
    }

    public static final void accept$5(AfS192S0100000_23 afS192S0100000_23, Object obj) {
        SmartIdleDetectionConfig smartIdleDetectionConfigLIZ;
        C1C7U.LIZ("SmartIdleDetectionServiceImpl@2b8e.subscribeAppLifecycle$1$1");
        SmartIdleDetectionServiceImpl smartIdleDetectionServiceImpl = (SmartIdleDetectionServiceImpl) afS192S0100000_23.l0;
        if (((Boolean) obj).booleanValue()) {
            if (smartIdleDetectionServiceImpl.LIZLLL.compareAndSet(false, true)) {
                synchronized (smartIdleDetectionServiceImpl.LJ) {
                    try {
                        AnonymousClass0956 anonymousClass0956 = smartIdleDetectionServiceImpl.LJFF;
                        if (anonymousClass0956 != null) {
                            anonymousClass0956.LIZIZ(null);
                        }
                        smartIdleDetectionServiceImpl.LJFF = null;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        } else if (smartIdleDetectionServiceImpl.LIZLLL.compareAndSet(true, false) && smartIdleDetectionServiceImpl.LIZIZ.get() && (smartIdleDetectionConfigLIZ = C1510600pPe.LIZ()) != null && smartIdleDetectionConfigLIZ.getEnabled()) {
            smartIdleDetectionServiceImpl.LIZJ();
        }
        C1C7U.LIZIZ("SmartIdleDetectionServiceImpl@2b8e.subscribeAppLifecycle$1$1");
    }
}
