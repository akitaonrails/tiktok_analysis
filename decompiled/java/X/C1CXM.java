package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CXM, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CXM implements WireEnum {
    VAR_LINK_MIC_STOP_RTC_REASON_UNKNOWN(0),
    VAR_LINK_MIC_STOP_RTC_REASON_AUTO_LEAVE(1),
    VAR_LINK_MIC_STOP_RTC_REASON_RTC_ERROR(2),
    VAR_LINK_MIC_STOP_RTC_REASON_RTC_LOST(3),
    VAR_LINK_MIC_STOP_RTC_REASON_KICKOUT_IM(4),
    VAR_LINK_MIC_STOP_RTC_REASON_KICKOUT_RTC_MSG(5),
    VAR_LINK_MIC_STOP_RTC_REASON_RELEASE_LIVE_CORE(6),
    VAR_LINK_MIC_STOP_RTC_REASON_STOP_JOIN_CHANNEL_ADVANCE(7);

    public static final ProtoAdapter<C1CXM> ADAPTER = new EnumAdapter<C1CXM>() { // from class: X.1CYG
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C1CXM.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C1CXM fromValue(int i) {
        switch (i) {
            case 0:
                return VAR_LINK_MIC_STOP_RTC_REASON_UNKNOWN;
            case 1:
                return VAR_LINK_MIC_STOP_RTC_REASON_AUTO_LEAVE;
            case 2:
                return VAR_LINK_MIC_STOP_RTC_REASON_RTC_ERROR;
            case 3:
                return VAR_LINK_MIC_STOP_RTC_REASON_RTC_LOST;
            case 4:
                return VAR_LINK_MIC_STOP_RTC_REASON_KICKOUT_IM;
            case 5:
                return VAR_LINK_MIC_STOP_RTC_REASON_KICKOUT_RTC_MSG;
            case 6:
                return VAR_LINK_MIC_STOP_RTC_REASON_RELEASE_LIVE_CORE;
            case 7:
                return VAR_LINK_MIC_STOP_RTC_REASON_STOP_JOIN_CHANNEL_ADVANCE;
            default:
                return null;
        }
    }

    public static C1CXM valueOf(String str) {
        return (C1CXM) C08FF.LIZ(C1CXM.class, str);
    }

    C1CXM(int i) {
        this.LL = i;
    }
}
