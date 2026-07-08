package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.EditLiveInfoResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EditLiveInfoResponse_ProtoDecoder implements C0IMD<EditLiveInfoResponse> {
    @Override // X.C0IMD
    public final void LIZ(EditLiveInfoResponse editLiveInfoResponse) {
    }

    @Override // X.C0IMD
    public final EditLiveInfoResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        EditLiveInfoResponse editLiveInfoResponse = new EditLiveInfoResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    EditLiveInfoResponse.ResponseData responseData = new EditLiveInfoResponse.ResponseData();
                    long jLIZJ2 = c1516680pZS.LIZJ();
                    while (c1516680pZS.LJI() != -1) {
                        C1516700pZU.LJ(c1516680pZS);
                    }
                    c1516680pZS.LJ(jLIZJ2);
                    editLiveInfoResponse.data = responseData;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return editLiveInfoResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EditLiveInfoResponse editLiveInfoResponse, List list) {
    }
}
