package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GetLinkMicInfoResp_ProtoDecoder implements C0IMD<GetLinkMicInfoResp> {
    @Override // X.C0IMD
    public final void LIZ(GetLinkMicInfoResp getLinkMicInfoResp) {
    }

    @Override // X.C0IMD
    public final GetLinkMicInfoResp LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GetLinkMicInfoResp getLinkMicInfoResp = new GetLinkMicInfoResp();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    getLinkMicInfoResp.data = _GetLinkMicInfoResp_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return getLinkMicInfoResp;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetLinkMicInfoResp getLinkMicInfoResp, List list) {
    }
}
