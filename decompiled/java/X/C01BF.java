package X;

import com.bytedance.android.live.liveinteract.competition.model.CompetitionContributorInfo;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionResultsTeamInfo;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionUserBase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.01BF, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01BF {
    public static List LIZ(CompetitionResultsTeamInfo competitionResultsTeamInfo) {
        long j;
        ArrayList arrayList = new ArrayList();
        for (CompetitionContributorInfo competitionContributorInfo : competitionResultsTeamInfo.contributors) {
            CompetitionUserBase competitionUserBase = competitionContributorInfo.user;
            if (competitionUserBase != null) {
                j = competitionUserBase.userId;
            } else {
                j = 0;
            }
            arrayList.add(new C01BH(j, competitionContributorInfo.score, competitionContributorInfo.avatar));
        }
        return arrayList;
    }
}
