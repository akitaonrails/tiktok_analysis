package X;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Objects;

/* JADX INFO: renamed from: X.0WCT, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class C0WCT implements Runnable {
    public final /* synthetic */ C0WCW LL;
    public final /* synthetic */ AbstractC818550W9d LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Runnable LLILZ;

    public /* synthetic */ C0WCT(C0WCW c0wcw, C818560W9e c818560W9e, int i, Runnable runnable) {
        this.LL = c0wcw;
        this.LLILLJJLI = c818560W9e;
        this.LLILLL = i;
        this.LLILZ = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C0WCW c0wcw = this.LL;
        final AbstractC818550W9d abstractC818550W9d = this.LLILLJJLI;
        final int i = this.LLILLL;
        Runnable runnable = this.LLILZ;
        c0wcw.getClass();
        C1C7U.LIZ("Uploader@dc83.upload$1L");
        try {
            try {
                C0WCM c0wcm = c0wcw.LJFF;
                final C0WCP c0wcp = c0wcw.LIZJ;
                Objects.requireNonNull(c0wcp);
                c0wcm.LIZIZ(new C0WCL() { // from class: X.0WCS
                    @Override // X.C0WCL
                    public final Object execute() {
                        return Integer.valueOf(c0wcp.LIZJ());
                    }
                });
                NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.H2(c0wcw.LIZ, "connectivity"));
                if (networkInfoLJIJ == null || !networkInfoLJIJ.isConnected()) {
                    c0wcw.LJFF.LIZIZ(new C0WCL() { // from class: X.0WCh
                        @Override // X.C0WCL
                        public final Object execute() {
                            C0WCW c0wcw2 = c0wcw;
                            c0wcw2.LIZLLL.LIZ(abstractC818550W9d, i + 1);
                            return null;
                        }
                    });
                } else {
                    c0wcw.LIZ(abstractC818550W9d, i);
                }
            } catch (C0WCR e) {
                TryCatchGuardChecker.doCheck(e);
                c0wcw.LIZLLL.LIZ(abstractC818550W9d, i + 1);
            }
            runnable.run();
            C1C7U.LIZIZ("Uploader@dc83.upload$1L");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            runnable.run();
            throw th;
        }
    }
}
