package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: X.0p1w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495900p1w implements InterfaceC842570X3n {
    public final C1496690p3D LL = new C1496690p3D();
    public final C1496690p3D LLILLJJLI = new C1496690p3D();
    public final long LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public final /* synthetic */ C1495890p1v LLILZLL;

    @Override // X.InterfaceC842570X3n, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        synchronized (this.LLILZLL) {
            try {
                this.LLILZ = true;
                C1496690p3D c1496690p3D = this.LLILLJJLI;
                j = c1496690p3D.LLILLJJLI;
                c1496690p3D.LIZ();
                if (!((ArrayDeque) this.LLILZLL.LJ).isEmpty()) {
                    this.LLILZLL.getClass();
                }
                this.LLILZLL.notifyAll();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (j > 0) {
            this.LLILZLL.LIZLLL.LJIILLIIL(j);
        }
        this.LLILZLL.LIZ();
    }

    @Override // X.InterfaceC842570X3n
    public final C1496250p2V timeout() {
        return this.LLILZLL.LJIIIIZZ;
    }

    public C1495900p1w(C1495890p1v c1495890p1v, long j) {
        this.LLILZLL = c1495890p1v;
        this.LLILLL = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    @Override // X.InterfaceC842570X3n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long read(X.C1496690p3D r14, long r15) throws X.C1495470p1F {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1495900p1w.read(X.0p3D, long):long");
    }
}
