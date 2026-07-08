package X;

import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0Cdy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C318400Cdy {
    public static byte[] LIZ(String str) {
        if (str == null) {
            return null;
        }
        return str.getBytes(Charsets.UTF_8);
    }

    public static int LIZIZ(byte[] bArr) {
        int i = 0;
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i2 = length >> 2;
        int iRotateLeft = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 << 2;
            iRotateLeft = (Integer.rotateLeft(iRotateLeft ^ (Integer.rotateLeft((((bArr[i4 + 3] & 255) << 24) | (((bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8)) | ((bArr[i4 + 2] & 255) << 16))) * (-862048943), 15) * 461845907), 13) * 5) - 430675100;
        }
        int i5 = i2 << 2;
        int i6 = length - i5;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 == 3) {
                    i = 0 ^ ((bArr[i5 + 2] & 255) << 16);
                }
            }
            i ^= (bArr[i5 + 1] & 255) << 8;
            iRotateLeft ^= Integer.rotateLeft(((bArr[i5] & 255) ^ i) * (-862048943), 15) * 461845907;
        } else {
            iRotateLeft ^= Integer.rotateLeft(((bArr[i5] & 255) ^ i) * (-862048943), 15) * 461845907;
        }
        int i7 = iRotateLeft ^ length;
        int i8 = (i7 ^ (i7 >>> 16)) * (-2048144789);
        int i9 = (i8 ^ (i8 >>> 13)) * (-1028477387);
        return i9 ^ (i9 >>> 16);
    }
}
