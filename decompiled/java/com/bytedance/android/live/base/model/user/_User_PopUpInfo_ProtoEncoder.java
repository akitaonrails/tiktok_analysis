package com.bytedance.android.live.base.model.user;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes18.dex */
public final class _User_PopUpInfo_ProtoEncoder implements InterfaceC1132110fZB<User.PopUpInfo> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, User.PopUpInfo popUpInfo) {
        User.PopUpInfo popUpInfo2 = popUpInfo;
        C1142340fpg.LJFF(c1142350fph, 1, popUpInfo2.title);
        C1142340fpg.LJFF(c1142350fph, 2, popUpInfo2.description);
    }
}
