package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _HostDisplayResponse_ProtoDecoder implements C0IMD<HostDisplayResponse> {
    @Override // X.C0IMD
    public final void LIZ(HostDisplayResponse hostDisplayResponse) {
    }

    @Override // X.C0IMD
    public final HostDisplayResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        HostDisplayResponse hostDisplayResponse = new HostDisplayResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    hostDisplayResponse.data = _HostDisplayResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return hostDisplayResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, HostDisplayResponse hostDisplayResponse, List list) {
    }
}
