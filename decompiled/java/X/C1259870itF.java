package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0itF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1259870itF {
    public static String LIZ(int i) {
        if (i == 0) {
            return "output";
        }
        if (i == 1) {
            return "like";
        }
        if (i == 3) {
            return "music";
        }
        if (i == 4) {
            return "favorite";
        }
        if (i == 6) {
            return "effect";
        }
        if (i == 8) {
            return "favorite";
        }
        if (i == 26) {
            return "history";
        }
        switch (i) {
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return "recommend";
            case 14:
                return "private";
            case 15:
                return "repost";
            case 16:
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return "shop";
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return "ghost_music_tab";
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return "repost_history";
            case 19:
                return "stickers";
            case 21:
                return "business_page";
            case 22:
                return "series";
            case 23:
                return "game";
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return "cameo";
            default:
                return "";
        }
    }
}
