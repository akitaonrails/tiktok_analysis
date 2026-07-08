package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.social.model.RightDisableResp;
import java.io.IOException;
import java.util.List;
import webcast.data.multi_guest_social_data._SoundWareEffect_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _RightDisableResp_ResponseData_ProtoDecoder implements C0IMD<RightDisableResp.ResponseData> {
    @Override // X.C0IMD
    public final void LIZ(RightDisableResp.ResponseData responseData) {
    }

    @Override // X.C0IMD
    public final RightDisableResp.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        RightDisableResp.ResponseData responseData = new RightDisableResp.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    responseData.soundWaveEffect = _SoundWareEffect_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RightDisableResp.ResponseData responseData, List list) {
    }
}
