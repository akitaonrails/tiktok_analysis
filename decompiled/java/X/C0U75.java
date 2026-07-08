package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0U75, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U75 {
    public static final String LIZ(C767080U7e c767080U7e) {
        JSONArray jSONArray;
        String string;
        if (c767080U7e == null || (jSONArray = c767080U7e.LIZJ) == null || (string = jSONArray.toString()) == null) {
            return "";
        }
        return string;
    }

    public static final String LIZIZ(C767080U7e c767080U7e) {
        JSONObject jSONObject;
        String strJ3;
        if (c767080U7e == null || (jSONObject = c767080U7e.LIZ) == null || (strJ3 = C786410Ut5.J3(jSONObject)) == null) {
            return "";
        }
        return strJ3;
    }

    public static final String LIZJ(C767080U7e c767080U7e) {
        JSONObject jSONObject;
        String strJ3;
        if (c767080U7e == null || (jSONObject = c767080U7e.LIZIZ) == null || (strJ3 = C786410Ut5.J3(jSONObject)) == null) {
            return "";
        }
        return strJ3;
    }
}
