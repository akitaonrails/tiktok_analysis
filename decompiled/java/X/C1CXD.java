package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1CXD, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CXD {
    Positive,
    MessageFilter,
    PushMore,
    PushLess,
    ForwardFailed,
    JoinGroupTimer,
    CancelLinked,
    RechargeWhenConnection,
    RechargeNetworkResume,
    PermitLeaveFilter,
    ArchDataErrorInner,
    ArchDataErrorCross,
    WaitCrossDataTimeout;

    public static final C2232381CYy Companion = new Object() { // from class: X.1CYy
    };

    public static C1CXD valueOf(String str) {
        return (C1CXD) C08FF.LIZ(C1CXD.class, str);
    }

    public final C1CX8 into() {
        switch (C1CXF.LIZ[ordinal()]) {
            case 1:
                return C1CX8.VAR_LINK_MIC_RECHARGE_SOURCE_POSITIVE;
            case 2:
                return C1CX8.VAR_LINK_MIC_RECHARGE_SOURCE_MESSAGE_FILTER;
            case 3:
                return C1CX8.VAR_LINK_MIC_RECHARGE_SOURCE_PUSH_MORE;
            case 4:
                return C1CX8.VAR_LINK_MIC_RECHARGE_SOURCE_PUSH_LESS;
            case 5:
                return C1CX8.VAR_LINK_MIC_RECHARGE_SOURCE_FORWARD_FAILED;
            case 6:
                return C1CX8.VAR_LINK_MIC_RECHARGE_SOURCE_JOIN_GROUP_TIMER;
            case 7:
                return C1CX8.VAR_LINK_MIC_RECHARGE_SOURCE_CANCEL_LINKED;
            case 8:
                return C1CX8.VAR_LINK_MIC_RECHARGE_SOURCE_RECHARGE_WHEN_CONNECTION;
            case BdTuring.TYPE_ECAF /* 9 */:
                return C1CX8.VAR_LINK_MIC_RECHARGE_SOURCE_RECHARGE_NETWORK_RESUME;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return C1CX8.VAR_LINK_MIC_RECHARGE_SOURCE_PERMIT_LEAVE_FILTER;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return C1CX8.VAR_LINK_MIC_RECHARGE_SOURCE_ARCH_DATA_ERROR_INNER;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return C1CX8.VAR_LINK_MIC_RECHARGE_SOURCE_ARCH_DATA_ERROR_CROSS;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return C1CX8.VAR_LINK_MIC_RECHARGE_SOURCE_WAIT_CROSS_DATA_TIMEOUT;
            default:
                throw new C1954807lC();
        }
    }

    public final int intoInt() {
        switch (C1CXF.LIZ[ordinal()]) {
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
