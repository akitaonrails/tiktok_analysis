package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ti4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1675780ti4 {
    public static final List<C1675800ti6> LIZ = C1697810uHb.LJIIJJI(new C1675800ti6(0.42f, 0.56f, 0.06f, 380.0f, 320.0f, 9, 9, 28), new C1675800ti6(0.36f, 0.42f, 0.0f, 560.0f, 480.0f, 41, 9, 20), new C1675800ti6(0.36f, 0.42f, 0.0f, 560.0f, 480.0f, 9, 41, 20));
    public static final List<C1675800ti6> LIZIZ = C1697810uHb.LJIIJJI(new C1675800ti6(0.42f, 0.56f, 0.06f, 380.0f, 320.0f, 6, 24, 32), new C1675800ti6(0.36f, 0.42f, 0.0f, 560.0f, 480.0f, 32, 6, 24));

    public static final void LIZIZ(InterfaceC1675870tiD interfaceC1675870tiD, float f, long j, long j2, long j3) {
        float f2 = f / 68.0f;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = ((f2 - 1.0f) * 0.68f) + 1.0f;
        }
        float fLJJJJLL = interfaceC1675870tiD.LJJJJLL(68.0f * f2);
        if (fLJJJJLL < 1.0f) {
            return;
        }
        float fLJJJJLL2 = interfaceC1675870tiD.LJJJJLL(26 * f2);
        float f3 = fLJJJJLL / 2.0f;
        if (fLJJJJLL2 > f3) {
            fLJJJJLL2 = f3;
        }
        C1695950uEb c1695950uEbLIZ = C1695940uEa.LIZ();
        float f4 = fLJJJJLL - fLJJJJLL2;
        c1695950uEbLIZ.LIZJ(fLJJJJLL, f4);
        float f5 = fLJJJJLL - (fLJJJJLL2 * (1 - 0.5522848f));
        c1695950uEbLIZ.LJI(fLJJJJLL, f5, f5, fLJJJJLL, f4, fLJJJJLL);
        c1695950uEbLIZ.LJIIL(0.0f, fLJJJJLL);
        c1695950uEbLIZ.LJIIL(fLJJJJLL, 0.0f);
        c1695950uEbLIZ.close();
        float fLJJJJLL3 = interfaceC1675870tiD.LJJJJLL(6.0f);
        if (fLJJJJLL3 > 0.0f) {
            InterfaceC1686290tz1 interfaceC1686290tz1LIZ = interfaceC1675870tiD.LJLJI().LIZ();
            Paint paint = C1695550uDx.LIZ().LIZ;
            paint.setColor(0);
            paint.setShadowLayer(fLJJJJLL3, 0.0f, interfaceC1675870tiD.LJJJJLL(1.5f), C1685850tyJ.LJIIIZ(C1685910tyP.LIZJ(0.08f, C1685910tyP.LIZIZ)));
            Canvas canvas = C1296530jqN.LIZ;
            ((C1696880uG6) interfaceC1686290tz1LIZ).LIZ.drawPath(c1695950uEbLIZ.LIZIZ, paint);
        }
        C1675860tiC.LJIIIIZZ(interfaceC1675870tiD, c1695950uEbLIZ, j, 0.0f, null, 60);
        C1675860tiC.LJII(interfaceC1675870tiD, c1695950uEbLIZ, C1668200tVq.LJ(new Pair[]{new Pair(Float.valueOf(0.519505f), new C1685910tyP(C1685910tyP.LIZJ(0.01f, j3))), new Pair(Float.valueOf(0.861693f), new C1685910tyP(C1685910tyP.LIZJ(0.05f, j3))), new Pair(Float.valueOf(0.93927f), new C1685910tyP(C1685910tyP.LIZJ(0.08f, j3))), new Pair(Float.valueOf(1.0f), new C1685910tyP(C1685910tyP.LIZJ(0.02f, j3)))}, (((long) Float.floatToRawIntBits(fLJJJJLL)) << 32) | (((long) Float.floatToRawIntBits(fLJJJJLL)) & 4294967295L), (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L)), 0.0f, null, 60);
        if (f2 > 1.12f) {
            f2 = 1.12f;
        }
        float fLJJJJLL4 = interfaceC1675870tiD.LJJJJLL(0.6f * f2);
        C1695950uEb c1695950uEbLIZ2 = C1695940uEa.LIZ();
        c1695950uEbLIZ2.LIZJ(0.0f, fLJJJJLL);
        c1695950uEbLIZ2.LJIIL(f4, fLJJJJLL);
        c1695950uEbLIZ2.LJI(f5, fLJJJJLL, fLJJJJLL, f5, fLJJJJLL, f4);
        c1695950uEbLIZ2.LJIIL(fLJJJJLL, 0.0f);
        C1675860tiC.LJIIIIZZ(interfaceC1675870tiD, c1695950uEbLIZ2, j2, 0.0f, new C1695210uDP(fLJJJJLL4, 0.0f, 0, 0, null, 30), 52);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.InterfaceC1665500tRU<? extends com.ss.android.ugc.aweme.profile.model.User> r42, kotlin.jvm.functions.Function0<kotlin.Unit> r43, X.InterfaceC1685750ty9 r44, boolean r45, X.InterfaceC1680500tpg r46, int r47, int r48) {
        /*
            Method dump skipped, instruction units count: 1271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1675780ti4.LIZ(X.0tRU, kotlin.jvm.functions.Function0, X.0ty9, boolean, X.0tpg, int, int):void");
    }
}
