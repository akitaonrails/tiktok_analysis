package X;

/* JADX INFO: renamed from: X.1Anp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2190271Anp {
    public final long LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final long LIZLLL;
    public final long LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Result(probeSpeed=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", uploadContext=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isComplete=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", probeStartTime=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", probeEndTime=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2190271Anp(long j, long j2, String str, long j3, boolean z) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = j2;
        this.LJ = j3;
    }
}
