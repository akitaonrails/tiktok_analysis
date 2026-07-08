package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ShowAgainGuestParams_ProtoDecoder implements C0IMD<ShowAgainGuestParams> {
    @Override // X.C0IMD
    public final ShowAgainGuestParams LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ShowAgainGuestParams showAgainGuestParams = new ShowAgainGuestParams();
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
                                showAgainGuestParams.targetUserId = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            showAgainGuestParams.showId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        showAgainGuestParams.channelId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    showAgainGuestParams.roomId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return showAgainGuestParams;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ShowAgainGuestParams showAgainGuestParams) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ShowAgainGuestParams showAgainGuestParams, List list) {
    }
}
