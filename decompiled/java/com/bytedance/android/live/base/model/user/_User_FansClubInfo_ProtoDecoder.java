package com.bytedance.android.live.base.model.user;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _User_FansClubInfo_ProtoDecoder implements C0IMD<User.FansClubInfo> {
    public static User.FansClubInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        User.FansClubInfo fansClubInfo = new User.FansClubInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        fansClubInfo.isSleeping = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 2:
                        fansClubInfo.fansLevel = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        fansClubInfo.fansScore = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        fansClubInfo.badge = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        fansClubInfo.fansCount = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        fansClubInfo.fansClubName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return fansClubInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(User.FansClubInfo fansClubInfo) {
        ImageModel imageModel = fansClubInfo.badge;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final User.FansClubInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, User.FansClubInfo fansClubInfo, List list) {
    }
}
