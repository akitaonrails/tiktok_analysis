package X;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: X.12tQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19899012tQ<K, V> implements Iterator<Map.Entry<K, V>> {
    public boolean LL;
    public int LLILLJJLI;
    public final /* synthetic */ C19899212tS LLILLL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LLILLJJLI < this.LLILLL.LL;
    }

    @Override // java.util.Iterator
    public final Object next() {
        final int i = this.LLILLJJLI;
        final C19899212tS c19899212tS = this.LLILLL;
        if (i == c19899212tS.LL) {
            throw new NoSuchElementException();
        }
        this.LLILLJJLI = i + 1;
        this.LL = false;
        return new Map.Entry<K, V>(i) { // from class: X.12tP
            public final int LL;

            @Override // java.util.Map.Entry
            public final K getKey() {
                C19899212tS c19899212tS2 = this.LLILLJJLI;
                int i2 = this.LL;
                if (i2 < 0) {
                    c19899212tS2.getClass();
                    return null;
                }
                if (i2 < c19899212tS2.LL) {
                    return (K) c19899212tS2.LLILLJJLI[i2 << 1];
                }
                return null;
            }

            @Override // java.util.Map.Entry
            public final V getValue() {
                int i2;
                C19899212tS c19899212tS2 = this.LLILLJJLI;
                int i3 = this.LL;
                if (i3 < 0) {
                    c19899212tS2.getClass();
                    return null;
                }
                if (i3 >= c19899212tS2.LL || (i2 = (i3 << 1) + 1) < 0) {
                    return null;
                }
                return (V) c19899212tS2.LLILLJJLI[i2];
            }

            @Override // java.util.Map.Entry
            public final int hashCode() {
                K key = getKey();
                V value = getValue();
                return (key != null ? key.hashCode() : 0) ^ (value != null ? value.hashCode() : 0);
            }

            @Override // java.util.Map.Entry
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (C19837412jU.LIZ(getKey(), entry.getKey()) && C19837412jU.LIZ(getValue(), entry.getValue())) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Map.Entry
            public final V setValue(V v) {
                V v2;
                C19899212tS c19899212tS2 = this.LLILLJJLI;
                int i2 = this.LL;
                int i3 = c19899212tS2.LL;
                if (i2 >= 0 && i2 < i3) {
                    int i4 = (i2 << 1) + 1;
                    if (i4 < 0) {
                        v2 = null;
                    } else {
                        v2 = (V) c19899212tS2.LLILLJJLI[i4];
                    }
                    c19899212tS2.LLILLJJLI[i4] = v;
                    return v2;
                }
                throw new IndexOutOfBoundsException();
            }

            {
                this.LL = i;
            }
        };
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.LLILLJJLI - 1;
        if (this.LL || i < 0) {
            throw new IllegalArgumentException();
        }
        this.LLILLL.LIZJ(i << 1);
        this.LLILLJJLI--;
        this.LL = true;
    }

    public C19899012tQ(C19899212tS c19899212tS) {
        this.LLILLL = c19899212tS;
    }
}
