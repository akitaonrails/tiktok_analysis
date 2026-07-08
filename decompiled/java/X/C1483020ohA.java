package X;

/* JADX INFO: renamed from: X.0ohA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1483020ohA {
    public final C1482760ogk LIZ = new C1482760ogk(C582130MsN.LIZ().getConfig().getSimPlayerConfig().getPreRenderConfig().LIZJ());
    public final C1482980oh6 LIZIZ = new C0S3K() { // from class: X.0oh6
        @Override // X.C0S3K, X.InterfaceC1482530ogN
        public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
            this.LL.LIZ.LIZ();
            C582130MsN.LIZ().getConfig().getSimPlayerConfig().getPreRenderConfig().LJIIIIZZ();
            this.LL.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("triggered by onRenderFirstFrame. sourceId:");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            C1482990oh7 c1482990oh7 = this.LL.LJ;
            c1482990oh7.LJ.getClass();
            c1482990oh7.LJIILJJIL(0, true);
        }

        @Override // X.C0S3K, X.InterfaceC1482530ogN
        public final void onBufferedPercent(String str, long j, int i) {
            C582130MsN.LIZ().getConfig().getSimPlayerConfig().getPreRenderConfig().LJI();
            C582130MsN.LIZ().getConfig().getSimPlayerConfig().getPreRenderConfig().LJFF();
            if (i < 90) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("triggered by onBufferedPercent. percent not enough, return. sourceId:");
                sbLIZ.append(str);
                sbLIZ.append(" percent:");
                sbLIZ.append(i);
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            this.LL.getClass();
            C1482990oh7 c1482990oh7 = this.LL.LJ;
            c1482990oh7.LJ.getClass();
            c1482990oh7.LJIILJJIL(2, true);
        }

        @Override // X.C0S3K, X.InterfaceC1482530ogN
        public final void onPlayProgressChange(String str, long j, long j2) {
            C582130MsN.LIZ().getConfig().getSimPlayerConfig().getPreRenderConfig().LJII();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("triggered by onPlayProgressChange. switch not open, return. sourceId:");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    };
    public final C1482840ogs LIZJ = new C1482840ogs(this);
    public final C1483100ohI LIZLLL = new InterfaceC1023870ckb() { // from class: X.0ohI
    };
    public final /* synthetic */ C1482990oh7 LJ;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0oh6] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0ohI] */
    public C1483020ohA(C1482990oh7 c1482990oh7) {
        this.LJ = c1482990oh7;
    }

    public final void LIZ(String str) {
        C582130MsN.LIZ().getConfig().getSimPlayerConfig().getPreRenderConfig().LIZ();
        C1482990oh7 c1482990oh7 = this.LJ;
        c1482990oh7.LJ.getClass();
        c1482990oh7.LJIILJJIL(3, true);
    }
}
