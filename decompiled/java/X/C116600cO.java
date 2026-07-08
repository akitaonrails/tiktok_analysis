package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00cO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C116600cO {
    public static final List<Object> LIZ(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                arrayList.add(LIZIZ((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                arrayList.add(LIZ((JSONArray) obj));
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final Map<String, Object> LIZIZ(JSONObject jSONObject) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                linkedHashMap.put(next, LIZIZ((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                linkedHashMap.put(next, LIZ((JSONArray) obj));
            } else {
                linkedHashMap.put(next, obj);
            }
        }
        return linkedHashMap;
    }

    public static final Map<String, Object> LIZJ(String str) {
        try {
            return LIZIZ(new JSONObject(str));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return C2097608Jq.LJ();
        }
    }
}
