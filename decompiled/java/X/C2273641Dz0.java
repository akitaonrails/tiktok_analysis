package X;

import Y.ARunnableS46S0101000_35;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.otis.resource.psi.ResourceContentionConfig;
import com.bytedance.otis.resource.psi.ResourceContentionSnapshot;
import com.bytedance.otis.resource.psi.ResourcePsiListener;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1Dz0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2273641Dz0 {
    public final C2273631Dyz LIZ;
    public final ResourceContentionConfig LIZIZ;
    public final ResourcePsiListener LIZJ;
    public HandlerThread LIZLLL;
    public BPEAHandler LJ;
    public C2273611Dyx LJI;
    public long LJII;
    public volatile boolean LJIIIIZZ;
    public volatile int LJIIIZ;
    public volatile ResourceContentionSnapshot LJIIL;
    public final Object LJFF = new Object();
    public volatile boolean LJIIJ = true;
    public volatile boolean LJIIJJI = false;

    public final void LIZIZ() {
        if (this.LJIIIIZZ) {
            return;
        }
        this.LJIIIIZZ = true;
        int i = this.LJIIIZ + 1;
        this.LJIIIZ = i;
        HandlerThread handlerThread = new HandlerThread("resource-psi-global");
        this.LIZLLL = handlerThread;
        handlerThread.start();
        this.LJ = new BPEAHandler(C786410Ut5.W2(this.LIZLLL));
        synchronized (this.LJFF) {
            try {
                this.LJI = this.LIZ.LJIIIIZZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C786410Ut5.LJLIIL(this.LIZIZ.globalWindowMs, this.LJ, new ARunnableS46S0101000_35(this, i, 7));
    }

    public final void LIZ(int i) {
        BPEAHandler bPEAHandler;
        ARunnableS46S0101000_35 aRunnableS46S0101000_35;
        boolean z;
        ResourceContentionSnapshot resourceContentionSnapshotLIZJ;
        ResourcePsiListener resourcePsiListener;
        if (this.LJIIIIZZ && i == this.LJIIIZ) {
            try {
                C2273611Dyx c2273611DyxLJIIIIZZ = this.LIZ.LJIIIIZZ();
                boolean z2 = true;
                if (this.LJIIJ && !this.LJIIJJI) {
                    z = true;
                } else {
                    z = false;
                }
                this.LJIIJJI = false;
                if (!this.LIZIZ.foregroundOnly || z) {
                    z2 = false;
                }
                synchronized (this.LJFF) {
                    try {
                        C2273611Dyx c2273611Dyx = this.LJI;
                        if (z2 || c2273611Dyx == null) {
                            resourceContentionSnapshotLIZJ = null;
                        } else {
                            ResourceContentionConfig resourceContentionConfig = this.LIZIZ;
                            long j = this.LJII + 1;
                            this.LJII = j;
                            resourceContentionSnapshotLIZJ = C2273611Dyx.LIZJ(c2273611Dyx, c2273611DyxLJIIIIZZ, resourceContentionConfig, "__global__", j, z);
                            this.LJIIL = resourceContentionSnapshotLIZJ;
                        }
                        this.LJI = c2273611DyxLJIIIIZZ;
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                if (resourceContentionSnapshotLIZJ != null && (resourcePsiListener = this.LIZJ) != null) {
                    try {
                        resourcePsiListener.onSnapshot(resourceContentionSnapshotLIZJ);
                    } catch (Throwable th) {
                    }
                }
                bPEAHandler = this.LJ;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                bPEAHandler = this.LJ;
                if (this.LJIIIIZZ && i == this.LJIIIZ && bPEAHandler != null) {
                    aRunnableS46S0101000_35 = new ARunnableS46S0101000_35(this, i, 8);
                } else {
                    return;
                }
            }
            if (this.LJIIIIZZ && i == this.LJIIIZ && bPEAHandler != null) {
                aRunnableS46S0101000_35 = new ARunnableS46S0101000_35(this, i, 8);
                C786410Ut5.LJLIIL(this.LIZIZ.globalWindowMs, bPEAHandler, aRunnableS46S0101000_35);
            }
        }
    }

    public C2273641Dz0(C2273631Dyz c2273631Dyz, ResourceContentionConfig resourceContentionConfig, C2273691Dz5 c2273691Dz5) {
        this.LIZ = c2273631Dyz;
        this.LIZIZ = resourceContentionConfig;
        this.LIZJ = c2273691Dz5;
    }
}
