package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0w2f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1765430w2f {
    public static final <K, V> Map<K, V> LIZ(Map<K, V> map) {
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            return linkedHashMap;
        }
        return null;
    }
}
