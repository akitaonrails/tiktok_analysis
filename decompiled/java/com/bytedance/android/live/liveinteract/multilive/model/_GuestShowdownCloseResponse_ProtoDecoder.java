package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.GuestShowdownCloseResponse;
import java.io.IOException;
import java.util.List;
import webcast.data.multi_guest_play.GuestShowdownContent;
import webcast.data.multi_guest_play._GuestShowdownContent_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _GuestShowdownCloseResponse_ProtoDecoder implements C0IMD<GuestShowdownCloseResponse> {
    @Override // X.C0IMD
    public final void LIZ(GuestShowdownCloseResponse guestShowdownCloseResponse) {
        GuestShowdownContent guestShowdownContent;
        GuestShowdownCloseResponse.ResponseData responseData = guestShowdownCloseResponse.data;
        if (responseData != null && (guestShowdownContent = responseData.playContent) != null) {
            _GuestShowdownContent_ProtoDecoder.LJ(guestShowdownContent);
        }
    }

    @Override // X.C0IMD
    public final GuestShowdownCloseResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GuestShowdownCloseResponse guestShowdownCloseResponse = new GuestShowdownCloseResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    guestShowdownCloseResponse.data = _GuestShowdownCloseResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guestShowdownCloseResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuestShowdownCloseResponse guestShowdownCloseResponse, List list) {
    }
}
