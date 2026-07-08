package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.cashier.IPIPOCashierService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0udq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1711600udq extends AbstractC1711750ue5 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C1709430uaL c1709430uaLLJIIZILJ;
        Context context;
        String strLIZIZ;
        InterfaceC1711650udv interfaceC1711650udv = (InterfaceC1711650udv) xBaseParamModel;
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PipoCashierControlSecurityLoadingMethod, p_r_id: ");
        sbLIZ.append(interfaceC1711650udv.getPayRequestId());
        sbLIZ.append(", n_id: ");
        sbLIZ.append(interfaceC1711650udv.getNotificationId());
        c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
        IPIPOCashierService iPIPOCashierService = (IPIPOCashierService) PluggableExtentionKt.pluggableSpi$default(IPIPOCashierService.class, false, false, false, 14, null);
        if (iPIPOCashierService != null) {
            String payRequestId = interfaceC1711650udv.getPayRequestId();
            if (payRequestId == null) {
                payRequestId = "";
            }
            String notificationId = interfaceC1711650udv.getNotificationId();
            if (notificationId == null) {
                notificationId = "";
            }
            c1709430uaLLJIIZILJ = iPIPOCashierService.LJIIZILJ(payRequestId, notificationId);
        } else {
            c1709430uaLLJIIZILJ = null;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        if (c1709430uaLLJIIZILJ == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Fail to find target cashier for p_r_id: ");
            sbLIZ2.append(interfaceC1711650udv.getPayRequestId());
            sbLIZ2.append(", n_id: ");
            sbLIZ2.append(interfaceC1711650udv.getNotificationId());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else if (context == null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Fail to find context for p_r_id: ");
            sbLIZ3.append(interfaceC1711650udv.getPayRequestId());
            sbLIZ3.append(", n_id: ");
            sbLIZ3.append(interfaceC1711650udv.getNotificationId());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        } else {
            if (Intrinsics.LJFF(interfaceC1711650udv.getShow(), Boolean.TRUE)) {
                c1709430uaLLJIIZILJ.LJIIZILJ(context);
            } else {
                c1709430uaLLJIIZILJ.LJIIIIZZ();
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1711630udt.class, null), "");
            return;
        }
        if (strLIZIZ != null) {
            C2382909Vj.LIZ(completionBlock, -3, strLIZIZ, null, 4);
        }
    }
}
