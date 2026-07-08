package com.bytedance.android.live.broadcast.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameLiveConvertInfo_ProtoDecoder implements C0IMD<GameLiveConvertInfo> {
    public static GameLiveConvertInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GameLiveConvertInfo gameLiveConvertInfo = new GameLiveConvertInfo();
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
                                gameLiveConvertInfo.text = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            gameLiveConvertInfo.title = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        gameLiveConvertInfo.acuType = c1516680pZS.LJIIJ();
                    }
                } else {
                    gameLiveConvertInfo.convertType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameLiveConvertInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final GameLiveConvertInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GameLiveConvertInfo gameLiveConvertInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameLiveConvertInfo gameLiveConvertInfo, List list) {
    }
}
