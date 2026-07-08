package X;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uhV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1713870uhV {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, Map map) throws JSONException {
        JSONObject jSONObject;
        if (map != null) {
            jSONObject = new JSONObject(map);
        } else {
            jSONObject = null;
        }
        LIZIZ(str, jSONObject);
    }

    public static void LIZIZ(String str, JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("timestamp", String.valueOf(System.currentTimeMillis()));
        jSONObject.put("country_code", C1717770unn.LJIIIIZZ().getCurrentRegionCode());
        jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        String strOptString = jSONObject.optString("priority_region");
        if (strOptString == null || strOptString.length() == 0) {
            jSONObject.put("priority_region", C1717770unn.LJIIIIZZ().getCurrentRegionCode());
        }
        String strOptString2 = jSONObject.optString("registered_country");
        if (strOptString2 == null || strOptString2.length() == 0) {
            String storeRegionUpperCase = C1717770unn.LIZJ().getStoreRegionUpperCase();
            if (storeRegionUpperCase == null) {
                storeRegionUpperCase = "";
            }
            jSONObject.put("registered_country", storeRegionUpperCase);
        }
        C1717770unn.LJIIIZ().onEventV3(str, jSONObject);
    }
}
