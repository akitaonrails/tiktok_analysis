package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model.GetLiveEventUserResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GetLiveEventUserResponse_RegisteredListUser_ProtoDecoder implements C0IMD<GetLiveEventUserResponse.RegisteredListUser> {
    public static GetLiveEventUserResponse.RegisteredListUser LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GetLiveEventUserResponse.RegisteredListUser registeredListUser = new GetLiveEventUserResponse.RegisteredListUser();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            registeredListUser.registeredTime = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        registeredListUser.alreadyRead = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    registeredListUser.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return registeredListUser;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GetLiveEventUserResponse.RegisteredListUser registeredListUser) {
        User user = registeredListUser.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final GetLiveEventUserResponse.RegisteredListUser LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetLiveEventUserResponse.RegisteredListUser registeredListUser, List list) {
    }
}
