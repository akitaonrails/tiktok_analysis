package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.FollowGuideParams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FollowGuideParams_ProtoDecoder implements C0IMD<FollowGuideParams> {
    @Override // X.C0IMD
    public final void LIZ(FollowGuideParams followGuideParams) {
        FollowGuideParams followGuideParams2 = followGuideParams;
        List<FollowGuideParams.FollowGuideInfo> list = followGuideParams2.followGuideInfoList;
        if (list == null) {
            followGuideParams2.followGuideInfoList = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<FollowGuideParams.FollowGuideInfo> it2 = followGuideParams2.followGuideInfoList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final FollowGuideParams LIZJ(C1516680pZS c1516680pZS) throws IOException {
        FollowGuideParams followGuideParams = new FollowGuideParams();
        followGuideParams.followGuideInfoList = new ArrayList();
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
                                    followGuideParams.triggerParamsJsonStr = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                followGuideParams.channelId = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            followGuideParams.followGuideInfoList.add(_FollowGuideParams_FollowGuideInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        followGuideParams.triggerType = c1516680pZS.LJIIJ();
                    }
                } else {
                    followGuideParams.roomId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return followGuideParams;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FollowGuideParams followGuideParams, List list) {
    }
}
