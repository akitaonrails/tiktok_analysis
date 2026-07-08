package com.bytedance.android.live.base.model.user;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model.user.User;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class _User_CreatorScoreProfile_ProtoEncoder implements InterfaceC1132110fZB<User.CreatorScoreProfile> {
    public static int LIZJ(User.CreatorScoreProfile creatorScoreProfile) {
        int iLIZIZ = 0;
        int iLJIIIIZZ = C1142340fpg.LJIIIIZZ(1) + C1142340fpg.LJIILL(3, creatorScoreProfile.countryCode);
        User.CreatorScoreDisplayInfo creatorScoreDisplayInfo = creatorScoreProfile.displayInfo;
        if (creatorScoreDisplayInfo != null) {
            int iLIZJ = _User_CreatorScoreDisplayInfo_ProtoEncoder.LIZJ(creatorScoreDisplayInfo);
            iLIZIZ = iLIZJ + C1142350fph.LIZIZ(iLIZJ) + C1142350fph.LIZ(4);
        }
        int iLIZIZ2 = iLJIIIIZZ + iLIZIZ;
        Map<String, String> map = creatorScoreProfile.scoreInfoExtra;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : creatorScoreProfile.scoreInfoExtra.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    int iLJIILL = C1142340fpg.LJIILL(1, entry.getKey()) + C1142340fpg.LJIILL(2, entry.getValue());
                    iLIZIZ2 += iLJIILL + C1142350fph.LIZIZ(iLJIILL) + C1142350fph.LIZ(5);
                }
            }
        }
        return iLIZIZ2;
    }

    public static void LIZIZ(C1142350fph c1142350fph, User.CreatorScoreProfile creatorScoreProfile) {
        C1142340fpg.LIZIZ(c1142350fph, 1, creatorScoreProfile.finalScore);
        C1142340fpg.LJFF(c1142350fph, 3, creatorScoreProfile.countryCode);
        User.CreatorScoreDisplayInfo creatorScoreDisplayInfo = creatorScoreProfile.displayInfo;
        if (creatorScoreDisplayInfo != null) {
            c1142350fph.LIZLLL(4, 2);
            c1142350fph.LJ(_User_CreatorScoreDisplayInfo_ProtoEncoder.LIZJ(creatorScoreDisplayInfo));
            _User_CreatorScoreDisplayInfo_ProtoEncoder.LIZIZ(c1142350fph, creatorScoreDisplayInfo);
        }
        Map<String, String> map = creatorScoreProfile.scoreInfoExtra;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : creatorScoreProfile.scoreInfoExtra.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    c1142350fph.LIZLLL(5, 2);
                    c1142350fph.LJ(C1142340fpg.LJIILL(1, entry.getKey()) + C1142340fpg.LJIILL(2, entry.getValue()));
                    C1142340fpg.LJFF(c1142350fph, 1, entry.getKey());
                    C1142340fpg.LJFF(c1142350fph, 2, entry.getValue());
                }
            }
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, User.CreatorScoreProfile creatorScoreProfile) {
        LIZIZ(c1142350fph, creatorScoreProfile);
    }
}
