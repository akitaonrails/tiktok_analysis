package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IPs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C466140IPs {
    public final EnumC466180IPw LIZ;
    public final int LIZIZ;
    public final Integer LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C466140IPs)) {
            return false;
        }
        C466140IPs c466140IPs = (C466140IPs) obj;
        return this.LIZ == c466140IPs.LIZ && this.LIZIZ == c466140IPs.LIZIZ && Intrinsics.LJFF(this.LIZJ, c466140IPs.LIZJ) && this.LIZLLL == c466140IPs.LIZLLL;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31;
        Integer num = this.LIZJ;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveCenterStatusIssueRecord(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", issueTimeMs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C466140IPs(EnumC466180IPw enumC466180IPw, int i, Integer num, long j) {
        this.LIZ = enumC466180IPw;
        this.LIZIZ = i;
        this.LIZJ = num;
        this.LIZLLL = j;
    }
}
