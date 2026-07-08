package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pfq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1520640pfq {
    public static List<String> LIZIZ(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null && jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.optString(i));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1520960pgM.LIZIZ(th);
            return new ArrayList();
        }
    }

    public static JSONObject LJIILL(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return new JSONObject();
            }
            return new JSONObject(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1520960pgM.LIZIZ(e);
            return new JSONObject();
        }
    }

    public static void LIZ(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null) {
            try {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    LJIILJJIL(jSONObject, next, LJIIIIZZ(next, jSONObject2));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1520960pgM.LIZIZ(e);
            }
        }
    }

    public static JSONObject LIZJ(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1520960pgM.LIZIZ(th);
        }
        if (jSONObject == null) {
            return LIZJ(new JSONObject(), jSONObject2);
        }
        if (jSONObject2 == null) {
            return jSONObject;
        }
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject2.opt(next);
            if (objOpt instanceof JSONObject) {
                LJIILJJIL(jSONObject, next, LIZJ(jSONObject.optJSONObject(next), jSONObject2.optJSONObject(next)));
            } else {
                LJIILJJIL(jSONObject, next, objOpt);
            }
        }
        return jSONObject;
    }

    public static int LJFF(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.optInt(str, 0);
    }

    public static JSONArray LJI(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONArray();
        }
        return jSONObject.optJSONArray(str);
    }

    public static JSONObject LJII(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject.optJSONObject(str);
    }

    public static Object LJIIIIZZ(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return new Object();
        }
        return jSONObject.opt(str);
    }

    public static String LJIIJ(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return "";
        }
        return jSONObject.optString(str, "");
    }

    public static void LIZLLL(JSONObject jSONObject, String str, Object obj) {
        if (obj != null) {
            try {
                jSONObject.put(str, obj);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1520960pgM.LIZIZ(e);
            }
        }
    }

    public static boolean LJ(JSONObject jSONObject, JSONObject jSONObject2, String... strArr) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        for (String str : strArr) {
            if (!LJIIJ(str, jSONObject).equals(LJIIJ(str, jSONObject2))) {
                return false;
            }
        }
        return true;
    }

    public static String LJIIIZ(String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            return str2;
        }
        try {
            return jSONObject.optString(str, str2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1520960pgM.LIZIZ(th);
            return str2;
        }
    }

    public static void LJIIJJI(int i, String str, JSONObject jSONObject) {
        try {
            jSONObject.put(str, i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1520960pgM.LIZIZ(e);
        }
    }

    public static void LJIIL(String str, long j, JSONObject jSONObject) {
        try {
            jSONObject.put(str, j);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1520960pgM.LIZIZ(e);
        }
    }

    public static void LJIILIIL(String str, String str2, JSONObject jSONObject) {
        try {
            jSONObject.put(str, str2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1520960pgM.LIZIZ(e);
        }
    }

    public static void LJIILJJIL(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1520960pgM.LIZIZ(e);
        }
    }
}
