package X;

import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gEY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157760gEY {
    public static final /* synthetic */ int LJFF = 0;
    public final RankTypeV2 LIZ;
    public final EnumC1811400xEo LIZIZ;
    public final int LIZJ;
    public final Integer LIZLLL;
    public final long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157760gEY)) {
            return false;
        }
        C1157760gEY c1157760gEY = (C1157760gEY) obj;
        return Intrinsics.LJFF(this.LIZ, c1157760gEY.LIZ) && this.LIZIZ == c1157760gEY.LIZIZ && this.LIZJ == c1157760gEY.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1157760gEY.LIZLLL) && this.LJ == c1157760gEY.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreatorRankingPageContext(rankType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", groupType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", entrySubRankType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", entryFirstRankType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", period=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.type * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31;
        Integer num = this.LIZLLL;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Y2(this.LJ);
    }

    public C1157760gEY(RankTypeV2 rankTypeV2, EnumC1811400xEo enumC1811400xEo, int i, Integer num, long j) {
        this.LIZ = rankTypeV2;
        this.LIZIZ = enumC1811400xEo;
        this.LIZJ = i;
        this.LIZLLL = num;
        this.LJ = j;
    }
}
