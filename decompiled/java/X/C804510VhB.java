package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0VhB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C804510VhB {
    public static String LIZ() {
        EnumC804620VhM enumC804620VhME3 = C786410Ut5.e3(C497740JfY.LJII());
        if (enumC804620VhME3 == null) {
            return "";
        }
        switch (C804500VhA.LIZ[enumC804620VhME3.ordinal()]) {
            case 1:
            case 2:
                return "none";
            case 3:
                return "mobile";
            case 4:
                return "2g";
            case 5:
            case 6:
            case 7:
                return "3g";
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "wifi";
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "4g";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return "5g";
            default:
                return "";
        }
    }
}
