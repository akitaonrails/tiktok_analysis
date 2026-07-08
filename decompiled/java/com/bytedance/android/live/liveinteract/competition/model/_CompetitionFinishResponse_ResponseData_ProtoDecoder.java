package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionFinishResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionFinishResponse_ResponseData_ProtoDecoder implements C0IMD<CompetitionFinishResponse.ResponseData> {
    public static CompetitionFinishResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionFinishResponse.ResponseData responseData = new CompetitionFinishResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    responseData.finishInfo = _CompetitionFinish_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CompetitionFinishResponse.ResponseData responseData) {
        CompetitionUserBase competitionUserBase;
        CompetitionFinish competitionFinish = responseData.finishInfo;
        if (competitionFinish != null && (competitionUserBase = competitionFinish.leaveUser) != null) {
            _CompetitionUserBase_ProtoDecoder.LJ(competitionUserBase);
        }
    }

    @Override // X.C0IMD
    public final CompetitionFinishResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionFinishResponse.ResponseData responseData, List list) {
    }
}
