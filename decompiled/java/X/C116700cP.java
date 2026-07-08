package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00cP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C116700cP {
    public static Map<String, ArrayList<String>> LIZ(JSONObject jSONObject) {
        HashMap map = new HashMap();
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                ArrayList arrayList = new ArrayList();
                if (jSONArrayOptJSONArray != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        arrayList.add(jSONArrayOptJSONArray.get(i).toString());
                    }
                }
                map.put(next, arrayList);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return map;
    }

    public static Map<String, String> LIZIZ(JSONObject jSONObject) {
        HashMap map = new HashMap();
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return map;
    }
}
