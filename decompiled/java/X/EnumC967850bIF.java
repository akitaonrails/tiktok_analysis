package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0bIF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public enum EnumC967850bIF {
    Idel,
    WaitingForInviteReply,
    WaitingForApplyReply,
    ReceiveApply,
    ReceiveInvitation,
    Linked,
    JoiningChannel,
    JoinedChannel,
    Finish,
    WaitJoinChannel;

    public static final C968260bIu Companion = new Object() { // from class: X.0bIu
    };

    public static EnumC967850bIF valueOf(String str) {
        return (EnumC967850bIF) C08FF.LIZ(EnumC967850bIF.class, str);
    }

    public final EnumC972730bQ7 into() {
        switch (C967840bIE.LIZ[ordinal()]) {
            case 1:
                return EnumC972730bQ7.VAR_LINK_MIC_LINK_STATE_IDEL;
            case 2:
                return EnumC972730bQ7.VAR_LINK_MIC_LINK_STATE_WAITING_FOR_INVITE_REPLY;
            case 3:
                return EnumC972730bQ7.VAR_LINK_MIC_LINK_STATE_WAITING_FOR_APPLY_REPLY;
            case 4:
                return EnumC972730bQ7.VAR_LINK_MIC_LINK_STATE_RECEIVE_APPLY;
            case 5:
                return EnumC972730bQ7.VAR_LINK_MIC_LINK_STATE_RECEIVE_INVITATION;
            case 6:
                return EnumC972730bQ7.VAR_LINK_MIC_LINK_STATE_LINKED;
            case 7:
                return EnumC972730bQ7.VAR_LINK_MIC_LINK_STATE_JOINING_CHANNEL;
            case 8:
                return EnumC972730bQ7.VAR_LINK_MIC_LINK_STATE_JOINED_CHANNEL;
            case BdTuring.TYPE_ECAF /* 9 */:
                return EnumC972730bQ7.VAR_LINK_MIC_LINK_STATE_FINISH;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return EnumC972730bQ7.VAR_LINK_MIC_LINK_STATE_WAIT_JOIN_CHANNEL;
            default:
                throw new C1954807lC();
        }
    }

    public final int intoInt() {
        switch (C967840bIE.LIZ[ordinal()]) {
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
            default:
                throw new C1954807lC();
        }
    }
}
