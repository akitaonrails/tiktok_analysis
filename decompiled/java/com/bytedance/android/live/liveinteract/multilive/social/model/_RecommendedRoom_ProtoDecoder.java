package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RecommendedRoom_ProtoDecoder implements C0IMD<RecommendedRoom> {
    public static RecommendedRoom LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RecommendedRoom recommendedRoom = new RecommendedRoom();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                recommendedRoom.room = _Room_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            recommendedRoom.roomType = c1516680pZS.LJIIJ();
                        }
                    } else {
                        recommendedRoom.anchorId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    recommendedRoom.roomId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return recommendedRoom;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RecommendedRoom recommendedRoom) {
        Room room = recommendedRoom.room;
        if (room != null) {
            _Room_ProtoDecoder.LJ(room);
        }
    }

    @Override // X.C0IMD
    public final RecommendedRoom LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RecommendedRoom recommendedRoom, List list) {
    }
}
