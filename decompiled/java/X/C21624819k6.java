package X;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: X.19k6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21624819k6 {
    public final C21625119k9[] LIZ;
    public int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final C21625119k9 LIZ() {
        return this.LIZ[this.LIZIZ];
    }

    public C21624819k6(int i, int i2) {
        C21625119k9[] c21625119k9Arr = new C21625119k9[i];
        this.LIZ = c21625119k9Arr;
        int length = c21625119k9Arr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.LIZ[i3] = new C21625119k9(((i2 + 4) * 17) + 1);
        }
        this.LIZLLL = i2 * 17;
        this.LIZJ = i;
        this.LIZIZ = -1;
    }

    public final byte[][] LIZIZ(int i, int i2) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.LIZJ * i2, this.LIZLLL * i);
        int i3 = this.LIZJ * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = (i3 - i4) - 1;
            C21625119k9 c21625119k9 = this.LIZ[i4 / i2];
            int length = c21625119k9.LIZ.length * i;
            byte[] bArr2 = new byte[length];
            for (int i6 = 0; i6 < length; i6++) {
                bArr2[i6] = c21625119k9.LIZ[i6 / i];
            }
            bArr[i5] = bArr2;
        }
        return bArr;
    }
}
