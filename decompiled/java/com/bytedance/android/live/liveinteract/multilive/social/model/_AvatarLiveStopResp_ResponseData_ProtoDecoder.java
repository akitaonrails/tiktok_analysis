package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarLiveStopResp;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AvatarLiveStopResp_ResponseData_ProtoDecoder implements C0IMD<AvatarLiveStopResp.ResponseData> {
    @Override // X.C0IMD
    public final AvatarLiveStopResp.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        AvatarLiveStopResp.ResponseData responseData = new AvatarLiveStopResp.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (c1516680pZS.LJI() != -1) {
            C1516700pZU.LJ(c1516680pZS);
        }
        c1516680pZS.LJ(jLIZJ);
        return responseData;
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AvatarLiveStopResp.ResponseData responseData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AvatarLiveStopResp.ResponseData responseData, List list) {
    }
}
