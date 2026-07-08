package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03v5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C996903v5 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C996903v5)) {
            return false;
        }
        C996903v5 c996903v5 = (C996903v5) obj;
        return Intrinsics.LJFF(this.LIZ, c996903v5.LIZ) && Intrinsics.LJFF(this.LIZIZ, c996903v5.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c996903v5.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c996903v5.LIZLLL) && Intrinsics.LJFF(this.LJ, c996903v5.LJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJ;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SupportTryOnPropItem(skuId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", propId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", propName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", propValueId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", propValue=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C996903v5(String str, String str2, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
    }
}
