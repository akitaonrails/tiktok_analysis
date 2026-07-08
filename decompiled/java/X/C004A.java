package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.004A, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C004A {
    public static volatile Map<String, String> LIZ = C2097608Jq.LJ();

    public static void LIZ(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
                    linkedHashMap.put(str, str2);
                }
            }
        }
        LIZ = linkedHashMap;
    }
}
