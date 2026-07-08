package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.13BM, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13BM implements Iterator<C19969813Bo>, C03W4 {
    public final long[] LL;
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
    public final C19969813Bo next() {
        int i = this.LLILLJJLI;
        long[] jArr = this.LL;
        if (i >= jArr.length) {
            throw new NoSuchElementException(String.valueOf(this.LLILLJJLI));
        }
        this.LLILLJJLI = i + 1;
        return new C19969813Bo(jArr[i]);
    }

    public C13BM(long[] jArr) {
        this.LL = jArr;
    }
}
