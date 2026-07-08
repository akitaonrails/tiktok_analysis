package X;

import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wYq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1785380wYq {
    public final C1785500wZ2 LIZ;
    public final C1555950qan LIZIZ;
    public final C1777390wLx LIZJ;
    public final RankListV2Response.RankView LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1785380wYq)) {
            return false;
        }
        C1785380wYq c1785380wYq = (C1785380wYq) obj;
        return Intrinsics.LJFF(this.LIZ, c1785380wYq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1785380wYq.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1785380wYq.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1785380wYq.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        RankListV2Response.RankView rankView = this.LIZLLL;
        return iHashCode + (rankView == null ? 0 : rankView.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreatorRankingPageData(meta=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bottomBar=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", rawRankView=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1785380wYq(C1785500wZ2 c1785500wZ2, C1555950qan c1555950qan, C1777390wLx c1777390wLx, RankListV2Response.RankView rankView) {
        this.LIZ = c1785500wZ2;
        this.LIZIZ = c1555950qan;
        this.LIZJ = c1777390wLx;
        this.LIZLLL = rankView;
    }
}
