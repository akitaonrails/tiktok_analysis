package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GetUserPlaySettingsParams_ProtoDecoder implements C0IMD<GetUserPlaySettingsParams> {
    @Override // X.C0IMD
    public final void LIZ(GetUserPlaySettingsParams getUserPlaySettingsParams) {
        GetUserPlaySettingsParams getUserPlaySettingsParams2 = getUserPlaySettingsParams;
        if (getUserPlaySettingsParams2.settingKeys == null) {
            getUserPlaySettingsParams2.settingKeys = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final GetUserPlaySettingsParams LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GetUserPlaySettingsParams getUserPlaySettingsParams = new GetUserPlaySettingsParams();
        getUserPlaySettingsParams.settingKeys = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    getUserPlaySettingsParams.settingKeys.add(C1516700pZU.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return getUserPlaySettingsParams;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetUserPlaySettingsParams getUserPlaySettingsParams, List list) {
    }
}
