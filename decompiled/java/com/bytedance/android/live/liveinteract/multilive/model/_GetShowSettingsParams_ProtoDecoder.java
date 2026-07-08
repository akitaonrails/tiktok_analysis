package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GetShowSettingsParams_ProtoDecoder implements C0IMD<GetShowSettingsParams> {
    @Override // X.C0IMD
    public final GetShowSettingsParams LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GetShowSettingsParams getShowSettingsParams = new GetShowSettingsParams();
        long jLIZJ = c1516680pZS.LIZJ();
        while (c1516680pZS.LJI() != -1) {
            C1516700pZU.LJ(c1516680pZS);
        }
        c1516680pZS.LJ(jLIZJ);
        return getShowSettingsParams;
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GetShowSettingsParams getShowSettingsParams) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetShowSettingsParams getShowSettingsParams, List list) {
    }
}
