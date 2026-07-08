package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0bQ7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public enum EnumC972730bQ7 implements WireEnum {
    VAR_LINK_MIC_LINK_STATE_IDEL(0),
    VAR_LINK_MIC_LINK_STATE_WAITING_FOR_INVITE_REPLY(1),
    VAR_LINK_MIC_LINK_STATE_WAITING_FOR_APPLY_REPLY(2),
    VAR_LINK_MIC_LINK_STATE_RECEIVE_APPLY(3),
    VAR_LINK_MIC_LINK_STATE_RECEIVE_INVITATION(4),
    VAR_LINK_MIC_LINK_STATE_LINKED(5),
    VAR_LINK_MIC_LINK_STATE_JOINING_CHANNEL(6),
    VAR_LINK_MIC_LINK_STATE_JOINED_CHANNEL(7),
    VAR_LINK_MIC_LINK_STATE_FINISH(8),
    VAR_LINK_MIC_LINK_STATE_WAIT_JOIN_CHANNEL(9);

    public static final ProtoAdapter<EnumC972730bQ7> ADAPTER = new EnumAdapter<EnumC972730bQ7>() { // from class: X.0bQA
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC972730bQ7.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC972730bQ7 fromValue(int i) {
        switch (i) {
            case 0:
                return VAR_LINK_MIC_LINK_STATE_IDEL;
            case 1:
                return VAR_LINK_MIC_LINK_STATE_WAITING_FOR_INVITE_REPLY;
            case 2:
                return VAR_LINK_MIC_LINK_STATE_WAITING_FOR_APPLY_REPLY;
            case 3:
                return VAR_LINK_MIC_LINK_STATE_RECEIVE_APPLY;
            case 4:
                return VAR_LINK_MIC_LINK_STATE_RECEIVE_INVITATION;
            case 5:
                return VAR_LINK_MIC_LINK_STATE_LINKED;
            case 6:
                return VAR_LINK_MIC_LINK_STATE_JOINING_CHANNEL;
            case 7:
                return VAR_LINK_MIC_LINK_STATE_JOINED_CHANNEL;
            case 8:
                return VAR_LINK_MIC_LINK_STATE_FINISH;
            case BdTuring.TYPE_ECAF /* 9 */:
                return VAR_LINK_MIC_LINK_STATE_WAIT_JOIN_CHANNEL;
            default:
                return null;
        }
    }

    public static EnumC972730bQ7 valueOf(String str) {
        return (EnumC972730bQ7) C08FF.LIZ(EnumC972730bQ7.class, str);
    }

    EnumC972730bQ7(int i) {
        this.LL = i;
    }
}
