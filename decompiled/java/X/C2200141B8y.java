package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: X.1B8y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2200141B8y extends InputStream {
    public final InputStream LL;
    public long LLILLJJLI;
    public int LLILLL = 40;
    public volatile long LLILZ;
    public volatile long LLILZIL;
    public long LLILZLL;
    public long LLIZ;
    public long LLIZLLLIL;

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.LL.reset();
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.LL.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.LL.close();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.LL.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.LL.read();
    }

    public C2200141B8y(InputStream inputStream) {
        this.LL = inputStream;
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.LL.mark(i);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.LL.skip(j);
    }

    public final int LIZ(int i, byte[] bArr, int i2) {
        return super.read(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.LLILZIL > 0) {
            if (this.LLIZ == 0) {
                this.LLIZ = System.currentTimeMillis();
            }
            long j = this.LLILZIL - this.LLILZLL;
            if (j > 0 && i2 > j) {
                i2 = (int) j;
            }
            int i3 = this.LL.read(bArr, i, i2);
            if (i3 != -1) {
                this.LLILZLL += (long) i3;
            }
            if (this.LLILZLL >= this.LLILZIL) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j2 = jCurrentTimeMillis - this.LLIZ;
                this.LLIZ = jCurrentTimeMillis;
                long j3 = this.LLILZ - j2;
                if (j3 > 0) {
                    long j4 = this.LLIZLLLIL;
                    if (j3 > j4) {
                        long j5 = j3 - j4;
                        this.LLIZLLLIL = 0L;
                        if (j5 > 0) {
                            this.LLIZ += j5;
                            try {
                                Thread.sleep(j5);
                            } catch (InterruptedException e) {
                                TryCatchGuardChecker.doCheck(e);
                                throw new IOException(e);
                            }
                        }
                    } else {
                        this.LLIZLLLIL = j4 - j3;
                    }
                } else if (j3 < 0) {
                    long j6 = this.LLIZLLLIL + (-j3);
                    this.LLIZLLLIL = j6;
                    if (j6 > 100) {
                        this.LLIZLLLIL = 100L;
                    }
                }
                this.LLILZLL = 0L;
            }
            return i3;
        }
        return this.LL.read(bArr, i, i2);
    }
}
