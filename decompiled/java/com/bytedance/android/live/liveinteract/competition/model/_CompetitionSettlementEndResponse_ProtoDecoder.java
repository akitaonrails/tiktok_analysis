package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSettlementEndResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionSettlementEndResponse_ProtoDecoder implements C0IMD<CompetitionSettlementEndResponse> {
    @Override // X.C0IMD
    public final void LIZ(CompetitionSettlementEndResponse competitionSettlementEndResponse) {
        CompetitionSettleEnd competitionSettleEnd;
        CompetitionSettlementEndResponse.ResponseData responseData = competitionSettlementEndResponse.data;
        if (responseData != null && (competitionSettleEnd = responseData.settleEnd) != null) {
            _CompetitionSettleEnd_ProtoDecoder.LJ(competitionSettleEnd);
        }
    }

    @Override // X.C0IMD
    public final CompetitionSettlementEndResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CompetitionSettlementEndResponse competitionSettlementEndResponse = new CompetitionSettlementEndResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    competitionSettlementEndResponse.data = _CompetitionSettlementEndResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return competitionSettlementEndResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionSettlementEndResponse competitionSettlementEndResponse, List list) {
    }
}
