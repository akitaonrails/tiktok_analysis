package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.cashier.IPIPOCashierService;

/* JADX INFO: renamed from: X.0udr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1711610udr extends AbstractC1711730ue3 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C1709430uaL c1709430uaLLJIIZILJ;
        Context context;
        Context context2;
        int i;
        String strLIZIZ;
        InterfaceC1711660udw interfaceC1711660udw = (InterfaceC1711660udw) xBaseParamModel;
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PipoCashierHandlePayInfoMethod, p_r_id: ");
        sbLIZ.append(interfaceC1711660udw.getPayRequestId());
        sbLIZ.append(", n_id: ");
        sbLIZ.append(interfaceC1711660udw.getNotificationId());
        c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
        IPIPOCashierService iPIPOCashierService = (IPIPOCashierService) PluggableExtentionKt.pluggableSpi$default(IPIPOCashierService.class, false, false, false, 14, null);
        if (iPIPOCashierService != null) {
            String payRequestId = interfaceC1711660udw.getPayRequestId();
            if (payRequestId == null) {
                payRequestId = "";
            }
            String notificationId = interfaceC1711660udw.getNotificationId();
            if (notificationId == null) {
                notificationId = "";
            }
            c1709430uaLLJIIZILJ = iPIPOCashierService.LJIIZILJ(payRequestId, notificationId);
        } else {
            c1709430uaLLJIIZILJ = null;
        }
        if (!(c1709430uaLLJIIZILJ instanceof C1709430uaL)) {
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
            sbLIZ2.append(interfaceC1711660udw.getPayRequestId());
            sbLIZ2.append(", n_id: ");
            sbLIZ2.append(interfaceC1711660udw.getNotificationId());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else if (!C1533950q1J.LJ(interfaceC1711660udw.getPayInfo())) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Empty payInfo for p_r_id: ");
            sbLIZ3.append(interfaceC1711660udw.getPayRequestId());
            sbLIZ3.append(", n_id: ");
            sbLIZ3.append(interfaceC1711660udw.getNotificationId());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        } else if (!C1533950q1J.LJ(interfaceC1711660udw.getOrderDetailPage())) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Empty order_detail_page for p_r_id: ");
            sbLIZ4.append(interfaceC1711660udw.getPayRequestId());
            sbLIZ4.append(", n_id: ");
            sbLIZ4.append(interfaceC1711660udw.getNotificationId());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        } else if (context == null) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("Fail to find context for p_r_id: ");
            sbLIZ5.append(interfaceC1711660udw.getPayRequestId());
            sbLIZ5.append(", n_id: ");
            sbLIZ5.append(interfaceC1711660udw.getNotificationId());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
        } else {
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                context2 = interfaceC634840OvC2.getContext();
            } else {
                context2 = null;
            }
            String payInfo = interfaceC1711660udw.getPayInfo();
            if (payInfo == null) {
                payInfo = "";
            }
            String orderDetailPage = interfaceC1711660udw.getOrderDetailPage();
            if (orderDetailPage == null) {
                orderDetailPage = "";
            }
            boolean zLJJI = c1709430uaLLJIIZILJ.LJJI(context2, payInfo, orderDetailPage, null);
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1711690udz.class, null);
            InterfaceC1711690udz interfaceC1711690udz = (InterfaceC1711690udz) xBaseModelLIZJ;
            if (zLJJI) {
                i = 1;
            } else {
                i = 0;
            }
            interfaceC1711690udz.setStatus(i);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            return;
        }
        if (strLIZIZ != null) {
            XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC1711690udz.class, null);
            ((InterfaceC1711690udz) xBaseModelLIZJ2).setStatus(0);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ2, strLIZIZ);
        }
    }
}
