package X;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.13CD, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13CD<K, V> implements Iterator<Map.Entry<K, V>>, C03W4 {
    public final C13CC<K, V> LL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LL.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        C13CR<V> next = this.LL.next();
        C13CC<K, V> c13cc = this.LL;
        return new C13CL(c13cc.LLILLJJLI.LLILZ, c13cc.LLILLL, next);
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.LL.remove();
    }

    public C13CD(C13CE<K, V> c13ce) {
        this.LL = new C13CC<>(c13ce.LLILLJJLI, c13ce);
    }
}
