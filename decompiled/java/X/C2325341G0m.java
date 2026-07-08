package X;

import android.content.ComponentName;
import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.telecom.extensions.Capability;
import androidx.core.telecom.extensions.ParticipantParcelable;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.common.wschannel.model.WsApi;
import com.bytedance.common.wschannel.model.WsComponent;
import com.bytedance.effectcreatormobile.infrastructure.ui.widgets.highlight.Configuration;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.share.model.CameraEffectArguments;
import com.facebook.share.model.CameraEffectTextures;
import com.facebook.share.model.ShareCameraEffectContent;
import com.ss.android.ttve.model.VETrackParams;
import com.ss.android.ttvecamera.TEFocusParameters;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.vesdk.VEARCoreParam;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VECherEffectParam;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VEVolumeParam;
import com.ss.android.vesdk.filterparam.VEAmazingFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioDspFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioEffectFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioFadeFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioLoudnessBalanceFilter;
import com.ss.android.vesdk.filterparam.VEAudioMetricsFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioNoiseFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioSamiFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioSpeedFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioVolumeFilterParam;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.ss.android.vesdk.filterparam.VEBeautyFilterParam;
import com.ss.android.vesdk.filterparam.VEBlurFilterParam;
import com.ss.android.vesdk.filterparam.VECanvasFilterParam;
import com.ss.android.vesdk.filterparam.VEColorFilterParam;
import com.ss.android.vesdk.filterparam.VEColorHslFilterParam;
import com.ss.android.vesdk.filterparam.VEComposerFilterParam;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import com.ss.android.vesdk.filterparam.VEEffectHdrFilterParam;
import com.ss.android.vesdk.filterparam.VEExposureFilterParam;
import com.ss.android.vesdk.filterparam.VEImageAddFilterParam;
import com.ss.android.vesdk.filterparam.VEImageTransformFilterParam;
import com.ss.android.vesdk.filterparam.VEInfoStickerFilterParam;
import com.ss.android.vesdk.filterparam.VELensHdrFilterParam;
import com.ss.android.vesdk.filterparam.VEMIMOFilterParam;
import com.ss.android.vesdk.filterparam.VEMakeUpFilterParam;
import com.ss.android.vesdk.filterparam.VERepeatFilterParam;
import com.ss.android.vesdk.filterparam.VEReshapeFilterParam;
import com.ss.android.vesdk.filterparam.VERoundFilterParam;
import com.ss.android.vesdk.filterparam.VESlowMotionFilterParam;
import com.ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoAjustmentFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoCropFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoEffectOutSizeFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoEffectStreamFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoStableFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import com.ss.android.vesdk.model.VEPrePlayParams;
import com.ss.android.vesdk.runtime.VEMapBufferInfo;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1G0m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2325341G0m implements Parcelable.Creator {
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
            case 32:
                return createFromParcel$32(this, parcel);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return createFromParcel$33(this, parcel);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return createFromParcel$34(this, parcel);
            case 35:
                return createFromParcel$35(this, parcel);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return createFromParcel$36(this, parcel);
            case 37:
                return createFromParcel$37(this, parcel);
            case 38:
                return createFromParcel$38(this, parcel);
            case 39:
                return createFromParcel$39(this, parcel);
            case 40:
                return createFromParcel$40(this, parcel);
            case 41:
                return createFromParcel$41(this, parcel);
            case 42:
                return createFromParcel$42(this, parcel);
            case 43:
                return createFromParcel$43(this, parcel);
            case 44:
                return createFromParcel$44(this, parcel);
            case 45:
                return createFromParcel$45(this, parcel);
            case 46:
                return createFromParcel$46(this, parcel);
            case 47:
                return createFromParcel$47(this, parcel);
            case 48:
                return createFromParcel$48(this, parcel);
            case 49:
                return createFromParcel$49(this, parcel);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return createFromParcel$50(this, parcel);
            case 51:
                return createFromParcel$51(this, parcel);
            case 52:
                return createFromParcel$52(this, parcel);
            case 53:
                return createFromParcel$53(this, parcel);
            case 54:
                return createFromParcel$54(this, parcel);
            case 55:
                return createFromParcel$55(this, parcel);
            case 56:
                return createFromParcel$56(this, parcel);
            case 57:
                return createFromParcel$57(this, parcel);
            case 58:
                return createFromParcel$58(this, parcel);
            case 59:
                return createFromParcel$59(this, parcel);
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
            case 32:
                return newArray$32(this, i);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return newArray$33(this, i);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return newArray$34(this, i);
            case 35:
                return newArray$35(this, i);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return newArray$36(this, i);
            case 37:
                return newArray$37(this, i);
            case 38:
                return newArray$38(this, i);
            case 39:
                return newArray$39(this, i);
            case 40:
                return newArray$40(this, i);
            case 41:
                return newArray$41(this, i);
            case 42:
                return newArray$42(this, i);
            case 43:
                return newArray$43(this, i);
            case 44:
                return newArray$44(this, i);
            case 45:
                return newArray$45(this, i);
            case 46:
                return newArray$46(this, i);
            case 47:
                return newArray$47(this, i);
            case 48:
                return newArray$48(this, i);
            case 49:
                return newArray$49(this, i);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return newArray$50(this, i);
            case 51:
                return newArray$51(this, i);
            case 52:
                return newArray$52(this, i);
            case 53:
                return newArray$53(this, i);
            case 54:
                return newArray$54(this, i);
            case 55:
                return newArray$55(this, i);
            case 56:
                return newArray$56(this, i);
            case 57:
                return newArray$57(this, i);
            case 58:
                return newArray$58(this, i);
            case 59:
                return newArray$59(this, i);
            default:
                return new Object[0];
        }
    }

    public C2325341G0m(int i) {
        this.$t = i;
    }

    public static final Object createFromParcel$0(C2325341G0m c2325341G0m, Parcel parcel) {
        Capability capability = new Capability();
        int iDataPosition = parcel.dataPosition();
        int i = parcel.readInt();
        try {
            if (i >= 4) {
                if (parcel.dataPosition() - iDataPosition >= i) {
                    if (iDataPosition > Integer.MAX_VALUE - i) {
                        throw new BadParcelableException("Overflow in the size of parcelable");
                    }
                } else {
                    capability.featureId = parcel.readInt();
                    if (parcel.dataPosition() - iDataPosition >= i) {
                        if (iDataPosition > Integer.MAX_VALUE - i) {
                            throw new BadParcelableException("Overflow in the size of parcelable");
                        }
                    } else {
                        capability.featureVersion = parcel.readInt();
                        if (parcel.dataPosition() - iDataPosition >= i) {
                            if (iDataPosition > Integer.MAX_VALUE - i) {
                                throw new BadParcelableException("Overflow in the size of parcelable");
                            }
                        } else {
                            capability.supportedActions = parcel.createIntArray();
                            if (iDataPosition > Integer.MAX_VALUE - i) {
                                throw new BadParcelableException("Overflow in the size of parcelable");
                            }
                        }
                    }
                }
                parcel.setDataPosition(iDataPosition + i);
                return capability;
            }
            throw new BadParcelableException("Parcelable too small");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (iDataPosition > Integer.MAX_VALUE - i) {
                throw new BadParcelableException("Overflow in the size of parcelable");
            }
            parcel.setDataPosition(iDataPosition + i);
            throw th;
        }
    }

    public static final Object createFromParcel$1(C2325341G0m c2325341G0m, Parcel parcel) {
        Object objCreateFromParcel;
        ParticipantParcelable participantParcelable = new ParticipantParcelable();
        int iDataPosition = parcel.dataPosition();
        int i = parcel.readInt();
        try {
            if (i >= 4) {
                if (parcel.dataPosition() - iDataPosition >= i) {
                    if (iDataPosition > Integer.MAX_VALUE - i) {
                        throw new BadParcelableException("Overflow in the size of parcelable");
                    }
                } else {
                    participantParcelable.id = parcel.readString();
                    if (parcel.dataPosition() - iDataPosition >= i) {
                        if (iDataPosition > Integer.MAX_VALUE - i) {
                            throw new BadParcelableException("Overflow in the size of parcelable");
                        }
                    } else {
                        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
                        if (parcel.readInt() != 0) {
                            objCreateFromParcel = creator.createFromParcel(parcel);
                        } else {
                            objCreateFromParcel = null;
                        }
                        participantParcelable.name = (CharSequence) objCreateFromParcel;
                        if (iDataPosition > Integer.MAX_VALUE - i) {
                            throw new BadParcelableException("Overflow in the size of parcelable");
                        }
                    }
                }
                parcel.setDataPosition(iDataPosition + i);
                return participantParcelable;
            }
            throw new BadParcelableException("Parcelable too small");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (iDataPosition > Integer.MAX_VALUE - i) {
                throw new BadParcelableException("Overflow in the size of parcelable");
            }
            parcel.setDataPosition(iDataPosition + i);
            throw th;
        }
    }

    public static final Object createFromParcel$10(C2325341G0m c2325341G0m, Parcel parcel) {
        return new TEFocusParameters(parcel);
    }

    public static final Object createFromParcel$11(C2325341G0m c2325341G0m, Parcel parcel) {
        return new Workspace(parcel);
    }

    public static final Object createFromParcel$12(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEARCoreParam(parcel);
    }

    public static final Object createFromParcel$13(C2325341G0m c2325341G0m, Parcel parcel) {
        return VECameraSettings.CAMERA_CAPTURE_FLASH_STRATEGY.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$14(C2325341G0m c2325341G0m, Parcel parcel) {
        return VECameraSettings.CAMERA_HW_LEVEL.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$15(C2325341G0m c2325341G0m, Parcel parcel) {
        return VECameraSettings.CAMERA_TYPE.values()[parcel.readInt()];
    }

    public static final Object createFromParcel$16(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VECameraSettings(parcel);
    }

    public static final Object createFromParcel$17(C2325341G0m c2325341G0m, Parcel parcel) {
        int i = parcel.readInt();
        int i2 = parcel.readInt();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        double[] dArr = new double[i * 2];
        parcel.readDoubleArray(dArr);
        boolean[] zArr = new boolean[i2];
        parcel.readBooleanArray(zArr);
        return new VECherEffectParam(strArr, dArr, zArr);
    }

    public static final Object createFromParcel$18(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEDisplaySettings(parcel);
    }

    public static final Object createFromParcel$19(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEVolumeParam(parcel);
    }

    public static final Object createFromParcel$2(C2325341G0m c2325341G0m, Parcel parcel) {
        return new ImageModel.Content(parcel);
    }

    public static final Object createFromParcel$20(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEAmazingFilterParam(parcel);
    }

    public static final Object createFromParcel$21(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEAudioDspFilterParam(parcel);
    }

    public static final Object createFromParcel$22(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEAudioEffectFilterParam(parcel);
    }

    public static final Object createFromParcel$23(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEAudioFadeFilterParam(parcel);
    }

    public static final Object createFromParcel$24(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEAudioLoudnessBalanceFilter(parcel);
    }

    public static final Object createFromParcel$25(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEAudioMetricsFilterParam(parcel);
    }

    public static final Object createFromParcel$26(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEAudioNoiseFilterParam(parcel);
    }

    public static final Object createFromParcel$27(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEAudioSamiFilterParam(parcel);
    }

    public static final Object createFromParcel$28(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEAudioSpeedFilterParam(parcel);
    }

    public static final Object createFromParcel$29(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEAudioVolumeFilterParam(parcel);
    }

    public static final Object createFromParcel$3(C2325341G0m c2325341G0m, Parcel parcel) {
        WsApi wsApi = new WsApi();
        wsApi.service = parcel.readInt();
        wsApi.method = parcel.readInt();
        return wsApi;
    }

    public static final Object createFromParcel$30(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEBaseFilterParam(parcel);
    }

    public static final Object createFromParcel$31(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEBeautyFilterParam(parcel);
    }

    public static final Object createFromParcel$32(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEBlurFilterParam(parcel);
    }

    public static final Object createFromParcel$33(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VECanvasFilterParam(parcel);
    }

    public static final Object createFromParcel$34(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEColorFilterParam(parcel);
    }

    public static final Object createFromParcel$35(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEColorHslFilterParam(parcel);
    }

    public static final Object createFromParcel$36(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEComposerFilterParam(parcel);
    }

    public static final Object createFromParcel$37(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEEffectFilterParam(parcel);
    }

    public static final Object createFromParcel$38(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEEffectHdrFilterParam(parcel);
    }

    public static final Object createFromParcel$39(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEExposureFilterParam(parcel);
    }

    public static final Object createFromParcel$4(C2325341G0m c2325341G0m, Parcel parcel) {
        WsComponent wsComponent = new WsComponent();
        wsComponent.componentName = (ComponentName) parcel.readParcelable(C2325341G0m.class.getClassLoader());
        wsComponent.acceptApis = parcel.createTypedArrayList(WsApi.CREATOR);
        return wsComponent;
    }

    public static final Object createFromParcel$40(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEImageAddFilterParam(parcel);
    }

    public static final Object createFromParcel$41(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEImageTransformFilterParam(parcel);
    }

    public static final Object createFromParcel$42(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEInfoStickerFilterParam.VEStickerAnimationParam(parcel);
    }

    public static final Object createFromParcel$43(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEInfoStickerFilterParam(parcel);
    }

    public static final Object createFromParcel$44(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VELensHdrFilterParam(parcel);
    }

    public static final Object createFromParcel$45(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEMIMOFilterParam(parcel);
    }

    public static final Object createFromParcel$46(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEMakeUpFilterParam(parcel);
    }

    public static final Object createFromParcel$47(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VERepeatFilterParam(parcel);
    }

    public static final Object createFromParcel$48(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEReshapeFilterParam(parcel);
    }

    public static final Object createFromParcel$49(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VERoundFilterParam(parcel);
    }

    public static final Object createFromParcel$5(C2325341G0m c2325341G0m, Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        Configuration configuration = new Configuration();
        configuration.LLILZLL = parcel.readInt();
        configuration.LLIZ = parcel.readInt();
        configuration.LLIZLLLIL = parcel.readInt();
        configuration.LLJIJIL = parcel.readInt();
        configuration.LLJ = parcel.readInt();
        configuration.LL = parcel.readInt();
        configuration.LLILLJJLI = parcel.readInt();
        configuration.LLILLL = parcel.readInt();
        configuration.LLILZ = parcel.readInt();
        configuration.LLILZIL = parcel.readInt();
        configuration.LLJI = parcel.readInt();
        boolean z4 = false;
        if (parcel.readByte() == 1) {
            z = true;
        } else {
            z = false;
        }
        configuration.LLJILJIL = z;
        if (parcel.readByte() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        configuration.LLJJ = z2;
        if (parcel.readByte() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        configuration.LLJILJILJ = z3;
        if (parcel.readByte() == 1) {
            z4 = true;
        }
        configuration.LLJILLL = z4;
        return configuration;
    }

    public static final Object createFromParcel$50(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VESlowMotionFilterParam(parcel);
    }

    public static final Object createFromParcel$51(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VETransitionFilterParam(parcel);
    }

    public static final Object createFromParcel$52(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEVideoAjustmentFilterParam(parcel);
    }

    public static final Object createFromParcel$53(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEVideoCropFilterParam(parcel);
    }

    public static final Object createFromParcel$54(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEVideoEffectOutSizeFilterParam(parcel);
    }

    public static final Object createFromParcel$55(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEVideoEffectStreamFilterParam(parcel);
    }

    public static final Object createFromParcel$56(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEVideoStableFilterParam(parcel);
    }

    public static final Object createFromParcel$57(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEVideoTransformFilterParam(parcel);
    }

    public static final Object createFromParcel$58(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEPrePlayParams(parcel);
    }

    public static final Object createFromParcel$59(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VEMapBufferInfo(parcel);
    }

    public static final Object createFromParcel$6(C2325341G0m c2325341G0m, Parcel parcel) {
        return new CameraEffectArguments(parcel);
    }

    public static final Object createFromParcel$7(C2325341G0m c2325341G0m, Parcel parcel) {
        return new CameraEffectTextures(parcel);
    }

    public static final Object createFromParcel$8(C2325341G0m c2325341G0m, Parcel parcel) {
        return new ShareCameraEffectContent(parcel);
    }

    public static final Object createFromParcel$9(C2325341G0m c2325341G0m, Parcel parcel) {
        return new VETrackParams(parcel);
    }

    public static final Object[] newArray$0(C2325341G0m c2325341G0m, int i) {
        return new Capability[i];
    }

    public static final Object[] newArray$1(C2325341G0m c2325341G0m, int i) {
        return new ParticipantParcelable[i];
    }

    public static final Object[] newArray$10(C2325341G0m c2325341G0m, int i) {
        return new TEFocusParameters[i];
    }

    public static final Object[] newArray$11(C2325341G0m c2325341G0m, int i) {
        return new Workspace[i];
    }

    public static final Object[] newArray$12(C2325341G0m c2325341G0m, int i) {
        return new VEARCoreParam[i];
    }

    public static final Object[] newArray$13(C2325341G0m c2325341G0m, int i) {
        return new VECameraSettings.CAMERA_CAPTURE_FLASH_STRATEGY[i];
    }

    public static final Object[] newArray$14(C2325341G0m c2325341G0m, int i) {
        return new VECameraSettings.CAMERA_HW_LEVEL[i];
    }

    public static final Object[] newArray$15(C2325341G0m c2325341G0m, int i) {
        return new VECameraSettings.CAMERA_TYPE[i];
    }

    public static final Object[] newArray$16(C2325341G0m c2325341G0m, int i) {
        return new VECameraSettings[i];
    }

    public static final Object[] newArray$17(C2325341G0m c2325341G0m, int i) {
        return new VECherEffectParam[i];
    }

    public static final Object[] newArray$18(C2325341G0m c2325341G0m, int i) {
        return new VEDisplaySettings[i];
    }

    public static final Object[] newArray$19(C2325341G0m c2325341G0m, int i) {
        return new VEVolumeParam[i];
    }

    public static final Object[] newArray$2(C2325341G0m c2325341G0m, int i) {
        return new ImageModel.Content[i];
    }

    public static final Object[] newArray$20(C2325341G0m c2325341G0m, int i) {
        return new VEAmazingFilterParam[i];
    }

    public static final Object[] newArray$21(C2325341G0m c2325341G0m, int i) {
        return new VEAudioDspFilterParam[i];
    }

    public static final Object[] newArray$22(C2325341G0m c2325341G0m, int i) {
        return new VEAudioEffectFilterParam[i];
    }

    public static final Object[] newArray$23(C2325341G0m c2325341G0m, int i) {
        return new VEAudioFadeFilterParam[i];
    }

    public static final Object[] newArray$24(C2325341G0m c2325341G0m, int i) {
        return new VEAudioLoudnessBalanceFilter[i];
    }

    public static final Object[] newArray$25(C2325341G0m c2325341G0m, int i) {
        return new VEAudioMetricsFilterParam[i];
    }

    public static final Object[] newArray$26(C2325341G0m c2325341G0m, int i) {
        return new VEAudioNoiseFilterParam[i];
    }

    public static final Object[] newArray$27(C2325341G0m c2325341G0m, int i) {
        return new VEAudioSamiFilterParam[i];
    }

    public static final Object[] newArray$28(C2325341G0m c2325341G0m, int i) {
        return new VEAudioSpeedFilterParam[i];
    }

    public static final Object[] newArray$29(C2325341G0m c2325341G0m, int i) {
        return new VEAudioVolumeFilterParam[i];
    }

    public static final Object[] newArray$3(C2325341G0m c2325341G0m, int i) {
        return new WsApi[i];
    }

    public static final Object[] newArray$30(C2325341G0m c2325341G0m, int i) {
        return new VEBaseFilterParam[i];
    }

    public static final Object[] newArray$31(C2325341G0m c2325341G0m, int i) {
        return new VEBeautyFilterParam[i];
    }

    public static final Object[] newArray$32(C2325341G0m c2325341G0m, int i) {
        return new VEBlurFilterParam[i];
    }

    public static final Object[] newArray$33(C2325341G0m c2325341G0m, int i) {
        return new VECanvasFilterParam[i];
    }

    public static final Object[] newArray$34(C2325341G0m c2325341G0m, int i) {
        return new VEColorFilterParam[i];
    }

    public static final Object[] newArray$35(C2325341G0m c2325341G0m, int i) {
        return new VEColorHslFilterParam[i];
    }

    public static final Object[] newArray$36(C2325341G0m c2325341G0m, int i) {
        return new VEComposerFilterParam[i];
    }

    public static final Object[] newArray$37(C2325341G0m c2325341G0m, int i) {
        return new VEEffectFilterParam[i];
    }

    public static final Object[] newArray$38(C2325341G0m c2325341G0m, int i) {
        return new VEEffectHdrFilterParam[i];
    }

    public static final Object[] newArray$39(C2325341G0m c2325341G0m, int i) {
        return new VEExposureFilterParam[i];
    }

    public static final Object[] newArray$4(C2325341G0m c2325341G0m, int i) {
        return new WsComponent[i];
    }

    public static final Object[] newArray$40(C2325341G0m c2325341G0m, int i) {
        return new VEImageAddFilterParam[i];
    }

    public static final Object[] newArray$41(C2325341G0m c2325341G0m, int i) {
        return new VEImageTransformFilterParam[i];
    }

    public static final Object[] newArray$42(C2325341G0m c2325341G0m, int i) {
        return new VEInfoStickerFilterParam.VEStickerAnimationParam[i];
    }

    public static final Object[] newArray$43(C2325341G0m c2325341G0m, int i) {
        return new VEInfoStickerFilterParam[i];
    }

    public static final Object[] newArray$44(C2325341G0m c2325341G0m, int i) {
        return new VELensHdrFilterParam[i];
    }

    public static final Object[] newArray$45(C2325341G0m c2325341G0m, int i) {
        return new VEMIMOFilterParam[i];
    }

    public static final Object[] newArray$46(C2325341G0m c2325341G0m, int i) {
        return new VEMakeUpFilterParam[i];
    }

    public static final Object[] newArray$47(C2325341G0m c2325341G0m, int i) {
        return new VERepeatFilterParam[i];
    }

    public static final Object[] newArray$48(C2325341G0m c2325341G0m, int i) {
        return new VEReshapeFilterParam[i];
    }

    public static final Object[] newArray$49(C2325341G0m c2325341G0m, int i) {
        return new VERoundFilterParam[i];
    }

    public static final Object[] newArray$5(C2325341G0m c2325341G0m, int i) {
        return new Configuration[i];
    }

    public static final Object[] newArray$50(C2325341G0m c2325341G0m, int i) {
        return new VESlowMotionFilterParam[i];
    }

    public static final Object[] newArray$51(C2325341G0m c2325341G0m, int i) {
        return new VETransitionFilterParam[i];
    }

    public static final Object[] newArray$52(C2325341G0m c2325341G0m, int i) {
        return new VEVideoAjustmentFilterParam[i];
    }

    public static final Object[] newArray$53(C2325341G0m c2325341G0m, int i) {
        return new VEVideoCropFilterParam[i];
    }

    public static final Object[] newArray$54(C2325341G0m c2325341G0m, int i) {
        return new VEVideoEffectOutSizeFilterParam[i];
    }

    public static final Object[] newArray$55(C2325341G0m c2325341G0m, int i) {
        return new VEVideoEffectStreamFilterParam[i];
    }

    public static final Object[] newArray$56(C2325341G0m c2325341G0m, int i) {
        return new VEVideoStableFilterParam[i];
    }

    public static final Object[] newArray$57(C2325341G0m c2325341G0m, int i) {
        return new VEVideoTransformFilterParam[i];
    }

    public static final Object[] newArray$58(C2325341G0m c2325341G0m, int i) {
        return new VEPrePlayParams[i];
    }

    public static final Object[] newArray$59(C2325341G0m c2325341G0m, int i) {
        return new VEMapBufferInfo[i];
    }

    public static final Object[] newArray$6(C2325341G0m c2325341G0m, int i) {
        return new CameraEffectArguments[i];
    }

    public static final Object[] newArray$7(C2325341G0m c2325341G0m, int i) {
        return new CameraEffectTextures[i];
    }

    public static final Object[] newArray$8(C2325341G0m c2325341G0m, int i) {
        return new ShareCameraEffectContent[i];
    }

    public static final Object[] newArray$9(C2325341G0m c2325341G0m, int i) {
        return new VETrackParams[i];
    }
}
