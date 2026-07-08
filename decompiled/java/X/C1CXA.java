package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1CXA, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CXA implements WireEnum {
    VAR_SDK_LINK_RTC_EVENT_START_JOIN_RTC(0),
    VAR_SDK_LINK_RTC_EVENT_ON_JOIN_RTC_SUCCESS(1),
    VAR_SDK_LINK_RTC_EVENT_START_PUSH_STREAM(2),
    VAR_SDK_LINK_RTC_EVENT_START_MIX_STREAM(3),
    VAR_SDK_LINK_RTC_EVENT_START_INTERACT_STREAM(4),
    VAR_SDK_LINK_RTC_EVENT_START_FORWARD_STREAM(5),
    VAR_SDK_LINK_RTC_EVENT_STOP_FORWARD_STREAM(6),
    VAR_SDK_LINK_RTC_EVENT_LEAVE_RTC(7),
    VAR_SDK_LINK_RTC_EVENT_ON_RTC_ERROR(8),
    VAR_SDK_LINK_RTC_EVENT_ON_RTC_LOST(9),
    VAR_SDK_LINK_RTC_EVENT_FORWARD_STREAM_ERROR(10),
    VAR_SDK_LINK_RTC_EVENT_FORWARD_STREAM_SUCCESS(11);

    public static final ProtoAdapter<C1CXA> ADAPTER = new EnumAdapter<C1CXA>() { // from class: X.1CYL
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C1CXA.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C1CXA fromValue(int i) {
        switch (i) {
            case 0:
                return VAR_SDK_LINK_RTC_EVENT_START_JOIN_RTC;
            case 1:
                return VAR_SDK_LINK_RTC_EVENT_ON_JOIN_RTC_SUCCESS;
            case 2:
                return VAR_SDK_LINK_RTC_EVENT_START_PUSH_STREAM;
            case 3:
                return VAR_SDK_LINK_RTC_EVENT_START_MIX_STREAM;
            case 4:
                return VAR_SDK_LINK_RTC_EVENT_START_INTERACT_STREAM;
            case 5:
                return VAR_SDK_LINK_RTC_EVENT_START_FORWARD_STREAM;
            case 6:
                return VAR_SDK_LINK_RTC_EVENT_STOP_FORWARD_STREAM;
            case 7:
                return VAR_SDK_LINK_RTC_EVENT_LEAVE_RTC;
            case 8:
                return VAR_SDK_LINK_RTC_EVENT_ON_RTC_ERROR;
            case BdTuring.TYPE_ECAF /* 9 */:
                return VAR_SDK_LINK_RTC_EVENT_ON_RTC_LOST;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return VAR_SDK_LINK_RTC_EVENT_FORWARD_STREAM_ERROR;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return VAR_SDK_LINK_RTC_EVENT_FORWARD_STREAM_SUCCESS;
            default:
                return null;
        }
    }

    public static C1CXA valueOf(String str) {
        return (C1CXA) C08FF.LIZ(C1CXA.class, str);
    }

    C1CXA(int i) {
        this.LL = i;
    }
}
