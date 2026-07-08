package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;

/* JADX INFO: renamed from: X.0p1p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495830p1p implements InterfaceC842570X3n {
    public final /* synthetic */ C1496260p2W LL;
    public final /* synthetic */ InterfaceC842570X3n LLILLJJLI;

    @Override // X.InterfaceC842570X3n, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            try {
                this.LLILLJJLI.close();
                this.LL.LJIIJJI(true);
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                throw this.LL.LJIIJ(e);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LL.LJIIJJI(false);
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AsyncTimeout.source(");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC842570X3n
    public final /* bridge */ /* synthetic */ C1496250p2V timeout() {
        return this.LL;
    }

    public C1495830p1p(C0XMI c0xmi, C1496340p2e c1496340p2e) {
        this.LL = c0xmi;
        this.LLILLJJLI = c1496340p2e;
    }

    @Override // X.InterfaceC842570X3n
    public final long read(C1496690p3D c1496690p3D, long j) throws IOException {
        this.LL.LJIIIIZZ();
        try {
            try {
                long j2 = this.LLILLJJLI.read(c1496690p3D, j);
                this.LL.LJIIJJI(true);
                return j2;
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                throw this.LL.LJIIJ(e);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LL.LJIIJJI(false);
            throw th;
        }
    }
}
