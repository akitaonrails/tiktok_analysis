package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1AZy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public enum EnumC2181681AZy {
    Unknown,
    FinishChannelApi,
    FinishChannelMsg,
    Reset,
    Drop,
    SeiEnd,
    LayoutKeyBlocked,
    RemoveLayout,
    RtcError,
    LeaveGroup,
    LeaveGroupMessage,
    RechargeGroupNotLinked,
    FullScreenEnd;

    public static final C2182201Aao Companion = new Object() { // from class: X.1Aao
    };

    public static EnumC2181681AZy valueOf(String str) {
        return (EnumC2181681AZy) C08FF.LIZ(EnumC2181681AZy.class, str);
    }

    public final EnumC2182321Ab0 into() {
        switch (C2181671AZx.LIZ[ordinal()]) {
            case 1:
                return EnumC2182321Ab0.VAR_LINK_LAYOUT_END_SOURCE_UNKNOWN;
            case 2:
                return EnumC2182321Ab0.VAR_LINK_LAYOUT_END_SOURCE_FINISH_CHANNEL_API;
            case 3:
                return EnumC2182321Ab0.VAR_LINK_LAYOUT_END_SOURCE_FINISH_CHANNEL_MSG;
            case 4:
                return EnumC2182321Ab0.VAR_LINK_LAYOUT_END_SOURCE_RESET;
            case 5:
                return EnumC2182321Ab0.VAR_LINK_LAYOUT_END_SOURCE_DROP;
            case 6:
                return EnumC2182321Ab0.VAR_LINK_LAYOUT_END_SOURCE_SEI_END;
            case 7:
                return EnumC2182321Ab0.VAR_LINK_LAYOUT_END_SOURCE_LAYOUT_KEY_BLOCKED;
            case 8:
                return EnumC2182321Ab0.VAR_LINK_LAYOUT_END_SOURCE_REMOVE_LAYOUT;
            case BdTuring.TYPE_ECAF /* 9 */:
                return EnumC2182321Ab0.VAR_LINK_LAYOUT_END_SOURCE_RTC_ERROR;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return EnumC2182321Ab0.VAR_LINK_LAYOUT_END_SOURCE_LEAVE_GROUP;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return EnumC2182321Ab0.VAR_LINK_LAYOUT_END_SOURCE_LEAVE_GROUP_MESSAGE;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return EnumC2182321Ab0.VAR_LINK_LAYOUT_END_SOURCE_RECHARGE_GROUP_NOT_LINKED;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return EnumC2182321Ab0.VAR_LINK_LAYOUT_END_SOURCE_FULL_SCREEN_END;
            default:
                throw new C1954807lC();
        }
    }

    public final int intoInt() {
        switch (C2181671AZx.LIZ[ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case BdTuring.TYPE_ECAF /* 9 */:
                return 8;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return 9;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return 10;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return 11;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return 12;
            default:
                throw new C1954807lC();
        }
    }
}
