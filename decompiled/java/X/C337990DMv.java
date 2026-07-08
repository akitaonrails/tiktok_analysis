package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.0DMv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C337990DMv implements Iterator<AbstractC337970DMt>, C03W4 {
    public AbstractC337970DMt LL;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LL != null;
    }

    @Override // java.util.Iterator
    public final AbstractC337970DMt next() {
        AbstractC337970DMt abstractC337970DMt = this.LL;
        if (abstractC337970DMt == null) {
            throw new NoSuchElementException();
        }
        this.LL = abstractC337970DMt.LL;
        return abstractC337970DMt;
    }

    public C337990DMv(AbstractC337970DMt abstractC337970DMt) {
        this.LL = abstractC337970DMt;
    }
}
