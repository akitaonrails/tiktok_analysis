package X;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0rx9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1608250rx9 {
    public static final C1608250rx9 LIZ = new C1608250rx9();
    public static SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LIZIZ;

    public static Map LIZ(Map map) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        JSONObject jSONObject;
        String strOptString;
        Object obj = map.get("creator_id");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        String str6 = "";
        if (str == null) {
            str = "";
        }
        Object obj2 = map.get("package_id");
        if (!(obj2 instanceof String) || (str2 = (String) obj2) == null) {
            str2 = "";
        }
        Object obj3 = map.get("enter_from");
        if (!(obj3 instanceof String) || (str3 = (String) obj3) == null) {
            str3 = "";
        }
        Object obj4 = map.get("purchase_type");
        if (!(obj4 instanceof String) || (str4 = (String) obj4) == null) {
            str4 = "";
        }
        Object obj5 = map.get("biz_type");
        if (!(obj5 instanceof String) || (str5 = (String) obj5) == null) {
            str5 = "";
        }
        Object obj6 = map.get("iap_tracking_data");
        if (obj6 instanceof JSONObject) {
            jSONObject = (JSONObject) obj6;
        } else {
            jSONObject = null;
        }
        if (jSONObject != null && (strOptString = jSONObject.optString("payment_type")) != null) {
            str6 = strOptString;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creator_id", str);
        c2344009Gk.LJIIIIZZ("package_id", str2);
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        c2344009Gk.LJIIIIZZ("purchase_type", str4);
        c2344009Gk.LJIIIIZZ("biz_type", str5);
        c2344009Gk.LJIIIIZZ("payment_type", str6);
        return c2344009Gk.LIZ;
    }
}
