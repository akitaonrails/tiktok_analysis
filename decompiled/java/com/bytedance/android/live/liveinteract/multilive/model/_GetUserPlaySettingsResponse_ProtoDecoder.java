package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.GetUserPlaySettingsResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GetUserPlaySettingsResponse_ProtoDecoder implements C0IMD<GetUserPlaySettingsResponse> {
    @Override // X.C0IMD
    public final void LIZ(GetUserPlaySettingsResponse getUserPlaySettingsResponse) {
        GetUserPlaySettingsResponse.ResponseData responseData = getUserPlaySettingsResponse.data;
        if (responseData != null) {
            _GetUserPlaySettingsResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final GetUserPlaySettingsResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GetUserPlaySettingsResponse getUserPlaySettingsResponse = new GetUserPlaySettingsResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    getUserPlaySettingsResponse.data = _GetUserPlaySettingsResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return getUserPlaySettingsResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetUserPlaySettingsResponse getUserPlaySettingsResponse, List list) {
    }
}
