package X;

import androidx.compose.foundation.layout.IntrinsicWidthElement;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS1S0502000_25;
import kotlin.jvm.internal.AwS302S0300000_25;
import kotlin.jvm.internal.AwS6S0302000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.g;

/* JADX INFO: renamed from: X.0ty2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1685680ty2 {
    public static final C1686720tzi LIZ = new C1686720tzi(true, false, false, 14);
    public static final C1685710ty5 LIZIZ;

    static {
        long j = C1685910tyP.LJ;
        long j2 = C1685910tyP.LIZIZ;
        LIZIZ = new C1685710ty5(j, j2, j2, C1685910tyP.LIZJ(0.38f, j2), C1685910tyP.LIZJ(0.38f, j2));
    }

    public static final void LIZ(C1685710ty5 c1685710ty5, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1631620sYq<? super InterfaceC1686920u02, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-921259293);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1685710ty5)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1631620sYq)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i3 & 1, z)) {
            if (i7 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1689370u3z.LIZLLL(C1682520tsw.LJIIJ(C1675980tiO.LIZIZ(C1679640toI.LIZIZ(interfaceC1685750ty92, C1685700ty4.LIZLLL, C1669050tXD.LIZIZ(C1685700ty4.LJ), 0L, 0L, 28), c1685710ty5.LIZ, C1669430tXp.LIZ).LIZ(new IntrinsicWidthElement(EnumC995470c0n.Max, C1684360tvu.LIZ)), 0.0f, C1685700ty4.LJIIIIZZ, 1), C1689370u3z.LIZIZ(c13zcLJIIJ), false, 14);
            int i8 = (i3 << 3) & 7168;
            C1680030tov c1680030tov = C1679930tol.LIZJ;
            InterfaceC1668050tVb.LIZ.getClass();
            int i9 = i8 >> 3;
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, C1668040tVa.LJIILIIL, c13zcLJIIJ, (i9 & 112) | (i9 & 14));
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZLLL);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, g.a.LIZLLL);
                interfaceC1631620sYq.invoke(C1687990u1l.LIZ, c13zcLJIIJ, Integer.valueOf(((i8 >> 6) & 112) | 6));
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        } else {
            c13zcLJIIJ.LIZJ();
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS6S0302000_25(c1685710ty5, (C1685710ty5) interfaceC1685750ty92, (InterfaceC1685750ty9) interfaceC1631620sYq, (InterfaceC1631620sYq<? super InterfaceC1686920u02, ? super InterfaceC1680500tpg, ? super Integer, Unit>) i, i2, 10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(X.InterfaceC1686820tzs r28, kotlin.jvm.functions.Function0<kotlin.Unit> r29, X.InterfaceC1685750ty9 r30, kotlin.jvm.functions.Function1<? super X.C1685690ty3, kotlin.Unit> r31, X.InterfaceC1680500tpg r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1685680ty2.LIZLLL(X.0tzs, kotlin.jvm.functions.Function0, X.0ty9, kotlin.jvm.functions.Function1, X.0tpg, int, int):void");
    }

    public static final void LIZJ(InterfaceC1686820tzs interfaceC1686820tzs, Function0<Unit> function0, InterfaceC1685750ty9 interfaceC1685750ty9, C1685710ty5 c1685710ty5, Function1<? super C1685690ty3, Unit> function1, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1447189339);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1686820tzs)) {
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
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1685710ty5)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i3 & 1, z)) {
            if (i9 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            C1680580tpo.LIZ(interfaceC1686820tzs, function0, LIZ, C13Z4.LIZJ(795909757, new AwS302S0300000_25(c1685710ty5, (C1685710ty5) interfaceC1685750ty92, (InterfaceC1685750ty9) function1, (Function1<? super C1685690ty3, Unit>) 10), c13zcLJIIJ), c13zcLJIIJ, (i3 & 14) | 3456 | (i3 & 112), 0);
        } else {
            c13zcLJIIJ.LIZJ();
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS1S0502000_25(interfaceC1686820tzs, (InterfaceC1686820tzs) function0, (Function0<Unit>) interfaceC1685750ty92, (InterfaceC1685750ty9) c1685710ty5, (C1685710ty5) function1, (Function1<? super C1685690ty3, Unit>) i, i2, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(java.lang.String r35, boolean r36, X.C1685710ty5 r37, X.InterfaceC1685750ty9 r38, X.InterfaceC1631620sYq<? super X.C1685910tyP, ? super X.InterfaceC1680500tpg, ? super java.lang.Integer, kotlin.Unit> r39, kotlin.jvm.functions.Function0<kotlin.Unit> r40, X.InterfaceC1680500tpg r41, int r42, int r43) {
        /*
            Method dump skipped, instruction units count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1685680ty2.LIZIZ(java.lang.String, boolean, X.0ty5, X.0ty9, X.0sYq, kotlin.jvm.functions.Function0, X.0tpg, int, int):void");
    }
}
