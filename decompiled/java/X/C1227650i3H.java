package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i3H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227650i3H {
    public final int LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public final C0ZBV LJ;
    public final Integer LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1227650i3H)) {
            return false;
        }
        C1227650i3H c1227650i3H = (C1227650i3H) obj;
        return this.LIZ == c1227650i3H.LIZ && this.LIZIZ == c1227650i3H.LIZIZ && this.LIZJ == c1227650i3H.LIZJ && this.LIZLLL == c1227650i3H.LIZLLL && this.LJ == c1227650i3H.LJ && Intrinsics.LJFF(this.LJFF, c1227650i3H.LJFF) && Intrinsics.LJFF(this.LJI, c1227650i3H.LJI);
    }

    public final int hashCode() {
        int iY2 = ((((((((this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode()) * 31;
        Integer num = this.LJFF;
        return ((iY2 + (num == null ? 0 : num.hashCode())) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddMemberResultParams(memberNum=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", networkDuration=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", processDuration=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", successMemberNum=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", resultStatus=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", memberType=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1227650i3H(C0ZBV c0zbv, Integer num) {
        this(0, 0L, 0L, -1, c0zbv, num, "");
    }

    public C1227650i3H(int i, long j, long j2, int i2, C0ZBV c0zbv, Integer num, String str) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = i2;
        this.LJ = c0zbv;
        this.LJFF = num;
        this.LJI = str;
    }
}
