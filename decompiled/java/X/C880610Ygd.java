package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Ygd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C880610Ygd {
    public static C880720Ygo LIZ(EnumC880480YgQ enumC880480YgQ) {
        String strLIZJ;
        int i = C880620Yge.LIZ[enumC880480YgQ.ordinal()];
        Integer numValueOf = Integer.valueOf(R.raw.icon_person_arrow_left);
        Integer numValueOf2 = Integer.valueOf(R.raw.icon_inbox);
        Integer numValueOf3 = null;
        switch (i) {
            case 1:
                EnumC880480YgQ enumC880480YgQ2 = EnumC880480YgQ.PRIMARY;
                String strLIZJ2 = C1618770sE7.LIZJ(C890100Yvw.LIZIZ.LJIIIIZZ());
                if (!C889930Yvf.LIZ.LJIIL()) {
                    numValueOf2 = null;
                }
                return new C880720Ygo(enumC880480YgQ2, strLIZJ2, numValueOf2);
            case 2:
                EnumC880480YgQ enumC880480YgQ3 = EnumC880480YgQ.SECONDARY;
                String strLIZJ3 = C1618770sE7.LIZJ(C890100Yvw.LIZIZ.LJIIIZ());
                if (C889930Yvf.LIZ.LJIIL()) {
                    numValueOf3 = Integer.valueOf(R.raw.icon_box_arrow_right);
                }
                return new C880720Ygo(enumC880480YgQ3, strLIZJ3, numValueOf3);
            case 3:
                EnumC880480YgQ enumC880480YgQ4 = EnumC880480YgQ.FOLLOWING;
                String strLIZJ4 = C1618770sE7.LIZJ(2131845333);
                if (C889930Yvf.LIZ.LJIIL()) {
                    numValueOf3 = Integer.valueOf(R.raw.icon_person_tick);
                }
                return new C880720Ygo(enumC880480YgQ4, strLIZJ4, numValueOf3);
            case 4:
                EnumC880480YgQ enumC880480YgQ5 = EnumC880480YgQ.BUSINESS;
                String strLIZJ5 = C1618770sE7.LIZJ(2131845330);
                if (C889930Yvf.LIZ.LJIIL()) {
                    numValueOf3 = Integer.valueOf(R.raw.icon_store);
                }
                return new C880720Ygo(enumC880480YgQ5, strLIZJ5, numValueOf3);
            case 5:
                EnumC880480YgQ enumC880480YgQ6 = EnumC880480YgQ.CREATOR;
                String strLIZJ6 = C1618770sE7.LIZJ(2131845335);
                if (C889930Yvf.LIZ.LJIIL()) {
                    numValueOf3 = Integer.valueOf(R.raw.icon_person_star);
                }
                return new C880720Ygo(enumC880480YgQ6, strLIZJ6, numValueOf3);
            case 6:
                EnumC880480YgQ enumC880480YgQ7 = EnumC880480YgQ.LONG_TIME_FOLLOWER;
                String quantityString = C1383370m6R.LIZ.getResources().getQuantityString(2131755634, 1, "1");
                if (!C889930Yvf.LIZ.LJIIL()) {
                    numValueOf = null;
                }
                return new C880720Ygo(enumC880480YgQ7, quantityString, numValueOf);
            case 7:
                EnumC880480YgQ enumC880480YgQ8 = EnumC880480YgQ.HIGH_LEVEL_MEMBER;
                String strLIZJ7 = C1618770sE7.LIZJ(2131834819);
                if (C889930Yvf.LIZ.LJIIL()) {
                    numValueOf3 = Integer.valueOf(R.raw.icon_heart_split);
                }
                return new C880720Ygo(enumC880480YgQ8, strLIZJ7, numValueOf3);
            case 8:
                EnumC880480YgQ enumC880480YgQ9 = EnumC880480YgQ.ONE_WAY_FOLLOWER;
                String strLIZJ8 = C1618770sE7.LIZJ(2131850093);
                if (!C889930Yvf.LIZ.LJIIL()) {
                    numValueOf = null;
                }
                return new C880720Ygo(enumC880480YgQ9, strLIZJ8, numValueOf);
            case BdTuring.TYPE_ECAF /* 9 */:
                EnumC880480YgQ enumC880480YgQ10 = EnumC880480YgQ.SUBSCRIBER;
                String strLIZJ9 = C1618770sE7.LIZJ(2131834818);
                if (C889930Yvf.LIZ.LJIIL()) {
                    numValueOf3 = Integer.valueOf(R.raw.icon_star_ring);
                }
                return new C880720Ygo(enumC880480YgQ10, strLIZJ9, numValueOf3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                EnumC880480YgQ enumC880480YgQ11 = EnumC880480YgQ.WITH_MUTUAL_FRIEND;
                String strLIZJ10 = C1618770sE7.LIZJ(2131834820);
                if (C889930Yvf.LIZ.LJIIL()) {
                    numValueOf3 = Integer.valueOf(R.raw.icon_two_person);
                }
                return new C880720Ygo(enumC880480YgQ11, strLIZJ10, numValueOf3);
            case BdTuring.TYPE_EMAIL /* 11 */:
                EnumC880480YgQ enumC880480YgQ12 = EnumC880480YgQ.UNREAD;
                String strLIZJ11 = C1618770sE7.LIZJ(2131845364);
                if (C889930Yvf.LIZ.LJIIL()) {
                    numValueOf3 = Integer.valueOf(R.raw.icon_envelope_dot);
                }
                return new C880720Ygo(enumC880480YgQ12, strLIZJ11, numValueOf3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                EnumC880480YgQ enumC880480YgQ13 = EnumC880480YgQ.NOT_REPLIED;
                C889930Yvf c889930Yvf = C889930Yvf.LIZ;
                if (c889930Yvf.LIZJ() == C05RV.BUSINESS_INBOX) {
                    strLIZJ = C1618770sE7.LIZJ(2131845278);
                } else {
                    strLIZJ = C1618770sE7.LIZJ(2131845331);
                }
                if (c889930Yvf.LJIIL()) {
                    numValueOf3 = Integer.valueOf(R.raw.icon_question_mark_circle_ltr);
                }
                return new C880720Ygo(enumC880480YgQ13, strLIZJ, numValueOf3);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return new C880720Ygo(EnumC880480YgQ.STARRED, C1618770sE7.LIZJ(2131845363), Integer.valueOf(R.raw.icon_star));
            case 14:
                return new C880720Ygo(EnumC880480YgQ.SPAM, C1618770sE7.LIZJ(2131845362), Integer.valueOf(R.raw.icon_exclamation_mark_polygon));
            case 15:
                return new C880720Ygo(EnumC880480YgQ.ALL_FOR_BUSINESS, C1618770sE7.LIZJ(2131845312), numValueOf2);
            case 16:
                return new C880720Ygo(EnumC880480YgQ.AD, C1618770sE7.LIZJ(2131845276), Integer.valueOf(R.raw.icon_advertisement_text));
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return new C880720Ygo(EnumC880480YgQ.BUYER, C1618770sE7.LIZJ(2131827508), Integer.valueOf(R.raw.icon_exp_exp_01_icon_bag));
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return new C880720Ygo(EnumC880480YgQ.SERVICE_PLUS, C1618770sE7.LIZJ(2131855838), Integer.valueOf(R.raw.icon_bubble_arrow));
            case 19:
                return new C880720Ygo(EnumC880480YgQ.LEAD, C1618770sE7.LIZJ(2131845277), Integer.valueOf(R.raw.icon_label));
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
            case 21:
            case 22:
                return null;
            default:
                throw new C1954807lC();
        }
    }
}
