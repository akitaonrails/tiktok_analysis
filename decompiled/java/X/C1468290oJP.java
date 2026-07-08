package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0oJP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1468290oJP extends C0W9W {
    public final /* synthetic */ C1468280oJO LL;

    public final void LIZ() {
        InterfaceC1468520oJm interfaceC1468520oJm = this.LL.LJ;
        int networkType = interfaceC1468520oJm != null ? ((C1468510oJl) interfaceC1468520oJm).LIZ.LIZIZ.getNetworkType() : -1;
        InterfaceC1468520oJm interfaceC1468520oJm2 = this.LL.LJ;
        int networkRttMs = interfaceC1468520oJm2 != null ? ((C1468510oJl) interfaceC1468520oJm2).LIZ.LIZIZ.getNetworkRttMs() : -1;
        C790010Uyt c790010UytLJ = C790010Uyt.LJ();
        String str = "unknown";
        if (c790010UytLJ.LIZ != 1000) {
            int i = c790010UytLJ.LIZIZ;
            if (i == 1) {
                str = "weak";
            } else if (i == 2) {
                str = "medium";
            } else if (i == 3) {
                str = "good";
            } else if (i == 4) {
                str = "excellent";
            }
        }
        synchronized (this) {
            try {
                if (this.LL.LIZ.size() >= this.LL.LJII) {
                    this.LL.LIZ.remove(0);
                    this.LL.LIZIZ.remove(0);
                    this.LL.LIZJ.remove(0);
                }
                this.LL.LIZ.add(Integer.valueOf(networkType));
                this.LL.LIZIZ.add(Integer.valueOf(networkRttMs));
                this.LL.LIZJ.add(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("NetworkPortraitData$MyTimerTask@b27e.run");
        boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
        try {
            LIZ();
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("NetworkPortraitData$MyTimerTask@b27e.run");
    }

    public C1468290oJP(C1468280oJO c1468280oJO) {
        this.LL = c1468280oJO;
    }
}
