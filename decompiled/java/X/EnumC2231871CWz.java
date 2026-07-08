package X;

import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1CWz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2231871CWz {
    Unknown,
    LeaveSelf,
    LeaveMsg,
    RoomClose,
    RtcError,
    LeaveOnlyOne,
    FirstFrameTimeOut,
    LinkedListWithoutMe,
    RtcLost;

    public static final C2232281CYo Companion = new Object() { // from class: X.1CYo
    };

    public static EnumC2231871CWz valueOf(String str) {
        return (EnumC2231871CWz) C08FF.LIZ(EnumC2231871CWz.class, str);
    }

    public final C1CW2 into() {
        switch (C1CXU.LIZ[ordinal()]) {
            case 1:
                return C1CW2.VAR_LINK_MIC_SDK_FINISH_REASON_UNKNOWN;
            case 2:
                return C1CW2.VAR_LINK_MIC_SDK_FINISH_REASON_LEAVE_SELF;
            case 3:
                return C1CW2.VAR_LINK_MIC_SDK_FINISH_REASON_LEAVE_MSG;
            case 4:
                return C1CW2.VAR_LINK_MIC_SDK_FINISH_REASON_ROOM_CLOSE;
            case 5:
                return C1CW2.VAR_LINK_MIC_SDK_FINISH_REASON_RTC_ERROR;
            case 6:
                return C1CW2.VAR_LINK_MIC_SDK_FINISH_REASON_LEAVE_ONLY_ONE;
            case 7:
                return C1CW2.VAR_LINK_MIC_SDK_FINISH_REASON_FIRST_FRAME_TIME_OUT;
            case 8:
                return C1CW2.VAR_LINK_MIC_SDK_FINISH_REASON_LINKED_LIST_WITHOUT_ME;
            case BdTuring.TYPE_ECAF /* 9 */:
                return C1CW2.VAR_LINK_MIC_SDK_FINISH_REASON_RTC_LOST;
            default:
                throw new C1954807lC();
        }
    }

    public final int intoInt() {
        switch (C1CXU.LIZ[ordinal()]) {
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
            default:
                throw new C1954807lC();
        }
    }
}
