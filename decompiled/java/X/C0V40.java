package X;

import Y.ARunnableS113S0100000_13;
import android.app.Activity;
import android.os.Bundle;
import android.os.Message;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: renamed from: X.0V40, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V40 extends AbstractC791320V2k implements InterfaceC792700V7s, InterfaceC791720V3y {
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public final C0V41 LLILZ = C0V41.LIZJ();

    @Override // X.InterfaceC792700V7s
    public final void LJ() {
    }

    @Override // X.InterfaceC792700V7s
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC792700V7s
    public final void LJIIJ(Activity activity) {
    }

    @Override // X.InterfaceC792700V7s
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // X.InterfaceC792700V7s
    public final void onActivityStarted(Activity activity) {
    }

    @Override // X.InterfaceC791720V3y
    public final void LIZIZ(C791670V3t c791670V3t) {
        boolean z;
        long j = c791670V3t.LJIIJJI;
        long j2 = c791670V3t.LJII;
        boolean z2 = c791670V3t.LJ;
        boolean z3 = c791670V3t.LIZLLL;
        this.LLILZ.LJIIJJI = z2;
        C0V41 c0v41 = this.LLILZ;
        c0v41.getClass();
        if (j < 70) {
            j = 2500;
        }
        c0v41.LIZJ = j;
        if (c0v41.LIZLLL < j) {
            c0v41.LIZLLL = j + 50;
        }
        C0V41 c0v412 = this.LLILZ;
        long j3 = c0v412.LIZJ;
        if (j2 < j3) {
            j2 = Mp4ScreenVideoLoadTimeout.CONTROL;
        }
        c0v412.LIZLLL = j2;
        if (j2 < j3) {
            c0v412.LIZLLL = j3 + 50;
        }
        c0v412.LJ = z3;
        c0v412.LJIIL = c791670V3t.LJIILIIL;
        if (!C792400V6o.LJIJI && !c791670V3t.LJI) {
            z = false;
        } else {
            z = true;
        }
        c0v412.LJIILIIL = z;
    }

    @Override // X.InterfaceC792700V7s
    public final void LIZLLL(Activity activity) {
        if (this.LLILLJJLI && !this.LLILLL) {
            this.LLILLL = true;
            C792400V6o.LJIIIIZZ();
        }
    }

    @Override // X.InterfaceC792700V7s
    public final void LJII(Activity activity) throws Throwable {
        if (this.LLILLL) {
            this.LLILLL = false;
            this.LLILZ.LJFF(false);
            C792400V6o.LJIIIIZZ();
        }
    }

    @Override // X.AbstractC791320V2k
    public final void LJIILJJIL(String str) {
        this.LL = true;
        if (this.LLILLL) {
            C0V41 c0v41 = this.LLILZ;
            c0v41.getClass();
            try {
                if (c0v41.LIZ.LIZLLL != null) {
                    if (c0v41.LJIIIZ != null && C791390V2r.LJJIII.LIZIZ.LIZIZ()) {
                        c0v41.LJIIIZ.LJ = true;
                    }
                    C0V42 c0v42 = c0v41.LJIIIIZZ;
                    if (c0v42 == null) {
                        c0v41.LJIIIIZZ = new C0V42(AbstractC791470V2z.LIZIZ, str);
                    } else {
                        c0v42.LJI = AbstractC791470V2z.LIZIZ;
                        c0v42.LIZIZ = str;
                        c0v42.LJII = -1L;
                        c0v42.LIZ = false;
                    }
                    if (c0v41.LJ && c0v41.LJIIL) {
                        C0V3G c0v3g = c0v41.LIZ;
                        ARunnableS113S0100000_13 aRunnableS113S0100000_13 = c0v41.LJIIZILJ;
                        c0v3g.LIZIZ(Message.obtain(c0v3g.LIZLLL, aRunnableS113S0100000_13), c0v41.LIZJ);
                        if (c0v41.LIZIZ && c0v41.LJIILIIL) {
                            C0V3G c0v3g2 = c0v41.LIZ;
                            ARunnableS113S0100000_13 aRunnableS113S0100000_132 = c0v41.LJIJ;
                            c0v3g2.LIZIZ(Message.obtain(c0v3g2.LIZLLL, aRunnableS113S0100000_132), c0v41.LIZLLL);
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.AbstractC791320V2k
    public final void LJIILL(long j, long j2, long j3, long j4, boolean z) throws Throwable {
        this.LL = false;
        if (this.LLILLL) {
            this.LLILZ.LJFF(z);
        }
    }
}
