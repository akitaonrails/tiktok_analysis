package X;

import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XrX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C861890XrX {
    public final RankTypeV2 LIZ;
    public final long LIZIZ;

    public final int hashCode() {
        RankTypeV2 rankTypeV2 = this.LIZ;
        return ((((527 + rankTypeV2.type) * 31) + rankTypeV2.rankPhase) * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RankTypeKey(rankType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", period=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C861890XrX)) {
            return false;
        }
        C861890XrX c861890XrX = (C861890XrX) obj;
        if (Intrinsics.LJFF(this.LIZ, c861890XrX.LIZ) && this.LIZIZ == c861890XrX.LIZIZ) {
            return true;
        }
        return false;
    }

    public C861890XrX(long j, RankTypeV2 rankTypeV2) {
        this.LIZ = rankTypeV2;
        this.LIZIZ = j;
    }
}
