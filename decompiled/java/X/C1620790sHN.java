package X;

import android.os.MessageQueue;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;

/* JADX INFO: renamed from: X.0sHN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1620790sHN implements MessageQueue.IdleHandler {
    public final int $t;
    public Object l0;

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        switch (this.$t) {
            case 0:
                return queueIdle$0(this);
            case 1:
                return queueIdle$1(this);
            case 2:
                return queueIdle$2(this);
            case 3:
                return queueIdle$3(this);
            default:
                return false;
        }
    }

    public static final boolean queueIdle$0(C1620790sHN c1620790sHN) {
        float f;
        long jAbs;
        C1616420sAK c1616420sAK = (C1616420sAK) c1620790sHN.l0;
        String str = c1616420sAK.LIZIZ;
        C1616410sAJ.LJ(c1616420sAK.LJFF, c1616420sAK.LJI, c1616420sAK.LIZJ, c1616420sAK.LIZ, str, "", "", null, false, c1616420sAK.LJ);
        C1616420sAK c1616420sAK2 = (C1616420sAK) c1620790sHN.l0;
        String str2 = c1616420sAK2.LIZIZ;
        String str3 = c1616420sAK2.LIZLLL;
        C1616410sAJ.LJFF(c1616420sAK2.LJIIIIZZ, c1616420sAK2.LJIIIZ, c1616420sAK2.LIZJ, c1616420sAK2.LIZ, str2, str3, "", null, false, c1616420sAK2.LJ);
        C1616420sAK c1616420sAK3 = (C1616420sAK) c1620790sHN.l0;
        int i = c1616420sAK3.LJIIIZ - c1616420sAK3.LJI;
        if (i > 0) {
            f = 1;
        } else {
            f = c1616420sAK3.LJIIIIZZ;
        }
        float f2 = c1616420sAK3.LJFF;
        float fAbs = f - f2;
        if (fAbs < 0.0f) {
            fAbs = Math.abs(1 - f2);
        }
        C1616420sAK c1616420sAK4 = (C1616420sAK) c1620790sHN.l0;
        long j = c1616420sAK4.LJIIJ - c1616420sAK4.LJII;
        String str4 = c1616420sAK4.LIZIZ;
        String str5 = c1616420sAK4.LIZLLL;
        Aweme aweme = c1616420sAK4.LIZ;
        long j2 = c1616420sAK4.LIZJ;
        float fLIZIZ = C1616410sAJ.LIZIZ(fAbs);
        int iAbs = Math.abs(i);
        if (Math.abs(j) > 86400000) {
            jAbs = 1000;
        } else {
            jAbs = Math.abs(j);
        }
        C1616410sAJ.LJII(false, str4, str5, aweme, j2, fLIZIZ, iAbs, jAbs, ((C1616420sAK) c1620790sHN.l0).LJ, "");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean queueIdle$1(X.C1620790sHN r6) {
        /*
            java.lang.Object r5 = r6.l0
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            java.lang.String r0 = "ColdBootStartJankOptimize@acf0.postEnableViewPagerPreload$1L"
            X.C1C7U.LIZ(r0)
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r6 = 1
            java.lang.Class<android.os.MessageQueue> r1 = android.os.MessageQueue.class
            java.lang.String r0 = "mMessages"
            java.lang.reflect.Field r1 = X.C1959507lx.LIZ(r1, r0)     // Catch: java.lang.Throwable -> L45
            android.os.MessageQueue r0 = r2.getQueue()     // Catch: java.lang.Throwable -> L45
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L45
            android.os.Message r0 = (android.os.Message) r0     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L36
            long r3 = r0.getWhen()     // Catch: java.lang.Throwable -> L45
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L45
            long r3 = r3 - r0
            com.ss.android.ugc.aweme.experiment.ColdBootStartJankOptimize.LJ()     // Catch: java.lang.Throwable -> L45
            com.ss.android.ugc.aweme.experiment.ColdBootStartJankOptimize$Config r0 = com.ss.android.ugc.aweme.experiment.ColdBootStartJankOptimize.LIZ     // Catch: java.lang.Throwable -> L45
            long r1 = r0.delayPreloadSecondItemIdleThreshold     // Catch: java.lang.Throwable -> L45
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L49
        L36:
            java.lang.String r0 = "optimize_startupjank_idle_condition"
            boolean r0 = X.C0X35.LJIIL(r0)
            if (r0 == 0) goto L49
            java.lang.String r0 = "preload"
            com.ss.android.ugc.aweme.experiment.ColdBootStartJankOptimize.LIZLLL(r5, r0)
            r6 = 0
            return r6
        L45:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L49:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1620790sHN.queueIdle$1(X.0sHN):boolean");
    }

    public static final boolean queueIdle$2(C1620790sHN c1620790sHN) {
        FullFeedFragmentPanel fullFeedFragmentPanel = (FullFeedFragmentPanel) c1620790sHN.l0;
        if (!fullFeedFragmentPanel.LLILLL()) {
            fullFeedFragmentPanel.LLZ();
            fullFeedFragmentPanel.J();
            return false;
        }
        return false;
    }

    public static final boolean queueIdle$3(C1620790sHN c1620790sHN) {
        FullFeedFragmentPanel fullFeedFragmentPanel = (FullFeedFragmentPanel) c1620790sHN.l0;
        if (!fullFeedFragmentPanel.LLILLL()) {
            fullFeedFragmentPanel.LLZ();
            fullFeedFragmentPanel.J();
            return false;
        }
        return false;
    }

    public C1620790sHN(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
