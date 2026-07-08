package X;

import com.bytedance.android.live.iap.service.IapService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wku, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1792860wku {
    public static JSONObject LIZ;

    public static JSONObject LIZ(int i, int i2, String str) throws JSONException {
        String billingCountryCode;
        JSONObject jSONObject = LIZ;
        if (jSONObject != null) {
            jSONObject.put("errorCode", i);
        }
        JSONObject jSONObject2 = LIZ;
        if (jSONObject2 != null) {
            jSONObject2.put("detailCode", i2);
        }
        JSONObject jSONObject3 = LIZ;
        if (jSONObject3 != null) {
            jSONObject3.put("errMessage", str);
        }
        JSONObject jSONObject4 = LIZ;
        if (jSONObject4 != null) {
            InterfaceC1791930wjP interfaceC1791930wjP = (InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class);
            if (interfaceC1791930wjP == null || (billingCountryCode = interfaceC1791930wjP.getBillingCountryCode()) == null) {
                billingCountryCode = "";
            }
            jSONObject4.put("billing_country_code", billingCountryCode);
        }
        return LIZ;
    }
}
