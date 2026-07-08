package com.bytedance.android.live.broadcast.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameLiveInfo_ProtoDecoder implements C0IMD<GameLiveInfo> {
    public static GameLiveInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GameLiveInfo gameLiveInfo = new GameLiveInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            gameLiveInfo.hasCommentInGameLive = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        gameLiveInfo.hasGameLive2Min = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    gameLiveInfo.hasGameLive = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameLiveInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final GameLiveInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GameLiveInfo gameLiveInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameLiveInfo gameLiveInfo, List list) {
    }
}
