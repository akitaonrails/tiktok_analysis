package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionResultsTeamInfo_ProtoDecoder implements C0IMD<CompetitionResultsTeamInfo> {
    public static CompetitionResultsTeamInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionResultsTeamInfo competitionResultsTeamInfo = new CompetitionResultsTeamInfo();
        competitionResultsTeamInfo.members = new ArrayList();
        competitionResultsTeamInfo.contributors = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        competitionResultsTeamInfo.teamId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        competitionResultsTeamInfo.rank = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        competitionResultsTeamInfo.score = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        competitionResultsTeamInfo.result = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        competitionResultsTeamInfo.contributors.add(_CompetitionContributorInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 6:
                        competitionResultsTeamInfo.members.add(_CompetitionTeamMemberInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 7:
                        competitionResultsTeamInfo.teamIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        competitionResultsTeamInfo.selfContributor = _CompetitionContributorInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        competitionResultsTeamInfo.formattedScore = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return competitionResultsTeamInfo;
            }
        }
    }

    public static void LJ(CompetitionResultsTeamInfo competitionResultsTeamInfo) {
        CompetitionUserBase competitionUserBase;
        List<CompetitionContributorInfo> list = competitionResultsTeamInfo.contributors;
        if (list == null) {
            competitionResultsTeamInfo.contributors = new ArrayList();
        } else if (!list.isEmpty()) {
            for (CompetitionContributorInfo competitionContributorInfo : competitionResultsTeamInfo.contributors) {
                if (competitionContributorInfo != null) {
                    _CompetitionContributorInfo_ProtoDecoder.LJ(competitionContributorInfo);
                }
            }
        }
        List<CompetitionTeamMemberInfo> list2 = competitionResultsTeamInfo.members;
        if (list2 == null) {
            competitionResultsTeamInfo.members = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (CompetitionTeamMemberInfo competitionTeamMemberInfo : competitionResultsTeamInfo.members) {
                if (competitionTeamMemberInfo != null && (competitionUserBase = competitionTeamMemberInfo.user) != null) {
                    _CompetitionUserBase_ProtoDecoder.LJ(competitionUserBase);
                }
            }
        }
        CompetitionContributorInfo competitionContributorInfo2 = competitionResultsTeamInfo.selfContributor;
        if (competitionContributorInfo2 != null) {
            _CompetitionContributorInfo_ProtoDecoder.LJ(competitionContributorInfo2);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CompetitionResultsTeamInfo competitionResultsTeamInfo) {
        LJ(competitionResultsTeamInfo);
    }

    @Override // X.C0IMD
    public final CompetitionResultsTeamInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionResultsTeamInfo competitionResultsTeamInfo, List list) {
    }
}
