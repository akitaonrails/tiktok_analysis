package X;

import java.util.Map;

/* JADX INFO: renamed from: X.11Te, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19506011Te<K, V> implements Map.Entry<K, V> {
    public final K LL;
    public final V LLILLJJLI;
    public C19506011Te<K, V> LLILLL;
    public C19506011Te<K, V> LLILZ;

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.LL.hashCode() ^ this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append("=");
        sbLIZ.append(this.LLILLJJLI);
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

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C19506011Te)) {
            return false;
        }
        C19506011Te c19506011Te = (C19506011Te) obj;
        if (this.LL.equals(c19506011Te.LL) && this.LLILLJJLI.equals(c19506011Te.LLILLJJLI)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public C19506011Te(K k, V v) {
        this.LL = k;
        this.LLILLJJLI = v;
    }
}
