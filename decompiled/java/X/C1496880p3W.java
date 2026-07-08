package X;

import com.ttnet.org.chromium.net.urlconnection.Segment;

/* JADX INFO: renamed from: X.0p3W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1496880p3W {
    public Segment LIZ;
    public int LIZIZ;

    public static void LIZ(long j, long j2, long j3) {
        if ((j2 | j3) >= 0 && j2 <= j && j - j2 >= j3) {
        } else {
            throw new ArrayIndexOutOfBoundsException(C786410Ut5.j4("size=%s offset=%s byteCount=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)}));
        }
    }

    public final int LIZIZ(byte[] bArr, int i, int i2) {
        LIZ(bArr.length, i, i2);
        Segment segment = this.LIZ;
        if (segment == null) {
            return -1;
        }
        int innerBufferTo = segment.getInnerBufferTo(bArr, i, i2);
        if (C1496600p34.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("head curReadLength is ");
            sbLIZ.append(innerBufferTo);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        this.LIZIZ -= innerBufferTo;
        if (!segment.getInnerBuffer().hasRemaining()) {
            this.LIZ = segment.release();
        }
        return innerBufferTo;
    }
}
