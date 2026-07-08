package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GetShowContentParams_ProtoDecoder implements C0IMD<GetShowContentParams> {
    @Override // X.C0IMD
    public final GetShowContentParams LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GetShowContentParams getShowContentParams = new GetShowContentParams();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            getShowContentParams.showId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        getShowContentParams.channelId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    getShowContentParams.roomId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return getShowContentParams;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GetShowContentParams getShowContentParams) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetShowContentParams getShowContentParams, List list) {
    }
}
