package com.bytedance.android.live.broadcast.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class _WalletRewardsContainerInfo_ProtoDecoder implements C0IMD<WalletRewardsContainerInfo> {
    public static WalletRewardsContainerInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        WalletRewardsContainerInfo walletRewardsContainerInfo = new WalletRewardsContainerInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        walletRewardsContainerInfo.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        walletRewardsContainerInfo.content = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        walletRewardsContainerInfo.schema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        walletRewardsContainerInfo.needPopup = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        walletRewardsContainerInfo.exposurePeriod = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        walletRewardsContainerInfo.popupSchema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        walletRewardsContainerInfo.popupType = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return walletRewardsContainerInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final WalletRewardsContainerInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(WalletRewardsContainerInfo walletRewardsContainerInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, WalletRewardsContainerInfo walletRewardsContainerInfo, List list) {
    }
}
