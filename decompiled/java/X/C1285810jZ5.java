package X;

/* JADX INFO: renamed from: X.0jZ5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1285810jZ5 {
    public final int LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public final String LJI;
    public final String LJII;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IosAlignedCameraConfig(maxFps=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hasTorch=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", deviceType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", hasFlash=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", minFps=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", id=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", maxResolution=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1285810jZ5(String str, String str2, String str3, String str4, int i, int i2, boolean z, boolean z2) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = z2;
        this.LJFF = i2;
        this.LJI = str3;
        this.LJII = str4;
    }
}
