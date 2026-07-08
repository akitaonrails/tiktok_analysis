package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Stack;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WLG, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WLG {
    public static final C0WLG LIZ = new C0WLG();

    public static JSONArray LIZ(JSONArray jSONArray) throws JSONException {
        JSONArray jSONArray2 = new JSONArray();
        Iterator<Integer> it2 = C13LZ.LJIILJJIL(0, jSONArray.length()).iterator();
        while (((C531650Kt9) it2).LLILLL) {
            Object objLIZ = jSONArray.get(((AbstractC2098408Jy) it2).nextInt());
            if (objLIZ instanceof JSONObject) {
                LIZ.getClass();
                objLIZ = LIZIZ((JSONObject) objLIZ);
            } else if (objLIZ instanceof JSONArray) {
                LIZ.getClass();
                objLIZ = LIZ((JSONArray) objLIZ);
            }
            jSONArray2.put(objLIZ);
        }
        return jSONArray2;
    }

    public static JSONObject LIZIZ(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objLIZ = jSONObject.get(next);
            if (objLIZ instanceof JSONObject) {
                LIZ.getClass();
                objLIZ = LIZIZ((JSONObject) objLIZ);
            } else if (objLIZ instanceof JSONArray) {
                LIZ.getClass();
                objLIZ = LIZ((JSONArray) objLIZ);
            }
            jSONObject2.put(next, objLIZ);
        }
        return jSONObject2;
    }

    public static JSONObject LIZJ(JSONObject jSONObject) {
        try {
            JSONObject jSONObjectLIZIZ = LIZIZ(jSONObject);
            Stack stack = new Stack();
            stack.push(jSONObjectLIZIZ);
            while (!stack.isEmpty()) {
                Object objPop = stack.pop();
                if (objPop instanceof JSONObject) {
                    Iterator<String> itKeys = ((JSONObject) objPop).keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        Object objOpt = ((JSONObject) objPop).opt(next);
                        if (objOpt == null) {
                            ((JSONObject) objPop).put(next, "empty");
                        } else if (objOpt instanceof JSONObject) {
                            stack.push(objOpt);
                        } else if (objOpt instanceof JSONArray) {
                            stack.push(objOpt);
                        } else {
                            ((JSONObject) objPop).put(next, objOpt.getClass().getSimpleName());
                        }
                    }
                } else if (objPop instanceof JSONArray) {
                    int length = ((JSONArray) objPop).length();
                    for (int i = 0; i < length; i++) {
                        Object objOpt2 = ((JSONArray) objPop).opt(i);
                        if (objOpt2 instanceof JSONObject) {
                            stack.push(objOpt2);
                        } else if (objOpt2 instanceof JSONArray) {
                            stack.push(objOpt2);
                        } else {
                            ((JSONArray) objPop).put(i, objOpt2.getClass().getSimpleName());
                        }
                    }
                }
            }
            return jSONObjectLIZIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C0VZK.LIZ(thM5exceptionOrNullimpl, "jsb_monitor_process_json_dfs_error", C2097608Jq.LJIIJ(new Pair("message", "jsb_monitor_process_json_dfs_error")));
            }
            return jSONObject;
        }
    }
}
