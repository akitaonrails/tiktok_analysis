package X;

import com.lynx.animax.base.bridge.JavaOnlyMap;
import com.lynx.animax.base.bridge.ReadableMap;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0jYv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1285710jYv {
    public final JavaOnlyMap LIZ;
    public final JavaOnlyMap LIZIZ;

    public final String toString() {
        StringBuilder sb = new StringBuilder("PerfMetrics{");
        JavaOnlyMap javaOnlyMap = this.LIZ;
        javaOnlyMap.asHashMap();
        for (Map.Entry<String, Object> entry : javaOnlyMap.entrySet()) {
            if (entry.getValue() != null) {
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
                sb.append(",");
            }
        }
        JavaOnlyMap javaOnlyMap2 = this.LIZIZ;
        javaOnlyMap2.asHashMap();
        for (Map.Entry<String, Object> entry2 : javaOnlyMap2.entrySet()) {
            if (entry2.getValue() != null) {
                sb.append(entry2.getKey());
                sb.append("=");
                sb.append(entry2.getValue());
                sb.append(",");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public C1285710jYv(ReadableMap readableMap, ReadableMap readableMap2, Map<String, Object> map, String str) {
        HashMap<String, Object> mapAsHashMap;
        HashMap<String, Object> mapAsHashMap2;
        if (readableMap == null) {
            mapAsHashMap = new HashMap<>();
        } else {
            mapAsHashMap = readableMap.asHashMap();
        }
        if (readableMap2 == null) {
            mapAsHashMap2 = new HashMap<>();
        } else {
            mapAsHashMap2 = readableMap2.asHashMap();
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                if (value instanceof Number) {
                    mapAsHashMap.put(key, value);
                } else if ((value instanceof String) || (value instanceof Boolean)) {
                    mapAsHashMap2.put(key, value);
                }
            }
        }
        if (str != null) {
            mapAsHashMap2.put("default", str);
        }
        this.LIZ = JavaOnlyMap.from(mapAsHashMap);
        this.LIZIZ = JavaOnlyMap.from(mapAsHashMap2);
    }
}
