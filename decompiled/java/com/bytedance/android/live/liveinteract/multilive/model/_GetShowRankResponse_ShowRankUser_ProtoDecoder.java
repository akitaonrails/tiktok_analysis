package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_EnigmaInfo_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowRankResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GetShowRankResponse_ShowRankUser_ProtoDecoder implements C0IMD<GetShowRankResponse.ShowRankUser> {
    public static GetShowRankResponse.ShowRankUser LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GetShowRankResponse.ShowRankUser showRankUser = new GetShowRankResponse.ShowRankUser();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        showRankUser.userId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        showRankUser.order = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        showRankUser.score = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        showRankUser.nickname = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        showRankUser.avatarThumb = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        showRankUser.followStatus = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        showRankUser.enigmaInfo = _User_EnigmaInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return showRankUser;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GetShowRankResponse.ShowRankUser showRankUser) {
        ImageModel imageModel = showRankUser.avatarThumb;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final GetShowRankResponse.ShowRankUser LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetShowRankResponse.ShowRankUser showRankUser, List list) {
    }
}
