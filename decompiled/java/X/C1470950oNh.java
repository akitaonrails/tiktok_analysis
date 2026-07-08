package X;

import Y.ARunnableS123S0100000_23;
import android.os.Looper;
import android.view.SurfaceControl;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttm.player.TTPlayer;
import com.ss.ttm.player.TTPlayerSurface;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.0oNh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1470950oNh implements InterfaceC1471080oNu {
    public final InterfaceC1471120oNy LIZ;
    public volatile long LIZIZ;
    public volatile TTPlayerSurface LIZJ;
    public volatile int LJI;
    public final ReentrantReadWriteLock LIZLLL = new ReentrantReadWriteLock();
    public volatile int LJ = 0;
    public volatile SurfaceControl LJFF = null;
    public volatile int LJII = -1;
    public final Object LJIIIIZZ = new Object();
    public volatile boolean LJIIIZ = false;
    public volatile int LJIIJ = -1;
    public final C1470970oNj LJIIJJI = new C1470970oNj();
    public int LJIIL = 0;
    public int LJIILIIL = 0;
    public int LJIILJJIL = 0;
    public final BPEAHandler LJIILL = new BPEAHandler(Looper.getMainLooper());

    public final boolean LIZ() {
        C1285330jYJ.LIZ(4, "core", this.LIZIZ, "start bind to core");
        boolean z = true;
        this.LJIIJJI.LJIIJ.set(true);
        try {
            C1470970oNj c1470970oNj = this.LJIIJJI;
            if (c1470970oNj.LIZIZ() && c1470970oNj.LIZLLL < 0) {
                c1470970oNj.LIZLLL = System.currentTimeMillis();
            }
            this.LIZLLL.writeLock().lock();
            if (this.LIZJ == null) {
                this.LIZJ = C1471030oNp.LIZ.LIZ(this);
            }
            TTPlayerSurface tTPlayerSurface = this.LIZJ;
            if (tTPlayerSurface != null) {
                C1470970oNj c1470970oNj2 = this.LJIIJJI;
                if (c1470970oNj2.LIZIZ() && c1470970oNj2.LIZLLL > 0 && c1470970oNj2.LJ < 0) {
                    c1470970oNj2.LJ = System.currentTimeMillis() - c1470970oNj2.LIZLLL;
                }
            }
            this.LIZLLL.writeLock().unlock();
            long j = this.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bind status: ");
            sbLIZ.append(this.LJ);
            sbLIZ.append(", target: ");
            sbLIZ.append(tTPlayerSurface);
            C1285330jYJ.LIZ(4, "core", j, C2188811AlT.LIZIZ(sbLIZ));
            if (this.LJ == 0 && tTPlayerSurface != null && tTPlayerSurface.isValid()) {
                this.LJ = 1;
                C1470970oNj c1470970oNj3 = this.LJIIJJI;
                if (c1470970oNj3.LIZIZ() && c1470970oNj3.LIZIZ < 0) {
                    c1470970oNj3.LIZIZ = System.currentTimeMillis();
                }
                if (!this.LJIIIZ) {
                    long j2 = ((C1471020oNo) this.LIZ).LIZ.LIZ;
                    if (j2 != 0) {
                        TTPlayer._setLayerCallback(j2, 0);
                    }
                    this.LJIIIZ = true;
                }
                int iLJJIJIL = ((C1471020oNo) this.LIZ).LIZ.LJJIJIL(tTPlayerSurface);
                this.LJ = 2;
                C1470970oNj c1470970oNj4 = this.LJIIJJI;
                if (c1470970oNj4.LIZIZ()) {
                    if (c1470970oNj4.LIZIZ > 0 && c1470970oNj4.LIZJ < 0 && iLJJIJIL == 0) {
                        c1470970oNj4.LIZJ = System.currentTimeMillis() - c1470970oNj4.LIZIZ;
                    }
                    c1470970oNj4.LJIIIIZZ = iLJJIJIL;
                }
            } else {
                z = false;
            }
            long j3 = this.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("bind finish, bind: ");
            sbLIZ2.append(z);
            C1285330jYJ.LIZ(4, "core", j3, C2188811AlT.LIZIZ(sbLIZ2));
            return z;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZLLL.writeLock().unlock();
            throw th;
        }
    }

    public final boolean LIZIZ() {
        try {
            this.LIZLLL.readLock().lock();
            boolean z = this.LIZJ != null;
            this.LIZLLL.readLock().unlock();
            return z;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZLLL.readLock().unlock();
            throw th;
        }
    }

    public final void LJFF() {
        if (this.LJIILIIL <= 0 || LIZIZ()) {
            try {
                this.LIZLLL.writeLock().lock();
                TTPlayerSurface tTPlayerSurface = null;
                if (this.LIZJ != null) {
                    TTPlayerSurface tTPlayerSurface2 = this.LIZJ;
                    this.LIZJ = null;
                    tTPlayerSurface = tTPlayerSurface2;
                }
                if (this.LJIILIIL > 0) {
                    ((C1471020oNo) this.LIZ).getClass();
                    TTPlayer._setLayerCallback(0L, 0);
                    this.LJIIIZ = false;
                }
                this.LJ = 0;
                this.LIZLLL.writeLock().unlock();
                LIZLLL(tTPlayerSurface, 0);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZLLL.writeLock().unlock();
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1471080oNu
    public final long getNativeHandle() {
        return this.LIZIZ;
    }

    public C1470950oNh(C1471020oNo c1471020oNo) {
        this.LIZ = c1471020oNo;
    }

    public final void LIZJ(int i) {
        if ((i & this.LJIILIIL) > 0 && LIZIZ()) {
            LJFF();
        }
    }

    public final void LIZLLL(TTPlayerSurface tTPlayerSurface, int i) {
        if (tTPlayerSurface == null) {
            return;
        }
        synchronized (this.LJIIIIZZ) {
            try {
                this.LJFF = null;
                if (this.LJIIL == 2) {
                    C1285330jYJ.LIZ(4, "core", this.LIZIZ, "execute releaseSurface in main thread");
                    C786410Ut5.LJJZZIII(this.LJIILL, new ARunnableS123S0100000_23(tTPlayerSurface, i, 167));
                } else {
                    C1471030oNp.LIZ.LIZJ(tTPlayerSurface);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJ(int i, int i2) {
        switch (i) {
            case 3:
                this.LJIIJJI.LJIIIZ = true;
                break;
            case 43343:
                this.LJIIL = i2;
                break;
            case 43360:
                this.LJIILIIL = i2;
                break;
            case 43364:
                this.LJIILJJIL = i2;
                break;
            case 43365:
                this.LJIIJJI.LJIIJJI.set(true);
                break;
        }
    }
}
