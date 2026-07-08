package com.bytedance.android.live.liveinteract.competition.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionContributorListResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionContributorListResponse_ProtoDecoder implements C0IMD<CompetitionContributorListResponse> {
    @Override // X.C0IMD
    public final void LIZ(CompetitionContributorListResponse competitionContributorListResponse) {
        CompetitionContributorListResponse.ResponseData responseData = competitionContributorListResponse.data;
        if (responseData != null) {
            _CompetitionContributorListResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final CompetitionContributorListResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CompetitionContributorListResponse competitionContributorListResponse = new CompetitionContributorListResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    competitionContributorListResponse.data = _CompetitionContributorListResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return competitionContributorListResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionContributorListResponse competitionContributorListResponse, List list) {
    }
}
