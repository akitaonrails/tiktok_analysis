package X;

/* JADX INFO: renamed from: X.0Vo9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C808830Vo9 {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{updateTime=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", deviceId='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", versionCode='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('\'');
        sbLIZ.append(", token='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('\'');
        sbLIZ.append(", type=");
        sbLIZ.append(this.LJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C808830Vo9(int i, String str, String str2, long j, String str3) {
        this.LJ = i;
        this.LIZLLL = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZ = j;
    }
}
