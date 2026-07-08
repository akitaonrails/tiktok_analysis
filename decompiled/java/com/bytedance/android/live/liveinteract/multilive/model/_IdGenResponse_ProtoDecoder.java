package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _IdGenResponse_ProtoDecoder implements C0IMD<IdGenResponse> {
    @Override // X.C0IMD
    public final void LIZ(IdGenResponse idGenResponse) {
    }

    @Override // X.C0IMD
    public final IdGenResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        IdGenResponse idGenResponse = new IdGenResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    idGenResponse.data = _IdGenResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return idGenResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, IdGenResponse idGenResponse, List list) {
    }
}
