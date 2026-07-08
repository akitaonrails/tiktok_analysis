package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EndShowParams_ProtoDecoder implements C0IMD<EndShowParams> {
    @Override // X.C0IMD
    public final EndShowParams LIZJ(C1516680pZS c1516680pZS) throws IOException {
        EndShowParams endShowParams = new EndShowParams();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            endShowParams.showId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        endShowParams.channelId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    endShowParams.roomId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return endShowParams;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(EndShowParams endShowParams) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EndShowParams endShowParams, List list) {
    }
}
