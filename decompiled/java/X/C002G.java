package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.002G, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C002G {
    public static final Map<String, Object> LIZ(Map<String, ? extends Object> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                linkedHashMap.put(entry.getKey(), value);
            }
        }
        return linkedHashMap;
    }
}
