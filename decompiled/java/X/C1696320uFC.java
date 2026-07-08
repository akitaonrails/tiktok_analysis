package X;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS179S0101000_19;
import kotlin.jvm.internal.AwS181S0101000_25;
import kotlin.jvm.internal.AwS195S1100000_19;
import kotlin.jvm.internal.AwS41S1101000_12;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.AwS69S0001000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.g;

/* JADX INFO: renamed from: X.0uFC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1696320uFC {
    public static final void LJ(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1797823026);
        if (i == 0 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            LIZ(C0MBB.LIZIZ(2131845885, c13zcLJIIJ), C1696330uFD.LIZLLL, c13zcLJIIJ, 48);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS69S0001000_25(i, 20);
        }
    }

    public static final void LJII(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-2108807353);
        if (i == 0 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (ComplianceServiceProvider.LJI().LJJJJIZL() <= 0) {
                C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
                if (c20030013YsLJJJJZI != null) {
                    c20030013YsLJJJJZI.LIZLLL = new AwS69S0001000_25(i, 21);
                    return;
                }
                return;
            }
            LIZ(C0MBB.LIZIZ(2131839879, c13zcLJIIJ), C1696330uFD.LIZIZ, c13zcLJIIJ, 48);
        }
        C20030013Ys c20030013YsLJJJJZI2 = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI2 != null) {
            c20030013YsLJJJJZI2.LIZLLL = new AwS69S0001000_25(i, 22);
        }
    }

    public static final void LIZIZ(Function0<Unit> function0, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1226825406);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1668060tVc.LIZ(null, false, 0L, C1670400tZO.LIZIZ(c13zcLJIIJ).I2(), null, C13Z4.LIZJ(-781936693, new AwS195S1100000_19(C0MBB.LIZIZ(2131823332, c13zcLJIIJ), (String) function0, (Function0<Unit>) 5), c13zcLJIIJ), C1696330uFD.LIZ, null, c13zcLJIIJ, 1769472, 151);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS179S0101000_19(i, function0, 19);
        }
    }

    public static final void LIZJ(Context context, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1234124338);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(context)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            LIZ(C0MBB.LIZIZ(2131845878, c13zcLJIIJ), C13Z4.LIZJ(1336781519, new AwS639S0100000_25(context, 131), c13zcLJIIJ), c13zcLJIIJ, 48);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(context, i, 69);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(final android.content.Context r27, X.InterfaceC1680500tpg r28, int r29) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1696320uFC.LIZLLL(android.content.Context, X.0tpg, int):void");
    }

    public static final void LJFF(Context context, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1773618016);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(context)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            LIZ(C0MBB.LIZIZ(2131845880, c13zcLJIIJ), C13Z4.LIZJ(-1902359007, new AwS639S0100000_25(context, 132), c13zcLJIIJ), c13zcLJIIJ, 48);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(context, i, 70);
        }
    }

    public static final void LJI(Context context, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(472679419);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(context)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            LIZ(null, C13Z4.LIZJ(1306638652, new AwS639S0100000_25(context, 133), c13zcLJIIJ), c13zcLJIIJ, 54);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(context, i, 71);
        }
    }

    public static final void LJIIIIZZ(Context context, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-474375431);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(context)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (!((AccessibilityManager) C786410Ut5.H2(context, "accessibility")).isTouchExplorationEnabled()) {
                C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
                if (c20030013YsLJJJJZI != null) {
                    c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(context, i, 72);
                    return;
                }
                return;
            }
            LIZ(C0MBB.LIZIZ(2131845894, c13zcLJIIJ), C1696330uFD.LIZJ, c13zcLJIIJ, 48);
        }
        C20030013Ys c20030013YsLJJJJZI2 = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI2 != null) {
            c20030013YsLJJJJZI2.LIZLLL = new AwS181S0101000_25(context, i, 73);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public static final void LIZ(String str, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        ?? r2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1486041449);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(function2)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            float f = 12;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c1685760tyA, f, 0.0f, f, 0.0f, 10);
            C1680030tov c1680030tov = C1679930tol.LIZJ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1296860jqu c1296860jqu = C1668040tVa.LJIILIIL;
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, c1296860jqu, c13zcLJIIJ, 0);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIL);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
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
                AFwS311S0000000_25 aFwS311S0000000_254 = g.a.LIZLLL;
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, aFwS311S0000000_254);
                c13zcLJIIJ.LJJIIJZLJL(-1894444607);
                if (str != null) {
                    r2 = 0;
                    C1688900u3E.LIZJ(str, true, false, false, null, c13zcLJIIJ, (i2 & 14) | 48, 28);
                } else {
                    r2 = 0;
                }
                c13zcLJIIJ.LJJJJL(r2);
                float f2 = 8;
                InterfaceC1685750ty9 interfaceC1685750ty9LJIIL2 = C1682520tsw.LJIIL(C1675980tiO.LIZIZ(c1685760tyA, C1670400tZO.LIZIZ(c13zcLJIIJ).J2(), C1669050tXD.LIZIZ(f2)), 0.0f, f2, 0.0f, f2, 5);
                C1688130u1z c1688130u1zLIZ2 = C1665740tRs.LIZ(c1680030tov, c1296860jqu, c13zcLJIIJ, r2);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIL2);
                if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                    c13zcLJIIJ.LJJIII();
                    if (c13zcLJIIJ.LJJJI) {
                        c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                    } else {
                        c13zcLJIIJ.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ2, aFwS311S0000000_25);
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                    function2.invoke(c13zcLJIIJ, Integer.valueOf((i2 >> 3) & 14));
                    c13zcLJIIJ.LJJJJL(true);
                    c13zcLJIIJ.LJJJJL(true);
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
            c20030013YsLJJJJZI.LIZLLL = new AwS41S1101000_12(str, i, function2, 1);
        }
    }
}
