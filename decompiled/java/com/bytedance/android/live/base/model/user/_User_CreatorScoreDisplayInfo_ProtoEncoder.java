package com.bytedance.android.live.base.model.user;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes18.dex */
public final class _User_CreatorScoreDisplayInfo_ProtoEncoder implements InterfaceC1132110fZB<User.CreatorScoreDisplayInfo> {
    public static int LIZJ(User.CreatorScoreDisplayInfo creatorScoreDisplayInfo) {
        int iLIZIZ;
        User.CreatorScoreLabelInfo creatorScoreLabelInfo = creatorScoreDisplayInfo.ecommerceEntranceLabel;
        if (creatorScoreLabelInfo == null) {
            iLIZIZ = 0;
        } else {
            int iLIZJ = _User_CreatorScoreLabelInfo_ProtoEncoder.LIZJ(creatorScoreLabelInfo);
            iLIZIZ = iLIZJ + C1142350fph.LIZIZ(iLIZJ) + C1142350fph.LIZ(1);
        }
        return iLIZIZ + C1142340fpg.LJIIIZ(2, creatorScoreDisplayInfo.scoreLevel);
    }

    public static void LIZIZ(C1142350fph c1142350fph, User.CreatorScoreDisplayInfo creatorScoreDisplayInfo) {
        User.CreatorScoreLabelInfo creatorScoreLabelInfo = creatorScoreDisplayInfo.ecommerceEntranceLabel;
        if (creatorScoreLabelInfo != null) {
            c1142350fph.LIZLLL(1, 2);
            c1142350fph.LJ(_User_CreatorScoreLabelInfo_ProtoEncoder.LIZJ(creatorScoreLabelInfo));
            _User_CreatorScoreLabelInfo_ProtoEncoder.LIZIZ(c1142350fph, creatorScoreLabelInfo);
        }
        int i = creatorScoreDisplayInfo.scoreLevel;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LIZJ(i);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, User.CreatorScoreDisplayInfo creatorScoreDisplayInfo) {
        LIZIZ(c1142350fph, creatorScoreDisplayInfo);
    }
}
