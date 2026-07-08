package X;

import kotlin.jvm.internal.AwS234S0300000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0u88, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1691940u88 {
    public static C1684310tvp LIZ(long j, C1684310tvp c1684310tvp) {
        InterfaceC1692600u9C interfaceC1692600u9C = c1684310tvp.LIZIZ;
        int i = C1692280u8g.LIZJ;
        int iLIZ = interfaceC1692600u9C.LIZ((int) (j >> 32));
        int iLIZ2 = c1684310tvp.LIZIZ.LIZ(C1692280u8g.LIZLLL(j));
        int iMin = Math.min(iLIZ, iLIZ2);
        int iMax = Math.max(iLIZ, iLIZ2);
        C1692230u8b c1692230u8b = new C1692230u8b(c1684310tvp.LIZ);
        c1692230u8b.LIZIZ(new C1693450uAZ(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, C1693510uAf.LIZJ, null, 61439), iMin, iMax);
        return new C1684310tvp(c1692230u8b.LJIIL(), c1684310tvp.LIZIZ);
    }

    public static void LIZIZ(InterfaceC1686290tz1 interfaceC1686290tz1, long j, InterfaceC1692600u9C interfaceC1692600u9C, C1692150u8T c1692150u8T, C1695150uDJ c1695150uDJ) {
        int iLIZ = interfaceC1692600u9C.LIZ(C1692280u8g.LJI(j));
        int iLIZ2 = interfaceC1692600u9C.LIZ(C1692280u8g.LJFF(j));
        if (iLIZ != iLIZ2) {
            interfaceC1686290tz1.LJII(c1692150u8T.LJIILJJIL(iLIZ, iLIZ2), c1695150uDJ);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, X.0u95, java.lang.Object] */
    public static C1692530u95 LIZLLL(C1692080u8M c1692080u8M, C1686970u07 c1686970u07, C1694260uBs c1694260uBs, C1695020uD6 c1695020uD6, AwS604S0100000_25 awS604S0100000_25, AwS604S0100000_25 awS604S0100000_252) {
        C259800zU c259800zU = new C259800zU();
        c1692080u8M.LIZ.LIZIZ(c1686970u07, c1695020uD6, new AwS234S0300000_25(c1694260uBs, awS604S0100000_25, c259800zU, 57), awS604S0100000_252);
        ?? c1692530u95 = new C1692530u95(c1692080u8M, c1692080u8M.LIZ);
        c1692080u8M.LIZIZ.set((C1692530u95) c1692530u95);
        c259800zU.element = c1692530u95;
        return c1692530u95;
    }

    public static void LIZJ(C1686970u07 c1686970u07, C1691550u7V c1691550u7V, C1692150u8T c1692150u8T, InterfaceC1692950u9l interfaceC1692950u9l, C1692530u95 c1692530u95, boolean z, InterfaceC1692600u9C interfaceC1692600u9C) {
        C1683130ttv c1683130ttv;
        if (!z) {
            return;
        }
        int iLIZ = interfaceC1692600u9C.LIZ(C1692280u8g.LJFF(c1686970u07.LIZIZ));
        if (iLIZ < c1692150u8T.LIZ.LIZ.length()) {
            c1683130ttv = c1692150u8T.LIZIZ(iLIZ);
        } else if (iLIZ != 0) {
            c1683130ttv = c1692150u8T.LIZIZ(iLIZ - 1);
        } else {
            c1683130ttv = new C1683130ttv(0.0f, 0.0f, 1.0f, (int) (C1692720u9O.LIZ(c1691550u7V.LIZIZ, c1691550u7V.LJI, c1691550u7V.LJII, C1692720u9O.LIZ, 1) & 4294967295L));
        }
        float f = c1683130ttv.LIZ;
        long jLJJJJ = interfaceC1692950u9l.LJJJJ((((long) Float.floatToRawIntBits(c1683130ttv.LIZIZ)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jLJJJJ >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jLJJJJ & 4294967295L)))) & 4294967295L);
        float f2 = c1683130ttv.LIZJ - c1683130ttv.LIZ;
        C1683130ttv c1683130ttvLIZJ = C1671570tbH.LIZJ(jFloatToRawIntBits, (((long) Float.floatToRawIntBits(c1683130ttv.LIZLLL - c1683130ttv.LIZIZ)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        if (Intrinsics.LJFF(c1692530u95.LIZ.LIZIZ.get(), c1692530u95)) {
            c1692530u95.LIZIZ.LJI(c1683130ttvLIZJ);
        }
    }
}
