package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1CWr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2231791CWr {
    NoError,
    ImApiLayoutStateInvalid,
    ImApiSpotListIsEmpty,
    ImApiLayoutKeyIsEmpty,
    SameLayoutInfo,
    NotStartFullScreen,
    QueryLayoutModelErrorDeserializeFailed,
    QueryLayoutModelErrorOutOfLifeCycle,
    QueryLayoutModelErrorFileNotFound,
    QueryLayoutModelErrorIoFailed,
    LinkLayoutLayoutKeyBlock,
    LinkLayoutKeyNotMatch,
    LinkLayoutPipelineCreateFailed,
    LinkLayoutBizContainerParamsInvalid,
    LinkLayoutEmptyLayoutContainerConfigs,
    SeiLayoutKeyIsEmpty,
    LayoutModelParamsIsInvalid,
    LayoutModelIsNone,
    LayoutModelParseFailed,
    ExtraGeckoResUpdatedFailure,
    OnlyUpdateLayoutData,
    LinkIsClose,
    LinkIsNotConnected;

    public static final C2232331CYt Companion = new Object() { // from class: X.1CYt
    };

    public static EnumC2231791CWr valueOf(String str) {
        return (EnumC2231791CWr) C08FF.LIZ(EnumC2231791CWr.class, str);
    }

    public final EnumC2231811CWt into() {
        switch (C1CX1.LIZ[ordinal()]) {
            case 1:
                return EnumC2231811CWt.VAR_LINK_MIC_LAYOUT_ERROR_CODE_NO_ERROR;
            case 2:
                return EnumC2231811CWt.VAR_LINK_MIC_LAYOUT_ERROR_CODE_IM_API_LAYOUT_STATE_INVALID;
            case 3:
                return EnumC2231811CWt.VAR_LINK_MIC_LAYOUT_ERROR_CODE_IM_API_SPOT_LIST_IS_EMPTY;
            case 4:
                return EnumC2231811CWt.VAR_LINK_MIC_LAYOUT_ERROR_CODE_IM_API_LAYOUT_KEY_IS_EMPTY;
            case 5:
                return EnumC2231811CWt.VAR_LINK_MIC_LAYOUT_ERROR_CODE_SAME_LAYOUT_INFO;
            case 6:
                return EnumC2231811CWt.VAR_LINK_MIC_LAYOUT_ERROR_CODE_NOT_START_FULL_SCREEN;
            case 7:
                return EnumC2231811CWt.VAR_LINK_MIC_LAYOUT_ERROR_CODE_QUERY_LAYOUT_MODEL_ERROR_DESERIALIZE_FAILED;
            case 8:
                return EnumC2231811CWt.VAR_LINK_MIC_LAYOUT_ERROR_CODE_QUERY_LAYOUT_MODEL_ERROR_OUT_OF_LIFE_CYCLE;
            case BdTuring.TYPE_ECAF /* 9 */:
                return EnumC2231811CWt.VAR_LINK_MIC_LAYOUT_ERROR_CODE_QUERY_LAYOUT_MODEL_ERROR_FILE_NOT_FOUND;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return EnumC2231811CWt.VAR_LINK_MIC_LAYOUT_ERROR_CODE_QUERY_LAYOUT_MODEL_ERROR_IO_FAILED;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return EnumC2231811CWt.VAR_LINK_MIC_LAYOUT_ERROR_CODE_LINK_LAYOUT_LAYOUT_KEY_BLOCK;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return EnumC2231811CWt.VAR_LINK_MIC_LAYOUT_ERROR_CODE_LINK_LAYOUT_KEY_NOT_MATCH;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return EnumC2231811CWt.VAR_LINK_MIC_LAYOUT_ERROR_CODE_LINK_LAYOUT_PIPELINE_CREATE_FAILED;
            case 14:
                return EnumC2231811CWt.VAR_LINK_MIC_LAYOUT_ERROR_CODE_LINK_LAYOUT_BIZ_CONTAINER_PARAMS_INVALID;
            case 15:
                return EnumC2231811CWt.VAR_LINK_MIC_LAYOUT_ERROR_CODE_LINK_LAYOUT_EMPTY_LAYOUT_CONTAINER_CONFIGS;
            case 16:
                return EnumC2231811CWt.VAR_LINK_MIC_LAYOUT_ERROR_CODE_SEI_LAYOUT_KEY_IS_EMPTY;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return EnumC2231811CWt.VAR_LINK_MIC_LAYOUT_ERROR_CODE_LAYOUT_MODEL_PARAMS_IS_INVALID;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return EnumC2231811CWt.VAR_LINK_MIC_LAYOUT_ERROR_CODE_LAYOUT_MODEL_IS_NONE;
            case 19:
                return EnumC2231811CWt.VAR_LINK_MIC_LAYOUT_ERROR_CODE_LAYOUT_MODEL_PARSE_FAILED;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return EnumC2231811CWt.VAR_LINK_MIC_LAYOUT_ERROR_CODE_EXTRA_GECKO_RES_UPDATED_FAILURE;
            case 21:
                return EnumC2231811CWt.VAR_LINK_MIC_LAYOUT_ERROR_CODE_ONLY_UPDATE_LAYOUT_DATA;
            case 22:
                return EnumC2231811CWt.VAR_LINK_MIC_LAYOUT_ERROR_CODE_LINK_IS_CLOSE;
            case 23:
                return EnumC2231811CWt.VAR_LINK_MIC_LAYOUT_ERROR_CODE_LINK_IS_NOT_CONNECTED;
            default:
                throw new C1954807lC();
        }
    }

    public final int intoInt() {
        switch (C1CX1.LIZ[ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case BdTuring.TYPE_ECAF /* 9 */:
                return 8;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return 9;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return 10;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return 11;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 15;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return 16;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return 17;
            case 19:
                return 18;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return 19;
            case 21:
                return 20;
            case 22:
                return 21;
            case 23:
                return 22;
            default:
                throw new C1954807lC();
        }
    }
}
