package com.bytedance.android.live.base.model.user;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _User_PopUpInfo_ProtoDecoder implements C0IMD<User.PopUpInfo> {
    public static User.PopUpInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        User.PopUpInfo popUpInfo = new User.PopUpInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        popUpInfo.description = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    popUpInfo.title = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return popUpInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final User.PopUpInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(User.PopUpInfo popUpInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, User.PopUpInfo popUpInfo, List list) {
    }
}
