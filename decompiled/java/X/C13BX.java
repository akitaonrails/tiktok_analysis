package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.13BX, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13BX<T> implements Iterator<T>, C03W4 {
    public final Iterator<T> LL;
    public int LLILLJJLI = -1;
    public T LLILLL;
    public final /* synthetic */ C13BY<T> LLILZ;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void LIZ() {
        if (this.LL.hasNext()) {
            T next = this.LL.next();
            if (this.LLILZ.LIZIZ.invoke(next).booleanValue()) {
                this.LLILLJJLI = 1;
                this.LLILLL = next;
                return;
            }
        }
        this.LLILLJJLI = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.LLILLJJLI == -1) {
            LIZ();
        }
        return this.LLILLJJLI == 1;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (this.LLILLJJLI == -1) {
            LIZ();
        }
        if (this.LLILLJJLI == 0) {
            throw new NoSuchElementException();
        }
        T t = this.LLILLL;
        this.LLILLL = null;
        this.LLILLJJLI = -1;
        return t;
    }

    public C13BX(C13BY<T> c13by) {
        this.LLILZ = c13by;
        this.LL = c13by.LIZ.iterator();
    }
}
