package com.bytedance.android.live.base.model.user;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes18.dex */
public final class _User_CreatorScoreLabelInfo_ProtoEncoder implements InterfaceC1132110fZB<User.CreatorScoreLabelInfo> {
    public static int LIZJ(User.CreatorScoreLabelInfo creatorScoreLabelInfo) {
        int iLIZ = 0;
        int iLJIILL = C1142340fpg.LJIILL(1, creatorScoreLabelInfo.labelText) + C1142340fpg.LJIILL(2, creatorScoreLabelInfo.labelTextColorDark) + C1142340fpg.LJIILL(3, creatorScoreLabelInfo.labelTextColorLight) + _ImageModel_ProtoEncoder.LJ(4, creatorScoreLabelInfo.logoDark) + _ImageModel_ProtoEncoder.LJ(5, creatorScoreLabelInfo.logoLight);
        User.PopUpInfo popUpInfo = creatorScoreLabelInfo.popUpInfo;
        if (popUpInfo != null) {
            int iLJIILL2 = C1142340fpg.LJIILL(1, popUpInfo.title) + C1142340fpg.LJIILL(2, popUpInfo.description);
            iLIZ = C1142350fph.LIZ(6) + iLJIILL2 + C1142350fph.LIZIZ(iLJIILL2);
        }
        return iLJIILL + iLIZ;
    }

    public static void LIZIZ(C1142350fph c1142350fph, User.CreatorScoreLabelInfo creatorScoreLabelInfo) {
        C1142340fpg.LJFF(c1142350fph, 1, creatorScoreLabelInfo.labelText);
        C1142340fpg.LJFF(c1142350fph, 2, creatorScoreLabelInfo.labelTextColorDark);
        C1142340fpg.LJFF(c1142350fph, 3, creatorScoreLabelInfo.labelTextColorLight);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 4, creatorScoreLabelInfo.logoDark);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 5, creatorScoreLabelInfo.logoLight);
        User.PopUpInfo popUpInfo = creatorScoreLabelInfo.popUpInfo;
        if (popUpInfo != null) {
            c1142350fph.LIZLLL(6, 2);
            c1142350fph.LJ(C1142340fpg.LJIILL(1, popUpInfo.title) + C1142340fpg.LJIILL(2, popUpInfo.description));
            C1142340fpg.LJFF(c1142350fph, 1, popUpInfo.title);
            C1142340fpg.LJFF(c1142350fph, 2, popUpInfo.description);
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, User.CreatorScoreLabelInfo creatorScoreLabelInfo) {
        LIZIZ(c1142350fph, creatorScoreLabelInfo);
    }
}
