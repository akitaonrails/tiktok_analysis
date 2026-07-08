package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0T6Z, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public class C0T6Z extends ConcurrentHashMap<String, String> {
    public C0T6Z() {
        super(32);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends String, ? extends String> map) {
        if (map == null) {
            return;
        }
        for (Map.Entry<? extends String, ? extends String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null && value != null) {
                super.put(key, value);
            }
        }
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null && obj2 != null) {
            return super.put(obj, obj2);
        }
        return null;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object putIfAbsent(Object obj, Object obj2) {
        if (obj != null && obj2 != null && get(obj) == null) {
            return super.put(obj, obj2);
        }
        return null;
    }
}
