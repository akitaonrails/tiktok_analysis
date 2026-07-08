package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSettlementStartResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionSettlementStartResponse_ResponseData_ProtoDecoder implements C0IMD<CompetitionSettlementStartResponse.ResponseData> {
    public static CompetitionSettlementStartResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionSettlementStartResponse.ResponseData responseData = new CompetitionSettlementStartResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        responseData.settleStart = _CompetitionSettleStart_ProtoDecoder.LIZLLL(c1516680pZS);
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
    public final void LIZ(CompetitionSettlementStartResponse.ResponseData responseData) {
        CompetitionUserBase competitionUserBase;
        CompetitionSettleStart competitionSettleStart = responseData.settleStart;
        if (competitionSettleStart != null && (competitionUserBase = competitionSettleStart.initiator) != null) {
            _CompetitionUserBase_ProtoDecoder.LJ(competitionUserBase);
        }
    }

    @Override // X.C0IMD
    public final CompetitionSettlementStartResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionSettlementStartResponse.ResponseData responseData, List list) {
    }
}
