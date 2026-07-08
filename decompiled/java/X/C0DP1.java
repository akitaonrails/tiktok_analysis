package X;

import com.bytedance.android.performanhtune.IPTFService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0DP1, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DP1 extends C0DPB {
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(755));

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C0DPC c0dpc = (C0DPC) xBaseParamModel;
        if (Intrinsics.LJFF(c0dpc.getStrategyType(), 1)) {
            String strategyName = c0dpc.getStrategyName();
            IPTFService iPTFService = (IPTFService) C1161920gLG.LIZJ(IPTFService.class);
            if (iPTFService != null) {
                iPTFService.xe0(strategyName, (C319230CfJ) C0DP2.LIZIZ.getValue());
            }
            C11JL c11jl = C0DP2.LIZ;
            if (c11jl != null) {
                c11jl.dispose();
            }
            C0DP2.LIZ = (C11JL) AbstractC19484711Kz.LJJIJL(1000L, TimeUnit.MILLISECONDS).LJJIIZ(new C09JN() { // from class: X.0CpM
                @Override // X.C09JN
                public final void accept(Object obj) {
                    Map mapSA;
                    C1C7U.LIZ("LiveSparkDowngradeManager@831f.onSparkDowngradeReceiverRegister$1");
                    IPTFService iPTFService2 = (IPTFService) C1161920gLG.LIZJ(IPTFService.class);
                    if (iPTFService2 != null && (mapSA = iPTFService2.SA()) != null && !mapSA.isEmpty()) {
                        C389001fE.LIZ("live_adaptive_lite_mode_downgrade", new JSONObject(mapSA), System.currentTimeMillis(), false);
                    }
                    C1C7U.LIZIZ("LiveSparkDowngradeManager@831f.onSparkDowngradeReceiverRegister$1");
                }
            }, new C09JN() { // from class: X.00Mv
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("LiveSparkDowngradeManager@831f.onSparkDowngradeReceiverRegister$2");
                    C1C7U.LIZIZ("LiveSparkDowngradeManager@831f.onSparkDowngradeReceiverRegister$2");
                }
            });
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C0DPA.class, null), "");
            return;
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C0DPA.class, null), "");
    }
}
