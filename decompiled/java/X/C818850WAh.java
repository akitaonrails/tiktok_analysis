package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: X.0WAh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C818850WAh extends InputStream {
    public final InputStream LL;

    public void LIZ(IOException iOException) {
        throw null;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        try {
            this.LL.reset();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            LIZ(e);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        try {
            return this.LL.available();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            LIZ(e);
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.LL.close();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            LIZ(e);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.LL.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.LL.read();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            LIZ(e);
            throw e;
        }
    }

    public C818850WAh(InputStream inputStream) {
        this.LL = inputStream;
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.LL.mark(i);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.LL.read(bArr);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            LIZ(e);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return this.LL.skip(j);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            LIZ(e);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.LL.read(bArr, i, i2);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            LIZ(e);
            throw e;
        }
    }
}
