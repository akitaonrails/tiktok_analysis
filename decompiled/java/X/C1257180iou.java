package X;

/* JADX INFO: renamed from: X.0iou, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1257180iou implements InterfaceC426680GoE {
    public final int LIZ;
    public final EnumC1994907rf LIZIZ;
    public final EnumC1256870ioP LIZJ;
    public InterfaceC662550Pyn LIZLLL;
    public final boolean LJ;
    public final C1256290inT LJFF;

    public C1257180iou(int i, EnumC1994907rf enumC1994907rf, EnumC1256870ioP enumC1256870ioP, C1256290inT c1256290inT, int i2) {
        boolean z;
        enumC1994907rf = (i2 & 2) != 0 ? EnumC1994907rf.DEFAULT : enumC1994907rf;
        enumC1256870ioP = (i2 & 4) != 0 ? EnumC1256870ioP.DEFAULT : enumC1256870ioP;
        if ((i2 & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        c1256290inT = (i2 & 64) != 0 ? null : c1256290inT;
        this.LIZ = i;
        this.LIZIZ = enumC1994907rf;
        this.LIZJ = enumC1256870ioP;
        this.LIZLLL = null;
        this.LJ = z;
        this.LJFF = c1256290inT;
    }
}
