package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.13CC, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13CC<K, V> implements Iterator<C13CR<V>>, C03W4 {
    public Object LL;
    public final C13CE<K, V> LLILLJJLI;
    public Object LLILLL = C13C3.LIZ;
    public boolean LLILZ;
    public int LLILZIL;
    public int LLILZLL;

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final C13CR<V> next() {
        if (this.LLILLJJLI.LLILZ.LLILZIL != this.LLILZIL) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = this.LL;
        this.LLILLL = obj;
        this.LLILZ = true;
        this.LLILZLL++;
        C13CR<V> c13cr = this.LLILLJJLI.LLILZ.get(obj);
        if (c13cr != null) {
            C13CR<V> c13cr2 = c13cr;
            this.LL = c13cr2.LIZJ;
            return c13cr2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Hash code of a key (");
        sbLIZ.append(this.LL);
        sbLIZ.append(") has changed after it was added to the persistent map.");
        throw new ConcurrentModificationException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LLILZLL < this.LLILLJJLI.LIZJ();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.LLILZ) {
            throw new IllegalStateException();
        }
        this.LLILLJJLI.remove(this.LLILLL);
        this.LLILLL = null;
        this.LLILZ = false;
        this.LLILZIL = this.LLILLJJLI.LLILZ.LLILZIL;
        this.LLILZLL--;
    }

    public C13CC(Object obj, C13CE<K, V> c13ce) {
        this.LL = obj;
        this.LLILLJJLI = c13ce;
        this.LLILZIL = c13ce.LLILZ.LLILZIL;
    }
}
