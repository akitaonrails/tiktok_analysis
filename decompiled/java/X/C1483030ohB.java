package X;

/* JADX INFO: renamed from: X.0ohB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1483030ohB {
    public final boolean LIZ = true;
    public final C1482760ogk LIZIZ = new C1482760ogk(C582130MsN.LIZ().getConfig().getSimPlayerConfig().getPreRenderConfig().LIZJ());
    public final C1483010oh9 LIZJ = new C0S3K() { // from class: X.0oh9
        @Override // X.C0S3K, X.InterfaceC1482530ogN
        public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
            this.LL.LIZIZ.LIZ();
            C582130MsN.LIZ().getConfig().getSimPlayerConfig().getPreRenderConfig().LJIIIIZZ();
            this.LL.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("triggered by onRenderFirstFrame. sourceId:");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            C1483030ohB c1483030ohB = this.LL;
            c1483030ohB.LJ.LJIILJJIL(0, c1483030ohB.LIZ);
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
            C1483030ohB c1483030ohB = this.LL;
            c1483030ohB.LJ.LJIILJJIL(2, c1483030ohB.LIZ);
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
    public final C1023940cki LIZLLL = new InterfaceC1023870ckb() { // from class: X.0cki
    };
    public final /* synthetic */ C1483000oh8 LJ;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0oh9] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0cki] */
    public C1483030ohB(C1483000oh8 c1483000oh8) {
        this.LJ = c1483000oh8;
    }
}
