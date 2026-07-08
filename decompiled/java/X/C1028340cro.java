package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1028340cro {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1028340cro() {
        String str = null;
        this(str, str, str, str, str, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1028340cro)) {
            return false;
        }
        C1028340cro c1028340cro = (C1028340cro) obj;
        return Intrinsics.LJFF(this.LIZ, c1028340cro.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1028340cro.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1028340cro.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1028340cro.LIZLLL) && Intrinsics.LJFF(this.LJ, c1028340cro.LJ) && Intrinsics.LJFF(this.LJFF, c1028340cro.LJFF);
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
        sbLIZ.append("LandingPageSurveyContextData(enterFrom=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", aId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", reqId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", logExtra=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", refer=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1028340cro(String str, String str2, String str3, String str4, String str5, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (String) null);
    }

    public C1028340cro(String str, String str2, String str3, String str4, String str5, String str6) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
    }
}
