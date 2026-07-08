package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0t4Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1651280t4Y {
    public static final EnumC1651770t5L LIZ(EnumC1651790t5N enumC1651790t5N) {
        switch (C1651730t5H.LIZ[enumC1651790t5N.ordinal()]) {
            case 1:
                return EnumC1651770t5L.SPEED;
            case 2:
                return EnumC1651770t5L.FLASH;
            case 3:
                return EnumC1651770t5L.AI_ALIVE;
            case 4:
                return EnumC1651770t5L.BEAUTY;
            case 5:
                return EnumC1651770t5L.FILTER;
            case 6:
                return EnumC1651770t5L.VOICE_CHANGE;
            case 7:
                return EnumC1651770t5L.MICROPHONE;
            case 8:
                return EnumC1651770t5L.AI_CAPTION;
            case BdTuring.TYPE_ECAF /* 9 */:
                return EnumC1651770t5L.DUET_LAYOUT;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return EnumC1651770t5L.HDR;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return EnumC1651770t5L.CHANGE_RATIO;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return EnumC1651770t5L.LAYOUT;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return EnumC1651770t5L.PORTRAIT;
            case 14:
                return EnumC1651770t5L.GREEN_SCREEN;
            case 15:
                return EnumC1651770t5L.COUNT_DOWN;
            default:
                return EnumC1651770t5L.EMPTY;
        }
    }
}
