package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Map;

/* JADX INFO: renamed from: X.0YgT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C880510YgT {
    public static final EnumC880480YgQ LIZ(FilterTabType filterTabType) {
        switch (C880550YgX.LIZ[filterTabType.ordinal()]) {
            case 1:
                return EnumC880480YgQ.ALL;
            case 2:
                return EnumC880480YgQ.PRIMARY;
            case 3:
                return EnumC880480YgQ.SECONDARY;
            case 4:
                return EnumC880480YgQ.FOLLOWING;
            case 5:
                return EnumC880480YgQ.CREATOR;
            case 6:
                return EnumC880480YgQ.BUSINESS;
            case 7:
                return EnumC880480YgQ.LONG_TIME_FOLLOWER;
            case 8:
                return EnumC880480YgQ.SUBSCRIBER;
            case BdTuring.TYPE_ECAF /* 9 */:
                return EnumC880480YgQ.WITH_MUTUAL_FRIEND;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return EnumC880480YgQ.HIGH_LEVEL_MEMBER;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return EnumC880480YgQ.ONE_WAY_FOLLOWER;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return EnumC880480YgQ.UNREAD;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return EnumC880480YgQ.NOT_REPLIED;
            case 14:
                return EnumC880480YgQ.STARRED;
            case 15:
                return EnumC880480YgQ.SPAM;
            case 16:
                return EnumC880480YgQ.ALL_FOR_BUSINESS;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return EnumC880480YgQ.LEAD;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return EnumC880480YgQ.AD;
            case 19:
                return EnumC880480YgQ.BUYER;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return EnumC880480YgQ.SERVICE_PLUS;
            case 21:
            case 22:
            case 23:
                return EnumC880480YgQ.NULL;
            default:
                throw new C1954807lC();
        }
    }

    public static final boolean LIZIZ(C0Y8T c0y8t) {
        String str;
        Map<String, String> ext;
        if (c0y8t == null) {
            return false;
        }
        C1231304rn.LIZ.getClass();
        if (!(!C1231304rn.LIZ().isEmpty()) || !C882340YjQ.LIZLLL(c0y8t)) {
            return false;
        }
        C0Y8Y coreInfo = c0y8t.getCoreInfo();
        if (coreInfo == null || (ext = coreInfo.getExt()) == null || (str = ext.get("a:bot_type")) == null) {
            str = "invalid";
        }
        return C1231304rn.LIZ().contains(str);
    }

    public static final boolean LIZJ(C869590Y9l c869590Y9l) {
        C0YUT messageStatus;
        if (c869590Y9l != null) {
            if (c869590Y9l.isRecalled()) {
                return true;
            }
            messageStatus = c869590Y9l.getMessageStatus();
        } else {
            messageStatus = null;
        }
        if (messageStatus == C0YUT.RECALLED) {
            return true;
        }
        return false;
    }
}
