package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vCg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1733200vCg {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final String LJI;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1733200vCg() {
        String str = null;
        this(str, str, 0, str, str, str, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1733200vCg)) {
            return false;
        }
        C1733200vCg c1733200vCg = (C1733200vCg) obj;
        return Intrinsics.LJFF(this.LIZ, c1733200vCg.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1733200vCg.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1733200vCg.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1733200vCg.LIZLLL) && this.LJ == c1733200vCg.LJ && this.LJFF == c1733200vCg.LJFF && Intrinsics.LJFF(this.LJI, c1733200vCg.LJI);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        return ((((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaLiveBillboardTrackParams(scene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", authorId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", actionType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", billboardType=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", billboardId=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1733200vCg(String str, String str2, int i, String str3, String str4, String str5, int i2) {
        int i3;
        int i4 = i;
        String str6 = str3;
        String str7 = str5;
        String str8 = str2;
        String str9 = (i2 & 1) != 0 ? null : str;
        str8 = (i2 & 2) != 0 ? null : str8;
        str6 = (i2 & 4) != 0 ? null : str6;
        String str10 = (i2 & 8) == 0 ? str4 : null;
        if ((i2 & 16) != 0) {
            i3 = -1;
        } else {
            i3 = 0;
        }
        this(str9, i3, (i2 & 32) != 0 ? -1 : i4, str8, str6, str10, (i2 & 64) != 0 ? "" : str7);
    }

    public C1733200vCg(String str, int i, int i2, String str2, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = i;
        this.LJFF = i2;
        this.LJI = str5;
    }
}
