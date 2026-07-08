package com.bytedance.android.live.liveinteract.match.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleQuickStartResponse_ProtoDecoder implements C0IMD<BattleQuickStartResponse> {
    @Override // X.C0IMD
    public final void LIZ(BattleQuickStartResponse battleQuickStartResponse) {
    }

    @Override // X.C0IMD
    public final BattleQuickStartResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        BattleQuickStartResponse battleQuickStartResponse = new BattleQuickStartResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    battleQuickStartResponse.data = _BattleQuickStartResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleQuickStartResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleQuickStartResponse battleQuickStartResponse, List list) {
    }
}
