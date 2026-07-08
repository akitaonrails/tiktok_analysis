package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13NL, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13NL extends C13NN<C13NR> {
    public static final C2278408wI LJIILIIL = new C2278408wI();
    public static final ConcurrentHashMap<String, C13NS> LJIILJJIL = new ConcurrentHashMap<>();
    public static final C563400M7u LJIILL = new C563400M7u(0);
    public static final C563400M7u LJIILLIIL = new C563400M7u(0);
    public final C13NN<C13NR> LJ;
    public final C13NQ LJFF;
    public final C20005913Pl LJI;
    public final C20008613Qm LJII;
    public final C20006313Pp LJIIIIZZ;
    public final C13RD LJIIIZ;
    public final C19999213Mw LJIIJ;
    public final C13N2 LJIIJJI;
    public C20005613Pi LJIIL;

    @Override // X.C13NN
    public final void LIZ() {
        this.LIZIZ = true;
        C13NN<C13NR> c13nn = this.LJ;
        if (c13nn != null) {
            c13nn.LIZ();
        }
        C20005613Pi c20005613Pi = this.LJIIL;
        if (c20005613Pi != null) {
            c20005613Pi.cancel();
        }
    }

    @Override // X.C13NN
    public final void LIZIZ() {
        Effect effect;
        String strLIZIZ;
        Exception exc;
        String name = null;
        try {
            try {
                C13NQ c13nq = this.LJFF;
                if (c13nq != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('[');
                    sbLIZ.append(c13nq.LIZ.getName());
                    sbLIZ.append("][SDK:");
                    C13NJ c13nj = c13nq.LIZLLL;
                    sbLIZ.append(c13nj != null ? Boolean.valueOf(c13nj.LIZ(c13nq.LIZ)) : null);
                    sbLIZ.append("][Parallel:");
                    C13NJ c13nj2 = c13nq.LIZLLL;
                    sbLIZ.append(c13nj2 != null ? Boolean.valueOf(c13nj2.LIZIZ(c13nq.LIZ)) : null);
                    sbLIZ.append(']');
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strLIZIZ = null;
                }
                C13SS c13ss = C13SS.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[Flow][Start]");
                sbLIZ2.append(strLIZIZ);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c13ss.getClass();
                C13SS.LJ("JKL", strLIZIZ2);
                LJIIIIZZ(this);
                LJIILJJIL();
                long jCurrentTimeMillis = System.currentTimeMillis();
                C13NQ c13nq2 = this.LJFF;
                if (c13nq2 != null) {
                    C20005613Pi c20005613PiLJIIJ = LJIIJ(this, c13nq2);
                    this.LJIIL = c20005613PiLJIIJ;
                    c20005613PiLJIIJ.LJIIZILJ = this.LJIIJJI;
                }
                C13NN<C13NR> c13nn = this.LJ;
                if (c13nn instanceof C19998913Mt) {
                    ((C19998913Mt) c13nn).LJIILIIL = this.LJIIJ;
                    ((C19998913Mt) c13nn).LJIILJJIL = this.LJIIJJI;
                }
                if (c13nn != null) {
                    c13nn.LIZIZ();
                }
                C13NQ c13nq3 = this.LJFF;
                if (c13nq3 != null) {
                    C13NJ c13nj3 = c13nq3.LIZLLL;
                    if (c13nj3 != null && c13nj3.LIZIZ(c13nq3.LIZ) && (exc = this.LJIIJJI.LIZ) != null) {
                        throw exc;
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("[Statistic][");
                    sbLIZ3.append(this.LJFF.LIZ.getName());
                    sbLIZ3.append("][Effect+Model][TotalDuration:");
                    sbLIZ3.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    sbLIZ3.append(']');
                    C13SS.LIZ("JKL", C2188811AlT.LIZIZ(sbLIZ3));
                }
                LJIIL(System.currentTimeMillis() - jCurrentTimeMillis);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                try {
                    C1662010tLr c1662010tLr = new C1662010tLr(e);
                    String str = c1662010tLr.LIZIZ;
                    if (str == null || str.length() == 0) {
                        c1662010tLr.LIZIZ = C08KG.LIZ(e);
                    }
                    C13SS c13ss2 = C13SS.LIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("[Flow][End][Fail][Effect+Model][");
                    C13NQ c13nq4 = this.LJFF;
                    if (c13nq4 != null && (effect = c13nq4.LIZ) != null) {
                        name = effect.getName();
                    }
                    sbLIZ4.append(name);
                    sbLIZ4.append("][");
                    sbLIZ4.append(c1662010tLr.LIZ);
                    sbLIZ4.append("][");
                    sbLIZ4.append(c1662010tLr.LIZIZ);
                    sbLIZ4.append(']');
                    String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ4);
                    c13ss2.getClass();
                    C13SS.LIZIZ("JKL", strLIZIZ3, null);
                    LIZLLL(this, c1662010tLr);
                    LJIIJJI(c1662010tLr);
                    LJ(this);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    LJ(this);
                    throw th;
                }
            }
            LJIILIIL();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            LJIILIIL();
            throw th2;
        }
    }

    public final void LJIILIIL() {
        Effect effect;
        C13NQ c13nq = this.LJFF;
        if (c13nq == null || (effect = c13nq.LIZ) == null) {
            return;
        }
        LJIILL.LIZIZ();
        if (Intrinsics.LJFF(effect.getPanel(), "default")) {
            LJIILLIIL.LIZIZ();
        }
        C2278408wI c2278408wI = LJIILIIL;
        c2278408wI.LIZ();
        try {
            LJIILJJIL.remove(effect.getEffect_id());
            c2278408wI.LIZIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c2278408wI.LIZIZ();
            throw th;
        }
    }

    public final void LJIILJJIL() {
        Effect effect;
        C13NQ c13nq = this.LJFF;
        if (c13nq == null || (effect = c13nq.LIZ) == null) {
            return;
        }
        int iLIZLLL = LJIILL.LIZLLL();
        int iLIZLLL2 = Intrinsics.LJFF(effect.getPanel(), "default") ? LJIILLIIL.LIZLLL() : LJIILLIIL.LIZJ();
        C2278408wI c2278408wI = LJIILIIL;
        c2278408wI.LIZ();
        try {
            for (Map.Entry<String, C13NS> entry : LJIILJJIL.entrySet()) {
                C13NS value = entry.getValue();
                value.LIZ = Math.max(value.LIZ, iLIZLLL2);
                value.LIZIZ = Math.max(value.LIZIZ, iLIZLLL);
                LJIILJJIL.put(entry.getKey(), value);
            }
            LJIILJJIL.put(effect.getEffect_id(), new C13NS(iLIZLLL2, iLIZLLL));
            c2278408wI.LIZIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c2278408wI.LIZIZ();
            throw th;
        }
    }

    @Override // X.C13NN
    public final void LJIIIZ(boolean z) {
        super.LJIIIZ(z);
        C13NN<C13NR> c13nn = this.LJ;
        if (c13nn != null) {
            c13nn.LJIIIZ(z);
        }
        C20005613Pi c20005613Pi = this.LJIIL;
        if (c20005613Pi != null) {
            c20005613Pi.pause(false);
        }
    }

    public final void LJIIJJI(C1662010tLr c1662010tLr) {
        String effect_id;
        String name;
        String panel;
        Effect effect;
        Effect effect2;
        Effect effect3;
        Pair[] pairArr = new Pair[5];
        C13NQ c13nq = this.LJFF;
        String str = "";
        if (c13nq == null || (effect3 = c13nq.LIZ) == null || (effect_id = effect3.getEffect_id()) == null) {
            effect_id = "";
        }
        pairArr[0] = new Pair("effect_id", effect_id);
        C13NQ c13nq2 = this.LJFF;
        if (c13nq2 == null || (effect2 = c13nq2.LIZ) == null || (name = effect2.getName()) == null) {
            name = "";
        }
        pairArr[1] = new Pair("effect_name", name);
        C13NQ c13nq3 = this.LJFF;
        if (c13nq3 == null || (effect = c13nq3.LIZ) == null || (panel = effect.getPanel()) == null) {
            panel = "null";
        }
        pairArr[2] = new Pair("panel", panel);
        pairArr[3] = new Pair("error_code", String.valueOf(c1662010tLr.LIZ));
        String str2 = c1662010tLr.LIZIZ;
        if (str2 != null) {
            str = str2;
        }
        pairArr[4] = new Pair("error_msg", str);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        C13RD c13rd = this.LJIIIZ;
        InterfaceC1633730scF interfaceC1633730scF = c13rd.LJIJJLI;
        if (interfaceC1633730scF != null) {
            C19997513Mf.LIZLLL(interfaceC1633730scF, false, c13rd, mapLJIIIIZZ);
        }
    }

    public final void LJIIL(long j) {
        long j2;
        long j3;
        long j4;
        String effect_id;
        int i;
        int i2;
        String effect_id2;
        String name;
        long j5;
        int i3;
        Effect effect;
        String panel;
        Effect effect2;
        Effect effect3;
        Effect effect4;
        C13NN<C13NR> c13nn = this.LJ;
        if (c13nn instanceof C19998913Mt) {
            C19998913Mt c19998913Mt = (C19998913Mt) c13nn;
            j2 = c19998913Mt.LJIIJ;
            j3 = c19998913Mt.LJIIIIZZ;
        } else {
            j2 = 0;
            j3 = 0;
        }
        C20005613Pi c20005613Pi = this.LJIIL;
        if (c20005613Pi != null) {
            j4 = c20005613Pi.LJIILJJIL;
        } else {
            j4 = 0;
        }
        long j6 = j2 + j4;
        if (j6 == 0) {
            return;
        }
        C2278408wI c2278408wI = LJIILIIL;
        c2278408wI.LIZ();
        try {
            ConcurrentHashMap<String, C13NS> concurrentHashMap = LJIILJJIL;
            C13NQ c13nq = this.LJFF;
            if (c13nq != null && (effect4 = c13nq.LIZ) != null) {
                effect_id = effect4.getEffect_id();
            } else {
                effect_id = null;
            }
            C13NS c13ns = concurrentHashMap.get(effect_id);
            int i4 = 0;
            if (c13ns != null) {
                i = c13ns.LIZ;
                i2 = c13ns.LIZIZ;
            } else {
                i = 0;
                i2 = 1;
            }
            c2278408wI.LIZIZ();
            Pair[] pairArr = new Pair[13];
            pairArr[0] = new Pair("total_duration", Long.valueOf(j));
            pairArr[1] = new Pair("total_size", Long.valueOf(j6));
            C13NQ c13nq2 = this.LJFF;
            String str = "";
            if (c13nq2 == null || (effect3 = c13nq2.LIZ) == null || (effect_id2 = effect3.getEffect_id()) == null) {
                effect_id2 = "";
            }
            pairArr[2] = new Pair("effect_id", effect_id2);
            C13NQ c13nq3 = this.LJFF;
            if (c13nq3 == null || (effect2 = c13nq3.LIZ) == null || (name = effect2.getName()) == null) {
                name = "";
            }
            pairArr[3] = new Pair("effect_name", name);
            pairArr[4] = new Pair("effect_duration", Long.valueOf(j3));
            pairArr[5] = new Pair("effect_size", Long.valueOf(j2));
            pairArr[6] = new Pair("model_size", Long.valueOf(j4));
            C20005613Pi c20005613Pi2 = this.LJIIL;
            if (c20005613Pi2 != null) {
                j5 = c20005613Pi2.LJIILIIL;
            } else {
                j5 = 0;
            }
            pairArr[7] = new Pair("model_duration", Long.valueOf(j5));
            C20005613Pi c20005613Pi3 = this.LJIIL;
            if (c20005613Pi3 != null) {
                i3 = c20005613Pi3.LJIILL;
            } else {
                i3 = 0;
            }
            pairArr[8] = new Pair("dependent_model_count", Integer.valueOf(i3));
            C20005613Pi c20005613Pi4 = this.LJIIL;
            if (c20005613Pi4 != null) {
                i4 = c20005613Pi4.LJIILLIIL;
            }
            pairArr[9] = new Pair("download_model_count", Integer.valueOf(i4));
            C13NQ c13nq4 = this.LJFF;
            if (c13nq4 != null && (effect = c13nq4.LIZ) != null && (panel = effect.getPanel()) != null) {
                str = panel;
            }
            pairArr[10] = new Pair("panel", str);
            pairArr[11] = new Pair("parallel_default_count", Integer.valueOf(i));
            pairArr[12] = new Pair("parallel_total_count", Integer.valueOf(i2));
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            C13RD c13rd = this.LJIIIZ;
            InterfaceC1633730scF interfaceC1633730scF = c13rd.LJIJJLI;
            if (interfaceC1633730scF != null) {
                C19997513Mf.LIZLLL(interfaceC1633730scF, true, c13rd, mapLJIIIIZZ);
            }
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Statistic][Effect+Model][");
            sbLIZ.append(mapLJIIIIZZ);
            sbLIZ.append(']');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZ("JKL", strLIZIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c2278408wI.LIZIZ();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C20005613Pi LJIIJ(X.C13NL r34, X.C13NQ r35) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13NL.LJIIJ(X.13NL, X.13NQ):X.13Pi");
    }

    public C13NL(C19998913Mt c19998913Mt, C13NQ c13nq, C20005913Pl c20005913Pl, C20008613Qm c20008613Qm, C20006313Pp c20006313Pp, C13RD c13rd) {
        C13NJ c13nj;
        this.LJ = c19998913Mt;
        this.LJFF = c13nq;
        this.LJI = c20005913Pl;
        this.LJII = c20008613Qm;
        this.LJIIIIZZ = c20006313Pp;
        this.LJIIIZ = c13rd;
        if (c19998913Mt != null) {
            c19998913Mt.LIZ = new C13NO<C13NR>() { // from class: X.13NM
                @Override // X.C13NO
                public final void LIZ(C13NN<C13NR> c13nn) {
                    this.LIZ.LJFF(c13nn);
                }

                @Override // X.C13NO
                public final void LIZJ(C13NN<C13NR> c13nn) {
                    this.LIZ.LJ(c13nn);
                }

                @Override // X.C13NO
                public final void LIZLLL(C13NN<C13NR> c13nn) {
                    this.LIZ.LJIIIIZZ(c13nn);
                }

                @Override // X.C13NO
                public final void LIZIZ(C13NN<C13NR> c13nn, C13NR c13nr) {
                    int i;
                    int i2;
                    String effect_id;
                    int i3;
                    Effect effect;
                    C13NR c13nr2 = c13nr;
                    C13NL c13nl = this.LIZ;
                    C20005613Pi c20005613Pi = c13nl.LJIIL;
                    int i4 = 0;
                    if (c20005613Pi != null) {
                        i = c20005613Pi.LJIILL;
                    } else {
                        i = 0;
                    }
                    c13nr2.LIZJ = i;
                    if (c20005613Pi != null) {
                        i2 = c20005613Pi.LJIILLIIL;
                    } else {
                        i2 = 0;
                    }
                    c13nr2.LIZIZ = i2;
                    C2278408wI c2278408wI = C13NL.LJIILIIL;
                    c2278408wI.LIZ();
                    try {
                        ConcurrentHashMap<String, C13NS> concurrentHashMap = C13NL.LJIILJJIL;
                        C13NQ c13nq2 = c13nl.LJFF;
                        if (c13nq2 != null && (effect = c13nq2.LIZ) != null) {
                            effect_id = effect.getEffect_id();
                        } else {
                            effect_id = null;
                        }
                        C13NS c13ns = concurrentHashMap.get(effect_id);
                        if (c13ns != null) {
                            i3 = c13ns.LIZIZ;
                        } else {
                            i3 = 1;
                        }
                        c13nr2.LIZLLL = i3;
                        if (c13ns != null) {
                            i4 = c13ns.LIZ;
                        }
                        c13nr2.LJ = i4;
                        c2278408wI.LIZIZ();
                        this.LIZ.LJII(c13nn, c13nr2);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c2278408wI.LIZIZ();
                        throw th;
                    }
                }

                @Override // X.C13NO
                public final void LJ(C13NN<C13NR> c13nn, C1662010tLr c1662010tLr) {
                    this.LIZ.LIZLLL(c13nn, c1662010tLr);
                }

                @Override // X.C13NO
                public final void LJI(C13NN<C13NR> c13nn, boolean z) {
                    this.LIZ.LIZJ(c13nn, z);
                }

                @Override // X.C13NO
                public final void LJFF(C13NN<C13NR> c13nn, int i, long j) {
                    this.LIZ.LJI(c13nn, i, j);
                }
            };
        }
        if (c13nq != null && (c13nj = c13nq.LIZLLL) != null) {
            c13nj.LIZLLL = Intrinsics.LJFF(c13nq.LJ, Boolean.TRUE);
        }
        this.LJIIJ = new C19999213Mw();
        this.LJIIJJI = new C13N2();
    }
}
