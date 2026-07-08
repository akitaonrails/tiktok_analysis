package X;

import java.util.Map;

/* JADX INFO: renamed from: X.13X6, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13X6<K, V> implements Map.Entry<K, V> {
    public C13X6<K, V> LL;
    public C13X6<K, V> LLILLJJLI;
    public C13X6<K, V> LLILLL;
    public C13X6<K, V> LLILZ;
    public C13X6<K, V> LLILZIL;
    public final K LLILZLL;
    public final int LLIZ;
    public V LLIZLLLIL;
    public int LLJ;

    @Override // java.util.Map.Entry
    public final int hashCode() {
        K k = this.LLILZLL;
        int iHashCode = k == null ? 0 : k.hashCode();
        V v = this.LLIZLLLIL;
        return iHashCode ^ (v != null ? v.hashCode() : 0);
    }

    public C13X6() {
        this.LLIZ = -1;
        this.LLILZIL = this;
        this.LLILZ = this;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append("=");
        sbLIZ.append(this.LLIZLLLIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.LLILZLL;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.LLIZLLLIL;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        K k = this.LLILZLL;
        if (k == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!k.equals(entry.getKey())) {
            return false;
        }
        V v = this.LLIZLLLIL;
        if (v == null) {
            if (entry.getValue() != null) {
                return false;
            }
        } else if (!v.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        V v2 = this.LLIZLLLIL;
        this.LLIZLLLIL = v;
        return v2;
    }

    public C13X6(C13X6<K, V> c13x6, K k, int i, C13X6<K, V> c13x62, C13X6<K, V> c13x63) {
        this.LL = c13x6;
        this.LLILZLL = k;
        this.LLIZ = i;
        this.LLJ = 1;
        this.LLILZ = c13x62;
        this.LLILZIL = c13x63;
        c13x63.LLILZ = this;
        c13x62.LLILZIL = this;
    }
}
