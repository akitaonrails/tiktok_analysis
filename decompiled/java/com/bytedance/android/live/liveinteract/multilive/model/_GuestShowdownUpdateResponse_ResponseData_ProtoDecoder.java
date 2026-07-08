package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.GuestShowdownUpdateResponse;
import java.io.IOException;
import java.util.List;
import webcast.data.multi_guest_play.GuestShowdownContent;
import webcast.data.multi_guest_play._GuestShowdownContent_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _GuestShowdownUpdateResponse_ResponseData_ProtoDecoder implements C0IMD<GuestShowdownUpdateResponse.ResponseData> {
    public static GuestShowdownUpdateResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuestShowdownUpdateResponse.ResponseData responseData = new GuestShowdownUpdateResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        responseData.playContent = _GuestShowdownContent_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    responseData.success = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GuestShowdownUpdateResponse.ResponseData responseData) {
        GuestShowdownContent guestShowdownContent = responseData.playContent;
        if (guestShowdownContent != null) {
            _GuestShowdownContent_ProtoDecoder.LJ(guestShowdownContent);
        }
    }

    @Override // X.C0IMD
    public final GuestShowdownUpdateResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuestShowdownUpdateResponse.ResponseData responseData, List list) {
    }
}
