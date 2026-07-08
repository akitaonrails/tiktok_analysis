package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Z6S, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z6S {
    public static Map LIZ(int i, String str, Map map) {
        C1229100i5c c1229100i5c = C1229100i5c.LIZ;
        String strLJFF = C1229100i5c.LJFF(str);
        if (strLJFF == null) {
            strLJFF = "";
        }
        String strLIZJ = c1229100i5c.LIZJ(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put("group_type", strLJFF);
        linkedHashMap.put("chat_type", strLIZJ);
        linkedHashMap.put("error_code", String.valueOf(i));
        return linkedHashMap;
    }

    public static Map LIZIZ(C0Y8T c0y8t, Map map, int i) {
        String strLJ = C1229100i5c.LJ(c0y8t);
        if (strLJ == null) {
            strLJ = "";
        }
        String strLIZIZ = C1229100i5c.LIZIZ(c0y8t);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put("group_type", strLJ);
        linkedHashMap.put("chat_type", strLIZIZ);
        linkedHashMap.put("error_code", String.valueOf(i));
        return linkedHashMap;
    }
}
