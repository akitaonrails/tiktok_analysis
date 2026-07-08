package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import xlp.c;

/* JADX INFO: renamed from: X.0p1e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1495720p1e extends AbstractC1495800p1m {
    public long LLILZIL;

    @Override // X.InterfaceC842570X3n, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.LLILLJJLI) {
            return;
        }
        if (this.LLILZIL != 0) {
            try {
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (!c.LJIJ(this, 100, TimeUnit.MILLISECONDS)) {
                LIZ(null, false);
            }
        }
        this.LLILLJJLI = true;
    }

    public C1495720p1e(C1495660p1Y c1495660p1Y, long j) {
        super(c1495660p1Y);
        this.LLILZIL = j;
        if (j == 0) {
            LIZ(null, true);
        }
    }

    @Override // X.AbstractC1495800p1m, X.InterfaceC842570X3n
    public final long read(C1496690p3D c1496690p3D, long j) throws IOException {
        if (j >= 0) {
            if (!this.LLILLJJLI) {
                long j2 = this.LLILZIL;
                if (j2 == 0) {
                    return -1L;
                }
                long j3 = super.read(c1496690p3D, Math.min(j2, j));
                if (j3 != -1) {
                    long j4 = this.LLILZIL - j3;
                    this.LLILZIL = j4;
                    if (j4 == 0) {
                        LIZ(null, true);
                    }
                    return j3;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                LIZ(protocolException, false);
                throw protocolException;
            }
            throw new IllegalStateException("closed");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("byteCount < 0: ");
        sbLIZ.append(j);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
