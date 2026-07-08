package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.13Zb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20030913Zb implements Iterator<Object>, C03W4 {
    public final C13ZI LL;
    public final int LLILLJJLI;
    public int LLILLL;
    public final int LLILZ;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LLILLL < this.LLILLJJLI;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.LL.LLIZLLLIL != this.LLILZ) {
            C13ZA.LJFF();
        }
        int i = this.LLILLL;
        this.LLILLL = C13ZA.LIZ(i, this.LL.LL) + i;
        return new C13ZQ(i, this.LLILZ, this.LL);
    }

    public C20030913Zb(int i, int i2, C13ZI c13zi) {
        this.LL = c13zi;
        this.LLILLJJLI = i2;
        this.LLILLL = i;
        this.LLILZ = c13zi.LLIZLLLIL;
        if (c13zi.LLIZ) {
            C13ZA.LJFF();
        }
    }
}
