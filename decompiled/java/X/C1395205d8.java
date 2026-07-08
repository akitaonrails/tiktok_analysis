package X;

/* JADX INFO: renamed from: X.05d8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1395205d8 {
    public final C1395305d9 LIZ;
    public final C1395305d9 LIZIZ;
    public long LIZJ;

    public C1395205d8() {
        EnumC1395405dA enumC1395405dA = EnumC1395405dA.Lsq2;
        this.LIZ = new C1395305d9(false, enumC1395405dA);
        this.LIZIZ = new C1395305d9(false, enumC1395405dA);
    }

    public final long LIZIZ(long j) {
        if (C1395705dD.LIZIZ(j) <= 0.0f || C1395705dD.LIZJ(j) <= 0.0f) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("maximumVelocity should be a positive value. You specified=");
            sbLIZ.append((Object) C1395705dD.LJI(j));
            C1696250uF5.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        return C1374205Zk.LIZ(this.LIZ.LIZIZ(C1395705dD.LIZIZ(j)), this.LIZIZ.LIZIZ(C1395705dD.LIZJ(j)));
    }

    public final void LIZ(long j, long j2) {
        this.LIZ.LIZ(Float.intBitsToFloat((int) (j2 >> 32)), j);
        this.LIZIZ.LIZ(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }
}
