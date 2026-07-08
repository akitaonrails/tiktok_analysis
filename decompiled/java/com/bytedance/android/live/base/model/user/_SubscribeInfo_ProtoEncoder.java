package com.bytedance.android.live.base.model.user;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.android.livesdk.chatroom.api.TimerDetail;
import com.bytedance.android.livesdk.chatroom.api._TimerDetail_ProtoEncoder;
import webcast.data.SubSplitStatus;

/* JADX INFO: loaded from: classes36.dex */
public final class _SubscribeInfo_ProtoEncoder implements InterfaceC1132110fZB<SubscribeInfo> {
    public static int LIZJ(SubscribeInfo subscribeInfo) {
        int iLIZIZ;
        int iLIZIZ2;
        int iLIZ = 0;
        int iLJI = C1142340fpg.LJI(1) + C1142340fpg.LJI(2);
        SubscribeBadge subscribeBadge = subscribeInfo.subscribeBadge;
        if (subscribeBadge == null) {
            iLIZIZ = 0;
        } else {
            int iLIZIZ3 = _SubscribeBadge_ProtoEncoder.LIZIZ(subscribeBadge);
            iLIZIZ = iLIZIZ3 + C1142350fph.LIZIZ(iLIZIZ3) + C1142350fph.LIZ(3);
        }
        int iLJI2 = iLJI + iLIZIZ + C1142340fpg.LJI(4) + C1142340fpg.LJIIL(5, subscribeInfo.subscriberCount) + C1142340fpg.LJI(6) + C1142340fpg.LJI(7);
        TimerDetail timerDetail = subscribeInfo.timerDetail;
        if (timerDetail == null) {
            iLIZIZ2 = 0;
        } else {
            int iLIZJ = _TimerDetail_ProtoEncoder.LIZJ(timerDetail);
            iLIZIZ2 = iLIZJ + C1142350fph.LIZIZ(iLIZJ) + C1142350fph.LIZ(8);
        }
        int iLJI3 = iLJI2 + iLIZIZ2 + C1142340fpg.LJI(9) + C1142340fpg.LJI(10) + C1142340fpg.LJIIIZ(11, subscribeInfo.status) + C1142340fpg.LJIIL(12, subscribeInfo.subEndTime) + C1142340fpg.LJIILL(13, subscribeInfo.packageId) + C1142340fpg.LJIILL(14, subscribeInfo.solRoomDisplayText) + C1142340fpg.LJI(15);
        SubSplitStatus subSplitStatus = subscribeInfo.subSplitStatus;
        if (subSplitStatus != null) {
            int iLJI4 = C1142340fpg.LJI(1) + C1142340fpg.LJIIIZ(2, subSplitStatus.curPeriod);
            iLIZ = C1142350fph.LIZ(101) + iLJI4 + C1142350fph.LIZIZ(iLJI4);
        }
        return iLJI3 + iLIZ;
    }

    public static void LIZIZ(C1142350fph c1142350fph, SubscribeInfo subscribeInfo) {
        boolean z = subscribeInfo.isAnchorQualified;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJ(z ? 1 : 0);
        boolean z2 = subscribeInfo.isSubscribed;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJ(z2 ? 1 : 0);
        SubscribeBadge subscribeBadge = subscribeInfo.subscribeBadge;
        if (subscribeBadge != null) {
            c1142350fph.LIZLLL(3, 2);
            c1142350fph.LJ(_SubscribeBadge_ProtoEncoder.LIZIZ(subscribeBadge));
            _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 3, subscribeBadge.originImage);
            _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 4, subscribeBadge.previewImage);
            boolean z3 = subscribeBadge.isCustomized;
            c1142350fph.LIZLLL(5, 0);
            c1142350fph.LJ(z3 ? 1 : 0);
        }
        boolean z4 = subscribeInfo.anchorEnableSubscription;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJ(z4 ? 1 : 0);
        long j = subscribeInfo.subscriberCount;
        c1142350fph.LIZLLL(5, 0);
        c1142350fph.LJFF(j);
        boolean z5 = subscribeInfo.isInGracePeriod;
        c1142350fph.LIZLLL(6, 0);
        c1142350fph.LJ(z5 ? 1 : 0);
        boolean z6 = subscribeInfo.isSubscribedToCurrentAnchor;
        c1142350fph.LIZLLL(7, 0);
        c1142350fph.LJ(z6 ? 1 : 0);
        TimerDetail timerDetail = subscribeInfo.timerDetail;
        if (timerDetail != null) {
            c1142350fph.LIZLLL(8, 2);
            c1142350fph.LJ(_TimerDetail_ProtoEncoder.LIZJ(timerDetail));
            _TimerDetail_ProtoEncoder.LIZIZ(c1142350fph, timerDetail);
        }
        boolean z7 = subscribeInfo.userGiftSubAuth;
        c1142350fph.LIZLLL(9, 0);
        c1142350fph.LJ(z7 ? 1 : 0);
        boolean z8 = subscribeInfo.anchorGiftSubAuth;
        c1142350fph.LIZLLL(10, 0);
        c1142350fph.LJ(z8 ? 1 : 0);
        int i = subscribeInfo.status;
        c1142350fph.LIZLLL(11, 0);
        c1142350fph.LIZJ(i);
        long j2 = subscribeInfo.subEndTime;
        c1142350fph.LIZLLL(12, 0);
        c1142350fph.LJFF(j2);
        C1142340fpg.LJFF(c1142350fph, 13, subscribeInfo.packageId);
        C1142340fpg.LJFF(c1142350fph, 14, subscribeInfo.solRoomDisplayText);
        boolean z9 = subscribeInfo.isSolEligible;
        c1142350fph.LIZLLL(15, 0);
        c1142350fph.LJ(z9 ? 1 : 0);
        SubSplitStatus subSplitStatus = subscribeInfo.subSplitStatus;
        if (subSplitStatus != null) {
            c1142350fph.LIZLLL(101, 2);
            c1142350fph.LJ(C1142340fpg.LJI(1) + C1142340fpg.LJIIIZ(2, subSplitStatus.curPeriod));
            boolean z10 = subSplitStatus.isOldSubCreator;
            c1142350fph.LIZLLL(1, 0);
            c1142350fph.LJ(z10 ? 1 : 0);
            int i2 = subSplitStatus.curPeriod;
            c1142350fph.LIZLLL(2, 0);
            c1142350fph.LIZJ(i2);
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, SubscribeInfo subscribeInfo) {
        LIZIZ(c1142350fph, subscribeInfo);
    }
}
