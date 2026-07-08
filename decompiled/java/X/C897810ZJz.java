package X;

/* JADX INFO: renamed from: X.0ZJz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C897810ZJz {
    public final boolean LIZ;
    public final String LIZIZ;
    public final C0ZKF LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public String LJFF;
    public int LJI;
    public int LJII;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{isGroup=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", uid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", uri=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", loadStatus=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", this=");
        sbLIZ.append(hashCode());
        sbLIZ.append(", loader=");
        sbLIZ.append(this.LJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C897810ZJz(boolean z, String str, C0ZKF c0zkf, String str2, int i) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = c0zkf;
        this.LIZLLL = str2;
        this.LJ = i;
    }
}
