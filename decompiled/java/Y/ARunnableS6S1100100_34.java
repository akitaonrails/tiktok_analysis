package Y;

import X.C0V1A;
import X.C1C7U;
import X.C2209791BeD;
import X.C2210121Bek;
import X.C2210511BfN;
import X.C786410Ut5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public class ARunnableS6S1100100_34 implements Runnable {
    public final int $t;
    public long j2;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C2209791BeD c2209791BeD = ((C2210511BfN) this.l1).LJIIIZ.LJJZZI;
        List<String> list = C2210511BfN.LJIIL;
        c2209791BeD.LJIIIZ(0, list, "[Task] onExitBg", new Object[0]);
        C2210511BfN c2210511BfN = (C2210511BfN) this.l1;
        if (c2210511BfN.LIZJ) {
            c2210511BfN.LIZJ = false;
            C0V1A.LIZJ().removeCallbacks(((C2210511BfN) this.l1).LJIIJJI);
            C0V1A.LIZJ().removeCallbacks(((C2210511BfN) this.l1).LJIIJ);
            ((C2210511BfN) this.l1).LIZ().removeMessages(1);
            ((C2210511BfN) this.l1).LJI.LIZ();
            C2210511BfN c2210511BfN2 = (C2210511BfN) this.l1;
            if (c2210511BfN2.LIZ) {
                if (this.j2 - c2210511BfN2.LIZLLL <= 30000) {
                    c2210511BfN2.LJIIIZ.LJJZZI.LJIIIZ(0, list, "[Task] time diff is less than 30000 , so clear current session", new Object[0]);
                    ((ArrayList) ((C2210511BfN) this.l1).LJII).clear();
                    ((C2210511BfN) this.l1).LJ = null;
                } else {
                    if (c2210511BfN2.LJ != null) {
                        c2210511BfN2.LJIIIZ.LJJZZI.LJIIIZ(0, list, "[Task] close current session", new Object[0]);
                        if (((C2210511BfN) this.l1).LIZIZ) {
                            C2210121Bek c2210121Bek = ((C2210511BfN) this.l1).LJ;
                            String str = this.s0;
                            c2210121Bek.LJ = true;
                            c2210121Bek.LJFF = str;
                            c2210121Bek.LJII = this.j2;
                        }
                        C2210511BfN c2210511BfN3 = (C2210511BfN) this.l1;
                        c2210511BfN3.LJI.LIZJ(c2210511BfN3.LJ);
                        ((C2210511BfN) this.l1).LJ = null;
                    }
                    ((C2210511BfN) this.l1).LJIIJJI.run();
                }
            }
            C2210511BfN c2210511BfN4 = (C2210511BfN) this.l1;
            c2210511BfN4.LIZ = false;
            ((ArrayList) c2210511BfN4.LJII).clear();
            c2210511BfN4.LJIIIIZZ = false;
        }
    }

    public final void LIZ$1() {
        C2209791BeD c2209791BeD = ((C2210511BfN) this.l1).LJIIIZ.LJJZZI;
        List<String> list = C2210511BfN.LJIIL;
        c2209791BeD.LJIIIZ(0, list, "[Task] onEnterBg", new Object[0]);
        C2210511BfN c2210511BfN = (C2210511BfN) this.l1;
        if (c2210511BfN.LIZJ) {
            return;
        }
        c2210511BfN.LIZ = false;
        ((ArrayList) c2210511BfN.LJII).clear();
        c2210511BfN.LJIIIIZZ = false;
        C0V1A c0v1aLIZJ = C0V1A.LIZJ();
        ARunnableS134S0100000_34 aRunnableS134S0100000_34 = ((C2210511BfN) this.l1).LJIIJJI;
        if (aRunnableS134S0100000_34 != null) {
            c0v1aLIZJ.removeCallbacks(aRunnableS134S0100000_34);
            C786410Ut5.LJLIIL(30010L, c0v1aLIZJ.LIZLLL(), aRunnableS134S0100000_34);
        } else {
            c0v1aLIZJ.getClass();
        }
        C2210511BfN c2210511BfN2 = (C2210511BfN) this.l1;
        c2210511BfN2.LIZLLL = this.j2;
        c2210511BfN2.LIZJ = true;
        if (c2210511BfN2.LIZIZ) {
            C2210511BfN c2210511BfN3 = (C2210511BfN) this.l1;
            c2210511BfN3.LIZ = true;
            if (c2210511BfN3.LJ != null) {
                c2210511BfN3.LJIIIZ.LJJZZI.LJ(0, list, "[Task] enter bg , bug there is already a bg task is running", new Object[0]);
            }
            ((C2210511BfN) this.l1).LJIIIZ.LJJZZI.LJIIIZ(0, list, "[Task] task is running , so create a new task session", new Object[0]);
            C2210511BfN c2210511BfN4 = (C2210511BfN) this.l1;
            c2210511BfN4.LJ = new C2210121Bek(this.j2, c2210511BfN4.LJIIIZ.LLLFZ());
            C2210511BfN c2210511BfN5 = (C2210511BfN) this.l1;
            C2210121Bek c2210121Bek = c2210511BfN5.LJ;
            String str = this.s0;
            c2210121Bek.LIZJ = true;
            c2210121Bek.LIZLLL = str;
            c2210511BfN5.LIZIZ(c2210121Bek.LIZIZ);
        }
    }

    public static final void run$0(ARunnableS6S1100100_34 aRunnableS6S1100100_34) {
        boolean zLIZ;
        C1C7U.LIZ("TaskPresenter@6a7b.onExitBg$1");
        try {
            aRunnableS6S1100100_34.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TaskPresenter@6a7b.onExitBg$1");
    }

    public static final void run$1(ARunnableS6S1100100_34 aRunnableS6S1100100_34) {
        boolean zLIZ;
        C1C7U.LIZ("TaskPresenter@6a7b.onEnterBg$1");
        try {
            aRunnableS6S1100100_34.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TaskPresenter@6a7b.onEnterBg$1");
    }

    public ARunnableS6S1100100_34(C2210511BfN c2210511BfN, long j, String str, int i) {
        this.$t = i;
        this.l1 = c2210511BfN;
        this.j2 = j;
        this.s0 = str;
    }
}
