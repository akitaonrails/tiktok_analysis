package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: X.144F, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C144F extends BufferedInputStream {
    public boolean LL;
    public boolean LLILLJJLI;

    /* JADX WARN: Type inference failed for: r7v0, types: [X.09nZ] */
    public final synchronized C2479109nZ LIZ() {
        final InputStream[] inputStreamArr;
        if (this.LL) {
            throw new IllegalStateException();
        }
        if (this.LLILLJJLI) {
            throw new IllegalStateException();
        }
        this.LL = true;
        int i = ((BufferedInputStream) this).count - ((BufferedInputStream) this).pos;
        byte[] bArr = new byte[i];
        System.arraycopy(((BufferedInputStream) this).buf, ((BufferedInputStream) this).pos, bArr, 0, i);
        ((BufferedInputStream) this).pos = 0;
        ((BufferedInputStream) this).count = 0;
        inputStreamArr = new InputStream[]{new ByteArrayInputStream(bArr), ((BufferedInputStream) this).in};
        return new InputStream(inputStreamArr) { // from class: X.09nZ
            public final InputStream[] LL;
            public int LLILLJJLI;

            @Override // java.io.InputStream
            public final boolean markSupported() {
                return false;
            }

            @Override // java.io.InputStream
            public final int available() {
                return this.LL[this.LLILLJJLI].available();
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                int i2 = this.LLILLJJLI;
                IOException iOException = null;
                int i3 = 0;
                while (true) {
                    InputStream[] inputStreamArr2 = this.LL;
                    if (i3 >= inputStreamArr2.length) {
                        return;
                    }
                    try {
                        inputStreamArr2[i3].close();
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                        if (i3 == i2 || iOException == null) {
                            iOException = e;
                        }
                    }
                    i3++;
                }
            }

            @Override // java.io.InputStream
            public final int read() throws IOException {
                int i2;
                int i3;
                while (true) {
                    i2 = this.LL[this.LLILLJJLI].read();
                    if (i2 != -1 || (i3 = this.LLILLJJLI + 1) >= this.LL.length) {
                        break;
                    }
                    this.LLILLJJLI = i3;
                }
                return i2;
            }

            @Override // java.io.InputStream
            public final void reset() {
                throw new UnsupportedOperationException();
            }

            {
                if (inputStreamArr.length >= 2) {
                    this.LL = inputStreamArr;
                    this.LLILLJJLI = 0;
                    return;
                }
                throw new IllegalArgumentException("Streams must be non-null and have more than 1 entry");
            }

            @Override // java.io.InputStream
            public final void mark(int i2) {
                throw new UnsupportedOperationException();
            }

            @Override // java.io.InputStream
            public final int read(byte[] bArr2) {
                return read(bArr2, 0, bArr2.length);
            }

            @Override // java.io.InputStream
            public final long skip(long j) throws IOException {
                int i2 = (int) j;
                int i3 = read(new byte[i2], 0, i2);
                if (i3 >= 0) {
                    return i3;
                }
                return -1L;
            }

            @Override // java.io.InputStream
            public final int read(byte[] bArr2, int i2, int i3) throws IOException {
                int i4;
                int i5;
                while (true) {
                    i4 = this.LL[this.LLILLJJLI].read(bArr2, i2, i3);
                    if (i4 != -1 || (i5 = this.LLILLJJLI + 1) >= this.LL.length) {
                        break;
                    }
                    this.LLILLJJLI = i5;
                }
                return i4;
            }
        };
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.LL) {
            throw new IllegalStateException();
        }
        this.LLILLJJLI = false;
        super.reset();
    }

    public C144F(InputStream inputStream) {
        super(inputStream, 1024);
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        if (!this.LL) {
            this.LLILLJJLI = true;
            super.mark(i);
        } else {
            throw new IllegalStateException();
        }
    }
}
