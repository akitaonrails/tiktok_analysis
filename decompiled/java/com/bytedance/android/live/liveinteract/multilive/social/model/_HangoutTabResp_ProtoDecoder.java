package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.social.model.HangoutTabResp;
import java.io.IOException;
import java.util.List;
import webcast.api.feed.TabMGTopLive;
import webcast.api.feed._TabMGTopLive_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _HangoutTabResp_ProtoDecoder implements C0IMD<HangoutTabResp> {
    @Override // X.C0IMD
    public final void LIZ(HangoutTabResp hangoutTabResp) {
        TabMGTopLive tabMGTopLive;
        HangoutTabResp.ResponseData responseData = hangoutTabResp.data;
        if (responseData != null && (tabMGTopLive = responseData.topLive) != null) {
            _TabMGTopLive_ProtoDecoder.LJ(tabMGTopLive);
        }
    }

    @Override // X.C0IMD
    public final HangoutTabResp LIZJ(C1516680pZS c1516680pZS) throws IOException {
        HangoutTabResp hangoutTabResp = new HangoutTabResp();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    hangoutTabResp.data = _HangoutTabResp_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return hangoutTabResp;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, HangoutTabResp hangoutTabResp, List list) {
    }
}
