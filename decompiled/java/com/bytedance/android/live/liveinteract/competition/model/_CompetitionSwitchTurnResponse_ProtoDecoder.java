package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSwitchTurn;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSwitchTurnResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionSwitchTurnResponse_ProtoDecoder implements C0IMD<CompetitionSwitchTurnResponse> {
    @Override // X.C0IMD
    public final void LIZ(CompetitionSwitchTurnResponse competitionSwitchTurnResponse) {
        CompetitionSwitchTurn competitionSwitchTurn;
        CompetitionSwitchTurn.TakeTheStageBiz takeTheStageBiz;
        TakeTheStageOrderInfo takeTheStageOrderInfo;
        CompetitionSwitchTurnResponse.ResponseData responseData = competitionSwitchTurnResponse.data;
        if (responseData != null && (competitionSwitchTurn = responseData.switchTurnInfo) != null && (takeTheStageBiz = competitionSwitchTurn.takeTheStageBiz) != null && (takeTheStageOrderInfo = takeTheStageBiz.orderInfo) != null) {
            _TakeTheStageOrderInfo_ProtoDecoder.LJ(takeTheStageOrderInfo);
        }
    }

    @Override // X.C0IMD
    public final CompetitionSwitchTurnResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CompetitionSwitchTurnResponse competitionSwitchTurnResponse = new CompetitionSwitchTurnResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    competitionSwitchTurnResponse.data = _CompetitionSwitchTurnResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return competitionSwitchTurnResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionSwitchTurnResponse competitionSwitchTurnResponse, List list) {
    }
}
