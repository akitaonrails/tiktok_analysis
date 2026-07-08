package X;

import com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: renamed from: X.0wxg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1800780wxg extends AbstractC1800750wxd {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1800760wxe interfaceC1800760wxe = (InterfaceC1800760wxe) xBaseParamModel;
        try {
            IRevenueStrategyService iRevenueStrategyServiceLIZIZ = C1126800fQc.LIZIZ();
            if (iRevenueStrategyServiceLIZIZ != null) {
                iRevenueStrategyServiceLIZIZ.py();
                C1134860fdc c1134860fdc = C1134860fdc.LIZ;
            }
            C500260Jjc.LJJJI(Boolean.valueOf(interfaceC1800760wxe.getUseCacheFirst()));
            C1126800fQc.LIZ.M92().getClass();
            IRevenueStrategyService iRevenueStrategyServiceLIZIZ2 = C1126800fQc.LIZIZ();
            if (iRevenueStrategyServiceLIZIZ2 != null && iRevenueStrategyServiceLIZIZ2.M92() != null) {
                C1133940fc8.LJIILLIIL(interfaceC1800760wxe.getReqScene().intValue(), new AwS606S0100000_27(completionBlock, (CompletionBlock<Object>) 477));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("client exception ");
            sbLIZ.append(th.getMessage());
            C2382909Vj.LIZ(completionBlock, 20002, C2188811AlT.LIZIZ(sbLIZ), null, 4);
        }
    }
}
