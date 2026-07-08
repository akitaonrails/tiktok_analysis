package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yOt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1856090yOt {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZLLL;
    public final String LJ;
    public final String LIZJ = "";
    public final String LJFF = "visual_search_tikbot";
    public final String LJI = "click_visual_search_button";
    public final String LJII = "visual_search_button";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1856090yOt)) {
            return false;
        }
        C1856090yOt c1856090yOt = (C1856090yOt) obj;
        return Intrinsics.LJFF(this.LIZ, c1856090yOt.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1856090yOt.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1856090yOt.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1856090yOt.LIZLLL) && Intrinsics.LJFF(this.LJ, c1856090yOt.LJ) && Intrinsics.LJFF(this.LJFF, c1856090yOt.LJFF) && Intrinsics.LJFF(this.LJI, c1856090yOt.LJI) && Intrinsics.LJFF(this.LJII, c1856090yOt.LJII);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJ;
        return ((((((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoStatModel(enterAwemeId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", searchId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", panelImprId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", awemeType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", imprId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", modeSource=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1856090yOt(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
    }
}
