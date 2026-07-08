package X;

/* JADX INFO: renamed from: X.0tbJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1671590tbJ {
    public static final long LIZ(C1683130ttv c1683130ttv, C1683130ttv c1683130ttv2) {
        float fIntBitsToFloat;
        float f = c1683130ttv.LIZJ;
        float f2 = c1683130ttv.LIZ;
        float f3 = f - f2;
        float f4 = c1683130ttv2.LIZJ;
        float f5 = c1683130ttv2.LIZ;
        float fIntBitsToFloat2 = 0.0f;
        if (f3 > f4 - f5) {
            if (f2 > f5) {
                fIntBitsToFloat = f5 - f2;
            } else if (f < f4) {
                fIntBitsToFloat = f4 - f;
            } else {
                fIntBitsToFloat = 0.0f;
            }
        } else {
            fIntBitsToFloat = Float.intBitsToFloat((int) (c1683130ttv2.LIZJ() >> 32)) - Float.intBitsToFloat((int) (c1683130ttv.LIZJ() & 4294967295L));
        }
        float f6 = c1683130ttv.LIZLLL;
        float f7 = c1683130ttv.LIZIZ;
        float f8 = f6 - f7;
        float f9 = c1683130ttv2.LIZLLL;
        float f10 = c1683130ttv2.LIZIZ;
        if (f8 > f9 - f10) {
            if (f7 > f10) {
                fIntBitsToFloat2 = f10 - f7;
            } else if (f6 < f9) {
                fIntBitsToFloat2 = f9 - f6;
            }
        } else {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (c1683130ttv2.LIZJ() & 4294967295L)) - Float.intBitsToFloat((int) (c1683130ttv.LIZJ() & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static final C1683130ttv LIZIZ(long j, C1683130ttv c1683130ttv, boolean z) {
        InterfaceC1671600tbK interfaceC1671600tbK;
        if (z) {
            InterfaceC1671600tbK.LIZ.getClass();
            interfaceC1671600tbK = C1671610tbL.LIZJ;
        } else {
            InterfaceC1671600tbK.LIZ.getClass();
            interfaceC1671600tbK = C1671610tbL.LIZIZ;
        }
        long jLIZ = interfaceC1671600tbK.LIZ(j, c1683130ttv.LIZLLL());
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * Float.intBitsToFloat((int) (jLIZ >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * Float.intBitsToFloat((int) (jLIZ & 4294967295L));
        float fIntBitsToFloat3 = c1683130ttv.LIZ + ((Float.intBitsToFloat((int) (c1683130ttv.LIZLLL() >> 32)) - fIntBitsToFloat) / 2.0f);
        float fIntBitsToFloat4 = c1683130ttv.LIZIZ + ((Float.intBitsToFloat((int) (c1683130ttv.LIZLLL() & 4294967295L)) - fIntBitsToFloat2) / 2.0f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        if (!C1680770tq7.LIZ(jFloatToRawIntBits, 9205357640488583168L) && !C1680770tq7.LIZ(jFloatToRawIntBits, 0L)) {
            return C1671570tbH.LIZJ((((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L), jFloatToRawIntBits);
        }
        return C1683130ttv.LIZIZ(c1683130ttv, 0.0f, 0.0f, 15);
    }
}
