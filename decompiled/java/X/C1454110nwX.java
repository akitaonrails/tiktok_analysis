package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nwX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1454110nwX {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    public C1454110nwX() {
        this(null, null, null, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1454110nwX)) {
            return false;
        }
        C1454110nwX c1454110nwX = (C1454110nwX) obj;
        return Intrinsics.LJFF(this.LIZ, c1454110nwX.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1454110nwX.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1454110nwX.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1454110nwX.LIZLLL) && Intrinsics.LJFF(this.LJ, c1454110nwX.LJ) && Intrinsics.LJFF(this.LJFF, c1454110nwX.LJFF);
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
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJFF;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AICoverTemplateConfirmMobParams(functionType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", coverId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", templateId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", genStatus=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", templateStyle=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1454110nwX(String str, String str2, String str3, String str4, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 16) != 0 ? null : str4;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = null;
        this.LJ = str4;
        this.LJFF = null;
    }
}
