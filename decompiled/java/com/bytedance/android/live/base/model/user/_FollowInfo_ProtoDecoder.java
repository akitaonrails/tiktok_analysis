package com.bytedance.android.live.base.model.user;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class _FollowInfo_ProtoDecoder implements C0IMD<FollowInfo> {
    public static FollowInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FollowInfo followInfo = new FollowInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                followInfo.pushStatus = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            followInfo.followStatus = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        followInfo.followerCount = c1516680pZS.LJIIJJI();
                    }
                } else {
                    followInfo.followingCount = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return followInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final FollowInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(FollowInfo followInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FollowInfo followInfo, List list) {
    }
}
