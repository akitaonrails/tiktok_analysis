package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0akR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C946890akR {
    public final String LIZ;
    public final String LJFF;
    public final String LJIIIZ;
    public final String LIZIZ = null;
    public final String LIZJ = null;
    public final String LIZLLL = null;
    public final String LJ = null;
    public final String LJI = null;
    public final String LJII = null;
    public final String LJIIIIZZ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C946890akR)) {
            return false;
        }
        C946890akR c946890akR = (C946890akR) obj;
        return Intrinsics.LJFF(this.LIZ, c946890akR.LIZ) && Intrinsics.LJFF(this.LIZIZ, c946890akR.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c946890akR.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c946890akR.LIZLLL) && Intrinsics.LJFF(this.LJ, c946890akR.LJ) && Intrinsics.LJFF(this.LJFF, c946890akR.LJFF) && Intrinsics.LJFF(this.LJI, c946890akR.LJI) && Intrinsics.LJFF(this.LJII, c946890akR.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c946890akR.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c946890akR.LJIIIZ);
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
        int iHashCode5 = (((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.LJFF.hashCode()) * 31;
        String str5 = this.LJI;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJII;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LJIIIIZZ;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LJIIIZ;
        return iHashCode8 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpenPickSongPageParams(gameStage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isGuestConnection=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", guestCnt=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", layoutId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", panelLayoutType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", channelId=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", gameSessionId=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", songId=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", entryType=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C946890akR(String str, String str2, String str3) {
        this.LIZ = str;
        this.LJFF = str2;
        this.LJIIIZ = str3;
    }
}
