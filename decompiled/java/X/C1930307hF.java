package X;

import com.google.gson.k;
import java.util.Iterator;

/* JADX INFO: renamed from: X.07hF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1930307hF implements Iterator<Object>, C03W4 {
    public final Iterator<k> LL;

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
        k next = this.LL.next();
        if (next != null) {
            return C1931407hQ.LIZ(next);
        }
        return null;
    }

    public C1930307hF(C1934307ht c1934307ht) {
        this.LL = c1934307ht.LL.iterator();
    }
}
