package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastBackgroundPhase2;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eny, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1102840eny {
    public static final Integer LIZ(EnumC1102750enp enumC1102750enp) {
        int i;
        switch (C1102770enr.LIZ[enumC1102750enp.ordinal()]) {
            case 1:
                return Integer.valueOf(R.drawable.ex7);
            case 2:
                return Integer.valueOf(R.drawable.ely);
            case 3:
                return Integer.valueOf(R.drawable.eru);
            case 4:
                return Integer.valueOf(R.drawable.eow);
            case 5:
                return Integer.valueOf(R.drawable.elh);
            case 6:
                return Integer.valueOf(R.drawable.eud);
            case 7:
                return Integer.valueOf(R.drawable.eyv);
            case 8:
                return Integer.valueOf(R.drawable.eyr);
            case BdTuring.TYPE_ECAF /* 9 */:
                return Integer.valueOf(R.drawable.eq3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return Integer.valueOf(R.drawable.esi);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return Integer.valueOf(R.drawable.eng);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return Integer.valueOf(R.drawable.f656ez6);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return Integer.valueOf(R.drawable.eyh);
            case 14:
                return Integer.valueOf(R.drawable.esd);
            case 15:
                return Integer.valueOf(R.drawable.eog);
            case 16:
                if (LiveBroadcastBackgroundPhase2.enable()) {
                    i = R.attr.cjf;
                } else {
                    i = R.drawable.ena;
                }
                return Integer.valueOf(i);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return Integer.valueOf(R.drawable.ew0);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return Integer.valueOf(R.drawable.eod);
            case 19:
                return Integer.valueOf(R.drawable.eoa);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return Integer.valueOf(R.drawable.el1);
            case 21:
                return Integer.valueOf(R.attr.czi);
            case 22:
                return Integer.valueOf(R.attr.efc);
            case 23:
                return Integer.valueOf(R.attr.czd);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return Integer.valueOf(R.drawable.ew6);
            case 25:
                return Integer.valueOf(R.drawable.eyp);
            case 26:
                return Integer.valueOf(R.attr.dwh);
            default:
                return null;
        }
    }

    public static final Integer LIZIZ(EnumC1102750enp enumC1102750enp) {
        int i = C1102770enr.LIZ[enumC1102750enp.ordinal()];
        if (i != 20) {
            switch (i) {
                case 38:
                    return Integer.valueOf(R.layout.hv0);
                case 39:
                    return Integer.valueOf(R.layout.hv3);
                case 40:
                    return Integer.valueOf(R.layout.hvv);
                case 41:
                    return Integer.valueOf(R.layout.h5n);
                case 42:
                    return Integer.valueOf(R.layout.h5n);
                default:
                    return null;
            }
        }
        return Integer.valueOf(R.layout.h5n);
    }
}
