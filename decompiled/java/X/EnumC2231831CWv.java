package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1CWv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2231831CWv {
    Apply,
    Invite,
    FirstFrameInner,
    FirstFrameCross,
    CompensateIm,
    AudienceStart,
    ForwardStream,
    AuxStream,
    StateAggregate,
    PreviewCountDown,
    WaitCrossData;

    public static final C1CZ0 Companion = new Object() { // from class: X.1CZ0
    };

    public static EnumC2231831CWv valueOf(String str) {
        return (EnumC2231831CWv) C08FF.LIZ(EnumC2231831CWv.class, str);
    }

    public final C1CXB into() {
        switch (C1CXO.LIZ[ordinal()]) {
            case 1:
                return C1CXB.VAR_LINK_MIC_TIMER_TYPE_APPLY;
            case 2:
                return C1CXB.VAR_LINK_MIC_TIMER_TYPE_INVITE;
            case 3:
                return C1CXB.VAR_LINK_MIC_TIMER_TYPE_FIRST_FRAME_INNER;
            case 4:
                return C1CXB.VAR_LINK_MIC_TIMER_TYPE_FIRST_FRAME_CROSS;
            case 5:
                return C1CXB.VAR_LINK_MIC_TIMER_TYPE_COMPENSATE_IM;
            case 6:
                return C1CXB.VAR_LINK_MIC_TIMER_TYPE_AUDIENCE_START;
            case 7:
                return C1CXB.VAR_LINK_MIC_TIMER_TYPE_FORWARD_STREAM;
            case 8:
                return C1CXB.VAR_LINK_MIC_TIMER_TYPE_AUX_STREAM;
            case BdTuring.TYPE_ECAF /* 9 */:
                return C1CXB.VAR_LINK_MIC_TIMER_TYPE_STATE_AGGREGATE;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return C1CXB.VAR_LINK_MIC_TIMER_TYPE_PREVIEW_COUNT_DOWN;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return C1CXB.VAR_LINK_MIC_TIMER_TYPE_WAIT_CROSS_DATA;
            default:
                throw new C1954807lC();
        }
    }

    public final int intoInt() {
        switch (C1CXO.LIZ[ordinal()]) {
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
            default:
                throw new C1954807lC();
        }
    }
}
