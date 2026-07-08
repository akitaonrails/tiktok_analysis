package X;

import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.model.RankData;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model.PostRollAdData;

/* JADX INFO: renamed from: X.1CuU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2245361CuU {
    public long LIZ;
    public String LIZIZ = "";
    public PostRollAdData LIZJ;
    public final boolean LIZLLL;

    public final synchronized void LIZIZ() {
        if (this.LIZLLL) {
            this.LIZ = 0L;
            this.LIZIZ = "";
        }
    }

    public C2245361CuU() {
        C293460Beq.LIZ.getClass();
        this.LIZLLL = C293460Beq.LIZIZ() || C293460Beq.LIZ();
    }

    public final synchronized C2245141Cu8 LIZ(EnumC2245291CuN enumC2245291CuN) {
        PostRollAdData postRollAdData;
        if (!this.LIZLLL) {
            return null;
        }
        if (enumC2245291CuN != EnumC2245291CuN.ON_GET_POSTROLL || (postRollAdData = this.LIZJ) == null) {
            return null;
        }
        return new C2245141Cu8(this.LIZ, this.LIZIZ, postRollAdData);
    }

    public final synchronized void LIZJ(PostRollAdData postRollAdData) {
        String aid;
        RankData rankData;
        if (!this.LIZLLL) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[setPostRollData] aid=");
        if (postRollAdData == null || (rankData = postRollAdData.getRankData()) == null) {
            aid = null;
        } else {
            aid = rankData.getAid();
        }
        sbLIZ.append(aid);
        C1022620cia.LIZ("PostRollAdManager", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZJ = postRollAdData;
    }
}
