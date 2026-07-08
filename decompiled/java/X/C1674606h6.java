package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerSceneConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06h6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1674606h6 {
    public static final InterfaceC1677406hY LIZ(C06OO c06oo) {
        C1633306aR c1633306aR;
        PreshownStickerSceneConfig preshownStickerSceneConfig;
        String str = null;
        switch (C1596006Ms.LIZ[c06oo.LIZ.ordinal()]) {
            case 1:
                return EnumC1674706h7.GROUP_JOIN_REQUEST;
            case 2:
                return EnumC1674706h7.MESSAGE_REQUEST;
            case 3:
                return EnumC1674706h7.BLOCKED_USER;
            case 4:
                return EnumC1674706h7.PERMISSION_OFF;
            case 5:
                return EnumC1674706h7.ENABLE_NUDE_FILTER;
            case 6:
            case 7:
                return EnumC1674706h7.CHAT_PERMISSION_UNAVAILABLE;
            case 8:
                return EnumC1674706h7.SEND_MESSAGE_REQUEST;
            case BdTuring.TYPE_ECAF /* 9 */:
                return EnumC1674706h7.MARK_SAFE;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return EnumC1674806h8.READ_RECEIPTS;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return EnumC1641806bo.SA_POST_GENERATION_STICKERS;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                if ((c06oo instanceof C1633306aR) && (c1633306aR = (C1633306aR) c06oo) != null && (preshownStickerSceneConfig = c1633306aR.LIZJ) != null) {
                    str = preshownStickerSceneConfig.sceneId;
                }
                if (!Intrinsics.LJFF(str, "new_chats_say_hi") && !Intrinsics.LJFF(str, "new_group_chats_say_hi")) {
                    return EnumC1670906gV.PRE_SHOWN_STICKER;
                }
                return EnumC1641806bo.SAY_HI_NEW_CHAT;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                C1675106hB.LIZ.getClass();
                if (C1675106hB.LIZ().variant == 1) {
                    return EnumC1674506h5.STREAKS_PUSH_PERMISSION_SHEET;
                }
                if (C1675106hB.LIZJ()) {
                    return EnumC1674506h5.DM_PUSH_PERMISSION_INLINE_MESSAGE;
                }
                if (C1679506ht.LIZ.LJI() < 3) {
                    return EnumC1674506h5.STREAKS_PUSH_PERMISSION_SHEET;
                }
                return EnumC1674506h5.DM_PUSH_PERMISSION_INLINE_MESSAGE;
            case 14:
                return EnumC1674806h8.RECENT_ACTIVITY_FROM_INBOX;
            case 15:
                return EnumC1641806bo.RECENT_ACTIVITY;
            case 16:
                return EnumC1674806h8.STORY_FRIEND_ANNIVERSARY_FROM_INBOX;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return EnumC1674506h5.DM_PUSH_PERMISSION_SHEET;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return EnumC1674506h5.FOLLOW_BACK_GUIDANCE;
            case 19:
                return EnumC1674806h8.AI_GROUP_SHOT_CREATE_GROUP;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return EnumC1674506h5.SMART_REPLY_INTRO_REQUEST;
            case 21:
                return EnumC1641806bo.GROUP_SHARE_POST_BANNER;
            case 22:
                return EnumC1674506h5.AI_GROUP_SHOT_PROMOTIONAL;
            case 23:
                return EnumC1674506h5.WHEE_BUBBLE_BANNER;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return EnumC1674506h5.GAME_CHALLENGE_PROMOTIONAL;
            case 25:
                return EnumC1674506h5.PERSONALIZED_TYPING_RECOMMENDATION_INTRO;
            case 26:
                return EnumC1674506h5.GUIDE_TO_NAME_GROUP;
            case 27:
                return EnumC1674706h7.COLLABORATIVE_COLLECTION_POP_UP;
            case 28:
                return EnumC1674506h5.STREAK_EXCLUSIVE_OUTFIT_FOR_WHEE;
            case 29:
            case 30:
            case 31:
            case 32:
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
            case 35:
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
            case 51:
            case 52:
                return null;
            default:
                throw new C1954807lC();
        }
    }
}
