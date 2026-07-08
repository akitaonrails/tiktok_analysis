package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0bQ8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public enum EnumC972740bQ8 implements WireEnum {
    VAR_LINK_MIC_KICKOUT_REASON_UNKNOWN(0),
    VAR_LINK_MIC_KICKOUT_REASON_FIRST_FRAME_TIMEOUT(1),
    VAR_LINK_MIC_KICKOUT_REASON_BY_HOST(2),
    VAR_LINK_MIC_KICKOUT_REASON_RTC_LOST_CONNECTION(3),
    VAR_LINK_MIC_KICKOUT_REASON_INVITE_TIMEOUT(4),
    VAR_LINK_MIC_KICKOUT_REASON_BY_MODERATOR(5),
    VAR_LINK_MIC_KICKOUT_REASON_ANCHOR_RTC_LOST_CONNECTION(6),
    VAR_LINK_MIC_KICKOUT_REASON_KICK_OUT_ALL_GUESTS(7),
    VAR_LINK_MIC_KICKOUT_REASON_BY_PUNISH(8);

    public static final ProtoAdapter<EnumC972740bQ8> ADAPTER = new EnumAdapter<EnumC972740bQ8>() { // from class: X.0bQ9
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC972740bQ8.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC972740bQ8 fromValue(int i) {
        switch (i) {
            case 0:
                return VAR_LINK_MIC_KICKOUT_REASON_UNKNOWN;
            case 1:
                return VAR_LINK_MIC_KICKOUT_REASON_FIRST_FRAME_TIMEOUT;
            case 2:
                return VAR_LINK_MIC_KICKOUT_REASON_BY_HOST;
            case 3:
                return VAR_LINK_MIC_KICKOUT_REASON_RTC_LOST_CONNECTION;
            case 4:
                return VAR_LINK_MIC_KICKOUT_REASON_INVITE_TIMEOUT;
            case 5:
                return VAR_LINK_MIC_KICKOUT_REASON_BY_MODERATOR;
            case 6:
                return VAR_LINK_MIC_KICKOUT_REASON_ANCHOR_RTC_LOST_CONNECTION;
            case 7:
                return VAR_LINK_MIC_KICKOUT_REASON_KICK_OUT_ALL_GUESTS;
            case 8:
                return VAR_LINK_MIC_KICKOUT_REASON_BY_PUNISH;
            default:
                return null;
        }
    }

    public static EnumC972740bQ8 valueOf(String str) {
        return (EnumC972740bQ8) C08FF.LIZ(EnumC972740bQ8.class, str);
    }

    EnumC972740bQ8(int i) {
        this.LL = i;
    }
}
