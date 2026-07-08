package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Apl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191471Apl {
    public static Long LIZ(JSONObject jSONObject) {
        C20137213qk.LIZJ(jSONObject, "json must not be null");
        if (jSONObject.has("expires_at") && !jSONObject.isNull("expires_at")) {
            try {
                return Long.valueOf(JSONObjectProtectorUtils.getLong(jSONObject, "expires_at"));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    public static JSONObject LJI(Map<String, String> map) {
        map.getClass();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            C20137213qk.LIZJ(entry.getKey(), "map entries must not have null keys");
            C20137213qk.LIZJ(entry.getValue(), "map entries must not have null values");
            LJIIIIZZ(entry.getKey(), entry.getValue(), jSONObject);
        }
        return jSONObject;
    }

    public static String LIZIZ(JSONObject jSONObject, String str) throws JSONException {
        C20137213qk.LIZJ(jSONObject, "json must not be null");
        if (jSONObject.has(str)) {
            String string = JSONObjectProtectorUtils.getString(jSONObject, str);
            if (string != null) {
                return string;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("field \"");
            sbLIZ.append(str);
            sbLIZ.append("\" is mapped to a null value");
            throw new JSONException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("field \"");
        sbLIZ2.append(str);
        sbLIZ2.append("\" not found in json object");
        throw new JSONException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static String LIZJ(String str, JSONObject jSONObject) {
        C20137213qk.LIZJ(jSONObject, "json must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        String string = JSONObjectProtectorUtils.getString(jSONObject, str);
        if (string != null) {
            return string;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("field \"");
        sbLIZ.append(str);
        sbLIZ.append("\" is mapped to a null value");
        throw new JSONException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static Map LIZLLL(String str, JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C20137213qk.LIZJ(jSONObject, "json must not be null");
        if (!jSONObject.has(str)) {
            return linkedHashMap;
        }
        JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, str);
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String string = JSONObjectProtectorUtils.getString(jSONObject2, next);
            C20137213qk.LIZJ(string, "additional parameter values must not be null");
            linkedHashMap.put(next, string);
        }
        return linkedHashMap;
    }

    public static Uri LJ(String str, JSONObject jSONObject) throws JSONException {
        C20137213qk.LIZJ(jSONObject, "json must not be null");
        String string = JSONObjectProtectorUtils.getString(jSONObject, str);
        if (string != null) {
            return UriProtector.parse(string);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("field \"");
        sbLIZ.append(str);
        sbLIZ.append("\" is mapped to a null value");
        throw new JSONException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static Uri LJFF(String str, JSONObject jSONObject) throws JSONException {
        C20137213qk.LIZJ(jSONObject, "json must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        String string = JSONObjectProtectorUtils.getString(jSONObject, str);
        if (string != null) {
            return UriProtector.parse(string);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("field \"");
        sbLIZ.append(str);
        sbLIZ.append("\" is mapped to a null value");
        throw new JSONException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJIIJ(Long l, JSONObject jSONObject) {
        if (l == null) {
            return;
        }
        try {
            jSONObject.put("expires_at", l);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalStateException("JSONException thrown in violation of contract", e);
        }
    }

    public static void LJII(int i, String str, JSONObject jSONObject) {
        C20137213qk.LIZJ(Integer.valueOf(i), "value must not be null");
        try {
            jSONObject.put(str, i);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalStateException("JSONException thrown in violation of contract, ex");
        }
    }

    public static void LJIIIIZZ(String str, String str2, JSONObject jSONObject) {
        C20137213qk.LIZJ(str, "field must not be null");
        C20137213qk.LIZJ(str2, "value must not be null");
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalStateException("JSONException thrown in violation of contract", e);
        }
    }

    public static void LJIIIZ(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        C20137213qk.LIZJ(jSONObject2, "value must not be null");
        try {
            jSONObject.put(str, jSONObject2);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalStateException("JSONException thrown in violation of contract", e);
        }
    }

    public static void LJIIJJI(String str, String str2, JSONObject jSONObject) {
        if (str2 == null) {
            return;
        }
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalStateException("JSONException thrown in violation of contract", e);
        }
    }

    public static void LJIIL(JSONObject jSONObject, String str, Uri uri) {
        if (uri == null) {
            return;
        }
        try {
            jSONObject.put(str, uri.toString());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalStateException("JSONException thrown in violation of contract", e);
        }
    }
}
