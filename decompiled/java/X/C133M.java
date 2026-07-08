package X;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: X.133M, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C133M extends FilterInputStream {
    public int LL;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.LL <= 0) {
            return -1;
        }
        int i = super.read();
        if (i >= 0) {
            this.LL--;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.LL);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        int iSkip = (int) super.skip(Math.min(j, this.LL));
        if (iSkip >= 0) {
            this.LL -= iSkip;
        }
        return iSkip;
    }

    public C133M(InputStream inputStream, int i) {
        super(inputStream);
        this.LL = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.LL;
        if (i3 <= 0) {
            return -1;
        }
        int i4 = super.read(bArr, i, Math.min(i2, i3));
        if (i4 >= 0) {
            this.LL -= i4;
        }
        return i4;
    }
}
