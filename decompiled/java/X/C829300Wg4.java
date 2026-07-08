package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0Wg4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C829300Wg4 {
    public static String LIZ(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case BdTuring.TYPE_ECAF /* 9 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            default:
                return "unknown status code: " + i;
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "DEVELOPER_ERROR";
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return "API_NOT_CONNECTED";
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }
}
