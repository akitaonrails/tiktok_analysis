package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07c2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1898007c2 {
    public final boolean LIZ;
    public final String LIZIZ;
    public final EnumC1781360wSM LIZJ;
    public final int LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1898007c2)) {
            return false;
        }
        C1898007c2 c1898007c2 = (C1898007c2) obj;
        return this.LIZ == c1898007c2.LIZ && Intrinsics.LJFF(this.LIZIZ, c1898007c2.LIZIZ) && this.LIZJ == c1898007c2.LIZJ && this.LIZLLL == c1898007c2.LIZLLL && Intrinsics.LJFF(this.LJ, c1898007c2.LJ);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        String str = this.LIZIZ;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        EnumC1781360wSM enumC1781360wSM = this.LIZJ;
        int iHashCode2 = (((iHashCode + (enumC1781360wSM == null ? 0 : enumC1781360wSM.hashCode())) * 31) + this.LIZLLL) * 31;
        String str2 = this.LJ;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisRevisitRewardResult(canReceiveReward=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", rewardScene=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1898007c2(boolean z, String str, EnumC1781360wSM enumC1781360wSM, int i) {
        str = (i & 2) != 0 ? null : str;
        enumC1781360wSM = (i & 4) != 0 ? null : enumC1781360wSM;
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = enumC1781360wSM;
        this.LIZLLL = 0;
        this.LJ = null;
    }
}
