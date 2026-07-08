package X;

import java.io.OutputStream;

/* JADX INFO: renamed from: X.0p3N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1496790p3N extends OutputStream {
    public final /* synthetic */ C1496690p3D LL;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(".outputStream()");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1496790p3N(C1496690p3D c1496690p3D) {
        this.LL = c1496690p3D;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.LL.LJJJZ(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.LL.LJJJLL(i, bArr, i2);
    }
}
