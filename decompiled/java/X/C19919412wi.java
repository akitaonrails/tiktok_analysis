package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.12wi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19919412wi<K, V> {
    public final C19919312wh LIZ;
    public final int LIZIZ = 100;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.12wh] */
    public C19919412wi() {
        final int i = 134;
        this.LIZ = new LinkedHashMap<Object, Object>(i) { // from class: X.12wh
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<Object, Object> entry) {
                if (size() > this.LL.LIZIZ) {
                    return true;
                }
                return false;
            }
        };
    }

    public final synchronized void LIZ(K k, V v) {
        put(k, v);
    }
}
