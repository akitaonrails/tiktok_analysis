package X;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.13Eo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19977613Eo<K, V> implements Iterator<Map.Entry<K, V>>, C03W4 {
    public final C19977413Em<K, V, Map.Entry<K, V>> LL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LL.LLILLL;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.LL.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.LL.remove();
    }

    public C19977613Eo(C13CF<K, V> c13cf) {
        AbstractC19977713Ep[] abstractC19977713EpArr = new AbstractC19977713Ep[8];
        int i = 0;
        do {
            abstractC19977713EpArr[i] = new AbstractC19977713Ep<K, V, Map.Entry<K, V>>(this) { // from class: X.13Eq
                public final C19977613Eo<K, V> LLILZ;

                @Override // java.util.Iterator
                public final Object next() {
                    int i2 = this.LLILLL + 2;
                    this.LLILLL = i2;
                    C19977613Eo<K, V> c19977613Eo = this.LLILZ;
                    Object[] objArr = this.LL;
                    return new C19977313El(c19977613Eo, objArr[i2 - 2], objArr[i2 - 1]);
                }

                {
                    this.LLILZ = this;
                }
            };
            i++;
        } while (i < 8);
        this.LL = new C19977413Em<>(c13cf, abstractC19977713EpArr);
    }
}
