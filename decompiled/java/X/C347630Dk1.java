package X;

/* JADX INFO: renamed from: X.0Dk1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C347630Dk1 {
    public final String LIZ;
    public Long LIZIZ;
    public Long LIZJ;
    public Float LIZLLL;
    public Double LJ;
    public Long LJFF;
    public Long LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioParams.Filter(startTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", volume=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", dbRange=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", fadeInLength=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", fadeOutLength=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C347630Dk1(String str) {
        this.LIZ = str;
    }
}
