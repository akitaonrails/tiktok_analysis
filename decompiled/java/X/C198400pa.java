package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.00pa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C198400pa {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(HashMap map) {
        HashMap map2 = new HashMap(map);
        map.clear();
        for (Map.Entry entry : map2.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (!(value instanceof Number) || ((Number) value).floatValue() != 0.0f) {
                if (value != null) {
                    map.put(key, value);
                }
            }
        }
    }

    public static void LIZ(Map map, Map map2) {
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    if (value instanceof Number) {
                        ((HashMap) map).put(entry.getKey(), value);
                    } else if (value instanceof String) {
                        ((HashMap) map).put(entry.getKey(), value);
                    } else if ((value instanceof float[]) && ((float[]) value).length < 16) {
                        ((HashMap) map).put(entry.getKey(), value);
                    } else if ((value instanceof double[]) && ((double[]) value).length < 16) {
                        ((HashMap) map).put(entry.getKey(), value);
                    } else if ((value instanceof int[]) && ((int[]) value).length < 16) {
                        ((HashMap) map).put(entry.getKey(), value);
                    } else if ((value instanceof long[]) && ((long[]) value).length < 16) {
                        ((HashMap) map).put(entry.getKey(), value);
                    }
                }
            }
        }
    }
}
