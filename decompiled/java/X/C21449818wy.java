package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.18wy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21449818wy implements Iterator<C21450018x0> {
    public int LL;
    public final /* synthetic */ C21449918wz LLILLJJLI;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LL < this.LLILLJJLI.LL;
    }

    @Override // java.util.Iterator
    public final C21450018x0 next() {
        C21449918wz c21449918wz = this.LLILLJJLI;
        String[] strArr = c21449918wz.LLILLL;
        int i = this.LL;
        String str = strArr[i];
        String str2 = c21449918wz.LLILLJJLI[i];
        if (str == null) {
            str = "";
        }
        C21450018x0 c21450018x0 = new C21450018x0(str2, str, c21449918wz);
        this.LL++;
        return c21450018x0;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C21449918wz c21449918wz = this.LLILLJJLI;
        int i = this.LL - 1;
        this.LL = i;
        int i2 = c21449918wz.LL;
        if (i >= i2) {
            throw new IllegalArgumentException("Must be false");
        }
        int i3 = (i2 - i) - 1;
        if (i3 > 0) {
            String[] strArr = c21449918wz.LLILLJJLI;
            int i4 = i + 1;
            System.arraycopy(strArr, i4, strArr, i, i3);
            String[] strArr2 = c21449918wz.LLILLL;
            System.arraycopy(strArr2, i4, strArr2, i, i3);
        }
        int i5 = c21449918wz.LL - 1;
        c21449918wz.LL = i5;
        c21449918wz.LLILLJJLI[i5] = null;
        c21449918wz.LLILLL[i5] = null;
    }

    public C21449818wy(C21449918wz c21449918wz) {
        this.LLILLJJLI = c21449918wz;
    }
}
