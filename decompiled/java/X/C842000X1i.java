package X;

import java.io.InputStream;

/* JADX INFO: renamed from: X.0X1i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842000X1i extends InputStream {
    public final /* synthetic */ C1496690p3D LL;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) Math.min(this.LL.LLILLJJLI, Integer.MAX_VALUE);
    }

    @Override // java.io.InputStream
    public final int read() {
        C1496690p3D c1496690p3D = this.LL;
        if (c1496690p3D.LLILLJJLI > 0) {
            return c1496690p3D.readByte() & 255;
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(".inputStream()");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C842000X1i(C1496690p3D c1496690p3D) {
        this.LL = c1496690p3D;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return this.LL.read(bArr, i, i2);
    }
}
