package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03fN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C899503fN {
    public static final Map<String, Integer> LIZ = C2097608Jq.LJIIIIZZ(new Pair("sns", 2), new Pair("bidding", 3), new Pair("auction", 4));

    public static final String LIZ(CommuteType commuteType) {
        switch (C899403fM.LIZ[commuteType.ordinal()]) {
            case 1:
                return "1";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "6";
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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return "13";
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return "14";
            case 14:
                return "15";
            case 15:
                return "16";
            case 16:
                return "17";
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return "19";
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return "20";
            default:
                throw new C1954807lC();
        }
    }

    public static final boolean LIZJ(C887503dR c887503dR) {
        if (C770702zh.LIZIZ(c887503dR.LIZ) && C770702zh.LIZIZ(c887503dR.LIZJ)) {
            if ((Intrinsics.LJFF(c887503dR.LJFF, "membership") || C770702zh.LIZIZ(c887503dR.LIZLLL)) && C770702zh.LIZIZ(c887503dR.LJ) && C770702zh.LIZIZ(c887503dR.LJFF)) {
                if (Intrinsics.LJFF(c887503dR.LJFF, "membership") || C770702zh.LIZIZ(c887503dR.LJI)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean LIZIZ(PaymentMethod paymentMethod, PaymentMethod paymentMethod2) {
        if (paymentMethod2 == null) {
            if (paymentMethod == null) {
                return true;
            }
            return false;
        }
        if (paymentMethod != null) {
            return Intrinsics.LJFF(paymentMethod.LJIIJ(), paymentMethod2.LJIIJ());
        }
        return false;
    }
}
