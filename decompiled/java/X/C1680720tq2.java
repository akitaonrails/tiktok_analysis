package X;

/* JADX INFO: renamed from: X.0tq2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1680720tq2 {
    public static final boolean LIZ(AbstractC1680810tqB abstractC1680810tqB, float f, float f2, InterfaceC1680960tqQ interfaceC1680960tqQ, InterfaceC1680960tqQ interfaceC1680960tqQ2) {
        InterfaceC1680960tqQ interfaceC1680960tqQLIZ;
        if (abstractC1680810tqB instanceof C1680780tq8) {
            C1683130ttv c1683130ttv = ((C1680780tq8) abstractC1680810tqB).LIZ;
            if (c1683130ttv.LIZ > f || f >= c1683130ttv.LIZJ || c1683130ttv.LIZIZ > f2 || f2 >= c1683130ttv.LIZLLL) {
                return false;
            }
        } else if (abstractC1680810tqB instanceof C1680730tq3) {
            C1680760tq6 c1680760tq6 = ((C1680730tq3) abstractC1680810tqB).LIZ;
            if (f >= c1680760tq6.LIZ && f < c1680760tq6.LIZJ && f2 >= c1680760tq6.LIZIZ && f2 < c1680760tq6.LIZLLL) {
                if (Float.intBitsToFloat((int) (c1680760tq6.LJ >> 32)) + Float.intBitsToFloat((int) (c1680760tq6.LJFF >> 32)) <= c1680760tq6.LIZJ - c1680760tq6.LIZ && Float.intBitsToFloat((int) (c1680760tq6.LJII >> 32)) + Float.intBitsToFloat((int) (c1680760tq6.LJI >> 32)) <= c1680760tq6.LIZJ - c1680760tq6.LIZ && Float.intBitsToFloat((int) (c1680760tq6.LJ & 4294967295L)) + Float.intBitsToFloat((int) (c1680760tq6.LJII & 4294967295L)) <= c1680760tq6.LIZLLL - c1680760tq6.LIZIZ && Float.intBitsToFloat((int) (c1680760tq6.LJFF & 4294967295L)) + Float.intBitsToFloat((int) (c1680760tq6.LJI & 4294967295L)) <= c1680760tq6.LIZLLL - c1680760tq6.LIZIZ) {
                    float fIntBitsToFloat = c1680760tq6.LIZ + Float.intBitsToFloat((int) (c1680760tq6.LJ >> 32));
                    float fIntBitsToFloat2 = c1680760tq6.LIZIZ + Float.intBitsToFloat((int) (c1680760tq6.LJ & 4294967295L));
                    float fIntBitsToFloat3 = c1680760tq6.LIZJ - Float.intBitsToFloat((int) (c1680760tq6.LJFF >> 32));
                    float fIntBitsToFloat4 = c1680760tq6.LIZIZ + Float.intBitsToFloat((int) (c1680760tq6.LJFF & 4294967295L));
                    float fIntBitsToFloat5 = c1680760tq6.LIZJ - Float.intBitsToFloat((int) (c1680760tq6.LJI >> 32));
                    float fIntBitsToFloat6 = c1680760tq6.LIZLLL - Float.intBitsToFloat((int) (c1680760tq6.LJI & 4294967295L));
                    float fIntBitsToFloat7 = c1680760tq6.LIZLLL - Float.intBitsToFloat((int) (4294967295L & c1680760tq6.LJII));
                    float fIntBitsToFloat8 = Float.intBitsToFloat((int) (c1680760tq6.LJII >> 32)) + c1680760tq6.LIZ;
                    if (f < fIntBitsToFloat && f2 < fIntBitsToFloat2) {
                        return LIZJ(f, f2, fIntBitsToFloat, fIntBitsToFloat2, c1680760tq6.LJ);
                    }
                    if (f < fIntBitsToFloat8 && f2 > fIntBitsToFloat7) {
                        return LIZJ(f, f2, fIntBitsToFloat8, fIntBitsToFloat7, c1680760tq6.LJII);
                    }
                    if (f > fIntBitsToFloat3 && f2 < fIntBitsToFloat4) {
                        return LIZJ(f, f2, fIntBitsToFloat3, fIntBitsToFloat4, c1680760tq6.LJFF);
                    }
                    if (f > fIntBitsToFloat5 && f2 > fIntBitsToFloat6) {
                        return LIZJ(f, f2, fIntBitsToFloat5, fIntBitsToFloat6, c1680760tq6.LJI);
                    }
                } else {
                    if (interfaceC1680960tqQ2 == null) {
                        interfaceC1680960tqQLIZ = C1695940uEa.LIZ();
                    } else {
                        interfaceC1680960tqQLIZ = interfaceC1680960tqQ2;
                    }
                    interfaceC1680960tqQLIZ.LJIILJJIL(c1680760tq6, EnumC1669110tXJ.CounterClockwise);
                    return LIZIZ(interfaceC1680960tqQLIZ, f, f2, interfaceC1680960tqQ, interfaceC1680960tqQ2);
                }
            } else {
                return false;
            }
        } else {
            if (abstractC1680810tqB instanceof C1680800tqA) {
                return LIZIZ(((C1680800tqA) abstractC1680810tqB).LIZ, f, f2, interfaceC1680960tqQ, interfaceC1680960tqQ2);
            }
            throw new C1954807lC();
        }
        return true;
    }

    public static final boolean LIZIZ(InterfaceC1680960tqQ interfaceC1680960tqQ, float f, float f2, InterfaceC1680960tqQ interfaceC1680960tqQ2, InterfaceC1680960tqQ interfaceC1680960tqQ3) {
        C1683130ttv c1683130ttv = new C1683130ttv(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        if (interfaceC1680960tqQ2 == null) {
            interfaceC1680960tqQ2 = C1695940uEa.LIZ();
        }
        interfaceC1680960tqQ2.LJIILIIL(c1683130ttv, EnumC1669110tXJ.CounterClockwise);
        if (interfaceC1680960tqQ3 == null) {
            interfaceC1680960tqQ3 = C1695940uEa.LIZ();
        }
        interfaceC1680960tqQ3.LJIIJ(interfaceC1680960tqQ, interfaceC1680960tqQ2, 1);
        boolean zIsEmpty = interfaceC1680960tqQ3.isEmpty();
        interfaceC1680960tqQ3.reset();
        interfaceC1680960tqQ2.reset();
        return !zIsEmpty;
    }

    public static final boolean LIZJ(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) + ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) <= 1.0f) {
            return true;
        }
        return false;
    }
}
