package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionReplyResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionReplyResponse_ProtoDecoder implements C0IMD<CompetitionReplyResponse> {
    @Override // X.C0IMD
    public final void LIZ(CompetitionReplyResponse competitionReplyResponse) {
        CompetitionReplyResponse.ResponseData responseData = competitionReplyResponse.data;
        if (responseData != null) {
            _CompetitionReplyResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final CompetitionReplyResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CompetitionReplyResponse competitionReplyResponse = new CompetitionReplyResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    competitionReplyResponse.data = _CompetitionReplyResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return competitionReplyResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionReplyResponse competitionReplyResponse, List list) {
    }
}
