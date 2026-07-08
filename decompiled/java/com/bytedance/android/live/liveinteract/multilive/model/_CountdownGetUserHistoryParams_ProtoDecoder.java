package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CountdownGetUserHistoryParams_ProtoDecoder implements C0IMD<CountdownGetUserHistoryParams> {
    @Override // X.C0IMD
    public final CountdownGetUserHistoryParams LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CountdownGetUserHistoryParams countdownGetUserHistoryParams = new CountdownGetUserHistoryParams();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        countdownGetUserHistoryParams.userId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    countdownGetUserHistoryParams.roomId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return countdownGetUserHistoryParams;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CountdownGetUserHistoryParams countdownGetUserHistoryParams) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CountdownGetUserHistoryParams countdownGetUserHistoryParams, List list) {
    }
}
