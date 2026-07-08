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
public final class _User_ComboBadgeInfo_ProtoDecoder implements C0IMD<User.ComboBadgeInfo> {
    public static User.ComboBadgeInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        User.ComboBadgeInfo comboBadgeInfo = new User.ComboBadgeInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        comboBadgeInfo.comboCount = c1516680pZS.LJIIJJI();
                    }
                } else {
                    comboBadgeInfo.icon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return comboBadgeInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(User.ComboBadgeInfo comboBadgeInfo) {
        ImageModel imageModel = comboBadgeInfo.icon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final User.ComboBadgeInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, User.ComboBadgeInfo comboBadgeInfo, List list) {
    }
}
