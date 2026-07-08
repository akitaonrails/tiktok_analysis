package com.bytedance.android.live.liveinteract.match.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.match.model.BattleQuickStartResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleQuickStartResponse_ResponseData_ProtoDecoder implements C0IMD<BattleQuickStartResponse.ResponseData> {
    public static BattleQuickStartResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleQuickStartResponse.ResponseData responseData = new BattleQuickStartResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    responseData.isLastStart = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final BattleQuickStartResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BattleQuickStartResponse.ResponseData responseData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleQuickStartResponse.ResponseData responseData, List list) {
    }
}
