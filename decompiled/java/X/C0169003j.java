package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.003j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0169003j {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(Object obj) {
        Map map;
        if (!(obj instanceof Map) || (map = (Map) obj) == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = false;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                z = true;
            } else {
                linkedHashMap.put(key, value);
            }
        }
        if (z) {
            return linkedHashMap;
        }
        return map;
    }
}
