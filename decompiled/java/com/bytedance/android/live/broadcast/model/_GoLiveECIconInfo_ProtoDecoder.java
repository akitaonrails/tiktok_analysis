package com.bytedance.android.live.broadcast.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GoLiveECIconInfo_ProtoDecoder implements C0IMD<GoLiveECIconInfo> {
    public static GoLiveECIconInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GoLiveECIconInfo goLiveECIconInfo = new GoLiveECIconInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        goLiveECIconInfo.hasEcLivePermission = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 2:
                        goLiveECIconInfo.isOldRedDotLogic = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 3:
                        goLiveECIconInfo.displayEcIcon = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 4:
                        goLiveECIconInfo.displayRedDot = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        goLiveECIconInfo.independentDisplayEcIcon = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        goLiveECIconInfo.bubbleText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        goLiveECIconInfo.bubbleMetadata = _BubbleMetadata_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return goLiveECIconInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GoLiveECIconInfo goLiveECIconInfo) {
    }

    @Override // X.C0IMD
    public final GoLiveECIconInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GoLiveECIconInfo goLiveECIconInfo, List list) {
    }
}
