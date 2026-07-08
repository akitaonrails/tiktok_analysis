package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInitiateResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionInitiateResponse_ResponseData_ProtoDecoder implements C0IMD<CompetitionInitiateResponse.ResponseData> {
    public static CompetitionInitiateResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionInitiateResponse.ResponseData responseData = new CompetitionInitiateResponse.ResponseData();
        responseData.teams = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        responseData.bizCommon = _CompetitionCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        responseData.inviterGiftPermissionType = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        responseData.teams.add(_CompetitionTeamBase_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 4:
                        responseData.endTimestampSec = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        responseData.actualEndTimestampSec = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        responseData.actualTakeTheStageVersion = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        responseData.gameplayOption = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    public static void LJ(CompetitionInitiateResponse.ResponseData responseData) {
        List<CompetitionTeamBase> list = responseData.teams;
        if (list == null) {
            responseData.teams = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (CompetitionTeamBase competitionTeamBase : responseData.teams) {
            if (competitionTeamBase != null) {
                _CompetitionTeamBase_ProtoDecoder.LJ(competitionTeamBase);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CompetitionInitiateResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final CompetitionInitiateResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionInitiateResponse.ResponseData responseData, List list) {
    }
}
