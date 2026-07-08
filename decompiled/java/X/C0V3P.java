package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V3P, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V3P {
    public final ConcurrentHashMap<String, Object> LIZ = new ConcurrentHashMap<>(3);

    public static Map LIZIZ(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt != null) {
                map.put(next, objOpt);
            }
        }
        return map;
    }

    public final HashMap<String, Object> LIZ(Map<String, Object> map) {
        Map<? extends String, ? extends Object> mapLIZIZ;
        HashMap<String, Object> map2 = new HashMap<>(this.LIZ);
        HashMap map3 = (HashMap) map;
        if (map3.containsKey("label_usage")) {
            try {
                Object obj = map3.get("label_usage");
                if (obj instanceof JSONObject) {
                    mapLIZIZ = LIZIZ((JSONObject) obj);
                } else if (obj instanceof Map) {
                    mapLIZIZ = (Map) obj;
                } else {
                    int i = C2187451AjH.LIZ;
                    C1471660oOq.LIZIZ("LabelUsage", "invalid parameter type");
                    mapLIZIZ = null;
                }
                if (mapLIZIZ != null) {
                    map2.putAll(mapLIZIZ);
                    return map2;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return map2;
    }
}
