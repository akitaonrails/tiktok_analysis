package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RandomMatchResult_ProtoDecoder implements C0IMD<RandomMatchResult> {
    public static RandomMatchResult LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RandomMatchResult randomMatchResult = new RandomMatchResult();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    randomMatchResult.aggId = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                randomMatchResult.source = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            randomMatchResult.reqId = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        randomMatchResult.status = c1516680pZS.LJIIJ();
                    }
                } else {
                    randomMatchResult.recommendedRoom = _RecommendedRoom_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return randomMatchResult;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RandomMatchResult randomMatchResult) {
        Room room;
        RecommendedRoom recommendedRoom = randomMatchResult.recommendedRoom;
        if (recommendedRoom != null && (room = recommendedRoom.room) != null) {
            _Room_ProtoDecoder.LJ(room);
        }
    }

    @Override // X.C0IMD
    public final RandomMatchResult LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RandomMatchResult randomMatchResult, List list) {
    }
}
