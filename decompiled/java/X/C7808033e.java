package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.033e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7808033e {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(int i) {
        if (i == 21) {
            return "payment_promotion_discount";
        }
        switch (i) {
            case 1:
                return "sub_total";
            case 2:
                return "tax";
            case 3:
                return "shipping_fee";
            case 4:
                return "coupon";
            case 5:
                return "payment_discount";
            case 6:
                return "seller_coupon";
            case 7:
                return "total_discount";
            case 8:
                return "shipping_fee_platform_coupon";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "drop_off_fee";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "small_order_fee";
            default:
                switch (i) {
                    case 16:
                        return "shipping_real_fee";
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        return "shipping_original_fee";
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        return "shipping_fee_discount";
                    default:
                        return "";
                }
        }
    }
}
