package X;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.13C9, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13C9<K, V> implements Iterator<Map.Entry<? extends K, ? extends V>>, C03W4 {
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
    public final Object next() {
        C13CA<K, V> c13ca = this.LL;
        return new C11U4(c13ca.LL, c13ca.next().LIZ);
    }

    public C13C9(C13C4<K, V> c13c4) {
        this.LL = new C13CA<>(c13c4.LLILLJJLI, c13c4.LLILZ);
    }
}
