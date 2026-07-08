package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionInfoResponse_ProtoDecoder implements C0IMD<CompetitionInfoResponse> {
    @Override // X.C0IMD
    public final void LIZ(CompetitionInfoResponse competitionInfoResponse) {
        CompetitionInfo competitionInfo = competitionInfoResponse.data;
        if (competitionInfo != null) {
            _CompetitionInfo_ProtoDecoder.LJ(competitionInfo);
        }
    }

    @Override // X.C0IMD
    public final CompetitionInfoResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CompetitionInfoResponse competitionInfoResponse = new CompetitionInfoResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    competitionInfoResponse.data = _CompetitionInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return competitionInfoResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionInfoResponse competitionInfoResponse, List list) {
    }
}
