package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.videoarch.liveplayer.VideoLiveManager;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0oNV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1470830oNV extends AbstractC1470550oN3<C1470760oNO> implements InterfaceC1470060oMG {
    @Override // X.InterfaceC1470060oMG
    public final void release() {
        C1481110oe5.LIZIZ("VideoLiveManager_TTKPlayer", "LiveReleaseProcessPlugin release");
        VideoLiveManager videoLiveManager = (VideoLiveManager) this.LIZIZ;
        final InterfaceC1467950oIr interfaceC1467950oIr = videoLiveManager.LIZ;
        if (!videoLiveManager.j1) {
            if (interfaceC1467950oIr != null) {
                ((C1470430oMr) interfaceC1467950oIr).release();
                return;
            }
            return;
        }
        Runnable runnable = new Runnable(interfaceC1467950oIr) { // from class: X.0oMV
            public InterfaceC1470080oMI LL;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LiveReleaseProcessPlugin$MyReleaseRunnable@b69b.run");
                try {
                    if (this.LL != null) {
                        try {
                            C1698940uJQ.LIZJ();
                            this.LL.release();
                            this.LL = null;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            e.toString();
                            C1698940uJQ.LIZJ();
                        }
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LiveReleaseProcessPlugin$MyReleaseRunnable@b69b.run");
            }

            {
                this.LL = interfaceC1467950oIr;
            }
        };
        if (C1470860oNY.LIZ == null && C1470860oNY.LIZ == null) {
            synchronized (C1470860oNY.class) {
                try {
                    if (C1470860oNY.LIZ == null) {
                        if (C1470860oNY.LIZJ == null) {
                            C1470870oNZ c1470870oNZ = new C1470870oNZ();
                            C1470860oNY.LIZJ = c1470870oNZ;
                            c1470870oNZ.LIZ = -20;
                            c1470870oNZ.LIZIZ = 1;
                            c1470870oNZ.LIZJ = 2;
                        }
                        C1470870oNZ c1470870oNZ2 = C1470860oNY.LIZJ;
                        C1470860oNY.LIZ = new C822650WOx(c1470870oNZ2.LIZIZ, c1470870oNZ2.LIZJ, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: X.0oNW
                            @Override // java.util.concurrent.ThreadFactory
                            public final Thread newThread(Runnable runnable2) {
                                return new BPEAThread(new RunnableC788190Uvx(runnable2, C1470860oNY.LIZJ.LIZ), "VideoLiveManager-H");
                            }
                        });
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C1470860oNY.LIZ.submit(runnable);
    }

    public C1470830oNV(C1470760oNO c1470760oNO, InterfaceC1469660oLc interfaceC1469660oLc) {
        super(c1470760oNO, interfaceC1469660oLc);
    }
}
