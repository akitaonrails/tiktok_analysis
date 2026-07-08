package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSettlementStartResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionSettlementStartResponse_ProtoDecoder implements C0IMD<CompetitionSettlementStartResponse> {
    @Override // X.C0IMD
    public final void LIZ(CompetitionSettlementStartResponse competitionSettlementStartResponse) {
        CompetitionSettleStart competitionSettleStart;
        CompetitionUserBase competitionUserBase;
        CompetitionSettlementStartResponse.ResponseData responseData = competitionSettlementStartResponse.data;
        if (responseData != null && (competitionSettleStart = responseData.settleStart) != null && (competitionUserBase = competitionSettleStart.initiator) != null) {
            _CompetitionUserBase_ProtoDecoder.LJ(competitionUserBase);
        }
    }

    @Override // X.C0IMD
    public final CompetitionSettlementStartResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CompetitionSettlementStartResponse competitionSettlementStartResponse = new CompetitionSettlementStartResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    competitionSettlementStartResponse.data = _CompetitionSettlementStartResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return competitionSettlementStartResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionSettlementStartResponse competitionSettlementStartResponse, List list) {
    }
}
