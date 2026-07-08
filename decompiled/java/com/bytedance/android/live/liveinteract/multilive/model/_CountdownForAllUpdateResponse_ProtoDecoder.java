package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownForAllUpdateResponse;
import java.io.IOException;
import java.util.List;
import webcast.data.multi_guest_play.CountdownForAllContent;
import webcast.data.multi_guest_play._CountdownForAllContent_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _CountdownForAllUpdateResponse_ProtoDecoder implements C0IMD<CountdownForAllUpdateResponse> {
    @Override // X.C0IMD
    public final void LIZ(CountdownForAllUpdateResponse countdownForAllUpdateResponse) {
        CountdownForAllContent countdownForAllContent;
        CountdownForAllUpdateResponse.ResponseData responseData = countdownForAllUpdateResponse.data;
        if (responseData != null && (countdownForAllContent = responseData.playContent) != null) {
            _CountdownForAllContent_ProtoDecoder.LJ(countdownForAllContent);
        }
    }

    @Override // X.C0IMD
    public final CountdownForAllUpdateResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CountdownForAllUpdateResponse countdownForAllUpdateResponse = new CountdownForAllUpdateResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    countdownForAllUpdateResponse.data = _CountdownForAllUpdateResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return countdownForAllUpdateResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CountdownForAllUpdateResponse countdownForAllUpdateResponse, List list) {
    }
}
