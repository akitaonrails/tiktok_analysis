package X;

import com.ss.android.ugc.aweme.experiment.anr.ANROptimizationHandlerProxy;
import com.ss.android.ugc.aweme.performanceopt.experiment.anr.IANROptimizationHandler;

/* JADX INFO: renamed from: X.04T3, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04T3 implements IANROptimizationHandler {
    public static final C04T3 LIZIZ = new C04T3();
    public final /* synthetic */ IANROptimizationHandler LIZ;

    @Override // com.ss.android.ugc.aweme.performanceopt.experiment.anr.IANROptimizationHandler
    public final int LIZ() {
        return this.LIZ.LIZ();
    }

    public C04T3() {
        IANROptimizationHandler iANROptimizationHandler;
        Object objLIZ = C04TD.LIZ(IANROptimizationHandler.class, false);
        if (objLIZ != null) {
            iANROptimizationHandler = (IANROptimizationHandler) objLIZ;
        } else {
            if (C04TD.f114o0 == null) {
                synchronized (IANROptimizationHandler.class) {
                    if (C04TD.f114o0 == null) {
                        C04TD.f114o0 = new ANROptimizationHandlerProxy();
                    }
                }
            }
            iANROptimizationHandler = C04TD.f114o0;
        }
        this.LIZ = iANROptimizationHandler;
    }
}
