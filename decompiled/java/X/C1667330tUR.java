package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.profilerec.vm.ProfileRecViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS121S0201000_9;
import kotlin.jvm.internal.AwS123S1100000_9;
import kotlin.jvm.internal.AwS158S1100000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS62S0301000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tUR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1667330tUR {
    public static final void LIZJ(C632880Os2 c632880Os2, ProfileRecViewModel profileRecViewModel, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(314114339);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(c632880Os2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(profileRecViewModel)) {
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
            InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(c1685760tyA, 1.0f);
            C1679940tom c1679940tom = C1679930tol.LJ;
            InterfaceC1668050tVb.LIZ.getClass();
            int i5 = 6;
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(c1679940tom, C1668040tVa.LJIIJ, c13zcLJIIJ, 6);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, c1688120u1yLIZ, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                C1687980u1k c1687980u1k = C1687980u1k.LIZ;
                List<C632960OsA> list = c632880Os2.LJIIIIZZ;
                int i6 = (i2 << 3) & 896;
                int i7 = 3;
                LIZ(((C632960OsA) ListProtector.get(list, 0)).LIZIZ, ((C632960OsA) ListProtector.get(list, 0)).LIZ, profileRecViewModel, c1687980u1k.LIZ(c1685760tyA, 0.33f, false), c13zcLJIIJ, i6, 0);
                c13zcLJIIJ.LJJIIJZLJL(-58226543);
                int size = list.size();
                if (size <= 3) {
                    i7 = size;
                }
                int i8 = 1;
                while (i8 < i7) {
                    C632960OsA c632960OsA = (C632960OsA) ListProtector.get(list, i8);
                    C1685760tyA c1685760tyA2 = InterfaceC1685750ty9.LIZ;
                    C1665790tRx.LIZ(c.LJIILLIIL(c1685760tyA2, i5), c13zcLJIIJ);
                    LIZ(c632960OsA.LIZIZ, c632960OsA.LIZ, profileRecViewModel, c1687980u1k.LIZ(c1685760tyA2, 0.33f, false), c13zcLJIIJ, i6, 0);
                    i8++;
                    i5 = 6;
                }
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS121S0201000_9(c632880Os2, profileRecViewModel, i, 6);
        }
    }

    public static final void LIZLLL(C632880Os2 c632880Os2, ProfileRecViewModel profileRecViewModel, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1325879145);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(c632880Os2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(profileRecViewModel)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            Context context = (Context) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_color_verified_badge;
                objLJJ = c419910GdJ.LIZ(context);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            Drawable drawable = (Drawable) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1668050tVb.LIZ.getClass();
            C1296860jqu c1296860jqu = C1668040tVa.LJIILJJIL;
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(C1679930tol.LIZJ, c1296860jqu, c13zcLJIIJ, 48);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, c1685760tyA);
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
                InterfaceC1685750ty9 interfaceC1685750ty9LJIILIIL = c.LJIILIIL(c1685760tyA, 60);
                C1669400tXm c1669400tXm = C1669050tXD.LIZ;
                InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1675980tiO.LIZIZ(C1667200tUE.LIZ(interfaceC1685750ty9LJIILIIL, c1669400tXm), C1670400tZO.LIZIZ(c13zcLJIIJ).L3(), c1669400tXm);
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                boolean zLJII = c13zcLJIIJ.LJII(profileRecViewModel);
                Object objLJJ2 = c13zcLJIIJ.LJJ();
                if (zLJII || objLJJ2 == c1680520tpi) {
                    objLJJ2 = new AwS553S0100000_9(profileRecViewModel, 1659);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                }
                c13zcLJIIJ.LJJJJL(false);
                InterfaceC1685750ty9 interfaceC1685750ty9LIZJ = C634380OuS.LIZJ(interfaceC1685750ty9LIZIZ, false, null, (Function0) objLJJ2, 7);
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ3 = c13zcLJIIJ.LJJ();
                if (objLJJ3 == c1680520tpi) {
                    objLJJ3 = AFwS240S0000000_9.get$arr$(703);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ3);
                }
                Function1 function1 = (Function1) objLJJ3;
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJIIJZLJL(-1633490746);
                boolean zLJII2 = c13zcLJIIJ.LJII(c632880Os2) | c13zcLJIIJ.LJII(profileRecViewModel);
                Object objLJJ4 = c13zcLJIIJ.LJJ();
                if (zLJII2 || objLJJ4 == c1680520tpi) {
                    objLJJ4 = new AwS375S0200000_9(c632880Os2, profileRecViewModel, 118);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ4);
                }
                c13zcLJIIJ.LJJJJL(false);
                C20084413iE.LIZ(6, 0, c13zcLJIIJ, interfaceC1685750ty9LIZJ, function1, (Function1) objLJJ4);
                C1665790tRx.LIZ(c.LJI(c1685760tyA, 8), c13zcLJIIJ);
                C1296880jqw c1296880jqw = C1668040tVa.LJIIJJI;
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                boolean zLJII3 = c13zcLJIIJ.LJII(profileRecViewModel);
                Object objLJJ5 = c13zcLJIIJ.LJJ();
                if (zLJII3 || objLJJ5 == c1680520tpi) {
                    objLJJ5 = new AwS553S0100000_9(profileRecViewModel, 1660);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ5);
                }
                c13zcLJIIJ.LJJJJL(false);
                InterfaceC1685750ty9 interfaceC1685750ty9LIZJ2 = C634380OuS.LIZJ(c1685760tyA, false, null, (Function0) objLJJ5, 7);
                C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(C1679930tol.LIZ, c1296880jqw, c13zcLJIIJ, 48);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZJ2);
                if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                    c13zcLJIIJ.LJJIII();
                    if (c13zcLJIIJ.LJJJI) {
                        c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                    } else {
                        c13zcLJIIJ.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, c1688120u1yLIZ, aFwS311S0000000_25);
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                    C1685190txF.LIZ(c632880Os2.LIZIZ, null, 0L, new C1693430uAX(C1670400tZO.LIZIZ(c13zcLJIIJ).L3(), C1682430tsn.LJ(18), C1680190tpB.LLJ, null, null, 0L, null, 0, 0L, 16777208), C1682430tsn.LJ(9), 0, 2, false, 1, null, null, c13zcLJIIJ, 102260736, 0, 1702);
                    c13zcLJIIJ.LJJIIJZLJL(304054744);
                    if (c632880Os2.LJI) {
                        i3 = 4;
                        C1665790tRx.LIZ(c.LJIILLIIL(c1685760tyA, 4), c13zcLJIIJ);
                        C1668230tVt.LIZ(C1668830tWr.LIZIZ(drawable, c13zcLJIIJ), "Verified Badge", c.LJIILIIL(c1685760tyA, 12), null, null, 0.0f, null, c13zcLJIIJ, 432, 120);
                    } else {
                        i3 = 4;
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    c13zcLJIIJ.LJJJJL(true);
                    c13zcLJIIJ.LJJIIJZLJL(-2107458579);
                    if (C123100dR.LIZ(c632880Os2.LIZLLL)) {
                        C1665790tRx.LIZ(c.LJI(c1685760tyA, i3), c13zcLJIIJ);
                        String str = c632880Os2.LIZLLL;
                        C1693430uAX c1693430uAX = new C1693430uAX(C1670400tZO.LIZIZ(c13zcLJIIJ).L3(), C1682430tsn.LJ(14), null, null, null, 0L, null, 3, 0L, 16744444);
                        long jLJ = C1682430tsn.LJ(9);
                        c13zcLJIIJ.LJJIIJZLJL(5004770);
                        boolean zLJII4 = c13zcLJIIJ.LJII(profileRecViewModel);
                        Object objLJJ6 = c13zcLJIIJ.LJJ();
                        if (zLJII4 || objLJJ6 == c1680520tpi) {
                            objLJJ6 = new AwS553S0100000_9(profileRecViewModel, 1661);
                            c13zcLJIIJ.LJJIJIIJI(objLJJ6);
                        }
                        c13zcLJIIJ.LJJJJL(false);
                        C1685190txF.LIZ(str, C634380OuS.LIZJ(c1685760tyA, false, null, (Function0) objLJJ6, 7), 0L, c1693430uAX, jLJ, 0, 2, false, 3, null, null, c13zcLJIIJ, 102260736, 0, 1700);
                    }
                    c13zcLJIIJ.LJJJJL(false);
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
            c20030013YsLJJJJZI.LIZLLL = new AwS121S0201000_9(c632880Os2, profileRecViewModel, i, 7);
        }
    }

    public static final void LIZIZ(C632880Os2 c632880Os2, Function0<Unit> function0, Function0<Unit> function02, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        String strLIZIZ;
        C1666330tSp c1666330tSpLIZ;
        int i3;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1782226945);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(c632880Os2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function02)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(c1685760tyA, 1.0f);
            C1679960too c1679960too = C1679930tol.LJI;
            InterfaceC1668050tVb.LIZ.getClass();
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(c1679960too, C1668040tVa.LJIIJ, c13zcLJIIJ, 6);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, c1688120u1yLIZ, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                C1687980u1k c1687980u1k = C1687980u1k.LIZ;
                float f = 48;
                C1673400teE.LIZJ(function0, C0MBB.LIZIZ(2131835416, c13zcLJIIJ), c.LJI(c1687980u1k.LIZ(c1685760tyA, 1.0f, true), f), false, 0L, false, null, null, null, C1666920tTm.LIZ(0.0f, null, 0.0f, c13zcLJIIJ, 0, 15), C1666340tSq.LIZIZ(0L, 0L, 0L, c13zcLJIIJ, 0, 31), null, false, c13zcLJIIJ, (i2 >> 3) & 14, 0, 6648);
                C1665790tRx.LIZ(c.LJIILLIIL(c1685760tyA, 12), c13zcLJIIJ);
                int i6 = C632850Orz.LIZ[c632880Os2.LIZIZ().ordinal()];
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 == 3) {
                            c13zcLJIIJ.LJJIIJZLJL(-236822580);
                            strLIZIZ = C0MBB.LIZIZ(R.string.jqb, c13zcLJIIJ);
                            c13zcLJIIJ.LJJJJL(false);
                        } else {
                            c13zcLJIIJ.LJJIIJZLJL(-236832397);
                            c13zcLJIIJ.LJJJJL(false);
                            throw new C1954807lC();
                        }
                    } else {
                        c13zcLJIIJ.LJJIIJZLJL(-236826387);
                        strLIZIZ = C0MBB.LIZIZ(2131857633, c13zcLJIIJ);
                        c13zcLJIIJ.LJJJJL(false);
                    }
                } else {
                    c13zcLJIIJ.LJJIIJZLJL(-236829886);
                    strLIZIZ = C0MBB.LIZIZ(2131838429, c13zcLJIIJ);
                    c13zcLJIIJ.LJJJJL(false);
                }
                InterfaceC1685750ty9 interfaceC1685750ty9LJI = c.LJI(c1687980u1k.LIZ(c1685760tyA, 1.0f, true), f);
                long jLJ = C1682430tsn.LJ(12);
                if (c632880Os2.LIZIZ() != EnumC632860Os0.TO_FOLLOW) {
                    c13zcLJIIJ.LJJIIJZLJL(-236809778);
                    c1666330tSpLIZ = C1666340tSq.LIZIZ(0L, 0L, 0L, c13zcLJIIJ, 0, 31);
                } else {
                    c13zcLJIIJ.LJJIIJZLJL(-236808532);
                    c1666330tSpLIZ = C1666340tSq.LIZ(0L, 0L, 0.0f, 0L, c13zcLJIIJ, 0, 31);
                }
                c13zcLJIIJ.LJJJJL(false);
                C1673400teE.LIZJ(function02, strLIZIZ, interfaceC1685750ty9LJI, false, jLJ, false, null, null, null, C1666920tTm.LIZ(0.0f, null, 0.0f, c13zcLJIIJ, 0, 15), c1666330tSpLIZ, null, false, c13zcLJIIJ, ((i2 >> 6) & 14) | 24576, 0, 6632);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS62S0301000_25(c632880Os2, (C632880Os2) function0, function02, (Function0<Unit>) i, 19);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJ(X.InterfaceC898260ZLs r16, kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Boolean, kotlin.Unit> r17, com.ss.android.ugc.aweme.profilerec.vm.ProfileRecViewModel r18, X.InterfaceC1680500tpg r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1667330tUR.LJ(X.0ZLs, kotlin.jvm.functions.Function2, com.ss.android.ugc.aweme.profilerec.vm.ProfileRecViewModel, X.0tpg, int, int):void");
    }

    public static final void LIZ(String str, String str2, ProfileRecViewModel profileRecViewModel, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        boolean z3;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1703175464);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(profileRecViewModel)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i3 & 1171) == 1170 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i8 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            Context context = (Context) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_play_fill;
                c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
                objLJJ = c419910GdJ.LIZ(context);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            Drawable drawable = (Drawable) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            float f = 8;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1667200tUE.LIZ(C1675980tiO.LIZIZ(C1675450thX.LIZ(c.LJIILLIIL(interfaceC1685750ty92, 97), 0.76f), C1670400tZO.LIZIZ(c13zcLJIIJ).G3(), C1669050tXD.LIZIZ(f)), C1669050tXD.LIZIZ(f));
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJII = c13zcLJIIJ.LJII(profileRecViewModel);
            if ((i3 & 112) == 32) {
                z = true;
            } else {
                z = false;
            }
            boolean z4 = z | zLJII;
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (z4 || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS158S1100000_9(profileRecViewModel, str2, 20);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZJ = C634380OuS.LIZJ(interfaceC1685750ty9LIZ, false, null, (Function0) objLJJ2, 7);
            InterfaceC1668050tVb.LIZ.getClass();
            C1296870jqv c1296870jqv = C1668040tVa.LJFF;
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(c1296870jqv, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZJ);
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
                if (C123100dR.LIZ(str)) {
                    c13zcLJIIJ.LJJIIJZLJL(-1306197745);
                    C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1675980tiO.LIZIZ(c.LIZLLL(c1685760tyA), C1685910tyP.LIZLLL, C1669430tXp.LIZ);
                    c13zcLJIIJ.LJJIIJZLJL(1849434622);
                    Object objLJJ3 = c13zcLJIIJ.LJJ();
                    if (objLJJ3 == c1680520tpi) {
                        objLJJ3 = AFwS240S0000000_9.get$arr$(702);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ3);
                    }
                    Function1 function1 = (Function1) objLJJ3;
                    c13zcLJIIJ.LJJJJL(false);
                    c13zcLJIIJ.LJJIIJZLJL(-1633490746);
                    if ((i3 & 14) == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean zLJII2 = z3 | c13zcLJIIJ.LJII(profileRecViewModel);
                    Object objLJJ4 = c13zcLJIIJ.LJJ();
                    if (zLJII2 || objLJJ4 == c1680520tpi) {
                        objLJJ4 = new AwS123S1100000_9(profileRecViewModel, str, 4);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ4);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    C20084413iE.LIZ(54, 0, c13zcLJIIJ, interfaceC1685750ty9LIZIZ, function1, (Function1) objLJJ4);
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ2 = C1675980tiO.LIZIZ(c.LJIILIIL(c1685760tyA, 28), C1685910tyP.LIZJ(0.3f, C1685910tyP.LIZIZ), C1669050tXD.LIZ);
                    InterfaceC20053113dB interfaceC20053113dBLIZLLL2 = k.LIZLLL(c1296870jqv, false);
                    int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                    C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZIZ2);
                    if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                        c13zcLJIIJ.LJJIII();
                        if (c13zcLJIIJ.LJJJI) {
                            c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                        } else {
                            c13zcLJIIJ.LJIILJJIL();
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL2, aFwS311S0000000_25);
                        C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                        if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                            c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                            c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                        z2 = true;
                        C1668230tVt.LIZ(C1668830tWr.LIZIZ(drawable, c13zcLJIIJ), "Play Video", c.LJIILIIL(c1685760tyA, 16), null, null, 0.0f, null, c13zcLJIIJ, 432, 120);
                        c13zcLJIIJ.LJJJJL(true);
                        c13zcLJIIJ.LJJJJL(false);
                    } else {
                        C0MXE.LIZIZ();
                        throw null;
                    }
                } else {
                    z2 = true;
                    c13zcLJIIJ.LJJIIJZLJL(-1305218052);
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ3 = C1675980tiO.LIZIZ(c.LIZLLL(InterfaceC1685750ty9.LIZ), C1685910tyP.LIZLLL, C1669430tXp.LIZ);
                    c13zcLJIIJ.LJJIIJZLJL(1849434622);
                    Object objLJJ5 = c13zcLJIIJ.LJJ();
                    if (objLJJ5 == c1680520tpi) {
                        objLJJ5 = AFwS266S0000000_25.get$arr$(354);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ5);
                    }
                    Function1 function12 = (Function1) objLJJ5;
                    c13zcLJIIJ.LJJJJL(false);
                    c13zcLJIIJ.LJJIIJZLJL(1849434622);
                    Object objLJJ6 = c13zcLJIIJ.LJJ();
                    if (objLJJ6 == c1680520tpi) {
                        objLJJ6 = AFwS266S0000000_25.get$arr$(355);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ6);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    C20084413iE.LIZ(438, 0, c13zcLJIIJ, interfaceC1685750ty9LIZIZ3, function12, (Function1) objLJJ6);
                    c13zcLJIIJ.LJJJJL(false);
                }
                c13zcLJIIJ.LJJJJL(z2);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C632970OsB(str, str2, profileRecViewModel, interfaceC1685750ty92, i, i2);
        }
    }
}
