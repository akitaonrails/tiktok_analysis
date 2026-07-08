package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00IQ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00IQ {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final Boolean LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00IQ)) {
            return false;
        }
        C00IQ c00iq = (C00IQ) obj;
        return Intrinsics.LJFF(this.LIZ, c00iq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c00iq.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c00iq.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c00iq.LIZLLL) && Intrinsics.LJFF(this.LJ, c00iq.LJ) && Intrinsics.LJFF(this.LJFF, c00iq.LJFF) && Intrinsics.LJFF(this.LJI, c00iq.LJI) && Intrinsics.LJFF(this.LJII, c00iq.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c00iq.LJIIIIZZ);
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
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJFF;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJI;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LJII;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.LJIIIIZZ;
        return iHashCode8 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StrategyActionFeedbackEvent(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", strategyName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", group=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", key=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", valueJson=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", eventKey=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", eventJson=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", nativeCallbackEnabled=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00IQ(String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
        this.LJII = str8;
        this.LJIIIIZZ = bool;
    }
}
