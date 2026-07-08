package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.social.model.AwemeInfoReponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AwemeInfoReponse_ResponseData_ProtoDecoder implements C0IMD<AwemeInfoReponse.ResponseData> {
    @Override // X.C0IMD
    public final void LIZ(AwemeInfoReponse.ResponseData responseData) {
        AwemeInfoReponse.AwemeInfo awemeInfo = responseData.awemeInfo;
        if (awemeInfo != null) {
            _AwemeInfoReponse_AwemeInfo_ProtoDecoder.LJ(awemeInfo);
        }
    }

    @Override // X.C0IMD
    public final AwemeInfoReponse.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        AwemeInfoReponse.ResponseData responseData = new AwemeInfoReponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    responseData.awemeInfo = _AwemeInfoReponse_AwemeInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AwemeInfoReponse.ResponseData responseData, List list) {
    }
}
