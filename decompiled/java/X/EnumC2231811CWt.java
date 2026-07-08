package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1CWt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2231811CWt implements WireEnum {
    VAR_LINK_MIC_LAYOUT_ERROR_CODE_NO_ERROR(0),
    VAR_LINK_MIC_LAYOUT_ERROR_CODE_IM_API_LAYOUT_STATE_INVALID(1),
    VAR_LINK_MIC_LAYOUT_ERROR_CODE_IM_API_SPOT_LIST_IS_EMPTY(2),
    VAR_LINK_MIC_LAYOUT_ERROR_CODE_IM_API_LAYOUT_KEY_IS_EMPTY(3),
    VAR_LINK_MIC_LAYOUT_ERROR_CODE_SAME_LAYOUT_INFO(4),
    VAR_LINK_MIC_LAYOUT_ERROR_CODE_NOT_START_FULL_SCREEN(5),
    VAR_LINK_MIC_LAYOUT_ERROR_CODE_QUERY_LAYOUT_MODEL_ERROR_DESERIALIZE_FAILED(6),
    VAR_LINK_MIC_LAYOUT_ERROR_CODE_QUERY_LAYOUT_MODEL_ERROR_OUT_OF_LIFE_CYCLE(7),
    VAR_LINK_MIC_LAYOUT_ERROR_CODE_QUERY_LAYOUT_MODEL_ERROR_FILE_NOT_FOUND(8),
    VAR_LINK_MIC_LAYOUT_ERROR_CODE_QUERY_LAYOUT_MODEL_ERROR_IO_FAILED(9),
    VAR_LINK_MIC_LAYOUT_ERROR_CODE_LINK_LAYOUT_LAYOUT_KEY_BLOCK(10),
    VAR_LINK_MIC_LAYOUT_ERROR_CODE_LINK_LAYOUT_KEY_NOT_MATCH(11),
    VAR_LINK_MIC_LAYOUT_ERROR_CODE_LINK_LAYOUT_PIPELINE_CREATE_FAILED(12),
    VAR_LINK_MIC_LAYOUT_ERROR_CODE_LINK_LAYOUT_BIZ_CONTAINER_PARAMS_INVALID(13),
    VAR_LINK_MIC_LAYOUT_ERROR_CODE_LINK_LAYOUT_EMPTY_LAYOUT_CONTAINER_CONFIGS(14),
    VAR_LINK_MIC_LAYOUT_ERROR_CODE_SEI_LAYOUT_KEY_IS_EMPTY(15),
    VAR_LINK_MIC_LAYOUT_ERROR_CODE_LAYOUT_MODEL_PARAMS_IS_INVALID(16),
    VAR_LINK_MIC_LAYOUT_ERROR_CODE_LAYOUT_MODEL_IS_NONE(17),
    VAR_LINK_MIC_LAYOUT_ERROR_CODE_LAYOUT_MODEL_PARSE_FAILED(18),
    VAR_LINK_MIC_LAYOUT_ERROR_CODE_EXTRA_GECKO_RES_UPDATED_FAILURE(19),
    VAR_LINK_MIC_LAYOUT_ERROR_CODE_ONLY_UPDATE_LAYOUT_DATA(20),
    VAR_LINK_MIC_LAYOUT_ERROR_CODE_LINK_IS_CLOSE(21),
    VAR_LINK_MIC_LAYOUT_ERROR_CODE_LINK_IS_NOT_CONNECTED(22);

    public static final ProtoAdapter<EnumC2231811CWt> ADAPTER = new EnumAdapter<EnumC2231811CWt>() { // from class: X.1CYP
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2231811CWt.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2231811CWt fromValue(int i) {
        switch (i) {
            case 0:
                return VAR_LINK_MIC_LAYOUT_ERROR_CODE_NO_ERROR;
            case 1:
                return VAR_LINK_MIC_LAYOUT_ERROR_CODE_IM_API_LAYOUT_STATE_INVALID;
            case 2:
                return VAR_LINK_MIC_LAYOUT_ERROR_CODE_IM_API_SPOT_LIST_IS_EMPTY;
            case 3:
                return VAR_LINK_MIC_LAYOUT_ERROR_CODE_IM_API_LAYOUT_KEY_IS_EMPTY;
            case 4:
                return VAR_LINK_MIC_LAYOUT_ERROR_CODE_SAME_LAYOUT_INFO;
            case 5:
                return VAR_LINK_MIC_LAYOUT_ERROR_CODE_NOT_START_FULL_SCREEN;
            case 6:
                return VAR_LINK_MIC_LAYOUT_ERROR_CODE_QUERY_LAYOUT_MODEL_ERROR_DESERIALIZE_FAILED;
            case 7:
                return VAR_LINK_MIC_LAYOUT_ERROR_CODE_QUERY_LAYOUT_MODEL_ERROR_OUT_OF_LIFE_CYCLE;
            case 8:
                return VAR_LINK_MIC_LAYOUT_ERROR_CODE_QUERY_LAYOUT_MODEL_ERROR_FILE_NOT_FOUND;
            case BdTuring.TYPE_ECAF /* 9 */:
                return VAR_LINK_MIC_LAYOUT_ERROR_CODE_QUERY_LAYOUT_MODEL_ERROR_IO_FAILED;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return VAR_LINK_MIC_LAYOUT_ERROR_CODE_LINK_LAYOUT_LAYOUT_KEY_BLOCK;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return VAR_LINK_MIC_LAYOUT_ERROR_CODE_LINK_LAYOUT_KEY_NOT_MATCH;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return VAR_LINK_MIC_LAYOUT_ERROR_CODE_LINK_LAYOUT_PIPELINE_CREATE_FAILED;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return VAR_LINK_MIC_LAYOUT_ERROR_CODE_LINK_LAYOUT_BIZ_CONTAINER_PARAMS_INVALID;
            case 14:
                return VAR_LINK_MIC_LAYOUT_ERROR_CODE_LINK_LAYOUT_EMPTY_LAYOUT_CONTAINER_CONFIGS;
            case 15:
                return VAR_LINK_MIC_LAYOUT_ERROR_CODE_SEI_LAYOUT_KEY_IS_EMPTY;
            case 16:
                return VAR_LINK_MIC_LAYOUT_ERROR_CODE_LAYOUT_MODEL_PARAMS_IS_INVALID;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return VAR_LINK_MIC_LAYOUT_ERROR_CODE_LAYOUT_MODEL_IS_NONE;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return VAR_LINK_MIC_LAYOUT_ERROR_CODE_LAYOUT_MODEL_PARSE_FAILED;
            case 19:
                return VAR_LINK_MIC_LAYOUT_ERROR_CODE_EXTRA_GECKO_RES_UPDATED_FAILURE;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return VAR_LINK_MIC_LAYOUT_ERROR_CODE_ONLY_UPDATE_LAYOUT_DATA;
            case 21:
                return VAR_LINK_MIC_LAYOUT_ERROR_CODE_LINK_IS_CLOSE;
            case 22:
                return VAR_LINK_MIC_LAYOUT_ERROR_CODE_LINK_IS_NOT_CONNECTED;
            default:
                return null;
        }
    }

    public static EnumC2231811CWt valueOf(String str) {
        return (EnumC2231811CWt) C08FF.LIZ(EnumC2231811CWt.class, str);
    }

    EnumC2231811CWt(int i) {
        this.LL = i;
    }
}
