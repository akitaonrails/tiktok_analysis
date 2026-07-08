package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.13CA, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13CA<K, V> implements Iterator<C13CR<V>>, C03W4 {
    public Object LL;
    public final Map<K, C13CR<V>> LLILLJJLI;
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
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final C13CR<V> next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C13CR<V> c13cr = this.LLILLJJLI.get(this.LL);
        if (c13cr != null) {
            C13CR<V> c13cr2 = c13cr;
            this.LLILLL++;
            this.LL = c13cr2.LIZJ;
            return c13cr2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Hash code of a key (");
        sbLIZ.append(this.LL);
        sbLIZ.append(") has changed after it was added to the persistent map.");
        throw new ConcurrentModificationException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C13CA(Object obj, C13C5 c13c5) {
        this.LL = obj;
        this.LLILLJJLI = c13c5;
    }
}
