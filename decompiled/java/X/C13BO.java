package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.13BO, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13BO implements Iterator<C1507240pKE>, C03W4 {
    public final int[] LL;
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
    public final C1507240pKE next() {
        int i = this.LLILLJJLI;
        int[] iArr = this.LL;
        if (i >= iArr.length) {
            throw new NoSuchElementException(String.valueOf(this.LLILLJJLI));
        }
        this.LLILLJJLI = i + 1;
        return new C1507240pKE(iArr[i]);
    }

    public C13BO(int[] iArr) {
        this.LL = iArr;
    }
}
