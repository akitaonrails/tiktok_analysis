package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11U2, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C11U2<K, V> implements Map.Entry<K, V>, C03W4 {
    public final K LL;
    public final V LLILLJJLI;

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        K k = this.LL;
        int iHashCode = k != null ? k.hashCode() : 0;
        V value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append('=');
        sbLIZ.append(getValue());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.LL;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.LLILLJJLI;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        if (obj instanceof Map.Entry) {
            entry = (Map.Entry) obj;
        } else {
            entry = null;
        }
        if (entry == null || !Intrinsics.LJFF(entry.getKey(), this.LL) || !Intrinsics.LJFF(entry.getValue(), getValue())) {
            return false;
        }
        return true;
    }

    public C11U2(K k, V v) {
        this.LL = k;
        this.LLILLJJLI = v;
    }
}
