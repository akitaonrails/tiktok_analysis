package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.19je, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21622019je implements Cloneable {
    public int[] LL;
    public int LLILLJJLI;

    public final Object clone() {
        return new C21622019je((int[]) this.LL.clone(), this.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LLILLJJLI * 31) + Arrays.hashCode(this.LL);
    }

    public final String toString() {
        int i = this.LLILLJJLI;
        StringBuilder sb = new StringBuilder(i + (i / 8) + 1);
        for (int i2 = 0; i2 < this.LLILLJJLI; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(LIZLLL(i2) ? 'X' : '.');
        }
        return sb.toString();
    }

    public C21622019je() {
        this.LL = new int[1];
    }

    public final void LIZ(boolean z) {
        LIZJ(this.LLILLJJLI + 1);
        if (z) {
            int[] iArr = this.LL;
            int i = this.LLILLJJLI;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.LLILLJJLI++;
    }

    public final void LIZJ(int i) {
        int[] iArr = this.LL;
        if (i > (iArr.length << 5)) {
            int[] iArr2 = new int[(i + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.LL = iArr2;
        }
    }

    public final boolean LIZLLL(int i) {
        if (((1 << (i & 31)) & this.LL[i / 32]) != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21622019je)) {
            return false;
        }
        C21622019je c21622019je = (C21622019je) obj;
        if (this.LLILLJJLI != c21622019je.LLILLJJLI || !Arrays.equals(this.LL, c21622019je.LL)) {
            return false;
        }
        return true;
    }

    public C21622019je(int[] iArr, int i) {
        this.LL = iArr;
        this.LLILLJJLI = i;
    }

    public final void LIZIZ(int i, int i2) {
        if (i2 >= 0 && i2 <= 32) {
            LIZJ(this.LLILLJJLI + i2);
            while (i2 > 0) {
                boolean z = true;
                if (((i >> (i2 - 1)) & 1) != 1) {
                    z = false;
                }
                LIZ(z);
                i2--;
            }
            return;
        }
        throw new IllegalArgumentException("Num bits must be between 0 and 32");
    }
}
