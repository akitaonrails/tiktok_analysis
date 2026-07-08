package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0OfW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C625120OfW {
    public static final String LIZ(EnumC804620VhM enumC804620VhM) {
        switch (C804470Vh7.LIZ[enumC804620VhM.ordinal()]) {
            case 1:
            case 2:
                return "5";
            case 3:
                return "4";
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return "3";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "2";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return "1";
            default:
                throw new C1954807lC();
        }
    }
}
