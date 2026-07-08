package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.GetUploadAuthResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class _GetUploadAuthResponse_ResponseData_ProtoDecoder implements C0IMD<GetUploadAuthResponse.ResponseData> {
    public static GetUploadAuthResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GetUploadAuthResponse.ResponseData responseData = new GetUploadAuthResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        responseData.accessKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        responseData.secretKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        responseData.sessionToken = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        responseData.serviceId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        responseData.uploadDomain = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        responseData.expiredTime = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
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
    public final GetUploadAuthResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GetUploadAuthResponse.ResponseData responseData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetUploadAuthResponse.ResponseData responseData, List list) {
    }
}
