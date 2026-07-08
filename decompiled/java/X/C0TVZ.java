package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.RechargeRetentionPopupConfig;

/* JADX INFO: renamed from: X.0TVZ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TVZ extends C0TVW {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        RechargeRetentionPopupConfig rechargeRetentionPopupConfig;
        C0TVY c0tvy = (C0TVY) xBaseParamModel;
        Number dialogAction = c0tvy.getDialogAction();
        if (Intrinsics.LJFF(dialogAction, 0)) {
            C750340Tc0.LIZ(c0tvy.getDialogId(), "show");
        } else if (Intrinsics.LJFF(dialogAction, 1)) {
            C750340Tc0.LIZ(c0tvy.getDialogId(), "cancel");
        } else if (Intrinsics.LJFF(dialogAction, 2)) {
            C750340Tc0.LIZ(c0tvy.getDialogId(), "reset");
        } else if (Intrinsics.LJFF(dialogAction, 3) && C500260Jjc.LJJIIZ(c0tvy.getCancelFrequencyConfig())) {
            try {
                Map map = (Map) C1058250de3.LIZIZ().LJIIIIZZ(c0tvy.getCancelFrequencyConfig(), new TypeToken<Map<String, ? extends RechargeRetentionPopupConfig>>() { // from class: X.0TVa
                }.getType());
                if (map != null && (rechargeRetentionPopupConfig = (RechargeRetentionPopupConfig) map.get("recharge_cancel_retention_dialog")) != null && rechargeRetentionPopupConfig.eventInfo != null) {
                    C750340Tc0.LIZJ(rechargeRetentionPopupConfig);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
        C0TVV c0tvv = (C0TVV) C1909107dp.LIZJ(C0TVV.class, null);
        c0tvv.setCode(1);
        completionBlock.onSuccess(c0tvv, "");
    }
}
