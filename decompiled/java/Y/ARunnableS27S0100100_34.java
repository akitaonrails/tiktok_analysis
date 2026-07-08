package Y;

import X.C0V1A;
import X.C1077210e8d;
import X.C1C7U;
import X.C2188811AlT;
import X.C2209791BeD;
import X.C2209951BeT;
import X.C2210121Bek;
import X.C2210511BfN;
import X.C2212931BjH;
import X.C786410Ut5;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public class ARunnableS27S0100100_34 implements Runnable {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (((C2210511BfN) this.l0).LIZIZ) {
            return;
        }
        C2209791BeD c2209791BeD = ((C2210511BfN) this.l0).LJIIIZ.LJJZZI;
        List<String> list = C2210511BfN.LJIIL;
        c2209791BeD.LJIIIZ(0, list, "[Task] onTaskResume", new Object[0]);
        ((C2210511BfN) this.l0).LIZIZ = true;
        C2210511BfN c2210511BfN = (C2210511BfN) this.l0;
        if (c2210511BfN.LIZJ) {
            c2210511BfN.LIZ = true;
            C2210121Bek c2210121Bek = c2210511BfN.LJ;
            if (c2210121Bek == null) {
                c2210511BfN.LJIIIZ.LJJZZI.LJIIIZ(0, list, "[Task] pure bg launch , so create a new task session", new Object[0]);
                C2210511BfN c2210511BfN2 = (C2210511BfN) this.l0;
                c2210511BfN2.LJ = new C2210121Bek(this.j1, c2210511BfN2.LJIIIZ.LLLFZ());
                ((C2210511BfN) this.l0).LJI.LIZ();
                C2210511BfN c2210511BfN3 = (C2210511BfN) this.l0;
                c2210511BfN3.LIZIZ(c2210511BfN3.LJ.LIZIZ);
                return;
            }
            long j = this.j1 - c2210121Bek.LJII;
            if (j > 15000) {
                C2209791BeD c2209791BeD2 = c2210511BfN.LJIIIZ.LJJZZI;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[Task] task time diff ");
                sbLIZ.append(j);
                sbLIZ.append(" , is bigger than ");
                sbLIZ.append(15000L);
                sbLIZ.append(" so close current session and create new session");
                c2209791BeD2.LJIIIZ(0, list, C2188811AlT.LIZIZ(sbLIZ), new Object[0]);
                C0V1A.LIZJ().removeCallbacks(((C2210511BfN) this.l0).LJIIJ);
                ((C2210511BfN) this.l0).LJIIJ.run();
                C2210511BfN c2210511BfN4 = (C2210511BfN) this.l0;
                c2210511BfN4.LJ = new C2210121Bek(this.j1, c2210511BfN4.LJIIIZ.LLLFZ());
                ((C2210511BfN) this.l0).LJI.LIZ();
                C2210511BfN c2210511BfN5 = (C2210511BfN) this.l0;
                c2210511BfN5.LIZIZ(c2210511BfN5.LJ.LIZIZ);
                return;
            }
            C2209791BeD c2209791BeD3 = c2210511BfN.LJIIIZ.LJJZZI;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[Task] task time diff ");
            sbLIZ2.append(j);
            sbLIZ2.append(" , is less than ");
            sbLIZ2.append(15000L);
            sbLIZ2.append(" so , merge in previous session");
            c2209791BeD3.LJIIIZ(0, list, C2188811AlT.LIZIZ(sbLIZ2), new Object[0]);
            C0V1A.LIZJ().removeCallbacks(((C2210511BfN) this.l0).LJIIJ);
            C2210511BfN c2210511BfN6 = (C2210511BfN) this.l0;
            C2210121Bek c2210121Bek2 = c2210511BfN6.LJ;
            c2210121Bek2.LJIIIIZZ += j;
            c2210121Bek2.LJII = this.j1;
            c2210511BfN6.LJI.LIZLLL(c2210121Bek2);
            C2210511BfN c2210511BfN7 = (C2210511BfN) this.l0;
            c2210511BfN7.LIZIZ(c2210511BfN7.LJ.LIZIZ);
        }
    }

    public final void LIZ$1() {
        if (((C2210511BfN) this.l0).LIZIZ) {
            C2209791BeD c2209791BeD = ((C2210511BfN) this.l0).LJIIIZ.LJJZZI;
            List<String> list = C2210511BfN.LJIIL;
            c2209791BeD.LJIIIZ(0, list, "[Task] onTaskPause", new Object[0]);
            ((C2210511BfN) this.l0).LIZIZ = false;
            C2210511BfN c2210511BfN = (C2210511BfN) this.l0;
            if (c2210511BfN.LIZJ) {
                if (c2210511BfN.LJ == null) {
                    c2210511BfN.LJIIIZ.LJJZZI.LJ(0, list, "[Task] onTaskPause when bg, but no session available", new Object[0]);
                    return;
                }
                c2210511BfN.LJIIIZ.LJJZZI.LJIIIZ(0, list, "[Task] wait 15000 to close current session", new Object[0]);
                ((C2210511BfN) this.l0).LJ.LJII = this.j1;
                C0V1A c0v1aLIZJ = C0V1A.LIZJ();
                ARunnableS134S0100000_34 aRunnableS134S0100000_34 = ((C2210511BfN) this.l0).LJIIJ;
                if (aRunnableS134S0100000_34 != null) {
                    c0v1aLIZJ.removeCallbacks(aRunnableS134S0100000_34);
                    C786410Ut5.LJLIIL(15000L, c0v1aLIZJ.LIZLLL(), aRunnableS134S0100000_34);
                } else {
                    c0v1aLIZJ.getClass();
                }
                C2210511BfN c2210511BfN2 = (C2210511BfN) this.l0;
                c2210511BfN2.LJI.LIZLLL(c2210511BfN2.LJ);
                ((C2210511BfN) this.l0).LIZ().removeMessages(1);
                if (((C2210511BfN) this.l0).LJIIIZ.LJJIJ) {
                    C2210511BfN c2210511BfN3 = (C2210511BfN) this.l0;
                    C2209951BeT c2209951BeT = c2210511BfN3.LJI;
                    C2210121Bek c2210121Bek = c2210511BfN3.LJ;
                    if (c2210121Bek == null) {
                        c2209951BeT.getClass();
                        return;
                    }
                    c2209951BeT.LIZLLL.LJJZZI.LJIIIZ(0, C2209951BeT.LJ, "[Task] start to report session : {}", c2210121Bek);
                    if (c2209951BeT.LIZJ(c2210121Bek)) {
                        c2209951BeT.LIZ();
                        c2209951BeT.LIZLLL.LJJJIL();
                        C0V1A.LIZJ().removeCallbacks(((C2210511BfN) this.l0).LJIIJ);
                        ((C2210511BfN) this.l0).LJ = null;
                    }
                }
            }
        }
    }

    public static final void run$0(ARunnableS27S0100100_34 aRunnableS27S0100100_34) {
        boolean zLIZ;
        C1C7U.LIZ("TaskPresenter@6a7b.onTaskResume$1");
        try {
            aRunnableS27S0100100_34.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TaskPresenter@6a7b.onTaskResume$1");
    }

    public static final void run$1(ARunnableS27S0100100_34 aRunnableS27S0100100_34) {
        boolean zLIZ;
        C1C7U.LIZ("TaskPresenter@6a7b.onTaskPause$1");
        try {
            aRunnableS27S0100100_34.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TaskPresenter@6a7b.onTaskPause$1");
    }

    public static final void run$2(ARunnableS27S0100100_34 aRunnableS27S0100100_34) {
        C2212931BjH c2212931BjH = (C2212931BjH) aRunnableS27S0100100_34.l0;
        long j = aRunnableS27S0100100_34.j1;
        c2212931BjH.getClass();
        C1C7U.LIZ("BDASplashView2@ed0a.onSplashRealShow$1L");
        long jMin = Math.min(c2212931BjH.LLJLIL.LJII(), j);
        PthreadTimer pthreadTimer = c2212931BjH.LLJZIJLIL;
        if (pthreadTimer != null) {
            pthreadTimer.cancel();
        }
        c2212931BjH.LLJJJJJIL = jMin;
        int i = (int) (jMin / 1000);
        c2212931BjH.LLJZ = i;
        c2212931BjH.LLJJ.setText(c2212931BjH.LJI(i));
        c2212931BjH.LLJLL.removeMessages(1);
        c2212931BjH.LLJLL.sendEmptyMessageDelayed(1, c2212931BjH.LLJJJJJIL);
        c2212931BjH.LLJZIJLIL = null;
        PthreadTimer pthreadTimer2 = new PthreadTimer("DASplashView2");
        c2212931BjH.LLJZIJLIL = pthreadTimer2;
        pthreadTimer2.scheduleAtFixedRate(new C1077210e8d(c2212931BjH, 1), (c2212931BjH.LLJJJJJIL % 1000) + 1000, 1000L);
        C1C7U.LIZIZ("BDASplashView2@ed0a.onSplashRealShow$1L");
    }

    public ARunnableS27S0100100_34(Object obj, long j, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j1 = j;
    }
}
