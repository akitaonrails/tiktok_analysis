package X;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: X.0kXE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1323100kXE extends InputStream {
    public final InputStream LL;
    public final byte[] LLILLJJLI;
    public final InterfaceC1290810jh9<byte[]> LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;

    public final void LIZ() throws IOException {
        if (this.LLILZLL) {
            throw new IOException("stream already closed");
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        C1322350kW1.LJFF(this.LLILZIL <= this.LLILZ);
        LIZ();
        return (this.LLILZ - this.LLILZIL) + this.LL.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.LLILZLL) {
            return;
        }
        this.LLILZLL = true;
        this.LLILLL.LIZ(this.LLILLJJLI);
        super.close();
    }

    public final void finalize() throws Throwable {
        if (!this.LLILZLL) {
            C1328570kg3.LJFF("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        C1322350kW1.LJFF(this.LLILZIL <= this.LLILZ);
        LIZ();
        if (this.LLILZIL >= this.LLILZ) {
            int i = this.LL.read(this.LLILLJJLI);
            if (i <= 0) {
                return -1;
            }
            this.LLILZ = i;
            this.LLILZIL = 0;
        }
        byte[] bArr = this.LLILLJJLI;
        int i2 = this.LLILZIL;
        this.LLILZIL = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        boolean z;
        if (this.LLILZIL <= this.LLILZ) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LJFF(z);
        LIZ();
        int i = this.LLILZ;
        int i2 = this.LLILZIL;
        long j2 = i - i2;
        if (j2 >= j) {
            this.LLILZIL = (int) (((long) i2) + j);
            return j;
        }
        this.LLILZIL = i;
        return j2 + this.LL.skip(j - j2);
    }

    public C1323100kXE(InputStream inputStream, byte[] bArr, InterfaceC1330410kj1 interfaceC1330410kj1) {
        inputStream.getClass();
        this.LL = inputStream;
        bArr.getClass();
        this.LLILLJJLI = bArr;
        interfaceC1330410kj1.getClass();
        this.LLILLL = interfaceC1330410kj1;
        this.LLILZ = 0;
        this.LLILZIL = 0;
        this.LLILZLL = false;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        boolean z;
        if (this.LLILZIL <= this.LLILZ) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LJFF(z);
        LIZ();
        if (this.LLILZIL >= this.LLILZ) {
            int i3 = this.LL.read(this.LLILLJJLI);
            if (i3 <= 0) {
                return -1;
            }
            this.LLILZ = i3;
            this.LLILZIL = 0;
        }
        int iMin = Math.min(this.LLILZ - this.LLILZIL, i2);
        System.arraycopy(this.LLILLJJLI, this.LLILZIL, bArr, i, iMin);
        this.LLILZIL += iMin;
        return iMin;
    }
}
