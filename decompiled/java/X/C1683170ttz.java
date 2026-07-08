package X;

import Y.ALAdapterS0S0200000_2;
import Y.ARunnableS71S0200000_2;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.compose.foundation.layout.c;
import java.security.SecureRandom;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS0S0122000_25;
import kotlin.jvm.internal.AwS13S0220000_25;
import kotlin.jvm.internal.AwS20S0111000_25;
import kotlin.jvm.internal.AwS37S0010000_25;
import kotlin.jvm.internal.AwS4S0112000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0ttz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683170ttz {
    public static final SecureRandom LIZ = new SecureRandom();

    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C05P0 LJFF(X.EnumC429390Gsb r5, X.InterfaceC1680500tpg r6) {
        /*
            r0 = 1516108560(0x5a5dfb10, float:1.5620504E16)
            r6.LJJIIJZLJL(r0)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r6.LJJIIJZLJL(r0)
            java.lang.Object r4 = r6.LJJ()
            X.0tph r3 = X.InterfaceC1680500tpg.LIZ
            r3.getClass()
            X.0tpi r2 = X.C1680510tph.LIZIZ
            if (r4 != r2) goto L21
            r0 = 0
            X.05P0 r4 = X.C20028913Yh.LJI(r0)
            r6.LJJIJIIJI(r4)
        L21:
            X.05P0 r4 = (X.C05P0) r4
            r6.LJ()
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r6.LJJIIJZLJL(r0)
            boolean r0 = r6.LJJIIJ(r4)
            java.lang.Object r1 = r6.LJJ()
            if (r0 != 0) goto L3b
            r3.getClass()
            if (r1 != r2) goto L45
        L3b:
            kotlin.jvm.internal.AwS398S0200000_32 r1 = new kotlin.jvm.internal.AwS398S0200000_32
            r0 = 82
            r1.<init>(r5, r4, r0)
            r6.LJJIJIIJI(r1)
        L45:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r6.LJ()
            X.C1680540tpk.LIZIZ(r5, r1, r6)
            r6.LJ()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1683170ttz.LJFF(X.0Gsb, X.0tpg):X.05P0");
    }

    public static final void LJI(C1294720jnS c1294720jnS, long j, FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        float f = context.getResources().getDisplayMetrics().density;
        int i = (int) (120 * f);
        float f2 = 20 * f;
        SecureRandom secureRandom = LIZ;
        float fNextFloat = ((secureRandom.nextFloat() * 2.0f) - 1.0f) * f2;
        float fNextFloat2 = ((secureRandom.nextFloat() * 2.0f) - 1.0f) * f2;
        C1295960jpS c1295960jpS = new C1295960jpS(context);
        c1295960jpS.enableMergePathsForKitKatAndAbove(true);
        c1295960jpS.setComposition(c1294720jnS);
        C786410Ut5.s6(c1295960jpS, new FrameLayout.LayoutParams(i, i));
        float f3 = i / 2.0f;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (j >> 32)) + fNextFloat) - f3;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1295960jpS);
        c1295960jpS.setX(fIntBitsToFloat);
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (j & 4294967295L)) + fNextFloat2) - f3;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1295960jpS);
        c1295960jpS.setY(fIntBitsToFloat2);
        frameLayout.addView(c1295960jpS);
        c1295960jpS.addAnimatorListener(new ALAdapterS0S0200000_2(frameLayout, new ARunnableS71S0200000_2(frameLayout, c1295960jpS, 20), 3));
        c1295960jpS.playAnimation();
    }

    public static final void LIZ(boolean z, Function0<Unit> function0, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1822943909);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = new C612270Nzt();
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C634380OuS.LIZ(c.LJIILIIL(c1685760tyA, 34), (InterfaceC595010NVj) objLJJ, null, true, null, null, function0);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LJFF, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZ);
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
                InterfaceC1685750ty9 interfaceC1685750ty9LJIILIIL = c.LJIILIIL(c1685760tyA, 16);
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ2 = c13zcLJIIJ.LJJ();
                if (objLJJ2 == c1680520tpi) {
                    objLJJ2 = AFwS266S0000000_25.get$arr$(477);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                }
                Function1 function1 = (Function1) objLJJ2;
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                if ((i2 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object objLJJ3 = c13zcLJIIJ.LJJ();
                if (z2 || objLJJ3 == c1680520tpi) {
                    objLJJ3 = new AwS37S0010000_25(z, 29);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ3);
                }
                c13zcLJIIJ.LJJJJL(false);
                C20084413iE.LIZ(54, 0, c13zcLJIIJ, interfaceC1685750ty9LJIILIIL, function1, (Function1) objLJJ3);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS20S0111000_25(i, z, function0, 4);
        }
    }

    public static final void LJ(int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, InterfaceC1685750ty9 interfaceC1685750ty9, boolean z) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        float f;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1870431325);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i6 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                if (z) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                objLJJ = C1677470tkn.LIZ(f);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C1677480tko c1677480tko = (C1677480tko) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            C05P0 c05p0 = (C05P0) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            Boolean boolValueOf = Boolean.valueOf(z);
            c13zcLJIIJ.LJJIIJZLJL(-1746271574);
            boolean zLJII = c13zcLJIIJ.LJII(c1677480tko);
            if ((i3 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3 = z2 | zLJII;
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (z3 || objLJJ3 == c1680520tpi) {
                objLJJ3 = new C1356105Sl(c1677480tko, c05p0, null, z);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(boolValueOf, (Function2) objLJJ3, c13zcLJIIJ);
            long jU2 = C1670400tZO.LIZIZ(c13zcLJIIJ).U2();
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            boolean zLJII2 = c13zcLJIIJ.LJII(c1677480tko);
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (zLJII2 || objLJJ4 == c1680520tpi) {
                objLJJ4 = new AwS604S0100000_25(c1677480tko, (C1677480tko<Float, C1677280tkU>) 630);
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            c13zcLJIIJ.LJJJJL(false);
            k.LIZ(C1675980tiO.LIZIZ(C1679660toK.LIZ(interfaceC1685750ty92, (Function1) objLJJ4), jU2, C1669050tXD.LIZ), c13zcLJIIJ, 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS4S0112000_25(i, i2, interfaceC1685750ty92, z, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(int r16, int r17, X.InterfaceC1680500tpg r18, kotlin.jvm.functions.Function0 r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1683170ttz.LIZIZ(int, int, X.0tpg, kotlin.jvm.functions.Function0, boolean, boolean):void");
    }

    public static final void LIZLLL(int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, Function0 function0, boolean z, boolean z2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z3 = z2;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1603999896);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
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
            if (c13zcLJIIJ.LJII(function0)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z3)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i3 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i7 != 0) {
                z3 = false;
            }
            C19719212De c19719212DeLIZJ = C13Z4.LIZJ(847368788, new AwS13S0220000_25((C1294720jnS) LJFF(EnumC429390Gsb.LIKE_ICON, c13zcLJIIJ).getValue(), (C1294720jnS) z, (boolean) function0, (Function0<Unit>) z3, true), c13zcLJIIJ);
            if (z3) {
                c13zcLJIIJ.LJJIIJZLJL(1045839891);
                InterfaceC1668050tVb.LIZ.getClass();
                C1296870jqv c1296870jqv = C1668040tVa.LJFF;
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(c1296870jqv, false);
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
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, g.a.LJI);
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                    AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                    LJ(i3 & 14, 0, c13zcLJIIJ, C1672220tcK.LIZ.LIZ(c1685760tyA), z);
                    c19719212DeLIZJ.invoke(c13zcLJIIJ, 6);
                    c13zcLJIIJ.LJJJJL(true);
                    c13zcLJIIJ.LJJJJL(false);
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            } else {
                c13zcLJIIJ.LJJIIJZLJL(1046099330);
                c19719212DeLIZJ.invoke(c13zcLJIIJ, 6);
                c13zcLJIIJ.LJJJJL(false);
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS0S0122000_25(i, i2, function0, z, z3, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(boolean r25, X.C1294720jnS r26, kotlin.jvm.functions.Function0<kotlin.Unit> r27, boolean r28, X.InterfaceC1680500tpg r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1683170ttz.LIZJ(boolean, X.0jnS, kotlin.jvm.functions.Function0, boolean, X.0tpg, int, int):void");
    }
}
