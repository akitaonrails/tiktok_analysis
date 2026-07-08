package X;

import android.content.Context;
import com.ss.android.ugc.trill.setting.compose.DisplayAndCaptionVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS123S0201000_19;
import kotlin.jvm.internal.AwS126S0201000_30;
import kotlin.jvm.internal.AwS455S0200000_19;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS644S0100000_30;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.14XH, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14XH {
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJ(android.content.Context r34, X.InterfaceC1680500tpg r35, int r36) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14XH.LJ(android.content.Context, X.0tpg, int):void");
    }

    public static final void LIZ(Context context, DisplayAndCaptionVM displayAndCaptionVM, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1598391120);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(context)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(displayAndCaptionVM)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C14XI c14xi = (C14XI) C1244280iU6.LIZ(displayAndCaptionVM, null, c13zcLJIIJ, (i2 >> 3) & 14, 7).getValue();
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(Boolean.valueOf(C746760TRa.LIZ().LJJJLZIJ()));
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            if (c14xi.LLILZ) {
                String string = context.getString(2131838819);
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                Object objLJJ2 = c13zcLJIIJ.LJJ();
                if (objLJJ2 == c1680520tpi) {
                    objLJJ2 = new AwS574S0100000_30(c05p0, 331);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                }
                c13zcLJIIJ.LJJJJL(false);
                C1673210tdv.LIZ(null, string, 0, null, false, false, null, false, null, false, null, false, false, null, null, null, null, null, (Function0) objLJJ2, null, null, null, null, false, C13Z4.LIZJ(1828103852, new AwS633S0100000_19(c05p0, (C05P0<Boolean>) 244), c13zcLJIIJ), c13zcLJIIJ, 0, 100663728, 24576, 16508925);
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS123S0201000_19(context, displayAndCaptionVM, i, 4);
        }
    }

    public static final void LIZIZ(Context context, DisplayAndCaptionVM displayAndCaptionVM, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1611408444);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(context)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(displayAndCaptionVM)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (!C1E8U.LIZ()) {
                C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
                if (c20030013YsLJJJJZI != null) {
                    c20030013YsLJJJJZI.LIZLLL = new AwS123S0201000_19(context, displayAndCaptionVM, i, 5);
                    return;
                }
                return;
            }
            C14XI c14xi = (C14XI) C1244280iU6.LIZ(displayAndCaptionVM, null, c13zcLJIIJ, (i2 >> 3) & 14, 7).getValue();
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(Boolean.valueOf(C746760TRa.LIZ().LJJIJIIJI()));
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            if (c14xi.LLILZIL) {
                String string = context.getString(2131830814);
                String string2 = context.getString(2131830830);
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                Object objLJJ2 = c13zcLJIIJ.LJJ();
                if (objLJJ2 == c1680520tpi) {
                    objLJJ2 = new AwS574S0100000_30(c05p0, 332);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                }
                c13zcLJIIJ.LJJJJL(false);
                C1673210tdv.LIZ(null, string, 0, string2, false, false, null, false, null, false, null, false, false, null, null, null, null, null, (Function0) objLJJ2, null, null, null, null, false, C13Z4.LIZJ(-680896431, new AwS633S0100000_19(c05p0, (C05P0<Boolean>) 245), c13zcLJIIJ), c13zcLJIIJ, 0, 100663728, 24576, 16508917);
            }
        }
        C20030013Ys c20030013YsLJJJJZI2 = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI2 != null) {
            c20030013YsLJJJJZI2.LIZLLL = new AwS123S0201000_19(context, displayAndCaptionVM, i, 6);
        }
    }

    public static final void LIZJ(Context context, DisplayAndCaptionVM displayAndCaptionVM, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1707047763);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(context)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(displayAndCaptionVM)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C14XI c14xi = (C14XI) C1244280iU6.LIZ(displayAndCaptionVM, null, c13zcLJIIJ, (i2 >> 3) & 14, 7).getValue();
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(Boolean.valueOf(C746760TRa.LIZ().LJLILLLLZI()));
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            if (c14xi.LLILLL) {
                String string = context.getString(2131828808);
                String string2 = context.getString(2131838820);
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                Object objLJJ2 = c13zcLJIIJ.LJJ();
                if (objLJJ2 == c1680520tpi) {
                    objLJJ2 = new AwS574S0100000_30(c05p0, 333);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                }
                c13zcLJIIJ.LJJJJL(false);
                C1673210tdv.LIZ(null, string, 0, string2, false, false, null, false, null, false, null, false, false, null, null, null, null, null, (Function0) objLJJ2, null, null, null, null, false, C13Z4.LIZJ(-540705071, new AwS633S0100000_19(c05p0, (C05P0<Boolean>) 246), c13zcLJIIJ), c13zcLJIIJ, 0, 100663728, 24576, 16508917);
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS123S0201000_19(context, displayAndCaptionVM, i, 7);
        }
    }

    public static final void LIZLLL(Context context, DisplayAndCaptionVM displayAndCaptionVM, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-16341666);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(context)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(displayAndCaptionVM)) {
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
            float f = 8;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c1685760tyA, f, 0.0f, f, 0.0f, 10);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
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
                float f2 = 6;
                InterfaceC1685750ty9 interfaceC1685750ty9LJIIL2 = C1682520tsw.LJIIL(C1675980tiO.LIZIZ(c1685760tyA, C1670400tZO.LIZIZ(c13zcLJIIJ).J2(), C1669050tXD.LIZIZ(f)), 0.0f, f2, 0.0f, f2, 5);
                C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(C1679930tol.LIZJ, C1668040tVa.LJIILIIL, c13zcLJIIJ, 0);
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
                    C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ, aFwS311S0000000_25);
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                    int i5 = i2 & 14;
                    LJ(context, c13zcLJIIJ, i5);
                    LJIIIIZZ(context, displayAndCaptionVM, c13zcLJIIJ, (i2 & 112) | i5);
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
            c20030013YsLJJJJZI.LIZLLL = new AwS126S0201000_30(context, displayAndCaptionVM, i, 9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJFF(android.content.Context r15, com.ss.android.ugc.trill.setting.compose.DisplayAndCaptionVM r16, X.InterfaceC1680500tpg r17, int r18) {
        /*
            r0 = 1067539434(0x3fa15bea, float:1.2606175)
            r1 = r17
            X.13ZC r2 = r1.LJIIJ(r0)
            r3 = r18
            r0 = r3 & 6
            r5 = r15
            if (r0 != 0) goto L8b
            boolean r0 = r2.LJII(r5)
            if (r0 == 0) goto L89
            r1 = 4
        L17:
            r1 = r1 | r3
        L18:
            r0 = r3 & 48
            r4 = r16
            if (r0 != 0) goto L27
            boolean r0 = r2.LJII(r4)
            if (r0 == 0) goto L86
            r0 = 32
        L26:
            r1 = r1 | r0
        L27:
            r1 = r1 & 19
            r0 = 18
            if (r1 != r0) goto L46
            boolean r0 = r2.LIZ()
            if (r0 == 0) goto L46
            r2.LIZJ()
        L36:
            X.13Ys r2 = r2.LJJJJZI()
            if (r2 == 0) goto L45
            kotlin.jvm.internal.AwS126S0201000_30 r1 = new kotlin.jvm.internal.AwS126S0201000_30
            r0 = 10
            r1.<init>(r5, r4, r3, r0)
            r2.LIZLLL = r1
        L45:
            return
        L46:
            r6 = 0
            r9 = 0
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r2.LJJIIJZLJL(r0)
            boolean r1 = r2.LJII(r5)
            boolean r0 = r2.LJII(r4)
            r1 = r1 | r0
            java.lang.Object r15 = r2.LJJ()
            if (r1 != 0) goto L66
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r15 != r0) goto L70
        L66:
            kotlin.jvm.internal.AwS396S0200000_30 r15 = new kotlin.jvm.internal.AwS396S0200000_30
            r0 = 35
            r15.<init>(r5, r4, r0)
            r2.LJJIJIIJI(r15)
        L70:
            kotlin.jvm.functions.Function1 r15 = (kotlin.jvm.functions.Function1) r15
            r2.LJJJJL(r9)
            r18 = 511(0x1ff, float:7.16E-43)
            r7 = r6
            r8 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r13 = r9
            r14 = r6
            r17 = r9
            r16 = r2
            X.C636400Oxi.LIZ(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L36
        L86:
            r0 = 16
            goto L26
        L89:
            r1 = 2
            goto L17
        L8b:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14XH.LJFF(android.content.Context, com.ss.android.ugc.trill.setting.compose.DisplayAndCaptionVM, X.0tpg, int):void");
    }

    public static final void LJI(Context context, Function0<Unit> function0, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1768298476);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(context)) {
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
            C1668060tVc.LIZ(null, false, 0L, C1670400tZO.LIZIZ(c13zcLJIIJ).I2(), null, C13Z4.LIZJ(2027154307, new AwS455S0200000_19(context, (Context) function0, (Function0<Unit>) 40), c13zcLJIIJ), C13Z4.LIZJ(370148066, new AwS633S0100000_19(context, 247), c13zcLJIIJ), null, c13zcLJIIJ, 1769472, 151);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS123S0201000_19(i, context, function0, 8);
        }
    }

    public static final void LJII(Context context, DisplayAndCaptionVM displayAndCaptionVM, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-864328577);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(context)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(displayAndCaptionVM)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C14XI c14xi = (C14XI) C1244280iU6.LIZ(displayAndCaptionVM, null, c13zcLJIIJ, (i2 >> 3) & 14, 7).getValue();
            if (c14xi.LLIZ) {
                C1673210tdv.LIZ(null, context.getString(2131828824), 0, context.getString(2131828784), false, false, null, false, null, false, null, false, false, null, null, null, null, null, c14xi.LLJILLL, null, null, null, null, false, C13Z4.LIZJ(-281032285, new AwS644S0100000_30(c14xi, 34), c13zcLJIIJ), c13zcLJIIJ, 0, 432, 24576, 16508917);
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS126S0201000_30(context, displayAndCaptionVM, i, 11);
        }
    }

    public static final void LJIIIIZZ(Context context, DisplayAndCaptionVM displayAndCaptionVM, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-73147597);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(context)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(displayAndCaptionVM)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C14XI c14xi = (C14XI) C1244280iU6.LIZ(displayAndCaptionVM, null, c13zcLJIIJ, (i2 >> 3) & 14, 7).getValue();
            if (c14xi.LL) {
                C1673210tdv.LIZ(null, context.getString(2131836408), 0, context.getString(2131836409), false, false, null, false, null, false, null, false, false, null, null, null, null, null, c14xi.LLJ, null, null, null, null, false, C13Z4.LIZJ(-1381429673, new AwS644S0100000_30(c14xi, 35), c13zcLJIIJ), c13zcLJIIJ, 0, 432, 24576, 16508917);
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS126S0201000_30(context, displayAndCaptionVM, i, 12);
        }
    }

    public static final void LJIIIZ(Context context, DisplayAndCaptionVM displayAndCaptionVM, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-586335962);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(context)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(displayAndCaptionVM)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C14XI c14xi = (C14XI) C1244280iU6.LIZ(displayAndCaptionVM, null, c13zcLJIIJ, (i2 >> 3) & 14, 7).getValue();
            if (c14xi.LLILZLL) {
                String string = context.getString(2131828779);
                if (!C281410B1f.LIZ() && !C299170Bo3.LIZIZ()) {
                    if (C0BI0.LIZ == 2) {
                        i3 = 2131836412;
                    } else {
                        i3 = 2131847279;
                    }
                } else if (C299180Bo4.LIZ()) {
                    i3 = 2131828807;
                } else {
                    i3 = 2131828806;
                }
                C1673210tdv.LIZ(null, string, 0, context.getString(i3), false, false, null, false, null, false, null, false, false, null, null, null, null, null, c14xi.LLJILJIL, null, null, null, null, false, C13Z4.LIZJ(-1816951166, new AwS644S0100000_30(c14xi, 36), c13zcLJIIJ), c13zcLJIIJ, 0, 432, 24576, 16508917);
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS126S0201000_30(context, displayAndCaptionVM, i, 13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v7 */
    public static final void LJIIJ(Context context, DisplayAndCaptionVM displayAndCaptionVM, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        ?? r5;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1284898696);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(context)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(displayAndCaptionVM)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C14XI c14xi = (C14XI) C1244280iU6.LIZ(displayAndCaptionVM, null, c13zcLJIIJ, (i2 >> 3) & 14, 7).getValue();
            if (c14xi.LLJI) {
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                float f = 8;
                InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c1685760tyA, f, 0.0f, f, 0.0f, 10);
                InterfaceC1668050tVb.LIZ.getClass();
                InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
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
                    C1680030tov c1680030tov = C1679930tol.LIZJ;
                    C1296860jqu c1296860jqu = C1668040tVa.LJIILIIL;
                    C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, c1296860jqu, c13zcLJIIJ, 0);
                    int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                    C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, c1685760tyA);
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
                        c13zcLJIIJ.LJJIIJZLJL(-2142201787);
                        if (c14xi.LLILLJJLI) {
                            r5 = 0;
                            C1688900u3E.LIZJ(context.getString(2131836411), true, false, false, null, c13zcLJIIJ, 48, 28);
                        } else {
                            r5 = 0;
                        }
                        c13zcLJIIJ.LJJJJL(r5);
                        InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1675980tiO.LIZIZ(c1685760tyA, C1670400tZO.LIZIZ(c13zcLJIIJ).J2(), C1669050tXD.LIZIZ(f));
                        float f2 = 6;
                        InterfaceC1685750ty9 interfaceC1685750ty9LJIIL2 = C1682520tsw.LJIIL(interfaceC1685750ty9LIZIZ, 0.0f, f2, 0.0f, f2, 5);
                        C1688130u1z c1688130u1zLIZ2 = C1665740tRs.LIZ(c1680030tov, c1296860jqu, c13zcLJIIJ, r5);
                        int iLIZ3 = C0MXE.LIZ(c13zcLJIIJ);
                        C13D2 c13d2LJJJIL3 = c13zcLJIIJ.LJJJIL();
                        InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL3 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIL2);
                        if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                            c13zcLJIIJ.LJJIII();
                            if (c13zcLJIIJ.LJJJI) {
                                c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                            } else {
                                c13zcLJIIJ.LJIILJJIL();
                            }
                            C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ2, aFwS311S0000000_25);
                            C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL3, aFwS311S0000000_252);
                            if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ3))) {
                                c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ3));
                                c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ3), aFwS311S0000000_253);
                            }
                            C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL3, aFwS311S0000000_254);
                            int i5 = (i2 & 14) | (i2 & 112);
                            LIZJ(context, displayAndCaptionVM, c13zcLJIIJ, i5);
                            LIZ(context, displayAndCaptionVM, c13zcLJIIJ, i5);
                            LIZIZ(context, displayAndCaptionVM, c13zcLJIIJ, i5);
                            LJIIIZ(context, displayAndCaptionVM, c13zcLJIIJ, i5);
                            LJII(context, displayAndCaptionVM, c13zcLJIIJ, i5);
                            c13zcLJIIJ.LJJJJL(true);
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
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS126S0201000_30(context, displayAndCaptionVM, i, 14);
        }
    }
}
