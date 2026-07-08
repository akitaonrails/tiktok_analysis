package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GetShowSettingsResponse_ProtoDecoder implements C0IMD<GetShowSettingsResponse> {
    @Override // X.C0IMD
    public final void LIZ(GetShowSettingsResponse getShowSettingsResponse) {
    }

    @Override // X.C0IMD
    public final GetShowSettingsResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GetShowSettingsResponse getShowSettingsResponse = new GetShowSettingsResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    getShowSettingsResponse.data = _GetShowSettingsResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return getShowSettingsResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetShowSettingsResponse getShowSettingsResponse, List list) {
    }
}
