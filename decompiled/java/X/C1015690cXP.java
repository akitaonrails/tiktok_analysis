package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0cXP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1015690cXP {
    public final AtomicInteger LIZ = new AtomicInteger(0);
    public final AtomicInteger LIZIZ = new AtomicInteger(0);
    public final AtomicInteger LIZJ = new AtomicInteger(0);
    public final AtomicInteger LIZLLL = new AtomicInteger(0);
    public final AtomicInteger LJ = new AtomicInteger(0);
    public final float LJFF;
    public C19JY LJI;
    public InterfaceC1015670cXN LJII;

    public final void LIZIZ() {
        C19JY c19jy;
        this.LIZLLL.incrementAndGet();
        if (this.LIZLLL.get() == 1) {
            synchronized (this) {
                try {
                    if (this.LIZLLL.get() == 1 && (c19jy = this.LJI) != null) {
                        c19jy.LJII();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public C1015690cXP(float f) {
        this.LJFF = f;
    }

    public final void LIZ(C19JH c19jh) {
        int iIncrementAndGet = this.LJ.incrementAndGet();
        if (iIncrementAndGet > this.LIZIZ.get() - this.LIZ.get()) {
            synchronized (this) {
                try {
                    if (iIncrementAndGet > this.LIZIZ.get() - this.LIZ.get() && this.LJII != null) {
                        C1015660cXM c1015660cXM = new C1015660cXM();
                        c1015660cXM.LIZ = -3;
                        c1015660cXM.LIZIZ = "image download fail";
                        c19jh.getClass();
                        c1015660cXM.LIZJ = C19JH.LJI(c19jh);
                        this.LJII.LIZ(c1015660cXM);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void LIZJ(C19JH c19jh) {
        if (this.LIZJ.incrementAndGet() == this.LIZ.get()) {
            synchronized (this) {
                try {
                    if (this.LIZJ.get() == this.LIZ.get()) {
                        C19JY c19jy = this.LJI;
                        if (c19jy != null) {
                            c19jy.LJFF();
                        }
                        if (this.LJII != null) {
                            C1015660cXM c1015660cXM = new C1015660cXM();
                            c1015660cXM.LIZ = 0;
                            c19jh.getClass();
                            c1015660cXM.LIZJ = C19JH.LJI(c19jh);
                            this.LJII.LIZ(c1015660cXM);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
