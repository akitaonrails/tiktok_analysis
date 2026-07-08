package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionLeaveResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionLeaveResponse_ProtoDecoder implements C0IMD<CompetitionLeaveResponse> {
    @Override // X.C0IMD
    public final void LIZ(CompetitionLeaveResponse competitionLeaveResponse) {
        CompetitionLeaveResponse.ResponseData responseData = competitionLeaveResponse.data;
        if (responseData != null) {
            _CompetitionLeaveResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final CompetitionLeaveResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CompetitionLeaveResponse competitionLeaveResponse = new CompetitionLeaveResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    competitionLeaveResponse.data = _CompetitionLeaveResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return competitionLeaveResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionLeaveResponse competitionLeaveResponse, List list) {
    }
}
