package com.bytedance.android.live.base.model.user;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes34.dex */
public final class _FollowInfo_ProtoEncoder implements InterfaceC1132110fZB<FollowInfo> {
    public static int LIZJ(FollowInfo followInfo) {
        return C1142340fpg.LJIIL(1, followInfo.followingCount) + C1142340fpg.LJIIL(2, followInfo.followerCount) + C1142340fpg.LJIIL(3, followInfo.followStatus) + C1142340fpg.LJIIL(4, followInfo.pushStatus);
    }

    public static void LIZIZ(C1142350fph c1142350fph, FollowInfo followInfo) {
        long j = followInfo.followingCount;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        long j2 = followInfo.followerCount;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJFF(j2);
        long j3 = followInfo.followStatus;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJFF(j3);
        long j4 = followInfo.pushStatus;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJFF(j4);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, FollowInfo followInfo) {
        LIZIZ(c1142350fph, followInfo);
    }
}
