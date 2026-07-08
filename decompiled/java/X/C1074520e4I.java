package X;

/* JADX INFO: renamed from: X.0e4I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1074520e4I {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        String str = this.LJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrackInfo(enterFrom=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", previousPage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", homepageUid=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", sceneType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1074520e4I(String str, String str2, int i) {
        String str3;
        String str4;
        str = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            str3 = "";
        } else {
            str3 = null;
        }
        if ((i & 4) != 0) {
            str4 = "";
        } else {
            str4 = null;
        }
        String str5 = (i & 8) == 0 ? null : "";
        str2 = (i & 16) != 0 ? null : str2;
        this.LIZ = str;
        this.LIZIZ = str3;
        this.LIZJ = str4;
        this.LIZLLL = str5;
        this.LJ = str2;
    }
}
