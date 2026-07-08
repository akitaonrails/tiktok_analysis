package X;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [K] */
/* JADX INFO: renamed from: X.11UB, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11UB<K> implements Iterator<K>, C03W4 {
    public final /* synthetic */ Iterator<Map.Entry<K, V>> LL;

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
        return (K) ((Map.Entry) this.LL.next()).getKey();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11UB(Iterator<? extends Map.Entry<? extends K, ? extends V>> it2) {
        this.LL = it2;
    }
}
