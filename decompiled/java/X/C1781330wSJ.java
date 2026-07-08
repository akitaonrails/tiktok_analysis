package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wSJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781330wSJ {
    public final EnumC1781360wSM LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1781330wSJ)) {
            return false;
        }
        C1781330wSJ c1781330wSJ = (C1781330wSJ) obj;
        return this.LIZ == c1781330wSJ.LIZ && Intrinsics.LJFF(this.LIZIZ, c1781330wSJ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1781330wSJ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1781330wSJ.LIZLLL) && Intrinsics.LJFF(this.LJ, c1781330wSJ.LJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.LJ;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisRevisitRewardInfo(rewardScene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", iconUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", name=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", amountText=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", configVersion=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1781330wSJ(EnumC1781360wSM enumC1781360wSM, String str, String str2, String str3, Long l) {
        this.LIZ = enumC1781360wSM;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = l;
    }
}
