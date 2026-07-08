package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.social.model.RandomMatchGuestCancelResp;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RandomMatchGuestCancelResp_ProtoDecoder implements C0IMD<RandomMatchGuestCancelResp> {
    @Override // X.C0IMD
    public final void LIZ(RandomMatchGuestCancelResp randomMatchGuestCancelResp) {
    }

    @Override // X.C0IMD
    public final RandomMatchGuestCancelResp LIZJ(C1516680pZS c1516680pZS) throws IOException {
        RandomMatchGuestCancelResp randomMatchGuestCancelResp = new RandomMatchGuestCancelResp();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    RandomMatchGuestCancelResp.ResponseData responseData = new RandomMatchGuestCancelResp.ResponseData();
                    long jLIZJ2 = c1516680pZS.LIZJ();
                    while (c1516680pZS.LJI() != -1) {
                        C1516700pZU.LJ(c1516680pZS);
                    }
                    c1516680pZS.LJ(jLIZJ2);
                    randomMatchGuestCancelResp.data = responseData;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return randomMatchGuestCancelResp;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RandomMatchGuestCancelResp randomMatchGuestCancelResp, List list) {
    }
}
