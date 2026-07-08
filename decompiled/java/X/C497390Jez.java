package X;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Jez, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@InterfaceC1294060jmO
public final class C497390Jez {
    public static String LIZ(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("transaction_scene", str);
        jSONObject.put("campaign_id", "live_ops");
        return C786410Ut5.J3(jSONObject);
    }

    public static final String LIZIZ(String str, String str2, Map<String, String> map) {
        C495520Jby c495520Jby = new C495520Jby("sslocal://webcast_subscribe/privilege_page?");
        c495520Jby.LIZJ("sec_anchor_id", str);
        c495520Jby.LIZJ("page_type", str2);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            c495520Jby.LIZJ(entry.getKey(), entry.getValue());
        }
        return c495520Jby.LIZLLL();
    }
}
