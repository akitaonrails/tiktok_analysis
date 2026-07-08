package X;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.08I7, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08I7<K, V> {
    public final Map<K, V> LIZ;
    public int LIZIZ;
    public final int LIZJ;
    public int LIZLLL;
    public int LJ;

    public final synchronized void LIZ() {
        LJII(-1);
    }

    public final synchronized Map<K, V> LIZJ() {
        return this.LIZ;
    }

    public final synchronized int LJFF() {
        return this.LIZIZ;
    }

    public final synchronized Map<K, V> LJI() {
        return new LinkedHashMap(this.LIZ);
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.LIZLLL;
        i2 = this.LJ + i;
        return C786410Ut5.j4("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.LIZJ), Integer.valueOf(this.LIZLLL), Integer.valueOf(this.LJ), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0)});
    }

    public C08I7(int i) {
        if (i > 0) {
            this.LIZJ = i;
            this.LIZ = Collections.synchronizedMap(new LinkedHashMap(0, 0.75f, true));
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final synchronized V LIZIZ(K k) {
        if (k != null) {
            V v = this.LIZ.get(k);
            if (v != null) {
                this.LIZLLL++;
                return v;
            }
            this.LJ++;
            return null;
        }
        throw new NullPointerException("key == null");
    }

    public final synchronized V LJ(K k) {
        V vRemove;
        if (k != null) {
            vRemove = this.LIZ.remove(k);
            if (vRemove != null) {
                this.LIZIZ--;
            }
        } else {
            throw new NullPointerException("key == null");
        }
        return vRemove;
    }

    public final void LJII(int i) {
        Map.Entry<K, V> next;
        while (this.LIZIZ > i && !this.LIZ.isEmpty() && (next = this.LIZ.entrySet().iterator().next()) != null) {
            K key = next.getKey();
            next.getValue();
            this.LIZ.remove(key);
            this.LIZIZ--;
        }
        if (this.LIZIZ >= 0 && (!this.LIZ.isEmpty() || this.LIZIZ == 0)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C08I7.class.getName());
        sbLIZ.append(".sizeOf() is reporting inconsistent results!");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final synchronized V LIZLLL(K k, V v) {
        V vPut;
        if (k != null && v != null) {
            this.LIZIZ++;
            vPut = this.LIZ.put(k, v);
            if (vPut != null) {
                this.LIZIZ--;
            }
            LJII(this.LIZJ);
        } else {
            throw new NullPointerException("key == null || value == null");
        }
        return vPut;
    }
}
