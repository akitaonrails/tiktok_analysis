package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: X.0p0Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1495040p0Y extends InputStream {
    public final InputStream LL;
    public final InterfaceC1494830p0D LLILLJJLI;

    @Override // java.io.InputStream
    public final synchronized void reset() {
        InputStream inputStream = this.LL;
        if (inputStream != null) {
            inputStream.reset();
        } else {
            super.reset();
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        InputStream inputStream = this.LL;
        return inputStream != null ? inputStream.available() : super.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            InputStream inputStream = this.LL;
            if (inputStream != null) {
                inputStream.close();
            }
            InterfaceC1494830p0D interfaceC1494830p0D = this.LLILLJJLI;
            if (interfaceC1494830p0D != null) {
                interfaceC1494830p0D.cancel();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        super.close();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        InputStream inputStream = this.LL;
        return inputStream != null ? inputStream.markSupported() : super.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i;
        try {
            try {
                InputStream inputStream = this.LL;
                if (inputStream != null) {
                    i = inputStream.read();
                    if (i == -1) {
                    }
                    return i;
                }
                i = -1;
                close();
                return i;
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        InputStream inputStream = this.LL;
        if (inputStream != null) {
            inputStream.mark(i);
        } else {
            super.mark(i);
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        int i;
        try {
            try {
                InputStream inputStream = this.LL;
                if (inputStream != null) {
                    i = inputStream.read(bArr);
                } else {
                    i = super.read(bArr);
                }
                if (i == -1) {
                    close();
                }
                return i;
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        InputStream inputStream = this.LL;
        if (inputStream != null) {
            return inputStream.skip(j);
        }
        return super.skip(j);
    }

    public C1495040p0Y(InputStream inputStream, InterfaceC1494830p0D interfaceC1494830p0D) {
        this.LL = inputStream;
        this.LLILLJJLI = interfaceC1494830p0D;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        try {
            try {
                InputStream inputStream = this.LL;
                if (inputStream != null) {
                    i3 = inputStream.read(bArr, i, i2);
                } else {
                    i3 = super.read(bArr, i, i2);
                }
                if (i3 == -1) {
                    close();
                }
                return i3;
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }
}
