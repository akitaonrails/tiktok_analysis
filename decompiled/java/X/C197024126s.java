package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: renamed from: X.126s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C197024126s<E> implements Iterator<E>, C03W4 {
    public final Iterator<T> LL;
    public Iterator<? extends E> LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C197025126t<T, R, E> LLILZ;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final boolean LIZ() {
        Iterator<? extends E> it2 = this.LLILLJJLI;
        if (it2 != null && it2.hasNext()) {
            this.LLILLL = 1;
            return true;
        }
        while (this.LL.hasNext()) {
            Object next = this.LL.next();
            C197025126t<T, R, E> c197025126t = this.LLILZ;
            Iterator<? extends E> it3 = (Iterator) c197025126t.LIZJ.invoke((R) c197025126t.LIZIZ.invoke((T) next));
            if (it3.hasNext()) {
                this.LLILLJJLI = it3;
                this.LLILLL = 1;
                return true;
            }
        }
        this.LLILLL = 2;
        this.LLILLJJLI = null;
        return false;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.LLILLL;
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        return LIZ();
    }

    @Override // java.util.Iterator
    public final E next() {
        int i = this.LLILLL;
        if (i == 2) {
            throw new NoSuchElementException();
        }
        if (i == 0 && !LIZ()) {
            throw new NoSuchElementException();
        }
        this.LLILLL = 0;
        return this.LLILLJJLI.next();
    }

    public C197024126s(C197025126t<T, R, E> c197025126t) {
        this.LLILZ = c197025126t;
        this.LL = c197025126t.LIZ.iterator();
    }
}
