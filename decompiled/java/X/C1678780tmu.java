package X;

import androidx.compose.foundation.layout.c;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS11S0211000_25;
import kotlin.jvm.internal.AwS124S0201000_25;
import kotlin.jvm.internal.AwS131S0101000_25;
import kotlin.jvm.internal.AwS181S0101000_25;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;
import p2.j1;

/* JADX INFO: renamed from: X.0tmu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1678780tmu {
    public static final float LIZJ;
    public static final float LJFF;
    public static final float LIZ = 30;
    public static final float LIZIZ = 16;
    public static final float LIZLLL = 2;
    public static final float LJ = 6;
    public static final float LJI = 12;
    public static final float LJII = 48;
    public static final float LJIIIIZZ = 68;

    static {
        float f = 8;
        LIZJ = f;
        LJFF = f;
    }

    public static final void LJ(Function2 function2, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(917397959);
        if ((i & 14) == 0) {
            if (c13zcLJIIJ.LJII(function2)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1678810tmx c1678810tmx = new InterfaceC20053113dB() { // from class: X.0tmx
                @Override // X.InterfaceC20053113dB
                public final /* synthetic */ int LIZ(j1 j1Var, List list, int i4) {
                    return C1688390u2P.LIZJ(this, j1Var, list, i4);
                }

                @Override // X.InterfaceC20053113dB
                public final /* synthetic */ int LIZIZ(j1 j1Var, List list, int i4) {
                    return C1688390u2P.LIZLLL(this, j1Var, list, i4);
                }

                @Override // X.InterfaceC20053113dB
                public final /* synthetic */ int LIZJ(j1 j1Var, List list, int i4) {
                    return C1688390u2P.LIZ(this, j1Var, list, i4);
                }

                @Override // X.InterfaceC20053113dB
                public final /* synthetic */ int LIZLLL(j1 j1Var, List list, int i4) {
                    return C1688390u2P.LIZIZ(this, j1Var, list, i4);
                }

                @Override // X.InterfaceC20053113dB
                public final InterfaceC1690350u5Z LJFF(InterfaceC1689940u4u interfaceC1689940u4u, List<? extends InterfaceC1673370teB> list, long j) {
                    boolean z;
                    float f;
                    if (list.size() == 1) {
                        AbstractC1686530tzP abstractC1686530tzPLJJJJZ = ((InterfaceC1673370teB) C13LP.LJJJJZI(list)).LJJJJZ(j);
                        int iLJJIJL = abstractC1686530tzPLJJJJZ.LJJIJL(C115R.LIZ);
                        int iLJJIJL2 = abstractC1686530tzPLJJJJZ.LJJIJL(C115R.LIZIZ);
                        if (iLJJIJL != Integer.MIN_VALUE) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            if (iLJJIJL2 != Integer.MIN_VALUE) {
                                if (iLJJIJL == iLJJIJL2) {
                                    f = C1678780tmu.LJII;
                                } else {
                                    f = C1678780tmu.LJIIIIZZ;
                                }
                                int iMax = Math.max(interfaceC1689940u4u.LJLLJ(f), abstractC1686530tzPLJJJJZ.LLILLJJLI);
                                return interfaceC1689940u4u.LJLJJL(C1682380tsi.LJIIIIZZ(j), iMax, C2097608Jq.LJ(), new AwS131S0101000_25(iMax, abstractC1686530tzPLJJJJZ, 1));
                            }
                            "No baselines for text".toString();
                            throw new IllegalArgumentException("No baselines for text");
                        }
                        "No baselines for text".toString();
                        throw new IllegalArgumentException("No baselines for text");
                    }
                    "text for Snackbar expected to have exactly only one child".toString();
                    throw new IllegalArgumentException("text for Snackbar expected to have exactly only one child");
                }
            };
            c13zcLJIIJ.LJJIJIIJIL(-1323940314);
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            C19719212De c19719212DeLIZIZ = C1672420tce.LIZIZ(c1685760tyA);
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJI;
                C1665930tSB.LIZ(c13zcLJIIJ, c1678810tmx, aFwS311S0000000_25);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJFF;
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, aFwS311S0000000_252);
                AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_253);
                }
                c19719212DeLIZIZ.invoke(new C1156530gCZ(c13zcLJIIJ), c13zcLJIIJ, 0);
                c13zcLJIIJ.LJJIJIIJIL(2058660585);
                InterfaceC1685750ty9 interfaceC1685750ty9LJIIIZ = C1682520tsw.LJIIIZ(c1685760tyA, LIZIZ, LJ);
                c13zcLJIIJ.LJJIJIIJIL(733328855);
                InterfaceC1668050tVb.LIZ.getClass();
                C1674920tgg c1674920tggLJ = k.LJ(C1668040tVa.LIZIZ, false, c13zcLJIIJ, 0);
                c13zcLJIIJ.LJJIJIIJIL(-1323940314);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                C19719212De c19719212DeLIZIZ2 = C1672420tce.LIZIZ(interfaceC1685750ty9LJIIIZ);
                if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                    c13zcLJIIJ.LJJIII();
                    if (c13zcLJIIJ.LJJJI) {
                        c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                    } else {
                        c13zcLJIIJ.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, c1674920tggLJ, aFwS311S0000000_25);
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                    }
                    c19719212DeLIZIZ2.invoke(new C1156530gCZ(c13zcLJIIJ), c13zcLJIIJ, 0);
                    c13zcLJIIJ.LJJIJIIJIL(2058660585);
                    function2.invoke(c13zcLJIIJ, Integer.valueOf(i2 & 14));
                    c13zcLJIIJ.LJJJJL(false);
                    c13zcLJIIJ.LJJJJL(true);
                    c13zcLJIIJ.LJJJJL(false);
                    c13zcLJIIJ.LJJJJL(false);
                    c13zcLJIIJ.LJJJJL(false);
                    c13zcLJIIJ.LJJJJL(true);
                    c13zcLJIIJ.LJJJJL(false);
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(i, function2, 4);
        }
    }

    public static final void LIZJ(Function2 function2, Function2 function22, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        InterfaceC1685750ty9 interfaceC1685750ty9LIZ;
        InterfaceC1685750ty9 interfaceC1685750ty9LIZ2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1229075900);
        if ((i & 14) == 0) {
            if (c13zcLJIIJ.LJII(function2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (c13zcLJIIJ.LJII(function22)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(c1685760tyA, 1.0f);
            float f = LIZIZ;
            float f2 = LIZJ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(interfaceC1685750ty9LJ, f, 0.0f, f2, LIZLLL, 2);
            c13zcLJIIJ.LJJIJIIJIL(-483455358);
            C1680030tov c1680030tov = C1679930tol.LIZJ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, C1668040tVa.LJIILIIL, c13zcLJIIJ, 0);
            c13zcLJIIJ.LJJIJIIJIL(-1323940314);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            C19719212De c19719212DeLIZIZ = C1672420tce.LIZIZ(interfaceC1685750ty9LJIIL);
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJI;
                C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ, aFwS311S0000000_25);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJFF;
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, aFwS311S0000000_252);
                AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_253);
                }
                c19719212DeLIZIZ.invoke(new C1156530gCZ(c13zcLJIIJ), c13zcLJIIJ, 0);
                c13zcLJIIJ.LJJIJIIJIL(2058660585);
                float f3 = LIZ;
                float f4 = LJI;
                if (!Float.isNaN(f3)) {
                    interfaceC1685750ty9LIZ = C1678830tmz.LIZ(c1685760tyA, C115R.LIZ, f3, 0.0f, 4);
                } else {
                    interfaceC1685750ty9LIZ = c1685760tyA;
                }
                c1685760tyA.getClass();
                if (!Float.isNaN(f4)) {
                    interfaceC1685750ty9LIZ2 = C1678830tmz.LIZ(c1685760tyA, C115R.LIZIZ, 0.0f, f4, 2);
                } else {
                    interfaceC1685750ty9LIZ2 = c1685760tyA;
                }
                InterfaceC1685750ty9 interfaceC1685750ty9LJIIL2 = C1682520tsw.LJIIL(interfaceC1685750ty9LIZ.LIZ(interfaceC1685750ty9LIZ2), 0.0f, 0.0f, f2, 0.0f, 11);
                c13zcLJIIJ.LJJIJIIJIL(733328855);
                C1296870jqv c1296870jqv = C1668040tVa.LIZIZ;
                C1674920tgg c1674920tggLJ = k.LJ(c1296870jqv, false, c13zcLJIIJ, 0);
                c13zcLJIIJ.LJJIJIIJIL(-1323940314);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                C19719212De c19719212DeLIZIZ2 = C1672420tce.LIZIZ(interfaceC1685750ty9LJIIL2);
                if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                    c13zcLJIIJ.LJJIII();
                    if (c13zcLJIIJ.LJJJI) {
                        c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                    } else {
                        c13zcLJIIJ.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, c1674920tggLJ, aFwS311S0000000_25);
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                    }
                    c19719212DeLIZIZ2.invoke(new C1156530gCZ(c13zcLJIIJ), c13zcLJIIJ, 0);
                    c13zcLJIIJ.LJJIJIIJIL(2058660585);
                    function2.invoke(c13zcLJIIJ, Integer.valueOf(i2 & 14));
                    c13zcLJIIJ.LJJJJL(false);
                    c13zcLJIIJ.LJJJJL(true);
                    c13zcLJIIJ.LJJJJL(false);
                    c13zcLJIIJ.LJJJJL(false);
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1687990u1l.LIZIZ(c1685760tyA, C1668040tVa.LJIILL);
                    c13zcLJIIJ.LJJIJIIJIL(733328855);
                    C1674920tgg c1674920tggLJ2 = k.LJ(c1296870jqv, false, c13zcLJIIJ, 0);
                    c13zcLJIIJ.LJJIJIIJIL(-1323940314);
                    int iLIZ3 = C0MXE.LIZ(c13zcLJIIJ);
                    C13D2 c13d2LJJJIL3 = c13zcLJIIJ.LJJJIL();
                    C19719212De c19719212DeLIZIZ3 = C1672420tce.LIZIZ(interfaceC1685750ty9LIZIZ);
                    if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                        c13zcLJIIJ.LJJIII();
                        if (c13zcLJIIJ.LJJJI) {
                            c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                        } else {
                            c13zcLJIIJ.LJIILJJIL();
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, c1674920tggLJ2, aFwS311S0000000_25);
                        C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL3, aFwS311S0000000_252);
                        if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ3))) {
                            c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ3));
                            c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ3), aFwS311S0000000_253);
                        }
                        c19719212DeLIZIZ3.invoke(new C1156530gCZ(c13zcLJIIJ), c13zcLJIIJ, 0);
                        c13zcLJIIJ.LJJIJIIJIL(2058660585);
                        function22.invoke(c13zcLJIIJ, Integer.valueOf((i2 >> 3) & 14));
                        c13zcLJIIJ.LJJJJL(false);
                        c13zcLJIIJ.LJJJJL(true);
                        c13zcLJIIJ.LJJJJL(false);
                        c13zcLJIIJ.LJJJJL(false);
                        c13zcLJIIJ.LJJJJL(false);
                        c13zcLJIIJ.LJJJJL(true);
                        c13zcLJIIJ.LJJJJL(false);
                        c13zcLJIIJ.LJJJJL(false);
                    } else {
                        C0MXE.LIZIZ();
                        throw null;
                    }
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(i, function2, function22, 10);
        }
    }

    public static final void LIZLLL(Function2 function2, Function2 function22, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-534813202);
        if ((i & 14) == 0) {
            if (c13zcLJIIJ.LJII(function2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (c13zcLJIIJ.LJII(function22)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c1685760tyA, LIZIZ, 0.0f, LIZJ, 0.0f, 10);
            InterfaceC20053113dB interfaceC20053113dB = new InterfaceC20053113dB() { // from class: X.0tmw
                @Override // X.InterfaceC20053113dB
                public final /* synthetic */ int LIZ(j1 j1Var, List list, int i5) {
                    return C1688390u2P.LIZJ(this, j1Var, list, i5);
                }

                @Override // X.InterfaceC20053113dB
                public final /* synthetic */ int LIZIZ(j1 j1Var, List list, int i5) {
                    return C1688390u2P.LIZLLL(this, j1Var, list, i5);
                }

                @Override // X.InterfaceC20053113dB
                public final /* synthetic */ int LIZJ(j1 j1Var, List list, int i5) {
                    return C1688390u2P.LIZ(this, j1Var, list, i5);
                }

                @Override // X.InterfaceC20053113dB
                public final /* synthetic */ int LIZLLL(j1 j1Var, List list, int i5) {
                    return C1688390u2P.LIZIZ(this, j1Var, list, i5);
                }

                @Override // X.InterfaceC20053113dB
                public final InterfaceC1690350u5Z LJFF(InterfaceC1689940u4u interfaceC1689940u4u, List<? extends InterfaceC1673370teB> list, long j) {
                    boolean z;
                    int iLJLLJ;
                    int iMax;
                    for (InterfaceC1673370teB interfaceC1673370teB : list) {
                        if (Intrinsics.LJFF(C1679030tnJ.LIZ(interfaceC1673370teB), "action")) {
                            AbstractC1686530tzP abstractC1686530tzPLJJJJZ = interfaceC1673370teB.LJJJJZ(j);
                            int iLJIIIIZZ = (C1682380tsi.LJIIIIZZ(j) - abstractC1686530tzPLJJJJZ.LL) - interfaceC1689940u4u.LJLLJ(C1678780tmu.LJFF);
                            int iLJIIJ = C1682380tsi.LJIIJ(j);
                            if (iLJIIIIZZ >= iLJIIJ) {
                                iLJIIJ = iLJIIIIZZ;
                            }
                            for (InterfaceC1673370teB interfaceC1673370teB2 : list) {
                                if (Intrinsics.LJFF(C1679030tnJ.LIZ(interfaceC1673370teB2), "text")) {
                                    int i5 = 0;
                                    AbstractC1686530tzP abstractC1686530tzPLJJJJZ2 = interfaceC1673370teB2.LJJJJZ(C1682380tsi.LIZ(C1682380tsi.LJIIJ(j), iLJIIJ, 0, C1682380tsi.LJII(j)));
                                    C115S c115s = C115R.LIZ;
                                    int iLJJIJL = abstractC1686530tzPLJJJJZ2.LJJIJL(c115s);
                                    boolean z2 = true;
                                    if (iLJJIJL != Integer.MIN_VALUE) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        int iLJJIJL2 = abstractC1686530tzPLJJJJZ2.LJJIJL(C115R.LIZIZ);
                                        if (iLJJIJL2 != Integer.MIN_VALUE) {
                                            if (iLJJIJL != iLJJIJL2) {
                                                z2 = false;
                                            }
                                            int iLJIIIIZZ2 = C1682380tsi.LJIIIIZZ(j) - abstractC1686530tzPLJJJJZ.LL;
                                            if (z2) {
                                                iMax = Math.max(interfaceC1689940u4u.LJLLJ(C1678780tmu.LJII), abstractC1686530tzPLJJJJZ.LLILLJJLI);
                                                iLJLLJ = (iMax - abstractC1686530tzPLJJJJZ2.LLILLJJLI) / 2;
                                                int iLJJIJL3 = abstractC1686530tzPLJJJJZ.LJJIJL(c115s);
                                                if (iLJJIJL3 != Integer.MIN_VALUE) {
                                                    i5 = (iLJJIJL + iLJLLJ) - iLJJIJL3;
                                                }
                                            } else {
                                                iLJLLJ = interfaceC1689940u4u.LJLLJ(C1678780tmu.LIZ) - iLJJIJL;
                                                iMax = Math.max(interfaceC1689940u4u.LJLLJ(C1678780tmu.LJIIIIZZ), abstractC1686530tzPLJJJJZ2.LLILLJJLI + iLJLLJ);
                                                i5 = (iMax - abstractC1686530tzPLJJJJZ.LLILLJJLI) / 2;
                                            }
                                            return interfaceC1689940u4u.LJLJJL(C1682380tsi.LJIIIIZZ(j), iMax, C2097608Jq.LJ(), new C1678820tmy(abstractC1686530tzPLJJJJZ2, iLJLLJ, abstractC1686530tzPLJJJJZ, iLJIIIIZZ2, i5));
                                        }
                                        "No baselines for text".toString();
                                        throw new IllegalArgumentException("No baselines for text");
                                    }
                                    "No baselines for text".toString();
                                    throw new IllegalArgumentException("No baselines for text");
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            };
            c13zcLJIIJ.LJJIJIIJIL(-1323940314);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            C19719212De c19719212DeLIZIZ = C1672420tce.LIZIZ(interfaceC1685750ty9LJIIL);
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJI;
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dB, aFwS311S0000000_25);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJFF;
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, aFwS311S0000000_252);
                AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_253);
                }
                c19719212DeLIZIZ.invoke(new C1156530gCZ(c13zcLJIIJ), c13zcLJIIJ, 0);
                c13zcLJIIJ.LJJIJIIJIL(2058660585);
                InterfaceC1685750ty9 interfaceC1685750ty9LJIIJ = C1682520tsw.LJIIJ(C1679030tnJ.LIZIZ(c1685760tyA, "text"), 0.0f, LJ, 1);
                c13zcLJIIJ.LJJIJIIJIL(733328855);
                InterfaceC1668050tVb.LIZ.getClass();
                C1296870jqv c1296870jqv = C1668040tVa.LIZIZ;
                C1674920tgg c1674920tggLJ = k.LJ(c1296870jqv, false, c13zcLJIIJ, 0);
                c13zcLJIIJ.LJJIJIIJIL(-1323940314);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                C19719212De c19719212DeLIZIZ2 = C1672420tce.LIZIZ(interfaceC1685750ty9LJIIJ);
                if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                    c13zcLJIIJ.LJJIII();
                    if (c13zcLJIIJ.LJJJI) {
                        c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                    } else {
                        c13zcLJIIJ.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, c1674920tggLJ, aFwS311S0000000_25);
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                    }
                    c19719212DeLIZIZ2.invoke(new C1156530gCZ(c13zcLJIIJ), c13zcLJIIJ, 0);
                    c13zcLJIIJ.LJJIJIIJIL(2058660585);
                    function2.invoke(c13zcLJIIJ, Integer.valueOf(i2 & 14));
                    c13zcLJIIJ.LJJJJL(false);
                    c13zcLJIIJ.LJJJJL(true);
                    c13zcLJIIJ.LJJJJL(false);
                    c13zcLJIIJ.LJJJJL(false);
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1679030tnJ.LIZIZ(c1685760tyA, "action");
                    c13zcLJIIJ.LJJIJIIJIL(733328855);
                    C1674920tgg c1674920tggLJ2 = k.LJ(c1296870jqv, false, c13zcLJIIJ, 0);
                    c13zcLJIIJ.LJJIJIIJIL(-1323940314);
                    int iLIZ3 = C0MXE.LIZ(c13zcLJIIJ);
                    C13D2 c13d2LJJJIL3 = c13zcLJIIJ.LJJJIL();
                    C19719212De c19719212DeLIZIZ3 = C1672420tce.LIZIZ(interfaceC1685750ty9LIZIZ);
                    if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                        c13zcLJIIJ.LJJIII();
                        if (c13zcLJIIJ.LJJJI) {
                            c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                        } else {
                            c13zcLJIIJ.LJIILJJIL();
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, c1674920tggLJ2, aFwS311S0000000_25);
                        C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL3, aFwS311S0000000_252);
                        if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ3))) {
                            c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ3));
                            c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ3), aFwS311S0000000_253);
                        }
                        c19719212DeLIZIZ3.invoke(new C1156530gCZ(c13zcLJIIJ), c13zcLJIIJ, 0);
                        c13zcLJIIJ.LJJIJIIJIL(2058660585);
                        function22.invoke(c13zcLJIIJ, Integer.valueOf((i2 >> 3) & 14));
                        c13zcLJIIJ.LJJJJL(false);
                        c13zcLJIIJ.LJJJJL(true);
                        c13zcLJIIJ.LJJJJL(false);
                        c13zcLJIIJ.LJJJJL(false);
                        c13zcLJIIJ.LJJJJL(false);
                        c13zcLJIIJ.LJJJJL(true);
                        c13zcLJIIJ.LJJJJL(false);
                    } else {
                        C0MXE.LIZIZ();
                        throw null;
                    }
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(i, function2, function22, 11);
        }
    }

    public static final void LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, boolean z, InterfaceC1680710tq1 interfaceC1680710tq1, long j, long j2, float f, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function22, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float f2 = f;
        long jLJII = j2;
        long jLIZ = j;
        InterfaceC1680710tq1 interfaceC1680710tq12 = interfaceC1680710tq1;
        boolean z2 = z;
        Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function23 = function2;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-558258760);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (c13zcLJIIJ.LJII(function23)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0 && c13zcLJIIJ.LJJIIJ(interfaceC1680710tq12)) {
                i11 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i11 = 1024;
            }
            i3 |= i11;
        }
        if ((57344 & i) == 0) {
            if ((i2 & 16) == 0 && c13zcLJIIJ.LJIJJ(jLIZ)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i3 |= i10;
        }
        if ((458752 & i) == 0) {
            if ((i2 & 32) == 0 && c13zcLJIIJ.LJIJJ(jLJII)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        int i15 = i2 & 64;
        if (i15 != 0) {
            i3 |= 1572864;
        } else if ((3670016 & i) == 0) {
            if (c13zcLJIIJ.LJIJ(f2)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i3 |= i7;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((29360128 & i) == 0) {
            if (c13zcLJIIJ.LJII(function22)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i3 |= i8;
        }
        if ((23967451 & i3) == 4793490 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJLI();
            if ((i & 1) != 0 && !c13zcLJIIJ.LJJLIIIIJ()) {
                c13zcLJIIJ.LIZJ();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
            } else {
                if (i12 != 0) {
                    interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
                }
                if (i13 != 0) {
                    function23 = null;
                }
                if (i14 != 0) {
                    z2 = false;
                }
                if ((i2 & 8) != 0) {
                    interfaceC1680710tq12 = C1680090tp1.LIZIZ(c13zcLJIIJ).LIZ;
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    jLIZ = C1678770tmt.LIZ(c13zcLJIIJ);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    jLJII = C1680090tp1.LIZ(c13zcLJIIJ).LJII();
                    i3 &= -458753;
                }
                if (i15 != 0) {
                    f2 = 6;
                }
            }
            c13zcLJIIJ.LJJJJLI();
            int i16 = i3 >> 6;
            C1678670tmj.LIZ(interfaceC1685750ty92, interfaceC1680710tq12, jLIZ, jLJII, null, f2, C13Z4.LIZIZ(c13zcLJIIJ, -2084221700, new AwS11S0211000_25((Function2) function23, function22, (Function2<? super InterfaceC1680500tpg, ? super Integer, Unit>) i3, (int) z2, true)), c13zcLJIIJ, (i3 & 14) | 1572864 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | ((i3 >> 3) & 458752), 16);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1678790tmv(interfaceC1685750ty92, function23, z2, interfaceC1680710tq12, jLIZ, jLJII, f2, function22, i, i2);
        }
    }

    public static final void LIZIZ(InterfaceC1675090tgx interfaceC1675090tgx, InterfaceC1685750ty9 interfaceC1685750ty9, boolean z, InterfaceC1680710tq1 interfaceC1680710tq1, long j, long j2, long j3, float f, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C19719212De c19719212DeLIZIZ;
        int i8;
        int i9;
        int i10;
        int i11;
        float f2 = f;
        long jLJI = j3;
        InterfaceC1680710tq1 interfaceC1680710tq12 = interfaceC1680710tq1;
        boolean z2 = z;
        long jLJII = j2;
        long jLIZ = j;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(258660814);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1675090tgx)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0 && c13zcLJIIJ.LJJIIJ(interfaceC1680710tq12)) {
                i11 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i11 = 1024;
            }
            i3 |= i11;
        }
        if ((57344 & i) == 0) {
            if ((i2 & 16) == 0 && c13zcLJIIJ.LJIJJ(jLIZ)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i3 |= i10;
        }
        if ((458752 & i) == 0) {
            if ((i2 & 32) == 0 && c13zcLJIIJ.LJIJJ(jLJII)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        if ((i & 3670016) == 0) {
            if ((i2 & 64) == 0 && c13zcLJIIJ.LJIJJ(jLJI)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i3 |= i8;
        }
        int i14 = i2 & 128;
        if (i14 != 0) {
            i3 |= 12582912;
        } else if ((29360128 & i) == 0) {
            if (c13zcLJIIJ.LJIJ(f2)) {
                i7 = 8388608;
            } else {
                i7 = 4194304;
            }
            i3 |= i7;
        }
        if ((i3 & 23967451) == 4793490 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJLI();
            if ((i & 1) != 0 && !c13zcLJIIJ.LJJLIIIIJ()) {
                c13zcLJIIJ.LIZJ();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                }
            } else {
                if (i12 != 0) {
                    interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
                }
                if (i13 != 0) {
                    z2 = false;
                }
                if ((i2 & 8) != 0) {
                    interfaceC1680710tq12 = C1680090tp1.LIZIZ(c13zcLJIIJ).LIZ;
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    jLIZ = C1678770tmt.LIZ(c13zcLJIIJ);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    jLJII = C1680090tp1.LIZ(c13zcLJIIJ).LJII();
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    c13zcLJIIJ.LJJIJIIJIL(-810329402);
                    C1680060toy c1680060toyLIZ = C1680090tp1.LIZ(c13zcLJIIJ);
                    if (c1680060toyLIZ.LJIIIIZZ()) {
                        jLJI = C1685850tyJ.LJI(C1685910tyP.LIZJ(0.6f, c1680060toyLIZ.LJII()), c1680060toyLIZ.LJFF());
                    } else {
                        jLJI = c1680060toyLIZ.LJI();
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    i3 &= -3670017;
                }
                if (i14 != 0) {
                    f2 = 6;
                }
            }
            c13zcLJIIJ.LJJJJLI();
            String strLIZ = interfaceC1675090tgx.LIZ();
            if (strLIZ != null) {
                c19719212DeLIZIZ = C13Z4.LIZIZ(c13zcLJIIJ, 1843479216, new C1675140th2(jLJI, i3, interfaceC1675090tgx, strLIZ));
            } else {
                c19719212DeLIZIZ = null;
            }
            LIZ(C1682520tsw.LJIIIIZZ(interfaceC1685750ty92, 12), c19719212DeLIZIZ, z2, interfaceC1680710tq12, jLIZ, jLJII, f2, C13Z4.LIZIZ(c13zcLJIIJ, -261845785, new AwS639S0100000_25(interfaceC1675090tgx, 6)), c13zcLJIIJ, (i3 & 896) | 12582912 | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 >> 3) & 3670016), 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1675130th1(interfaceC1675090tgx, interfaceC1685750ty92, z2, interfaceC1680710tq12, jLIZ, jLJII, jLJI, f2, i, i2);
        }
    }
}
