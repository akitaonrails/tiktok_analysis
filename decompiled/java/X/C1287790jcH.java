package X;

/* JADX INFO: renamed from: X.0jcH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1287790jcH {
    public int LIZLLL;
    public int LJ;
    public String LIZ = "unknown";
    public String LIZIZ = "unknown";
    public String LIZJ = "unknown";
    public final int LJFF = -1;
    public double LJI = -1.0d;
    public String LJII = "unknown";

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GPUInfo{renderer='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("', version='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("', vendor='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append("', maxFreq=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", minFreq=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", glVer=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", alusOrThroughput=");
        sbLIZ.append(this.LJI);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
