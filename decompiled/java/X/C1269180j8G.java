package X;

/* JADX INFO: renamed from: X.0j8G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1269180j8G {
    public boolean LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public boolean LIZLLL;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public InterfaceC1272820jE8 LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILJJIL;
    public long LJ = 600;
    public boolean LJIIIIZZ = true;
    public float LJIILIIL = -1.0f;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GLRenderInitSetting{enablePreSetFixedSize=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", frameWidth=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", frameHeight=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", enableFixedSizeOpt=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", rectifyDelayTime=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", ignoreSetFixedSizeWhenSimilarWHRate=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", enableNativeRender=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", enableRenderLog=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", enableRoundedCorner=");
        sbLIZ.append(false);
        sbLIZ.append(", enableReportRenderFailed=");
        sbLIZ.append(true);
        sbLIZ.append(", enableRenderTaskOpt=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", serviceManager=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", enableNativeRenderRoundCornerFix=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", isSelfSideRender=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", enableNewBufferPool=");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append(", enableGlFinish=");
        sbLIZ.append(false);
        sbLIZ.append(", enableRenderQueueOpt=");
        sbLIZ.append(false);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1269180j8G(int i, int i2) {
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
