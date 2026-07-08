package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ttnet.org.chromium.net.j;
import com.ttnet.org.chromium.net.n0;
import com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection;
import java.io.IOException;
import java.net.HttpRetryException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0p46, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1497240p46 extends AbstractC1497310p4D {
    public final CronetHttpURLConnection LLILZ;
    public final ExecutorC1497250p47 LLILZIL;
    public final ByteBuffer LLILZLL;
    public final C1497280p4A LLIZ = new AbstractC1498040p5O() { // from class: X.0p4A
        @Override // X.AbstractC1498040p5O
        public final long LIZ() {
            return -1L;
        }

        @Override // X.AbstractC1498040p5O
        public final void LIZLLL(n0 n0Var) {
            n0Var.LIZIZ(new HttpRetryException("Cannot retry streamed Http body", -1));
        }

        @Override // X.AbstractC1498040p5O
        public final void LIZIZ(n0 n0Var, ByteBuffer byteBuffer) {
            if (byteBuffer.remaining() >= this.LL.LLILZLL.remaining()) {
                byteBuffer.put(this.LL.LLILZLL);
                this.LL.LLILZLL.clear();
                n0Var.LIZ(this.LL.LLIZLLLIL);
                C1497240p46 c1497240p46 = this.LL;
                if (!c1497240p46.LLIZLLLIL) {
                    c1497240p46.LLILZIL.LLILLJJLI = false;
                    return;
                }
                return;
            }
            int iLimit = this.LL.LLILZLL.limit();
            ByteBuffer byteBuffer2 = this.LL.LLILZLL;
            byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
            byteBuffer.put(this.LL.LLILZLL);
            this.LL.LLILZLL.limit(iLimit);
            n0Var.LIZ(false);
        }
    };
    public boolean LLIZLLLIL;

    @Override // X.AbstractC1497310p4D
    public final void LIZIZ() {
    }

    @Override // X.AbstractC1497310p4D
    public final void LJFF() {
    }

    @Override // X.AbstractC1497310p4D, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LLILLJJLI = true;
        if (this.LLIZLLLIL) {
            return;
        }
        this.LLIZLLLIL = true;
        this.LLILZLL.flip();
    }

    public final void LJI() throws IOException {
        if (this.LLILZLL.hasRemaining()) {
            return;
        }
        LIZ();
        this.LLILZLL.flip();
        int readTimeout = this.LLILZ.getReadTimeout();
        try {
            this.LLILZIL.LIZ(readTimeout);
        } catch (SocketTimeoutException e) {
            TryCatchGuardChecker.doCheck(e);
            CronetHttpURLConnection cronetHttpURLConnection = this.LLILZ;
            if (cronetHttpURLConnection != null) {
                j jVar = cronetHttpURLConnection.LIZJ;
                if (jVar != null) {
                    jVar.LIZJ();
                }
                ExecutorC1497250p47 executorC1497250p47 = this.LLILZIL;
                executorC1497250p47.LLILLL = false;
                executorC1497250p47.LIZ(readTimeout / 2);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            CronetHttpURLConnection cronetHttpURLConnection2 = this.LLILZ;
            if (cronetHttpURLConnection2 != null) {
                j jVar2 = cronetHttpURLConnection2.LIZJ;
                if (jVar2 != null) {
                    jVar2.LJ("Unexpected request usage, caught in CronetChunkedOutputStream", e2);
                }
                ExecutorC1497250p47 executorC1497250p472 = this.LLILZIL;
                executorC1497250p472.LLILLL = false;
                executorC1497250p472.LIZ(readTimeout / 2);
            }
        }
        IOException iOException = this.LL;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // X.AbstractC1497310p4D
    public final AbstractC1498040p5O LIZLLL() {
        return this.LLIZ;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        LJI();
        this.LLILZLL.put((byte) i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0p4A] */
    public C1497240p46(CronetHttpURLConnection cronetHttpURLConnection, int i, ExecutorC1497250p47 executorC1497250p47) {
        cronetHttpURLConnection.getClass();
        if (i > 0) {
            this.LLILZLL = ByteBuffer.allocate(i);
            this.LLILZ = cronetHttpURLConnection;
            this.LLILZIL = executorC1497250p47;
            return;
        }
        throw new IllegalArgumentException("chunkLength should be greater than 0");
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        LIZ();
        if (bArr.length - i >= i2 && i >= 0 && i2 >= 0) {
            int i3 = i2;
            while (i3 > 0) {
                int iMin = Math.min(i3, this.LLILZLL.remaining());
                this.LLILZLL.put(bArr, (i + i2) - i3, iMin);
                i3 -= iMin;
                LJI();
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
