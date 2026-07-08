package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0jSz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1282030jSz implements WireEnum {
    VAR_LINK_MIC_LEAVE_REASON_UNKNOWN(0),
    VAR_LINK_MIC_LEAVE_REASON_CLICK_QUICK_LEAVE_BTN(1),
    VAR_LINK_MIC_LEAVE_REASON_MANAGE_VIEW_CLICK_LEAVE(2),
    VAR_LINK_MIC_LEAVE_REASON_LIVE_END(3),
    VAR_LINK_MIC_LEAVE_REASON_FEEDBACK_V3(4),
    VAR_LINK_MIC_LEAVE_REASON_ONLY_ONE_TAP_GO_LIVE(5),
    VAR_LINK_MIC_LEAVE_REASON_GIFT_PANEL_CLICK_LEAVE(6),
    VAR_LINK_MIC_LEAVE_REASON_CLEAR_ALL_STATES(7),
    VAR_LINK_MIC_LEAVE_REASON_OPTIMIZE_FIRST_ENTER_IN_LIST(8),
    VAR_LINK_MIC_LEAVE_REASON_MAXIMUM_GUESTS_REACHED(9),
    VAR_LINK_MIC_LEAVE_REASON_GUEST_PAUSE_TIMEOUT(10),
    VAR_LINK_MIC_LEAVE_REASON_APP_WILL_TERMINATE(11),
    VAR_LINK_MIC_LEAVE_REASON_PLAY_PIP_WINDOW(12),
    VAR_LINK_MIC_LEAVE_REASON_COPYRIGHT_CLICK_BTN(13),
    VAR_LINK_MIC_LEAVE_REASON_ONLY_ONE(14),
    VAR_LINK_MIC_LEAVE_REASON_GUEST_RESET_LINKMIC_STATUS(15),
    VAR_LINK_MIC_LEAVE_REASON_PERMIT_BG_TIMEOUT(16),
    VAR_LINK_MIC_LEAVE_REASON_REPLY_FAILED(17),
    VAR_LINK_MIC_LEAVE_REASON_JOIN_CHANNEL_ERROR(18),
    VAR_LINK_MIC_LEAVE_REASON_PERMIT_MESSAGE_TIMEOUT(19),
    VAR_LINK_MIC_LEAVE_REASON_RTC_ERROR(20),
    VAR_LINK_MIC_LEAVE_REASON_ANCHOR_OFFLINE(21),
    VAR_LINK_MIC_LEAVE_REASON_RTC_LOST(22),
    VAR_LINK_MIC_LEAVE_REASON_APPLIED_AUDIO_PANEL_CLOSE(23),
    VAR_LINK_MIC_LEAVE_REASON_INVITED_AUDIO_PANEL_CLOSE(24),
    VAR_LINK_MIC_LEAVE_REASON_APPLIED_VIDEO_PANEL_CLOSE(25),
    VAR_LINK_MIC_LEAVE_REASON_INVITED_VIDEO_PANEL_CLOSE(26),
    VAR_LINK_MIC_LEAVE_REASON_APPLIED_AUDIO_PANEL_TIMEOUT(27),
    VAR_LINK_MIC_LEAVE_REASON_INVITED_AUDIO_PANEL_TIMEOUT(28),
    VAR_LINK_MIC_LEAVE_REASON_APPLIED_VIDEO_PANEL_TIMEOUT(29),
    VAR_LINK_MIC_LEAVE_REASON_INVITED_VIDEO_PANEL_TIMEOUT(30),
    VAR_LINK_MIC_LEAVE_REASON_REPLY_RESERVE_ACCEPT_FAILED(31),
    VAR_LINK_MIC_LEAVE_REASON_LINK_MIC_TREE_CONFLICT(32),
    VAR_LINK_MIC_LEAVE_REASON_FINISH_RECEIVE_LINKED(33),
    VAR_LINK_MIC_LEAVE_REASON_FINISH_RECEIVE_LINKED_NEW(34),
    VAR_LINK_MIC_LEAVE_REASON_RTC_USER_LEAVED(35),
    VAR_LINK_MIC_LEAVE_REASON_FIRST_FRAME_TIME_OUT(36),
    VAR_LINK_MIC_LEAVE_REASON_CAMERA_DEVICE_LOST(37),
    VAR_LINK_MIC_LEAVE_REASON_SEQUENCE_ROOM_START(38),
    VAR_LINK_MIC_LEAVE_REASON_MANUALLY_DISCONNECT_FOR_PERCEPTION_CENTER(39),
    VAR_LINK_MIC_LEAVE_REASON_MULTI_GUEST_RESERVATION(40),
    VAR_LINK_MIC_LEAVE_REASON_LIVE_STUDIO_MULTI_SOURCE_CLOSE(41),
    VAR_LINK_MIC_LEAVE_REASON_MULTI_GUEST_LAYOUT_ERROR(42),
    VAR_LINK_MIC_LEAVE_REASON_LEAVE_GROUP_WITH_USER_CLICK_DISCONNECT(43),
    VAR_LINK_MIC_LEAVE_REASON_LEAVE_GROUP_WITH_PERCEPTION_MESSAGE(44),
    VAR_LINK_MIC_LEAVE_REASON_LEAVE_GROUP_WITH_MIC_ROOM_START(45),
    VAR_LINK_MIC_LEAVE_REASON_LEAVE_GROUP_WITH_DETACH_VIEW(46),
    VAR_LINK_MIC_LEAVE_REASON_LEAVE_GROUP_WITH_MODE_SWITCH(47),
    VAR_LINK_MIC_LEAVE_REASON_LEAVE_GROUP_WITH_COHOST_RESUME(48);

    public static final ProtoAdapter<EnumC1282030jSz> ADAPTER = new EnumAdapter<EnumC1282030jSz>() { // from class: X.0jT9
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC1282030jSz.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC1282030jSz fromValue(int i) {
        switch (i) {
            case 0:
                return VAR_LINK_MIC_LEAVE_REASON_UNKNOWN;
            case 1:
                return VAR_LINK_MIC_LEAVE_REASON_CLICK_QUICK_LEAVE_BTN;
            case 2:
                return VAR_LINK_MIC_LEAVE_REASON_MANAGE_VIEW_CLICK_LEAVE;
            case 3:
                return VAR_LINK_MIC_LEAVE_REASON_LIVE_END;
            case 4:
                return VAR_LINK_MIC_LEAVE_REASON_FEEDBACK_V3;
            case 5:
                return VAR_LINK_MIC_LEAVE_REASON_ONLY_ONE_TAP_GO_LIVE;
            case 6:
                return VAR_LINK_MIC_LEAVE_REASON_GIFT_PANEL_CLICK_LEAVE;
            case 7:
                return VAR_LINK_MIC_LEAVE_REASON_CLEAR_ALL_STATES;
            case 8:
                return VAR_LINK_MIC_LEAVE_REASON_OPTIMIZE_FIRST_ENTER_IN_LIST;
            case BdTuring.TYPE_ECAF /* 9 */:
                return VAR_LINK_MIC_LEAVE_REASON_MAXIMUM_GUESTS_REACHED;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return VAR_LINK_MIC_LEAVE_REASON_GUEST_PAUSE_TIMEOUT;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return VAR_LINK_MIC_LEAVE_REASON_APP_WILL_TERMINATE;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return VAR_LINK_MIC_LEAVE_REASON_PLAY_PIP_WINDOW;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return VAR_LINK_MIC_LEAVE_REASON_COPYRIGHT_CLICK_BTN;
            case 14:
                return VAR_LINK_MIC_LEAVE_REASON_ONLY_ONE;
            case 15:
                return VAR_LINK_MIC_LEAVE_REASON_GUEST_RESET_LINKMIC_STATUS;
            case 16:
                return VAR_LINK_MIC_LEAVE_REASON_PERMIT_BG_TIMEOUT;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return VAR_LINK_MIC_LEAVE_REASON_REPLY_FAILED;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return VAR_LINK_MIC_LEAVE_REASON_JOIN_CHANNEL_ERROR;
            case 19:
                return VAR_LINK_MIC_LEAVE_REASON_PERMIT_MESSAGE_TIMEOUT;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return VAR_LINK_MIC_LEAVE_REASON_RTC_ERROR;
            case 21:
                return VAR_LINK_MIC_LEAVE_REASON_ANCHOR_OFFLINE;
            case 22:
                return VAR_LINK_MIC_LEAVE_REASON_RTC_LOST;
            case 23:
                return VAR_LINK_MIC_LEAVE_REASON_APPLIED_AUDIO_PANEL_CLOSE;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return VAR_LINK_MIC_LEAVE_REASON_INVITED_AUDIO_PANEL_CLOSE;
            case 25:
                return VAR_LINK_MIC_LEAVE_REASON_APPLIED_VIDEO_PANEL_CLOSE;
            case 26:
                return VAR_LINK_MIC_LEAVE_REASON_INVITED_VIDEO_PANEL_CLOSE;
            case 27:
                return VAR_LINK_MIC_LEAVE_REASON_APPLIED_AUDIO_PANEL_TIMEOUT;
            case 28:
                return VAR_LINK_MIC_LEAVE_REASON_INVITED_AUDIO_PANEL_TIMEOUT;
            case 29:
                return VAR_LINK_MIC_LEAVE_REASON_APPLIED_VIDEO_PANEL_TIMEOUT;
            case 30:
                return VAR_LINK_MIC_LEAVE_REASON_INVITED_VIDEO_PANEL_TIMEOUT;
            case 31:
                return VAR_LINK_MIC_LEAVE_REASON_REPLY_RESERVE_ACCEPT_FAILED;
            case 32:
                return VAR_LINK_MIC_LEAVE_REASON_LINK_MIC_TREE_CONFLICT;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return VAR_LINK_MIC_LEAVE_REASON_FINISH_RECEIVE_LINKED;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return VAR_LINK_MIC_LEAVE_REASON_FINISH_RECEIVE_LINKED_NEW;
            case 35:
                return VAR_LINK_MIC_LEAVE_REASON_RTC_USER_LEAVED;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return VAR_LINK_MIC_LEAVE_REASON_FIRST_FRAME_TIME_OUT;
            case 37:
                return VAR_LINK_MIC_LEAVE_REASON_CAMERA_DEVICE_LOST;
            case 38:
                return VAR_LINK_MIC_LEAVE_REASON_SEQUENCE_ROOM_START;
            case 39:
                return VAR_LINK_MIC_LEAVE_REASON_MANUALLY_DISCONNECT_FOR_PERCEPTION_CENTER;
            case 40:
                return VAR_LINK_MIC_LEAVE_REASON_MULTI_GUEST_RESERVATION;
            case 41:
                return VAR_LINK_MIC_LEAVE_REASON_LIVE_STUDIO_MULTI_SOURCE_CLOSE;
            case 42:
                return VAR_LINK_MIC_LEAVE_REASON_MULTI_GUEST_LAYOUT_ERROR;
            case 43:
                return VAR_LINK_MIC_LEAVE_REASON_LEAVE_GROUP_WITH_USER_CLICK_DISCONNECT;
            case 44:
                return VAR_LINK_MIC_LEAVE_REASON_LEAVE_GROUP_WITH_PERCEPTION_MESSAGE;
            case 45:
                return VAR_LINK_MIC_LEAVE_REASON_LEAVE_GROUP_WITH_MIC_ROOM_START;
            case 46:
                return VAR_LINK_MIC_LEAVE_REASON_LEAVE_GROUP_WITH_DETACH_VIEW;
            case 47:
                return VAR_LINK_MIC_LEAVE_REASON_LEAVE_GROUP_WITH_MODE_SWITCH;
            case 48:
                return VAR_LINK_MIC_LEAVE_REASON_LEAVE_GROUP_WITH_COHOST_RESUME;
            default:
                return null;
        }
    }

    public static EnumC1282030jSz valueOf(String str) {
        return (EnumC1282030jSz) C08FF.LIZ(EnumC1282030jSz.class, str);
    }

    EnumC1282030jSz(int i) {
        this.LL = i;
    }
}
