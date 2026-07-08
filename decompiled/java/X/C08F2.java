package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.08F2, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08F2 {
    public static long LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        byte[] bytes = str.getBytes();
        int length = str.length();
        long j = ((long) 131) ^ (((long) length) * (-4132994306676758123L));
        int i = length / 8;
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 8;
            long j2 = 0;
            int i4 = 0;
            do {
                j2 |= ((long) (bytes[i3 + i4] & 255)) << (i4 * 8);
                i4++;
            } while (i4 < 8);
            jArr[i2] = j2;
        }
        for (int i5 = 0; i5 < i; i5++) {
            long j3 = jArr[i5] * (-4132994306676758123L);
            j = (j ^ ((j3 ^ (j3 >>> 47)) * (-4132994306676758123L))) * (-4132994306676758123L);
        }
        int i6 = length % 8;
        byte[] bArr = new byte[i6];
        System.arraycopy(bytes, length - i6, bArr, 0, i6);
        switch (i6) {
            case 7:
                j ^= (((long) bArr[6]) & 255) << 48;
            case 6:
                j ^= (((long) bArr[5]) & 255) << 40;
            case 5:
                j ^= (((long) bArr[4]) & 255) << 32;
            case 4:
                j ^= (((long) bArr[3]) & 255) << 24;
            case 3:
                j ^= (((long) bArr[2]) & 255) << 16;
            case 2:
                j ^= (((long) bArr[1]) & 255) << 8;
            case 1:
                j = ((255 & ((long) bArr[0])) ^ j) * (-4132994306676758123L);
                break;
        }
        long j4 = ((j >>> 47) ^ j) * (-4132994306676758123L);
        return (j4 ^ (j4 >>> 47)) & Long.MAX_VALUE;
    }
}
