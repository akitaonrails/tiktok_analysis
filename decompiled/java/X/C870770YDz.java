package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0YDz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C870770YDz {
    public static String LIZ(int i) {
        if (i == 0) {
            return "init";
        }
        if (i == 6) {
            return "token";
        }
        if (i == 2) {
            return "cursor";
        }
        if (i == 3) {
            return "net";
        }
        if (i == 4) {
            return "manual";
        }
        switch (i) {
            case 8:
                return "polling";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "migrate";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "switch_to_foreground";
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "no_ws";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return "stranger";
            default:
                return "other";
        }
    }
}
