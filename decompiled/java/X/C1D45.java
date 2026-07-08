package X;

/* JADX INFO: renamed from: X.1D45, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D45 {
    public boolean LIZ;
    public C0UWR LIZJ;
    public String LIZLLL;
    public String LJ;
    public long LJFF;
    public int LJI;
    public String LJII;
    public boolean LJIIIIZZ;
    public EnumC783720Uok LIZIZ = EnumC783720Uok.DEFAULT;
    public float LJIIIZ = 0.5f;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StopConfig{needReport=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", origin=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", stopReason=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", status='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('\'');
        sbLIZ.append(", roomId='");
        sbLIZ.append(this.LJ);
        sbLIZ.append('\'');
        sbLIZ.append(", enterPreviewTime=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", cancelCode=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", speedTestInitPage=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", enableFrameAdjust=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
