package com.bytedance.android.live.base.model.user;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;

/* JADX INFO: loaded from: classes18.dex */
public final class _CombineBadgeStruct_ProtoEncoder implements InterfaceC1132110fZB<CombineBadgeStruct> {
    public static int LIZJ(CombineBadgeStruct combineBadgeStruct) {
        int iLIZIZ;
        int iLIZIZ2;
        int iLIZIZ3;
        int iLIZIZ4;
        int iLIZIZ5 = 0;
        int iLJIIIZ = C1142340fpg.LJIIIZ(1, combineBadgeStruct.badgeDisplayType) + _ImageModel_ProtoEncoder.LJ(2, combineBadgeStruct.icon);
        BadgeText badgeText = combineBadgeStruct.text;
        if (badgeText == null) {
            iLIZIZ = 0;
        } else {
            int iLIZJ = _BadgeText_ProtoEncoder.LIZJ(badgeText);
            iLIZIZ = iLIZJ + C1142350fph.LIZIZ(iLIZJ) + C1142350fph.LIZ(3);
        }
        int iLJIILL = iLJIIIZ + iLIZIZ + C1142340fpg.LJIILL(4, combineBadgeStruct.str);
        PaddingInfo paddingInfo = combineBadgeStruct.padding;
        if (paddingInfo == null) {
            iLIZIZ2 = 0;
        } else {
            int iLIZJ2 = _PaddingInfo_ProtoEncoder.LIZJ(paddingInfo);
            iLIZIZ2 = iLIZJ2 + C1142350fph.LIZIZ(iLIZJ2) + C1142350fph.LIZ(5);
        }
        int iLJ = iLJIILL + iLIZIZ2 + _FontStyle_ProtoEncoder.LJ(6, combineBadgeStruct.fontStyle);
        ProfileCardPanel profileCardPanel = combineBadgeStruct.profileCardPanel;
        if (profileCardPanel == null) {
            iLIZIZ3 = 0;
        } else {
            int iLIZJ3 = _ProfileCardPanel_ProtoEncoder.LIZJ(profileCardPanel);
            iLIZIZ3 = iLIZJ3 + C1142350fph.LIZIZ(iLIZJ3) + C1142350fph.LIZ(7);
        }
        int iLJ2 = iLJ + iLIZIZ3 + _CombineBadgeBackground_ProtoEncoder.LJ(11, combineBadgeStruct.background) + _CombineBadgeBackground_ProtoEncoder.LJ(12, combineBadgeStruct.backgroundDarkMode) + C1142340fpg.LJII(13, combineBadgeStruct.iconAutoMirrored) + C1142340fpg.LJII(14, combineBadgeStruct.bgAutoMirrored) + C1142340fpg.LJIIJ(15, combineBadgeStruct.publicScreenShowStyle) + C1142340fpg.LJIIJ(16, combineBadgeStruct.personalCardShowStyle) + C1142340fpg.LJIIJ(17, combineBadgeStruct.rankListOnlineAudienceShowStyle) + C1142340fpg.LJIIJ(18, combineBadgeStruct.multiGuestShowStyle);
        ArrowConfig arrowConfig = combineBadgeStruct.arrowConfig;
        if (arrowConfig == null) {
            iLIZIZ4 = 0;
        } else {
            int iLJ3 = _ImageModel_ProtoEncoder.LJ(1, arrowConfig.icon);
            iLIZIZ4 = iLJ3 + C1142350fph.LIZIZ(iLJ3) + C1142350fph.LIZ(19);
        }
        int i = iLJ2 + iLIZIZ4;
        PaddingInfo paddingInfo2 = combineBadgeStruct.paddingNewFont;
        if (paddingInfo2 != null) {
            int iLIZJ4 = _PaddingInfo_ProtoEncoder.LIZJ(paddingInfo2);
            iLIZIZ5 = iLIZJ4 + C1142350fph.LIZIZ(iLIZJ4) + C1142350fph.LIZ(20);
        }
        return i + iLIZIZ5;
    }

    public static void LIZIZ(C1142350fph c1142350fph, CombineBadgeStruct combineBadgeStruct) {
        int i = combineBadgeStruct.badgeDisplayType;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LIZJ(i);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 2, combineBadgeStruct.icon);
        BadgeText badgeText = combineBadgeStruct.text;
        if (badgeText != null) {
            c1142350fph.LIZLLL(3, 2);
            c1142350fph.LJ(_BadgeText_ProtoEncoder.LIZJ(badgeText));
            _BadgeText_ProtoEncoder.LIZIZ(c1142350fph, badgeText);
        }
        C1142340fpg.LJFF(c1142350fph, 4, combineBadgeStruct.str);
        PaddingInfo paddingInfo = combineBadgeStruct.padding;
        if (paddingInfo != null) {
            c1142350fph.LIZLLL(5, 2);
            c1142350fph.LJ(_PaddingInfo_ProtoEncoder.LIZJ(paddingInfo));
            _PaddingInfo_ProtoEncoder.LIZIZ(c1142350fph, paddingInfo);
        }
        _FontStyle_ProtoEncoder.LIZJ(c1142350fph, 6, combineBadgeStruct.fontStyle);
        ProfileCardPanel profileCardPanel = combineBadgeStruct.profileCardPanel;
        if (profileCardPanel != null) {
            c1142350fph.LIZLLL(7, 2);
            c1142350fph.LJ(_ProfileCardPanel_ProtoEncoder.LIZJ(profileCardPanel));
            _ProfileCardPanel_ProtoEncoder.LIZIZ(c1142350fph, profileCardPanel);
        }
        _CombineBadgeBackground_ProtoEncoder.LIZJ(c1142350fph, 11, combineBadgeStruct.background);
        _CombineBadgeBackground_ProtoEncoder.LIZJ(c1142350fph, 12, combineBadgeStruct.backgroundDarkMode);
        C1142340fpg.LIZ(c1142350fph, 13, combineBadgeStruct.iconAutoMirrored);
        C1142340fpg.LIZ(c1142350fph, 14, combineBadgeStruct.bgAutoMirrored);
        C1142340fpg.LIZLLL(c1142350fph, 15, combineBadgeStruct.publicScreenShowStyle);
        C1142340fpg.LIZLLL(c1142350fph, 16, combineBadgeStruct.personalCardShowStyle);
        C1142340fpg.LIZLLL(c1142350fph, 17, combineBadgeStruct.rankListOnlineAudienceShowStyle);
        C1142340fpg.LIZLLL(c1142350fph, 18, combineBadgeStruct.multiGuestShowStyle);
        ArrowConfig arrowConfig = combineBadgeStruct.arrowConfig;
        if (arrowConfig != null) {
            c1142350fph.LIZLLL(19, 2);
            c1142350fph.LJ(_ImageModel_ProtoEncoder.LJ(1, arrowConfig.icon));
            _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 1, arrowConfig.icon);
        }
        PaddingInfo paddingInfo2 = combineBadgeStruct.paddingNewFont;
        if (paddingInfo2 != null) {
            c1142350fph.LIZLLL(20, 2);
            c1142350fph.LJ(_PaddingInfo_ProtoEncoder.LIZJ(paddingInfo2));
            _PaddingInfo_ProtoEncoder.LIZIZ(c1142350fph, paddingInfo2);
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, CombineBadgeStruct combineBadgeStruct) {
        LIZIZ(c1142350fph, combineBadgeStruct);
    }
}
