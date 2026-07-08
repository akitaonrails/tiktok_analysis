package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1CWq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2231781CWq {
    RequestCreateChannelSuccess,
    ReceiveCreateChannelMessage,
    AudienceInitSuccess,
    RequestFinishChannelSuccess,
    ReceiveFinishChannelMessage,
    UserLinkStateTriggerToWait,
    WaitCrossDataTriggerToWait,
    UserLinkStateTriggerToConnecting,
    UserLinkStateTriggerToLinked,
    UserLeaveTriggerToConnecting,
    UserLeaveTriggerToWait,
    UserLeaveTriggerToIdle,
    ClickLeave,
    ClickLeaveGroup,
    ReceiveInnerKickOutMessage,
    ReceiveLeaveGroupMessage,
    LeaveOnlyOne,
    FirstFrameTimeout,
    LinkedListWithoutMe,
    RtcLost,
    RtcError,
    StartLiveCoreError,
    Reset;

    public static final C2232261CYm Companion = new Object() { // from class: X.1CYm
    };

    public static EnumC2231781CWq valueOf(String str) {
        return (EnumC2231781CWq) C08FF.LIZ(EnumC2231781CWq.class, str);
    }

    public final EnumC2231841CWw into() {
        switch (C1CX0.LIZ[ordinal()]) {
            case 1:
                return EnumC2231841CWw.VAR_SDK_LINK_EVENT_REQUEST_CREATE_CHANNEL_SUCCESS;
            case 2:
                return EnumC2231841CWw.VAR_SDK_LINK_EVENT_RECEIVE_CREATE_CHANNEL_MESSAGE;
            case 3:
                return EnumC2231841CWw.VAR_SDK_LINK_EVENT_AUDIENCE_INIT_SUCCESS;
            case 4:
                return EnumC2231841CWw.VAR_SDK_LINK_EVENT_REQUEST_FINISH_CHANNEL_SUCCESS;
            case 5:
                return EnumC2231841CWw.VAR_SDK_LINK_EVENT_RECEIVE_FINISH_CHANNEL_MESSAGE;
            case 6:
                return EnumC2231841CWw.VAR_SDK_LINK_EVENT_USER_LINK_STATE_TRIGGER_TO_WAIT;
            case 7:
                return EnumC2231841CWw.VAR_SDK_LINK_EVENT_WAIT_CROSS_DATA_TRIGGER_TO_WAIT;
            case 8:
                return EnumC2231841CWw.VAR_SDK_LINK_EVENT_USER_LINK_STATE_TRIGGER_TO_CONNECTING;
            case BdTuring.TYPE_ECAF /* 9 */:
                return EnumC2231841CWw.VAR_SDK_LINK_EVENT_USER_LINK_STATE_TRIGGER_TO_LINKED;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return EnumC2231841CWw.VAR_SDK_LINK_EVENT_USER_LEAVE_TRIGGER_TO_CONNECTING;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return EnumC2231841CWw.VAR_SDK_LINK_EVENT_USER_LEAVE_TRIGGER_TO_WAIT;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return EnumC2231841CWw.VAR_SDK_LINK_EVENT_USER_LEAVE_TRIGGER_TO_IDLE;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return EnumC2231841CWw.VAR_SDK_LINK_EVENT_CLICK_LEAVE;
            case 14:
                return EnumC2231841CWw.VAR_SDK_LINK_EVENT_CLICK_LEAVE_GROUP;
            case 15:
                return EnumC2231841CWw.VAR_SDK_LINK_EVENT_RECEIVE_INNER_KICK_OUT_MESSAGE;
            case 16:
                return EnumC2231841CWw.VAR_SDK_LINK_EVENT_RECEIVE_LEAVE_GROUP_MESSAGE;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return EnumC2231841CWw.VAR_SDK_LINK_EVENT_LEAVE_ONLY_ONE;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return EnumC2231841CWw.VAR_SDK_LINK_EVENT_FIRST_FRAME_TIMEOUT;
            case 19:
                return EnumC2231841CWw.VAR_SDK_LINK_EVENT_LINKED_LIST_WITHOUT_ME;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return EnumC2231841CWw.VAR_SDK_LINK_EVENT_RTC_LOST;
            case 21:
                return EnumC2231841CWw.VAR_SDK_LINK_EVENT_RTC_ERROR;
            case 22:
                return EnumC2231841CWw.VAR_SDK_LINK_EVENT_START_LIVE_CORE_ERROR;
            case 23:
                return EnumC2231841CWw.VAR_SDK_LINK_EVENT_RESET;
            default:
                throw new C1954807lC();
        }
    }

    public final int intoInt() {
        switch (C1CX0.LIZ[ordinal()]) {
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
            default:
                throw new C1954807lC();
        }
    }
}
