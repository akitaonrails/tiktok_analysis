package X;

import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wjI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1791860wjI extends AbstractC1791880wjK {
    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final Class<? extends InterfaceC1791890wjL> provideResultModel() {
        return InterfaceC1791890wjL.class;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1791910wjN interfaceC1791910wjN = (InterfaceC1791910wjN) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            JSONObject jSONObject = new JSONObject(interfaceC1791910wjN.getInAppRequest());
            if (jSONObject.has("client_request_body")) {
                String strOptString = jSONObject.optString("client_request_body");
                JSONObject jSONObject2 = new JSONObject(strOptString);
                C1791720wj4 c1791720wj4 = new C1791720wj4(0);
                c1791720wj4.LIZ = jSONObject2.optString("merchant_id");
                c1791720wj4.LIZIZ = true;
                c1791720wj4.LIZJ = C0KQG.LIZIZ(strOptString);
                c1791720wj4.LIZLLL = C519980KaK.LIZ(strOptString, String.valueOf(UserService.getInstance().user().getCurrentUserId()));
                ((InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class)).LJIILL(interfaceC634840OvC.LIZLLL(), c1791720wj4, new InterfaceC1791700wj2() { // from class: X.0wjJ
                    @Override // X.InterfaceC1791700wj2
                    public final void LIZIZ(C518140KTs c518140KTs) {
                        this.LIZ.getClass();
                        InterfaceC1791890wjL interfaceC1791890wjL = (InterfaceC1791890wjL) C1909107dp.LIZJ(InterfaceC1791890wjL.class, null);
                        interfaceC1791890wjL.setOrderID(c518140KTs.LJIIJJI);
                        completionBlock.onSuccess(interfaceC1791890wjL, "");
                    }

                    @Override // X.InterfaceC1791700wj2
                    public final void LIZJ(C518140KTs c518140KTs) {
                        this.LIZ.getClass();
                        InterfaceC1791890wjL interfaceC1791890wjL = (InterfaceC1791890wjL) C1909107dp.LIZJ(InterfaceC1791890wjL.class, null);
                        this.LIZ.getClass();
                        InterfaceC1791900wjM interfaceC1791900wjM = (InterfaceC1791900wjM) C1909107dp.LIZJ(InterfaceC1791900wjM.class, null);
                        interfaceC1791900wjM.setErrorCode(Integer.valueOf(c518140KTs.LIZIZ));
                        interfaceC1791900wjM.setErrorDetailCode(Integer.valueOf(c518140KTs.LIZJ));
                        interfaceC1791900wjM.setErrorMsg(c518140KTs.LJFF);
                        interfaceC1791890wjL.setErrorInfo(interfaceC1791900wjM);
                        completionBlock.onFailure(0, c518140KTs.LIZLLL, interfaceC1791890wjL);
                    }
                }, null);
                return;
            }
            C2382909Vj.LIZ(completionBlock, 0, "Invalid Client request body", null, 4);
        }
    }
}
