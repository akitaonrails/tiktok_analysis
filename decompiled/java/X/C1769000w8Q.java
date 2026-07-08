package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0w8Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1769000w8Q {
    public static final EnumC1768960w8M LIZ(EnumC1768950w8L enumC1768950w8L) {
        switch (C1768990w8P.LIZ[enumC1768950w8L.ordinal()]) {
            case 1:
                return EnumC1768960w8M.COLD_START;
            case 2:
                return EnumC1768960w8M.BYTESYNC_PUSH;
            case 3:
                return EnumC1768960w8M.SHOP_TAB_SHOW;
            case 4:
                return EnumC1768960w8M.CLICK_SHOP_TAB;
            case 5:
                return EnumC1768960w8M.HOME_TAB_VIDEO_CHANGE;
            case 6:
                return EnumC1768960w8M.FEED_VIDEO_SEARCH;
            case 7:
                return EnumC1768960w8M.GENERAL_SEARCH;
            case 8:
                return EnumC1768960w8M.AFTER_FREEZE_TIME;
            case BdTuring.TYPE_ECAF /* 9 */:
                return EnumC1768960w8M.REALTIME_TRIGGER_IMMEDIATELY;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return EnumC1768960w8M.REALTIME_TRIGGER_SHOPTAB_SHOW;
            default:
                return EnumC1768960w8M.UNKNOWN;
        }
    }
}
