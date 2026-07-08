package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendRoomsResp;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RecommendRoomsResp_ProtoDecoder implements C0IMD<RecommendRoomsResp> {
    @Override // X.C0IMD
    public final void LIZ(RecommendRoomsResp recommendRoomsResp) {
        RecommendRoomsResp.ResponseData responseData = recommendRoomsResp.data;
        if (responseData != null) {
            _RecommendRoomsResp_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final RecommendRoomsResp LIZJ(C1516680pZS c1516680pZS) throws IOException {
        RecommendRoomsResp recommendRoomsResp = new RecommendRoomsResp();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    recommendRoomsResp.data = _RecommendRoomsResp_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return recommendRoomsResp;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RecommendRoomsResp recommendRoomsResp, List list) {
    }
}
