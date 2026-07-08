package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.InviteLiveEventUserResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _InviteLiveEventUserResponse_ProtoDecoder implements C0IMD<InviteLiveEventUserResponse> {
    @Override // X.C0IMD
    public final void LIZ(InviteLiveEventUserResponse inviteLiveEventUserResponse) {
    }

    @Override // X.C0IMD
    public final InviteLiveEventUserResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        InviteLiveEventUserResponse inviteLiveEventUserResponse = new InviteLiveEventUserResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    InviteLiveEventUserResponse.ResponseData responseData = new InviteLiveEventUserResponse.ResponseData();
                    long jLIZJ2 = c1516680pZS.LIZJ();
                    while (c1516680pZS.LJI() != -1) {
                        C1516700pZU.LJ(c1516680pZS);
                    }
                    c1516680pZS.LJ(jLIZJ2);
                    inviteLiveEventUserResponse.data = responseData;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return inviteLiveEventUserResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, InviteLiveEventUserResponse inviteLiveEventUserResponse, List list) {
    }
}
