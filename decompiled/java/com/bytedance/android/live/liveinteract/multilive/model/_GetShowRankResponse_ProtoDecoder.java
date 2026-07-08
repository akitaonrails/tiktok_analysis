package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowRankResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GetShowRankResponse_ProtoDecoder implements C0IMD<GetShowRankResponse> {
    @Override // X.C0IMD
    public final void LIZ(GetShowRankResponse getShowRankResponse) {
        GetShowRankResponse.ResponseData responseData = getShowRankResponse.data;
        if (responseData != null) {
            _GetShowRankResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final GetShowRankResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GetShowRankResponse getShowRankResponse = new GetShowRankResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    getShowRankResponse.data = _GetShowRankResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return getShowRankResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetShowRankResponse getShowRankResponse, List list) {
    }
}
