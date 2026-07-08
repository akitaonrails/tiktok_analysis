package com.bytedance.android.live.base.model.user;

import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes18.dex */
public final class _User_ComboBadgeInfo_ProtoEncoder implements InterfaceC1132110fZB<User.ComboBadgeInfo> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, User.ComboBadgeInfo comboBadgeInfo) {
        User.ComboBadgeInfo comboBadgeInfo2 = comboBadgeInfo;
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 1, comboBadgeInfo2.icon);
        long j = comboBadgeInfo2.comboCount;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJFF(j);
    }
}
