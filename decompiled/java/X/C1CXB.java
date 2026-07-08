package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1CXB, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CXB implements WireEnum {
    VAR_LINK_MIC_TIMER_TYPE_APPLY(0),
    VAR_LINK_MIC_TIMER_TYPE_INVITE(1),
    VAR_LINK_MIC_TIMER_TYPE_FIRST_FRAME_INNER(2),
    VAR_LINK_MIC_TIMER_TYPE_FIRST_FRAME_CROSS(3),
    VAR_LINK_MIC_TIMER_TYPE_COMPENSATE_IM(4),
    VAR_LINK_MIC_TIMER_TYPE_AUDIENCE_START(5),
    VAR_LINK_MIC_TIMER_TYPE_FORWARD_STREAM(6),
    VAR_LINK_MIC_TIMER_TYPE_AUX_STREAM(7),
    VAR_LINK_MIC_TIMER_TYPE_STATE_AGGREGATE(8),
    VAR_LINK_MIC_TIMER_TYPE_PREVIEW_COUNT_DOWN(9),
    VAR_LINK_MIC_TIMER_TYPE_WAIT_CROSS_DATA(10);

    public static final ProtoAdapter<C1CXB> ADAPTER = new EnumAdapter<C1CXB>() { // from class: X.1CYM
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C1CXB.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C1CXB fromValue(int i) {
        switch (i) {
            case 0:
                return VAR_LINK_MIC_TIMER_TYPE_APPLY;
            case 1:
                return VAR_LINK_MIC_TIMER_TYPE_INVITE;
            case 2:
                return VAR_LINK_MIC_TIMER_TYPE_FIRST_FRAME_INNER;
            case 3:
                return VAR_LINK_MIC_TIMER_TYPE_FIRST_FRAME_CROSS;
            case 4:
                return VAR_LINK_MIC_TIMER_TYPE_COMPENSATE_IM;
            case 5:
                return VAR_LINK_MIC_TIMER_TYPE_AUDIENCE_START;
            case 6:
                return VAR_LINK_MIC_TIMER_TYPE_FORWARD_STREAM;
            case 7:
                return VAR_LINK_MIC_TIMER_TYPE_AUX_STREAM;
            case 8:
                return VAR_LINK_MIC_TIMER_TYPE_STATE_AGGREGATE;
            case BdTuring.TYPE_ECAF /* 9 */:
                return VAR_LINK_MIC_TIMER_TYPE_PREVIEW_COUNT_DOWN;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return VAR_LINK_MIC_TIMER_TYPE_WAIT_CROSS_DATA;
            default:
                return null;
        }
    }

    public static C1CXB valueOf(String str) {
        return (C1CXB) C08FF.LIZ(C1CXB.class, str);
    }

    C1CXB(int i) {
        this.LL = i;
    }
}
