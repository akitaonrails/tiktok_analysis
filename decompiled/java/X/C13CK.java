package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.13CK, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13CK<K, V> implements Iterator<K>, C03W4 {
    public final C13CC<K, V> LL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LL.hasNext();
    }

    @Override // java.util.Iterator
    public final K next() {
        this.LL.next();
        return (K) this.LL.LLILLL;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.LL.remove();
    }

    public C13CK(C13CE<K, V> c13ce) {
        this.LL = new C13CC<>(c13ce.LLILLJJLI, c13ce);
    }
}
