package X;

import android.content.Context;
import androidx.compose.foundation.layout.c;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.feedcard.DescriptionDetail;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.g;

/* JADX INFO: renamed from: X.0tTx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1667030tTx {
    public static final float LIZJ(boolean z, InterfaceC1680500tpg interfaceC1680500tpg) {
        float f;
        interfaceC1680500tpg.LJJIIJZLJL(2093686682);
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        float fFloatValue = ((Number) C1675660ths.LIZIZ(f, C1671550tbF.LIZLLL(200, 0, null, 6), 0.0f, null, null, interfaceC1680500tpg, 48, 28).getValue()).floatValue();
        interfaceC1680500tpg.LJ();
        return fFloatValue;
    }

    public static final void LIZ(DescriptionDetail descriptionDetail, Context context, Function0<Unit> function0, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(567418205);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(descriptionDetail)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(context)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1692220u8a c1692220u8aLIZ = C0TRW.LIZ(context, descriptionDetail.description, descriptionDetail.hyperText, descriptionDetail.hyperLinks, C1670400tZO.LJ(c13zcLJIIJ).LJJIIJ.LIZ, C1670400tZO.LJ(c13zcLJIIJ).LJJIIJ.LIZ, function0);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(new C1668650tWZ(6));
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1690500u5o interfaceC1690500u5o = (InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(C20055113dV.LJII);
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(c1685760tyA, 1.0f);
            C1679920tok c1679920tok = C1679930tol.LIZ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(c1679920tok, C1668040tVa.LJIIJ, c13zcLJIIJ, 0);
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
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJI;
                C1665930tSB.LIZ(c13zcLJIIJ, c1688120u1yLIZ, aFwS311S0000000_25);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJFF;
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, aFwS311S0000000_252);
                AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_253);
                }
                AFwS311S0000000_25 aFwS311S0000000_254 = g.a.LIZLLL;
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, aFwS311S0000000_254);
                C1668930tX1.LIZIZ(C1669660tYC.K, null, C1688600u2k.LIZLLL(c.LJIILIIL(c1685760tyA, 10), 0.0f, ((C1668650tWZ) c05p0.getValue()).LL, 1), C1670400tZO.LIZIZ(c13zcLJIIJ).N3(), 0.0f, 0.0f, false, c13zcLJIIJ, 48, 112);
                C1665790tRx.LIZ(c.LJIILLIIL(c1685760tyA, 5), c13zcLJIIJ);
                InterfaceC1685750ty9 interfaceC1685750ty9LJ2 = c.LJ(c1685760tyA, 1.0f);
                C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(C1679930tol.LIZJ, C1668040tVa.LJIILIIL, c13zcLJIIJ, 0);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJ2);
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
                    long jM3 = C1670400tZO.LIZIZ(c13zcLJIIJ).M3();
                    c13zcLJIIJ.LJJIIJZLJL(-1633490746);
                    boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(interfaceC1690500u5o);
                    Object objLJJ2 = c13zcLJIIJ.LJJ();
                    if (zLJJIIJ || objLJJ2 == c1680520tpi) {
                        objLJJ2 = new AwS391S0200000_25(interfaceC1690500u5o, (InterfaceC1690500u5o) c05p0, (C05P0<C1682900ttY>) 363);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    C1685190txF.LIZIZ(c1692220u8aLIZ, null, jM3, null, 0L, 0, 0, false, 0, null, (Function1) objLJJ2, c13zcLJIIJ, 0, 0, 1018);
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
            c20030013YsLJJJJZI.LIZLLL = new C0TRQ(descriptionDetail, context, function0, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05b8 A[PHI: r8
      0x05b8: PHI (r8v5 java.lang.String) = (r8v4 java.lang.String), (r8v11 java.lang.String) binds: [B:180:0x05b4, B:121:0x02e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05be A[PHI: r7 r8
      0x05be: PHI (r7v2 java.util.List<java.lang.String>) = (r7v1 java.util.List<java.lang.String>), (r7v7 java.util.List<java.lang.String>) binds: [B:183:0x05ba, B:124:0x02ec] A[DONT_GENERATE, DONT_INLINE]
      0x05be: PHI (r8v6 java.lang.String) = (r8v5 java.lang.String), (r8v10 java.lang.String) binds: [B:183:0x05ba, B:124:0x02ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x05ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(android.content.Context r54, com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.feedcard.TTPlusCardData r55, X.C05P1<java.lang.Boolean> r56, X.C05P1<java.lang.Boolean> r57, X.C05P1<java.lang.Boolean> r58, X.C05P1<java.lang.Boolean> r59, kotlin.jvm.functions.Function0<kotlin.Unit> r60, kotlin.jvm.functions.Function0<kotlin.Unit> r61, kotlin.jvm.functions.Function0<kotlin.Unit> r62, X.InterfaceC1680500tpg r63, int r64) {
        /*
            Method dump skipped, instruction units count: 1532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1667030tTx.LIZIZ(android.content.Context, com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.feedcard.TTPlusCardData, X.05P1, X.05P1, X.05P1, X.05P1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.0tpg, int):void");
    }
}
