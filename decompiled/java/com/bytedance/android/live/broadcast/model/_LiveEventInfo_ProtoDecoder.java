package com.bytedance.android.live.broadcast.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveEventInfo_ProtoDecoder implements C0IMD<LiveEventInfo> {
    public static LiveEventInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveEventInfo liveEventInfo = new LiveEventInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        liveEventInfo.title = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    liveEventInfo.id = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveEventInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final LiveEventInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LiveEventInfo liveEventInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveEventInfo liveEventInfo, List list) {
    }
}
