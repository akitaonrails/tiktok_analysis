package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownGetUserHistoryResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CountdownGetUserHistoryResponse_ProtoDecoder implements C0IMD<CountdownGetUserHistoryResponse> {
    @Override // X.C0IMD
    public final void LIZ(CountdownGetUserHistoryResponse countdownGetUserHistoryResponse) {
        CountdownGetUserHistoryResponse.ResponseData responseData = countdownGetUserHistoryResponse.data;
        if (responseData != null) {
            _CountdownGetUserHistoryResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final CountdownGetUserHistoryResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CountdownGetUserHistoryResponse countdownGetUserHistoryResponse = new CountdownGetUserHistoryResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    countdownGetUserHistoryResponse.data = _CountdownGetUserHistoryResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return countdownGetUserHistoryResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CountdownGetUserHistoryResponse countdownGetUserHistoryResponse, List list) {
    }
}
