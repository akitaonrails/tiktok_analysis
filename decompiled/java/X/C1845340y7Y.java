package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0y7Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1845340y7Y {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1845340y7Y)) {
            return false;
        }
        C1845340y7Y c1845340y7Y = (C1845340y7Y) obj;
        return Intrinsics.LJFF(this.LIZ, c1845340y7Y.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1845340y7Y.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1845340y7Y.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1845340y7Y.LIZLLL) && Intrinsics.LJFF(this.LJ, c1845340y7Y.LJ) && Intrinsics.LJFF(this.LJFF, c1845340y7Y.LJFF) && Intrinsics.LJFF(this.LJI, c1845340y7Y.LJI) && Intrinsics.LJFF(this.LJII, c1845340y7Y.LJII);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31;
        String str2 = this.LJFF;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJI;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.LJII.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommonParams(enterFrom=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", processId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", takoSessionId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", takoChatId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", messageId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", templateId=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", pageSource=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1845340y7Y(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
        this.LJII = str8;
    }
}
