package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.FollowGuideParams;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FollowGuideParams_FollowGuideInfo_ProtoDecoder implements C0IMD<FollowGuideParams.FollowGuideInfo> {
    public static FollowGuideParams.FollowGuideInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FollowGuideParams.FollowGuideInfo followGuideInfo = new FollowGuideParams.FollowGuideInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            followGuideInfo.guideFollowStatus = c1516680pZS.LJIIJ();
                        }
                    } else {
                        followGuideInfo.guideUserIdentity = c1516680pZS.LJIIJ();
                    }
                } else {
                    followGuideInfo.guideUserId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return followGuideInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final FollowGuideParams.FollowGuideInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(FollowGuideParams.FollowGuideInfo followGuideInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FollowGuideParams.FollowGuideInfo followGuideInfo, List list) {
    }
}
