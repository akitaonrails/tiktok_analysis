package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1AP9, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AP9 {
    public static String LIZ(int i) {
        switch (i) {
            case -1:
                return "SCREEN_ORIENTATION_UNSPECIFIED";
            case 0:
                return "SCREEN_ORIENTATION_LANDSCAPE";
            case 1:
                return "SCREEN_ORIENTATION_PORTRAIT";
            case 2:
                return "SCREEN_ORIENTATION_USER";
            case 3:
                return "SCREEN_ORIENTATION_BEHIND";
            case 4:
                return "SCREEN_ORIENTATION_SENSOR";
            case 5:
                return "SCREEN_ORIENTATION_NOSENSOR";
            case 6:
                return "SCREEN_ORIENTATION_SENSOR_LANDSCAPE";
            case 7:
                return "SCREEN_ORIENTATION_SENSOR_PORTRAIT";
            case 8:
                return "SCREEN_ORIENTATION_REVERSE_LANDSCAPE";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "SCREEN_ORIENTATION_REVERSE_PORTRAIT";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "SCREEN_ORIENTATION_FULL_SENSOR";
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "SCREEN_ORIENTATION_USER_LANDSCAPE";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return "SCREEN_ORIENTATION_USER_PORTRAIT";
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return "SCREEN_ORIENTATION_FULL_USER";
            case 14:
                return "SCREEN_ORIENTATION_LOCKED";
            default:
                return Integer.toString(i);
        }
    }
}
