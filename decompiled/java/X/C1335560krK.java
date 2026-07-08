package X;

import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: X.0krK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1335560krK extends FilterOutputStream {
    public long LL;

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    public C1335560krK(C0VSV c0vsv) {
        super(c0vsv);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        this.LL++;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        this.LL += (long) i2;
    }
}
