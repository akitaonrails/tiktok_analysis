package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wnV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1794470wnV extends C1793980wmi {
    public static JSONObject LIZLLL(C1794480wnW c1794480wnW) {
        String str;
        JSONObject jSONObject = new JSONObject();
        if (c1794480wnW != null) {
            C1793980wmi.LIZIZ("request_id", c1794480wnW.LIZLLL(), jSONObject);
            C1793980wmi.LIZIZ("product_id", c1794480wnW.LIZJ, jSONObject);
            C1793980wmi.LIZIZ("payment_method", c1794480wnW.LJJ.channelName, jSONObject);
            C1792170wjn c1792170wjn = c1794480wnW.LIZ;
            if (c1792170wjn != null && (str = c1792170wjn.LIZIZ) != null) {
                C1793980wmi.LIZIZ("merchant_id", str, jSONObject);
            } else {
                C1793980wmi.LIZIZ("merchant_id", "", jSONObject);
            }
            EnumC1794260wnA enumC1794260wnA = c1794480wnW.LJIILIIL;
            if (enumC1794260wnA != null) {
                C1793980wmi.LIZIZ("pay_type", enumC1794260wnA.name(), jSONObject);
            } else {
                C1793980wmi.LIZIZ("pay_type", "unknown", jSONObject);
            }
            C1792170wjn c1792170wjn2 = c1794480wnW.LIZ;
            if (c1792170wjn2 != null) {
                C1793980wmi.LIZIZ("merchant_id", c1792170wjn2.LIZIZ, jSONObject);
                C1793980wmi.LIZIZ("user_id", c1792170wjn2.LJ, jSONObject);
            } else {
                C1793980wmi.LIZIZ("merchant_id", "unknown", jSONObject);
                C1793980wmi.LIZIZ("user_id", "unknown", jSONObject);
            }
            AbstractC1794600wni abstractC1794600wni = c1794480wnW.LJIIJ;
            if (abstractC1794600wni == null) {
                C1793980wmi.LIZIZ("purchase", "unknown", jSONObject);
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject();
            C1793980wmi.LIZIZ("purchase_gp_order_id", abstractC1794600wni.LJFF, jSONObject2);
            C1793980wmi.LIZIZ("purchase_self_order_id", abstractC1794600wni.LJI(), jSONObject2);
            C1793980wmi.LIZIZ("purchase_token", abstractC1794600wni.LIZ(), jSONObject2);
            C1793980wmi.LIZIZ("purchase_signature", abstractC1794600wni.LJIIIIZZ(), jSONObject2);
            C1793980wmi.LIZIZ("purchase_sku_id", abstractC1794600wni.LIZJ, jSONObject2);
            C1793980wmi.LIZ("purchase_state", abstractC1794600wni.LJ(), jSONObject2);
            C1793980wmi.LIZIZ("purchase", C786410Ut5.J3(jSONObject2), jSONObject);
            return jSONObject;
        }
        C1793980wmi.LIZIZ("request_id", "unknown", jSONObject);
        C1793980wmi.LIZIZ("product_id", "unknown", jSONObject);
        C1793980wmi.LIZIZ("pay_type", "unknown", jSONObject);
        C1793980wmi.LIZIZ("merchant_id", "unknown", jSONObject);
        C1793980wmi.LIZIZ("user_id", "unknown", jSONObject);
        C1793980wmi.LIZIZ("purchase", "unknown", jSONObject);
        return jSONObject;
    }
}
