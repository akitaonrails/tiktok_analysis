package com.bytedance.android.live.base.model.user;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BadgeStruct_ProtoDecoder implements C0IMD<BadgeStruct> {
    public static BadgeStruct LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BadgeStruct badgeStruct = new BadgeStruct();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        badgeStruct.badgeDisplayType = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        badgeStruct.badgePriorityType = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        badgeStruct.badgeScene = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        badgeStruct.position = Integer.valueOf(c1516680pZS.LJIIJ());
                        break;
                    case 5:
                        badgeStruct.displayStatus = Integer.valueOf(c1516680pZS.LJIIJ());
                        break;
                    case 6:
                        badgeStruct.greyedByClient = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        badgeStruct.exhibitionType = c1516680pZS.LJIIJ();
                        break;
                    default:
                        switch (iLJI) {
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                badgeStruct.schemaUrl = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case BdTuring.TYPE_EMAIL /* 11 */:
                                badgeStruct.display = C1516700pZU.LIZ(c1516680pZS);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                badgeStruct.logExtra = _PrivilegeLogExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            default:
                                switch (iLJI) {
                                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                        badgeStruct.imageBadge = _ImageBadge_ProtoDecoder.LIZLLL(c1516680pZS);
                                        break;
                                    case 21:
                                        badgeStruct.textBadge = _TextBadge_ProtoDecoder.LIZLLL(c1516680pZS);
                                        break;
                                    case 22:
                                        badgeStruct.stringBadge = _StringBadge_ProtoDecoder.LIZLLL(c1516680pZS);
                                        break;
                                    case 23:
                                        badgeStruct.combineBadgeStruct = _CombineBadgeStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                                        break;
                                    case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                        badgeStruct.isCustomized = C1516700pZU.LIZ(c1516680pZS);
                                        break;
                                    default:
                                        C1516700pZU.LJ(c1516680pZS);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return badgeStruct;
            }
        }
    }

    public static void LJ(BadgeStruct badgeStruct) {
        ImageModel imageModel;
        ImageBadge imageBadge = badgeStruct.imageBadge;
        if (imageBadge != null && (imageModel = imageBadge.imageModel) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        TextBadge textBadge = badgeStruct.textBadge;
        if (textBadge != null && textBadge.pieces == null) {
            textBadge.pieces = new ArrayList();
        }
        CombineBadgeStruct combineBadgeStruct = badgeStruct.combineBadgeStruct;
        if (combineBadgeStruct != null) {
            _CombineBadgeStruct_ProtoDecoder.LJ(combineBadgeStruct);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BadgeStruct badgeStruct) {
        LJ(badgeStruct);
    }

    @Override // X.C0IMD
    public final BadgeStruct LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BadgeStruct badgeStruct, List list) {
    }
}
