package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07bh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1895907bh {
    public final boolean LIZ;
    public final String LIZIZ;

    public /* synthetic */ C1895907bh() {
        this(false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1895907bh)) {
            return false;
        }
        C1895907bh c1895907bh = (C1895907bh) obj;
        return this.LIZ == c1895907bh.LIZ && Intrinsics.LJFF(this.LIZIZ, c1895907bh.LIZIZ);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        String str = this.LIZIZ;
        return iZ2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RevisitMissionRewardGrantResult(didGrantReward=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", rewardText=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1895907bh(boolean z, String str) {
        this.LIZ = z;
        this.LIZIZ = str;
    }
}
