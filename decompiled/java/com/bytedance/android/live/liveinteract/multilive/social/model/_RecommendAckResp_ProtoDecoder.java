package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendAckResp;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RecommendAckResp_ProtoDecoder implements C0IMD<RecommendAckResp> {
    @Override // X.C0IMD
    public final void LIZ(RecommendAckResp recommendAckResp) {
    }

    @Override // X.C0IMD
    public final RecommendAckResp LIZJ(C1516680pZS c1516680pZS) throws IOException {
        RecommendAckResp recommendAckResp = new RecommendAckResp();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    RecommendAckResp.ResponseData responseData = new RecommendAckResp.ResponseData();
                    long jLIZJ2 = c1516680pZS.LIZJ();
                    while (c1516680pZS.LJI() != -1) {
                        C1516700pZU.LJ(c1516680pZS);
                    }
                    c1516680pZS.LJ(jLIZJ2);
                    recommendAckResp.data = responseData;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return recommendAckResp;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RecommendAckResp recommendAckResp, List list) {
    }
}
