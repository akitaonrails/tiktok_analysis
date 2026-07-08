package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RecommendShowUser_ProtoDecoder implements C0IMD<RecommendShowUser> {
    public static RecommendShowUser LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RecommendShowUser recommendShowUser = new RecommendShowUser();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        recommendShowUser.role = c1516680pZS.LJIIJ();
                    }
                } else {
                    recommendShowUser.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return recommendShowUser;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RecommendShowUser recommendShowUser) {
        User user = recommendShowUser.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final RecommendShowUser LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RecommendShowUser recommendShowUser, List list) {
    }
}
