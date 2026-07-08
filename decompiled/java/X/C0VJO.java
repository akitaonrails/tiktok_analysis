package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VJO, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VJO {
    public static boolean LJI(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            return false;
        }
        return true;
    }

    public static void LIZ(JSONObject jSONObject, Object... objArr) {
        if (jSONObject != null && objArr.length % 2 == 0 && objArr.length != 0) {
            for (int i = 0; i < objArr.length; i += 2) {
                LJIIIIZZ(jSONObject, String.valueOf(objArr[i]), objArr[i + 1]);
            }
        }
    }

    public static void LIZLLL(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null && jSONObject2.length() > 0) {
            try {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt = jSONObject.opt(next);
                    if (objOpt == null) {
                        jSONObject.put(next, jSONObject2.opt(next));
                    } else if (objOpt instanceof JSONObject) {
                        LIZLLL(JSONObjectProtectorUtils.getJSONObject(jSONObject, next), JSONObjectProtectorUtils.getJSONObject(jSONObject2, next));
                    } else if (objOpt instanceof JSONArray) {
                        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(next);
                        if (jSONArrayOptJSONArray != null) {
                            JSONArray jSONArray = (JSONArray) objOpt;
                            if (jSONArray.length() == 1 && (jSONArray.opt(0) instanceof JSONObject) && (jSONArrayOptJSONArray.opt(0) instanceof JSONObject)) {
                                LIZLLL(JSONArrayProtectorUtils.getJSONObject(jSONArray, 0), JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray, 0));
                            } else {
                                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                                    jSONArray.put(jSONArrayOptJSONArray.get(i));
                                }
                            }
                        }
                    } else {
                        jSONObject.put(next, jSONObject2.opt(next));
                    }
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static JSONObject LJ(String str, JSONObject jSONObject) {
        if (jSONObject != null && !TextUtils.isEmpty(str)) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
                try {
                    jSONObject.put(str, jSONObjectOptJSONObject);
                    return jSONObjectOptJSONObject;
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            return jSONObjectOptJSONObject;
        }
        return jSONObject;
    }

    public static JSONObject LJFF(JSONObject jSONObject, String... strArr) {
        if (jSONObject == null) {
            return null;
        }
        for (int i = 0; i < strArr.length - 1; i++) {
            jSONObject = jSONObject.optJSONObject(strArr[i]);
            if (jSONObject == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("err get json: not found node:");
                sbLIZ.append(strArr[i]);
                C2188811AlT.LIZIZ(sbLIZ);
                return null;
            }
        }
        return jSONObject;
    }

    public static void LJII(JSONObject jSONObject, Map<String, ? extends Object> map) {
        if (jSONObject != null) {
            try {
                for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void LJIIIZ(JSONObject jSONObject, Map<? extends String, ?> map) {
        if (jSONObject != null && map != null) {
            try {
                for (Map.Entry<? extends String, ?> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void LIZIZ(String str, String str2, JSONObject jSONObject) {
        if (str2 != null) {
            try {
                jSONObject.put(str, str2);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void LIZJ(JSONObject jSONObject, String str, Object obj) {
        if (obj != null) {
            try {
                jSONObject.put(str, String.valueOf(obj));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static JSONObject LJIIIIZZ(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject != null && obj != null && !TextUtils.isEmpty(str)) {
            try {
                jSONObject.put(str, obj);
                return jSONObject;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return jSONObject;
    }
}
