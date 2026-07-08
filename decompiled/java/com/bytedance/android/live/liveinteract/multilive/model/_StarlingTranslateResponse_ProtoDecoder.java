package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.StarlingTranslateResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _StarlingTranslateResponse_ProtoDecoder implements C0IMD<StarlingTranslateResponse> {
    @Override // X.C0IMD
    public final void LIZ(StarlingTranslateResponse starlingTranslateResponse) {
        StarlingTranslateResponse.ResponseData responseData = starlingTranslateResponse.data;
        if (responseData != null) {
            _StarlingTranslateResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final StarlingTranslateResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        StarlingTranslateResponse starlingTranslateResponse = new StarlingTranslateResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    starlingTranslateResponse.data = _StarlingTranslateResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return starlingTranslateResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, StarlingTranslateResponse starlingTranslateResponse, List list) {
    }
}
