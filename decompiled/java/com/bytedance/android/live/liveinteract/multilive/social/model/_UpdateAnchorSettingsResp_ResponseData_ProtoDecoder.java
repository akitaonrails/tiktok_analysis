package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.social.model.UpdateAnchorSettingsResp;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UpdateAnchorSettingsResp_ResponseData_ProtoDecoder implements C0IMD<UpdateAnchorSettingsResp.ResponseData> {
    public static UpdateAnchorSettingsResp.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UpdateAnchorSettingsResp.ResponseData responseData = new UpdateAnchorSettingsResp.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    responseData.updateResult = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final UpdateAnchorSettingsResp.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(UpdateAnchorSettingsResp.ResponseData responseData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UpdateAnchorSettingsResp.ResponseData responseData, List list) {
    }
}
