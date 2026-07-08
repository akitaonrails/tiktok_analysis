package X;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0jcR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1287890jcR {
    public static WindowManager LIZ;
    public static final String[] LIZIZ = {"x", "y", "width", "height"};
    public static float LIZJ = Resources.getSystem().getDisplayMetrics().density;

    public static void LIZIZ(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("JSONException during JSONObject.put for name [");
            sbLIZ.append(str);
            sbLIZ.append(e3.f);
            C1287880jcQ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LIZJ(JSONObject jSONObject) {
        float f;
        float f2;
        if (LIZ != null) {
            Point point = new Point(0, 0);
            C2204961BRm.LLILZIL(LIZ, new C0WZX("dzBzEgs7XYTTWF4lCx6NZON6kZu0ArpgeazTzxqcTA8rccJvfaUH", null)).getRealSize(point);
            float f3 = point.x;
            float f4 = LIZJ;
            f = f3 / f4;
            f2 = point.y / f4;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        try {
            jSONObject.put("width", f);
            jSONObject.put("height", f2);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static boolean LIZLLL(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray.length() != jSONArrayOptJSONArray2.length() : jSONArrayOptJSONArray2 != null) {
            return false;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            if (!LJ(jSONArrayOptJSONArray.optJSONObject(i), jSONArrayOptJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean LJ(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        for (String str : LIZIZ) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", "")) && Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice"))) && Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
            JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
            if (jSONArrayOptJSONArray == null) {
                if (jSONArrayOptJSONArray2 != null) {
                    return false;
                }
            } else if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray.length() == jSONArrayOptJSONArray2.length()) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    if (!jSONArrayOptJSONArray.optString(i, "").equals(jSONArrayOptJSONArray2.optString(i, ""))) {
                        return false;
                    }
                }
            } else {
                return false;
            }
            if (LIZLLL(jSONObject, jSONObject2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static JSONObject LIZ(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i / LIZJ);
            jSONObject.put("y", i2 / LIZJ);
            jSONObject.put("width", i3 / LIZJ);
            jSONObject.put("height", i4 / LIZJ);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1287880jcQ.LIZ("Error with creating viewStateObject");
            return jSONObject;
        }
    }
}
