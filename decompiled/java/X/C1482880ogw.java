package X;

import java.util.List;

/* JADX INFO: renamed from: X.0ogw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1482880ogw extends AbstractC1482950oh3 {
    public final C1483080ohG LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final C1483330ohf LJ;
    public AbstractC1511510pR7 LJFF;

    @Override // X.InterfaceC583260MuC
    public final List<String> LIZ() {
        return C1697810uHb.LJIIJJI("SimKitPlayer_PLAY", "StrategyScene_SET_PLAY_LIST");
    }

    @Override // X.AbstractC1482950oh3
    public final boolean LIZJ() {
        this.LIZIZ.LIZJ.getClass();
        return C1479110oar.LIZ.LIZ.getVideoPreloaderManagerConfig().isPreloadV3Enabled();
    }

    @Override // X.AbstractC1482950oh3
    public final void LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSceneDestroy:");
        sbLIZ.append(this.LIZIZ.LIZ.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        C1475700oVM.LIZ().LJJIJLIJ(this.LIZIZ.LIZ.LIZ);
    }

    @Override // X.AbstractC1482950oh3
    public final void LJ() {
        super.LJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSceneMoveTo:");
        sbLIZ.append(this.LIZIZ.LIZ.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        C1475700oVM.LIZ().LJJJ(this.LIZIZ.LIZ.LIZ);
    }

    @Override // X.AbstractC1482950oh3
    public final String LJFF() {
        return this.LIZJ;
    }

    public C1482880ogw(C1483080ohG c1483080ohG) {
        super(c1483080ohG);
        this.LIZIZ = c1483080ohG;
        this.LIZJ = "PreloadInSceneStrategy-MB";
        this.LIZLLL = 8;
        this.LJ = new C1483330ohf(this);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSceneCreate:");
        sbLIZ.append(c1483080ohG.LIZ.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        C1475700oVM.LIZ().LJJJI(c1483080ohG.LIZ.LIZ, C1478190oZN.LIZ().preloadConfigJsonInScene());
    }

    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085 A[PHI: r4 r11
      0x0085: PHI (r4v2 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String) binds: [B:26:0x0051, B:24:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0085: PHI (r11v3 X.0ohJ) = (r11v2 X.0ohJ), (r11v4 X.0ohJ) binds: [B:26:0x0051, B:24:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f2  */
    @Override // X.InterfaceC583260MuC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.Object r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1482880ogw.LIZIZ(java.lang.Object, java.lang.String):void");
    }
}
