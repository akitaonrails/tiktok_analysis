package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.GuestApplyStillInLineResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuestApplyStillInLineResponse_ProtoDecoder implements C0IMD<GuestApplyStillInLineResponse> {
    @Override // X.C0IMD
    public final void LIZ(GuestApplyStillInLineResponse guestApplyStillInLineResponse) {
        GuestApplyStillInLineResponse.ResponseData responseData = guestApplyStillInLineResponse.data;
        if (responseData != null) {
            _GuestApplyStillInLineResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final GuestApplyStillInLineResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GuestApplyStillInLineResponse guestApplyStillInLineResponse = new GuestApplyStillInLineResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    guestApplyStillInLineResponse.data = _GuestApplyStillInLineResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guestApplyStillInLineResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuestApplyStillInLineResponse guestApplyStillInLineResponse, List list) {
    }
}
