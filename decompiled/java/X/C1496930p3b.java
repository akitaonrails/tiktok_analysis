package X;

import kotlin.text.Charsets;
import okio.ByteString;

/* JADX INFO: renamed from: X.0p3b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1496930p3b {
    public static final byte[] LIZ;
    public static final byte[] LIZIZ;

    static {
        ByteString.Companion.getClass();
        LIZ = C1496910p3Z.LIZ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData$jvm();
        LIZIZ = C1496910p3Z.LIZ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData$jvm();
    }

    public static final String LIZ(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b = bArr[i];
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            i = i4 + 1;
            byte b3 = bArr[i4];
            int i5 = i2 + 1;
            bArr3[i2] = bArr2[(b & 255) >> 2];
            int i6 = i5 + 1;
            bArr3[i5] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i7 = i6 + 1;
            bArr3[i6] = bArr2[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 = i7 + 1;
            bArr3[i7] = bArr2[b3 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                byte b4 = bArr[i];
                byte b5 = bArr[i + 1];
                int i8 = i2 + 1;
                bArr3[i2] = bArr2[(b4 & 255) >> 2];
                int i9 = i8 + 1;
                bArr3[i8] = bArr2[((b4 & 3) << 4) | ((b5 & 255) >> 4)];
                bArr3[i9] = bArr2[(b5 & 15) << 2];
                bArr3[i9 + 1] = (byte) 61;
            }
        } else {
            byte b6 = bArr[i];
            int i10 = i2 + 1;
            bArr3[i2] = bArr2[(b6 & 255) >> 2];
            int i11 = i10 + 1;
            bArr3[i10] = bArr2[(b6 & 3) << 4];
            byte b7 = (byte) 61;
            bArr3[i11] = b7;
            bArr3[i11 + 1] = b7;
        }
        return new String(bArr3, Charsets.UTF_8);
    }
}
