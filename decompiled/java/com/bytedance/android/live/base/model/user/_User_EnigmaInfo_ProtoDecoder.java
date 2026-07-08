package com.bytedance.android.live.base.model.user;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _User_EnigmaInfo_ProtoDecoder implements C0IMD<User.EnigmaInfo> {
    public static User.EnigmaInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        User.EnigmaInfo enigmaInfo = new User.EnigmaInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    enigmaInfo.isEnigmaMaskOn = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return enigmaInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final User.EnigmaInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(User.EnigmaInfo enigmaInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, User.EnigmaInfo enigmaInfo, List list) {
    }
}
