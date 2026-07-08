package X;

/* JADX INFO: renamed from: X.1D46, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D46 {
    public EnumC2249951D4n LIZ;
    public EnumC2249951D4n LIZIZ;
    public EnumC2249951D4n LIZJ;
    public EnumC2178851APb LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    public C1D46() {
        EnumC2249951D4n enumC2249951D4n = EnumC2249951D4n.LEVEL_STAGE_DEFAULT;
        this.LIZ = enumC2249951D4n;
        this.LIZIZ = enumC2249951D4n;
        this.LIZJ = enumC2249951D4n;
        this.LIZLLL = EnumC2178851APb.LEVEL_GAME_DEFAULT;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoQualityLevel{stageEncodeLevel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", stageEffectLevel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", stageCaptureLevel=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", gameLevel=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isBottomLineFallback=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isProbeFallback=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1D46(int i, EnumC1283150jUn enumC1283150jUn) {
        EnumC2249951D4n enumC2249951D4n = EnumC2249951D4n.LEVEL_STAGE_DEFAULT;
        this.LIZ = enumC2249951D4n;
        this.LIZIZ = enumC2249951D4n;
        this.LIZJ = enumC2249951D4n;
        this.LIZLLL = EnumC2178851APb.LEVEL_GAME_DEFAULT;
        if (enumC1283150jUn == EnumC1283150jUn.STAGE) {
            this.LIZ = EnumC2249951D4n.levelIntToStageLevel(i);
        } else {
            if (enumC1283150jUn != EnumC1283150jUn.GAME) {
                return;
            }
            this.LIZLLL = EnumC2178851APb.levelIntToGameLevel(i);
        }
    }
}
