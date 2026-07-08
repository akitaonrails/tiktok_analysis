package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Set;

/* JADX INFO: renamed from: X.0QwF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C686450QwF {
    public static final void LIZIZ(C686470QwH c686470QwH) {
        C0Q3E.LJI().yY1().LIZ(c686470QwH);
    }

    public static final Set<String> LIZ(Set<String> set, EnumC686550QwP enumC686550QwP) {
        switch (C686590QwT.LIZ[enumC686550QwP.ordinal()]) {
            case 3:
                return C15442062u.LJI(EnumC686550QwP.LIKE_CANCEL.getAct(), C15442062u.LJIIIIZZ(enumC686550QwP.getAct(), set));
            case 4:
                return C15442062u.LJI(EnumC686550QwP.LIKE.getAct(), C15442062u.LJIIIIZZ(enumC686550QwP.getAct(), set));
            case 5:
                return C15442062u.LJI(EnumC686550QwP.FAVORITE_CANCEL.getAct(), C15442062u.LJIIIIZZ(enumC686550QwP.getAct(), set));
            case 6:
                return C15442062u.LJI(EnumC686550QwP.FAVORITE.getAct(), C15442062u.LJIIIIZZ(enumC686550QwP.getAct(), set));
            case 7:
                return C15442062u.LJI(EnumC686550QwP.FOLLOW_CANCEL.getAct(), C15442062u.LJIIIIZZ(enumC686550QwP.getAct(), set));
            case 8:
                return C15442062u.LJI(EnumC686550QwP.FOLLOW.getAct(), C15442062u.LJIIIIZZ(enumC686550QwP.getAct(), set));
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return C15442062u.LJIIIIZZ(enumC686550QwP.getAct(), set);
            default:
                return set;
        }
    }
}
