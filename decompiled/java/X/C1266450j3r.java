package X;

/* JADX INFO: renamed from: X.0j3r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1266450j3r implements InterfaceC1267260j5A {
    public String LIZ = "";
    public String LIZIZ = "";
    public String LIZJ;
    public String LIZLLL;
    public float LJ;
    public float LJFF;
    public float LJI;
    public float LJII;
    public int LJIIIIZZ;
    public float LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;

    @Override // X.InterfaceC1267260j5A
    public final /* synthetic */ EnumC1268000j6M LIZIZ(InterfaceC1267260j5A interfaceC1267260j5A) {
        return null;
    }

    public C1266450j3r() {
        Float f = C1101250elP.LIZ;
        this.LJ = f.floatValue();
        this.LJFF = f.floatValue();
        this.LJI = f.floatValue();
        this.LJII = f.floatValue();
        this.LJIIIIZZ = -1;
        this.LJIIIZ = f.floatValue();
        this.LJIIJ = -1;
        this.LJIIJJI = -1;
        this.LJIIL = -1;
        this.LJIILIIL = -1;
        this.LJIILJJIL = -1;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTLHPerformanceFeature{effectFaceModelName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", effectMattingModelName=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", appCpuRate=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", perfScore=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", gamePerformanceScoreHost=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", thermalScore=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", batteryValue=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", isCharging=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", deviceMotionStatus=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", isEcomForAnchor=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", anchorStableModeEnable=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", anchorStableModePerfState=");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append(", downPerfScoreThreshold=");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1267260j5A
    public final void LIZJ(InterfaceC1267260j5A interfaceC1267260j5A) {
        if (interfaceC1267260j5A != null && (interfaceC1267260j5A instanceof C1266450j3r)) {
            C1266450j3r c1266450j3r = (C1266450j3r) interfaceC1267260j5A;
            String str = c1266450j3r.LIZ;
            if (str != null) {
                this.LIZ = str;
            }
            String str2 = c1266450j3r.LIZIZ;
            if (str2 != null) {
                this.LIZIZ = str2;
            }
            String str3 = c1266450j3r.LIZJ;
            if (str3 != null) {
                this.LIZJ = str3;
            }
            String str4 = c1266450j3r.LIZLLL;
            if (str4 != null) {
                this.LIZLLL = str4;
            }
            float f = c1266450j3r.LJ;
            Float f2 = C1101250elP.LIZ;
            if (f != f2.floatValue()) {
                this.LJ = c1266450j3r.LJ;
            }
            if (c1266450j3r.LJFF != f2.floatValue()) {
                this.LJFF = c1266450j3r.LJFF;
            }
            if (c1266450j3r.LJII != f2.floatValue()) {
                this.LJII = c1266450j3r.LJII;
            }
            if (c1266450j3r.LJI != f2.floatValue()) {
                this.LJI = c1266450j3r.LJI;
            }
            int i = c1266450j3r.LJIIIIZZ;
            if (i != -1) {
                this.LJIIIIZZ = i;
            }
            if (c1266450j3r.LJIIIZ != f2.floatValue()) {
                this.LJIIIZ = c1266450j3r.LJIIIZ;
            }
            int i2 = c1266450j3r.LJIIJ;
            if (i2 != -1) {
                this.LJIIJ = i2;
            }
            int i3 = c1266450j3r.LJIIJJI;
            if (i3 != -1) {
                this.LJIIJJI = i3;
            }
            int i4 = c1266450j3r.LJIIL;
            if (i4 != -1) {
                this.LJIIL = i4;
            }
            int i5 = c1266450j3r.LJIILIIL;
            if (i5 != -1) {
                this.LJIILIIL = i5;
            }
            int i6 = c1266450j3r.LJIILJJIL;
            if (i6 != -1) {
                this.LJIILJJIL = i6;
            }
        }
    }
}
