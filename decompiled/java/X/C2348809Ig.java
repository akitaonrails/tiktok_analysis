package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.p;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09Ig, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2348809Ig {
    public static final p LIZ = new p();

    public static List<Object> LIZIZ(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object objOpt = jSONArray.opt(i);
            if (objOpt instanceof Long) {
                arrayList.add(Long.valueOf(jSONArray.optLong(i)));
            } else if (objOpt instanceof Double) {
                arrayList.add(Double.valueOf(jSONArray.optDouble(i)));
            } else if (objOpt instanceof Integer) {
                arrayList.add(Integer.valueOf(jSONArray.optInt(i)));
            } else if (objOpt instanceof String) {
                arrayList.add(jSONArray.optString(i));
            } else if (objOpt instanceof JSONObject) {
                arrayList.add(LIZJ(jSONArray.optJSONObject(i)));
            } else if (objOpt instanceof JSONArray) {
                arrayList.add(LIZIZ(jSONArray.optJSONArray(i)));
            } else if (objOpt instanceof Boolean) {
                arrayList.add(Boolean.valueOf(jSONArray.optBoolean(i)));
            }
        }
        return arrayList;
    }

    public static Map<String, Object> LIZJ(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt instanceof Long) {
                map.put(next, Long.valueOf(jSONObject.optLong(next)));
            } else if (objOpt instanceof Double) {
                map.put(next, Double.valueOf(jSONObject.optDouble(next)));
            } else if (objOpt instanceof Integer) {
                map.put(next, Integer.valueOf(jSONObject.optInt(next)));
            } else if (objOpt instanceof String) {
                map.put(next, jSONObject.optString(next));
            } else if (objOpt instanceof JSONObject) {
                map.put(next, LIZJ(jSONObject.optJSONObject(next)));
            } else if (objOpt instanceof JSONArray) {
                map.put(next, LIZIZ(jSONObject.optJSONArray(next)));
            } else if (objOpt instanceof Boolean) {
                map.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
            }
        }
        return map;
    }

    public static JSONObject LIZLLL(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return jSONObject;
    }

    public static n LJFF(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            LIZ.getClass();
            return p.LIZJ(str).LJIILIIL();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parseJson error: ");
            sbLIZ.append(th.getMessage());
            C20441214yg.LJ("JsonUtil", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public static n LJI(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            LIZ.getClass();
            return p.LIZJ(str).LJIILIIL();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw new o(th);
        }
    }

    public static String LJIIIIZZ(Object obj) {
        if (obj == null) {
            return "";
        }
        try {
            return C19748512Ol.LIZIZ.LJIILL(obj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw new o(th);
        }
    }

    public static List LIZ(Class cls, String str) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<k> it2 = GsonProtectorUtils.parse(new p(), str).LJIIL().iterator();
        while (it2.hasNext()) {
            arrayList.add(GsonProtectorUtils.fromJson(C19748512Ol.LIZIZ, it2.next(), cls));
        }
        return arrayList;
    }

    public static <T> T LJ(String str, Type type) {
        if (str == null) {
            return null;
        }
        try {
            return (T) C19748512Ol.LIZIZ.LJIIIIZZ(str, type);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static Object LJII(Class cls, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return C19748512Ol.LIZIZ.LJII(str, cls);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw new o(th);
        }
    }
}
