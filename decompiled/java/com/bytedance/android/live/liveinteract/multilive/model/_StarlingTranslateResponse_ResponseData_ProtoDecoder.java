package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.StarlingTranslateResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _StarlingTranslateResponse_ResponseData_ProtoDecoder implements C0IMD<StarlingTranslateResponse.ResponseData> {
    public static StarlingTranslateResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        StarlingTranslateResponse.ResponseData responseData = new StarlingTranslateResponse.ResponseData();
        responseData.starlingTranslateInfo = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    responseData.starlingTranslateInfo.add(_StarlingTranslateInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    public static void LJ(StarlingTranslateResponse.ResponseData responseData) {
        List<StarlingTranslateInfo> list = responseData.starlingTranslateInfo;
        if (list == null) {
            responseData.starlingTranslateInfo = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (StarlingTranslateInfo starlingTranslateInfo : responseData.starlingTranslateInfo) {
            if (starlingTranslateInfo != null) {
                _StarlingTranslateInfo_ProtoDecoder.LJ(starlingTranslateInfo);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(StarlingTranslateResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final StarlingTranslateResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, StarlingTranslateResponse.ResponseData responseData, List list) {
    }
}
