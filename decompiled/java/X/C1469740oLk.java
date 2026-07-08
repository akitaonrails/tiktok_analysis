package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;

/* JADX INFO: renamed from: X.0oLk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1469740oLk {
    public PthreadTimer LIZ;
    public C1469730oLj LIZIZ;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0oLj] */
    public final void LIZ(final AVMDLDataLoader aVMDLDataLoader, int i) {
        if (this.LIZIZ == null && this.LIZ == null && i > 0) {
            this.LIZIZ = new C0W9W(aVMDLDataLoader) { // from class: X.0oLj
                public final AVMDLDataLoader LL;

                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("InnerMDLHeartBeat$MyHeartBeatTask@c912.run");
                    boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                    try {
                        try {
                            AVMDLDataLoader aVMDLDataLoader2 = this.LL;
                            if (aVMDLDataLoader2 != null) {
                                aVMDLDataLoader2.onLogInfo(70, 0, aVMDLDataLoader2.getStringValue(1011));
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            int i2 = C2187451AjH.LIZ;
                            TTVideoEngineLog.d(e);
                        }
                    } finally {
                    }
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                    C1C7U.LIZIZ("InnerMDLHeartBeat$MyHeartBeatTask@c912.run");
                }

                {
                    this.LL = aVMDLDataLoader;
                }
            };
            PthreadTimer pthreadTimer = new PthreadTimer("InnerMDLHeartBeat");
            this.LIZ = pthreadTimer;
            long j = i;
            pthreadTimer.schedule(this.LIZIZ, j, j);
        }
    }
}
