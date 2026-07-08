package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.12qu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19883412qu<E> implements Iterator<E> {
    public final InterfaceC19883512qv LL;
    public final Iterator<E> LLILLJJLI;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LLILLJJLI.hasNext();
    }

    public final int hashCode() {
        return this.LLILLJJLI.hashCode();
    }

    @Override // java.util.Iterator
    public final E next() {
        return this.LLILLJJLI.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        ((C19915712w7) this.LL).LIZIZ();
        this.LLILLJJLI.remove();
    }

    public final String toString() {
        return this.LLILLJJLI.toString();
    }

    public final boolean equals(Object obj) {
        return this.LLILLJJLI.equals(obj);
    }

    public C19883412qu(InterfaceC19883512qv interfaceC19883512qv, Iterator<E> it2) {
        this.LL = interfaceC19883512qv;
        this.LLILLJJLI = it2;
    }
}
