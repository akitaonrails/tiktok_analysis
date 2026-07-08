package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.social.model.TopLiveRecommendRoomResp;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TopLiveRecommendRoomResp_ResponseData_ProtoDecoder implements C0IMD<TopLiveRecommendRoomResp.ResponseData> {
    @Override // X.C0IMD
    public final void LIZ(TopLiveRecommendRoomResp.ResponseData responseData) {
        Room room = responseData.room;
        if (room != null) {
            _Room_ProtoDecoder.LJ(room);
        }
    }

    @Override // X.C0IMD
    public final TopLiveRecommendRoomResp.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        TopLiveRecommendRoomResp.ResponseData responseData = new TopLiveRecommendRoomResp.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    responseData.room = _Room_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TopLiveRecommendRoomResp.ResponseData responseData, List list) {
    }
}
