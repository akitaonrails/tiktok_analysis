package X;

/* JADX INFO: renamed from: X.0j4w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1267120j4w implements InterfaceC1267260j5A {
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LIZ = 720;
    public int LIZIZ = 1280;
    public float LIZJ = 0.5f;
    public float LIZLLL = 0.5f;
    public float LJII = 2.0f;
    public String LJIIIIZZ = "not_set";

    @Override // X.InterfaceC1267260j5A
    public final /* synthetic */ EnumC1268000j6M LIZIZ(InterfaceC1267260j5A interfaceC1267260j5A) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkMicVideoParamsGenerateStrategyFeature{canvasWidth=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", canvasHeight=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", windowWidthRatio=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", windowHeightRatio=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", enableSimulcast=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", enableDualChannel=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", enableHighBitrate=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", highBitrateRatio=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", linkmic_layout_config_id_for_generate_strategy=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1267260j5A
    public final void LIZJ(InterfaceC1267260j5A interfaceC1267260j5A) {
        if (interfaceC1267260j5A instanceof C1267120j4w) {
            C1267120j4w c1267120j4w = (C1267120j4w) interfaceC1267260j5A;
            this.LIZ = c1267120j4w.LIZ;
            this.LIZIZ = c1267120j4w.LIZIZ;
            this.LIZJ = c1267120j4w.LIZJ;
            this.LIZLLL = c1267120j4w.LIZLLL;
            this.LJ = c1267120j4w.LJ;
            this.LJFF = c1267120j4w.LJFF;
            this.LJI = c1267120j4w.LJI;
            this.LJII = c1267120j4w.LJII;
            this.LJIIIIZZ = c1267120j4w.LJIIIIZZ;
        }
    }
}
