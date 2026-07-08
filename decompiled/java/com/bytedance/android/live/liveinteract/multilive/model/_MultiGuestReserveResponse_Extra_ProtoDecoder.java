package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestReserveResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MultiGuestReserveResponse_Extra_ProtoDecoder implements C0IMD<MultiGuestReserveResponse.Extra> {
    public static MultiGuestReserveResponse.Extra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MultiGuestReserveResponse.Extra extra = new MultiGuestReserveResponse.Extra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    extra.now = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return extra;
            }
        }
    }

    @Override // X.C0IMD
    public final MultiGuestReserveResponse.Extra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(MultiGuestReserveResponse.Extra extra) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiGuestReserveResponse.Extra extra, List list) {
    }
}
