package X;

/* JADX INFO: renamed from: X.0tub, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683550tub {
    public static final float LIZ = C1683590tuf.LIZ;
    public static final float LIZIZ = 240;

    static {
        new C1677710tlB(0.2f, 0.0f, 0.8f, 1.0f);
        new C1677710tlB(0.4f, 0.0f, 1.0f, 1.0f);
        new C1677710tlB(0.0f, 0.0f, 0.65f, 1.0f);
        new C1677710tlB(0.1f, 0.0f, 0.45f, 1.0f);
        new C1677710tlB(0.4f, 0.0f, 0.2f, 1.0f);
    }

    public static final void LIZIZ(InterfaceC1675870tiD interfaceC1675870tiD, float f, long j, float f2, int i) {
        boolean z;
        float f3;
        float fLIZLLL = C1680770tq7.LIZLLL(interfaceC1675870tiD.LIZIZ());
        float fLIZIZ = C1680770tq7.LIZIZ(interfaceC1675870tiD.LIZIZ());
        float f4 = 2;
        float f5 = fLIZIZ / f4;
        if (interfaceC1675870tiD.getLayoutDirection() == EnumC1671200tag.Ltr) {
            z = true;
        } else {
            z = false;
        }
        float f6 = 1.0f;
        if (z) {
            f3 = 0.0f;
        } else {
            f3 = 1.0f - f;
        }
        float f7 = f3 * fLIZLLL;
        if (z) {
            f6 = f;
        }
        float f8 = f6 * fLIZLLL;
        if (i != 0 && fLIZIZ <= fLIZLLL) {
            float f9 = f2 / f4;
            C0F28 c0f28 = new C0F28(f9, fLIZLLL - f9);
            float fFloatValue = ((Number) C13LZ.LJII(Float.valueOf(f7), c0f28)).floatValue();
            float fFloatValue2 = ((Number) C13LZ.LJII(Float.valueOf(f8), c0f28)).floatValue();
            if (Math.abs(f - 0.0f) > 0.0f) {
                C1675860tiC.LJI(interfaceC1675870tiD, j, C1383705bH.LIZ(fFloatValue, f5), C1383705bH.LIZ(fFloatValue2, f5), f2, i, 480);
                return;
            }
            return;
        }
        C1675860tiC.LJI(interfaceC1675870tiD, j, C1383705bH.LIZ(f7, f5), C1383705bH.LIZ(f8, f5), f2, 0, 496);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(float r17, X.InterfaceC1685750ty9 r18, long r19, long r21, int r23, X.InterfaceC1680500tpg r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1683550tub.LIZ(float, X.0ty9, long, long, int, X.0tpg, int, int):void");
    }
}
