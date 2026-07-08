package X;

import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0jT2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1282060jT2 {
    Unknown,
    AnchorTrigger,
    MSeqStart,
    AnchorMicInterrupt,
    CloseLiveRoom,
    ResumeLiveFinish,
    BlockMessage,
    LiveStreamError,
    PunishCenterIm;

    public static final C1282150jTB Companion = new Object() { // from class: X.0jTB
    };

    public static EnumC1282060jT2 valueOf(String str) {
        return (EnumC1282060jT2) C08FF.LIZ(EnumC1282060jT2.class, str);
    }

    public final EnumC1282070jT3 into() {
        switch (C1282050jT1.LIZ[ordinal()]) {
            case 1:
                return EnumC1282070jT3.VAR_LINK_MIC_FINISH_CHANNEL_REASON_UNKNOWN;
            case 2:
                return EnumC1282070jT3.VAR_LINK_MIC_FINISH_CHANNEL_REASON_ANCHOR_TRIGGER;
            case 3:
                return EnumC1282070jT3.VAR_LINK_MIC_FINISH_CHANNEL_REASON_M_SEQ_START;
            case 4:
                return EnumC1282070jT3.VAR_LINK_MIC_FINISH_CHANNEL_REASON_ANCHOR_MIC_INTERRUPT;
            case 5:
                return EnumC1282070jT3.VAR_LINK_MIC_FINISH_CHANNEL_REASON_CLOSE_LIVE_ROOM;
            case 6:
                return EnumC1282070jT3.VAR_LINK_MIC_FINISH_CHANNEL_REASON_RESUME_LIVE_FINISH;
            case 7:
                return EnumC1282070jT3.VAR_LINK_MIC_FINISH_CHANNEL_REASON_BLOCK_MESSAGE;
            case 8:
                return EnumC1282070jT3.VAR_LINK_MIC_FINISH_CHANNEL_REASON_LIVE_STREAM_ERROR;
            case BdTuring.TYPE_ECAF /* 9 */:
                return EnumC1282070jT3.VAR_LINK_MIC_FINISH_CHANNEL_REASON_PUNISH_CENTER_IM;
            default:
                throw new C1954807lC();
        }
    }

    public final int intoInt() {
        switch (C1282050jT1.LIZ[ordinal()]) {
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
