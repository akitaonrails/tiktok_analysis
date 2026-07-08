package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.00mP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C178700mP {
    public static final /* synthetic */ int LIZ = 0;

    public static ConcurrentHashMap LIZ(Map map, ConcurrentHashMap concurrentHashMap) {
        if (map != null) {
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap();
            }
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    concurrentHashMap.put(entry.getKey(), value);
                }
            }
        }
        return concurrentHashMap;
    }
}
