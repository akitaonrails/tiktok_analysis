package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.13BJ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13BJ implements Iterator<C19969613Bm>, C03W4 {
    public final byte[] LL;
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
    public final C19969613Bm next() {
        int i = this.LLILLJJLI;
        byte[] bArr = this.LL;
        if (i >= bArr.length) {
            throw new NoSuchElementException(String.valueOf(this.LLILLJJLI));
        }
        this.LLILLJJLI = i + 1;
        return new C19969613Bm(bArr[i]);
    }

    public C13BJ(byte[] bArr) {
        this.LL = bArr;
    }
}
