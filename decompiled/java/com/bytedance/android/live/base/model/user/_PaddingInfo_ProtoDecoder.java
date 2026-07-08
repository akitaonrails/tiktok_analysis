package com.bytedance.android.live.base.model.user;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PaddingInfo_ProtoDecoder implements C0IMD<PaddingInfo> {
    public static PaddingInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PaddingInfo paddingInfo = new PaddingInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        paddingInfo.useSpecific = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 2:
                        paddingInfo.middlePadding = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        paddingInfo.badgeWidth = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        paddingInfo.leftPadding = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        paddingInfo.rightPadding = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        paddingInfo.iconTopPadding = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        paddingInfo.iconBottomPadding = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        paddingInfo.horizontalPaddingRule = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        paddingInfo.verticalPaddingRule = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return paddingInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final PaddingInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PaddingInfo paddingInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PaddingInfo paddingInfo, List list) {
    }
}
