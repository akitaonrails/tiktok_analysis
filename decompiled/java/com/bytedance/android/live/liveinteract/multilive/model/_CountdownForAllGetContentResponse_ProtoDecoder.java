package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownForAllGetContentResponse;
import java.io.IOException;
import java.util.List;
import webcast.data.multi_guest_play.CountdownForAllContent;
import webcast.data.multi_guest_play._CountdownForAllContent_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _CountdownForAllGetContentResponse_ProtoDecoder implements C0IMD<CountdownForAllGetContentResponse> {
    @Override // X.C0IMD
    public final void LIZ(CountdownForAllGetContentResponse countdownForAllGetContentResponse) {
        CountdownForAllContent countdownForAllContent;
        CountdownForAllGetContentResponse.ResponseData responseData = countdownForAllGetContentResponse.data;
        if (responseData != null && (countdownForAllContent = responseData.playContent) != null) {
            _CountdownForAllContent_ProtoDecoder.LJ(countdownForAllContent);
        }
    }

    @Override // X.C0IMD
    public final CountdownForAllGetContentResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CountdownForAllGetContentResponse countdownForAllGetContentResponse = new CountdownForAllGetContentResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    countdownForAllGetContentResponse.data = _CountdownForAllGetContentResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return countdownForAllGetContentResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CountdownForAllGetContentResponse countdownForAllGetContentResponse, List list) {
    }
}
