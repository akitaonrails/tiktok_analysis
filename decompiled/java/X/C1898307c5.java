package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07c5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1898307c5 {
    public final String LIZ;
    public final EnumC1781360wSM LIZIZ;
    public final EnumC1395730mQN LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1898307c5)) {
            return false;
        }
        C1898307c5 c1898307c5 = (C1898307c5) obj;
        return Intrinsics.LJFF(this.LIZ, c1898307c5.LIZ) && this.LIZIZ == c1898307c5.LIZIZ && this.LIZJ == c1898307c5.LIZJ && this.LIZLLL == c1898307c5.LIZLLL;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        EnumC1781360wSM enumC1781360wSM = this.LIZIZ;
        int iHashCode2 = (iHashCode + (enumC1781360wSM == null ? 0 : enumC1781360wSM.hashCode())) * 31;
        EnumC1395730mQN enumC1395730mQN = this.LIZJ;
        return ((iHashCode2 + (enumC1395730mQN != null ? enumC1395730mQN.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RevisitMissionRewardJsbResult(scene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", rewardScene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", rewardChannel=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", canReceiveReward=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1898307c5(String str, EnumC1781360wSM enumC1781360wSM, EnumC1395730mQN enumC1395730mQN, boolean z) {
        this.LIZ = str;
        this.LIZIZ = enumC1781360wSM;
        this.LIZJ = enumC1395730mQN;
        this.LIZLLL = z;
    }
}
