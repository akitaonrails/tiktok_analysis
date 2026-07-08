package X;

/* JADX INFO: renamed from: X.0tq0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1680700tq0 {
    public static final long LIZIZ(C1683130ttv c1683130ttv) {
        float f = c1683130ttv.LIZJ - c1683130ttv.LIZ;
        return (((long) Float.floatToRawIntBits(c1683130ttv.LIZLLL - c1683130ttv.LIZIZ)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final long LIZJ(C1680760tq6 c1680760tq6) {
        float f = c1680760tq6.LIZJ - c1680760tq6.LIZ;
        return (((long) Float.floatToRawIntBits(c1680760tq6.LIZLLL - c1680760tq6.LIZIZ)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static void LIZ(InterfaceC1675870tiD interfaceC1675870tiD, AbstractC1680810tqB abstractC1680810tqB, long j) {
        InterfaceC1680960tqQ interfaceC1680960tqQ;
        C1695700uEC c1695700uEC = C1695700uEC.LIZ;
        InterfaceC1675870tiD.LLILL.getClass();
        int i = C1668240tVu.LIZIZ;
        if (abstractC1680810tqB instanceof C1680780tq8) {
            C1683130ttv c1683130ttv = ((C1680780tq8) abstractC1680810tqB).LIZ;
            interfaceC1675870tiD.LLIFFJFJJ(j, (((long) Float.floatToRawIntBits(c1683130ttv.LIZ)) << 32) | (((long) Float.floatToRawIntBits(c1683130ttv.LIZIZ)) & 4294967295L), LIZIZ(c1683130ttv), 1.0f, c1695700uEC, null, i);
            return;
        }
        if (abstractC1680810tqB instanceof C1680730tq3) {
            C1680730tq3 c1680730tq3 = (C1680730tq3) abstractC1680810tqB;
            interfaceC1680960tqQ = c1680730tq3.LIZIZ;
            if (interfaceC1680960tqQ == null) {
                C1680760tq6 c1680760tq6 = c1680730tq3.LIZ;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (c1680760tq6.LJII >> 32));
                float f = c1680760tq6.LIZ;
                interfaceC1675870tiD.LJLLILLLL(j, (((long) Float.floatToRawIntBits(c1680760tq6.LIZIZ)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), LIZJ(c1680760tq6), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), c1695700uEC, 1.0f, null, i);
                return;
            }
        } else if (abstractC1680810tqB instanceof C1680800tqA) {
            interfaceC1680960tqQ = ((C1680800tqA) abstractC1680810tqB).LIZ;
        } else {
            throw new C1954807lC();
        }
        interfaceC1675870tiD.LLILL(interfaceC1680960tqQ, j, 1.0f, c1695700uEC, null, i);
    }
}
