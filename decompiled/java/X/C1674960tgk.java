package X;

import Y.AObjectS3S1102000_25;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tgk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1674960tgk {
    public static final float LJFF;
    public static final float LJI;
    public static final float LJIIIZ;
    public static final float LJIIJ;
    public static final float LIZ = 12;
    public static final float LIZIZ = 8;
    public static final float LIZJ = 112;
    public static final float LIZLLL = 85;
    public static final float LJ = 26;
    public static final float LJII = 28;
    public static final float LJIIIIZZ = (float) 20.5d;
    public static final long LJIIJJI = C1685850tyJ.LIZLLL(4278211049L);

    static {
        float f = 16;
        LJFF = f;
        float f2 = 20;
        LJI = f2;
        LJIIIZ = f2 + f + 4;
        LJIIJ = f;
    }

    public static final void LIZ(int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, InterfaceC1685750ty9 interfaceC1685750ty9, String str) {
        int i3;
        int i4;
        int i5;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-945515578);
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
            InterfaceC1685750ty9 interfaceC1685750ty9LJII = C1682520tsw.LJII(C1675980tiO.LIZIZ(C1667200tUE.LIZ(interfaceC1685750ty92, C1669050tXD.LIZ(50)), C1670400tZO.LIZIZ(c13zcLJIIJ).U2(), C1669430tXp.LIZ), C1682520tsw.LIZIZ(LJIIIIZZ, 0.0f, 2));
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LJFF, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJII);
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
                C1685190txF.LIZ(str, null, C1670400tZO.LIZIZ(c13zcLJIIJ).K3(), C1670400tZO.LJ(c13zcLJIIJ).LJIILLIIL, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, i3 & 14, 0, 2034);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AObjectS3S1102000_25(i, i2, interfaceC1685750ty92, str, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(final int r22, final int r23, X.InterfaceC1680500tpg r24, X.InterfaceC1685750ty9 r25, final kotlin.jvm.functions.Function2 r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1674960tgk.LIZIZ(int, int, X.0tpg, X.0ty9, kotlin.jvm.functions.Function2, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(final X.C1674970tgl r40, final boolean r41, final kotlin.jvm.functions.Function0<kotlin.Unit> r42, X.InterfaceC1685750ty9 r43, X.InterfaceC1680500tpg r44, final int r45, final int r46) {
        /*
            Method dump skipped, instruction units count: 1178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1674960tgk.LIZJ(X.0tgl, boolean, kotlin.jvm.functions.Function0, X.0ty9, X.0tpg, int, int):void");
    }
}
