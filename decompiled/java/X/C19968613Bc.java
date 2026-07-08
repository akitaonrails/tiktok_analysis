package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.13Bc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19968613Bc<E> implements Iterator<E>, C03W4 {
    public Object LL;
    public final Map<E, C19972313Cn> LLILLJJLI;
    public int LLILLL;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LLILLL < this.LLILLJJLI.size();
    }

    @Override // java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E e = (E) this.LL;
        this.LLILLL++;
        C19972313Cn c19972313Cn = this.LLILLJJLI.get(e);
        if (c19972313Cn != null) {
            this.LL = c19972313Cn.LIZIZ;
            return e;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Hash code of an element (");
        sbLIZ.append(e);
        sbLIZ.append(") has changed after it was added to the persistent set.");
        throw new ConcurrentModificationException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C19968613Bc(Object obj, C19971313Cd c19971313Cd) {
        this.LL = obj;
        this.LLILLJJLI = c19971313Cd;
    }
}
