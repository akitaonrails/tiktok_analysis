package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hY1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1208270hY1 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final C1210150hb3 LJ;
    public final C1210150hb3 LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1208270hY1)) {
            return false;
        }
        C1208270hY1 c1208270hY1 = (C1208270hY1) obj;
        return Intrinsics.LJFF(this.LIZ, c1208270hY1.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1208270hY1.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1208270hY1.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1208270hY1.LIZLLL) && Intrinsics.LJFF(this.LJ, c1208270hY1.LJ) && Intrinsics.LJFF(this.LJFF, c1208270hY1.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LJ.hashCode()) * 31;
        C1210150hb3 c1210150hb3 = this.LJFF;
        return iHashCode3 + (c1210150hb3 != null ? c1210150hb3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConversionConfig(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", styledContent=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", dialogName=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", key1=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", key2=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1208270hY1(String str, String str2, String str3, String str4, C1210150hb3 c1210150hb3, C1210150hb3 c1210150hb32) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = c1210150hb3;
        this.LJFF = c1210150hb32;
    }
}
