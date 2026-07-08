package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.14zw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20449014zw<K, V> {
    public final HashMap<K, V> LIZ = new HashMap<>();

    public final <T> T LIZ(K k) {
        V v = this.LIZ.get(k);
        if (v != null) {
            return v;
        }
        return null;
    }

    public final void LIZIZ(Object obj, Object obj2) {
        this.LIZ.put(obj, obj2);
    }
}
