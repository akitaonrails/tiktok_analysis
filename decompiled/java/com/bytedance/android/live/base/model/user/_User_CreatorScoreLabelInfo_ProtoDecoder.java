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
public final class _User_CreatorScoreLabelInfo_ProtoDecoder implements C0IMD<User.CreatorScoreLabelInfo> {
    public static User.CreatorScoreLabelInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        User.CreatorScoreLabelInfo creatorScoreLabelInfo = new User.CreatorScoreLabelInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        creatorScoreLabelInfo.labelText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        creatorScoreLabelInfo.labelTextColorDark = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        creatorScoreLabelInfo.labelTextColorLight = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        creatorScoreLabelInfo.logoDark = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        creatorScoreLabelInfo.logoLight = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        creatorScoreLabelInfo.popUpInfo = _User_PopUpInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return creatorScoreLabelInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(User.CreatorScoreLabelInfo creatorScoreLabelInfo) {
        User.CreatorScoreLabelInfo creatorScoreLabelInfo2 = creatorScoreLabelInfo;
        ImageModel imageModel = creatorScoreLabelInfo2.logoDark;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel2 = creatorScoreLabelInfo2.logoLight;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
    }

    @Override // X.C0IMD
    public final User.CreatorScoreLabelInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, User.CreatorScoreLabelInfo creatorScoreLabelInfo, List list) {
    }
}
