package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.13CB, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13CB<K, V> implements Iterator<K>, C03W4 {
    public final C13CA<K, V> LL;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LL.hasNext();
    }

    @Override // java.util.Iterator
    public final K next() {
        C13CA<K, V> c13ca = this.LL;
        K k = (K) c13ca.LL;
        c13ca.next();
        return k;
    }

    public C13CB(C13C4<K, V> c13c4) {
        this.LL = new C13CA<>(c13c4.LLILLJJLI, c13c4.LLILZ);
    }
}
