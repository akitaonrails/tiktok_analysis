package X;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NRA, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NRA {
    public static void LIZ(String str, Map map, Map map2) {
        map.putAll(map2);
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        C100C.LIZ.LIZJ().LIZ(str, map);
    }
}
