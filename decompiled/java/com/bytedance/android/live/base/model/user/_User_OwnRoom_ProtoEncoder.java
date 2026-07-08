package com.bytedance.android.live.base.model.user;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _User_OwnRoom_ProtoEncoder implements InterfaceC1132110fZB<User.OwnRoom> {
    public static int LIZJ(User.OwnRoom ownRoom) {
        List<Long> list = ownRoom.roomIdList;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        int iLJIILIIL = 0;
        for (int i = 0; i < ownRoom.roomIdList.size(); i++) {
            iLJIILIIL += C1142340fpg.LJIILIIL(1, (Long) ListProtector.get(ownRoom.roomIdList, i));
        }
        return iLJIILIIL;
    }

    public static void LIZIZ(C1142350fph c1142350fph, User.OwnRoom ownRoom) {
        List<Long> list = ownRoom.roomIdList;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < ownRoom.roomIdList.size(); i++) {
                C1142340fpg.LJ(c1142350fph, 1, (Long) ListProtector.get(ownRoom.roomIdList, i));
            }
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, User.OwnRoom ownRoom) {
        LIZIZ(c1142350fph, ownRoom);
    }
}
