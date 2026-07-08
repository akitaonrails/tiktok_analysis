package X;

import java.util.Iterator;
import kotlin.collections.IndexedValue;

/* JADX INFO: renamed from: X.0SCx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C717610SCx<T> implements Iterator<IndexedValue<? extends T>>, C03W4 {
    public final Iterator<T> LL;
    public int LLILLJJLI;

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
        int i = this.LLILLJJLI;
        this.LLILLJJLI = i + 1;
        if (i >= 0) {
            return new IndexedValue(i, this.LL.next());
        }
        C1697810uHb.LJIJI();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C717610SCx(Iterator<? extends T> it2) {
        this.LL = it2;
    }
}
