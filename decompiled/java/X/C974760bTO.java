package X;

import com.bytedance.android.live.liveinteract.competition.model.CompetitionResultsTeamInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bTO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C974760bTO extends AbstractC982800bgM {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final int LJFF;
    public final long LJI;
    public final long LJII;
    public final List<CompetitionResultsTeamInfo> LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C974760bTO)) {
            return false;
        }
        C974760bTO c974760bTO = (C974760bTO) obj;
        return this.LJFF == c974760bTO.LJFF && this.LJI == c974760bTO.LJI && this.LJII == c974760bTO.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c974760bTO.LJIIIIZZ);
    }

    public final int hashCode() {
        return (((((this.LJFF * 31) + C786410Ut5.Y2(this.LJI)) * 31) + C786410Ut5.Y2(this.LJII)) * 31) + this.LJIIIIZZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompetitionContributorData(battleType=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", channelId=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", competitionId=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", teamInfos=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C974760bTO(C974750bTN c974750bTN) {
        int i = c974750bTN.LJFF;
        long j = c974750bTN.LJI;
        long j2 = c974750bTN.LJII;
        List<CompetitionResultsTeamInfo> list = c974750bTN.LJIIIIZZ;
        this.LJFF = i;
        this.LJI = j;
        this.LJII = j2;
        this.LJIIIIZZ = list;
    }
}
