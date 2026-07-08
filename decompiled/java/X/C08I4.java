package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.08I4, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08I4<K, V> {
    public final LinkedHashMap<K, V> LIZ;
    public int LIZIZ;
    public final int LIZJ;

    public final synchronized void LIZ() {
        LIZJ(-1);
    }

    public final synchronized String toString() {
        return C786410Ut5.j4("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.LIZJ), 0, 0, 0});
    }

    public C08I4(int i) {
        if (i > 0) {
            this.LIZJ = i;
            this.LIZ = new LinkedHashMap<>(0, 0.75f, false);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final void LIZJ(int i) {
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
        sbLIZ.append(C08I4.class.getName());
        sbLIZ.append(".sizeOf() is reporting inconsistent results!");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final synchronized void LIZIZ(Object obj, C0V11 c0v11) {
        if (obj != null) {
            this.LIZIZ++;
            if (this.LIZ.put(obj, c0v11) != null) {
                this.LIZIZ--;
            }
            LIZJ(this.LIZJ);
        } else {
            throw new NullPointerException("key == null || value == null");
        }
    }
}
