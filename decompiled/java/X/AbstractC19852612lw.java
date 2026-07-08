package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.12lw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19852612lw<T> implements Iterator<T> {
    public EnumC19852712lx LL = EnumC19852712lx.NOT_READY;
    public T LLILLJJLI;

    public abstract T LIZ();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        EnumC19852712lx enumC19852712lx = this.LL;
        EnumC19852712lx enumC19852712lx2 = EnumC19852712lx.FAILED;
        C19864312np.LJIILJJIL(enumC19852712lx != enumC19852712lx2);
        int iOrdinal = this.LL.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 2) {
            return false;
        }
        this.LL = enumC19852712lx2;
        this.LLILLJJLI = LIZ();
        if (this.LL == EnumC19852712lx.DONE) {
            return false;
        }
        this.LL = EnumC19852712lx.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.LL = EnumC19852712lx.NOT_READY;
        T t = this.LLILLJJLI;
        this.LLILLJJLI = null;
        return t;
    }
}
