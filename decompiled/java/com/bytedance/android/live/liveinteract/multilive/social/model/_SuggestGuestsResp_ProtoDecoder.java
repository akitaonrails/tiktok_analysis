package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.social.model.SuggestGuestsResp;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SuggestGuestsResp_ProtoDecoder implements C0IMD<SuggestGuestsResp> {
    @Override // X.C0IMD
    public final void LIZ(SuggestGuestsResp suggestGuestsResp) {
        SuggestGuestsResp.ResponseData responseData = suggestGuestsResp.data;
        if (responseData != null) {
            _SuggestGuestsResp_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final SuggestGuestsResp LIZJ(C1516680pZS c1516680pZS) throws IOException {
        SuggestGuestsResp suggestGuestsResp = new SuggestGuestsResp();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    suggestGuestsResp.data = _SuggestGuestsResp_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return suggestGuestsResp;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SuggestGuestsResp suggestGuestsResp, List list) {
    }
}
