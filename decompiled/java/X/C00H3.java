package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.00H3, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00H3 {
    public static final Map<String, Object> LIZ(Map<String, ? extends Object> map) {
        String string;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || (string = value.toString()) == null) {
                string = "";
            }
            linkedHashMap.put(key, string);
        }
        return linkedHashMap;
    }
}
