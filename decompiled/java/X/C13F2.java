package X;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.13F2, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13F2<K, V> implements Iterator<Map.Entry<K, V>>, C03W4 {
    public final C19978713Ez<K, V, Map.Entry<K, V>> LL;

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

    public C13F2(C19971113Cb<K, V> c19971113Cb) {
        C13F3[] c13f3Arr = new C13F3[8];
        int i = 0;
        do {
            c13f3Arr[i] = new C13F3<K, V, Map.Entry<K, V>>(this) { // from class: X.13F4
                public final C13F2<K, V> LLILZ;

                @Override // java.util.Iterator
                public final Object next() {
                    int i2 = this.LLILLL + 2;
                    this.LLILLL = i2;
                    C13F2<K, V> c13f2 = this.LLILZ;
                    Object[] objArr = this.LL;
                    return new C13F1(c13f2, objArr[i2 - 2], objArr[i2 - 1]);
                }

                {
                    this.LLILZ = this;
                }
            };
            i++;
        } while (i < 8);
        this.LL = new C19978713Ez<>(c19971113Cb, c13f3Arr);
    }
}
