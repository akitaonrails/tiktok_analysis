package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownForAllStartResponse;
import java.io.IOException;
import java.util.List;
import webcast.data.multi_guest_play.CountdownForAllContent;
import webcast.data.multi_guest_play._CountdownForAllContent_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _CountdownForAllStartResponse_ResponseData_ProtoDecoder implements C0IMD<CountdownForAllStartResponse.ResponseData> {
    public static CountdownForAllStartResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CountdownForAllStartResponse.ResponseData responseData = new CountdownForAllStartResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        responseData.playContent = _CountdownForAllContent_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    responseData.isExists = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CountdownForAllStartResponse.ResponseData responseData) {
        CountdownForAllContent countdownForAllContent = responseData.playContent;
        if (countdownForAllContent != null) {
            _CountdownForAllContent_ProtoDecoder.LJ(countdownForAllContent);
        }
    }

    @Override // X.C0IMD
    public final CountdownForAllStartResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CountdownForAllStartResponse.ResponseData responseData, List list) {
    }
}
