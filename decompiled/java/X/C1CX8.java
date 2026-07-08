package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1CX8, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CX8 implements WireEnum {
    VAR_LINK_MIC_RECHARGE_SOURCE_POSITIVE(0),
    VAR_LINK_MIC_RECHARGE_SOURCE_MESSAGE_FILTER(1),
    VAR_LINK_MIC_RECHARGE_SOURCE_PUSH_MORE(2),
    VAR_LINK_MIC_RECHARGE_SOURCE_PUSH_LESS(3),
    VAR_LINK_MIC_RECHARGE_SOURCE_FORWARD_FAILED(4),
    VAR_LINK_MIC_RECHARGE_SOURCE_JOIN_GROUP_TIMER(5),
    VAR_LINK_MIC_RECHARGE_SOURCE_CANCEL_LINKED(6),
    VAR_LINK_MIC_RECHARGE_SOURCE_RECHARGE_WHEN_CONNECTION(7),
    VAR_LINK_MIC_RECHARGE_SOURCE_RECHARGE_NETWORK_RESUME(8),
    VAR_LINK_MIC_RECHARGE_SOURCE_PERMIT_LEAVE_FILTER(9),
    VAR_LINK_MIC_RECHARGE_SOURCE_ARCH_DATA_ERROR_INNER(10),
    VAR_LINK_MIC_RECHARGE_SOURCE_ARCH_DATA_ERROR_CROSS(11),
    VAR_LINK_MIC_RECHARGE_SOURCE_WAIT_CROSS_DATA_TIMEOUT(12);

    public static final ProtoAdapter<C1CX8> ADAPTER = new EnumAdapter<C1CX8>() { // from class: X.1CYd
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C1CX8.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C1CX8 fromValue(int i) {
        switch (i) {
            case 0:
                return VAR_LINK_MIC_RECHARGE_SOURCE_POSITIVE;
            case 1:
                return VAR_LINK_MIC_RECHARGE_SOURCE_MESSAGE_FILTER;
            case 2:
                return VAR_LINK_MIC_RECHARGE_SOURCE_PUSH_MORE;
            case 3:
                return VAR_LINK_MIC_RECHARGE_SOURCE_PUSH_LESS;
            case 4:
                return VAR_LINK_MIC_RECHARGE_SOURCE_FORWARD_FAILED;
            case 5:
                return VAR_LINK_MIC_RECHARGE_SOURCE_JOIN_GROUP_TIMER;
            case 6:
                return VAR_LINK_MIC_RECHARGE_SOURCE_CANCEL_LINKED;
            case 7:
                return VAR_LINK_MIC_RECHARGE_SOURCE_RECHARGE_WHEN_CONNECTION;
            case 8:
                return VAR_LINK_MIC_RECHARGE_SOURCE_RECHARGE_NETWORK_RESUME;
            case BdTuring.TYPE_ECAF /* 9 */:
                return VAR_LINK_MIC_RECHARGE_SOURCE_PERMIT_LEAVE_FILTER;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return VAR_LINK_MIC_RECHARGE_SOURCE_ARCH_DATA_ERROR_INNER;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return VAR_LINK_MIC_RECHARGE_SOURCE_ARCH_DATA_ERROR_CROSS;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return VAR_LINK_MIC_RECHARGE_SOURCE_WAIT_CROSS_DATA_TIMEOUT;
            default:
                return null;
        }
    }

    public static C1CX8 valueOf(String str) {
        return (C1CX8) C08FF.LIZ(C1CX8.class, str);
    }

    C1CX8(int i) {
        this.LL = i;
    }
}
