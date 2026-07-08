package X;

import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fJL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122290fJL {
    public static final float LIZ(C1122100fJ2 c1122100fJ2) throws JSONException {
        Object obj;
        JSONArray jSONArray;
        Object obj2;
        Object obj3;
        float fFloatValue;
        JSONArray jSONArray2;
        JSONObject jSONObject;
        Map<String, Object> map = c1122100fJ2.LIZ;
        Object obj4 = null;
        if (map != null) {
            obj = map.get("outputs");
        } else {
            obj = null;
        }
        if (obj instanceof JSONArray) {
            jSONArray = (JSONArray) obj;
        } else {
            jSONArray = null;
        }
        if (jSONArray != null) {
            obj2 = jSONArray.get(0);
        } else {
            obj2 = null;
        }
        if ((obj2 instanceof JSONObject) && (jSONObject = (JSONObject) obj2) != null) {
            obj3 = jSONObject.get("raw");
        } else {
            obj3 = null;
        }
        if ((obj3 instanceof JSONArray) && (jSONArray2 = (JSONArray) obj3) != null) {
            obj4 = jSONArray2.get(0);
        }
        Float fLJIIIIZZ = C2327809Ae.LJIIIIZZ(String.valueOf(obj4));
        if (fLJIIIIZZ != null) {
            fFloatValue = fLJIIIIZZ.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        return 1.0f - fFloatValue;
    }
}
