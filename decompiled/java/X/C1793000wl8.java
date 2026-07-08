package X;

import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.google.gson.Gson;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wl8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1793000wl8 extends AbstractC1793010wl9 {
    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final Class<? extends InterfaceC1793030wlB> provideResultModel() {
        return InterfaceC1793030wlB.class;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1793020wlA interfaceC1793020wlA = (InterfaceC1793020wlA) xBaseParamModel;
        C20441214yg.LIZIZ("iap_test_jsb", "GetIapProductsV2Method");
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            interfaceC634840OvC.getContext();
        }
        C1617170sBX c1617170sBX = new C1617170sBX(interfaceC1793020wlA.getMerchantID(), interfaceC1793020wlA.getProductIDs(), interfaceC1793020wlA.getProductType());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("params: ");
        sbLIZ.append(GsonProtectorUtils.toJson(new Gson(), c1617170sBX));
        C20441214yg.LIZIZ("iap_test_jsb", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1791930wjP interfaceC1791930wjP = (InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class);
        if (interfaceC1791930wjP != null) {
            interfaceC1791930wjP.LJIIIZ(new InterfaceC1791670wiz() { // from class: X.0wl7
                @Override // X.InterfaceC1791670wiz
                public final void LIZLLL(C518160KTu c518160KTu) {
                    LinkedHashMap linkedHashMap;
                    C20441214yg.LIZIZ("iap_test_jsb", "onFetchSuccess");
                    this.LIZ.getClass();
                    XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1793030wlB.class, null);
                    C1793000wl8 c1793000wl8 = this.LIZ;
                    InterfaceC1793030wlB interfaceC1793030wlB = (InterfaceC1793030wlB) xBaseModelLIZJ;
                    Map<String, IapProductDetail> map = c518160KTu.LJIIJ;
                    if (map != null) {
                        linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
                        Iterator<T> it2 = map.entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            value.getClass();
                            String json = GsonProtectorUtils.toJson(new Gson(), value);
                            json.toString();
                            linkedHashMap.put(key, new JSONObject(json));
                        }
                    } else {
                        linkedHashMap = null;
                    }
                    interfaceC1793030wlB.setProducts(linkedHashMap);
                    c1793000wl8.getClass();
                    InterfaceC1793050wlD interfaceC1793050wlD = (InterfaceC1793050wlD) C1909107dp.LIZJ(InterfaceC1793050wlD.class, null);
                    interfaceC1793050wlD.setAppVersion(String.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getShortVersionCode()));
                    interfaceC1793050wlD.setClientVersion("buyIapProductV2");
                    interfaceC1793030wlB.setInAppClientData(interfaceC1793050wlD);
                    C20441214yg.LIZIZ("iap_test_jsb", "callback onSuccess data");
                    C20441214yg.LIZIZ("iap_test_jsb", GsonProtectorUtils.toJson(new Gson(), interfaceC1793030wlB.getProducts()));
                    completionBlock.onSuccess(interfaceC1793030wlB, "");
                }

                @Override // X.InterfaceC1791670wiz
                public final void LJ(C518080KTm c518080KTm) {
                    C20441214yg.LIZIZ("iap_test_jsb", "onFetchFailure");
                    this.LIZ.getClass();
                    InterfaceC1793030wlB interfaceC1793030wlB = (InterfaceC1793030wlB) C1909107dp.LIZJ(InterfaceC1793030wlB.class, null);
                    this.LIZ.getClass();
                    InterfaceC1793040wlC interfaceC1793040wlC = (InterfaceC1793040wlC) C1909107dp.LIZJ(InterfaceC1793040wlC.class, null);
                    interfaceC1793040wlC.setErrorCode(Integer.valueOf(c518080KTm.LIZIZ));
                    interfaceC1793040wlC.setErrorDetailCode(Integer.valueOf(c518080KTm.LIZJ));
                    interfaceC1793040wlC.setErrorMsg(c518080KTm.LJFF);
                    interfaceC1793030wlB.setErrorInfo(interfaceC1793040wlC);
                    completionBlock.onFailure(0, c518080KTm.LJFF, interfaceC1793030wlB);
                }
            }, c1617170sBX);
        }
    }
}
