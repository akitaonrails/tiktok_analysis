package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.HostDisplayResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class _HostDisplayResponse_DisplayInfo_ProtoDecoder implements C0IMD<HostDisplayResponse.DisplayInfo> {
    public static HostDisplayResponse.DisplayInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        HostDisplayResponse.DisplayInfo displayInfo = new HostDisplayResponse.DisplayInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    displayInfo.hostType = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                displayInfo.iconLinkUrl = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            displayInfo.hostColor = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        displayInfo.hostIconUrl = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    displayInfo.hostIconBackgroundUrl = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return displayInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final HostDisplayResponse.DisplayInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(HostDisplayResponse.DisplayInfo displayInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, HostDisplayResponse.DisplayInfo displayInfo, List list) {
    }
}
