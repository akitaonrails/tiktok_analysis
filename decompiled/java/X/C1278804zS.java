package X;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.04zS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1278804zS {
    public static Map<String, String> LIZ(Map<String, String> map, Set<String> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            C20137213qk.LIZJ(key, "additional parameter keys cannot be null");
            C20137213qk.LIZJ(value, "additional parameter values cannot be null");
            Object[] objArr = {key};
            if (!set.contains(key)) {
                linkedHashMap.put(key, value);
            } else {
                throw new IllegalArgumentException(C786410Ut5.j4("Parameter %s is directly supported via the authorization request builder, use the builder method instead", objArr));
            }
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }
}
