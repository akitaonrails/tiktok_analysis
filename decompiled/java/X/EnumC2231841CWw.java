package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1CWw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2231841CWw implements WireEnum {
    VAR_SDK_LINK_EVENT_REQUEST_CREATE_CHANNEL_SUCCESS(0),
    VAR_SDK_LINK_EVENT_RECEIVE_CREATE_CHANNEL_MESSAGE(1),
    VAR_SDK_LINK_EVENT_AUDIENCE_INIT_SUCCESS(2),
    VAR_SDK_LINK_EVENT_REQUEST_FINISH_CHANNEL_SUCCESS(3),
    VAR_SDK_LINK_EVENT_RECEIVE_FINISH_CHANNEL_MESSAGE(4),
    VAR_SDK_LINK_EVENT_USER_LINK_STATE_TRIGGER_TO_WAIT(5),
    VAR_SDK_LINK_EVENT_WAIT_CROSS_DATA_TRIGGER_TO_WAIT(6),
    VAR_SDK_LINK_EVENT_USER_LINK_STATE_TRIGGER_TO_CONNECTING(7),
    VAR_SDK_LINK_EVENT_USER_LINK_STATE_TRIGGER_TO_LINKED(8),
    VAR_SDK_LINK_EVENT_USER_LEAVE_TRIGGER_TO_CONNECTING(9),
    VAR_SDK_LINK_EVENT_USER_LEAVE_TRIGGER_TO_WAIT(10),
    VAR_SDK_LINK_EVENT_USER_LEAVE_TRIGGER_TO_IDLE(11),
    VAR_SDK_LINK_EVENT_CLICK_LEAVE(12),
    VAR_SDK_LINK_EVENT_CLICK_LEAVE_GROUP(13),
    VAR_SDK_LINK_EVENT_RECEIVE_INNER_KICK_OUT_MESSAGE(14),
    VAR_SDK_LINK_EVENT_RECEIVE_LEAVE_GROUP_MESSAGE(15),
    VAR_SDK_LINK_EVENT_LEAVE_ONLY_ONE(16),
    VAR_SDK_LINK_EVENT_FIRST_FRAME_TIMEOUT(17),
    VAR_SDK_LINK_EVENT_LINKED_LIST_WITHOUT_ME(18),
    VAR_SDK_LINK_EVENT_RTC_LOST(19),
    VAR_SDK_LINK_EVENT_RTC_ERROR(20),
    VAR_SDK_LINK_EVENT_START_LIVE_CORE_ERROR(21),
    VAR_SDK_LINK_EVENT_RESET(22);

    public static final ProtoAdapter<EnumC2231841CWw> ADAPTER = new EnumAdapter<EnumC2231841CWw>() { // from class: X.1CYJ
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2231841CWw.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2231841CWw fromValue(int i) {
        switch (i) {
            case 0:
                return VAR_SDK_LINK_EVENT_REQUEST_CREATE_CHANNEL_SUCCESS;
            case 1:
                return VAR_SDK_LINK_EVENT_RECEIVE_CREATE_CHANNEL_MESSAGE;
            case 2:
                return VAR_SDK_LINK_EVENT_AUDIENCE_INIT_SUCCESS;
            case 3:
                return VAR_SDK_LINK_EVENT_REQUEST_FINISH_CHANNEL_SUCCESS;
            case 4:
                return VAR_SDK_LINK_EVENT_RECEIVE_FINISH_CHANNEL_MESSAGE;
            case 5:
                return VAR_SDK_LINK_EVENT_USER_LINK_STATE_TRIGGER_TO_WAIT;
            case 6:
                return VAR_SDK_LINK_EVENT_WAIT_CROSS_DATA_TRIGGER_TO_WAIT;
            case 7:
                return VAR_SDK_LINK_EVENT_USER_LINK_STATE_TRIGGER_TO_CONNECTING;
            case 8:
                return VAR_SDK_LINK_EVENT_USER_LINK_STATE_TRIGGER_TO_LINKED;
            case BdTuring.TYPE_ECAF /* 9 */:
                return VAR_SDK_LINK_EVENT_USER_LEAVE_TRIGGER_TO_CONNECTING;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return VAR_SDK_LINK_EVENT_USER_LEAVE_TRIGGER_TO_WAIT;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return VAR_SDK_LINK_EVENT_USER_LEAVE_TRIGGER_TO_IDLE;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return VAR_SDK_LINK_EVENT_CLICK_LEAVE;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return VAR_SDK_LINK_EVENT_CLICK_LEAVE_GROUP;
            case 14:
                return VAR_SDK_LINK_EVENT_RECEIVE_INNER_KICK_OUT_MESSAGE;
            case 15:
                return VAR_SDK_LINK_EVENT_RECEIVE_LEAVE_GROUP_MESSAGE;
            case 16:
                return VAR_SDK_LINK_EVENT_LEAVE_ONLY_ONE;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return VAR_SDK_LINK_EVENT_FIRST_FRAME_TIMEOUT;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return VAR_SDK_LINK_EVENT_LINKED_LIST_WITHOUT_ME;
            case 19:
                return VAR_SDK_LINK_EVENT_RTC_LOST;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return VAR_SDK_LINK_EVENT_RTC_ERROR;
            case 21:
                return VAR_SDK_LINK_EVENT_START_LIVE_CORE_ERROR;
            case 22:
                return VAR_SDK_LINK_EVENT_RESET;
            default:
                return null;
        }
    }

    public static EnumC2231841CWw valueOf(String str) {
        return (EnumC2231841CWw) C08FF.LIZ(EnumC2231841CWw.class, str);
    }

    EnumC2231841CWw(int i) {
        this.LL = i;
    }
}
