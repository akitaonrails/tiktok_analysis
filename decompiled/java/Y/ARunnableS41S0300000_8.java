package Y;

import X.AbstractC214793194d;
import X.AbstractC214814194y;
import X.C013C;
import X.C0C64;
import X.C0L16;
import X.C0M3A;
import X.C0M6J;
import X.C0MH8;
import X.C0WZX;
import X.C118300cf;
import X.C1322200kVm;
import X.C1323050kX9;
import X.C1324660kZk;
import X.C1324810kZz;
import X.C1325120kaU;
import X.C1325410kax;
import X.C1325710kbR;
import X.C1328060kfE;
import X.C1328130kfL;
import X.C1388190mED;
import X.C13LZ;
import X.C15O7;
import X.C1688680u2s;
import X.C1893760zNe;
import X.C19EG;
import X.C1C7U;
import X.C201955140j;
import X.C20622515mp;
import X.C21341918fZ;
import X.C2188811AlT;
import X.C2189008hs;
import X.C2204961BRm;
import X.C23250099c;
import X.C255890A1b;
import X.C259800zU;
import X.C383300F1c;
import X.C493401w4;
import X.C529620Kps;
import X.C529740Kq4;
import X.C530820Kro;
import X.C549450Lgl;
import X.C554260LoW;
import X.C561580M0u;
import X.C565400MFm;
import X.C565430MFp;
import X.C573060Mdk;
import X.C573310Me9;
import X.C581180Mqq;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.EnumC1399820mWy;
import X.EnumC569750MWf;
import X.InterfaceC561590M0v;
import X.InterfaceC573470MeP;
import X.ProgressDialogC1399790mWv;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.net.Uri;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aiuikit.impl.mentionlist.scene.MentionCell;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.services.external.ability.IAbilityService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCoverConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.draft.adapter.viewholder.NewDraftViewHolder;
import com.ss.android.ugc.templatecore.templatedata.MvThemeData;
import com.ss.android.vesdk.VEMediaParser;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.Intrinsics;
import pic.q;

