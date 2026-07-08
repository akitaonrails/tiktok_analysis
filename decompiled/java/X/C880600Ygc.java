package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0Ygc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C880600Ygc {
    public static C889910Yvd LIZIZ() {
        return new C889910Yvd(FilterTabType.LONG_TIME_FOLLOWER, C1383370m6R.LIZ.getResources().getQuantityString(2131755634, 1, "1"), false, false, (Integer) null, (Integer) null, 124);
    }

    public static C889910Yvd LIZLLL() {
        return new C889910Yvd(FilterTabType.UNANSWERED, C889930Yvf.LIZ.LIZJ() == C05RV.BUSINESS_INBOX ? C1618770sE7.LIZJ(2131845278) : C1618770sE7.LIZJ(2131845331), false, false, (Integer) null, (Integer) null, 124);
    }

    public static C889910Yvd LIZ(FilterTabType filterTabType) {
        switch (C880590Ygb.LIZ[filterTabType.ordinal()]) {
            case 1:
                return new C889910Yvd(FilterTabType.PRIMARY, C1618770sE7.LIZJ(C890100Yvw.LIZIZ.LJIIIIZZ()), false, false, (Integer) null, (Integer) null, 124);
            case 2:
                return new C889910Yvd(FilterTabType.SECONDARY, C1618770sE7.LIZJ(C890100Yvw.LIZIZ.LJIIIZ()), false, false, (Integer) null, (Integer) null, 124);
            case 3:
                return new C889910Yvd(FilterTabType.FOLLOWING, C1618770sE7.LIZJ(2131845333), false, false, (Integer) null, (Integer) null, 124);
            case 4:
                return new C889910Yvd(FilterTabType.BUSINESS, C1618770sE7.LIZJ(2131845330), false, false, (Integer) null, (Integer) null, 124);
            case 5:
                return new C889910Yvd(FilterTabType.CREATOR, C1618770sE7.LIZJ(2131845335), false, false, (Integer) null, (Integer) null, 124);
            case 6:
                return LIZIZ();
            case 7:
                return new C889910Yvd(FilterTabType.HIGH_LEVEL_MEMBER, C1618770sE7.LIZJ(2131834819), false, false, (Integer) null, (Integer) null, 124);
            case 8:
                return new C889910Yvd(FilterTabType.ONE_WAY_FOLLOWER, C1618770sE7.LIZJ(2131850093), false, false, (Integer) null, (Integer) null, 124);
            case BdTuring.TYPE_ECAF /* 9 */:
                return new C889910Yvd(FilterTabType.SUBSCRIBER, C1618770sE7.LIZJ(2131834818), false, false, (Integer) null, (Integer) null, 124);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return new C889910Yvd(FilterTabType.WITH_MUTUAL_FRIEND, C1618770sE7.LIZJ(2131834820), false, false, (Integer) null, (Integer) null, 124);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return new C889910Yvd(FilterTabType.UNREAD, C1618770sE7.LIZJ(2131845364), false, false, (Integer) null, (Integer) null, 124);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return LIZLLL();
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return new C889910Yvd(FilterTabType.STARRED, C1618770sE7.LIZJ(2131845363), false, false, (Integer) null, (Integer) null, 124);
            case 14:
                return new C889910Yvd(FilterTabType.SPAM, C1618770sE7.LIZJ(2131845362), false, false, (Integer) 0, (Integer) 0, 16);
            case 15:
                return new C889910Yvd(FilterTabType.ALL_FOR_BUSINESS, C1618770sE7.LIZJ(2131845312), false, false, (Integer) null, (Integer) null, 124);
            case 16:
                return new C889910Yvd(FilterTabType.AD, C1618770sE7.LIZJ(2131845276), false, false, (Integer) null, (Integer) null, 124);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return new C889910Yvd(FilterTabType.BUYER, C1618770sE7.LIZJ(2131827508), false, false, (Integer) null, (Integer) null, 124);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return new C889910Yvd(FilterTabType.SERVICE_PLUS, C1618770sE7.LIZJ(2131855838), false, false, (Integer) null, (Integer) null, 124);
            case 19:
                return new C889910Yvd(FilterTabType.LEAD, C1618770sE7.LIZJ(2131845277), false, false, (Integer) null, (Integer) null, 124);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return new C889910Yvd(FilterTabType.REQUEST, C1618770sE7.LIZJ(2131845334), C881280Yhi.LIZIZ.LIZJ(true), true, (Integer) null, (Integer) null, 112);
            case 21:
            case 22:
            case 23:
                return null;
            default:
                throw new C1954807lC();
        }
    }

    public static EnumC880480YgQ LIZJ(FilterTabType filterTabType) {
        switch (C880590Ygb.LIZ[filterTabType.ordinal()]) {
            case 1:
                return EnumC880480YgQ.PRIMARY;
            case 2:
                return EnumC880480YgQ.SECONDARY;
            case 3:
                return EnumC880480YgQ.FOLLOWING;
            case 4:
                return EnumC880480YgQ.BUSINESS;
            case 5:
                return EnumC880480YgQ.CREATOR;
            case 6:
                return EnumC880480YgQ.LONG_TIME_FOLLOWER;
            case 7:
                return EnumC880480YgQ.HIGH_LEVEL_MEMBER;
            case 8:
                return EnumC880480YgQ.ONE_WAY_FOLLOWER;
            case BdTuring.TYPE_ECAF /* 9 */:
                return EnumC880480YgQ.SUBSCRIBER;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return EnumC880480YgQ.WITH_MUTUAL_FRIEND;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return EnumC880480YgQ.UNREAD;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return EnumC880480YgQ.NOT_REPLIED;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return EnumC880480YgQ.STARRED;
            case 14:
                return EnumC880480YgQ.SPAM;
            case 15:
                return EnumC880480YgQ.ALL_FOR_BUSINESS;
            case 16:
                return EnumC880480YgQ.AD;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return EnumC880480YgQ.BUYER;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return EnumC880480YgQ.SERVICE_PLUS;
            case 19:
                return EnumC880480YgQ.LEAD;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
            case 21:
            case 22:
            case 23:
                return null;
            default:
                throw new C1954807lC();
        }
    }
}
