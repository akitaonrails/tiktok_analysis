package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.13B5, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13B5 implements Iterator<C1507270pKH>, C03W4 {
    public final short[] LL;
    public int LLILLJJLI;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LLILLJJLI < this.LL.length;
    }

    @Override // java.util.Iterator
    public final C1507270pKH next() {
        int i = this.LLILLJJLI;
        short[] sArr = this.LL;
        if (i >= sArr.length) {
            throw new NoSuchElementException(String.valueOf(this.LLILLJJLI));
        }
        this.LLILLJJLI = i + 1;
        return new C1507270pKH(sArr[i]);
    }

    public C13B5(short[] sArr) {
        this.LL = sArr;
    }
}
