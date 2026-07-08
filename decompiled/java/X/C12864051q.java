package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.051q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12864051q {
    public final Boolean LIZ;
    public final Integer LIZIZ;
    public final Integer LIZJ;
    public final Integer LIZLLL;
    public final Integer LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12864051q)) {
            return false;
        }
        C12864051q c12864051q = (C12864051q) obj;
        return Intrinsics.LJFF(this.LIZ, c12864051q.LIZ) && Intrinsics.LJFF(this.LIZIZ, c12864051q.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c12864051q.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c12864051q.LIZLLL) && Intrinsics.LJFF(this.LJ, c12864051q.LJ);
    }

    public final int hashCode() {
        Boolean bool = this.LIZ;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.LIZIZ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.LJ;
        return iHashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PnSDoNotDisturbSettings(pauseNotificationEnabled=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", pauseNotificationStartHour=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", pauseNotificationStartMinute=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", pauseNotificationEndHour=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", pauseNotificationEndMinute=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C12864051q() {
        this(Boolean.FALSE, 0, 0, 0, 0);
    }

    public C12864051q(Boolean bool, Integer num, Integer num2, Integer num3, Integer num4) {
        this.LIZ = bool;
        this.LIZIZ = num;
        this.LIZJ = num2;
        this.LIZLLL = num3;
        this.LJ = num4;
    }
}
