package X;

import android.view.View;
import androidx.compose.foundation.layout.c;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS0S1402000_25;
import kotlin.jvm.internal.AwS0S1502000_25;
import kotlin.jvm.internal.AwS0S1812000_25;
import kotlin.jvm.internal.AwS11S0120000_25;
import kotlin.jvm.internal.AwS124S0201000_25;
import kotlin.jvm.internal.AwS165S1200000_25;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS487S0200000_25;
import kotlin.jvm.internal.AwS49S0102000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS674S0100000_25;
import kotlin.jvm.internal.AwS6S0402000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;
import p2.j1;

/* JADX INFO: renamed from: X.0to0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1679460to0 {
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.EnumC1679580toC r12, kotlin.jvm.functions.Function1<? super X.EnumC1679580toC, kotlin.Unit> r13, X.InterfaceC1680500tpg r14, int r15) {
        /*
            r0 = -1319829977(0xffffffffb154fe27, float:-3.099453E-9)
            X.13ZC r3 = r14.LJIIJ(r0)
            r0 = r15 & 6
            if (r0 != 0) goto Lb9
            int r0 = r12.ordinal()
            boolean r0 = r3.LJIJI(r0)
            if (r0 == 0) goto Lb6
            r6 = 4
        L16:
            r6 = r6 | r15
        L17:
            r0 = r15 & 48
            r5 = 32
            r10 = r13
            if (r0 != 0) goto L27
            boolean r0 = r3.LJII(r10)
            if (r0 == 0) goto Lb2
            r0 = 32
        L26:
            r6 = r6 | r0
        L27:
            r1 = r6 & 19
            r0 = 18
            if (r1 != r0) goto L46
            boolean r0 = r3.LIZ()
            if (r0 == 0) goto L46
            r3.LIZJ()
        L36:
            X.13Ys r2 = r3.LJJJJZI()
            if (r2 == 0) goto L45
            kotlin.jvm.internal.AwS124S0201000_25 r1 = new kotlin.jvm.internal.AwS124S0201000_25
            r0 = 63
            r1.<init>(r12, r10, r15, r0)
            r2.LIZLLL = r1
        L45:
            return
        L46:
            X.13DQ r0 = X.C1679630toH.LIZIZ
            java.lang.Object r7 = r3.LJJIL(r0)
            X.0toG r7 = (X.C1679620toG) r7
            X.0toC r0 = X.EnumC1679580toC.TEXT_INPUTTING
            if (r12 == r0) goto L62
            X.13Ys r2 = r3.LJJJJZI()
            if (r2 == 0) goto L61
            kotlin.jvm.internal.AwS124S0201000_25 r1 = new kotlin.jvm.internal.AwS124S0201000_25
            r0 = 62
            r1.<init>(r12, r10, r15, r0)
            r2.LIZLLL = r1
        L61:
            return
        L62:
            X.13DR r0 = X.C20055113dV.LJIIIIZZ
            java.lang.Object r9 = r3.LJJIL(r0)
            X.0tzQ r9 = (X.InterfaceC1686540tzQ) r9
            X.13DR r0 = X.C20055113dV.LJIILL
            java.lang.Object r8 = r3.LJJIL(r0)
            X.0tnz r8 = (X.InterfaceC1679450tnz) r8
            kotlin.Unit r2 = kotlin.Unit.LIZ
            r0 = -1224400529(0xffffffffb705216f, float:-7.935202E-6)
            r3.LJJIIJZLJL(r0)
            boolean r4 = r3.LJJIIJ(r7)
            boolean r0 = r3.LJJIIJ(r8)
            r4 = r4 | r0
            boolean r0 = r3.LJII(r9)
            r4 = r4 | r0
            r0 = r6 & 112(0x70, float:1.57E-43)
            r1 = 0
            if (r0 != r5) goto Lb0
            r0 = 1
        L8e:
            r0 = r0 | r4
            java.lang.Object r6 = r3.LJJ()
            if (r0 != 0) goto L9e
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto La7
        L9e:
            X.0to3 r6 = new X.0to3
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            r3.LJJIJIIJI(r6)
        La7:
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r3.LJJJJL(r1)
            X.C1680540tpk.LJFF(r2, r6, r3)
            goto L36
        Lb0:
            r0 = 0
            goto L8e
        Lb2:
            r0 = 16
            goto L26
        Lb6:
            r6 = 2
            goto L16
        Lb9:
            r6 = r15
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1679460to0.LIZ(X.0toC, kotlin.jvm.functions.Function1, X.0tpg, int):void");
    }

    public static final void LIZIZ(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(167842178);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
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
                interfaceC1685750ty9 = InterfaceC1685750ty9.LIZ;
            }
            C1665790tRx.LIZ(c.LJI(interfaceC1685750ty9, ((InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(C20055113dV.LJII)).LJJI(((C1679620toG) c13zcLJIIJ.LJJIL(C1679630toH.LIZIZ)).LIZ.getValue().intValue())), c13zcLJIIJ);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS49S0102000_25(i, i2, interfaceC1685750ty9, 4);
        }
    }

    public static final void LIZJ(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(338903447);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
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
                interfaceC1685750ty9 = InterfaceC1685750ty9.LIZ;
            }
            k.LIZ(C1675980tiO.LIZIZ(interfaceC1685750ty9, C1670400tZO.LIZIZ(c13zcLJIIJ).H3(), C1669050tXD.LIZIZ(24)), c13zcLJIIJ, 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS49S0102000_25(i, i2, interfaceC1685750ty9, 5);
        }
    }

    public static final void LJII(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1023601995);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
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
                interfaceC1685750ty9 = InterfaceC1685750ty9.LIZ;
            }
            C1665790tRx.LIZ(C1675980tiO.LIZ(interfaceC1685750ty9, C1668200tVq.LJIIIIZZ(new Pair[]{new Pair(Float.valueOf(0.0f), new C1685910tyP(C1685850tyJ.LIZIZ(0))), new Pair(Float.valueOf(0.3f), new C1685910tyP(C1685850tyJ.LIZIZ(1291845632))), new Pair(Float.valueOf(1.0f), new C1685910tyP(C1685850tyJ.LIZLLL(2566914048L)))}), null, 6), c13zcLJIIJ);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS49S0102000_25(i, i2, interfaceC1685750ty9, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIJ(int r24, int r25, X.InterfaceC1680500tpg r26, X.InterfaceC1685750ty9 r27, kotlin.jvm.functions.Function1 r28, kotlin.jvm.functions.Function1 r29) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1679460to0.LJIIJ(int, int, X.0tpg, X.0ty9, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJFF(kotlin.jvm.functions.Function1<? super X.EnumC1679580toC, kotlin.Unit> r23, kotlin.jvm.functions.Function1<? super X.EnumC1679580toC, kotlin.Unit> r24, kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> r25, X.InterfaceC1685750ty9 r26, X.InterfaceC1680500tpg r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1679460to0.LJFF(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, X.0ty9, X.0tpg, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJI(java.lang.String r23, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> r24, kotlin.jvm.functions.Function0<kotlin.Unit> r25, X.InterfaceC1685750ty9 r26, X.InterfaceC1680500tpg r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1679460to0.LJI(java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, X.0ty9, X.0tpg, int, int):void");
    }

    public static final void LJIIJJI(EnumC1679580toC enumC1679580toC, C05P1<Float> c05p1, C1676910tjt<Boolean> c1676910tjt, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1566354154);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIJI(enumC1679580toC.ordinal())) {
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
            if (c13zcLJIIJ.LJJIIJ(c05p1)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1676910tjt)) {
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
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = AFwS266S0000000_25.get$arr$(372);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            Function1 function1 = (Function1) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            C1676540tjI c1676540tjILJ = C1676510tjF.LJ(0.0f, C1671550tbF.LIZJ(0.0f, 400.0f, null, 5));
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = AFwS266S0000000_25.get$arr$(373);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1676630tjR.LIZJ(c1676910tjt, function1, interfaceC1685750ty92, c1676540tjILJ.LIZIZ(C1676510tjF.LJIILL(C1671550tbF.LIZJ(0.0f, 400.0f, new C1676820tjk(C1675670tht.LIZ()), 1), (Function1) objLJJ2)), null, C13Z4.LIZJ(880630465, new AwS487S0200000_25(enumC1679580toC, (EnumC1679580toC) c05p1, (C05P1<Float>) 8), c13zcLJIIJ), c13zcLJIIJ, ((i3 >> 6) & 14) | 199728 | ((i3 >> 3) & 896), 8);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS6S0402000_25(enumC1679580toC, (EnumC1679580toC) c05p1, (C05P1<Float>) c1676910tjt, (C1676910tjt<Boolean>) interfaceC1685750ty92, (InterfaceC1685750ty9) i, i2, 4);
        }
    }

    public static final void LJIIIZ(C05P1<String> c05p1, C05P1<Boolean> c05p12, String str, C1676910tjt<Boolean> c1676910tjt, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        String strLJII;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1663994485);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c05p1)) {
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
            if (c13zcLJIIJ.LJJIIJ(c05p12)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        C1676910tjt<Boolean> c1676910tjt2 = c1676910tjt;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1676910tjt2)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((i3 & 9363) == 9362 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i9 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIJ = C1682520tsw.LJIIJ(interfaceC1685750ty92, 60, 0.0f, 2);
            InterfaceC1668050tVb.LIZ.getClass();
            C1296870jqv c1296870jqv = C1668040tVa.LJFF;
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(c1296870jqv, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIJ);
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
                C1672220tcK c1672220tcK = C1672220tcK.LIZ;
                if (str == null) {
                    strLJII = C1857750yRZ.LJII(2131822568);
                } else {
                    strLJII = str;
                }
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ = c13zcLJIIJ.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
                if (objLJJ == c1680520tpi) {
                    objLJJ = AFwS266S0000000_25.get$arr$(376);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ);
                }
                Function1 function1 = (Function1) objLJJ;
                c13zcLJIIJ.LJJJJL(false);
                InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = c1672220tcK.LIZIZ(InterfaceC1685750ty9.LIZ, c1296870jqv);
                C1676540tjI c1676540tjILJ = C1676510tjF.LJ(0.0f, C1671550tbF.LIZJ(0.0f, 400.0f, null, 5));
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ2 = c13zcLJIIJ.LJJ();
                if (objLJJ2 == c1680520tpi) {
                    objLJJ2 = AFwS266S0000000_25.get$arr$(371);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                }
                c13zcLJIIJ.LJJJJL(false);
                c1676910tjt2 = c1676910tjt2;
                C1676630tjR.LIZJ(c1676910tjt2, function1, interfaceC1685750ty9LIZIZ, c1676540tjILJ.LIZIZ(C1676510tjF.LJIILL(C1671550tbF.LIZJ(0.0f, 400.0f, new C1676820tjk(C1675670tht.LIZ()), 1), (Function1) objLJJ2)), null, C13Z4.LIZJ(469302136, new AwS165S1200000_25(c05p1, c05p12, strLJII, 0), c13zcLJIIJ), c13zcLJIIJ, ((i3 >> 9) & 14) | 199728, 8);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS0S1402000_25((C05P1) c05p1, (C05P1<String>) c05p12, (C05P1<Boolean>) str, (String) c1676910tjt2, (C1676910tjt<Boolean>) interfaceC1685750ty92, (InterfaceC1685750ty9) i, i2, 1);
        }
    }

    public static final void LJ(EnumC1679580toC enumC1679580toC, String str, C1686970u07 c1686970u07, Function1<? super C1686970u07, Unit> function1, Function1<? super EnumC1679580toC, Unit> function12, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i10;
        boolean z5;
        boolean z6;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(15828802);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIJI(enumC1679580toC.ordinal())) {
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
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1686970u07)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function12)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        int i11 = i2 & 32;
        if (i11 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        if ((74899 & i3) == 74898 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i11 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = new C20060213eK();
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C20060213eK c20060213eK = (C20060213eK) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            if ((i3 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            if ((i3 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z7 = z | z2;
            if ((i3 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z8 = z7 | z3;
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (z8 || objLJJ2 == c1680520tpi) {
                objLJJ2 = new C1691460u7M(enumC1679580toC, function1, c1686970u07, c20060213eK, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(enumC1679580toC, (Function2) objLJJ2, c13zcLJIIJ);
            boolean zBooleanValue = ((Boolean) ((C1679620toG) c13zcLJIIJ.LJJIL(C1679630toH.LIZIZ)).LJ.getValue()).booleanValue();
            EnumC1679580toC enumC1679580toC2 = EnumC1679580toC.TEXT_INPUTTING;
            if (enumC1679580toC == enumC1679580toC2 && zBooleanValue) {
                z4 = false;
            } else {
                z4 = true;
            }
            C1693430uAX c1693430uAX = C1670400tZO.LJ(c13zcLJIIJ).LJJIIJZLJL;
            C1691540u7U c1691540u7ULIZ = C1672580tcu.LIZ(0, 0, 1, c13zcLJIIJ);
            InterfaceC1690500u5o interfaceC1690500u5o = (InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(C20055113dV.LJII);
            InterfaceC1684280tvm interfaceC1684280tvm = (InterfaceC1684280tvm) c13zcLJIIJ.LJJIL(C20055113dV.LJIJI);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(interfaceC1690500u5o) | c13zcLJIIJ.LJJIIJ(interfaceC1684280tvm);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ || objLJJ3 == c1680520tpi) {
                objLJJ3 = Integer.valueOf(((int) (interfaceC1684280tvm.LIZIZ() >> 32)) - interfaceC1690500u5o.LJLLJ(84));
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            int iIntValue = ((Number) objLJJ3).intValue();
            c13zcLJIIJ.LJJJJL(false);
            String str2 = c1686970u07.LIZ.LLILLJJLI;
            c13zcLJIIJ.LJJIIJZLJL(-1746271574);
            boolean zLJJIIJ2 = c13zcLJIIJ.LJJIIJ(str2) | c13zcLJIIJ.LJIJI(iIntValue) | c13zcLJIIJ.LJIIZILJ(z4);
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ2 || objLJJ4 == c1680520tpi) {
                if (z4 && c1686970u07.LIZ.LLILLJJLI.length() != 0) {
                    C1692150u8T c1692150u8TLIZIZ = C1691540u7U.LIZIZ(c1691540u7ULIZ, new C1692220u8a(c1686970u07.LIZ.LLILLJJLI), c1693430uAX, 0, false, 0, null, C1682390tsj.LIZ(0, iIntValue, 0, Integer.MAX_VALUE), null, null, null, false, 1980);
                    if (c1692150u8TLIZIZ.LIZIZ.LJFF <= 1) {
                        InterfaceC1679160tnW.LIZ.getClass();
                        objLJJ4 = C1679170tnX.LIZIZ;
                    } else {
                        objLJJ4 = new C1684380tvw(c1692150u8TLIZIZ.LJI(0, false));
                    }
                } else {
                    InterfaceC1679160tnW.LIZ.getClass();
                    objLJJ4 = C1679170tnX.LIZIZ;
                }
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            InterfaceC1679160tnW interfaceC1679160tnW = (InterfaceC1679160tnW) objLJJ4;
            c13zcLJIIJ.LJJJJL(false);
            if (enumC1679580toC == enumC1679580toC2 && zBooleanValue) {
                i10 = 6;
            } else {
                i10 = 1;
            }
            if (enumC1679580toC == enumC1679580toC2) {
                z5 = true;
            } else {
                z5 = false;
            }
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ2 = C1682280tsY.LIZ(interfaceC1685750ty9LIZ, c20060213eK);
            c13zcLJIIJ.LJJIIJZLJL(-1968323180);
            if (enumC1679580toC == EnumC1679580toC.TEXT) {
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                if ((57344 & i3) == 16384) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                Object objLJJ5 = c13zcLJIIJ.LJJ();
                if (z6 || objLJJ5 == c1680520tpi) {
                    objLJJ5 = new AwS569S0100000_25(function12, (Function1<? super AbstractC1146640fwc, Unit>) 777);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ5);
                }
                c13zcLJIIJ.LJJJJL(false);
                interfaceC1685750ty9LIZ = C634380OuS.LIZ(interfaceC1685750ty9LIZ, null, null, true, null, null, (Function0) objLJJ5);
            }
            c13zcLJIIJ.LJJJJL(false);
            int i12 = i3 >> 6;
            C1679090tnP.LIZ(c1686970u07, function1, interfaceC1685750ty9LIZ2.LIZ(interfaceC1685750ty9LIZ).LIZ(interfaceC1685750ty92), C1670400tZO.LIZIZ(c13zcLJIIJ).p3(), z5, false, c1693430uAX, 5, null, null, z4, i10, interfaceC1679160tnW, null, new C1680950tqP(C1670400tZO.LIZIZ(c13zcLJIIJ).V2()), C13Z4.LIZJ(-1846550410, new C1674770tgR(c1686970u07, str), c13zcLJIIJ), c13zcLJIIJ, (i12 & 14) | (i12 & 112), 196608, 8992);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS0S1502000_25(enumC1679580toC, (EnumC1679580toC) str, (String) c1686970u07, (C1686970u07) function1, (Function1<? super C1686970u07, Unit>) function12, (Function1<? super EnumC1679580toC, Unit>) interfaceC1685750ty92, (InterfaceC1685750ty9) i, i2, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [X.0tzV, java.lang.Object] */
    public static final void LIZLLL(C1679570toB c1679570toB, C1676910tjt<Boolean> c1676910tjt, C05P1<String> c05p1, C05P1<Boolean> c05p12, String str, Function1<? super EnumC1679580toC, Unit> function1, Function1<? super EnumC1679580toC, Unit> function12, Function1<? super View, Unit> function13, Function1<? super String, Boolean> function14, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z;
        InterfaceC2267361Dos interfaceC2267361Dos;
        boolean z2;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(956435935);
        C1679570toB c1679570toB2 = c1679570toB;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1679570toB2)) {
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
            if (c13zcLJIIJ.LJJIIJ(c1676910tjt)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c05p1)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c05p12)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJII(function12)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        Function1<? super View, Unit> function15 = function13;
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((12582912 & i) == 0) {
            if (c13zcLJIIJ.LJII(function15)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i3 |= i11;
        }
        Function1<? super String, Boolean> function16 = function14;
        if ((i2 & 256) != 0) {
            i3 |= 100663296;
        } else if ((100663296 & i) == 0) {
            if (c13zcLJIIJ.LJII(function16)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i3 |= i12;
        }
        int i14 = i2 & 512;
        if (i14 != 0) {
            i3 |= 805306368;
        } else if ((805306368 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i13 = 536870912;
            } else {
                i13 = 268435456;
            }
            i3 |= i13;
        }
        if ((i3 & 306783379) == 306783378 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i14 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            Object obj = C1680510tph.LIZIZ;
            if (objLJJ == obj) {
                objLJJ = C20028913Yh.LJI(new C1686970u07((String) null, 0L, 7));
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            EnumC1679580toC enumC1679580toC = c1679570toB2.LLILLJJLI;
            if (((C1686970u07) c05p0.getValue()).LIZ.LLILLJJLI.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            final AwS11S0120000_25 awS11S0120000_25 = new AwS11S0120000_25(enumC1679580toC, z, ((Boolean) ((C1679620toG) c13zcLJIIJ.LJJIL(C1679630toH.LIZIZ)).LJ.getValue()).booleanValue(), 2);
            final ?? r9 = new InterfaceC1686630tzZ(awS11S0120000_25) { // from class: X.0tzV
                public final Function1<C1686610tzX, Unit> LL;
                public final InterfaceC1686690tzf LLILLJJLI = null;

                @Override // X.InterfaceC1686690tzf
                public final boolean LIZJ(List<? extends InterfaceC1673370teB> list) {
                    return true;
                }

                @Override // X.InterfaceC1686630tzZ
                public final InterfaceC1686690tzf LJI() {
                    return this.LLILLJJLI;
                }

                {
                    this.LL = awS11S0120000_25;
                }

                @Override // X.InterfaceC1686630tzZ
                public final void LIZIZ(C2267041DoM c2267041DoM) {
                    C1686610tzX c1686610tzX = new C1686610tzX();
                    this.LL.invoke(c1686610tzX);
                    Iterator it2 = ((ArrayList) c1686610tzX.LIZ).iterator();
                    while (it2.hasNext()) {
                        ((Function1) it2.next()).invoke(c2267041DoM);
                    }
                }

                @Override // X.InterfaceC1686630tzZ, X.InterfaceC1686690tzf
                public final void LIZ(C2267041DoM c2267041DoM, List<? extends InterfaceC1673370teB> list) {
                    C1686620tzY.LIZ(this, c2267041DoM, list);
                }
            };
            InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(c.LJIJI(interfaceC1685750ty92, null, 3), 1.0f);
            function15 = function15;
            c1679570toB2 = c1679570toB2;
            function16 = function16;
            C19719212De c19719212DeLIZJ = C13Z4.LIZJ(1722296537, new C1679470to1(c05p1, c05p12, str, c1676910tjt, function1, function12, function15, c1679570toB2, function16, c05p0), c13zcLJIIJ);
            c13zcLJIIJ.LJJIJIIJIL(-270262697);
            C1671550tbF.LIZLLL(0, 0, null, 7);
            c13zcLJIIJ.LJJIJIIJIL(-270260906);
            c13zcLJIIJ.LJJIJIIJIL(-3687241);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == obj) {
                objLJJ2 = C20028913Yh.LJI(0L);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C05P0<Long> c05p02 = (C05P0) objLJJ2;
            c13zcLJIIJ.LJJIJIIJIL(-3687241);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (objLJJ3 == obj) {
                objLJJ3 = new C2267001DoI();
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            final C2267001DoI c2267001DoI = (C2267001DoI) objLJJ3;
            c13zcLJIIJ.LJJIJIIJIL(-441904452);
            Long value = c05p02.getValue();
            c13zcLJIIJ.LJJIJIIJIL(-3686095);
            boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(257) | c13zcLJIIJ.LJJIIJ(value) | c13zcLJIIJ.LJJIIJ(r9);
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ || objLJJ4 == obj) {
                c2267001DoI.getClass();
                if (r9 instanceof C1686600tzW) {
                    try {
                        c2267001DoI.LJIILIIL.clear();
                        throw null;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                objLJJ4 = new InterfaceC20053113dB() { // from class: X.0ttX
                    public final /* synthetic */ int LIZJ = 257;

                    @Override // X.InterfaceC20053113dB
                    public final int LIZ(j1 j1Var, List list, int i15) {
                        return C1688390u2P.LIZJ(this, j1Var, list, i15);
                    }

                    @Override // X.InterfaceC20053113dB
                    public final int LIZIZ(j1 j1Var, List list, int i15) {
                        return C1688390u2P.LIZLLL(this, j1Var, list, i15);
                    }

                    @Override // X.InterfaceC20053113dB
                    public final int LIZJ(j1 j1Var, List list, int i15) {
                        return C1688390u2P.LIZ(this, j1Var, list, i15);
                    }

                    @Override // X.InterfaceC20053113dB
                    public final int LIZLLL(j1 j1Var, List list, int i15) {
                        return C1688390u2P.LIZIZ(this, j1Var, list, i15);
                    }

                    @Override // X.InterfaceC20053113dB
                    public final InterfaceC1690350u5Z LJFF(InterfaceC1689940u4u interfaceC1689940u4u, List<? extends InterfaceC1673370teB> list, long j) {
                        long jLJIIIZ = c2267001DoI.LJIIIZ(j, interfaceC1689940u4u.getLayoutDirection(), r9, list, this.LIZJ, interfaceC1689940u4u);
                        return interfaceC1689940u4u.LJLJJL((int) (jLJIIIZ >> 32), C1682900ttY.LIZJ(jLJIIIZ), C2097608Jq.LJ(), new AwS391S0200000_25(c2267001DoI, (C2267001DoI) list, (List<? extends InterfaceC1673370teB>) 334));
                    }
                };
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC20053113dB interfaceC20053113dB = (InterfaceC20053113dB) objLJJ4;
            c13zcLJIIJ.LJJJJL(false);
            if (r9 instanceof AbstractC1679500to4) {
                ((AbstractC1679500to4) r9).LL = c05p02;
            }
            if (r9 instanceof InterfaceC2267361Dos) {
                interfaceC2267361Dos = (InterfaceC2267361Dos) r9;
            } else {
                interfaceC2267361Dos = null;
            }
            c2267001DoI.LIZ = interfaceC2267361Dos;
            if (interfaceC2267361Dos != null) {
                interfaceC2267361Dos.LJFF();
            }
            float f = c2267001DoI.LJIIJ;
            if (!Float.isNaN(f)) {
                c13zcLJIIJ.LJJIJIIJIL(-270260292);
                float f2 = c2267001DoI.LJIIJ;
                InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1665910tS9.LIZ(interfaceC1685750ty9LJ, f2, f2);
                c13zcLJIIJ.LJJIJIIJIL(-1990474327);
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                InterfaceC1668050tVb.LIZ.getClass();
                C1674920tgg c1674920tggLJ = k.LJ(C1668040tVa.LIZIZ, false, c13zcLJIIJ, 0);
                c13zcLJIIJ.LJJIJIIJIL(1376089335);
                Object objLJJIL = c13zcLJIIJ.LJJIL(C20055113dV.LJII);
                Object objLJJIL2 = c13zcLJIIJ.LJJIL(C20055113dV.LJIILIIL);
                g.LJLIIIL.getClass();
                AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
                C19719212De c19719212De = new C19719212De(-55743822, new AwS674S0100000_25(c1685760tyA, 44), true);
                if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                    c13zcLJIIJ.LJJIII();
                    if (c13zcLJIIJ.LJJJI) {
                        c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                    } else {
                        c13zcLJIIJ.LJIILJJIL();
                    }
                    c13zcLJIIJ.LJJI = false;
                    C1665930tSB.LIZ(c13zcLJIIJ, c1674920tggLJ, g.a.LJI);
                    C1665930tSB.LIZ(c13zcLJIIJ, objLJJIL, g.a.LJ);
                    C1665930tSB.LIZ(c13zcLJIIJ, objLJJIL2, g.a.LJII);
                    c13zcLJIIJ.LJJJJJL();
                    z2 = false;
                    c19719212De.invoke(new C1156530gCZ(c13zcLJIIJ), c13zcLJIIJ, 0);
                    c13zcLJIIJ.LJJIJIIJIL(2058660585);
                    c13zcLJIIJ.LJJIJIIJIL(-1253629305);
                    InterfaceC1665870tS5 interfaceC1665870tS5 = C1672220tcK.LIZ;
                    C1672420tce.LIZ(C1689740u4a.LIZIZ(interfaceC1685750ty9LIZ, false, new AwS604S0100000_25(c2267001DoI, 533)), C13Z4.LIZIZ(c13zcLJIIJ, -819900598, new AwS124S0201000_25(c2267001DoI, c19719212DeLIZJ, 1575936, 65)), interfaceC20053113dB, c13zcLJIIJ, 48, 0);
                    c2267001DoI.LIZLLL(interfaceC1665870tS5, f, c13zcLJIIJ, 518);
                    c13zcLJIIJ.LJJJJL(false);
                    c13zcLJIIJ.LJJJJL(false);
                    c13zcLJIIJ.LJJJJL(true);
                    c13zcLJIIJ.LJJJJL(false);
                    c13zcLJIIJ.LJJJJL(false);
                    c13zcLJIIJ.LJJJJL(false);
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            } else {
                c13zcLJIIJ.LJJIJIIJIL(-270259702);
                z2 = false;
                C1672420tce.LIZ(C1689740u4a.LIZIZ(interfaceC1685750ty9LJ, false, new AwS604S0100000_25(c2267001DoI, 534)), C13Z4.LIZIZ(c13zcLJIIJ, -819901122, new AwS124S0201000_25(c2267001DoI, c19719212DeLIZJ, 1575936, 64)), interfaceC20053113dB, c13zcLJIIJ, 48, 0);
                c13zcLJIIJ.LJJJJL(false);
            }
            c13zcLJIIJ.LJJJJL(z2);
            c13zcLJIIJ.LJJJJL(z2);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1679480to2(c1679570toB2, c1676910tjt, c05p1, c05p12, str, function1, function12, function15, function16, interfaceC1685750ty92, i, i2);
        }
    }

    public static final void LJIIIIZZ(C1679570toB c1679570toB, C05P1<Float> c05p1, C05P1<String> c05p12, boolean z, C05P1<Boolean> c05p13, Function1<? super EnumC1679580toC, Unit> function1, Function1<? super EnumC1679580toC, Unit> function12, Function1<? super View, Unit> function13, String str, Function1<? super String, Boolean> function14, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Function1<? super View, Unit> function15 = function13;
        Function1<? super EnumC1679580toC, Unit> function16 = function12;
        String str2 = str;
        C05P1<Boolean> c05p14 = c05p13;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1421907397);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1679570toB)) {
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
            if (c13zcLJIIJ.LJJIIJ(c05p1)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c05p12)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        int i14 = i2 & 16;
        if (i14 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c05p14)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        int i15 = i2 & 64;
        if (i15 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJII(function16)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        int i16 = i2 & 128;
        if (i16 != 0) {
            i3 |= 12582912;
        } else if ((12582912 & i) == 0) {
            if (c13zcLJIIJ.LJII(function15)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i3 |= i11;
        }
        int i17 = i2 & 256;
        if (i17 != 0) {
            i3 |= 100663296;
        } else if ((100663296 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str2)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i3 |= i12;
        }
        if ((i2 & 512) != 0) {
            i3 |= 805306368;
        } else if ((805306368 & i) == 0) {
            if (c13zcLJIIJ.LJII(function14)) {
                i13 = 536870912;
            } else {
                i13 = 268435456;
            }
            i3 |= i13;
        }
        if ((i3 & 306783379) == 306783378 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i14 != 0) {
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ = c13zcLJIIJ.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                if (objLJJ == C1680510tph.LIZIZ) {
                    objLJJ = C20028913Yh.LJI(Boolean.FALSE);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ);
                }
                c05p14 = (C05P1) objLJJ;
                c13zcLJIIJ.LJJJJL(false);
            }
            if (i15 != 0) {
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ2 = c13zcLJIIJ.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                if (objLJJ2 == C1680510tph.LIZIZ) {
                    objLJJ2 = AFwS266S0000000_25.get$arr$(374);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                }
                function16 = (Function1) objLJJ2;
                c13zcLJIIJ.LJJJJL(false);
            }
            if (i16 != 0) {
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ3 = c13zcLJIIJ.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                if (objLJJ3 == C1680510tph.LIZIZ) {
                    objLJJ3 = AFwS266S0000000_25.get$arr$(375);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ3);
                }
                function15 = (Function1) objLJJ3;
                c13zcLJIIJ.LJJJJL(false);
            }
            if (i17 != 0) {
                str2 = null;
            }
            if (c1679570toB.LLILLJJLI != EnumC1679580toC.LOADING && !z) {
                c13zcLJIIJ.LJJIIJZLJL(1475946731);
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ4 = c13zcLJIIJ.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
                if (objLJJ4 == c1680520tpi) {
                    objLJJ4 = C20028913Yh.LJI(Boolean.FALSE);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ4);
                }
                C05P0 c05p0 = (C05P0) objLJJ4;
                c13zcLJIIJ.LJJJJL(false);
                Unit unit = Unit.LIZ;
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                Object objLJJ5 = c13zcLJIIJ.LJJ();
                if (objLJJ5 == c1680520tpi) {
                    objLJJ5 = new C05AJ(c05p0, null);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ5);
                }
                c13zcLJIIJ.LJJJJL(false);
                C1680540tpk.LJFF(unit, (Function2) objLJJ5, c13zcLJIIJ);
                C1676910tjt c1676910tjtLJ = C1676860tjo.LJ(Boolean.valueOf(((Boolean) c05p0.getValue()).booleanValue()), "TakoAIVideoInput.init", c13zcLJIIJ, 48, 0);
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJIIJZLJL(61835329);
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ6 = c13zcLJIIJ.LJJ();
                if (objLJJ6 == c1680520tpi) {
                    objLJJ6 = C20028913Yh.LJI(Float.valueOf(0.0f));
                    c13zcLJIIJ.LJJIJIIJI(objLJJ6);
                }
                C05P0 c05p02 = (C05P0) objLJJ6;
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                Object objLJJ7 = c13zcLJIIJ.LJJ();
                if (objLJJ7 == c1680520tpi) {
                    objLJJ7 = new C05AI(c05p02, null);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ7);
                }
                c13zcLJIIJ.LJJJJL(false);
                C1680540tpk.LJFF(unit, (Function2) objLJJ7, c13zcLJIIJ);
                C05P1 c05p1LIZIZ = C1675660ths.LIZIZ(((Number) c05p02.getValue()).floatValue(), C1671550tbF.LIZLLL(500, 0, null, 6), 0.0f, "TakoAIVideoInput.fadeIn", null, c13zcLJIIJ, 3120, 20);
                c13zcLJIIJ.LJJJJL(false);
                int i18 = i3 >> 12;
                LIZ(c1679570toB.LLILLJJLI, function1, c13zcLJIIJ, i18 & 112);
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1665900tS8.LIZ(c1685760tyA, ((Number) c05p1LIZIZ.getValue()).floatValue());
                if (c1679570toB.LLILLJJLI == EnumC1679580toC.TEXT_INPUTTING) {
                    interfaceC1685750ty9LIZ = C634380OuS.LIZ(interfaceC1685750ty9LIZ, null, null, true, null, null, new AwS569S0100000_25(function1, (Function1<? super AbstractC1146640fwc, Unit>) 778));
                }
                InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = c.LIZIZ(c.LJ(interfaceC1685750ty9LIZ, 1.0f), 1.0f);
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
                    C1672220tcK c1672220tcK = C1672220tcK.LIZ;
                    EnumC1679580toC enumC1679580toC = c1679570toB.LLILLJJLI;
                    C1296870jqv c1296870jqv = C1668040tVa.LJIIIIZZ;
                    LJIIJJI(enumC1679580toC, c05p1, c1676910tjtLJ, c1672220tcK.LIZIZ(c1685760tyA, c1296870jqv), c13zcLJIIJ, i3 & 112, 0);
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ2 = c1672220tcK.LIZIZ(c1685760tyA, c1296870jqv);
                    int i19 = i3 >> 3;
                    c13zcLJIIJ = c13zcLJIIJ;
                    LIZLLL(c1679570toB, c1676910tjtLJ, c05p12, c05p14, str2, function1, function16, function15, function14, interfaceC1685750ty9LIZIZ2, c13zcLJIIJ, (i3 & 29360128) | (i3 & 14) | (i3 & 896) | (i19 & 7168) | (57344 & i18) | (458752 & i3) | (3670016 & i3) | (234881024 & i19), 0);
                    c13zcLJIIJ.LJJJJL(true);
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            } else {
                C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
                if (c20030013YsLJJJJZI != null) {
                    c20030013YsLJJJJZI.LIZLLL = new AwS0S1812000_25(c1679570toB, c05p1, c05p12, z, c05p14, function1, function16, function15, str2, function14, i, i2, 0);
                    return;
                }
                return;
            }
        }
        C20030013Ys c20030013YsLJJJJZI2 = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI2 != null) {
            c20030013YsLJJJJZI2.LIZLLL = new AwS0S1812000_25(c1679570toB, c05p1, c05p12, z, c05p14, function1, function16, function15, str2, function14, i, i2, 1);
        }
    }
}
