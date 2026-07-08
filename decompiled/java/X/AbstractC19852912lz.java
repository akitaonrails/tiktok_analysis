package X;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.12lz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19852912lz<T> extends AbstractC19853312m3<T> {
    public EnumC19852812ly LL = EnumC19852812ly.NOT_READY;
    public T LLILLJJLI;

    public abstract T LIZ();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        EnumC19852812ly enumC19852812ly = this.LL;
        EnumC19852812ly enumC19852812ly2 = EnumC19852812ly.FAILED;
        C19864312np.LJIILJJIL(enumC19852812ly != enumC19852812ly2);
        int iOrdinal = this.LL.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 2) {
            return false;
        }
        this.LL = enumC19852812ly2;
        this.LLILLJJLI = LIZ();
        if (this.LL == EnumC19852812ly.DONE) {
            return false;
        }
        this.LL = EnumC19852812ly.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.LL = EnumC19852812ly.NOT_READY;
        T t = this.LLILLJJLI;
        this.LLILLJJLI = null;
        return t;
    }
}
