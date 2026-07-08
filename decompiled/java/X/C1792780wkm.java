package X;

import android.app.Activity;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0wkm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1792780wkm extends AbstractC1792790wkn {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.0wkl] */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String billingCountryCode;
        Activity activityLIZLLL;
        String containerID;
        InterfaceC1792810wkp interfaceC1792810wkp = (InterfaceC1792810wkp) xBaseParamModel;
        C1803800x2Y.LIZ.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_googleplay_ecl_call");
        InterfaceC1791930wjP interfaceC1791930wjP = (InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class);
        if (interfaceC1791930wjP == null || (billingCountryCode = interfaceC1791930wjP.getBillingCountryCode()) == null) {
            billingCountryCode = "";
        }
        c474500IjALIZ.LJJII(billingCountryCode, "app_store_front");
        c474500IjALIZ.LIZ();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (!u.LJJIIJZLJL(interfaceC1792810wkp.getTargetUrl(), "https", false)) {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            } else {
                containerID = null;
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1792800wko.class, containerID);
            InterfaceC1792800wko interfaceC1792800wko = (InterfaceC1792800wko) xBaseModelLIZJ;
            interfaceC1792800wko.setAction("cancel");
            interfaceC1792800wko.setMessage("targetUrl is not https schema");
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            C1803800x2Y.LJJIIJ(System.currentTimeMillis() - jCurrentTimeMillis, "cancel", null, "targetUrl is not https schema", null);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 == null || (activityLIZLLL = interfaceC634840OvC2.LIZLLL()) == null) {
            return;
        }
        ((InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class)).LJII(activityLIZLLL, interfaceC1792810wkp.getTargetUrl(), new InterfaceC1792140wjk() { // from class: X.0wkl
            @Override // X.InterfaceC1792140wjk
            public final void LIZ(C1792160wjm c1792160wjm) {
                String containerID2;
                String str;
                Integer numValueOf;
                EnumC1792020wjY enumC1792020wjY;
                this.LIZ.getClass();
                InterfaceC634840OvC interfaceC634840OvC3 = this.LIZ.IBridgeSdkContext;
                String string = null;
                if (interfaceC634840OvC3 != null) {
                    containerID2 = interfaceC634840OvC3.getContainerID();
                } else {
                    containerID2 = null;
                }
                InterfaceC1792800wko interfaceC1792800wko2 = (InterfaceC1792800wko) C1909107dp.LIZJ(InterfaceC1792800wko.class, containerID2);
                if (c1792160wjm.LIZ) {
                    interfaceC1792800wko2.setAction("continue");
                    interfaceC1792800wko2.setTransactionToken(c1792160wjm.LIZIZ);
                } else {
                    interfaceC1792800wko2.setAction("cancel");
                    C0KQW c0kqw = c1792160wjm.LIZJ;
                    if (c0kqw != null) {
                        str = c0kqw.LIZIZ;
                    } else {
                        str = null;
                    }
                    interfaceC1792800wko2.setMessage(str);
                    C0KQW c0kqw2 = c1792160wjm.LIZJ;
                    if (c0kqw2 != null && (enumC1792020wjY = c0kqw2.LIZ) != null) {
                        numValueOf = Integer.valueOf(enumC1792020wjY.getValue());
                    } else {
                        numValueOf = null;
                    }
                    interfaceC1792800wko2.setDetailCode(numValueOf);
                }
                C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
                String action = interfaceC1792800wko2.getAction();
                String transactionToken = interfaceC1792800wko2.getTransactionToken();
                String message = interfaceC1792800wko2.getMessage();
                Number detailCode = interfaceC1792800wko2.getDetailCode();
                if (detailCode != null) {
                    string = detailCode.toString();
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                c1803800x2Y.getClass();
                C1803800x2Y.LJJIIJ(jCurrentTimeMillis2, action, transactionToken, message, string);
                completionBlock.onSuccess(interfaceC1792800wko2, "");
            }
        });
    }
}
