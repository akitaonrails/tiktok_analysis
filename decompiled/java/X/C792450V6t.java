package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V6t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C792450V6t {
    public static boolean LIZJ(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            return false;
        }
        return true;
    }

    public static JSONObject LJII(JSONObject jSONObject) {
        Iterator<String> itKeys;
        Iterator<String> itKeys2;
        if (jSONObject == null || (itKeys = jSONObject.keys()) == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                if (objOpt instanceof JSONObject) {
                    JSONObject jSONObject3 = (JSONObject) objOpt;
                    if (jSONObject3 != null && (itKeys2 = jSONObject3.keys()) != null) {
                        try {
                            JSONObject jSONObject4 = new JSONObject();
                            while (itKeys2.hasNext()) {
                                String next2 = itKeys2.next();
                                jSONObject4.put(next2, jSONObject3.opt(next2));
                            }
                            jSONObject3 = jSONObject4;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } else {
                        jSONObject3 = null;
                    }
                    if (jSONObject3 != null) {
                        jSONObject2.put(next, jSONObject3);
                    }
                } else if (objOpt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) objOpt;
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        jSONArray2.put(jSONArray.get(i));
                    }
                    jSONObject2.put(next, jSONArray2);
                } else {
                    jSONObject2.put(next, objOpt);
                }
            }
            return jSONObject2;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return jSONObject;
        }
    }

    public static JSONObject LIZ(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Iterator<String> itKeys;
        if (jSONObject2 == null || (itKeys = jSONObject2.keys()) == null) {
            return null;
        }
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!jSONObject2.isNull(next)) {
                jSONObject.put(next, jSONObject2.opt(next));
            }
        }
        return jSONObject;
    }

    public static void LIZIZ(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String[] strArrSplit = itKeys.next().split("#");
            int i = 0;
            JSONObject jSONObject3 = jSONObject;
            while (true) {
                if (i < strArrSplit.length - 1) {
                    if (!jSONObject3.has(strArrSplit[i]) || !jSONObject3.get(strArrSplit[i]).getClass().equals(JSONObject.class)) {
                        break;
                    }
                    jSONObject3 = JSONObjectProtectorUtils.getJSONObject(jSONObject3, strArrSplit[i]);
                    i++;
                } else if (jSONObject3 != null) {
                    jSONObject3.remove(strArrSplit[strArrSplit.length - 1]);
                }
            }
        }
    }

    public static void LIZLLL(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String[] strArrSplit = next.split("#");
            JSONObject jSONObject3 = jSONObject;
            for (int i = 0; i < strArrSplit.length - 1; i++) {
                if (!jSONObject3.has(strArrSplit[i]) || !jSONObject3.get(strArrSplit[i]).getClass().equals(JSONObject.class)) {
                    jSONObject3.put(strArrSplit[i], new JSONObject());
                }
                jSONObject3 = JSONObjectProtectorUtils.getJSONObject(jSONObject3, strArrSplit[i]);
            }
            jSONObject3.put(strArrSplit[strArrSplit.length - 1], jSONObject2.get(next));
        }
    }

    public static int LJ(String str, JSONObject jSONObject) {
        try {
            if (!jSONObject.has(str)) {
                return 0;
            }
            int i = JSONObjectProtectorUtils.getInt(jSONObject, str);
            jSONObject.remove(str);
            return i;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C792910V8n.LIZJ("JsonUtils", "removeInt", e);
            return 0;
        }
    }

    public static long LJFF(String str, JSONObject jSONObject) {
        try {
            if (!jSONObject.has(str)) {
                return 0L;
            }
            long j = JSONObjectProtectorUtils.getLong(jSONObject, str);
            jSONObject.remove(str);
            return j;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C792910V8n.LIZJ("JsonUtils", "removeLong", e);
            return 0L;
        }
    }

    public static String LJI(String str, JSONObject jSONObject) {
        try {
            if (!jSONObject.has(str)) {
                return null;
            }
            String string = JSONObjectProtectorUtils.getString(jSONObject, str);
            jSONObject.remove(str);
            return string;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C792910V8n.LIZJ("JsonUtils", "removeString", e);
            return null;
        }
    }
}
