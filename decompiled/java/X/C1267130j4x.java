package X;

/* JADX INFO: renamed from: X.0j4x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1267130j4x implements InterfaceC1267260j5A {
    public float LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public float LJ;
    public float LJFF;

    @Override // X.InterfaceC1267260j5A
    public final /* synthetic */ EnumC1268000j6M LIZIZ(InterfaceC1267260j5A interfaceC1267260j5A) {
        return null;
    }

    public C1267130j4x() {
        Float f = C1101250elP.LIZ;
        this.LIZ = f.floatValue();
        this.LIZIZ = f.floatValue();
        this.LIZJ = f.floatValue();
        this.LIZLLL = f.floatValue();
        this.LJ = f.floatValue();
        this.LJFF = f.floatValue();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTLHPortraitsFeature{speedWifi7d=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", speedMobile7d=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", speedTestLowProbeWifi=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", speedTestLowProbeMobile=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", speedTestHighProbeWifi=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", speedTestHighProbeMobile=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1267260j5A
    public final void LIZJ(InterfaceC1267260j5A interfaceC1267260j5A) {
        if (interfaceC1267260j5A != null && (interfaceC1267260j5A instanceof C1267130j4x)) {
            C1267130j4x c1267130j4x = (C1267130j4x) interfaceC1267260j5A;
            this.LIZ = c1267130j4x.LIZ;
            this.LIZIZ = c1267130j4x.LIZIZ;
            this.LIZJ = c1267130j4x.LIZJ;
            this.LIZLLL = c1267130j4x.LIZLLL;
            this.LJ = c1267130j4x.LJ;
            this.LJFF = c1267130j4x.LJFF;
        }
    }
}
