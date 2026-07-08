package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendRoomsResp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RecommendRoomsResp_ResponseData_ProtoDecoder implements C0IMD<RecommendRoomsResp.ResponseData> {
    public static RecommendRoomsResp.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RecommendRoomsResp.ResponseData responseData = new RecommendRoomsResp.ResponseData();
        responseData.items = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    responseData.items.add(_RecommendItem_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    public static void LJ(RecommendRoomsResp.ResponseData responseData) {
        List<RecommendItem> list = responseData.items;
        if (list == null) {
            responseData.items = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (RecommendItem recommendItem : responseData.items) {
            if (recommendItem != null) {
                _RecommendItem_ProtoDecoder.LJ(recommendItem);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RecommendRoomsResp.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final RecommendRoomsResp.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RecommendRoomsResp.ResponseData responseData, List list) {
    }
}
