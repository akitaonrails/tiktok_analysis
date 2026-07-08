package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import defpackage.q0;
import java.util.Set;

/* JADX INFO: renamed from: X.0QwE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C686440QwE {
    public static final void LIZJ(C686340Qw4 c686340Qw4) {
        C0Q3E.LJI().yY1().LIZ(c686340Qw4);
    }

    public static final void LIZLLL(C686420QwC c686420QwC) {
        C0Q3E.LJI().yY1().LIZ(c686420QwC);
    }

    public static final Set<String> LIZ(Set<String> set, EnumC686550QwP enumC686550QwP) {
        int i = C686560QwQ.LIZ[enumC686550QwP.ordinal()];
        if (i != 2) {
            if (i != 3) {
                switch (i) {
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        return C15442062u.LJI(EnumC686550QwP.LIKE_CANCEL.getAct(), C15442062u.LJIIIIZZ(enumC686550QwP.getAct(), set));
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        return C15442062u.LJI(EnumC686550QwP.LIKE.getAct(), C15442062u.LJIIIIZZ(enumC686550QwP.getAct(), set));
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        return C15442062u.LJI(EnumC686550QwP.FAVORITE_CANCEL.getAct(), C15442062u.LJIIIIZZ(enumC686550QwP.getAct(), set));
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        return C15442062u.LJI(EnumC686550QwP.FAVORITE.getAct(), C15442062u.LJIIIIZZ(enumC686550QwP.getAct(), set));
                    case 14:
                        return C15442062u.LJI(EnumC686550QwP.FOLLOW_CANCEL.getAct(), C15442062u.LJIIIIZZ(enumC686550QwP.getAct(), set));
                    case 15:
                        return C15442062u.LJI(EnumC686550QwP.FOLLOW.getAct(), C15442062u.LJIIIIZZ(enumC686550QwP.getAct(), set));
                    case 16:
                        return C15442062u.LJI(EnumC686550QwP.EFFECT_FAVORITE_CANCEL.getAct(), C15442062u.LJIIIIZZ(enumC686550QwP.getAct(), set));
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        return C15442062u.LJI(EnumC686550QwP.EFFECT_FAVORITE.getAct(), C15442062u.LJIIIIZZ(enumC686550QwP.getAct(), set));
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                    case 19:
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                    case 21:
                    case 22:
                    case 23:
                    case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                    case 25:
                        return C15442062u.LJIIIIZZ(enumC686550QwP.getAct(), set);
                    case 26:
                        return C15442062u.LJI(EnumC686550QwP.POI_FAVOURITE_CANCEL.getAct(), C15442062u.LJIIIIZZ(enumC686550QwP.getAct(), set));
                    case 27:
                        return C15442062u.LJI(EnumC686550QwP.POI_FAVOURITE.getAct(), C15442062u.LJIIIIZZ(enumC686550QwP.getAct(), set));
                    default:
                        return set;
                }
            }
            return C15442062u.LJI(EnumC686550QwP.MUSIC_FAVORITE.getAct(), C15442062u.LJIIIIZZ(enumC686550QwP.getAct(), set));
        }
        return C15442062u.LJI(EnumC686550QwP.MUSIC_FAVORITE_CANCEL.getAct(), C15442062u.LJIIIIZZ(enumC686550QwP.getAct(), set));
    }

    public static final <ITEM> void LIZIZ(q0<ITEM> q0Var, ITEM item, ITEM item2) {
        synchronized (q0Var) {
            try {
                int iIndexOf = q0Var.indexOf(item);
                if (iIndexOf >= 0) {
                    q0Var.set(iIndexOf, item2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
