package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UpdateAnchorSettingsResp_ProtoDecoder implements C0IMD<UpdateAnchorSettingsResp> {
    @Override // X.C0IMD
    public final void LIZ(UpdateAnchorSettingsResp updateAnchorSettingsResp) {
    }

    @Override // X.C0IMD
    public final UpdateAnchorSettingsResp LIZJ(C1516680pZS c1516680pZS) throws IOException {
        UpdateAnchorSettingsResp updateAnchorSettingsResp = new UpdateAnchorSettingsResp();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    updateAnchorSettingsResp.data = _UpdateAnchorSettingsResp_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return updateAnchorSettingsResp;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UpdateAnchorSettingsResp updateAnchorSettingsResp, List list) {
    }
}
