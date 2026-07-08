package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1CWo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2231761CWo {
    Unknown,
    CreateChannel,
    FinishChannel,
    Invite,
    CancelInvite,
    Reply,
    Apply,
    CancelApply,
    Permit,
    Leave,
    Kickout,
    ListChange,
    JoinDirect,
    LinkState,
    InviteGroup,
    CancelInviteGroup,
    ReplyGroup,
    ApplyGroup,
    CancelApplyGroup,
    PermitGroup,
    LeaveGroup,
    GroupListChange,
    PToPGroupListChange,
    JoinGroupDirect,
    JoinRoomDirect;

    public static final C2232321CYs Companion = new Object() { // from class: X.1CYs
    };

    public static EnumC2231761CWo valueOf(String str) {
        return (EnumC2231761CWo) C08FF.LIZ(EnumC2231761CWo.class, str);
    }

    public final EnumC2231801CWs into() {
        switch (C2231751CWn.LIZ[ordinal()]) {
            case 1:
                return EnumC2231801CWs.VAR_LINK_MIC_IM_TYPE_UNKNOWN;
            case 2:
                return EnumC2231801CWs.VAR_LINK_MIC_IM_TYPE_CREATE_CHANNEL;
            case 3:
                return EnumC2231801CWs.VAR_LINK_MIC_IM_TYPE_FINISH_CHANNEL;
            case 4:
                return EnumC2231801CWs.VAR_LINK_MIC_IM_TYPE_INVITE;
            case 5:
                return EnumC2231801CWs.VAR_LINK_MIC_IM_TYPE_CANCEL_INVITE;
            case 6:
                return EnumC2231801CWs.VAR_LINK_MIC_IM_TYPE_REPLY;
            case 7:
                return EnumC2231801CWs.VAR_LINK_MIC_IM_TYPE_APPLY;
            case 8:
                return EnumC2231801CWs.VAR_LINK_MIC_IM_TYPE_CANCEL_APPLY;
            case BdTuring.TYPE_ECAF /* 9 */:
                return EnumC2231801CWs.VAR_LINK_MIC_IM_TYPE_PERMIT;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return EnumC2231801CWs.VAR_LINK_MIC_IM_TYPE_LEAVE;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return EnumC2231801CWs.VAR_LINK_MIC_IM_TYPE_KICKOUT;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return EnumC2231801CWs.VAR_LINK_MIC_IM_TYPE_LIST_CHANGE;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return EnumC2231801CWs.VAR_LINK_MIC_IM_TYPE_JOIN_DIRECT;
            case 14:
                return EnumC2231801CWs.VAR_LINK_MIC_IM_TYPE_LINK_STATE;
            case 15:
                return EnumC2231801CWs.VAR_LINK_MIC_IM_TYPE_INVITE_GROUP;
            case 16:
                return EnumC2231801CWs.VAR_LINK_MIC_IM_TYPE_CANCEL_INVITE_GROUP;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return EnumC2231801CWs.VAR_LINK_MIC_IM_TYPE_REPLY_GROUP;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return EnumC2231801CWs.VAR_LINK_MIC_IM_TYPE_APPLY_GROUP;
            case 19:
                return EnumC2231801CWs.VAR_LINK_MIC_IM_TYPE_CANCEL_APPLY_GROUP;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return EnumC2231801CWs.VAR_LINK_MIC_IM_TYPE_PERMIT_GROUP;
            case 21:
                return EnumC2231801CWs.VAR_LINK_MIC_IM_TYPE_LEAVE_GROUP;
            case 22:
                return EnumC2231801CWs.VAR_LINK_MIC_IM_TYPE_GROUP_LIST_CHANGE;
            case 23:
                return EnumC2231801CWs.VAR_LINK_MIC_IM_TYPE_P_TO_P_GROUP_LIST_CHANGE;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return EnumC2231801CWs.VAR_LINK_MIC_IM_TYPE_JOIN_GROUP_DIRECT;
            case 25:
                return EnumC2231801CWs.VAR_LINK_MIC_IM_TYPE_JOIN_ROOM_DIRECT;
            default:
                throw new C1954807lC();
        }
    }

    public final int intoInt() {
        switch (C2231751CWn.LIZ[ordinal()]) {
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
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 15;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return 16;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return 17;
            case 19:
                return 18;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return 19;
            case 21:
                return 20;
            case 22:
                return 21;
            case 23:
                return 22;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return 23;
            case 25:
                return 24;
            default:
                throw new C1954807lC();
        }
    }
}
