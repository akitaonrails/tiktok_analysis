package X;

import Y.ARunnableS103S0100000_3;
import Y.ARunnableS11S0201000_3;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Choreographer;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import java.util.ArrayList;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.08Gu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2090208Gu {
    public static long LIZ = 0;
    public static long LIZIZ = 0;
    public static boolean LIZJ = true;
    public static boolean LIZLLL;

    public static void LIZ() {
        boolean z;
        if (LIZ == 0) {
            z = false;
        } else if (SystemClock.elapsedRealtime() - LIZ < 3000) {
            z = true;
        } else {
            LIZ = 0L;
            z = false;
        }
        if (z) {
            LIZJ = true;
            LIZIZ++;
            return;
        }
        if (C2090408Gw.LJ) {
            boolean z2 = LIZIZ % ((long) C2090408Gw.LIZJ) != 0;
            LIZJ = z2;
            if (C2090608Gy.LIZJ) {
                LIZJ = false;
                C2090608Gy.LIZJ = false;
            } else if (!z2) {
                if (C2090608Gy.LIZ && C2090408Gw.LIZLLL && LIZIZ % 2 == 0) {
                    C2090608Gy.LIZJ = true;
                    LIZJ = true;
                }
                if (LIZIZ > 180) {
                    LIZIZ = C2090408Gw.LIZJ;
                    C2090608Gy.LIZ = false;
                    C2090608Gy.LIZIZ = 0L;
                    C2090608Gy.LIZJ = false;
                    C2090608Gy.LIZLLL = 0;
                }
            }
        } else {
            long j = LIZIZ;
            long j2 = C2090408Gw.LIZJ;
            boolean z3 = j % j2 == 0;
            LIZJ = z3;
            if (LIZIZ > 180 && z3) {
                LIZIZ = j2;
                C2090608Gy.LIZ = false;
                C2090608Gy.LIZIZ = 0L;
                C2090608Gy.LIZJ = false;
                C2090608Gy.LIZLLL = 0;
            }
        }
        LIZIZ++;
    }

    public static void LIZIZ() {
        if (C2090408Gw.LIZ) {
            C08GF c08gfLIZ = C08GF.LIZ();
            C08GI c08gi = new C08GI() { // from class: X.08Gz
                @Override // X.C08GI
                public final void LIZ() {
                }
            };
            C08GG c08gg = c08gfLIZ.LIZIZ;
            if (c08gg == null) {
                C786410Ut5.LJLIIL(0L, c08gfLIZ.LIZ, new ARunnableS103S0100000_3(c08gi, 142));
            } else {
                int i = c08gg.LIZLLL;
                if (i != 1) {
                    if (i == 2) {
                        C786410Ut5.LJLIIL(0L, C08GF.LIZ().LIZ, new ARunnableS103S0100000_3(c08gi, 159));
                    } else if (i != 3) {
                        Choreographer choreographerV2 = C786410Ut5.v2();
                        if (choreographerV2 == null) {
                            c08gg.LIZLLL = 3;
                            C786410Ut5.LJLIIL(0L, C08GF.LIZ().LIZ, new ARunnableS103S0100000_3(c08gi, 161));
                        } else {
                            c08gg.LIZLLL = 1;
                            if (!((LinkedList) c08gg.LIZJ).contains(c08gi)) {
                                ((LinkedList) c08gg.LIZJ).add(c08gi);
                            }
                            if (c08gg.LIZ) {
                                ARunnableS11S0201000_3 aRunnableS11S0201000_3 = new ARunnableS11S0201000_3(choreographerV2, c08gg, 3);
                                C08GF.LIZ().getClass();
                                new BPEAThread(aRunnableS11S0201000_3, "VInjector").start();
                            } else {
                                Pair<C08GC, Boolean> pairLIZIZ = c08gg.LIZIZ(1, choreographerV2);
                                if (((Boolean) pairLIZIZ.second).booleanValue()) {
                                    c08gg.LIZ(1, (C08GC) pairLIZIZ.first);
                                }
                            }
                        }
                    } else {
                        C786410Ut5.LJLIIL(0L, C08GF.LIZ().LIZ, new ARunnableS103S0100000_3(c08gi, 160));
                    }
                } else if (!((LinkedList) c08gg.LIZJ).contains(c08gi)) {
                    ((LinkedList) c08gg.LIZJ).add(c08gi);
                }
            }
            C08GF c08gfLIZ2 = C08GF.LIZ();
            C08GE c08ge = new C08GE() { // from class: X.08Gx
                @Override // X.C08GE
                public final void LIZ() {
                    if (C2090208Gu.LIZLLL) {
                        C2090208Gu.LIZ();
                    }
                }
            };
            C08GG c08gg2 = c08gfLIZ2.LIZIZ;
            if (c08gg2 != null && c08gg2.LIZLLL != 3 && !((ArrayList) c08gfLIZ2.LIZJ).contains(c08ge)) {
                ((ArrayList) c08gfLIZ2.LIZJ).add(c08ge);
            }
            LIZLLL = true;
        }
    }
}
