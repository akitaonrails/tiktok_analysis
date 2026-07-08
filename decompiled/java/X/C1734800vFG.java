package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.setting.form.LivePcsFormRetentionDays;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0vFG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1734800vFG {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
            case 14:
            case 15:
            case 19:
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
            case 21:
            case 22:
                return true;
            case 7:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
            case 16:
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
            default:
                return false;
        }
    }

    public static boolean LIZJ() {
        if (C0KPJ.xf.LIZ() != null) {
            return !LIZIZ(r0.longValue());
        }
        return false;
    }

    public static boolean LIZIZ(long j) {
        if (System.currentTimeMillis() - j > TimeUnit.DAYS.toMillis(LivePcsFormRetentionDays.INSTANCE.getValue())) {
            return true;
        }
        return false;
    }
}
