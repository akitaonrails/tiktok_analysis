package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0p2X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1496270p2X implements InterfaceC1495590p1R {
    public final /* synthetic */ C1496260p2W LL;
    public final /* synthetic */ InterfaceC1495590p1R LLILLJJLI;

    @Override // X.InterfaceC1495590p1R, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.LL.LJIIIIZZ();
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

    @Override // X.InterfaceC1495590p1R, java.io.Flushable
    public final void flush() throws IOException {
        this.LL.LJIIIIZZ();
        try {
            try {
                this.LLILLJJLI.flush();
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
        sbLIZ.append("AsyncTimeout.sink(");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1495590p1R
    public final /* bridge */ /* synthetic */ C1496250p2V timeout() {
        return this.LL;
    }

    public C1496270p2X(C0XMI c0xmi, C1496650p39 c1496650p39) {
        this.LL = c0xmi;
        this.LLILLJJLI = c1496650p39;
    }

    @Override // X.InterfaceC1495590p1R
    public final void LLFF(C1496690p3D c1496690p3D, long j) throws IOException {
        long j2 = j;
        C1496820p3Q.LIZIZ(c1496690p3D.LLILLJJLI, 0L, j2);
        while (true) {
            long j3 = 0;
            if (j2 > 0) {
                C1496750p3J c1496750p3J = c1496690p3D.LL;
                if (c1496750p3J == null) {
                    Intrinsics.LJIIL();
                }
                while (true) {
                    if (j3 >= 65536) {
                        break;
                    }
                    j3 += (long) (c1496750p3J.LIZJ - c1496750p3J.LIZIZ);
                    if (j3 >= j2) {
                        j3 = j2;
                        break;
                    } else {
                        c1496750p3J = c1496750p3J.LJFF;
                        if (c1496750p3J == null) {
                            Intrinsics.LJIIL();
                        }
                    }
                }
                this.LL.LJIIIIZZ();
                try {
                    try {
                        this.LLILLJJLI.LLFF(c1496690p3D, j3);
                        j2 -= j3;
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
            } else {
                return;
            }
        }
    }
}
