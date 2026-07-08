package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: X.0p23, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1495970p23 extends C1496260p2W {
    public final /* synthetic */ C1495890p1v LJIIJ;

    @Override // X.C1496260p2W
    public final void LJIILIIL() {
        C1495890p1v c1495890p1v = this.LJIIJ;
        EnumC1496090p2F enumC1496090p2F = EnumC1496090p2F.CANCEL;
        if (c1495890p1v.LIZLLL(enumC1496090p2F)) {
            c1495890p1v.LIZLLL.LJIJJ(c1495890p1v.LIZJ, enumC1496090p2F);
        }
        final C1495910p1x c1495910p1x = this.LJIIJ.LIZLLL;
        synchronized (c1495910p1x) {
            try {
                long j = c1495910p1x.LLJILLL;
                long j2 = c1495910p1x.LLJILJILJ;
                if (j < j2) {
                    return;
                }
                c1495910p1x.LLJILJILJ = j2 + 1;
                c1495910p1x.LLJJ = System.nanoTime() + 1000000000;
                try {
                    C822660WOy c822660WOy = c1495910p1x.LLIZLLLIL;
                    final Object[] objArr = {c1495910p1x.LLILZ};
                    c822660WOy.execute(new AbstractRunnableC846600XJa(objArr) { // from class: X.0p2H
                        @Override // X.AbstractRunnableC846600XJa
                        public final void LIZ() {
                            C1495910p1x c1495910p1x2 = c1495910p1x;
                            c1495910p1x2.getClass();
                            try {
                                c1495910p1x2.LLJJJ.LJII(2, 0, false);
                            } catch (IOException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c1495910p1x2.LIZIZ();
                            }
                        }
                    });
                } catch (RejectedExecutionException e) {
                }
            } finally {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void LJIILJJIL() {
        if (LJIIIZ()) {
            throw LJIIL(null);
        }
    }

    public C1495970p23(C1495890p1v c1495890p1v) {
        this.LJIIJ = c1495890p1v;
    }

    @Override // X.C1496260p2W
    public final IOException LJIIL(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
