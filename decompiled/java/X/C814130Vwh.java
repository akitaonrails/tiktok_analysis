package X;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* JADX INFO: renamed from: X.0Vwh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C814130Vwh {
    public static byte[] LIZIZ(C818820WAe c818820WAe) throws IOException {
        int i;
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i2 = 0;
        while (i2 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i2);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < iMin2) {
                int i4 = c818820WAe.read(bArr, i3, iMin2 - i3);
                if (i4 == -1) {
                    return LIZ(arrayDeque, i2);
                }
                i3 += i4;
                i2 += i4;
            }
            long j = iMin;
            if (iMin < 4096) {
                i = 4;
            } else {
                i = 2;
            }
            long j2 = j * ((long) i);
            if (j2 > 2147483647L) {
                iMin = Integer.MAX_VALUE;
            } else if (j2 < -2147483648L) {
                iMin = Integer.MIN_VALUE;
            } else {
                iMin = (int) j2;
            }
        }
        if (c818820WAe.read() == -1) {
            return LIZ(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static byte[] LIZ(Queue<byte[]> queue, int i) {
        ArrayDeque arrayDeque = (ArrayDeque) queue;
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }
}
