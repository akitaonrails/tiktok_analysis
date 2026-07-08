package X;

import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0bJc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public enum EnumC968700bJc {
    Unknown,
    FirstFrameTimeout,
    ByHost,
    RtcLostConnection,
    InviteTimeout,
    ByModerator,
    AnchorRtcLostConnection,
    KickOutAllGuests,
    ByPunish;

    public static final C968760bJi Companion = new Object() { // from class: X.0bJi
    };

    public static EnumC968700bJc valueOf(String str) {
        return (EnumC968700bJc) C08FF.LIZ(EnumC968700bJc.class, str);
    }

    public final EnumC972740bQ8 into() {
        switch (C968690bJb.LIZ[ordinal()]) {
            case 1:
                return EnumC972740bQ8.VAR_LINK_MIC_KICKOUT_REASON_UNKNOWN;
            case 2:
                return EnumC972740bQ8.VAR_LINK_MIC_KICKOUT_REASON_FIRST_FRAME_TIMEOUT;
            case 3:
                return EnumC972740bQ8.VAR_LINK_MIC_KICKOUT_REASON_BY_HOST;
            case 4:
                return EnumC972740bQ8.VAR_LINK_MIC_KICKOUT_REASON_RTC_LOST_CONNECTION;
            case 5:
                return EnumC972740bQ8.VAR_LINK_MIC_KICKOUT_REASON_INVITE_TIMEOUT;
            case 6:
                return EnumC972740bQ8.VAR_LINK_MIC_KICKOUT_REASON_BY_MODERATOR;
            case 7:
                return EnumC972740bQ8.VAR_LINK_MIC_KICKOUT_REASON_ANCHOR_RTC_LOST_CONNECTION;
            case 8:
                return EnumC972740bQ8.VAR_LINK_MIC_KICKOUT_REASON_KICK_OUT_ALL_GUESTS;
            case BdTuring.TYPE_ECAF /* 9 */:
                return EnumC972740bQ8.VAR_LINK_MIC_KICKOUT_REASON_BY_PUNISH;
            default:
                throw new C1954807lC();
        }
    }

    public final int intoInt() {
        switch (C968690bJb.LIZ[ordinal()]) {
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
