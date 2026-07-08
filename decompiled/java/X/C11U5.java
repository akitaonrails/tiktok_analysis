package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11U5, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11U5<K, V> implements Map.Entry<K, V>, C03W4 {
    public final K LL;
    public final V LLILLJJLI;

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11U5)) {
            return false;
        }
        C11U5 c11u5 = (C11U5) obj;
        return Intrinsics.LJFF(this.LL, c11u5.LL) && Intrinsics.LJFF(this.LLILLJJLI, c11u5.LLILLJJLI);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        K k = this.LL;
        int iHashCode = (k == null ? 0 : k.hashCode()) * 31;
        V v = this.LLILLJJLI;
        return iHashCode + (v != null ? v.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MapEntry(key=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", value=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.LL;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.LLILLJJLI;
    }

    public C11U5(K k, V v) {
        this.LL = k;
        this.LLILLJJLI = v;
    }
}
