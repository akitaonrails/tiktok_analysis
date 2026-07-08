package X;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.0Kt9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C531650Kt9 extends AbstractC2098408Jy {
    public final int LL;
    public final int LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;

    @Override // X.AbstractC2098408Jy
    public final int nextInt() {
        int i = this.LLILZ;
        if (i != this.LLILLJJLI) {
            this.LLILZ = this.LL + i;
            return i;
        }
        if (!this.LLILLL) {
            throw new NoSuchElementException();
        }
        this.LLILLL = false;
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LLILLL;
    }

    public C531650Kt9(int i, int i2, int i3) {
        this.LL = i3;
        this.LLILLJJLI = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.LLILLL = z;
        this.LLILZ = z ? i : i2;
    }
}
