package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0FTR, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FTR {
    public static float LIZ(EnumC1466150oFx enumC1466150oFx) {
        switch (C1466130oFv.LIZ[enumC1466150oFx.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return 5.0f;
            case 4:
            case 7:
            case 8:
                return 12.0f;
            case 5:
                return 18.0f;
            case 6:
                return 14.0f;
            default:
                return 100.0f;
        }
    }
}
