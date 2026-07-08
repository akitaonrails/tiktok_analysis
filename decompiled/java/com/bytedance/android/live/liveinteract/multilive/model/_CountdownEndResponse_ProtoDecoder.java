package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CountdownEndResponse_ProtoDecoder implements C0IMD<CountdownEndResponse> {
    @Override // X.C0IMD
    public final void LIZ(CountdownEndResponse countdownEndResponse) {
    }

    @Override // X.C0IMD
    public final CountdownEndResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CountdownEndResponse countdownEndResponse = new CountdownEndResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    countdownEndResponse.data = _CountdownEndResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return countdownEndResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CountdownEndResponse countdownEndResponse, List list) {
    }
}
