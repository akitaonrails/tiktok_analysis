package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookCreateInfoResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PlaybookCreateInfoResponse_ResponseData_ProtoDecoder implements C0IMD<PlaybookCreateInfoResponse.ResponseData> {
    @Override // X.C0IMD
    public final PlaybookCreateInfoResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        PlaybookCreateInfoResponse.ResponseData responseData = new PlaybookCreateInfoResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    responseData.alertAiGenPlaybookTips = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PlaybookCreateInfoResponse.ResponseData responseData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PlaybookCreateInfoResponse.ResponseData responseData, List list) {
    }
}
