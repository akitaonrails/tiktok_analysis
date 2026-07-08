package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInitiateResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionInitiateResponse_ProtoDecoder implements C0IMD<CompetitionInitiateResponse> {
    @Override // X.C0IMD
    public final void LIZ(CompetitionInitiateResponse competitionInitiateResponse) {
        CompetitionInitiateResponse.ResponseData responseData = competitionInitiateResponse.data;
        if (responseData != null) {
            _CompetitionInitiateResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final CompetitionInitiateResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CompetitionInitiateResponse competitionInitiateResponse = new CompetitionInitiateResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    competitionInitiateResponse.data = _CompetitionInitiateResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return competitionInitiateResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionInitiateResponse competitionInitiateResponse, List list) {
    }
}
