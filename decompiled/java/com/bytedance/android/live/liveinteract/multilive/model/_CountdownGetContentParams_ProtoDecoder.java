package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CountdownGetContentParams_ProtoDecoder implements C0IMD<CountdownGetContentParams> {
    @Override // X.C0IMD
    public final void LIZ(CountdownGetContentParams countdownGetContentParams) {
        CountdownGetContentParams countdownGetContentParams2 = countdownGetContentParams;
        if (countdownGetContentParams2.countdownIds == null) {
            countdownGetContentParams2.countdownIds = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final CountdownGetContentParams LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CountdownGetContentParams countdownGetContentParams = new CountdownGetContentParams();
        countdownGetContentParams.countdownIds = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            countdownGetContentParams.countdownIds.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                        }
                    } else {
                        countdownGetContentParams.channelId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    countdownGetContentParams.roomId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return countdownGetContentParams;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CountdownGetContentParams countdownGetContentParams, List list) {
    }
}
