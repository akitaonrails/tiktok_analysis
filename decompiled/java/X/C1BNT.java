package X;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: X.1BNT, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BNT {
    public C1BNV[] LIZ = new C1BNV[8192];
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    public final void LIZ(int i) {
        int iLIZIZ;
        if (i >= this.LIZLLL) {
            iLIZIZ = this.LIZJ;
        } else {
            iLIZIZ = LIZIZ(i);
        }
        if (iLIZIZ < 0) {
            return;
        }
        int i2 = this.LIZIZ;
        int i3 = i2 + iLIZIZ;
        C1BNV[] c1bnvArr = this.LIZ;
        if (i3 < c1bnvArr.length) {
            Arrays.fill(c1bnvArr, i2, i3, (Object) null);
            this.LIZIZ += iLIZIZ;
        } else {
            int length = iLIZIZ - (c1bnvArr.length - i2);
            Arrays.fill(c1bnvArr, i2, c1bnvArr.length, (Object) null);
            Arrays.fill(this.LIZ, 0, length, (Object) null);
            this.LIZIZ = length;
        }
        this.LIZJ -= iLIZIZ;
    }

    public final int LIZIZ(int i) {
        int i2 = this.LIZJ - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            int i5 = this.LIZIZ + i4;
            C1BNV[] c1bnvArr = this.LIZ;
            C1BNV c1bnv = c1bnvArr[i5 % c1bnvArr.length];
            int i6 = c1bnv.LIZIZ;
            if (i < i6) {
                i2 = i4 - 1;
            } else if (i >= i6 + c1bnv.LIZJ) {
                i3 = i4 + 1;
            } else {
                return i4;
            }
        }
        return -1;
    }

    public final C1BNU LIZJ(int i) throws IOException {
        C1BNV c1bnv = this.LIZ[this.LIZIZ];
        if (c1bnv != null ? i >= c1bnv.LIZIZ : i >= this.LIZLLL) {
            return new C1BNU(this, i);
        }
        throw new IOException("Attempt to read the cache which has been cleared; Only clear the cache when it will not be read anymore!");
    }

    public final void LIZLLL(int i, byte[] bArr) {
        int i2 = this.LIZJ;
        C1BNV[] c1bnvArr = this.LIZ;
        if (i2 >= c1bnvArr.length) {
            C1BNV[] c1bnvArr2 = new C1BNV[c1bnvArr.length * 2];
            int i3 = this.LIZIZ;
            System.arraycopy(c1bnvArr, i3, c1bnvArr2, 0, c1bnvArr.length - i3);
            C1BNV[] c1bnvArr3 = this.LIZ;
            int length = c1bnvArr3.length;
            int i4 = this.LIZIZ;
            System.arraycopy(c1bnvArr3, 0, c1bnvArr2, length - i4, i4);
            this.LIZ = c1bnvArr2;
            this.LIZIZ = 0;
        }
        int i5 = this.LIZIZ;
        int i6 = this.LIZJ;
        C1BNV[] c1bnvArr4 = this.LIZ;
        int length2 = (i5 + i6) % c1bnvArr4.length;
        int i7 = this.LIZLLL;
        c1bnvArr4[length2] = new C1BNV(bArr, i7, i);
        this.LIZLLL = i7 + i;
        this.LIZJ = i6 + 1;
    }
}
