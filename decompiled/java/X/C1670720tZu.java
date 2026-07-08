package X;

import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS7S1102000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tZu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1670720tZu {
    public static final float LIZ = 12;
    public static final float LIZIZ = 100;

    public static final void LIZJ(int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, InterfaceC1685750ty9 interfaceC1685750ty9, String str) {
        int i3;
        int i4;
        int i5;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1388316447);
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
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIIZ = C1682520tsw.LJIIIZ(C1675980tiO.LIZIZ(interfaceC1685750ty92, C1685850tyJ.LIZLLL(4294916956L), C1669050tXD.LIZ(50)), 4, 1);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LJFF, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIIZ);
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
                C1685190txF.LIZ(str, null, C1685910tyP.LJ, C1693430uAX.LIZ(0, 0, 16777213, 0L, C1682430tsn.LJ(9), 0L, 0L, null, C1670400tZO.LJ(c13zcLJIIJ).LJJIFFI, null, null), 0L, 0, 2, false, 1, null, null, c13zcLJIIJ, (i3 & 14) | 102236544, 0, 1714);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS7S1102000_25(i, i2, interfaceC1685750ty92, str, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017d  */
    /* JADX WARN: Type inference failed for: r29v1, types: [X.0tnV] */
    /* JADX WARN: Type inference failed for: r32v1, types: [X.0tTq] */
    /* JADX WARN: Type inference failed for: r33v3, types: [X.0NVj, X.0OtR, X.0tWw, X.0teJ, X.0tnV, X.0tqx] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(java.util.List<? extends com.bytedance.android.live.base.model.user.User> r63, java.util.List<? extends com.bytedance.android.live.base.model.user.User> r64, java.lang.Long r65, boolean r66, kotlin.jvm.functions.Function1<? super java.util.List<? extends com.bytedance.android.live.base.model.user.User>, kotlin.Unit> r67, X.InterfaceC1680500tpg r68, int r69) {
        /*
            Method dump skipped, instruction units count: 1495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1670720tZu.LIZ(java.util.List, java.util.List, java.lang.Long, boolean, kotlin.jvm.functions.Function1, X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(long r46, java.lang.String r48, java.lang.String r49, boolean r50, boolean r51, boolean r52, float r53, kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> r54, X.InterfaceC1680500tpg r55, int r56) {
        /*
            Method dump skipped, instruction units count: 885
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1670720tZu.LIZIZ(long, java.lang.String, java.lang.String, boolean, boolean, boolean, float, kotlin.jvm.functions.Function1, X.0tpg, int):void");
    }
}
