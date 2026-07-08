package X;

/* JADX INFO: renamed from: X.0tyo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1686160tyo implements InterfaceC1686130tyl {
    public final float LIZ;
    public final C1686170typ LIZIZ;

    @Override // X.InterfaceC1686130tyl
    public final float LIZIZ(float f, float f2, float f3) {
        return 0.0f;
    }

    @Override // X.InterfaceC1677030tk5
    public final InterfaceC1677220tkO LIZ(InterfaceC1677290tkV interfaceC1677290tkV) {
        return new C1686080tyg(this);
    }

    public C1686160tyo(float f, float f2, float f3) {
        this.LIZ = f3;
        C1686170typ c1686170typ = new C1686170typ();
        if (f < 0.0f) {
            C1676960tjy.LIZ("Damping ratio must be non-negative");
        }
        c1686170typ.LIZJ = f;
        double d = c1686170typ.LIZIZ;
        if (((float) (d * d)) <= 0.0f) {
            C1676960tjy.LIZ("Spring stiffness constant must be positive.");
        }
        c1686170typ.LIZIZ = Math.sqrt(f2);
        this.LIZIZ = c1686170typ;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0170 A[EDGE_INSN: B:88:0x0170->B:52:0x0170 BREAK  A[LOOP:2: B:76:0x01f6->B:90:?], SYNTHETIC] */
    @Override // X.InterfaceC1686130tyl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LIZJ(float r28, float r29, float r30) {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1686160tyo.LIZJ(float, float, float):long");
    }

    @Override // X.InterfaceC1686130tyl
    public final float LIZLLL(float f, float f2, float f3, long j) {
        C1686170typ c1686170typ = this.LIZIZ;
        c1686170typ.LIZ = f2;
        return Float.intBitsToFloat((int) (c1686170typ.LIZ(f, f3, j / 1000000) & 4294967295L));
    }

    @Override // X.InterfaceC1686130tyl
    public final float LJ(float f, float f2, float f3, long j) {
        C1686170typ c1686170typ = this.LIZIZ;
        c1686170typ.LIZ = f2;
        return Float.intBitsToFloat((int) (c1686170typ.LIZ(f, f3, j / 1000000) >> 32));
    }
}
