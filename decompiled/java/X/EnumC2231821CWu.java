package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1CWu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2231821CWu {
    StartJoinRtc,
    OnJoinRtcSuccess,
    StartPushStream,
    StartMixStream,
    StartInteractStream,
    StartForwardStream,
    StopForwardStream,
    LeaveRtc,
    OnRtcError,
    OnRtcLost,
    ForwardStreamError,
    ForwardStreamSuccess;

    public static final C2232271CYn Companion = new Object() { // from class: X.1CYn
    };

    public static EnumC2231821CWu valueOf(String str) {
        return (EnumC2231821CWu) C08FF.LIZ(EnumC2231821CWu.class, str);
    }

    public final C1CXA into() {
        switch (C1CXH.LIZ[ordinal()]) {
            case 1:
                return C1CXA.VAR_SDK_LINK_RTC_EVENT_START_JOIN_RTC;
            case 2:
                return C1CXA.VAR_SDK_LINK_RTC_EVENT_ON_JOIN_RTC_SUCCESS;
            case 3:
                return C1CXA.VAR_SDK_LINK_RTC_EVENT_START_PUSH_STREAM;
            case 4:
                return C1CXA.VAR_SDK_LINK_RTC_EVENT_START_MIX_STREAM;
            case 5:
                return C1CXA.VAR_SDK_LINK_RTC_EVENT_START_INTERACT_STREAM;
            case 6:
                return C1CXA.VAR_SDK_LINK_RTC_EVENT_START_FORWARD_STREAM;
            case 7:
                return C1CXA.VAR_SDK_LINK_RTC_EVENT_STOP_FORWARD_STREAM;
            case 8:
                return C1CXA.VAR_SDK_LINK_RTC_EVENT_LEAVE_RTC;
            case BdTuring.TYPE_ECAF /* 9 */:
                return C1CXA.VAR_SDK_LINK_RTC_EVENT_ON_RTC_ERROR;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return C1CXA.VAR_SDK_LINK_RTC_EVENT_ON_RTC_LOST;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return C1CXA.VAR_SDK_LINK_RTC_EVENT_FORWARD_STREAM_ERROR;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return C1CXA.VAR_SDK_LINK_RTC_EVENT_FORWARD_STREAM_SUCCESS;
            default:
                throw new C1954807lC();
        }
    }

    public final int intoInt() {
        switch (C1CXH.LIZ[ordinal()]) {
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
            default:
                throw new C1954807lC();
        }
    }
}
