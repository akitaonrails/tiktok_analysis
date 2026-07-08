package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.FanTicketRanklistResponse;
import java.io.IOException;
import java.util.List;
import webcast.data.multi_guest_play._UserCountdownRecord_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _FanTicketRanklistResponse_CountdownInfo_ProtoDecoder implements C0IMD<FanTicketRanklistResponse.CountdownInfo> {
    public static FanTicketRanklistResponse.CountdownInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FanTicketRanklistResponse.CountdownInfo countdownInfo = new FanTicketRanklistResponse.CountdownInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        countdownInfo.inProgressRecord = _UserCountdownRecord_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    countdownInfo.historyExists = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return countdownInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(FanTicketRanklistResponse.CountdownInfo countdownInfo) {
    }

    @Override // X.C0IMD
    public final FanTicketRanklistResponse.CountdownInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FanTicketRanklistResponse.CountdownInfo countdownInfo, List list) {
    }
}
