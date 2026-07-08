package X;

/* JADX INFO: renamed from: X.1DWB, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DWB {
    public final C07YV LIZ;
    public final C07YV LIZIZ;
    public final C1DWC LIZJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1DWB(C07YT c07yt, C1782510wUD c1782510wUD, int i) {
        C07YW c07yw;
        if ((i & 1) != 0) {
            c07yw = C07YW.LIZ;
        } else {
            c07yw = null;
        }
        this(c07yw, (i & 2) != 0 ? C07YW.LIZ : c07yt, (i & 4) != 0 ? C1DWD.LIZ : c1782510wUD);
    }

    public C1DWB(C07YV c07yv, C07YV c07yv2, C1DWC c1dwc) {
        this.LIZ = c07yv;
        this.LIZIZ = c07yv2;
        this.LIZJ = c1dwc;
    }
}
