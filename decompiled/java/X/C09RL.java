package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.09RL, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09RL<T> implements Iterator<T>, C03W4 {
    public final Iterator<T> LL;
    public int LLILLJJLI;
    public final /* synthetic */ C09RK<T> LLILLL;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void LIZ() {
        while (this.LLILLJJLI < this.LLILLL.LIZIZ && this.LL.hasNext()) {
            this.LL.next();
            this.LLILLJJLI++;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        LIZ();
        return this.LLILLJJLI < this.LLILLL.LIZJ && this.LL.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        LIZ();
        int i = this.LLILLJJLI;
        if (i >= this.LLILLL.LIZJ) {
            throw new NoSuchElementException();
        }
        this.LLILLJJLI = i + 1;
        return this.LL.next();
    }

    public C09RL(C09RK<T> c09rk) {
        this.LLILLL = c09rk;
        this.LL = c09rk.LIZ.iterator();
    }
}
