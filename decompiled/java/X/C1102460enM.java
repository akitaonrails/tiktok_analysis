package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0enM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1102460enM {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(int i) {
        switch (i) {
            case 1:
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return "Bubble";
            case 2:
                return "RedDot";
            case 3:
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
            case 15:
            default:
                return "Unknown";
            case 4:
                return "PlatformCapsule";
            case 5:
                return "UserCapsule";
            case 6:
                return "AlienationCapsule";
            case 7:
                return "SidePushCardA";
            case 8:
                return "SidePushCardB";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "UserPanel";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "Panel";
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "HorizontalPushCard";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return "EcommerceGuideTips";
            case 14:
                return "MarketingCapsule";
            case 16:
                return "ToolbarTips";
        }
    }
}
