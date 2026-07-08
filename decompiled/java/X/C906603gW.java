package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResult;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.03gW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C906603gW {
    public static final String LIZ(PayResult payResult) {
        if (payResult == null) {
            return null;
        }
        switch (C906503gV.LIZ[payResult.ordinal()]) {
            case 1:
                return "1";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "7";
            case 7:
                return "8";
            case 8:
                return "9";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "10";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "11";
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "12";
            default:
                return null;
        }
    }
}
