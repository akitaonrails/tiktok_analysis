package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ttnet.org.chromium.net.j;
import com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0p45, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1497230p45 extends AbstractC1497310p4D {
    public final CronetHttpURLConnection LLILZ;
    public final ExecutorC1497250p47 LLILZIL;
    public final long LLILZLL;
    public final ByteBuffer LLIZ;
    public final C1497260p48 LLIZLLLIL = new C1497260p48(this);
    public long LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;

    @Override // X.AbstractC1497310p4D
    public final void LJFF() {
    }

    @Override // X.AbstractC1497310p4D
    public final void LIZIZ() throws ProtocolException {
        if (this.LLJ < this.LLILZLL) {
            throw new ProtocolException("Content received is less than Content-Length.");
        }
    }

    public final void LJII() throws IOException {
        LIZ();
        this.LLIZ.flip();
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
                    jVar2.LJ("Unexpected request usage, caught in CronetFixedModeOutputStream", e2);
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
        return this.LLIZLLLIL;
    }

    public final void LJI(int i) throws ProtocolException {
        if (this.LLJ + ((long) i) <= this.LLILZLL) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("expected ");
        sbLIZ.append(this.LLILZLL - this.LLJ);
        sbLIZ.append(" bytes but received ");
        sbLIZ.append(i);
        throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        LIZ();
        LJI(1);
        if (!this.LLIZ.hasRemaining()) {
            this.LLJI = false;
            LJII();
        }
        this.LLIZ.put((byte) i);
        long j = this.LLJ + 1;
        this.LLJ = j;
        if (j == this.LLILZLL) {
            LJII();
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        LIZ();
        if (bArr.length - i >= i2 && i >= 0 && i2 >= 0) {
            LJI(i2);
            int i3 = i2;
            while (i3 > 0) {
                if (!this.LLIZ.hasRemaining()) {
                    this.LLJI = false;
                    LJII();
                }
                int iMin = Math.min(i3, this.LLIZ.remaining());
                this.LLIZ.put(bArr, (i + i2) - i3, iMin);
                i3 -= iMin;
            }
            long j = this.LLJ + ((long) i2);
            this.LLJ = j;
            if (j == this.LLILZLL) {
                LJII();
                return;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public C1497230p45(CronetHttpURLConnection cronetHttpURLConnection, long j, int i, ExecutorC1497250p47 executorC1497250p47) {
        cronetHttpURLConnection.getClass();
        if (j >= 0) {
            this.LLILZLL = j;
            this.LLIZ = ByteBuffer.allocate((int) Math.min(j, Math.max(16384, i)));
            this.LLILZ = cronetHttpURLConnection;
            this.LLILZIL = executorC1497250p47;
            this.LLJ = 0L;
            this.LLJI = true;
            this.LLJIJIL = false;
            return;
        }
        throw new IllegalArgumentException("Content length must be larger than 0 for non-chunked upload.");
    }
}
