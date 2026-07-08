package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GetRandomMatchStateResp_ProtoDecoder implements C0IMD<GetRandomMatchStateResp> {
    @Override // X.C0IMD
    public final void LIZ(GetRandomMatchStateResp getRandomMatchStateResp) {
        RecommendedRoom recommendedRoom;
        Room room;
        RandomMatchResult randomMatchResult = getRandomMatchStateResp.data;
        if (randomMatchResult != null && (recommendedRoom = randomMatchResult.recommendedRoom) != null && (room = recommendedRoom.room) != null) {
            _Room_ProtoDecoder.LJ(room);
        }
    }

    @Override // X.C0IMD
    public final GetRandomMatchStateResp LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GetRandomMatchStateResp getRandomMatchStateResp = new GetRandomMatchStateResp();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    getRandomMatchStateResp.data = _RandomMatchResult_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return getRandomMatchStateResp;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetRandomMatchStateResp getRandomMatchStateResp, List list) {
    }
}
