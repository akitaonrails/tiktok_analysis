package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.13M5, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13M5<K, V> {
    public final int LIZ = 15;
    public final ConcurrentHashMap<K, V> LIZIZ = new ConcurrentHashMap<>();

    public final void LIZ(K k, V v) {
        Object objLJJJJL;
        if (this.LIZIZ.size() >= this.LIZ && (objLJJJJL = C13LP.LJJJJL(this.LIZIZ.keySet(), AbstractC19994813Le.Default.nextInt(this.LIZIZ.size()))) != null) {
            this.LIZIZ.remove(objLJJJJL);
        }
        this.LIZIZ.put(k, v);
    }
}
