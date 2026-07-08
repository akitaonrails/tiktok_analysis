package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.19kf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21628319kf {
    public final CharSequence LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final byte[] LIZLLL;

    public C21628319kf(int i, int i2, CharSequence charSequence) {
        this.LIZ = charSequence;
        this.LIZJ = i;
        this.LIZIZ = i2;
        byte[] bArr = new byte[i * i2];
        this.LIZLLL = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    public final void LIZIZ(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        LIZ(i4, i5, i3, 1);
        int i6 = i2 - 1;
        LIZ(i4, i6, i3, 2);
        int i7 = i - 1;
        LIZ(i7, i5, i3, 3);
        LIZ(i7, i6, i3, 4);
        LIZ(i7, i2, i3, 5);
        LIZ(i, i5, i3, 6);
        LIZ(i, i6, i3, 7);
        LIZ(i, i2, i3, 8);
    }

    public final void LIZ(int i, int i2, int i3, int i4) {
        if (i < 0) {
            int i5 = this.LIZIZ;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        if (i2 < 0) {
            int i6 = this.LIZJ;
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        int i7 = 1;
        if ((this.LIZ.charAt(i3) & (1 << (8 - i4))) == 0) {
            i7 = 0;
        }
        this.LIZLLL[(i * this.LIZJ) + i2] = (byte) i7;
    }
}
