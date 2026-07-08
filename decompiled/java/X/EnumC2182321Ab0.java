package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1Ab0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public enum EnumC2182321Ab0 implements WireEnum {
    VAR_LINK_LAYOUT_END_SOURCE_UNKNOWN(0),
    VAR_LINK_LAYOUT_END_SOURCE_FINISH_CHANNEL_API(1),
    VAR_LINK_LAYOUT_END_SOURCE_FINISH_CHANNEL_MSG(2),
    VAR_LINK_LAYOUT_END_SOURCE_RESET(3),
    VAR_LINK_LAYOUT_END_SOURCE_DROP(4),
    VAR_LINK_LAYOUT_END_SOURCE_SEI_END(5),
    VAR_LINK_LAYOUT_END_SOURCE_LAYOUT_KEY_BLOCKED(6),
    VAR_LINK_LAYOUT_END_SOURCE_REMOVE_LAYOUT(7),
    VAR_LINK_LAYOUT_END_SOURCE_RTC_ERROR(8),
    VAR_LINK_LAYOUT_END_SOURCE_LEAVE_GROUP(9),
    VAR_LINK_LAYOUT_END_SOURCE_LEAVE_GROUP_MESSAGE(10),
    VAR_LINK_LAYOUT_END_SOURCE_RECHARGE_GROUP_NOT_LINKED(11),
    VAR_LINK_LAYOUT_END_SOURCE_FULL_SCREEN_END(12);

    public static final ProtoAdapter<EnumC2182321Ab0> ADAPTER = new EnumAdapter<EnumC2182321Ab0>() { // from class: X.1Ab1
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2182321Ab0.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2182321Ab0 fromValue(int i) {
        switch (i) {
            case 0:
                return VAR_LINK_LAYOUT_END_SOURCE_UNKNOWN;
            case 1:
                return VAR_LINK_LAYOUT_END_SOURCE_FINISH_CHANNEL_API;
            case 2:
                return VAR_LINK_LAYOUT_END_SOURCE_FINISH_CHANNEL_MSG;
            case 3:
                return VAR_LINK_LAYOUT_END_SOURCE_RESET;
            case 4:
                return VAR_LINK_LAYOUT_END_SOURCE_DROP;
            case 5:
                return VAR_LINK_LAYOUT_END_SOURCE_SEI_END;
            case 6:
                return VAR_LINK_LAYOUT_END_SOURCE_LAYOUT_KEY_BLOCKED;
            case 7:
                return VAR_LINK_LAYOUT_END_SOURCE_REMOVE_LAYOUT;
            case 8:
                return VAR_LINK_LAYOUT_END_SOURCE_RTC_ERROR;
            case BdTuring.TYPE_ECAF /* 9 */:
                return VAR_LINK_LAYOUT_END_SOURCE_LEAVE_GROUP;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return VAR_LINK_LAYOUT_END_SOURCE_LEAVE_GROUP_MESSAGE;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return VAR_LINK_LAYOUT_END_SOURCE_RECHARGE_GROUP_NOT_LINKED;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return VAR_LINK_LAYOUT_END_SOURCE_FULL_SCREEN_END;
            default:
                return null;
        }
    }

    public static EnumC2182321Ab0 valueOf(String str) {
        return (EnumC2182321Ab0) C08FF.LIZ(EnumC2182321Ab0.class, str);
    }

    EnumC2182321Ab0(int i) {
        this.LL = i;
    }
}
