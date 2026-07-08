package X;

import java.io.InputStream;

/* JADX INFO: renamed from: X.0qSc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1550880qSc extends InputStream {
    public final InterfaceC1550870qSb LL;
    public long LLILLJJLI;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.LL.position(this.LLILLJJLI);
    }

    @Override // java.io.InputStream
    public final int available() {
        long length = this.LL.length() - this.LL.position();
        if (length > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) length;
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.LL.read();
    }

    public C1550880qSc(InterfaceC1550870qSb interfaceC1550870qSb) {
        this.LL = interfaceC1550870qSb;
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.LLILLJJLI = i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return this.LL.read(bArr);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.LL.skip(j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return this.LL.read(bArr, i, i2);
    }
}
