package X;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XZ2, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XZ2 {
    public static final Map<String, Boolean> LIZ = new LinkedHashMap();

    public static final String LIZ(C849450XTz c849450XTz) {
        JSONObject jSONObjectOptJSONObject;
        String strOptString;
        JSONObject jSONObject = c849450XTz.LJ;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) == null || (strOptString = jSONObjectOptJSONObject.optString("passport_ticket")) == null || strOptString.length() == 0) {
            return null;
        }
        return strOptString;
    }

    public static final boolean LIZIZ(String str) {
        Boolean bool = (Boolean) ((LinkedHashMap) LIZ).get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final void LIZJ(String str, C849450XTz c849450XTz) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject = c849450XTz.LJ;
        boolean z = false;
        if (jSONObject != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) != null && jSONObjectOptJSONObject.optInt("reach_max_try") == 1) {
            z = true;
        }
        LIZ.put(str, Boolean.valueOf(z));
    }
}
