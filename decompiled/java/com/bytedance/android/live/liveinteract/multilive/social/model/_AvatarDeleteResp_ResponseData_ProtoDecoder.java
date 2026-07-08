package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarDeleteResp;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AvatarDeleteResp_ResponseData_ProtoDecoder implements C0IMD<AvatarDeleteResp.ResponseData> {
    @Override // X.C0IMD
    public final AvatarDeleteResp.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        AvatarDeleteResp.ResponseData responseData = new AvatarDeleteResp.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (c1516680pZS.LJI() != -1) {
            C1516700pZU.LJ(c1516680pZS);
        }
        c1516680pZS.LJ(jLIZJ);
        return responseData;
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AvatarDeleteResp.ResponseData responseData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AvatarDeleteResp.ResponseData responseData, List list) {
    }
}
