package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FanTicketRanklistParams_ProtoDecoder implements C0IMD<FanTicketRanklistParams> {
    @Override // X.C0IMD
    public final FanTicketRanklistParams LIZJ(C1516680pZS c1516680pZS) throws IOException {
        FanTicketRanklistParams fanTicketRanklistParams = new FanTicketRanklistParams();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        fanTicketRanklistParams.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        fanTicketRanklistParams.guestUserId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        fanTicketRanklistParams.anchorId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        fanTicketRanklistParams.channelId = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        fanTicketRanklistParams.linkmicId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        fanTicketRanklistParams.showId = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        fanTicketRanklistParams.playId = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        fanTicketRanklistParams.playScene = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return fanTicketRanklistParams;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(FanTicketRanklistParams fanTicketRanklistParams) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FanTicketRanklistParams fanTicketRanklistParams, List list) {
    }
}
