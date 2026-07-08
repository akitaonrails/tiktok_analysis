package X;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.12xo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19926212xo<K> implements Iterator<Map.Entry<K, Object>> {
    public final Iterator<Map.Entry<K, Object>> LL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LL.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry<K, Object> next = this.LL.next();
        return next.getValue() instanceof C19926112xn ? new C19926012xm(next) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.LL.remove();
    }

    public C19926212xo(Iterator<Map.Entry<K, Object>> it2) {
        this.LL = it2;
    }
}
