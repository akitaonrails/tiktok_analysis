package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QdD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C674650QdD {
    public final EnumC674680QdG LIZ;
    public final C674630QdB LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;
    public final String LJ;
    public final Long LJFF;
    public final String LJI;
    public final String LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C674650QdD)) {
            return false;
        }
        C674650QdD c674650QdD = (C674650QdD) obj;
        return this.LIZ == c674650QdD.LIZ && Intrinsics.LJFF(this.LIZIZ, c674650QdD.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c674650QdD.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c674650QdD.LIZLLL) && Intrinsics.LJFF(this.LJ, c674650QdD.LJ) && Intrinsics.LJFF(this.LJFF, c674650QdD.LJFF) && Intrinsics.LJFF(this.LJI, c674650QdD.LJI) && Intrinsics.LJFF(this.LJII, c674650QdD.LJII);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C674630QdB c674630QdB = this.LIZIZ;
        int iHashCode2 = (iHashCode + (c674630QdB == null ? 0 : c674630QdB.hashCode())) * 31;
        String str = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.LJ;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.LJFF;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.LJI;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJII;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcSearchBarAsrEvent(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", voiceContext=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", errorMessage=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", durationMs=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", requestId=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", stopReason=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C674650QdD(EnumC674680QdG enumC674680QdG, C674630QdB c674630QdB) {
        this(enumC674680QdG, c674630QdB, null, null, null, null, null, null);
    }

    public C674650QdD(EnumC674680QdG enumC674680QdG, C674630QdB c674630QdB, String str, Integer num, String str2, Long l, String str3, String str4) {
        this.LIZ = enumC674680QdG;
        this.LIZIZ = c674630QdB;
        this.LIZJ = str;
        this.LIZLLL = num;
        this.LJ = str2;
        this.LJFF = l;
        this.LJI = str3;
        this.LJII = str4;
    }
}
