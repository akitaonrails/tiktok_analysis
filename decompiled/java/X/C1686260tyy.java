package X;

/* JADX INFO: renamed from: X.0tyy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1686260tyy implements InterfaceC1686280tz0 {
    public final /* synthetic */ InterfaceC1686270tyz LIZ;

    public final long LIZLLL() {
        return this.LIZ.LIZIZ();
    }

    @Override // X.InterfaceC1686280tz0
    public final long LJIJI() {
        return C1671580tbI.LIZIZ(LIZLLL());
    }

    public C1686260tyy(InterfaceC1686270tyz interfaceC1686270tyz) {
        this.LIZ = interfaceC1686270tyz;
    }

    public final void LJI(float[] fArr) {
        this.LIZ.LIZ().LJ(fArr);
    }

    public final void LIZIZ(InterfaceC1680960tqQ interfaceC1680960tqQ, int i) {
        this.LIZ.LIZ().LJIILIIL(interfaceC1680960tqQ, i);
    }

    public final void LJFF(float f, long j) {
        InterfaceC1686290tz1 interfaceC1686290tz1LIZ = this.LIZ.LIZ();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        interfaceC1686290tz1LIZ.LJIILJJIL(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        interfaceC1686290tz1LIZ.jv(f);
        interfaceC1686290tz1LIZ.LJIILJJIL(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public final void LJII(float f, float f2) {
        this.LIZ.LIZ().LJIILJJIL(f, f2);
    }

    @Override // X.InterfaceC1686280tz0
    public final void LIZ(float f, float f2, long j) {
        InterfaceC1686290tz1 interfaceC1686290tz1LIZ = this.LIZ.LIZ();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        interfaceC1686290tz1LIZ.LJIILJJIL(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        interfaceC1686290tz1LIZ.LIZJ(f, f2);
        interfaceC1686290tz1LIZ.LJIILJJIL(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public final void LJ(float f, float f2, float f3, float f4) {
        InterfaceC1686290tz1 interfaceC1686290tz1LIZ = this.LIZ.LIZ();
        InterfaceC1686270tyz interfaceC1686270tyz = this.LIZ;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (LIZLLL() >> 32)) - (f3 + f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (LIZLLL() & 4294967295L)) - (f4 + f2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            C1685840tyI.LIZ("Width and height must be greater than or equal to zero");
        }
        interfaceC1686270tyz.LIZJ(jFloatToRawIntBits);
        interfaceC1686290tz1LIZ.LJIILJJIL(f, f2);
    }

    public final void LIZJ(float f, float f2, float f3, float f4, int i) {
        this.LIZ.LIZ().LJIIIZ(f, f2, f3, f4, i);
    }
}
