package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00E2, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00E2 {
    public static final HashMap<String, Map<String, Object>> LIZIZ(HashMap<String, Map<String, String>> map) {
        HashMap<String, Map<String, Object>> map2 = new HashMap<>();
        for (Map.Entry<String, Map<String, String>> entry : map.entrySet()) {
            String key = entry.getKey();
            Map<String, String> value = entry.getValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, String> entry2 : value.entrySet()) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
            }
            map2.put(key, linkedHashMap);
        }
        return map2;
    }

    public static final JSONObject LIZ(String str, HashMap map) {
        JSONObject jSONObject;
        synchronized (map) {
            try {
                jSONObject = new JSONObject();
                boolean z = false;
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Map map2 = (Map) entry.getValue();
                    if (map2.containsKey(str)) {
                        jSONObject.put(str2, map2.get(str));
                        z = true;
                    }
                }
                if (!z) {
                    jSONObject = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return jSONObject;
    }
}
