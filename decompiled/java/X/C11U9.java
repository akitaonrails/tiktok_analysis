package X;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.11U9, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11U9<K, V> {
    public final int LIZ;
    public final int LIZIZ;
    public final C11UA LIZJ = new C11UA(this);

    public final synchronized void LIZ() {
        this.LIZJ.clear();
    }

    public final synchronized int LIZIZ() {
        int size;
        Iterator<Map.Entry<K, C11U8<V>>> it2 = this.LIZJ.entrySet().iterator();
        size = 0;
        while (it2.hasNext()) {
            size += it2.next().getValue().size();
        }
        return size;
    }

    public final synchronized int LJ() {
        return this.LIZJ.size();
    }

    public final synchronized C11U8<V> LIZJ(K k) {
        return this.LIZJ.get(k);
    }

    public C11U9(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }

    public final synchronized void LIZLLL(K k, V v) {
        C11U8<V> c11u8 = this.LIZJ.get(k);
        if (c11u8 == null) {
            c11u8 = new C11U8<>(this.LIZIZ);
        }
        c11u8.LIZJ(v);
        this.LIZJ.put(k, c11u8);
    }
}
