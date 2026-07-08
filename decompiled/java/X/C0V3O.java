package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V3O, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V3O {
    public static JSONObject LIZ(JSONObject jSONObject) {
        LinkedList linkedList = new LinkedList();
        Iterator<String> itKeys = jSONObject.keys();
        if (itKeys == null) {
            return null;
        }
        while (itKeys.hasNext()) {
            linkedList.add(itKeys.next());
        }
        try {
            return new JSONObject(jSONObject, (String[]) linkedList.toArray(new String[0]));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    public static JSONObject LIZIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new JSONObject(C786410Ut5.J3(jSONObject));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return jSONObject;
        }
    }

    public static boolean LIZJ(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            return false;
        }
        return true;
    }

    public static JSONArray LJFF(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        if (length == 0) {
            return jSONArray;
        }
        try {
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < length; i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof JSONObject) {
                    jSONArray2.put(LJI((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    jSONArray2.put(LJFF((JSONArray) obj));
                } else {
                    jSONArray2.put(obj);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return jSONArray;
    }

    public static JSONObject LJI(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> itKeys = jSONObject.keys();
        if (itKeys == null) {
            return jSONObject;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                if (objOpt instanceof JSONObject) {
                    jSONObject2.put(next, LJI((JSONObject) objOpt));
                } else if (objOpt instanceof JSONArray) {
                    jSONObject2.put(next, LJFF((JSONArray) objOpt));
                } else {
                    jSONObject2.put(next, objOpt);
                }
            }
            return jSONObject2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return jSONObject;
        }
    }

    public static int LIZLLL(String str, String str2, JSONObject jSONObject) {
        JSONObject jSONObjectLJ = LJ("performance_modules", str, jSONObject);
        if (jSONObjectLJ == null) {
            return 0;
        }
        return jSONObjectLJ.optInt(str2, 0);
    }

    public static JSONObject LJ(String str, String str2, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject(str)) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject(str2);
    }
}
