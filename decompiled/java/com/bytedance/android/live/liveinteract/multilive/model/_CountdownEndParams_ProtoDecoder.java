package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CountdownEndParams_ProtoDecoder implements C0IMD<CountdownEndParams> {
    @Override // X.C0IMD
    public final CountdownEndParams LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CountdownEndParams countdownEndParams = new CountdownEndParams();
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
                                countdownEndParams.endReason = c1516680pZS.LJIIJ();
                            }
                        } else {
                            countdownEndParams.countdownId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        countdownEndParams.channelId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    countdownEndParams.roomId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return countdownEndParams;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CountdownEndParams countdownEndParams) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CountdownEndParams countdownEndParams, List list) {
    }
}
