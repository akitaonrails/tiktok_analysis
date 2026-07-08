package X;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V] */
/* JADX INFO: renamed from: X.11UC, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11UC<V> implements Iterator<V>, C03W4 {
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
    public final V next() {
        return (V) ((Map.Entry) this.LL.next()).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11UC(Iterator<? extends Map.Entry<? extends K, ? extends V>> it2) {
        this.LL = it2;
    }
}
