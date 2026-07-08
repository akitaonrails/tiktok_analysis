package com.bytedance.android.live.base.model.user;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CombineBadgeStruct_ProtoDecoder implements C0IMD<CombineBadgeStruct> {
    public static CombineBadgeStruct LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CombineBadgeStruct combineBadgeStruct = new CombineBadgeStruct();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        combineBadgeStruct.badgeDisplayType = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        combineBadgeStruct.icon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        combineBadgeStruct.text = _BadgeText_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        combineBadgeStruct.str = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        combineBadgeStruct.padding = _PaddingInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        combineBadgeStruct.fontStyle = _FontStyle_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        combineBadgeStruct.profileCardPanel = _ProfileCardPanel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                    case BdTuring.TYPE_ECAF /* 9 */:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        combineBadgeStruct.background = _CombineBadgeBackground_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        combineBadgeStruct.backgroundDarkMode = _CombineBadgeBackground_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        combineBadgeStruct.iconAutoMirrored = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                        break;
                    case 14:
                        combineBadgeStruct.bgAutoMirrored = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                        break;
                    case 15:
                        combineBadgeStruct.publicScreenShowStyle = Integer.valueOf(c1516680pZS.LJIIJ());
                        break;
                    case 16:
                        combineBadgeStruct.personalCardShowStyle = Integer.valueOf(c1516680pZS.LJIIJ());
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        combineBadgeStruct.rankListOnlineAudienceShowStyle = Integer.valueOf(c1516680pZS.LJIIJ());
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        combineBadgeStruct.multiGuestShowStyle = Integer.valueOf(c1516680pZS.LJIIJ());
                        break;
                    case 19:
                        combineBadgeStruct.arrowConfig = _ArrowConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        combineBadgeStruct.paddingNewFont = _PaddingInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return combineBadgeStruct;
            }
        }
    }

    public static void LJ(CombineBadgeStruct combineBadgeStruct) {
        ImageModel imageModel;
        ImageModel imageModel2;
        ImageModel imageModel3 = combineBadgeStruct.icon;
        if (imageModel3 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel3);
        }
        BadgeText badgeText = combineBadgeStruct.text;
        if (badgeText != null && badgeText.pieces == null) {
            badgeText.pieces = new ArrayList();
        }
        ProfileCardPanel profileCardPanel = combineBadgeStruct.profileCardPanel;
        if (profileCardPanel != null) {
            ProjectionConfig projectionConfig = profileCardPanel.projectionConfig;
            if (projectionConfig != null && (imageModel2 = projectionConfig.icon) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel2);
            }
            ProfileContent profileContent = profileCardPanel.profileContent;
            if (profileContent != null) {
                _ProfileContent_ProtoDecoder.LJ(profileContent);
            }
        }
        CombineBadgeBackground combineBadgeBackground = combineBadgeStruct.background;
        if (combineBadgeBackground != null) {
            _CombineBadgeBackground_ProtoDecoder.LJ(combineBadgeBackground);
        }
        CombineBadgeBackground combineBadgeBackground2 = combineBadgeStruct.backgroundDarkMode;
        if (combineBadgeBackground2 != null) {
            _CombineBadgeBackground_ProtoDecoder.LJ(combineBadgeBackground2);
        }
        ArrowConfig arrowConfig = combineBadgeStruct.arrowConfig;
        if (arrowConfig != null && (imageModel = arrowConfig.icon) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CombineBadgeStruct combineBadgeStruct) {
        LJ(combineBadgeStruct);
    }

    @Override // X.C0IMD
    public final CombineBadgeStruct LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CombineBadgeStruct combineBadgeStruct, List list) {
    }
}
