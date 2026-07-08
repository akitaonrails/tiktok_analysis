package X;

import com.ss.android.ttve.nativePort.p;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.1ALr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2177971ALr extends p {
    public final ByteBuffer LIZ;

    public C2177971ALr(int i) {
        super(new byte[1]);
        this.LIZ = ByteBuffer.allocateDirect(i);
    }

    public final void LIZ(int i) {
        byte[] bArr = new byte[4];
        int i2 = 0;
        do {
            bArr[i2] = (byte) ((i >> (i2 * 8)) & 255);
            i2++;
        } while (i2 < 4);
        this.LIZ.put(bArr);
    }
}
