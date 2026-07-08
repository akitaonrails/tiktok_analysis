package com.bytedance.android.live.base.model.user;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _User_OwnRoom_ProtoDecoder implements C0IMD<User.OwnRoom> {
    public static User.OwnRoom LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        User.OwnRoom ownRoom = new User.OwnRoom();
        ownRoom.roomIdList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    ownRoom.roomIdList.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return ownRoom;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(User.OwnRoom ownRoom) {
        User.OwnRoom ownRoom2 = ownRoom;
        if (ownRoom2.roomIdList == null) {
            ownRoom2.roomIdList = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final User.OwnRoom LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, User.OwnRoom ownRoom, List list) {
    }
}
