package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0bWY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976720bWY {
    public static final /* synthetic */ int LIZ = 0;

    public static EnumC976700bWW LIZ(EnumC964170bCJ enumC964170bCJ) {
        if (enumC964170bCJ != null) {
            switch (C974300bSe.LIZIZ[enumC964170bCJ.ordinal()]) {
                case -1:
                    break;
                case 0:
                default:
                    throw new C1954807lC();
                case 1:
                    return EnumC976700bWW.NONE;
                case 2:
                    return EnumC976700bWW.PREPARING;
                case 3:
                    return EnumC976700bWW.INVITED;
                case 4:
                    return EnumC976700bWW.RECEIVED;
                case 5:
                    return EnumC976700bWW.ACCEPTED;
                case 6:
                    return EnumC976700bWW.START;
                case 7:
                    return EnumC976700bWW.SETTLE;
                case 8:
                    return EnumC976700bWW.PUNISH;
                case BdTuring.TYPE_ECAF /* 9 */:
                    return EnumC976700bWW.DRAW;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    return EnumC976700bWW.FINISH;
            }
        }
        return EnumC976700bWW.NONE;
    }
}
