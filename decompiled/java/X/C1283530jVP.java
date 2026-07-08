package X;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0jVP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1283530jVP extends OutputStream {
    public final ByteBuffer LL;

    public C1283530jVP(ByteBuffer byteBuffer) {
        this.LL = byteBuffer;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.LL.put((byte) i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.LL.put(bArr, i, i2);
    }
}
