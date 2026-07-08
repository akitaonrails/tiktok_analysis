package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.FollowGuideResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FollowGuideResponse_ProtoDecoder implements C0IMD<FollowGuideResponse> {
    @Override // X.C0IMD
    public final void LIZ(FollowGuideResponse followGuideResponse) {
        FollowGuideResponse.ResponseData responseData = followGuideResponse.data;
        if (responseData != null && responseData.displayList == null) {
            responseData.displayList = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final FollowGuideResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        FollowGuideResponse followGuideResponse = new FollowGuideResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        followGuideResponse.extra = _FollowGuideResponse_Extra_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    followGuideResponse.data = _FollowGuideResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return followGuideResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FollowGuideResponse followGuideResponse, List list) {
    }
}
