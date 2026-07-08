package X;

import android.app.Activity;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.livesdk.livesetting.LiveEventIAPMerchantID;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0wjQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1791940wjQ extends AbstractC1791960wjS {
    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final Class<? extends InterfaceC1791970wjT> provideResultModel() {
        return InterfaceC1791970wjT.class;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        InterfaceC1791980wjU interfaceC1791980wjU = (InterfaceC1791980wjU) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (activityLIZLLL = interfaceC634840OvC.LIZLLL()) != null) {
            C1790090wgR c1790090wgR = new C1790090wgR();
            c1790090wgR.LIZ = interfaceC1791980wjU.getBizId();
            c1790090wgR.LIZIZ = interfaceC1791980wjU.getBizOrderId();
            c1790090wgR.LIZLLL = LiveEventIAPMerchantID.INSTANCE.getValue();
            ((InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class)).LJIILL(activityLIZLLL, c1790090wgR, new InterfaceC1791700wj2() { // from class: X.0wjR
                @Override // X.InterfaceC1791700wj2
                public final void LIZIZ(C518140KTs c518140KTs) {
                    this.LIZ.getClass();
                    InterfaceC1791970wjT interfaceC1791970wjT = (InterfaceC1791970wjT) C1909107dp.LIZJ(InterfaceC1791970wjT.class, null);
                    interfaceC1791970wjT.setOrderId(c518140KTs.LJIIJJI);
                    completionBlock.onSuccess(interfaceC1791970wjT, "");
                }

                @Override // X.InterfaceC1791700wj2
                public final void LIZJ(C518140KTs c518140KTs) {
                    this.LIZ.getClass();
                    InterfaceC1791970wjT interfaceC1791970wjT = (InterfaceC1791970wjT) C1909107dp.LIZJ(InterfaceC1791970wjT.class, null);
                    this.LIZ.getClass();
                    InterfaceC1791990wjV interfaceC1791990wjV = (InterfaceC1791990wjV) C1909107dp.LIZJ(InterfaceC1791990wjV.class, null);
                    interfaceC1791990wjV.setErrorCode(c518140KTs.LIZLLL);
                    interfaceC1791990wjV.setErrorMsg(c518140KTs.LJ);
                    interfaceC1791970wjT.setError(interfaceC1791990wjV);
                    completionBlock.onFailure(0, c518140KTs.LJ, interfaceC1791970wjT);
                }
            }, null);
        }
    }
}
