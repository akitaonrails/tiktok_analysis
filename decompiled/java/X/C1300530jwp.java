package X;

import com.bytedance.android.livesdk.livesetting.watchlive.previewlive.LiveFixGpuGetANRExp;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.graphics.GraphicsMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.SecureRandom;

/* JADX INFO: renamed from: X.0jwp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1300530jwp {
    public static volatile boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static final C1300530jwp LIZ = new C1300530jwp();
    public static final SecureRandom LIZLLL = new SecureRandom();
    public static AbstractC2175691ACx LJ = C1300540jwq.LIZLLL;

    public static void LIZ() {
        if (C1300550jwr.LIZ().enableGpuUsageOld && LIZIZ) {
            LIZIZ = false;
            try {
                if (LiveFixGpuGetANRExp.isSync()) {
                    if (GraphicsMonitor.isStartNoLock()) {
                        GraphicsMonitor.stopNoLock();
                        C20441214yg.LJIIIZ("LivePreviewPerfMonitor", "stopGraphicsMonitor");
                        return;
                    }
                    return;
                }
                if (LiveFixGpuGetANRExp.isASync()) {
                    C786410Ut5.LJJZZIII(new BPEAHandler(C786410Ut5.W2(C465520INi.LIZ.XD1())), new Runnable() { // from class: X.0jwo
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("LivePreviewPerformanceMonitor@7c3c.stopGraphicsMonitor$1");
                            try {
                                if (GraphicsMonitor.isStart()) {
                                    GraphicsMonitor.stop();
                                    C20441214yg.LJIIIZ("LivePreviewPerfMonitor", "stopGraphicsMonitor");
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("LivePreviewPerformanceMonitor@7c3c.stopGraphicsMonitor$1");
                        }
                    });
                } else if (GraphicsMonitor.isStart()) {
                    GraphicsMonitor.stop();
                    C20441214yg.LJIIIZ("LivePreviewPerfMonitor", "stopGraphicsMonitor");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C20441214yg.LJII(th);
            }
        }
    }
}
