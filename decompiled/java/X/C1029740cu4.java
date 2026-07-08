package X;

/* JADX INFO: renamed from: X.0cu4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1029740cu4 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;
    public final Integer LJ;
    public final Boolean LJFF;
    public final boolean LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdHybridDataModel(creativeId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", logExra=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", groupId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", chargeType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", systemOrigin=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isAd=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", hasSparkLoaderNullReCreate=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1029740cu4(String str, String str2, String str3, Integer num, Integer num2, Boolean bool, boolean z, int i) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        str3 = (i & 4) != 0 ? "" : str3;
        num = (i & 8) != 0 ? -1 : num;
        num2 = (i & 16) != 0 ? -1 : num2;
        bool = (i & 32) != 0 ? Boolean.FALSE : bool;
        z = (i & 64) != 0 ? false : z;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = num;
        this.LJ = num2;
        this.LJFF = bool;
        this.LJI = z;
    }
}
