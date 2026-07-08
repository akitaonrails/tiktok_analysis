package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownStartResponse;
import java.io.IOException;
import java.util.List;
import webcast.data.multi_guest_play._CountdownContent_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _CountdownStartResponse_ResponseData_ProtoDecoder implements C0IMD<CountdownStartResponse.ResponseData> {
    public static CountdownStartResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CountdownStartResponse.ResponseData responseData = new CountdownStartResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        responseData.countdownContent = _CountdownContent_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    responseData.countdownExists = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CountdownStartResponse.ResponseData responseData) {
    }

    @Override // X.C0IMD
    public final CountdownStartResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CountdownStartResponse.ResponseData responseData, List list) {
    }
}
