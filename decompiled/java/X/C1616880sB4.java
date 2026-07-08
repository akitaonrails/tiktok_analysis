package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sB4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1616880sB4 {
    public final String LIZ;
    public final EnumC1616780sAu LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public String LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1616880sB4)) {
            return false;
        }
        C1616880sB4 c1616880sB4 = (C1616880sB4) obj;
        return Intrinsics.LJFF(this.LIZ, c1616880sB4.LIZ) && this.LIZIZ == c1616880sB4.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1616880sB4.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1616880sB4.LIZLLL) && Intrinsics.LJFF(this.LJ, c1616880sB4.LJ) && Intrinsics.LJFF(this.LJFF, c1616880sB4.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJ;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJFF;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaywallComponentQuery(scene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bizLine=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", spuId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", creatorId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", priceRegion=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1616880sB4(EnumC1616780sAu enumC1616780sAu, String str, String str2, String str3, int i) {
        str = (i & 4) != 0 ? null : str;
        str2 = (i & 8) != 0 ? null : str2;
        str3 = (i & 32) != 0 ? null : str3;
        this.LIZ = "purchase_panel";
        this.LIZIZ = enumC1616780sAu;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = null;
        this.LJFF = str3;
    }
}
