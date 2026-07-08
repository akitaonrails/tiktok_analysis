package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarCreateResp;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AvatarCreateResp_ResponseData_ProtoDecoder implements C0IMD<AvatarCreateResp.ResponseData> {
    @Override // X.C0IMD
    public final AvatarCreateResp.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        AvatarCreateResp.ResponseData responseData = new AvatarCreateResp.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    responseData.avatarId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AvatarCreateResp.ResponseData responseData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AvatarCreateResp.ResponseData responseData, List list) {
    }
}
