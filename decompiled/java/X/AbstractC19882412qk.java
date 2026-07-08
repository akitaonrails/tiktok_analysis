package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.12qk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19882412qk<F, T> implements Iterator<T> {
    public final Iterator<? extends F> LL;

    public abstract T LIZ(F f);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LL.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return LIZ(this.LL.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.LL.remove();
    }

    public AbstractC19882412qk(Iterator<? extends F> it2) {
        it2.getClass();
        this.LL = it2;
    }
}
