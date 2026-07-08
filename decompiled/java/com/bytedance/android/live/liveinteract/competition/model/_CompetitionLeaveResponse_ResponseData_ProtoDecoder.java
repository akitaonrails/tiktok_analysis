package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionLeaveResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionLeaveResponse_ResponseData_ProtoDecoder implements C0IMD<CompetitionLeaveResponse.ResponseData> {
    public static CompetitionLeaveResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionLeaveResponse.ResponseData responseData = new CompetitionLeaveResponse.ResponseData();
        responseData.teamInfos = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        responseData.teamInfos.add(_CompetitionResultsTeamInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    responseData.bizCommon = _CompetitionCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    public static void LJ(CompetitionLeaveResponse.ResponseData responseData) {
        List<CompetitionResultsTeamInfo> list = responseData.teamInfos;
        if (list == null) {
            responseData.teamInfos = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (CompetitionResultsTeamInfo competitionResultsTeamInfo : responseData.teamInfos) {
            if (competitionResultsTeamInfo != null) {
                _CompetitionResultsTeamInfo_ProtoDecoder.LJ(competitionResultsTeamInfo);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CompetitionLeaveResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final CompetitionLeaveResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionLeaveResponse.ResponseData responseData, List list) {
    }
}
