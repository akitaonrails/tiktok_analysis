package com.bytedance.android.live.base.model.user;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _PaddingInfo_ProtoEncoder implements InterfaceC1132110fZB<PaddingInfo> {
    public static int LIZJ(PaddingInfo paddingInfo) {
        if (paddingInfo == null) {
            return 0;
        }
        return C1142340fpg.LJI(1) + C1142340fpg.LJIIIZ(2, paddingInfo.middlePadding) + C1142340fpg.LJIIIZ(3, paddingInfo.badgeWidth) + C1142340fpg.LJIIIZ(4, paddingInfo.leftPadding) + C1142340fpg.LJIIIZ(5, paddingInfo.rightPadding) + C1142340fpg.LJIIIZ(6, paddingInfo.iconTopPadding) + C1142340fpg.LJIIIZ(7, paddingInfo.iconBottomPadding) + C1142340fpg.LJIIIZ(8, paddingInfo.horizontalPaddingRule) + C1142340fpg.LJIIIZ(9, paddingInfo.verticalPaddingRule);
    }

    public static void LIZIZ(C1142350fph c1142350fph, PaddingInfo paddingInfo) {
        boolean z = paddingInfo.useSpecific;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJ(z ? 1 : 0);
        int i = paddingInfo.middlePadding;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LIZJ(i);
        int i2 = paddingInfo.badgeWidth;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LIZJ(i2);
        int i3 = paddingInfo.leftPadding;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LIZJ(i3);
        int i4 = paddingInfo.rightPadding;
        c1142350fph.LIZLLL(5, 0);
        c1142350fph.LIZJ(i4);
        int i5 = paddingInfo.iconTopPadding;
        c1142350fph.LIZLLL(6, 0);
        c1142350fph.LIZJ(i5);
        int i6 = paddingInfo.iconBottomPadding;
        c1142350fph.LIZLLL(7, 0);
        c1142350fph.LIZJ(i6);
        int i7 = paddingInfo.horizontalPaddingRule;
        c1142350fph.LIZLLL(8, 0);
        c1142350fph.LIZJ(i7);
        int i8 = paddingInfo.verticalPaddingRule;
        c1142350fph.LIZLLL(9, 0);
        c1142350fph.LIZJ(i8);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, PaddingInfo paddingInfo) {
        LIZIZ(c1142350fph, paddingInfo);
    }
}
