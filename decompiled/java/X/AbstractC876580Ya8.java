package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0Ya8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC876580Ya8 {
    public static String LIZ(int i) {
        switch (i) {
            case -1:
                return "default_source";
            case 0:
                return "online";
            case 1:
                return "load_more";
            case 2:
                return "init";
            case 3:
                return "mix_link";
            case 4:
                return "recent_link";
            case 5:
                return "cmd_link";
            case 6:
                return "index_v2_link";
            case 7:
                return "single_pull_msg";
            case 8:
                return "refresh_by_id";
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            default:
                return "unknown";
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "load_newer";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return "msg_in_conv_with_range";
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return "outer_push";
            case 14:
                return "msg_in_conv_around_index";
            case 15:
                return "single_pull_msg_repair";
        }
    }
}
