package X;

import com.bytedance.android.livesdk.model.message.CompetitionScoreChange;
import com.bytedance.android.livesdk.model.message.CompetitionStart;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.019M, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C019M implements InterfaceC0148002o {
    public final C019Q LL;
    public final CompetitionStart LLILLJJLI;
    public final CompetitionScoreChange LLILLL;
    public final long LLILZ;

    public C019M() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C019M)) {
            return false;
        }
        C019M c019m = (C019M) obj;
        return this.LL == c019m.LL && Intrinsics.LJFF(this.LLILLJJLI, c019m.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c019m.LLILLL) && this.LLILZ == c019m.LLILZ;
    }

    public final int hashCode() {
        C019Q c019q = this.LL;
        int iHashCode = (c019q == null ? 0 : c019q.hashCode()) * 31;
        CompetitionStart competitionStart = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (competitionStart == null ? 0 : competitionStart.hashCode())) * 31;
        CompetitionScoreChange competitionScoreChange = this.LLILLL;
        return ((iHashCode2 + (competitionScoreChange != null ? competitionScoreChange.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IcyClashState(status=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", start=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", scoreChange=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", competitionId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C019M(int i) {
        this(null, null, null, 0L);
    }

    public C019M(C019Q c019q, CompetitionStart competitionStart, CompetitionScoreChange competitionScoreChange, long j) {
        this.LL = c019q;
        this.LLILLJJLI = competitionStart;
        this.LLILLL = competitionScoreChange;
        this.LLILZ = j;
    }

    public static C019M LIZ(C019M c019m, C019Q c019q, CompetitionStart competitionStart, CompetitionScoreChange competitionScoreChange, long j, int i) {
        long j2 = j;
        CompetitionScoreChange competitionScoreChange2 = competitionScoreChange;
        CompetitionStart competitionStart2 = competitionStart;
        C019Q c019q2 = c019q;
        if ((i & 1) != 0) {
            c019q2 = c019m.LL;
        }
        if ((i & 2) != 0) {
            competitionStart2 = c019m.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            competitionScoreChange2 = c019m.LLILLL;
        }
        if ((i & 8) != 0) {
            j2 = c019m.LLILZ;
        }
        c019m.getClass();
        return new C019M(c019q2, competitionStart2, competitionScoreChange2, j2);
    }
}
