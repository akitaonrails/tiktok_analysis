package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FinishShowingGuestParams_ProtoDecoder implements C0IMD<FinishShowingGuestParams> {
    @Override // X.C0IMD
    public final FinishShowingGuestParams LIZJ(C1516680pZS c1516680pZS) throws IOException {
        FinishShowingGuestParams finishShowingGuestParams = new FinishShowingGuestParams();
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
                                finishShowingGuestParams.targetUserId = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            finishShowingGuestParams.showId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        finishShowingGuestParams.channelId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    finishShowingGuestParams.roomId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return finishShowingGuestParams;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(FinishShowingGuestParams finishShowingGuestParams) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FinishShowingGuestParams finishShowingGuestParams, List list) {
    }
}
