package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0imf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1255790imf {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public int LJII;

    public C1255790imf() {
        this(null, null, null, null, null, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1255790imf)) {
            return false;
        }
        C1255790imf c1255790imf = (C1255790imf) obj;
        return Intrinsics.LJFF(this.LIZ, c1255790imf.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1255790imf.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1255790imf.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1255790imf.LIZLLL) && Intrinsics.LJFF(this.LJ, c1255790imf.LJ) && Intrinsics.LJFF(this.LJFF, c1255790imf.LJFF) && Intrinsics.LJFF(this.LJI, c1255790imf.LJI) && this.LJII == c1255790imf.LJII;
    }

    public final int hashCode() {
        return (((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FavoriteSearchTrackingParams(rawKeyword=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", trimmedKeyword=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", searchMethod=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", querySource=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", searchId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", tabName=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", beforeLoadMoreCount=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1255790imf(String str, String str2, String str3, String str4, String str5, int i) {
        String str6;
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        str3 = (i & 4) != 0 ? "" : str3;
        str4 = (i & 8) != 0 ? "" : str4;
        str5 = (i & 16) != 0 ? "" : str5;
        if ((i & 32) != 0) {
            str6 = "video";
        } else {
            str6 = null;
        }
        String str7 = (i & 64) != 0 ? "personal_homepage" : null;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
        this.LJII = 0;
    }
}
