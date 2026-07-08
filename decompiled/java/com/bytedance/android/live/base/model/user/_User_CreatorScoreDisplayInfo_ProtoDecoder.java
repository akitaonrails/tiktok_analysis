package com.bytedance.android.live.base.model.user;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _User_CreatorScoreDisplayInfo_ProtoDecoder implements C0IMD<User.CreatorScoreDisplayInfo> {
    public static User.CreatorScoreDisplayInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        User.CreatorScoreDisplayInfo creatorScoreDisplayInfo = new User.CreatorScoreDisplayInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        creatorScoreDisplayInfo.scoreLevel = c1516680pZS.LJIIJ();
                    }
                } else {
                    creatorScoreDisplayInfo.ecommerceEntranceLabel = _User_CreatorScoreLabelInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return creatorScoreDisplayInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(User.CreatorScoreDisplayInfo creatorScoreDisplayInfo) {
        User.CreatorScoreLabelInfo creatorScoreLabelInfo = creatorScoreDisplayInfo.ecommerceEntranceLabel;
        if (creatorScoreLabelInfo != null) {
            ImageModel imageModel = creatorScoreLabelInfo.logoDark;
            if (imageModel != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
            ImageModel imageModel2 = creatorScoreLabelInfo.logoLight;
            if (imageModel2 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel2);
            }
        }
    }

    @Override // X.C0IMD
    public final User.CreatorScoreDisplayInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, User.CreatorScoreDisplayInfo creatorScoreDisplayInfo, List list) {
    }
}
