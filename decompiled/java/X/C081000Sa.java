package X;

import com.bytedance.android.live.liveinteract.competition.model.CompetitionFinish;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSettleEnd;
import com.bytedance.android.livesdk.model.message.CompetitionScoreChange;
import com.bytedance.android.livesdk.model.message.CompetitionStart;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Sa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C081000Sa implements InterfaceC0148002o {
    public final C00SX LL;
    public final CompetitionStart LLILLJJLI;
    public final CompetitionScoreChange LLILLL;
    public final CompetitionSettleEnd LLILZ;
    public final CompetitionFinish LLILZIL;
    public final long LLILZLL;

    public C081000Sa() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C081000Sa)) {
            return false;
        }
        C081000Sa c081000Sa = (C081000Sa) obj;
        return this.LL == c081000Sa.LL && Intrinsics.LJFF(this.LLILLJJLI, c081000Sa.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c081000Sa.LLILLL) && Intrinsics.LJFF(this.LLILZ, c081000Sa.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c081000Sa.LLILZIL) && this.LLILZLL == c081000Sa.LLILZLL;
    }

    public final int hashCode() {
        C00SX c00sx = this.LL;
        int iHashCode = (c00sx == null ? 0 : c00sx.hashCode()) * 31;
        CompetitionStart competitionStart = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (competitionStart == null ? 0 : competitionStart.hashCode())) * 31;
        CompetitionScoreChange competitionScoreChange = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (competitionScoreChange == null ? 0 : competitionScoreChange.hashCode())) * 31;
        CompetitionSettleEnd competitionSettleEnd = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (competitionSettleEnd == null ? 0 : competitionSettleEnd.hashCode())) * 31;
        CompetitionFinish competitionFinish = this.LLILZIL;
        return ((iHashCode4 + (competitionFinish != null ? competitionFinish.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LLILZLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TimeCompetitionState(status=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", start=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", scoreChange=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", settleEnd=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", finish=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", competitionId=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C081000Sa(int i) {
        this(null, null, null, null, null, 0L);
    }

    public C081000Sa(C00SX c00sx, CompetitionStart competitionStart, CompetitionScoreChange competitionScoreChange, CompetitionSettleEnd competitionSettleEnd, CompetitionFinish competitionFinish, long j) {
        this.LL = c00sx;
        this.LLILLJJLI = competitionStart;
        this.LLILLL = competitionScoreChange;
        this.LLILZ = competitionSettleEnd;
        this.LLILZIL = competitionFinish;
        this.LLILZLL = j;
    }

    public static C081000Sa LIZ(C081000Sa c081000Sa, C00SX c00sx, CompetitionStart competitionStart, CompetitionScoreChange competitionScoreChange, CompetitionSettleEnd competitionSettleEnd, long j, int i) {
        CompetitionFinish competitionFinish;
        long j2 = j;
        CompetitionSettleEnd competitionSettleEnd2 = competitionSettleEnd;
        CompetitionScoreChange competitionScoreChange2 = competitionScoreChange;
        CompetitionStart competitionStart2 = competitionStart;
        C00SX c00sx2 = c00sx;
        if ((i & 1) != 0) {
            c00sx2 = c081000Sa.LL;
        }
        if ((i & 2) != 0) {
            competitionStart2 = c081000Sa.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            competitionScoreChange2 = c081000Sa.LLILLL;
        }
        if ((i & 8) != 0) {
            competitionSettleEnd2 = c081000Sa.LLILZ;
        }
        if ((i & 16) != 0) {
            competitionFinish = c081000Sa.LLILZIL;
        } else {
            competitionFinish = null;
        }
        if ((i & 32) != 0) {
            j2 = c081000Sa.LLILZLL;
        }
        c081000Sa.getClass();
        return new C081000Sa(c00sx2, competitionStart2, competitionScoreChange2, competitionSettleEnd2, competitionFinish, j2);
    }
}
