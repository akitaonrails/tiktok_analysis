package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: X.089Q, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C089Q {
    public static final byte[] LIZ = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    public static final byte[] LIZIZ = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    public static final byte[] LIZJ = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

    public static String LIZIZ(byte[] bArr, int i) {
        if (bArr != null) {
            if (i >= 0) {
                if (i <= bArr.length) {
                    int i2 = 4;
                    int i3 = (i / 3) * 4;
                    if (i % 3 <= 0) {
                        i2 = 0;
                    }
                    int i4 = i3 + i2;
                    byte[] bArr2 = new byte[i4];
                    int i5 = i - 2;
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < i5) {
                        LIZ(bArr, i6, 3, bArr2, i7, 0);
                        i6 += 3;
                        i7 += 4;
                    }
                    if (i6 < i) {
                        LIZ(bArr, i6, i - i6, bArr2, i7, 0);
                        i7 += 4;
                    }
                    if (i7 <= i4 - 1) {
                        byte[] bArr3 = new byte[i7];
                        System.arraycopy(bArr2, 0, bArr3, 0, i7);
                        bArr2 = bArr3;
                    }
                    try {
                        return new String(bArr2, "US-ASCII");
                    } catch (UnsupportedEncodingException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return new String(bArr2);
                    }
                }
                throw new IllegalArgumentException(C786410Ut5.j4("Cannot have offset of %d and length of %d with array of length %d", new Object[]{0, Integer.valueOf(i), Integer.valueOf(bArr.length)}));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Cannot have length offset: ");
            sbLIZ.append(i);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        throw new IllegalArgumentException("Cannot serialize a null array.");
    }

    public static void LIZ(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        byte[] bArr3;
        int i5;
        if ((i4 & 16) == 16) {
            bArr3 = LIZIZ;
        } else if ((i4 & 32) == 32) {
            bArr3 = LIZJ;
        } else {
            bArr3 = LIZ;
        }
        int i6 = 0;
        if (i2 > 0) {
            int i7 = (bArr[i] << 24) >>> 8;
            if (i2 > 1) {
                i5 = (bArr[i + 1] << 24) >>> 16;
            } else {
                i5 = 0;
            }
            int i8 = i5 | i7;
            if (i2 > 2) {
                i6 = (bArr[i + 2] << 24) >>> 24;
            }
            int i9 = i8 | i6;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        bArr2[i3] = bArr3[i9 >>> 18];
                        bArr2[i3 + 1] = bArr3[(i9 >>> 12) & 63];
                        bArr2[i3 + 2] = bArr3[(i9 >>> 6) & 63];
                        bArr2[i3 + 3] = bArr3[i9 & 63];
                        return;
                    }
                    return;
                }
                bArr2[i3] = bArr3[i9 >>> 18];
                bArr2[i3 + 1] = bArr3[(i9 >>> 12) & 63];
                bArr2[i3 + 2] = bArr3[(i9 >>> 6) & 63];
                bArr2[i3 + 3] = 61;
                return;
            }
            bArr2[i3] = bArr3[i9 >>> 18];
            bArr2[i3 + 1] = bArr3[(i9 >>> 12) & 63];
            bArr2[i3 + 2] = 61;
            bArr2[i3 + 3] = 61;
        }
    }
}
