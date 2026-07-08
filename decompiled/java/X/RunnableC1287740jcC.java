package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0jcC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class RunnableC1287740jcC implements Runnable {
    public final /* synthetic */ C1287750jcD LL;

    public /* synthetic */ RunnableC1287740jcC(C1287750jcD c1287750jcD) {
        this.LL = c1287750jcD;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1287750jcD c1287750jcD = this.LL;
        c1287750jcD.getClass();
        C1C7U.LIZ("PiaMetrics@8663.reportPvEvent$1L");
        if (c1287750jcD.LIZLLL) {
            C1C7U.LIZIZ("PiaMetrics@8663.reportPvEvent$1L");
            return;
        }
        c1287750jcD.LIZLLL = true;
        ((HashMap) c1287750jcD.LJ).put("url", c1287750jcD.LIZIZ);
        ((HashMap) c1287750jcD.LJ).put("pia_sdk_version", "2.5.3");
        C1287700jc8.LIZJ(new RunnableC1287660jc4(c1287750jcD, EnumC1287080jb8.PV, c1287750jcD.LJ));
        C1C7U.LIZIZ("PiaMetrics@8663.reportPvEvent$1L");
    }
}
