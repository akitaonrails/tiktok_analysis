package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0rao, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1594400rao {
    public static final C1594400rao LIZ = new C1594400rao();

    public static void LIZ(EnumC1594410rap enumC1594410rap, Integer num) {
        EnumC1594410rap enumC1594410rap2;
        String mobString;
        if (enumC1594410rap == EnumC1594410rap.AVOID_INT_BY_SERVER) {
            mobString = String.valueOf(num);
        } else {
            switch (C1594390ran.LIZIZ[enumC1594410rap.ordinal()]) {
                case 1:
                    enumC1594410rap2 = EnumC1594410rap.NEW_USER_GUIDANCE;
                    break;
                case 2:
                    enumC1594410rap2 = EnumC1594410rap.NORMAL_AD;
                    break;
                case 3:
                    enumC1594410rap2 = EnumC1594410rap.FULL_SCREEN_AD;
                    break;
                case 4:
                    enumC1594410rap2 = EnumC1594410rap.MULTI_PHOTO;
                    break;
                case 5:
                    enumC1594410rap2 = EnumC1594410rap.SCREEN_LIVE;
                    break;
                case 6:
                case 7:
                case 8:
                    enumC1594410rap2 = EnumC1594410rap.REACHED_EXIT_COUNT;
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    enumC1594410rap2 = EnumC1594410rap.OTHER;
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    enumC1594410rap2 = EnumC1594410rap.SCREEN_TIME;
                    break;
                default:
                    throw new C1954807lC();
            }
            mobString = enumC1594410rap2.getMobString();
            if (mobString == null) {
                mobString = "";
            }
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("position", "homepage_hot");
        c2344009Gk.LJIIIIZZ("avoid_type", mobString);
        C20684815ws.LJIILLIIL("feed_search_box_avoid", c2344009Gk.LIZ);
    }
}
