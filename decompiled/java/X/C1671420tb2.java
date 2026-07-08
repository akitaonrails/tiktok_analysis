package X;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS0S1002000_25;
import kotlin.jvm.internal.AwS0S1101001_25;
import kotlin.jvm.internal.AwS19S1001000_25;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS69S0001000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tb2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1671420tb2 {
    public static final void LJFF(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-252919824);
        if (i == 0 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            int iLIZ = C1674990tgn.LIZIZ.LIZ();
            c13zcLJIIJ.LJJIIJZLJL(1757188777);
            if (iLIZ != 0) {
                LIZ(iLIZ, c13zcLJIIJ, 0);
                c13zcLJIIJ.LJJJJL(false);
                C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
                if (c20030013YsLJJJJZI != null) {
                    c20030013YsLJJJJZI.LIZLLL = new AwS69S0001000_25(i, 11);
                    return;
                }
                return;
            }
            c13zcLJIIJ.LJJJJL(false);
            LJI(c13zcLJIIJ, 0);
        }
        C20030013Ys c20030013YsLJJJJZI2 = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI2 != null) {
            c20030013YsLJJJJZI2.LIZLLL = new AwS69S0001000_25(i, 12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJI(X.InterfaceC1680500tpg r20, int r21) {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1671420tb2.LJI(X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(int r19, X.InterfaceC1680500tpg r20, int r21) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1671420tb2.LIZ(int, X.0tpg, int):void");
    }

    public static final void LIZIZ(int i, InterfaceC1680500tpg interfaceC1680500tpg, String str) {
        int i2;
        float f;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(412497090);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
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
            Configuration configuration = (Configuration) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZ);
            boolean zBooleanValue = ((Boolean) C280350Ayn.LIZ.getValue()).booleanValue();
            boolean z = true;
            if (C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() != 1 ? configuration.screenHeightDp >= 654 : configuration.screenWidthDp >= 374) {
                z = false;
            }
            if (z) {
                f = ((configuration.screenWidthDp * 0.74f) + ((float) (-57.04d))) / 220;
            } else {
                f = 1.0f;
            }
            C13ZT.LIZ(C20055113dV.LJIILIIL.LIZJ(EnumC1671200tag.Ltr), C13Z4.LIZJ(1902041474, new C1670000tYk(str, 220 * f, 25 * f, f, zBooleanValue), c13zcLJIIJ), c13zcLJIIJ, 56);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS19S1001000_25(str, i, 2);
        }
    }

    public static final void LJIIIIZZ(int i, InterfaceC1680500tpg interfaceC1680500tpg, String str) {
        int i2;
        String str2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(909448602);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
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
            InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(C1682520tsw.LJIIL(InterfaceC1685750ty9.LIZ, 0.0f, 56, 0.0f, 0.0f, 13), 1.0f);
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            C1685190txF.LIZ(str2, interfaceC1685750ty9LJ, C1670400tZO.LIZIZ(c13zcLJIIJ).LJJIJ(), C1670400tZO.LJ(c13zcLJIIJ).LIZLLL, C1682430tsn.LJ(10), 3, 2, false, 2, null, null, c13zcLJIIJ, 102260784, 0, 1664);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS19S1001000_25(str, i, 3);
        }
    }

    public static final void LJIIIZ(int i, InterfaceC1680500tpg interfaceC1680500tpg, String str) {
        int i2;
        int i3;
        C1693430uAX c1693430uAX;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1620542466);
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
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (str.length() > 30) {
                i3 = 1;
                c13zcLJIIJ.LJJIIJZLJL(-2146591416);
                c1693430uAX = C1670400tZO.LJ(c13zcLJIIJ).LJJII;
                c13zcLJIIJ.LJJJJL(false);
            } else {
                i3 = 2;
                c13zcLJIIJ.LJJIIJZLJL(-2146530036);
                c1693430uAX = C1670400tZO.LJ(c13zcLJIIJ).LJJIIJZLJL;
                c13zcLJIIJ.LJJJJL(false);
            }
            float f = 10;
            C1685190txF.LIZ(str, C1682520tsw.LJIIL(InterfaceC1685750ty9.LIZ, f, 3, f, 0.0f, 8), C1670400tZO.LIZIZ(c13zcLJIIJ).x2(), c1693430uAX, 0L, 0, 2, false, i3, null, null, c13zcLJIIJ, 1572864 | (i2 & 14), 0, 1712);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS19S1001000_25(str, i, 4);
        }
    }

    public static final void LIZJ(int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, String str) {
        int i3;
        int i4;
        User curUser;
        boolean z;
        List<String> urlList;
        boolean z2;
        boolean z3;
        String str2 = str;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1818651775);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i5 != 0) {
                str2 = null;
            }
            IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
            if (iAccountUserServiceLJFF != null && (curUser = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser()) != null) {
                Configuration configuration = (Configuration) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZ);
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                InterfaceC1685750ty9 interfaceC1685750ty9LJIJI = c.LJIJI(c.LJ(c1685760tyA, 1.0f), null, 3);
                if (C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() != 1 ? configuration.screenHeightDp < 374 : configuration.screenWidthDp < 654) {
                    z = false;
                    interfaceC1685750ty9LJIJI = interfaceC1685750ty9LJIJI.LIZ(C1682520tsw.LJIIL(c1685760tyA, 0.0f, 18.0f, 0.0f, 0.0f, 13));
                } else {
                    z = false;
                }
                InterfaceC1668050tVb.LIZ.getClass();
                InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, z);
                int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIJI);
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
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, aFwS311S0000000_254);
                    C1672220tcK c1672220tcK = C1672220tcK.LIZ;
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1675980tiO.LIZIZ(C1682520tsw.LJIIL(c.LJIJI(c.LJ(c1685760tyA, 1.0f), null, 3), 0.0f, 46, 0.0f, 0.0f, 13), C1670400tZO.LIZIZ(c13zcLJIIJ).LJJJJLI(), C1669050tXD.LIZIZ(24));
                    c13zcLJIIJ.LJJIIJZLJL(1849434622);
                    Object objLJJ = c13zcLJIIJ.LJJ();
                    InterfaceC1680500tpg.LIZ.getClass();
                    C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
                    if (objLJJ == c1680520tpi) {
                        objLJJ = AFwS214S0000000_25.get$arr$(439);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    float f = 32;
                    InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(C634380OuS.LIZJ(interfaceC1685750ty9LIZIZ, true, null, (Function0) objLJJ, 6), f, 0.0f, f, f, 2);
                    C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(C1679930tol.LJ, C1668040tVa.LJIILJJIL, c13zcLJIIJ, 54);
                    int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                    C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIL);
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
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                        LJIIIIZZ(0, c13zcLJIIJ, curUser.getNickname());
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append('@');
                        sbLIZ.append(C10EU.LIZJ(curUser));
                        LJIIIZ(0, c13zcLJIIJ, C2188811AlT.LIZIZ(sbLIZ));
                        LIZIZ(i3 & 14, c13zcLJIIJ, str2);
                        LJFF(c13zcLJIIJ, 0);
                        c13zcLJIIJ.LJJJJL(true);
                        UrlModel urlModelLIZ = C848410XPz.LIZ(curUser);
                        if (urlModelLIZ == null) {
                            urlList = C13BV.INSTANCE;
                        } else {
                            urlList = urlModelLIZ.getUrlList();
                        }
                        c13zcLJIIJ.LJJIIJZLJL(798181196);
                        if (!urlList.isEmpty()) {
                            c13zcLJIIJ.LJJIIJZLJL(1849434622);
                            Object objLJJ2 = c13zcLJIIJ.LJJ();
                            if (objLJJ2 == c1680520tpi) {
                                objLJJ2 = C20028913Yh.LJI(new C1175304il(urlList));
                                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                            }
                            c13zcLJIIJ.LJJJJL(false);
                            C1175304il c1175304il = (C1175304il) ((C05P0) objLJJ2).getValue();
                            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ2 = c1672220tcK.LIZIZ(c1685760tyA, C1668040tVa.LIZJ);
                            c13zcLJIIJ.LJJIIJZLJL(1849434622);
                            Object objLJJ3 = c13zcLJIIJ.LJJ();
                            if (objLJJ3 == c1680520tpi) {
                                objLJJ3 = AFwS214S0000000_25.get$arr$(440);
                                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
                            }
                            c13zcLJIIJ.LJJJJL(false);
                            z3 = false;
                            z2 = true;
                            LJII(c1175304il, C634380OuS.LIZJ(interfaceC1685750ty9LIZIZ2, true, null, (Function0) objLJJ3, 6), null, 0.0f, 0.0f, 0L, c13zcLJIIJ, 0, 60);
                        } else {
                            z2 = true;
                            z3 = false;
                        }
                        c13zcLJIIJ.LJJJJL(z3);
                        c13zcLJIIJ.LJJJJL(z2);
                    } else {
                        C0MXE.LIZIZ();
                        throw null;
                    }
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            } else {
                C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
                if (c20030013YsLJJJJZI != null) {
                    c20030013YsLJJJJZI.LIZLLL = new AwS0S1002000_25(str2, i, i2, 1);
                    return;
                }
                return;
            }
        }
        C20030013Ys c20030013YsLJJJJZI2 = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI2 != null) {
            c20030013YsLJJJJZI2.LIZLLL = new AwS0S1002000_25(str2, i, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(float r12, int r13, X.InterfaceC1680500tpg r14, X.InterfaceC1685750ty9 r15, java.lang.String r16) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1671420tb2.LIZLLL(float, int, X.0tpg, X.0ty9, java.lang.String):void");
    }

    public static final void LJ(float f, int i, InterfaceC1680500tpg interfaceC1680500tpg, InterfaceC1685750ty9 interfaceC1685750ty9, String str) {
        int i2;
        C14MJ c14mjLJIIIZ;
        int i3;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-189411812);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJIJ(f)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            Context context = (Context) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
            IUgCommonService iUgCommonService = (IUgCommonService) PluggableExtentionKt.pluggableSpi$default(IUgCommonService.class, false, false, false, 14, null);
            if (iUgCommonService != null && (c14mjLJIIIZ = iUgCommonService.LJIIIZ()) != null) {
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ = c13zcLJIIJ.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
                if (objLJJ == c1680520tpi) {
                    objLJJ = C20028913Yh.LJI(new ColorDrawable());
                    c13zcLJIIJ.LJJIJIIJI(objLJJ);
                }
                C05P0 c05p0 = (C05P0) objLJJ;
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJIIJZLJL(-1633490746);
                boolean zLJII = c13zcLJIIJ.LJII(context);
                Object objLJJ2 = c13zcLJIIJ.LJJ();
                if (zLJII || objLJJ2 == c1680520tpi) {
                    objLJJ2 = new AwS368S0200000_2(context, (Context) c05p0, (C05P0<Drawable>) 98);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                }
                c13zcLJIIJ.LJJJJL(false);
                c14mjLJIIIZ.LIZ(str, (Function1) objLJJ2);
                C1670600tZi.LIZ(new C989460br6((Drawable) c05p0.getValue()), "", c.LJI(c.LJIILLIIL(interfaceC1685750ty9, f), f), null, null, null, null, null, null, null, c13zcLJIIJ, 48, 1016);
            } else {
                C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
                if (c20030013YsLJJJJZI != null) {
                    c20030013YsLJJJJZI.LIZLLL = new AwS0S1101001_25(f, i, interfaceC1685750ty9, str, 3);
                    return;
                }
                return;
            }
        }
        C20030013Ys c20030013YsLJJJJZI2 = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI2 != null) {
            c20030013YsLJJJJZI2.LIZLLL = new AwS0S1101001_25(f, i, interfaceC1685750ty9, str, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJII(X.InterfaceC1670590tZh r23, X.InterfaceC1685750ty9 r24, java.lang.String r25, float r26, float r27, long r28, X.InterfaceC1680500tpg r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1671420tb2.LJII(X.0tZh, X.0ty9, java.lang.String, float, float, long, X.0tpg, int, int):void");
    }
}
