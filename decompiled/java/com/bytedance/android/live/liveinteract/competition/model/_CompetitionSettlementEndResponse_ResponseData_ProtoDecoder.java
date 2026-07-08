package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSettlementEndResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionSettlementEndResponse_ResponseData_ProtoDecoder implements C0IMD<CompetitionSettlementEndResponse.ResponseData> {
    public static CompetitionSettlementEndResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionSettlementEndResponse.ResponseData responseData = new CompetitionSettlementEndResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        responseData.settleEnd = _CompetitionSettleEnd_ProtoDecoder.LIZLLL(c1516680pZS);
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

    @Override // X.C0IMD
    public final void LIZ(CompetitionSettlementEndResponse.ResponseData responseData) {
        CompetitionSettleEnd competitionSettleEnd = responseData.settleEnd;
        if (competitionSettleEnd != null) {
            _CompetitionSettleEnd_ProtoDecoder.LJ(competitionSettleEnd);
        }
    }

    @Override // X.C0IMD
    public final CompetitionSettlementEndResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionSettlementEndResponse.ResponseData responseData, List list) {
    }
}
