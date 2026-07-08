package com.bytedance.android.live.base.model.user;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes18.dex */
public final class _User_FansClubInfo_ProtoEncoder implements InterfaceC1132110fZB<User.FansClubInfo> {
    public static int LIZJ(User.FansClubInfo fansClubInfo) {
        return C1142340fpg.LJI(1) + C1142340fpg.LJIIL(2, fansClubInfo.fansLevel) + C1142340fpg.LJIIL(3, fansClubInfo.fansScore) + _ImageModel_ProtoEncoder.LJ(4, fansClubInfo.badge) + C1142340fpg.LJIIL(5, fansClubInfo.fansCount) + C1142340fpg.LJIILL(6, fansClubInfo.fansClubName);
    }

    public static void LIZIZ(C1142350fph c1142350fph, User.FansClubInfo fansClubInfo) {
        boolean z = fansClubInfo.isSleeping;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJ(z ? 1 : 0);
        long j = fansClubInfo.fansLevel;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJFF(j);
        long j2 = fansClubInfo.fansScore;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJFF(j2);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 4, fansClubInfo.badge);
        long j3 = fansClubInfo.fansCount;
        c1142350fph.LIZLLL(5, 0);
        c1142350fph.LJFF(j3);
        C1142340fpg.LJFF(c1142350fph, 6, fansClubInfo.fansClubName);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, User.FansClubInfo fansClubInfo) {
        LIZIZ(c1142350fph, fansClubInfo);
    }
}
