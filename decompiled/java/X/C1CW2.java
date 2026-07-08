package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CW2, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CW2 implements WireEnum {
    VAR_LINK_MIC_SDK_FINISH_REASON_UNKNOWN(0),
    VAR_LINK_MIC_SDK_FINISH_REASON_LEAVE_SELF(1),
    VAR_LINK_MIC_SDK_FINISH_REASON_LEAVE_MSG(2),
    VAR_LINK_MIC_SDK_FINISH_REASON_ROOM_CLOSE(3),
    VAR_LINK_MIC_SDK_FINISH_REASON_RTC_ERROR(4),
    VAR_LINK_MIC_SDK_FINISH_REASON_LEAVE_ONLY_ONE(5),
    VAR_LINK_MIC_SDK_FINISH_REASON_FIRST_FRAME_TIME_OUT(6),
    VAR_LINK_MIC_SDK_FINISH_REASON_LINKED_LIST_WITHOUT_ME(7),
    VAR_LINK_MIC_SDK_FINISH_REASON_RTC_LOST(8);

    public static final ProtoAdapter<C1CW2> ADAPTER = new EnumAdapter<C1CW2>() { // from class: X.1CW1
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C1CW2.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C1CW2 fromValue(int i) {
        switch (i) {
            case 0:
                return VAR_LINK_MIC_SDK_FINISH_REASON_UNKNOWN;
            case 1:
                return VAR_LINK_MIC_SDK_FINISH_REASON_LEAVE_SELF;
            case 2:
                return VAR_LINK_MIC_SDK_FINISH_REASON_LEAVE_MSG;
            case 3:
                return VAR_LINK_MIC_SDK_FINISH_REASON_ROOM_CLOSE;
            case 4:
                return VAR_LINK_MIC_SDK_FINISH_REASON_RTC_ERROR;
            case 5:
                return VAR_LINK_MIC_SDK_FINISH_REASON_LEAVE_ONLY_ONE;
            case 6:
                return VAR_LINK_MIC_SDK_FINISH_REASON_FIRST_FRAME_TIME_OUT;
            case 7:
                return VAR_LINK_MIC_SDK_FINISH_REASON_LINKED_LIST_WITHOUT_ME;
            case 8:
                return VAR_LINK_MIC_SDK_FINISH_REASON_RTC_LOST;
            default:
                return null;
        }
    }

    public static C1CW2 valueOf(String str) {
        return (C1CW2) C08FF.LIZ(C1CW2.class, str);
    }

    C1CW2(int i) {
        this.LL = i;
    }
}
