package X;

import p2.j1;

/* JADX INFO: renamed from: X.0u9k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692940u9k {
    public static final C1683130ttv LIZ(InterfaceC1692950u9l interfaceC1692950u9l) {
        C1683130ttv c1683130ttvLJJJJZI;
        InterfaceC1692950u9l interfaceC1692950u9lLJJJIL = interfaceC1692950u9l.LJJJIL();
        if (interfaceC1692950u9lLJJJIL == null || (c1683130ttvLJJJJZI = interfaceC1692950u9lLJJJIL.LJJJJZI(interfaceC1692950u9l, true)) == null) {
            return new C1683130ttv(0.0f, 0.0f, (int) (interfaceC1692950u9l.LIZ() >> 32), (int) (interfaceC1692950u9l.LIZ() & 4294967295L));
        }
        return c1683130ttvLJJJJZI;
    }

    public static final C1683130ttv LIZIZ(InterfaceC1692950u9l interfaceC1692950u9l) {
        return LIZLLL(interfaceC1692950u9l).LJJJJZI(interfaceC1692950u9l, true);
    }

    public static final C1683130ttv LIZJ(InterfaceC1692950u9l interfaceC1692950u9l) {
        InterfaceC1692950u9l interfaceC1692950u9lLIZLLL = LIZLLL(interfaceC1692950u9l);
        float fLIZ = (int) (interfaceC1692950u9lLIZLLL.LIZ() >> 32);
        float fLIZ2 = (int) (interfaceC1692950u9lLIZLLL.LIZ() & 4294967295L);
        C1683130ttv c1683130ttvLJJJJZI = interfaceC1692950u9lLIZLLL.LJJJJZI(interfaceC1692950u9l, true);
        float f = c1683130ttvLJJJJZI.LIZ;
        float f2 = 0.0f;
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > fLIZ) {
            f = fLIZ;
        }
        float f3 = c1683130ttvLJJJJZI.LIZIZ;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > fLIZ2) {
            f3 = fLIZ2;
        }
        float f4 = c1683130ttvLJJJJZI.LIZJ;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 <= fLIZ) {
            fLIZ = f4;
        }
        float f5 = c1683130ttvLJJJJZI.LIZLLL;
        if (f5 >= 0.0f) {
            f2 = f5;
        }
        if (f2 <= fLIZ2) {
            fLIZ2 = f2;
        }
        if (f != fLIZ && f3 != fLIZ2) {
            long jLJJIIJZLJL = interfaceC1692950u9lLIZLLL.LJJIIJZLJL((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
            long jLJJIIJZLJL2 = interfaceC1692950u9lLIZLLL.LJJIIJZLJL((((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(fLIZ) << 32));
            long jLJJIIJZLJL3 = interfaceC1692950u9lLIZLLL.LJJIIJZLJL((((long) Float.floatToRawIntBits(fLIZ)) << 32) | (((long) Float.floatToRawIntBits(fLIZ2)) & 4294967295L));
            long jLJJIIJZLJL4 = interfaceC1692950u9lLIZLLL.LJJIIJZLJL((((long) Float.floatToRawIntBits(fLIZ2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jLJJIIJZLJL >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jLJJIIJZLJL2 >> 32));
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jLJJIIJZLJL4 >> 32));
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jLJJIIJZLJL3 >> 32));
            float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
            float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
            float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jLJJIIJZLJL & 4294967295L));
            float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jLJJIIJZLJL2 & 4294967295L));
            float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jLJJIIJZLJL4 & 4294967295L));
            float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jLJJIIJZLJL3 & 4294967295L));
            return new C1683130ttv(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
        }
        return C1683130ttv.LJ;
    }

    public static final InterfaceC1692950u9l LIZLLL(InterfaceC1692950u9l interfaceC1692950u9l) {
        InterfaceC1692950u9l interfaceC1692950u9l2;
        j1 j1Var;
        InterfaceC1692950u9l interfaceC1692950u9lLJJJIL = interfaceC1692950u9l.LJJJIL();
        while (true) {
            interfaceC1692950u9l2 = interfaceC1692950u9l;
            interfaceC1692950u9l = interfaceC1692950u9lLJJJIL;
            if (interfaceC1692950u9lLJJJIL == null) {
                break;
            }
            interfaceC1692950u9lLJJJIL = interfaceC1692950u9lLJJJIL.LJJJIL();
        }
        if ((interfaceC1692950u9l2 instanceof j1) && (j1Var = (j1) interfaceC1692950u9l2) != null) {
            j1 j1Var2 = j1Var.LLJJIII;
            while (true) {
                j1 j1Var3 = j1Var;
                j1Var = j1Var2;
                if (j1Var2 != null) {
                    j1Var2 = j1Var2.LLJJIII;
                } else {
                    return j1Var3;
                }
            }
        } else {
            return interfaceC1692950u9l2;
        }
    }

    public static final long LJ(InterfaceC1692950u9l interfaceC1692950u9l) {
        return interfaceC1692950u9l.LJJJJ(0L);
    }

    public static final long LJFF(InterfaceC1692950u9l interfaceC1692950u9l) {
        return interfaceC1692950u9l.LJJIIJZLJL(0L);
    }
}
