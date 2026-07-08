package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import java.net.URLDecoder;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0x1t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1803390x1t extends AbstractC1803360x1q {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        EnumC1802790x0v enumC1802790x0v;
        Map mapLJ;
        Context context;
        InterfaceC1803380x1s interfaceC1803380x1s = (InterfaceC1803380x1s) xBaseParamModel;
        Number cancelEntrance = interfaceC1803380x1s.getCancelEntrance();
        if (Intrinsics.LJFF(cancelEntrance, 0)) {
            enumC1802790x0v = EnumC1802790x0v.EXIT_RECHARGE_PANEL;
        } else if (Intrinsics.LJFF(cancelEntrance, 1)) {
            enumC1802790x0v = EnumC1802790x0v.CANCEL_PAYMENT;
        } else {
            enumC1802790x0v = EnumC1802790x0v.UNKNOWN;
        }
        String rechargeEntrance = interfaceC1803380x1s.getRechargeEntrance();
        String dialogType = interfaceC1803380x1s.getDialogType();
        long jLongValue = interfaceC1803380x1s.getShowDurationStartAnchor().longValue();
        int iIntValue = interfaceC1803380x1s.getPackageCoins().intValue();
        String paymentAmount = interfaceC1803380x1s.getPaymentAmount();
        if (paymentAmount == null) {
            paymentAmount = "";
        }
        String customizedContent = interfaceC1803380x1s.getCustomizedContent();
        try {
            mapLJ = (Map) GsonProtectorUtils.fromJson(C1058250de3.LIZIZ(), URLDecoder.decode(interfaceC1803380x1s.getEtParams().toString()), new TypeToken<Map<String, ? extends String>>() { // from class: X.04X9
            }.getType());
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            mapLJ = C2097608Jq.LJ();
        }
        C1803370x1r c1803370x1r = new C1803370x1r(enumC1802790x0v, rechargeEntrance, dialogType, jLongValue, iIntValue, paymentAmount, false, null, null, null, customizedContent, 0L, null, mapLJ, 7104);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        boolean zLIZIZ = C1802770x0t.LIZIZ(context, c1803370x1r);
        try {
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1803400x1u.class, null);
            ((InterfaceC1803400x1u) xBaseModelLIZJ).setHasOpenCancelRetentionDialog(Boolean.valueOf(zLIZIZ));
            completionBlock.onSuccess((InterfaceC1803400x1u) xBaseModelLIZJ, "");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
