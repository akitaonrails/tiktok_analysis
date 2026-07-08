package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.social.model.RandomMatchStartResp;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RandomMatchStartResp_ResponseData_ProtoDecoder implements C0IMD<RandomMatchStartResp.ResponseData> {
    public static RandomMatchStartResp.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RandomMatchStartResp.ResponseData responseData = new RandomMatchStartResp.ResponseData();
        responseData.recommendedRooms = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    responseData.recommendedRooms.add(_RecommendedRoom_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    public static void LJ(RandomMatchStartResp.ResponseData responseData) {
        Room room;
        List<RecommendedRoom> list = responseData.recommendedRooms;
        if (list == null) {
            responseData.recommendedRooms = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (RecommendedRoom recommendedRoom : responseData.recommendedRooms) {
            if (recommendedRoom != null && (room = recommendedRoom.room) != null) {
                _Room_ProtoDecoder.LJ(room);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RandomMatchStartResp.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final RandomMatchStartResp.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RandomMatchStartResp.ResponseData responseData, List list) {
    }
}
