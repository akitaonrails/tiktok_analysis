package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MultiGuestPushResp_ProtoDecoder implements C0IMD<MultiGuestPushResp> {
    @Override // X.C0IMD
    public final MultiGuestPushResp LIZJ(C1516680pZS c1516680pZS) throws IOException {
        MultiGuestPushResp multiGuestPushResp = new MultiGuestPushResp();
        long jLIZJ = c1516680pZS.LIZJ();
        while (c1516680pZS.LJI() != -1) {
            C1516700pZU.LJ(c1516680pZS);
        }
        c1516680pZS.LJ(jLIZJ);
        return multiGuestPushResp;
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(MultiGuestPushResp multiGuestPushResp) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiGuestPushResp multiGuestPushResp, List list) {
    }
}
