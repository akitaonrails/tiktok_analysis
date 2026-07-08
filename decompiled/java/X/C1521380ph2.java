package X;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ph2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1521380ph2 {
    public static JSONObject LIZ(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            String strLJIIJ = C1520640pfq.LJIIJ("pid", jSONObject);
            if (strLJIIJ.length() > 0) {
                C1520640pfq.LJIILIIL("pid", strLJIIJ, jSONObject2);
            }
            String strLJIIJ2 = C1520640pfq.LJIIJ("bid", jSONObject);
            if (strLJIIJ2.length() > 0) {
                C1520640pfq.LJIILIIL("bid", strLJIIJ2, jSONObject2);
            }
            JSONObject jSONObjectLJII = C1520640pfq.LJII("context", jSONObject);
            if (jSONObjectLJII != null) {
                Iterator<String> itKeys = jSONObjectLJII.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObjectLJII.get(next);
                    if (obj != null && !(obj instanceof String)) {
                        C1520640pfq.LJIILIIL(next, obj.toString(), jSONObjectLJII);
                    }
                }
                C1520640pfq.LJIILJJIL(jSONObject2, "context", jSONObjectLJII);
            }
            String strLJIIJ3 = C1520640pfq.LJIIJ("env", jSONObject);
            if (strLJIIJ3.length() > 0) {
                C1520640pfq.LJIILIIL("env", strLJIIJ3, jSONObject2);
            }
            String strLJIIJ4 = C1520640pfq.LJIIJ("release", jSONObject);
            if (strLJIIJ4.length() > 0) {
                C1520640pfq.LJIILIIL("release", strLJIIJ4, jSONObject2);
            }
        }
        return jSONObject2;
    }
}
