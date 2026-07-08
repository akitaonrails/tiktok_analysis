package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0jT3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1282070jT3 implements WireEnum {
    VAR_LINK_MIC_FINISH_CHANNEL_REASON_UNKNOWN(0),
    VAR_LINK_MIC_FINISH_CHANNEL_REASON_ANCHOR_TRIGGER(1),
    VAR_LINK_MIC_FINISH_CHANNEL_REASON_M_SEQ_START(2),
    VAR_LINK_MIC_FINISH_CHANNEL_REASON_ANCHOR_MIC_INTERRUPT(3),
    VAR_LINK_MIC_FINISH_CHANNEL_REASON_CLOSE_LIVE_ROOM(4),
    VAR_LINK_MIC_FINISH_CHANNEL_REASON_RESUME_LIVE_FINISH(5),
    VAR_LINK_MIC_FINISH_CHANNEL_REASON_BLOCK_MESSAGE(6),
    VAR_LINK_MIC_FINISH_CHANNEL_REASON_LIVE_STREAM_ERROR(7),
    VAR_LINK_MIC_FINISH_CHANNEL_REASON_PUNISH_CENTER_IM(8);

    public static final ProtoAdapter<EnumC1282070jT3> ADAPTER = new EnumAdapter<EnumC1282070jT3>() { // from class: X.0jT8
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC1282070jT3.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC1282070jT3 fromValue(int i) {
        switch (i) {
            case 0:
                return VAR_LINK_MIC_FINISH_CHANNEL_REASON_UNKNOWN;
            case 1:
                return VAR_LINK_MIC_FINISH_CHANNEL_REASON_ANCHOR_TRIGGER;
            case 2:
                return VAR_LINK_MIC_FINISH_CHANNEL_REASON_M_SEQ_START;
            case 3:
                return VAR_LINK_MIC_FINISH_CHANNEL_REASON_ANCHOR_MIC_INTERRUPT;
            case 4:
                return VAR_LINK_MIC_FINISH_CHANNEL_REASON_CLOSE_LIVE_ROOM;
            case 5:
                return VAR_LINK_MIC_FINISH_CHANNEL_REASON_RESUME_LIVE_FINISH;
            case 6:
                return VAR_LINK_MIC_FINISH_CHANNEL_REASON_BLOCK_MESSAGE;
            case 7:
                return VAR_LINK_MIC_FINISH_CHANNEL_REASON_LIVE_STREAM_ERROR;
            case 8:
                return VAR_LINK_MIC_FINISH_CHANNEL_REASON_PUNISH_CENTER_IM;
            default:
                return null;
        }
    }

    public static EnumC1282070jT3 valueOf(String str) {
        return (EnumC1282070jT3) C08FF.LIZ(EnumC1282070jT3.class, str);
    }

    EnumC1282070jT3(int i) {
        this.LL = i;
    }
}
