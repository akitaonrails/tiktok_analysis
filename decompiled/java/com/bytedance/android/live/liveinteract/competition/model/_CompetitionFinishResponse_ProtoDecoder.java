package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionFinishResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionFinishResponse_ProtoDecoder implements C0IMD<CompetitionFinishResponse> {
    @Override // X.C0IMD
    public final void LIZ(CompetitionFinishResponse competitionFinishResponse) {
        CompetitionFinish competitionFinish;
        CompetitionUserBase competitionUserBase;
        CompetitionFinishResponse.ResponseData responseData = competitionFinishResponse.data;
        if (responseData != null && (competitionFinish = responseData.finishInfo) != null && (competitionUserBase = competitionFinish.leaveUser) != null) {
            _CompetitionUserBase_ProtoDecoder.LJ(competitionUserBase);
        }
    }

    @Override // X.C0IMD
    public final CompetitionFinishResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CompetitionFinishResponse competitionFinishResponse = new CompetitionFinishResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    competitionFinishResponse.data = _CompetitionFinishResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return competitionFinishResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionFinishResponse competitionFinishResponse, List list) {
    }
}
