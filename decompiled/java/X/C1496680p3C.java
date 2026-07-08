package X;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: X.0p3C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1496680p3C extends InputStream {
    public final /* synthetic */ C1496670p3B LL;

    @Override // java.io.InputStream
    public final int available() throws IOException {
        C1496670p3B c1496670p3B = this.LL;
        if (c1496670p3B.LLILLJJLI) {
            throw new IOException("closed");
        }
        return (int) Math.min(c1496670p3B.LL.LLILLJJLI, Integer.MAX_VALUE);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LL.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        C1496670p3B c1496670p3B = this.LL;
        if (c1496670p3B.LLILLJJLI) {
            throw new IOException("closed");
        }
        C1496690p3D c1496690p3D = c1496670p3B.LL;
        if (c1496690p3D.LLILLJJLI == 0 && c1496670p3B.LLILLL.read(c1496690p3D, 8192) == -1) {
            return -1;
        }
        return this.LL.LL.readByte() & 255;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(".inputStream()");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1496680p3C(C1496670p3B c1496670p3B) {
        this.LL = c1496670p3B;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.LL.LLILLJJLI) {
            C1496820p3Q.LIZIZ(bArr.length, i, i2);
            C1496670p3B c1496670p3B = this.LL;
            C1496690p3D c1496690p3D = c1496670p3B.LL;
            if (c1496690p3D.LLILLJJLI == 0 && c1496670p3B.LLILLL.read(c1496690p3D, 8192) == -1) {
                return -1;
            }
            return this.LL.LL.read(bArr, i, i2);
        }
        throw new IOException("closed");
    }
}