/* JADX INFO: loaded from: classes9.dex */
public class ARunnableS41S0300000_8 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        float width;
        if (((C529620Kps) this.l0).itemView.getParent() == null) {
            return;
        }
        Integer numValueOf = Integer.valueOf(((C529620Kps) this.l0).itemView.getWidth());
        TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) this.l1;
        int iIntValue = numValueOf.intValue();
        if (iIntValue > 0 && tikTokMediaModel.width > iIntValue) {
            width = ((C529620Kps) this.l0).itemView.getWidth() / numValueOf.intValue();
        } else {
            width = 1.0f;
        }
        try {
            C15O7.LIZIZ(new ACallableS17S0202000_8((VEMediaParser) this.l2, (TikTokMediaModel) this.l1, (int) (r8.width * width), (int) (r8.height * width), 0), C15O7.LJI, null).LJ(new C581180Mqq((C529620Kps) this.l0, (VEMediaParser) this.l2, 0), C15O7.LJIIIIZZ, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZ$1() {
        Context context;
        boolean[] zArr = (boolean[]) this.l0;
        if (zArr == null || !zArr[0] || (context = (Context) this.l1) == null) {
            return;
        }
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (((ProgressDialogC1399790mWv[]) this.l2) == null || activityLIZ == null || activityLIZ.isFinishing()) {
            return;
        }
        ProgressDialogC1399790mWv[] progressDialogC1399790mWvArr = (ProgressDialogC1399790mWv[]) this.l2;
        Context context2 = (Context) this.l1;
        ProgressDialogC1399790mWv progressDialogC1399790mWv = new ProgressDialogC1399790mWv(context2, EnumC1399820mWy.GONE);
        progressDialogC1399790mWv.setCancelable(false);
        Activity activityLIZ2 = C1388190mED.LIZ(context2);
        if (activityLIZ2 != null && C1893760zNe.LIZ(activityLIZ2, true) && !C20622515mp.LJIILIIL(activityLIZ2)) {
            C786410Ut5.O4(progressDialogC1399790mWv);
        }
        progressDialogC1399790mWvArr[0] = progressDialogC1399790mWv;
        ((ProgressDialogC1399790mWv[]) this.l2)[0].setMessage(((Context) this.l1).getResources().getString(R.string.txr));
        C1688680u2s.LJIIL(true, 1503);
    }

    public final void LIZ$2() {
        String str;
        if (((VideoPublishEditModel) this.l0).getMultiEditVideoRecordData() != null) {
            MultiEditVideoStatusRecordData multiEditVideoRecordData = ((VideoPublishEditModel) this.l0).getMultiEditVideoRecordData();
            if (TextUtils.isEmpty(multiEditVideoRecordData != null ? multiEditVideoRecordData.coverImagePath : null)) {
                MultiEditVideoStatusRecordData multiEditVideoRecordData2 = ((VideoPublishEditModel) this.l0).getMultiEditVideoRecordData();
                if (multiEditVideoRecordData2 != null) {
                    multiEditVideoRecordData2.coverImagePath = C383300F1c.LIZJ(((VideoPublishEditModel) this.l0).getCreativeInfo());
                }
                VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.l0;
                MultiEditVideoStatusRecordData multiEditVideoRecordData3 = videoPublishEditModel.getMultiEditVideoRecordData();
                videoPublishEditModel.setVideoCoverPath(multiEditVideoRecordData3 != null ? multiEditVideoRecordData3.coverImagePath : null);
            }
            if (C493401w4.LIZ()) {
                C0MH8 c0mh8 = C0MH8.LIZ;
                VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) this.l0;
                Bitmap bitmap = (Bitmap) this.l1;
                MultiEditVideoStatusRecordData multiEditVideoRecordData4 = videoPublishEditModel2.getMultiEditVideoRecordData();
                C0MH8.LJIIZILJ(c0mh8, videoPublishEditModel2, bitmap, 0, 0, multiEditVideoRecordData4 != null ? multiEditVideoRecordData4.coverImagePath : null, 0, null, new AwS374S0200000_8((VideoPublishEditModel) this.l0, (Function1) this.l2, 142), 108);
                return;
            }
            Bitmap bitmap2 = (Bitmap) this.l1;
            MultiEditVideoStatusRecordData multiEditVideoRecordData5 = ((VideoPublishEditModel) this.l0).getMultiEditVideoRecordData();
            if (multiEditVideoRecordData5 == null || (str = multiEditVideoRecordData5.coverImagePath) == null) {
                str = "";
            }
            C383300F1c.LJ(bitmap2, str, 100, new AwS409S0200000_8((VideoPublishEditModel) this.l0, (Function1) this.l2, 101));
        }
    }

    public final void LIZ$3() throws Throwable {
        Editable editableLLLZIL = C2204961BRm.LLLZIL((C565430MFp) this.l0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOuhdpbF1SbwsUxMXXUeowuwWHRLEUQJ7nth+wOGTW3757vAAtVTxsme0w==", null));
        if (editableLLLZIL == null) {
            return;
        }
        int iLJ = C13LZ.LJ(((C118300cf) this.l1).element, 0, editableLLLZIL.length());
        ((C565430MFp) this.l0).requestFocus();
        ((C565430MFp) this.l0).setSelection(iLJ);
        ((C565400MFm) this.l2).LLLLLZL(true);
        C565430MFp c565430MFp = (C565430MFp) this.l0;
        HandlerHook.viewPostDelay(c565430MFp, new ARunnableS19S0101000_8(iLJ, c565430MFp, 8), 100L);
        ((C565400MFm) this.l2).LLLLLLLZIL();
        C565400MFm c565400MFm = (C565400MFm) this.l2;
        C565430MFp c565430MFp2 = (C565430MFp) this.l0;
        c565400MFm.getClass();
        C565400MFm.LLLLZIL(c565430MFp2);
    }

    public final void LIZ$4() {
        ((C573310Me9) this.l0).LIZLLL = true;
        C573060Mdk c573060Mdk = (C573060Mdk) this.l1;
        if (c573060Mdk != null) {
            int i = c573060Mdk.LJIIJJI;
            c573060Mdk.LJIIIZ = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 9 : 8 : 6 : 4 : 2;
        }
        MvThemeData mvThemeData = ((C573310Me9) this.l0).LJ;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("{\"event\":\"effectDownloadTimeout\",\"timeoutStep\":");
            C573060Mdk c573060Mdk2 = (C573060Mdk) this.l1;
            sbLIZ.append(c573060Mdk2 != null ? c573060Mdk2.LJIIIZ : -1);
            sbLIZ.append(",\"hasMvThemeData\":");
            sbLIZ.append(mvThemeData != null);
            sbLIZ.append('}');
            C201955140j.LJIJ("PhotoMVNext", C2188811AlT.LIZIZ(sbLIZ));
            C573060Mdk c573060Mdk3 = (C573060Mdk) this.l1;
            int i2 = c573060Mdk3 != null ? c573060Mdk3.LJIIIZ : -1;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("timeout: ");
            C573060Mdk c573060Mdk4 = (C573060Mdk) this.l1;
            sbLIZ2.append(c573060Mdk4 != null ? c573060Mdk4.LJIIJ : null);
            sbLIZ2.append(" isTimeOut: ");
            sbLIZ2.append(((C573310Me9) this.l0).LIZLLL);
            C0L16.LIZ(i2, "startCountTimeLimit", C2188811AlT.LIZIZ(sbLIZ2));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (mvThemeData != null) {
            InterfaceC573470MeP interfaceC573470MeP = (InterfaceC573470MeP) this.l2;
            if (interfaceC573470MeP != null) {
                interfaceC573470MeP.LIZ(mvThemeData, null, null, false, false);
                return;
            }
            return;
        }
        InterfaceC573470MeP interfaceC573470MeP2 = (InterfaceC573470MeP) this.l2;
        if (interfaceC573470MeP2 != null) {
            interfaceC573470MeP2.onFailed();
        }
    }

    public final void LIZ$6() {
        MentionDataItem mentionDataItem;
        C554260LoW item = ((MentionCell) this.l0).getItem();
        if (item == null || (mentionDataItem = item.LL) == null || !C549450Lgl.LIZ(mentionDataItem)) {
            return;
        }
        float fMeasureText = ((MentionCell) this.l0).N5().getPaint().measureText(((MentionCell) this.l0).N5().getText().toString());
        float textSize = ((MentionCell) this.l0).N5().getPaint().getTextSize();
        if (fMeasureText <= 0.0f || textSize <= 0.0f) {
            return;
        }
        double radians = Math.toRadians(81.0d);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        float fAbs = (Math.abs(fMeasureText * fSin) + Math.abs(textSize * fCos)) / 2.0f;
        float f = fMeasureText / 2.0f;
        float f2 = textSize / 2.0f;
        float f3 = fSin * fAbs;
        float f4 = (-fCos) * fAbs;
        ((MentionCell) this.l0).N5().getPaint().setShader(new LinearGradient(f - f3, f2 - f4, f + f3, f2 + f4, (int[]) this.l1, (float[]) this.l2, Shader.TileMode.CLAMP));
        ((MentionCell) this.l0).N5().invalidate();
    }

    public final void LIZ$7() {
        String stringExtra;
        C561580M0u c561580M0u = (C561580M0u) this.l0;
        C19EG c19eg = (C19EG) this.l1;
        InterfaceC561590M0v interfaceC561590M0v = (InterfaceC561590M0v) this.l2;
        boolean zLJFF = Intrinsics.LJFF(interfaceC561590M0v != null ? interfaceC561590M0v.getEnterFrom() : null, "click_profile_guide_widget");
        c561580M0u.getClass();
        if (c19eg == null || c19eg.isFinishing() || zLJFF) {
            return;
        }
        Intent intent = c19eg.getIntent();
        if (intent != null) {
            try {
                stringExtra = intent.getStringExtra("enter_method");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
        } else {
            stringExtra = null;
        }
        if (Intrinsics.LJFF(stringExtra, "managedrafts") || C255890A1b.LIZ()) {
            return;
        }
        C23250099c.LIZLLL(c561580M0u.LIZIZ, null, null, new C2189008hs(c19eg, c561580M0u, null), 3);
    }

    public final void LIZ$5() {
        IAVDraftService iAVDraftServiceDraftService;
        VideoCoverConfig videoCoverConfig = C0C64.LJIILLIIL().LJIIIZ(31744, "personal_page_cover_resize_switch", true, false) ? new VideoCoverConfig(((SmartImageView) this.l0).getWidth(), ((SmartImageView) this.l0).getHeight(), Bitmap.Config.ARGB_8888) : null;
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService == null || (iAVDraftServiceDraftService = iExternalService.draftService()) == null) {
            return;
        }
        final AwemeDraft awemeDraft = (AwemeDraft) this.l1;
        final C0M6J c0m6j = (C0M6J) this.l2;
        final SmartImageView smartImageView = (SmartImageView) this.l0;
        iAVDraftServiceDraftService.loadThumbCover(awemeDraft, videoCoverConfig, new IEffectService.OnVideoCoverCallback() { // from class: X.0M6H
            @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
            public final void onGetVideoCoverFailed(int i) {
                IExternalService iExternalService2;
                IAbilityService iAbilityServiceAbilityService;
                IAVInfoService iAVInfoServiceInfoService;
                final C0M6J c0m6j2 = c0m6j;
                AwemeDraft awemeDraft2 = awemeDraft;
                final SmartImageView smartImageView2 = smartImageView;
                c0m6j2.getClass();
                if (awemeDraft2 != null && (iExternalService2 = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null)) != null && (iAbilityServiceAbilityService = iExternalService2.abilityService()) != null && (iAVInfoServiceInfoService = iAbilityServiceAbilityService.infoService()) != null) {
                    iAVInfoServiceInfoService.videoCover(awemeDraft2, new IAVInfoService.IGetInfoCallback<Bitmap>() { // from class: X.0M6I
                        @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
                        public final void finish(Bitmap bitmap) {
                            Bitmap bitmap2 = bitmap;
                            SmartImageView smartImageView3 = smartImageView2;
                            if (smartImageView3 != null && bitmap2 != null) {
                                c0m6j2.L5(bitmap2, smartImageView3);
                            }
                        }
                    });
                }
            }

            @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
            public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                c0m6j.L5(bitmap, smartImageView);
            }
        });
    }

    public static final void run$0(ARunnableS41S0300000_8 aRunnableS41S0300000_8) {
        boolean zLIZ;
        C1C7U.LIZ("VideoImageMixedBaseAdapter$VideoImageMixedBaseViewHolder@805b.bindClippedVideoCoverData$1");
        try {
            aRunnableS41S0300000_8.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoImageMixedBaseAdapter$VideoImageMixedBaseViewHolder@805b.bindClippedVideoCoverData$1");
    }

    public static final void run$1(ARunnableS41S0300000_8 aRunnableS41S0300000_8) {
        C529740Kq4 c529740Kq4 = (C529740Kq4) aRunnableS41S0300000_8.l0;
        C21341918fZ c21341918fZ = (C21341918fZ) aRunnableS41S0300000_8.l1;
        List<TikTokMediaModel> list = (List) aRunnableS41S0300000_8.l2;
        c529740Kq4.getClass();
        C1C7U.LIZ("MvImageChooseAdapter@f1cb.setPageLoadData$2L$1L");
        c529740Kq4.LLLILZ(c21341918fZ, list);
        C1C7U.LIZIZ("MvImageChooseAdapter@f1cb.setPageLoadData$2L$1L");
    }

    public static final void run$10(ARunnableS41S0300000_8 aRunnableS41S0300000_8) {
        boolean zLIZ;
        C1C7U.LIZ("MentionCell@159d.applyCreateAiSelfGradient$1");
        try {
            aRunnableS41S0300000_8.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MentionCell@159d.applyCreateAiSelfGradient$1");
    }

    public static final void run$11(ARunnableS41S0300000_8 aRunnableS41S0300000_8) {
        boolean zLIZ;
        C1C7U.LIZ("RecordServiceImpl@35b4.startReusePugcTemplateAlbum$3$onFailed$1");
        try {
            q.LJIIIZ((Activity) aRunnableS41S0300000_8.l0, (C259800zU) aRunnableS41S0300000_8.l1, (C013C) aRunnableS41S0300000_8.l2, false);
            q.LJIIIIZZ((Activity) aRunnableS41S0300000_8.l0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RecordServiceImpl@35b4.startReusePugcTemplateAlbum$3$onFailed$1");
    }

    public static final void run$12(ARunnableS41S0300000_8 aRunnableS41S0300000_8) {
        boolean zLIZ;
        C1C7U.LIZ("SAALauncherOnlyLive@2020.launchPageInSAAActivityInternal$pushScene$1");
        try {
            ((AbstractC214814194y) aRunnableS41S0300000_8.l0).onEnterAnimationComplete();
            if (((AbstractC214814194y) aRunnableS41S0300000_8.l0).getChangeTranslucentOnAnimEnd() && ((NavigationScene) aRunnableS41S0300000_8.l1).LLLLLIL((AbstractC214814194y) aRunnableS41S0300000_8.l0)) {
                ((NavigationScene) aRunnableS41S0300000_8.l1).LLLILZ((AbstractC214814194y) aRunnableS41S0300000_8.l0, EnumC569750MWf.FROM_TRANSLUCENT);
            }
            ((AbstractC214793194d) aRunnableS41S0300000_8.l2).LJIIIIZZ(null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SAALauncherOnlyLive@2020.launchPageInSAAActivityInternal$pushScene$1");
    }

    public static final void run$13(ARunnableS41S0300000_8 aRunnableS41S0300000_8) {
        boolean zLIZ;
        C1C7U.LIZ("DraftBoxCleanStorageHintComponent@1396.init$2");
        try {
            aRunnableS41S0300000_8.LIZ$7();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DraftBoxCleanStorageHintComponent@1396.init$2");
    }

    public static final void run$2(ARunnableS41S0300000_8 aRunnableS41S0300000_8) {
        boolean zLIZ;
        C1C7U.LIZ("AVToolsHelper@51fc.lambda$fetchEffectList$13$1");
        try {
            aRunnableS41S0300000_8.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AVToolsHelper@51fc.lambda$fetchEffectList$13$1");
    }

    public static final void run$3(ARunnableS41S0300000_8 aRunnableS41S0300000_8) {
        boolean zLIZ;
        C1C7U.LIZ("StoryPageLauncher@7b39.launchPageInSAAActivityInternal$1");
        try {
            ((AbstractC214814194y) aRunnableS41S0300000_8.l0).onEnterAnimationComplete();
            if (((AbstractC214814194y) aRunnableS41S0300000_8.l0).getChangeTranslucentOnAnimEnd() && ((NavigationScene) aRunnableS41S0300000_8.l1).LLLLLIL((AbstractC214814194y) aRunnableS41S0300000_8.l0)) {
                ((NavigationScene) aRunnableS41S0300000_8.l1).LLLILZ((AbstractC214814194y) aRunnableS41S0300000_8.l0, EnumC569750MWf.FROM_TRANSLUCENT);
            }
            ((AbstractC214793194d) aRunnableS41S0300000_8.l2).LJIIIIZZ(null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StoryPageLauncher@7b39.launchPageInSAAActivityInternal$1");
    }

    public static final void run$4(ARunnableS41S0300000_8 aRunnableS41S0300000_8) {
        boolean zLIZ;
        ImageView imageView;
        C1C7U.LIZ("NewDraftViewHolder$BindDraftCoverFallbackRunnable@dcd7.run$1$setBitmap$1");
        try {
            C0M3A c0m3a = (C0M3A) aRunnableS41S0300000_8.l0;
            if (!c0m3a.LLILZ && (imageView = (ImageView) aRunnableS41S0300000_8.l1) != null) {
                Bitmap bitmap = (Bitmap) aRunnableS41S0300000_8.l2;
                if (c0m3a.LLILLL.get() != null) {
                    NewDraftViewHolder.R5(bitmap, imageView);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NewDraftViewHolder$BindDraftCoverFallbackRunnable@dcd7.run$1$setBitmap$1");
    }

    public static final void run$5(ARunnableS41S0300000_8 aRunnableS41S0300000_8) {
        C1325410kax c1325410kax = (C1325410kax) aRunnableS41S0300000_8.l0;
        Uri uri = (Uri) aRunnableS41S0300000_8.l1;
        Bitmap bitmap = (Bitmap) aRunnableS41S0300000_8.l2;
        c1325410kax.getClass();
        C1C7U.LIZ("FrescoCache@d725.cacheBitmap$1L");
        C1324660kZk c1324660kZkLIZJ = C1324810kZz.LJI().LIZJ(C1325710kbR.LIZ(uri), null);
        Class<?> cls = C1322200kVm.LIZ;
        C1328130kfL.LJIILIIL().LJII().LJ(c1324660kZkLIZJ, C1323050kX9.LJIJJLI(new C1325120kaU(bitmap, C530820Kro.LIZIZ(), C1328060kfE.LIZLLL, 0)));
        C1C7U.LIZIZ("FrescoCache@d725.cacheBitmap$1L");
    }

    public static final void run$6(ARunnableS41S0300000_8 aRunnableS41S0300000_8) {
        boolean zLIZ;
        C1C7U.LIZ("CCPublishUtil@49de.fillCCPublishModel$1$1");
        try {
            aRunnableS41S0300000_8.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CCPublishUtil@49de.fillCCPublishModel$1$1");
    }

    public static final void run$7(ARunnableS41S0300000_8 aRunnableS41S0300000_8) {
        boolean zLIZ;
        C1C7U.LIZ("InputBoxScene@fda4.initObservers$16$2");
        try {
            aRunnableS41S0300000_8.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InputBoxScene@fda4.initObservers$16$2");
    }

    public static final void run$8(ARunnableS41S0300000_8 aRunnableS41S0300000_8) {
        boolean zLIZ;
        C1C7U.LIZ("PicResDownManager@11d3.startCountTimeLimit$2");
        try {
            aRunnableS41S0300000_8.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PicResDownManager@11d3.startCountTimeLimit$2");
    }

    public static final void run$9(ARunnableS41S0300000_8 aRunnableS41S0300000_8) {
        boolean zLIZ;
        C1C7U.LIZ("M2MigrationHasDraftViewHolder@2bb8.bindVideoThumbnail$loadThumbCoverRunnable$1");
        try {
            aRunnableS41S0300000_8.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("M2MigrationHasDraftViewHolder@2bb8.bindVideoThumbnail$loadThumbCoverRunnable$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS41S0300000_8(Object obj, Activity activity, C259800zU<DialogC1389620mGW> c259800zU, C013C c013c) {
        this.$t = c013c;
        this.l0 = obj;
        this.l1 = activity;
        this.l2 = c259800zU;
    }
}
