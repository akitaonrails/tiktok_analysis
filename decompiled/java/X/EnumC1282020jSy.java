package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0jSy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1282020jSy {
    Unknown,
    ClickQuickLeaveBtn,
    ManageViewClickLeave,
    LiveEnd,
    FeedbackV3,
    OnlyOneTapGoLive,
    GiftPanelClickLeave,
    ClearAllStates,
    OptimizeFirstEnterInList,
    MaximumGuestsReached,
    GuestPauseTimeout,
    AppWillTerminate,
    PlayPipWindow,
    CopyrightClickBtn,
    OnlyOne,
    GuestResetLinkmicStatus,
    PermitBgTimeout,
    ReplyFailed,
    JoinChannelError,
    PermitMessageTimeout,
    RtcError,
    AnchorOffline,
    RtcLost,
    AppliedAudioPanelClose,
    InvitedAudioPanelClose,
    AppliedVideoPanelClose,
    InvitedVideoPanelClose,
    AppliedAudioPanelTimeout,
    InvitedAudioPanelTimeout,
    AppliedVideoPanelTimeout,
    InvitedVideoPanelTimeout,
    ReplyReserveAcceptFailed,
    LinkMicTreeConflict,
    FinishReceiveLinked,
    FinishReceiveLinkedNew,
    RtcUserLeaved,
    FirstFrameTimeOut,
    CameraDeviceLost,
    SequenceRoomStart,
    ManuallyDisconnectForPerceptionCenter,
    MultiGuestReservation,
    LiveStudioMultiSourceClose,
    MultiGuestLayoutError,
    LeaveGroupWithUserClickDisconnect,
    LeaveGroupWithPerceptionMessage,
    LeaveGroupWithMicRoomStart,
    LeaveGroupWithDetachView,
    LeaveGroupWithModeSwitch,
    LeaveGroupWithCohostResume;

    public static final C1282140jTA Companion = new Object() { // from class: X.0jTA
    };

    public static EnumC1282020jSy valueOf(String str) {
        return (EnumC1282020jSy) C08FF.LIZ(EnumC1282020jSy.class, str);
    }

    public final EnumC1282030jSz into() {
        switch (C1282010jSx.LIZ[ordinal()]) {
            case 1:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_UNKNOWN;
            case 2:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_CLICK_QUICK_LEAVE_BTN;
            case 3:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_MANAGE_VIEW_CLICK_LEAVE;
            case 4:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_LIVE_END;
            case 5:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_FEEDBACK_V3;
            case 6:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_ONLY_ONE_TAP_GO_LIVE;
            case 7:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_GIFT_PANEL_CLICK_LEAVE;
            case 8:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_CLEAR_ALL_STATES;
            case BdTuring.TYPE_ECAF /* 9 */:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_OPTIMIZE_FIRST_ENTER_IN_LIST;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_MAXIMUM_GUESTS_REACHED;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_GUEST_PAUSE_TIMEOUT;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_APP_WILL_TERMINATE;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_PLAY_PIP_WINDOW;
            case 14:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_COPYRIGHT_CLICK_BTN;
            case 15:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_ONLY_ONE;
            case 16:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_GUEST_RESET_LINKMIC_STATUS;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_PERMIT_BG_TIMEOUT;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_REPLY_FAILED;
            case 19:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_JOIN_CHANNEL_ERROR;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_PERMIT_MESSAGE_TIMEOUT;
            case 21:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_RTC_ERROR;
            case 22:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_ANCHOR_OFFLINE;
            case 23:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_RTC_LOST;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_APPLIED_AUDIO_PANEL_CLOSE;
            case 25:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_INVITED_AUDIO_PANEL_CLOSE;
            case 26:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_APPLIED_VIDEO_PANEL_CLOSE;
            case 27:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_INVITED_VIDEO_PANEL_CLOSE;
            case 28:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_APPLIED_AUDIO_PANEL_TIMEOUT;
            case 29:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_INVITED_AUDIO_PANEL_TIMEOUT;
            case 30:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_APPLIED_VIDEO_PANEL_TIMEOUT;
            case 31:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_INVITED_VIDEO_PANEL_TIMEOUT;
            case 32:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_REPLY_RESERVE_ACCEPT_FAILED;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_LINK_MIC_TREE_CONFLICT;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_FINISH_RECEIVE_LINKED;
            case 35:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_FINISH_RECEIVE_LINKED_NEW;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_RTC_USER_LEAVED;
            case 37:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_FIRST_FRAME_TIME_OUT;
            case 38:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_CAMERA_DEVICE_LOST;
            case 39:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_SEQUENCE_ROOM_START;
            case 40:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_MANUALLY_DISCONNECT_FOR_PERCEPTION_CENTER;
            case 41:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_MULTI_GUEST_RESERVATION;
            case 42:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_LIVE_STUDIO_MULTI_SOURCE_CLOSE;
            case 43:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_MULTI_GUEST_LAYOUT_ERROR;
            case 44:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_LEAVE_GROUP_WITH_USER_CLICK_DISCONNECT;
            case 45:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_LEAVE_GROUP_WITH_PERCEPTION_MESSAGE;
            case 46:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_LEAVE_GROUP_WITH_MIC_ROOM_START;
            case 47:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_LEAVE_GROUP_WITH_DETACH_VIEW;
            case 48:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_LEAVE_GROUP_WITH_MODE_SWITCH;
            case 49:
                return EnumC1282030jSz.VAR_LINK_MIC_LEAVE_REASON_LEAVE_GROUP_WITH_COHOST_RESUME;
            default:
                throw new C1954807lC();
        }
    }

    public final int intoInt() {
        switch (C1282010jSx.LIZ[ordinal()]) {
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
            default:
                throw new C1954807lC();
        }
    }
}
