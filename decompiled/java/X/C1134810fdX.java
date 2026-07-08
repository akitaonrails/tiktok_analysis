package X;

import com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fdX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1134810fdX extends AbstractC1134830fdZ {
    public static InterfaceC1134820fdY LIZJ() {
        Boolean boolValueOf = null;
        InterfaceC1134820fdY interfaceC1134820fdY = (InterfaceC1134820fdY) C1909107dp.LIZJ(InterfaceC1134820fdY.class, null);
        IRevenueStrategyService iRevenueStrategyServiceLIZIZ = C1126800fQc.LIZIZ();
        interfaceC1134820fdY.setDailyWatchLiveDuration(Long.valueOf(((iRevenueStrategyServiceLIZIZ == null || iRevenueStrategyServiceLIZIZ.Nm2() == null) ? 0L : C1134550fd7.LJ()) * 1000));
        IRevenueStrategyService iRevenueStrategyServiceLIZIZ2 = C1126800fQc.LIZIZ();
        if (iRevenueStrategyServiceLIZIZ2 != null && iRevenueStrategyServiceLIZIZ2.Nm2() != null) {
            boolValueOf = Boolean.valueOf(C1134550fd7.LIZIZ);
        }
        interfaceC1134820fdY.setLiveState(C500260Jjc.LJJJI(boolValueOf) ? 0 : 1);
        interfaceC1134820fdY.setTimeDiff(Long.valueOf(C963140bAe.LIZLLL));
        return interfaceC1134820fdY;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Long lValueOf;
        InterfaceC1134840fda interfaceC1134840fda = (InterfaceC1134840fda) xBaseParamModel;
        String type = interfaceC1134840fda.getType();
        if (Intrinsics.LJFF(type, "get")) {
            completionBlock.onSuccess(LIZJ(), "");
            return;
        }
        if (Intrinsics.LJFF(type, "startRecord")) {
            String dayEndTime = interfaceC1134840fda.getDayEndTime();
            if (dayEndTime != null && (lValueOf = Long.valueOf(CastLongProtector.parseLong(dayEndTime))) != null) {
                IRevenueStrategyService iRevenueStrategyServiceLIZIZ = C1126800fQc.LIZIZ();
                if (iRevenueStrategyServiceLIZIZ != null) {
                    iRevenueStrategyServiceLIZIZ.Rs2();
                    C1134560fd8 c1134560fd8 = C1134560fd8.LIZ;
                    C1134560fd8.LIZ(lValueOf.longValue());
                }
                completionBlock.onSuccess(LIZJ(), "");
                return;
            }
            C2382909Vj.LIZ(completionBlock, -3, "The param `dayEndTime` is empty", null, 4);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("The param `type` is not valid: type == ");
        sbLIZ.append(interfaceC1134840fda.getType());
        C2382909Vj.LIZ(completionBlock, -3, C2188811AlT.LIZIZ(sbLIZ), null, 4);
    }
}
