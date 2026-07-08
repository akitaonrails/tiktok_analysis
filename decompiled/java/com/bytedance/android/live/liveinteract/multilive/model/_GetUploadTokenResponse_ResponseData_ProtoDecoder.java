package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.GetUploadTokenResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class _GetUploadTokenResponse_ResponseData_ProtoDecoder implements C0IMD<GetUploadTokenResponse.ResponseData> {
    @Override // X.C0IMD
    public final GetUploadTokenResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GetUploadTokenResponse.ResponseData responseData = new GetUploadTokenResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        responseData.scene = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        responseData.accessKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        responseData.secretKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        responseData.sessionToken = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        responseData.serviceId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        responseData.uploadDomain = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        responseData.expiredTime = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        responseData.currentTime = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GetUploadTokenResponse.ResponseData responseData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetUploadTokenResponse.ResponseData responseData, List list) {
    }
}
