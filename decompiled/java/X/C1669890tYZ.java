package X;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS179S0101000_19;
import kotlin.jvm.internal.AwS26S0002000_25;
import kotlin.jvm.internal.AwS319S0300000_25;
import kotlin.jvm.internal.AwS455S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tYZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669890tYZ {
    public static final Object LJFF(String str, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        Forest forestLIZ = C0T1N.LIZ();
        RequestParams requestParams = new RequestParams(null, 1, null);
        requestParams.channel = "tiktok_social_user_relation_res";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("profile_background/");
        sbLIZ.append(str);
        requestParams.bundle = C2188811AlT.LIZIZ(sbLIZ);
        requestParams.waitGeckoUpdate = true;
        forestLIZ.fetchResourceAsync("", requestParams, new AwS581S0100000_2(c2252611DEt, 476));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public static final void LIZ(int i, InterfaceC1680500tpg interfaceC1680500tpg, int i2) {
        int i3;
        boolean z;
        C13ZC c13zc;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1566625423);
        if ((i2 & 6) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
            c13zc = c13zcLJIIJ;
        } else {
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C20028913Yh.LJI(null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            C05P0 c05p02 = (C05P0) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (objLJJ3 == c1680520tpi) {
                objLJJ3 = C20028913Yh.LJI(null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            C05P0 c05p03 = (C05P0) objLJJ3;
            c13zcLJIIJ.LJJJJL(false);
            Unit unit = Unit.LIZ;
            c13zcLJIIJ.LJJIIJZLJL(-1746271574);
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (objLJJ4 == c1680520tpi) {
                objLJJ4 = new C05G6(c05p0, c05p02, c05p03, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(unit, (Function2) objLJJ4, c13zcLJIIJ);
            Object[] objArr = {Integer.valueOf(i), c05p0.getValue(), c05p02.getValue(), c05p03.getValue()};
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            int i5 = i3 & 14;
            if (i5 == 4) {
                z = true;
            } else {
                z = false;
            }
            Object objLJJ5 = c13zcLJIIJ.LJJ();
            if (z || objLJJ5 == c1680520tpi) {
                objLJJ5 = new C1367705Wx(i, c05p0, c05p02, c05p03, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ5);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJI(objArr, (Function2) objLJJ5, c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ6 = c13zcLJIIJ.LJJ();
            if (objLJJ6 == c1680520tpi) {
                objLJJ6 = AFwS266S0000000_25.get$arr$(441);
                c13zcLJIIJ.LJJIJIIJI(objLJJ6);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LIZIZ(unit, (Function1) objLJJ6, c13zcLJIIJ);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1675980tiO.LIZIZ(c.LIZLLL(InterfaceC1685750ty9.LIZ), C1685910tyP.LIZIZ, C1669430tXp.LIZ);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZIZ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                c13zc = c13zcLJIIJ;
                C1670830ta5.LIZIZ(Integer.valueOf(i), null, C1671550tbF.LIZLLL(400, 0, null, 6), "background_crossfade", C13Z4.LIZJ(979973117, new AwS319S0300000_25(c05p0, (C05P0<Bitmap>) c05p02, (C05P0<Bitmap>) c05p03, (C05P0<Bitmap>) 4), c13zcLJIIJ), c13zcLJIIJ, i5 | 28032, 2);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zc.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS26S0002000_25(i, i2, 3);
        }
    }

    public static final void LIZJ(C1220330hrT c1220330hrT, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(515812148);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1220330hrT)) {
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
            C1670410tZP.LIZ(C1669670tYD.LIZJ(c13zcLJIIJ), null, null, null, null, null, C13Z4.LIZJ(-1633984519, new AwS455S0200000_19((Context) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ), c1220330hrT, 41), c13zcLJIIJ), c13zcLJIIJ, 1572864, 62);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS179S0101000_19(c1220330hrT, i, 15);
        }
    }

    public static final void LIZLLL(C1220330hrT c1220330hrT, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        String strLIZIZ;
        InterfaceC1685750ty9 interfaceC1685750ty9LIZ;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1430460021);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1220330hrT)) {
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
            boolean zBooleanValue = ((Boolean) C280350Ayn.LIZ.getValue()).booleanValue();
            Object[] objArr = new Object[0];
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = AFwS214S0000000_25.get$arr$(441);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1676320tiw interfaceC1676320tiw = (InterfaceC1676320tiw) C20041813bM.LIZ(objArr, null, (Function0) objLJJ, c13zcLJIIJ, 6);
            if (zBooleanValue) {
                c13zcLJIIJ.LJJIIJZLJL(169373020);
                strLIZIZ = C0MBB.LIZIZ(2131847843, c13zcLJIIJ);
                c13zcLJIIJ.LJJJJL(false);
            } else {
                c13zcLJIIJ.LJJIIJZLJL(169459231);
                strLIZIZ = C0MBB.LIZIZ(2131839085, c13zcLJIIJ);
                c13zcLJIIJ.LJJJJL(false);
            }
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(interfaceC1676320tiw);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS569S0100000_25(interfaceC1676320tiw, 833);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            Function0 function0 = (Function0) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = c.LIZLLL(c1685760tyA);
            c13zcLJIIJ.LJJIIJZLJL(282572689);
            if (zBooleanValue) {
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ3 = c13zcLJIIJ.LJJ();
                if (objLJJ3 == c1680520tpi) {
                    objLJJ3 = new C612270Nzt();
                    c13zcLJIIJ.LJJIJIIJI(objLJJ3);
                }
                InterfaceC595010NVj interfaceC595010NVj = (InterfaceC595010NVj) objLJJ3;
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                boolean zLJJIIJ2 = c13zcLJIIJ.LJJIIJ(function0);
                Object objLJJ4 = c13zcLJIIJ.LJJ();
                if (zLJJIIJ2 || objLJJ4 == c1680520tpi) {
                    objLJJ4 = new AwS563S0100000_19(function0, (Function0<Unit>) 2942);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ4);
                }
                c13zcLJIIJ.LJJJJL(false);
                interfaceC1685750ty9LIZ = C634380OuS.LIZ(c1685760tyA, interfaceC595010NVj, null, true, null, null, (Function0) objLJJ4);
            } else {
                interfaceC1685750ty9LIZ = c1685760tyA;
            }
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ2 = interfaceC1685750ty9LIZLLL.LIZ(interfaceC1685750ty9LIZ);
            InterfaceC1668050tVb.LIZ.getClass();
            C1296870jqv c1296870jqv = C1668040tVa.LIZIZ;
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(c1296870jqv, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZ2);
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
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, aFwS311S0000000_25);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJFF;
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, aFwS311S0000000_252);
                AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_253);
                }
                AFwS311S0000000_25 aFwS311S0000000_254 = g.a.LIZLLL;
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                LJ(interfaceC1676320tiw.LIZLLL(), 0, c13zcLJIIJ, zBooleanValue);
                InterfaceC1685750ty9 interfaceC1685750ty9LIZ3 = C1671840tbi.LIZ(C1671840tbi.LIZIZ(c.LIZJ));
                C1296860jqu c1296860jqu = C1668040tVa.LJIILJJIL;
                C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(C1679930tol.LIZJ, c1296860jqu, c13zcLJIIJ, 48);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL3 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZ3);
                if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                    c13zcLJIIJ.LJJIII();
                    if (c13zcLJIIJ.LJJJI) {
                        c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                    } else {
                        c13zcLJIIJ.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ, aFwS311S0000000_25);
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL3, aFwS311S0000000_254);
                    C1687990u1l c1687990u1l = C1687990u1l.LIZ;
                    InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(c1685760tyA, 1.0f);
                    InterfaceC20053113dB interfaceC20053113dBLIZLLL2 = k.LIZLLL(c1296870jqv, false);
                    int iLIZ3 = C0MXE.LIZ(c13zcLJIIJ);
                    C13D2 c13d2LJJJIL3 = c13zcLJIIJ.LJJJIL();
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL4 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJ);
                    if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                        c13zcLJIIJ.LJJIII();
                        if (c13zcLJIIJ.LJJJI) {
                            c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                        } else {
                            c13zcLJIIJ.LJIILJJIL();
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL2, aFwS311S0000000_25);
                        C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL3, aFwS311S0000000_252);
                        if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ3))) {
                            c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ3));
                            c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ3), aFwS311S0000000_253);
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL4, aFwS311S0000000_254);
                        int i4 = i2 & 14;
                        LIZJ(c1220330hrT, c13zcLJIIJ, i4);
                        c13zcLJIIJ.LJJJJL(true);
                        InterfaceC1685750ty9 interfaceC1685750ty9LIZ4 = c1687990u1l.LIZ(c.LJIILLIIL(c1685760tyA, 311), 1.0f, true);
                        C1688130u1z c1688130u1zLIZ2 = C1665740tRs.LIZ(C1679930tol.LJ, c1296860jqu, c13zcLJIIJ, 54);
                        int iLIZ4 = C0MXE.LIZ(c13zcLJIIJ);
                        C13D2 c13d2LJJJIL4 = c13zcLJIIJ.LJJJIL();
                        InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL5 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZ4);
                        if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                            c13zcLJIIJ.LJJIII();
                            if (c13zcLJIIJ.LJJJI) {
                                c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                            } else {
                                c13zcLJIIJ.LJIILJJIL();
                            }
                            C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ2, aFwS311S0000000_25);
                            C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL4, aFwS311S0000000_252);
                            if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ4))) {
                                c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ4));
                                c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ4), aFwS311S0000000_253);
                            }
                            C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL5, aFwS311S0000000_254);
                            C1671420tb2.LIZJ(0, 0, c13zcLJIIJ, c1220330hrT.LIZ);
                            InterfaceC1685750ty9 interfaceC1685750ty9LJ2 = c.LJ(c1685760tyA, 1.0f);
                            InterfaceC20053113dB interfaceC20053113dBLIZLLL3 = k.LIZLLL(c1296870jqv, false);
                            int iLIZ5 = C0MXE.LIZ(c13zcLJIIJ);
                            C13D2 c13d2LJJJIL5 = c13zcLJIIJ.LJJJIL();
                            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL6 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJ2);
                            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                                c13zcLJIIJ.LJJIII();
                                if (c13zcLJIIJ.LJJJI) {
                                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                                } else {
                                    c13zcLJIIJ.LJIILJJIL();
                                }
                                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL3, aFwS311S0000000_25);
                                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL5, aFwS311S0000000_252);
                                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ5))) {
                                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ5));
                                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ5), aFwS311S0000000_253);
                                }
                                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL6, aFwS311S0000000_254);
                                C1666310tSn.LJ(c1220330hrT, c13zcLJIIJ, i4);
                                c13zcLJIIJ.LJJJJL(true);
                                c13zcLJIIJ.LJJJJL(true);
                                float f = 32;
                                float f2 = 20;
                                C1685190txF.LIZ(strLIZIZ, C1682520tsw.LJIIJJI(c.LJIJI(c.LJ(c1685760tyA, 1.0f), null, 3), f, f2, f, f2), C1670400tZO.LIZIZ(c13zcLJIIJ).E2(), C1670400tZO.LJ(c13zcLJIIJ).LJIJJ, 0L, 3, 0, false, 0, null, null, c13zcLJIIJ, 48, 0, 2000);
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
            c20030013YsLJJJJZI.LIZLLL = new AwS179S0101000_19(c1220330hrT, i, 16);
        }
    }

    public static final Bitmap LIZIZ(C05P0<Bitmap> c05p0, C05P0<Bitmap> c05p02, C05P0<Bitmap> c05p03, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return c05p0.getValue();
                }
                return c05p03.getValue();
            }
            return c05p02.getValue();
        }
        return c05p0.getValue();
    }

    public static final void LJ(int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, boolean z) {
        int i3;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(491920458);
        if ((i2 & 6) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else if (z) {
            c13zcLJIIJ.LJJIIJZLJL(374087906);
            LIZ(i, c13zcLJIIJ, (i3 >> 3) & 14);
            c13zcLJIIJ.LJJJJL(false);
        } else {
            c13zcLJIIJ.LJJIIJZLJL(374214200);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            if (objLJJ == C1680510tph.LIZIZ) {
                objLJJ = AFwS266S0000000_25.get$arr$(442);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            c13zcLJIIJ.LJJJJL(false);
            C20084413iE.LIZ(54, 4, c13zcLJIIJ, c.LIZLLL(InterfaceC1685750ty9.LIZ), (Function1) objLJJ, null);
            c13zcLJIIJ.LJJJJL(false);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1669900tYa(z, i, i2);
        }
    }
}
