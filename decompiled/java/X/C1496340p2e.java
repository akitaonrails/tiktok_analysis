package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0p2e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1496340p2e implements InterfaceC842570X3n {
    public final InputStream LL;
    public final C1496250p2V LLILLJJLI;

    @Override // X.InterfaceC842570X3n, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.LL.close();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("source(");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC842570X3n
    public final C1496250p2V timeout() {
        return this.LLILLJJLI;
    }

    public C1496340p2e(InputStream inputStream, C1496250p2V c1496250p2V) {
        this.LL = inputStream;
        this.LLILLJJLI = c1496250p2V;
    }

    @Override // X.InterfaceC842570X3n
    public final long read(C1496690p3D c1496690p3D, long j) throws IOException {
        String message;
        if (j == 0) {
            return 0L;
        }
        if (j >= 0) {
            try {
                this.LLILLJJLI.LJFF();
                C1496750p3J c1496750p3JLJJJJJL = c1496690p3D.LJJJJJL(1);
                int i = this.LL.read(c1496750p3JLJJJJJL.LIZ, c1496750p3JLJJJJJL.LIZJ, (int) Math.min(j, 8192 - c1496750p3JLJJJJJL.LIZJ));
                if (i == -1) {
                    return -1L;
                }
                c1496750p3JLJJJJJL.LIZJ += i;
                long j2 = i;
                c1496690p3D.LLILLJJLI += j2;
                return j2;
            } catch (AssertionError e) {
                TryCatchGuardChecker.doCheck(e);
                if (e.getCause() != null && (message = e.getMessage()) != null && a0.LJJIIZI(message, "getsockname failed", false)) {
                    throw new IOException(e);
                }
                throw e;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("byteCount < 0: ");
        sbLIZ.append(j);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }
}
