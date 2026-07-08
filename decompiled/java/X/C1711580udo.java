package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.cashier.IPIPOCashierService;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0udo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1711580udo extends AbstractC1711720ue2 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) throws JSONException {
        String strLJJ;
        InterfaceC1711670udx interfaceC1711670udx = (InterfaceC1711670udx) xBaseParamModel;
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PipoCashierCheckPaymentStatusMethod, p_r_id: ");
        sbLIZ.append(interfaceC1711670udx.getPayRequestId());
        sbLIZ.append(", n_id: ");
        sbLIZ.append(interfaceC1711670udx.getNotificationId());
        c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
        IPIPOCashierService iPIPOCashierService = (IPIPOCashierService) PluggableExtentionKt.pluggableSpi$default(IPIPOCashierService.class, false, false, false, 14, null);
        if (iPIPOCashierService != null) {
            String payRequestId = interfaceC1711670udx.getPayRequestId();
            if (payRequestId == null) {
                payRequestId = "";
            }
            String notificationId = interfaceC1711670udx.getNotificationId();
            if (notificationId == null) {
                notificationId = "";
            }
            C1709430uaL c1709430uaLLJIIZILJ = iPIPOCashierService.LJIIZILJ(payRequestId, notificationId);
            if (c1709430uaLLJIIZILJ != null) {
                int i = 0;
                C335850DEp c335850DEpLJII = c1709430uaLLJIIZILJ.LJII(false);
                switch (C1709480uaQ.LIZ[c335850DEpLJII.LIZ.ordinal()]) {
                    case 1:
                        break;
                    case 2:
                        i = 1;
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        i = 2;
                        break;
                    case 7:
                        i = 3;
                        break;
                    default:
                        throw new C1954807lC();
                }
                if (c335850DEpLJII.LIZ != EnumC1709470uaP.SUCCESS) {
                    strLJJ = "";
                } else {
                    strLJJ = c1709430uaLLJIIZILJ.LJJ();
                }
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1711640udu.class, null);
                InterfaceC1711640udu interfaceC1711640udu = (InterfaceC1711640udu) xBaseModelLIZJ;
                interfaceC1711640udu.setStatus(Integer.valueOf(i));
                interfaceC1711640udu.setPaymentInfo(strLJJ);
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                return;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Fail to find target cashier for p_r_id: ");
        sbLIZ2.append(interfaceC1711670udx.getPayRequestId());
        sbLIZ2.append(", n_id: ");
        sbLIZ2.append(interfaceC1711670udx.getNotificationId());
        C2382909Vj.LIZ(completionBlock, -3, C2188811AlT.LIZIZ(sbLIZ2), null, 4);
    }
}
