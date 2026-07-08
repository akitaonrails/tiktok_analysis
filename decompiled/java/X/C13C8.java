package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.13C8, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13C8<K, V> implements Iterator<V>, C03W4 {
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
    public final V next() {
        return this.LL.next().LIZ;
    }

    public C13C8(C13C4<K, V> c13c4) {
        this.LL = new C13CA<>(c13c4.LLILLJJLI, c13c4.LLILZ);
    }
}
