package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mvY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1415060mvY {
    public final String LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final String LIZLLL;
    public final long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1415060mvY)) {
            return false;
        }
        C1415060mvY c1415060mvY = (C1415060mvY) obj;
        return Intrinsics.LJFF(this.LIZ, c1415060mvY.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1415060mvY.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1415060mvY.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1415060mvY.LIZLLL) && this.LJ == c1415060mvY.LJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.LIZLLL;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StageContext(templateId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", musicId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mediaCnt=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", startTimeMs=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1415060mvY(String str, String str2, long j, Integer num, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = num;
        this.LIZLLL = str3;
        this.LJ = j;
    }
}
