package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.13LL, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13LL<T> implements Iterator<T>, C03W4 {
    public T LL;
    public int LLILLJJLI = -2;
    public final /* synthetic */ C13LM<T> LLILLL;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void LIZ() {
        T tInvoke = this.LLILLJJLI == -2 ? this.LLILLL.LIZ.invoke() : this.LLILLL.LIZIZ.invoke(this.LL);
        this.LL = tInvoke;
        this.LLILLJJLI = tInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.LLILLJJLI < 0) {
            LIZ();
        }
        return this.LLILLJJLI == 1;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (this.LLILLJJLI < 0) {
            LIZ();
        }
        if (this.LLILLJJLI == 0) {
            throw new NoSuchElementException();
        }
        T t = this.LL;
        this.LLILLJJLI = -1;
        return t;
    }

    public C13LL(C13LM<T> c13lm) {
        this.LLILLL = c13lm;
    }
}
