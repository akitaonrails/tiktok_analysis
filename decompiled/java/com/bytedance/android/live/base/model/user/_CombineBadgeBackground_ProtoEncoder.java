package com.bytedance.android.live.base.model.user;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;

/* JADX INFO: loaded from: classes18.dex */
public final class _CombineBadgeBackground_ProtoEncoder implements InterfaceC1132110fZB<CombineBadgeBackground> {
    public static int LIZLLL(CombineBadgeBackground combineBadgeBackground) {
        int iLIZIZ = 0;
        if (combineBadgeBackground == null) {
            return 0;
        }
        int iLJ = _ImageModel_ProtoEncoder.LJ(1, combineBadgeBackground.image) + C1142340fpg.LJIILL(2, combineBadgeBackground.backgroundColorCode) + C1142340fpg.LJIILL(3, combineBadgeBackground.borderColorCode);
        StretchableBackgroundImage stretchableBackgroundImage = combineBadgeBackground.stretchableBackgroundImage;
        if (stretchableBackgroundImage != null) {
            int iLIZJ = _StretchableBackgroundImage_ProtoEncoder.LIZJ(stretchableBackgroundImage);
            iLIZIZ = iLIZJ + C1142350fph.LIZIZ(iLIZJ) + C1142350fph.LIZ(4);
        }
        return iLJ + iLIZIZ + _ImageModel_ProtoEncoder.LJ(5, combineBadgeBackground.leftSideImage);
    }

    public static void LIZIZ(C1142350fph c1142350fph, CombineBadgeBackground combineBadgeBackground) {
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 1, combineBadgeBackground.image);
        C1142340fpg.LJFF(c1142350fph, 2, combineBadgeBackground.backgroundColorCode);
        C1142340fpg.LJFF(c1142350fph, 3, combineBadgeBackground.borderColorCode);
        StretchableBackgroundImage stretchableBackgroundImage = combineBadgeBackground.stretchableBackgroundImage;
        if (stretchableBackgroundImage != null) {
            c1142350fph.LIZLLL(4, 2);
            c1142350fph.LJ(_StretchableBackgroundImage_ProtoEncoder.LIZJ(stretchableBackgroundImage));
            _StretchableBackgroundImage_ProtoEncoder.LIZIZ(c1142350fph, stretchableBackgroundImage);
        }
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 5, combineBadgeBackground.leftSideImage);
    }

    public static int LJ(int i, CombineBadgeBackground combineBadgeBackground) {
        if (combineBadgeBackground == null) {
            return 0;
        }
        int iLIZLLL = LIZLLL(combineBadgeBackground);
        return iLIZLLL + C1142350fph.LIZIZ(iLIZLLL) + C1142350fph.LIZ(i);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, CombineBadgeBackground combineBadgeBackground) {
        LIZIZ(c1142350fph, combineBadgeBackground);
    }

    public static void LIZJ(C1142350fph c1142350fph, int i, CombineBadgeBackground combineBadgeBackground) {
        if (combineBadgeBackground == null) {
            return;
        }
        c1142350fph.LIZLLL(i, 2);
        c1142350fph.LJ(LIZLLL(combineBadgeBackground));
        LIZIZ(c1142350fph, combineBadgeBackground);
    }
}
