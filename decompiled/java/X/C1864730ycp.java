package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.lazy.layout.DefaultLazyKey;
import androidx.databinding.ObservableByte;
import androidx.databinding.ObservableParcelable;
import androidx.databinding.ObservableShort;
import com.bytedance.android.live.design.view.sheet.SheetStackOptions;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.ChargeDeal;
import com.ss.android.ugc.aweme.detail.transition.FeedShareElementInfo;
import com.ss.android.ugc.aweme.live.model.LiveVerifyChecklist;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaAudio;
import com.ss.android.ugc.aweme.shortvideo.edit.ShopOrderShareStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.ShopOrderShareStructInfo;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VEAudioEncodeSettings;
import com.ss.android.vesdk.VEEditorModel;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEWatermarkParam;
import com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings;
import com.ss.android.vesdk.settings.VEVideoEncodePreset;
import com.ss.android.vesdk.settings.VEVideoEncodeProfile;
import com.ss.android.vesdk.settings.VEVideoHWEncodeSettings;
import com.ss.android.vesdk.settings.VEVideoSWEncodeSettings;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0ycp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864730ycp implements Parcelable.Creator {
    public final int $t;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.$t) {
            case 0:
                return createFromParcel$0(this, parcel);
            case 1:
                return createFromParcel$1(this, parcel);
            case 2:
                return createFromParcel$2(this, parcel);
            case 3:
                return createFromParcel$3(this, parcel);
            case 4:
                return createFromParcel$4(this, parcel);
            case 5:
                return createFromParcel$5(this, parcel);
            case 6:
                return createFromParcel$6(this, parcel);
            case 7:
                return createFromParcel$7(this, parcel);
            case 8:
                return createFromParcel$8(this, parcel);
            case BdTuring.TYPE_ECAF /* 9 */:
                return createFromParcel$9(this, parcel);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return createFromParcel$10(this, parcel);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return createFromParcel$11(this, parcel);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return createFromParcel$12(this, parcel);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return createFromParcel$13(this, parcel);
            case 14:
                return createFromParcel$14(this, parcel);
            case 15:
                return createFromParcel$15(this, parcel);
            case 16:
                return createFromParcel$16(this, parcel);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return createFromParcel$17(this, parcel);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return createFromParcel$18(this, parcel);
            case 19:
                return createFromParcel$19(this, parcel);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return createFromParcel$20(this, parcel);
            case 21:
                return createFromParcel$21(this, parcel);
            case 22:
                return createFromParcel$22(this, parcel);
            case 23:
                return createFromParcel$23(this, parcel);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return createFromParcel$24(this, parcel);
            case 25:
                return createFromParcel$25(this, parcel);
            case 26:
                return createFromParcel$26(this, parcel);
            case 27:
                return createFromParcel$27(this, parcel);
            case 28:
                return createFromParcel$28(this, parcel);
            case 29:
                return createFromParcel$29(this, parcel);
            case 30:
                return createFromParcel$30(this, parcel);
            case 31:
                return createFromParcel$31(this, parcel);
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.$t) {
            case 0:
                return newArray$0(this, i);
            case 1:
                return newArray$1(this, i);
            case 2:
                return newArray$2(this, i);
            case 3:
                return newArray$3(this, i);
            case 4:
                return newArray$4(this, i);
            case 5:
                return newArray$5(this, i);
            case 6:
                return newArray$6(this, i);
            case 7:
                return newArray$7(this, i);
            case 8:
                return newArray$8(this, i);
            case BdTuring.TYPE_ECAF /* 9 */:
                return newArray$9(this, i);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return newArray$10(this, i);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return newArray$11(this, i);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return newArray$12(this, i);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return newArray$13(this, i);
            case 14:
                return newArray$14(this, i);
            case 15:
                return newArray$15(this, i);
            case 16:
                return newArray$16(this, i);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return newArray$17(this, i);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return newArray$18(this, i);
            case 19:
                return newArray$19(this, i);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return newArray$20(this, i);
            case 21:
                return newArray$21(this, i);
            case 22:
                return newArray$22(this, i);
            case 23:
                return newArray$23(this, i);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return newArray$24(this, i);
            case 25:
                return newArray$25(this, i);
            case 26:
                return newArray$26(this, i);
            case 27:
                return newArray$27(this, i);
            case 28:
                return newArray$28(this, i);
            case 29:
                return newArray$29(this, i);
            case 30:
                return newArray$30(this, i);
            case 31:
                return newArray$31(this, i);
            default:
                return new Object[0];
        }
    }

    public C1864730ycp(int i) {
        this.$t = i;
    }

    public static final Object createFromParcel$0(C1864730ycp c1864730ycp, Parcel parcel) {
        return new DefaultLazyKey(parcel.readInt());
    }

    public static final Object createFromParcel$1(C1864730ycp c1864730ycp, Parcel parcel) {
        return new ObservableByte(parcel.readByte());
    }

    public static final Object createFromParcel$10(C1864730ycp c1864730ycp, Parcel parcel) {
        return new MediaAudio(parcel);
    }

    public static final Object createFromParcel$11(C1864730ycp c1864730ycp, Parcel parcel) {
        return new ShopOrderShareStruct(parcel);
    }

    public static final Object createFromParcel$12(C1864730ycp c1864730ycp, Parcel parcel) {
        return new ShopOrderShareStructInfo(parcel);
    }

    public static final Object createFromParcel$13(C1864730ycp c1864730ycp, Parcel parcel) {
        return ROTATE_DEGREE.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$14(C1864730ycp c1864730ycp, Parcel parcel) {
        return VEAudioEncodeSettings.ENCODE_STANDARD.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$15(C1864730ycp c1864730ycp, Parcel parcel) {
        return new VEAudioEncodeSettings(parcel);
    }

    public static final Object createFromParcel$16(C1864730ycp c1864730ycp, Parcel parcel) {
        return new VEEditorModel(parcel);
    }

    public static final Object createFromParcel$17(C1864730ycp c1864730ycp, Parcel parcel) {
        return new VESize(parcel);
    }

    public static final Object createFromParcel$18(C1864730ycp c1864730ycp, Parcel parcel) {
        return VEVideoEncodeSettings.COMPILE_TYPE.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$19(C1864730ycp c1864730ycp, Parcel parcel) {
        return VEVideoEncodeSettings.ENCODE_PROFILE.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$2(C1864730ycp c1864730ycp, Parcel parcel) {
        return new ObservableParcelable(parcel.readParcelable(C1864730ycp.class.getClassLoader()));
    }

    public static final Object createFromParcel$20(C1864730ycp c1864730ycp, Parcel parcel) {
        return VEVideoEncodeSettings.ENCODE_STANDARD.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$21(C1864730ycp c1864730ycp, Parcel parcel) {
        return VEVideoEncodeSettings.VEVideoEncodeFitMode.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$22(C1864730ycp c1864730ycp, Parcel parcel) {
        return VEVideoEncodeSettings.VEVideoEncodeMirrorMode.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$23(C1864730ycp c1864730ycp, Parcel parcel) {
        return new VEVideoEncodeSettings(parcel);
    }

    public static final Object createFromParcel$24(C1864730ycp c1864730ycp, Parcel parcel) {
        return new VEWatermarkParam.VEWatermarkEntity(parcel);
    }

    public static final Object createFromParcel$25(C1864730ycp c1864730ycp, Parcel parcel) {
        return new VEWatermarkParam.VEWatermarkMask(parcel);
    }

    public static final Object createFromParcel$26(C1864730ycp c1864730ycp, Parcel parcel) {
        return new VEWatermarkParam(parcel);
    }

    public static final Object createFromParcel$27(C1864730ycp c1864730ycp, Parcel parcel) {
        return new VEVideoCompileEncodeSettings(parcel);
    }

    public static final Object createFromParcel$28(C1864730ycp c1864730ycp, Parcel parcel) {
        return VEVideoEncodePreset.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$29(C1864730ycp c1864730ycp, Parcel parcel) {
        return VEVideoEncodeProfile.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$3(C1864730ycp c1864730ycp, Parcel parcel) {
        return new ObservableShort((short) parcel.readInt());
    }

    public static final Object createFromParcel$30(C1864730ycp c1864730ycp, Parcel parcel) {
        return new VEVideoHWEncodeSettings(parcel);
    }

    public static final Object createFromParcel$31(C1864730ycp c1864730ycp, Parcel parcel) {
        return new VEVideoSWEncodeSettings(parcel);
    }

    public static final Object createFromParcel$4(C1864730ycp c1864730ycp, Parcel parcel) {
        return new SheetStackOptions(parcel);
    }

    public static final Object createFromParcel$5(C1864730ycp c1864730ycp, Parcel parcel) {
        return new ChargeDeal.CurrencyPrice(parcel);
    }

    public static final Object createFromParcel$6(C1864730ycp c1864730ycp, Parcel parcel) {
        return new ChargeDeal.HsSkuDetail(parcel);
    }

    public static final Object createFromParcel$7(C1864730ycp c1864730ycp, Parcel parcel) {
        return new ChargeDeal(parcel);
    }

    public static final Object createFromParcel$8(C1864730ycp c1864730ycp, Parcel parcel) {
        return new FeedShareElementInfo(parcel);
    }

    public static final Object createFromParcel$9(C1864730ycp c1864730ycp, Parcel parcel) {
        return new LiveVerifyChecklist(parcel);
    }

    public static final Object[] newArray$0(C1864730ycp c1864730ycp, int i) {
        return new DefaultLazyKey[i];
    }

    public static final Object[] newArray$1(C1864730ycp c1864730ycp, int i) {
        return new ObservableByte[i];
    }

    public static final Object[] newArray$10(C1864730ycp c1864730ycp, int i) {
        return new MediaAudio[i];
    }

    public static final Object[] newArray$11(C1864730ycp c1864730ycp, int i) {
        return new ShopOrderShareStruct[i];
    }

    public static final Object[] newArray$12(C1864730ycp c1864730ycp, int i) {
        return new ShopOrderShareStructInfo[i];
    }

    public static final Object[] newArray$13(C1864730ycp c1864730ycp, int i) {
        return new ROTATE_DEGREE[i];
    }

    public static final Object[] newArray$14(C1864730ycp c1864730ycp, int i) {
        return new VEAudioEncodeSettings.ENCODE_STANDARD[i];
    }

    public static final Object[] newArray$15(C1864730ycp c1864730ycp, int i) {
        return new VEAudioEncodeSettings[i];
    }

    public static final Object[] newArray$16(C1864730ycp c1864730ycp, int i) {
        return new VEEditorModel[i];
    }

    public static final Object[] newArray$17(C1864730ycp c1864730ycp, int i) {
        return new VESize[i];
    }

    public static final Object[] newArray$18(C1864730ycp c1864730ycp, int i) {
        return new VEVideoEncodeSettings.COMPILE_TYPE[i];
    }

    public static final Object[] newArray$19(C1864730ycp c1864730ycp, int i) {
        return new VEVideoEncodeSettings.ENCODE_PROFILE[i];
    }

    public static final Object[] newArray$2(C1864730ycp c1864730ycp, int i) {
        return new ObservableParcelable[i];
    }

    public static final Object[] newArray$20(C1864730ycp c1864730ycp, int i) {
        return new VEVideoEncodeSettings.ENCODE_STANDARD[i];
    }

    public static final Object[] newArray$21(C1864730ycp c1864730ycp, int i) {
        return new VEVideoEncodeSettings.VEVideoEncodeFitMode[i];
    }

    public static final Object[] newArray$22(C1864730ycp c1864730ycp, int i) {
        return new VEVideoEncodeSettings.VEVideoEncodeMirrorMode[i];
    }

    public static final Object[] newArray$23(C1864730ycp c1864730ycp, int i) {
        return new VEVideoEncodeSettings[i];
    }

    public static final Object[] newArray$24(C1864730ycp c1864730ycp, int i) {
        return new VEWatermarkParam.VEWatermarkEntity[i];
    }

    public static final Object[] newArray$25(C1864730ycp c1864730ycp, int i) {
        return new VEWatermarkParam.VEWatermarkMask[i];
    }

    public static final Object[] newArray$26(C1864730ycp c1864730ycp, int i) {
        return new VEWatermarkParam[i];
    }

    public static final Object[] newArray$27(C1864730ycp c1864730ycp, int i) {
        return new VEVideoCompileEncodeSettings[i];
    }

    public static final Object[] newArray$28(C1864730ycp c1864730ycp, int i) {
        return new VEVideoEncodePreset[i];
    }

    public static final Object[] newArray$29(C1864730ycp c1864730ycp, int i) {
        return new VEVideoEncodeProfile[i];
    }

    public static final Object[] newArray$3(C1864730ycp c1864730ycp, int i) {
        return new ObservableShort[i];
    }

    public static final Object[] newArray$30(C1864730ycp c1864730ycp, int i) {
        return new VEVideoHWEncodeSettings[i];
    }

    public static final Object[] newArray$31(C1864730ycp c1864730ycp, int i) {
        return new VEVideoSWEncodeSettings[i];
    }

    public static final Object[] newArray$4(C1864730ycp c1864730ycp, int i) {
        return new SheetStackOptions[i];
    }

    public static final Object[] newArray$5(C1864730ycp c1864730ycp, int i) {
        return new ChargeDeal.CurrencyPrice[i];
    }

    public static final Object[] newArray$6(C1864730ycp c1864730ycp, int i) {
        return new ChargeDeal.HsSkuDetail[i];
    }

    public static final Object[] newArray$7(C1864730ycp c1864730ycp, int i) {
        return new ChargeDeal[i];
    }

    public static final Object[] newArray$8(C1864730ycp c1864730ycp, int i) {
        return new FeedShareElementInfo[i];
    }

    public static final Object[] newArray$9(C1864730ycp c1864730ycp, int i) {
        return new LiveVerifyChecklist[i];
    }
}
