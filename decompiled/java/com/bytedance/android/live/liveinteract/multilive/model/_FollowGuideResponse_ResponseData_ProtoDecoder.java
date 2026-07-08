package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.FollowGuideResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FollowGuideResponse_ResponseData_ProtoDecoder implements C0IMD<FollowGuideResponse.ResponseData> {
    public static FollowGuideResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FollowGuideResponse.ResponseData responseData = new FollowGuideResponse.ResponseData();
        responseData.displayList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        responseData.displayList.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                    }
                } else {
                    responseData.isDisplay = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(FollowGuideResponse.ResponseData responseData) {
        FollowGuideResponse.ResponseData responseData2 = responseData;
        if (responseData2.displayList == null) {
            responseData2.displayList = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final FollowGuideResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FollowGuideResponse.ResponseData responseData, List list) {
    }
}
