package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.13Bd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19968713Bd<E> implements Iterator<E>, C03W4 {
    public Object LL;
    public final Map<E, C13C1> LLILLJJLI;
    public int LLILLL;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LLILLL < this.LLILLJJLI.size();
    }

    @Override // java.util.Iterator
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E e = (E) this.LL;
        this.LLILLL++;
        C13C1 c13c1 = this.LLILLJJLI.get(e);
        if (c13c1 != null) {
            this.LL = c13c1.LIZIZ;
            return e;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Hash code of an element (");
        sbLIZ.append(e);
        sbLIZ.append(") has changed after it was added to the persistent set.");
        throw new ConcurrentModificationException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C19968713Bd(Object obj, Map<E, C13C1> map) {
        this.LL = obj;
        this.LLILLJJLI = map;
    }
}
