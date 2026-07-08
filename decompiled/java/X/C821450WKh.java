package X;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: X.0WKh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C821450WKh {
    public static void LIZIZ(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
        } else {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static Pair LIZ(RandomAccessFile randomAccessFile, int i) throws IOException {
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - ((long) byteBufferAllocate.capacity());
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        LIZIZ(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity >= 22) {
            int i2 = iCapacity - 22;
            int iMin = Math.min(i2, 65535);
            int i3 = 0;
            while (true) {
                if (i3 >= iMin) {
                    break;
                }
                int i4 = i2 - i3;
                if (byteBufferAllocate.getInt(i4) == 101010256 && ((char) byteBufferAllocate.getShort(i4 + 20)) == i3) {
                    if (i4 != -1) {
                        byteBufferAllocate.position(i4);
                        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
                        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
                        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + ((long) i4)));
                    }
                } else {
                    i3++;
                }
            }
        }
        return null;
    }
}
