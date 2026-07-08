package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.19jd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21621919jd implements Cloneable {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int[] LLILZ;

    public final Object clone() {
        return new C21621919jd(this.LL, this.LLILLJJLI, this.LLILLL, (int[]) this.LLILZ.clone());
    }

    public final int hashCode() {
        int i = this.LL;
        return (((((((i * 31) + i) * 31) + this.LLILLJJLI) * 31) + this.LLILLL) * 31) + Arrays.hashCode(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.LLILLJJLI * (this.LL + 1));
        for (int i = 0; i < this.LLILLJJLI; i++) {
            for (int i2 = 0; i2 < this.LL; i2++) {
                sb.append(LIZ(i2, i) ? "X " : "  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21621919jd)) {
            return false;
        }
        C21621919jd c21621919jd = (C21621919jd) obj;
        if (this.LL != c21621919jd.LL || this.LLILLJJLI != c21621919jd.LLILLJJLI || this.LLILLL != c21621919jd.LLILLL || !Arrays.equals(this.LLILZ, c21621919jd.LLILZ)) {
            return false;
        }
        return true;
    }

    public C21621919jd(int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.LL = i;
            this.LLILLJJLI = i2;
            int i3 = (i + 31) / 32;
            this.LLILLL = i3;
            this.LLILZ = new int[i3 * i2];
            return;
        }
        throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }

    public final boolean LIZ(int i, int i2) {
        if (((this.LLILZ[(i2 * this.LLILLL) + (i / 32)] >>> (i & 31)) & 1) != 0) {
            return true;
        }
        return false;
    }

    public final void LIZIZ(int i, int i2) {
        int i3 = (i2 * this.LLILLL) + (i / 32);
        int[] iArr = this.LLILZ;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public C21621919jd(int i, int i2, int i3, int[] iArr) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = iArr;
    }

    public final void LIZJ(int i, int i2, int i3, int i4) {
        if (i2 >= 0 && i >= 0) {
            if (i4 > 0 && i3 > 0) {
                int i5 = i3 + i;
                int i6 = i4 + i2;
                if (i6 <= this.LLILLJJLI && i5 <= this.LL) {
                    while (i2 < i6) {
                        int i7 = this.LLILLL * i2;
                        for (int i8 = i; i8 < i5; i8++) {
                            int[] iArr = this.LLILZ;
                            int i9 = (i8 / 32) + i7;
                            iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                        }
                        i2++;
                    }
                    return;
                }
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        throw new IllegalArgumentException("Left and top must be nonnegative");
    }
}
