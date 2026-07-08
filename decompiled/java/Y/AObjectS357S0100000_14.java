package Y;

import X.C1398350mUb;
import X.C1426005i6;
import X.C20684815ws;
import X.C2188811AlT;
import X.C419910GdJ;
import X.C855900Xhs;
import X.C856120XiE;
import X.C859340XnQ;
import X.EnumC1430380nKG;
import android.app.Activity;
import android.graphics.Bitmap;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.services.publish.AVPublishExtensionUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public class AObjectS357S0100000_14 implements Function1 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            default:
                return null;
        }
    }

    public AObjectS357S0100000_14(VideoPublishContainerScene videoPublishContainerScene, int i) {
        this.$t = i;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
            case 14:
            case 15:
            case 16:
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
            case 19:
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
            case 21:
                this.l0 = videoPublishContainerScene;
                break;
            case 8:
            default:
                this.l0 = videoPublishContainerScene;
                break;
        }
    }

    public static final Object invoke$0(AObjectS357S0100000_14 aObjectS357S0100000_14, Object obj) throws Throwable {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS357S0100000_14.l0;
        videoPublishContainerScene.getClass();
        videoPublishContainerScene.LLLLLLIL(((Integer) obj).intValue());
        return null;
    }

    public static final Object invoke$1(AObjectS357S0100000_14 aObjectS357S0100000_14, Object obj) {
        C20684815ws.LJIILLIIL("dismiss_avoid_losing_access_banner", C856120XiE.LIZ(((VideoPublishContainerScene) aObjectS357S0100000_14.l0).LLLLIILL).LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AObjectS357S0100000_14 aObjectS357S0100000_14, Object obj) {
        ((VideoPublishContainerScene) aObjectS357S0100000_14.l0).LLLLIILL.creativeModel.prePublishStatusModel.postPagePrePublishId = (String) obj;
        return null;
    }

    public static final Object invoke$11(AObjectS357S0100000_14 aObjectS357S0100000_14, Object obj) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS357S0100000_14.l0;
        videoPublishContainerScene.getClass();
        if (((Integer) obj).intValue() == EnumC1430380nKG.AI_PLAYGROUND_ANCHOR.getTYPE()) {
            videoPublishContainerScene.LLLLIILL.creativeModel.editorProAIGCInfoModel.aiPlaygroundCameraModel.anchorRemoved = true;
            return null;
        }
        return null;
    }

    public static final Object invoke$12(AObjectS357S0100000_14 aObjectS357S0100000_14, Object obj) {
        ((VideoPublishContainerScene) aObjectS357S0100000_14.l0).LLJL.vG1(((Integer) obj).intValue());
        return Unit.LIZ;
    }

    public static final Object invoke$13(AObjectS357S0100000_14 aObjectS357S0100000_14, Object obj) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS357S0100000_14.l0;
        Integer num = (Integer) obj;
        videoPublishContainerScene.getClass();
        if (num.intValue() == EnumC1430380nKG.LYRIC_EFFECT_ANCHOR.getTYPE()) {
            videoPublishContainerScene.LLLLIILL.creativeModel.stickerModel.lyricEffectAnchorRemoved = true;
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("REMOVED user-clicked-delete type=");
            sbLIZ.append(num);
            C1426005i6.LIZJ(c1398350mUb, "Anchor.Publish.Remove", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        return null;
    }

    public static final Object invoke$14(AObjectS357S0100000_14 aObjectS357S0100000_14, Object obj) {
        ((VideoPublishContainerScene) aObjectS357S0100000_14.l0).LLLF.LJIJJLI = ((Boolean) obj).booleanValue();
        return Unit.LIZ;
    }

    public static final Object invoke$15(AObjectS357S0100000_14 aObjectS357S0100000_14, Object obj) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS357S0100000_14.l0;
        videoPublishContainerScene.getClass();
        if (((Integer) obj).intValue() == 2 && videoPublishContainerScene.LLLLLLJ != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_2pt_exclamation_mark_circle;
            HandlerHook.viewPostDelay(videoPublishContainerScene.LLLLLLJ, new ARunnableS88S0200000_19(videoPublishContainerScene, c419910GdJ, 22), 200L);
            C20684815ws.LJIILLIIL("show_avoid_losing_access_banner", C856120XiE.LIZ(videoPublishContainerScene.LLLLIILL).LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AObjectS357S0100000_14 aObjectS357S0100000_14, Object obj) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS357S0100000_14.l0;
        videoPublishContainerScene.getClass();
        if (((Boolean) obj).booleanValue()) {
            videoPublishContainerScene.i();
            return null;
        }
        return null;
    }

    public static final Object invoke$17(AObjectS357S0100000_14 aObjectS357S0100000_14, Object obj) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS357S0100000_14.l0;
        videoPublishContainerScene.LLLZZIL = true;
        videoPublishContainerScene.LLLLLLLZIL();
        return null;
    }

    public static final Object invoke$18(AObjectS357S0100000_14 aObjectS357S0100000_14, Object obj) throws Throwable {
        ((VideoPublishContainerScene) aObjectS357S0100000_14.l0).LLLLZ();
        return null;
    }

    public static final Object invoke$19(AObjectS357S0100000_14 aObjectS357S0100000_14, Object obj) {
        Activity activity;
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS357S0100000_14.l0;
        videoPublishContainerScene.getClass();
        int iIntValue = ((Integer) obj).intValue();
        if (iIntValue != 1) {
            if (iIntValue != 3) {
                if (iIntValue != 5) {
                    if (iIntValue == 6 && (activity = videoPublishContainerScene.mActivity) != null) {
                        videoPublishContainerScene.LLLLIILL.creativeModel.audioCopyrightDetectModel.setChangeMusicFrom("video_post_page");
                        videoPublishContainerScene.H().lR2(false, videoPublishContainerScene.LLLLIILL.mIsFromDraft, true, false);
                        C855900Xhs.LIZ(activity, Boolean.valueOf(C859340XnQ.LIZIZ()));
                        return null;
                    }
                    return null;
                }
                videoPublishContainerScene.H().lR2(false, videoPublishContainerScene.LLLLIILL.mIsFromDraft, false, true);
                return null;
            }
            videoPublishContainerScene.LLLLIILL.creativeModel.audioCopyrightDetectModel.setContinueSelected(true);
            videoPublishContainerScene.v();
            return null;
        }
        videoPublishContainerScene.LLLLIILL.creativeModel.audioCopyrightDetectModel.setChangeMusicFrom("video_post_page");
        videoPublishContainerScene.H().lR2(false, videoPublishContainerScene.LLLLIILL.mIsFromDraft, true, false);
        return null;
    }

    public static final Object invoke$2(AObjectS357S0100000_14 aObjectS357S0100000_14, Object obj) throws Throwable {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS357S0100000_14.l0;
        videoPublishContainerScene.getClass();
        videoPublishContainerScene.LLLLZLL(((Integer) obj).intValue(), true);
        return null;
    }

    public static final Object invoke$20(AObjectS357S0100000_14 aObjectS357S0100000_14, Object obj) {
        return AVPublishExtensionUtils.findModel(((VideoPublishContainerScene) aObjectS357S0100000_14.l0).LLLLL, (Class) obj);
    }

    public static final Object invoke$21(AObjectS357S0100000_14 aObjectS357S0100000_14, Object obj) {
        return AVPublishExtensionUtils.findModel(((VideoPublishContainerScene) aObjectS357S0100000_14.l0).LLLLL, (Class) obj);
    }

    public static final Object invoke$22(AObjectS357S0100000_14 aObjectS357S0100000_14, Object obj) {
        return ((VideoPublishEditModel) aObjectS357S0100000_14.l0).getCoverPublishModel().getEffectTextModel().mergeCoverText((Bitmap) obj);
    }

    public static final Object invoke$3(AObjectS357S0100000_14 aObjectS357S0100000_14, Object obj) throws Throwable {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS357S0100000_14.l0;
        videoPublishContainerScene.getClass();
        videoPublishContainerScene.LLLLLLIL(((Integer) obj).intValue());
        return null;
    }

    public static final Object invoke$4(AObjectS357S0100000_14 aObjectS357S0100000_14, Object obj) throws Throwable {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS357S0100000_14.l0;
        videoPublishContainerScene.getClass();
        videoPublishContainerScene.LLLLLLIL(((Integer) obj).intValue());
        return null;
    }

    public static final Object invoke$5(AObjectS357S0100000_14 aObjectS357S0100000_14, Object obj) throws Throwable {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS357S0100000_14.l0;
        videoPublishContainerScene.getClass();
        videoPublishContainerScene.LLLLZLL(((Integer) obj).intValue(), true);
        return null;
    }

    public static final Object invoke$6(AObjectS357S0100000_14 aObjectS357S0100000_14, Object obj) throws Throwable {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS357S0100000_14.l0;
        videoPublishContainerScene.getClass();
        videoPublishContainerScene.LLLLZLL(((Integer) obj).intValue(), true);
        return null;
    }

    public static final Object invoke$7(AObjectS357S0100000_14 aObjectS357S0100000_14, Object obj) throws Throwable {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS357S0100000_14.l0;
        videoPublishContainerScene.getClass();
        videoPublishContainerScene.LLLLLLIL(((Integer) obj).intValue());
        return null;
    }

    public static final Object invoke$8(AObjectS357S0100000_14 aObjectS357S0100000_14, Object obj) {
        if (((Integer) obj).intValue() == EnumC1430380nKG.PHOTO_SPARK_ANCHOR.getTYPE()) {
            ((VideoPublishContainerScene) aObjectS357S0100000_14.l0).LLLLIILL.creativeModel.sparkPublishModel.hasSparkAnchor = false;
            return null;
        }
        return null;
    }

    public static final Object invoke$9(AObjectS357S0100000_14 aObjectS357S0100000_14, Object obj) throws Throwable {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS357S0100000_14.l0;
        videoPublishContainerScene.getClass();
        videoPublishContainerScene.LLLLZLL(((Integer) obj).intValue(), true);
        return null;
    }

    public AObjectS357S0100000_14(VideoPublishEditModel videoPublishEditModel, int i) {
        this.$t = i;
        this.l0 = videoPublishEditModel;
    }
}
