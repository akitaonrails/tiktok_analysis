package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0Tdd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C751350Tdd {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(int i) {
        switch (i) {
            case 1:
                return "comment_setting";
            case 2:
                return "mute";
            case 3:
                return "block";
            case 4:
                return "pin_comment";
            case 5:
                return "product_management";
            case 6:
                return "promotion";
            case 7:
                return "realtime_data";
            case 8:
                return "multi_guest";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "star_comment";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "subscription_pin_card";
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "sub_only_live_access";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return "polls_and_votes";
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return "sub_only_chats_access";
            case 14:
            case 15:
            default:
                return "";
            case 16:
                return "guessing_game";
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return "live_recording";
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return "service_plus_pin_card";
        }
    }

    public static String LIZ(EnumC748580TYa enumC748580TYa) {
        int i = C748640TYg.LIZ[enumC748580TYa.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return "";
            }
            return "manage_page";
        }
        return "suggested_page";
    }
}
