package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.0uFw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1696780uFw implements Iterator<AbstractC1696860uG4>, C03W4 {
    public final Iterator<AbstractC1696860uG4> LL;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LL.hasNext();
    }

    @Override // java.util.Iterator
    public final AbstractC1696860uG4 next() {
        return this.LL.next();
    }

    public C1696780uFw(C1696760uFu c1696760uFu) {
        this.LL = c1696760uFu.LLJI.iterator();
    }
}
