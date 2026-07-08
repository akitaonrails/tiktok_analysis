package X;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.12xW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19924412xW extends InputStream {
    public final ByteBuffer LL;

    @Override // java.io.InputStream
    public final int read() {
        if (this.LL.hasRemaining()) {
            return this.LL.get() & 255;
        }
        return -1;
    }

    public C19924412xW(ByteBuffer byteBuffer) {
        this.LL = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (!this.LL.hasRemaining()) {
            return -1;
        }
        int iRemaining = this.LL.remaining();
        if (i2 > iRemaining) {
            i2 = iRemaining;
        }
        this.LL.get(bArr, i, i2);
        return i2;
    }
}
