package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1CWk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2231721CWk {
    None,
    StartRequestInvite,
    StartRequestInviteBatch,
    StartRequestApply,
    StartRequestInviteGroup,
    StartRequestApplyGroup,
    RequestInviteSuccess,
    RequestInviteBatchSuccess,
    RequestApplySuccess,
    RequestInviteGroupSuccess,
    RequestApplyGroupSuccess,
    RequestInviteFailed,
    RequestInviteOutOfRoom,
    RequestApplyFailed,
    RequestInviteGroupFailed,
    RequestApplyGroupFailed,
    ReceiveInviteMessage,
    ReceiveApplyMessage,
    ReceiveInviteGroupMessage,
    ReceiveApplyGroupMessage,
    RequestCancelInviteSuccess,
    RequestCancelApplySuccess,
    RequestCancelInviteGroupSuccess,
    RequestCancelApplyGroupSuccess,
    RequestReplyRefuseSuccess,
    RequestApplyDirectRefuseSuccess,
    RequestReplyGroupRefuseSuccess,
    RequestPermitRefuseSuccess,
    RequestPermitGroupRefuseSuccess,
    ReceivePermitRefuseMessage,
    ReceivePermitGroupRefuseMessage,
    ReceiveCancelInviteMessage,
    ReceiveCancelApplyMessage,
    ReceiveCancelInviteGroupMessage,
    ReceiveCancelApplyGroupMessage,
    ReceiveReplyRefuseMessage,
    ReceiveReplyGroupRefuseMessage,
    RequestJoinDirectSuccess,
    RequestApplyDirectAgreeSuccess,
    ReceiveJoinDirectMessage,
    ReceiveJoinGroupDirectMessage,
    ReceiveJoinRoomDirectMessage,
    ReceiveListChangeUserJoin,
    RequestReplyAgreeSuccess,
    RequestPermitAgreeSuccess,
    RequestReplyGroupAgreeSuccess,
    RequestPermitGroupAgreeSuccess,
    ReceiveReplyAgreeMessage,
    ReceivePermitAgreeMessage,
    ReceiveReplyGroupAgreeMessage,
    ReceivePermitGroupAgreeMessage,
    ReceiveRemoteFirstFrameRender,
    ReceiveRemoteAudioFrame,
    AlreadyReceivedFirstFrame,
    ReceiveLeaveMessage,
    ReceiveListChangeUserLeave,
    ReceiveLeaveGroupMessage,
    ReceiveRtcKickOutMessage,
    UserFsmDeleted,
    Reset;

    public static final C2232371CYx Companion = new Object() { // from class: X.1CYx
    };

    public static EnumC2231721CWk valueOf(String str) {
        return (EnumC2231721CWk) C08FF.LIZ(EnumC2231721CWk.class, str);
    }

    public final EnumC2231731CWl into() {
        switch (C2231711CWj.LIZ[ordinal()]) {
            case 1:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_NONE;
            case 2:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_START_REQUEST_INVITE;
            case 3:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_START_REQUEST_INVITE_BATCH;
            case 4:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_START_REQUEST_APPLY;
            case 5:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_START_REQUEST_INVITE_GROUP;
            case 6:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_START_REQUEST_APPLY_GROUP;
            case 7:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_REQUEST_INVITE_SUCCESS;
            case 8:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_REQUEST_INVITE_BATCH_SUCCESS;
            case BdTuring.TYPE_ECAF /* 9 */:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_REQUEST_APPLY_SUCCESS;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_REQUEST_INVITE_GROUP_SUCCESS;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_REQUEST_APPLY_GROUP_SUCCESS;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_REQUEST_INVITE_FAILED;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_REQUEST_INVITE_OUT_OF_ROOM;
            case 14:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_REQUEST_APPLY_FAILED;
            case 15:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_REQUEST_INVITE_GROUP_FAILED;
            case 16:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_REQUEST_APPLY_GROUP_FAILED;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_RECEIVE_INVITE_MESSAGE;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_RECEIVE_APPLY_MESSAGE;
            case 19:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_RECEIVE_INVITE_GROUP_MESSAGE;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_RECEIVE_APPLY_GROUP_MESSAGE;
            case 21:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_REQUEST_CANCEL_INVITE_SUCCESS;
            case 22:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_REQUEST_CANCEL_APPLY_SUCCESS;
            case 23:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_REQUEST_CANCEL_INVITE_GROUP_SUCCESS;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_REQUEST_CANCEL_APPLY_GROUP_SUCCESS;
            case 25:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_REQUEST_REPLY_REFUSE_SUCCESS;
            case 26:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_REQUEST_APPLY_DIRECT_REFUSE_SUCCESS;
            case 27:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_REQUEST_REPLY_GROUP_REFUSE_SUCCESS;
            case 28:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_REQUEST_PERMIT_REFUSE_SUCCESS;
            case 29:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_REQUEST_PERMIT_GROUP_REFUSE_SUCCESS;
            case 30:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_RECEIVE_PERMIT_REFUSE_MESSAGE;
            case 31:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_RECEIVE_PERMIT_GROUP_REFUSE_MESSAGE;
            case 32:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_RECEIVE_CANCEL_INVITE_MESSAGE;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_RECEIVE_CANCEL_APPLY_MESSAGE;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_RECEIVE_CANCEL_INVITE_GROUP_MESSAGE;
            case 35:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_RECEIVE_CANCEL_APPLY_GROUP_MESSAGE;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_RECEIVE_REPLY_REFUSE_MESSAGE;
            case 37:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_RECEIVE_REPLY_GROUP_REFUSE_MESSAGE;
            case 38:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_REQUEST_JOIN_DIRECT_SUCCESS;
            case 39:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_REQUEST_APPLY_DIRECT_AGREE_SUCCESS;
            case 40:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_RECEIVE_JOIN_DIRECT_MESSAGE;
            case 41:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_RECEIVE_JOIN_GROUP_DIRECT_MESSAGE;
            case 42:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_RECEIVE_JOIN_ROOM_DIRECT_MESSAGE;
            case 43:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_RECEIVE_LIST_CHANGE_USER_JOIN;
            case 44:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_REQUEST_REPLY_AGREE_SUCCESS;
            case 45:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_REQUEST_PERMIT_AGREE_SUCCESS;
            case 46:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_REQUEST_REPLY_GROUP_AGREE_SUCCESS;
            case 47:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_REQUEST_PERMIT_GROUP_AGREE_SUCCESS;
            case 48:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_RECEIVE_REPLY_AGREE_MESSAGE;
            case 49:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_RECEIVE_PERMIT_AGREE_MESSAGE;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_RECEIVE_REPLY_GROUP_AGREE_MESSAGE;
            case 51:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_RECEIVE_PERMIT_GROUP_AGREE_MESSAGE;
            case 52:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_RECEIVE_REMOTE_FIRST_FRAME_RENDER;
            case 53:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_RECEIVE_REMOTE_AUDIO_FRAME;
            case 54:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_ALREADY_RECEIVED_FIRST_FRAME;
            case 55:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_RECEIVE_LEAVE_MESSAGE;
            case 56:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_RECEIVE_LIST_CHANGE_USER_LEAVE;
            case 57:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_RECEIVE_LEAVE_GROUP_MESSAGE;
            case 58:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_RECEIVE_RTC_KICK_OUT_MESSAGE;
            case 59:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_USER_FSM_DELETED;
            case 60:
                return EnumC2231731CWl.VAR_USER_LINK_STATE_EVENT_RESET;
            default:
                throw new C1954807lC();
        }
    }

    public final int intoInt() {
        switch (C2231711CWj.LIZ[ordinal()]) {
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
            case 26:
                return 25;
            case 27:
                return 26;
            case 28:
                return 27;
            case 29:
                return 28;
            case 30:
                return 29;
            case 31:
                return 30;
            case 32:
                return 31;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return 32;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return 33;
            case 35:
                return 34;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return 35;
            case 37:
                return 36;
            case 38:
                return 37;
            case 39:
                return 38;
            case 40:
                return 39;
            case 41:
                return 40;
            case 42:
                return 41;
            case 43:
                return 42;
            case 44:
                return 43;
            case 45:
                return 44;
            case 46:
                return 45;
            case 47:
                return 46;
            case 48:
                return 47;
            case 49:
                return 48;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return 49;
            case 51:
                return 50;
            case 52:
                return 51;
            case 53:
                return 52;
            case 54:
                return 53;
            case 55:
                return 54;
            case 56:
                return 55;
            case 57:
                return 56;
            case 58:
                return 57;
            case 59:
                return 58;
            case 60:
                return 59;
            default:
                throw new C1954807lC();
        }
    }
}
