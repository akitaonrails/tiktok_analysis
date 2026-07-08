package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1CX7, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CX7 implements WireEnum {
    VAR_LINK_MIC_ERROR_CODE_UNKNOWN(0),
    VAR_LINK_MIC_ERROR_CODE_UNKNOWN_NET_ERR(1),
    VAR_LINK_MIC_ERROR_CODE_WRONG_STATE(2),
    VAR_LINK_MIC_ERROR_CODE_NONE_APPLIER(3),
    VAR_LINK_MIC_ERROR_CODE_CANCEL_APPLY_WHEN_RTC_RUNNING(4),
    VAR_LINK_MIC_ERROR_CODE_WRONG_CHANNEL_ID(5),
    VAR_LINK_MIC_ERROR_CODE_WRONG_RESUME_LAYOUT_ID(6),
    VAR_LINK_MIC_ERROR_CODE_EMPTY_LINKED_LIST(7),
    VAR_LINK_MIC_ERROR_CODE_PERMISSION_ERR(8),
    VAR_LINK_MIC_ERROR_CODE_RECHARGING(9),
    VAR_LINK_MIC_ERROR_CODE_RECHARGE_BUT_NOT_IN_GROUP(10),
    VAR_LINK_MIC_ERROR_CODE_RECHARGE_BUT_NO_USER(11),
    VAR_LINK_MIC_ERROR_CODE_RECHARGE_BUT_FILTERED(12);

    public static final ProtoAdapter<C1CX7> ADAPTER = new EnumAdapter<C1CX7>() { // from class: X.1CYN
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C1CX7.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C1CX7 fromValue(int i) {
        switch (i) {
            case 0:
                return VAR_LINK_MIC_ERROR_CODE_UNKNOWN;
            case 1:
                return VAR_LINK_MIC_ERROR_CODE_UNKNOWN_NET_ERR;
            case 2:
                return VAR_LINK_MIC_ERROR_CODE_WRONG_STATE;
            case 3:
                return VAR_LINK_MIC_ERROR_CODE_NONE_APPLIER;
            case 4:
                return VAR_LINK_MIC_ERROR_CODE_CANCEL_APPLY_WHEN_RTC_RUNNING;
            case 5:
                return VAR_LINK_MIC_ERROR_CODE_WRONG_CHANNEL_ID;
            case 6:
                return VAR_LINK_MIC_ERROR_CODE_WRONG_RESUME_LAYOUT_ID;
            case 7:
                return VAR_LINK_MIC_ERROR_CODE_EMPTY_LINKED_LIST;
            case 8:
                return VAR_LINK_MIC_ERROR_CODE_PERMISSION_ERR;
            case BdTuring.TYPE_ECAF /* 9 */:
                return VAR_LINK_MIC_ERROR_CODE_RECHARGING;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return VAR_LINK_MIC_ERROR_CODE_RECHARGE_BUT_NOT_IN_GROUP;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return VAR_LINK_MIC_ERROR_CODE_RECHARGE_BUT_NO_USER;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return VAR_LINK_MIC_ERROR_CODE_RECHARGE_BUT_FILTERED;
            default:
                return null;
        }
    }

    public static C1CX7 valueOf(String str) {
        return (C1CX7) C08FF.LIZ(C1CX7.class, str);
    }

    C1CX7(int i) {
        this.LL = i;
    }
}
