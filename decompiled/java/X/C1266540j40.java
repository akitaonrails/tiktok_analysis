package X;

/* JADX INFO: renamed from: X.0j40, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1266540j40 implements InterfaceC1267260j5A {
    public int LIZIZ;
    public int LJFF;
    public int LIZ = -1;
    public int LIZJ = -1;
    public int LIZLLL = -1;
    public int LJ = -1;
    public int LJI = -1;
    public int LJII = -1;

    @Override // X.InterfaceC1267260j5A
    public final /* synthetic */ EnumC1268000j6M LIZIZ(InterfaceC1267260j5A interfaceC1267260j5A) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTLHBmfFeature{ denoiseEnable=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", denoiseMask=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", minDenoiseAdaptedResolutionWidth=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", minDenoiseAdaptedResolutionHeight=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(" enableStreamHDAdaptive=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", streamhdMask=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", minStreamHDAdaptedResolutionWidth=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", minStreamHDAdaptedResolutionHeight=");
        sbLIZ.append(this.LJII);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1267260j5A
    public final void LIZJ(InterfaceC1267260j5A interfaceC1267260j5A) {
        if (interfaceC1267260j5A != null && (interfaceC1267260j5A instanceof C1266540j40)) {
            C1266540j40 c1266540j40 = (C1266540j40) interfaceC1267260j5A;
            this.LIZJ = c1266540j40.LIZJ;
            this.LIZLLL = c1266540j40.LIZLLL;
            this.LIZ = c1266540j40.LIZ;
            this.LIZIZ = c1266540j40.LIZIZ;
            this.LJI = c1266540j40.LJI;
            this.LJII = c1266540j40.LJII;
            this.LJ = c1266540j40.LJ;
            this.LJFF = c1266540j40.LJFF;
        }
    }
}
