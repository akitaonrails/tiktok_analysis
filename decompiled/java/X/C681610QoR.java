package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0QoR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C681610QoR {
    public final boolean LIZ;
    public final InterfaceC497601wk LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public final C099F LJIILJJIL = C090F.LIZIZ();
    public final boolean LJIILL = C301320BrW.LIZ();

    public final void LIZLLL() {
        if (this.LJIILL && this.LIZ && !this.LIZJ) {
            this.LIZLLL = -1;
            this.LJIILJJIL.LJJLIIIJILLIZJL(Unit.LIZ);
            LIZIZ(System.currentTimeMillis());
        }
    }

    public static void LIZJ(C681610QoR c681610QoR) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c681610QoR.LJIILL && c681610QoR.LIZ && !c681610QoR.LIZJ) {
            c681610QoR.LJFF = jCurrentTimeMillis;
        }
    }

    public final void LIZ(long j) {
        if (!this.LJIILL || this.LJIIIZ) {
            return;
        }
        this.LJIIIZ = true;
        this.LJIIJ = j;
        C23250099c.LIZLLL(this.LIZIZ, C0PEM.LIZJ, null, new C681600QoQ(this, null), 2);
    }

    public final void LIZIZ(long j) {
        if (!this.LJIILL || !this.LIZ || this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        this.LJI = j;
        C23250099c.LIZLLL(this.LIZIZ, C0PEM.LIZJ, null, new C681590QoP(this, null), 2);
    }

    public C681610QoR(LifecycleCoroutineScope lifecycleCoroutineScope, boolean z) {
        this.LIZ = z;
        this.LIZIZ = lifecycleCoroutineScope;
    }
}
