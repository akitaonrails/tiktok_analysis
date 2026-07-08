package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ukz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1716030ukz {
    public static boolean LIZ;
    public static String LIZIZ;

    public static void LIZ(boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("from", "info_collect");
        jSONObject.put("result", z);
        jSONObject.put("action_type", "collect_info");
        C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, new C1323820kYO(jSONObject), "ec_checkout_guide_exit"));
        LIZJ("send_ec_checkout_guide_exit", z);
    }

    public static void LIZJ(String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stage", "pay");
        if (str == null) {
            str = "not_set";
        }
        jSONObject.put("pay_scene", str);
        jSONObject.put("page_name", LIZIZ);
        jSONObject.put("pay_result", String.valueOf(z));
        jSONObject.put("action_type", "collect_info");
        C1713870uhV.LIZIZ("rd_pipo_payment_process", jSONObject);
    }

    public static void LIZIZ(String str, String str2, String str3, String str4, String str5) {
        if (str != null && str2 != null && str2.length() != 0) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C836130Wr5(str, str2, str3, str4, str5, null), 3);
        }
    }
}
