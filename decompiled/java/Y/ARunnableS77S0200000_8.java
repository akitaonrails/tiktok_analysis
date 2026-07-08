package Y;

import X.AbstractC1291220jho;
import X.AbstractC214814194y;
import X.C097U;
import X.C098200Yq;
import X.C0CNO;
import X.C0ID9;
import X.C0L3D;
import X.C0L3H;
import X.C0L3U;
import X.C0M12;
import X.C0M1F;
import X.C0M39;
import X.C0M6J;
import X.C0MAY;
import X.C0MFP;
import X.C0MIK;
import X.C0MPG;
import X.C0MR9;
import X.C0MSN;
import X.C0MSO;
import X.C0MV8;
import X.C0MVC;
import X.C0MVS;
import X.C0MX0;
import X.C0WZX;
import X.C12ES;
import X.C1320810kTX;
import X.C1322200kVm;
import X.C1324630kZh;
import X.C1325340kaq;
import X.C1325700kbQ;
import X.C1329360khK;
import X.C1389890mGx;
import X.C1390360mHi;
import X.C1390390mHl;
import X.C1398350mUb;
import X.C13LP;
import X.C1417080myo;
import X.C1417100myq;
import X.C1439190nYT;
import X.C1443030nef;
import X.C14KQ;
import X.C15O7;
import X.C1660680tJi;
import X.C1688680u2s;
import X.C1846060y8i;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C1C7U;
import X.C20183113y9;
import X.C20184713yP;
import X.C201955140j;
import X.C20622515mp;
import X.C21578619ce;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2471909mP;
import X.C2477909nN;
import X.C377760ErW;
import X.C384040F3y;
import X.C418440Gaw;
import X.C426750GoL;
import X.C527420KmK;
import X.C533790Kwb;
import X.C537680L6w;
import X.C546820LcW;
import X.C547140Ld2;
import X.C549450Lgl;
import X.C553680Lna;
import X.C553990Lo5;
import X.C554260LoW;
import X.C554270LoX;
import X.C555080Lpq;
import X.C557050Lt1;
import X.C557410Ltb;
import X.C562830M5p;
import X.C562880M5u;
import X.C565400MFm;
import X.C565430MFp;
import X.C569820MWm;
import X.C571470MbB;
import X.C571970Mbz;
import X.C572260McS;
import X.C576250Mit;
import X.C578250Mm7;
import X.C578340MmG;
import X.C785410UrT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C823050WQl;
import X.EnumC569750MWf;
import X.InterfaceC1665500tRU;
import X.InterfaceC554250LoV;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Editable;
import android.text.Layout;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.airemix.api.IAIRemixService;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.LivePhotoInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem;
import com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabFragment;
import com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabViewModel;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.autocut.AutoCutProcessViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCoverConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewVideoScene;
import com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.draft.adapter.viewholder.NewDraftViewHolder;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsBizPluginService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public class ARunnableS77S0200000_8 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case 14:
                run$14(this);
                break;
            case 15:
                run$15(this);
                break;
            case 16:
                run$16(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                run$17(this);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                run$18(this);
                break;
            case 19:
                run$19(this);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                run$20(this);
                break;
            case 21:
                run$21(this);
                break;
            case 22:
                run$22(this);
                break;
            case 23:
                run$23(this);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                run$24(this);
                break;
            case 25:
                run$25(this);
                break;
            case 26:
                run$26(this);
                break;
            case 27:
                run$27(this);
                break;
            case 28:
                run$28(this);
                break;
            case 29:
                run$29(this);
                break;
            case 30:
                run$30(this);
                break;
            case 31:
                run$31(this);
                break;
            case 32:
                run$32(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                run$33(this);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                run$34(this);
                break;
            case 35:
                run$35(this);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                run$36(this);
                break;
            case 37:
                run$37(this);
                break;
            case 38:
                run$38(this);
                break;
            case 39:
                run$39(this);
                break;
            case 40:
                run$40(this);
                break;
            case 41:
                run$41(this);
                break;
            case 42:
                run$42(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Object c098200Yq;
        try {
            ViewModelProvider viewModelProviderLIZ = C0L3U.LIZ((C19EG) this.l1);
            c098200Yq = viewModelProviderLIZ != null ? (AutoCutProcessViewModel) viewModelProviderLIZ.get(AutoCutProcessViewModel.class) : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        AutoCutProcessViewModel autoCutProcessViewModel = (AutoCutProcessViewModel) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        if (autoCutProcessViewModel != null) {
            autoCutProcessViewModel.vQ2(((AutoCutModel) this.l0).templateList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() {
        /*
            r5 = this;
            java.lang.Object r4 = r5.l0
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r3 = r5.l1
            com.ss.android.ugc.aweme.explore.assem.creation.ExploreText2ImageComponent r3 = (com.ss.android.ugc.aweme.explore.assem.creation.ExploreText2ImageComponent) r3
            wh6.AbS690S0100000_8 r2 = new wh6.AbS690S0100000_8
            r1 = 1
            r0 = 42
            r2.<init>(r3, r1, r0)
            X.C786410Ut5.I7(r2, r4)
            java.lang.Object r3 = r5.l0
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r0 = r5.l1
            com.ss.android.ugc.aweme.explore.assem.creation.ExploreText2ImageComponent r0 = (com.ss.android.ugc.aweme.explore.assem.creation.ExploreText2ImageComponent) r0
            android.content.Context r0 = r0.getContext()
            r2 = 0
            if (r0 == 0) goto Laa
            boolean r1 = X.C960203pA.LIZIZ(r0)
            r0 = 1
            if (r1 != r0) goto Laa
        L29:
            if (r3 == 0) goto L60
            if (r0 != 0) goto L60
            android.content.res.Resources r0 = r3.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r1 = r0.density
            r0 = 1096810496(0x41600000, float:14.0)
            float r1 = r1 * r0
            X.0F7D r0 = new X.0F7D
            r0.<init>(r1)
            r3.setBackground(r0)
            android.view.ViewParent r1 = r3.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L51
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L51
            r1.setClipChildren(r2)
        L51:
            android.view.ViewParent r1 = r3.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L60
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L60
            r1.setClipToPadding(r2)
        L60:
            java.lang.Object r0 = r5.l1
            com.ss.android.ugc.aweme.explore.assem.creation.ExploreText2ImageComponent r0 = (com.ss.android.ugc.aweme.explore.assem.creation.ExploreText2ImageComponent) r0
            r0.hp()
            X.07CG r0 = X.C07CG.LIZ
            r0.getClass()
            boolean r0 = X.C07CG.LIZ()
            if (r0 == 0) goto La0
            java.lang.Object r0 = r5.l0
            android.view.View r0 = (android.view.View) r0
            X.C786410Ut5.LJLLLLLL(r2, r0)
            X.15TA r0 = X.C15TA.LIZ
            r0.getClass()
            boolean r0 = X.C15TA.LJIIL
            if (r0 == 0) goto L8d
            X.C15TA.LJIIL = r2
            X.01zV r1 = new X.01zV
            r0 = 7
            r1.<init>(r0)
            X.C15TA.LJIILL(r1)
        L8d:
            X.C0XQ7.LJ()
            com.ss.android.ugc.aweme.IAccountService r0 = X.C0XQ7.LIZ
            com.ss.android.ugc.aweme.AccountUserService r1 = r0.LJIIJ()
            java.lang.Object r0 = r5.l1
            com.ss.android.ugc.aweme.explore.assem.creation.ExploreText2ImageComponent r0 = (com.ss.android.ugc.aweme.explore.assem.creation.ExploreText2ImageComponent) r0
            X.0McZ r0 = r0.LLJJI
            r1.LJJIFFI(r0)
            return
        La0:
            java.lang.Object r1 = r5.l0
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            X.C786410Ut5.LJLLLLLL(r0, r1)
            goto L8d
        Laa:
            r0 = 0
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS77S0200000_8.LIZ$1():void");
    }

    public final void LIZ$10() {
        Object c098200Yq;
        try {
            ((Function0) this.l0).invoke();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Function1 function1 = (Function1) this.l1;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20183113y9.LIZLLL("AsyncTaskExecutor", "Monitor task failed", thM5exceptionOrNullimpl);
            function1.invoke(thM5exceptionOrNullimpl);
        }
    }

    public final void LIZ$11() {
        int iDraftMigrateUnMigrateCount;
        C0M6J c0m6j = (C0M6J) this.l0;
        SmartImageView smartImageView = c0m6j.LLILZIL;
        C553680Lna c553680Lna = (C553680Lna) this.l1;
        c0m6j.getClass();
        AwemeDraft awemeDraft = c553680Lna.LIZIZ;
        if (awemeDraft != null && smartImageView != null) {
            ARunnableS41S0300000_8 aRunnableS41S0300000_8 = new ARunnableS41S0300000_8(smartImageView, awemeDraft, c0m6j, 9);
            IAVDraftService iAVDraftService = IAVDraftService.Companion.get();
            if (iAVDraftService == null || !iAVDraftService.enableDraftEntranceShowOpt()) {
                aRunnableS41S0300000_8.run();
            } else {
                C823050WQl.LIZJ().execute(aRunnableS41S0300000_8);
            }
        }
        TuxTextView tuxTextView = ((C0M6J) this.l0).LLILZLL;
        if (tuxTextView != null) {
            C553680Lna c553680Lna2 = (C553680Lna) this.l1;
            String string = tuxTextView.getContext().getResources().getString(2131847721);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string);
            sbLIZ.append(": ");
            sbLIZ.append(c553680Lna2.LIZ);
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        AVDraftMigrateService aVDraftMigrateServiceI5 = ((C0M6J) this.l0).I5();
        if (aVDraftMigrateServiceI5 == null || (iDraftMigrateUnMigrateCount = aVDraftMigrateServiceI5.draftMigrateUnMigrateCount()) == 0) {
            ((C0M6J) this.l0).N5(false);
            return;
        }
        TuxTextView tuxTextView2 = ((C0M6J) this.l0).LLIZ;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(tuxTextView2.getContext().getResources().getQuantityString(2131755410, iDraftMigrateUnMigrateCount, Integer.valueOf(iDraftMigrateUnMigrateCount)));
        }
        ((C0M6J) this.l0).N5(true);
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [X.0M5v] */
    public final void LIZ$12() {
        final boolean z;
        C562830M5p c562830M5p = (C562830M5p) this.l0;
        c562830M5p.LLJJJJLIIL = (C553680Lna) this.l1;
        ViewGroup viewGroup = c562830M5p.LLJILJIL;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
        final C562830M5p c562830M5p2 = (C562830M5p) this.l0;
        final C553680Lna c553680Lna = (C553680Lna) this.l1;
        final AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(c562830M5p2, 972);
        final int iIncrementAndGet = c562830M5p2.LLIZ.incrementAndGet();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bindVideoThumbnail: start cover bind seq=");
        sbLIZ.append(iIncrementAndGet);
        sbLIZ.append(", reset usedAIRemixVideoCover");
        C201955140j.LIZIZ("AbsDraftBoxViewHolder", C2188811AlT.LIZIZ(sbLIZ));
        c562830M5p2.LLIZLLLIL.LIZJ(false);
        c562830M5p2.LLILLJJLI.setController(null);
        Drawable drawable = c562830M5p2.LLJ;
        if (drawable != null) {
            z = true;
            c562830M5p2.LLILLJJLI.setImageDrawable(drawable);
            c562830M5p2.LLILLJJLI.setPlaceholderImage(c562830M5p2.LLJ);
        } else {
            z = false;
            c562830M5p2.LLILLJJLI.setImageDrawable(null);
        }
        final AwemeDraft awemeDraft = c553680Lna.LIZIZ;
        if (awemeDraft == null) {
            c562830M5p2.LLJ = null;
            c562830M5p2.LLILLJJLI.setPlaceholderImage((Drawable) null);
            c562830M5p2.LLILLJJLI.setImageDrawable(null);
        } else {
            final C557050Lt1 c557050Lt1 = new C557050Lt1(false);
            final ?? r8 = new Runnable() { // from class: X.0M5v
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r8v0, types: [X.0M6D, com.ss.android.ugc.aweme.services.effect.IEffectService$OnVideoCoverCallback] */
                @Override // java.lang.Runnable
                public final void run() {
                    final C0M6E c0m6e = c562830M5p2;
                    C557050Lt1 c557050Lt12 = c557050Lt1;
                    final int i = iIncrementAndGet;
                    final Function0 function0 = awS552S0100000_8;
                    final AwemeDraft awemeDraft2 = awemeDraft;
                    final boolean z2 = z;
                    c0m6e.getClass();
                    C1C7U.LIZ("AbsDraftBoxViewHolder@51fe.createLoadDraftCoverRunnable$1L");
                    if (!c557050Lt12.LIZ(false, true)) {
                        C1C7U.LIZIZ("AbsDraftBoxViewHolder@51fe.createLoadDraftCoverRunnable$1L");
                        return;
                    }
                    if (i != c0m6e.LLIZ.get()) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("bindVideoThumbnail: stale thumb cover task, skip. seq=");
                        sbLIZ2.append(i);
                        C201955140j.LIZIZ("AbsDraftBoxViewHolder", C2188811AlT.LIZIZ(sbLIZ2));
                        C1C7U.LIZIZ("AbsDraftBoxViewHolder@51fe.createLoadDraftCoverRunnable$1L");
                        return;
                    }
                    if (c0m6e.LLIZLLLIL.LIZIZ()) {
                        C1C7U.LIZIZ("AbsDraftBoxViewHolder@51fe.createLoadDraftCoverRunnable$1L");
                        return;
                    }
                    final IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi(IExternalService.class);
                    if (iExternalService == null) {
                        C1C7U.LIZIZ("AbsDraftBoxViewHolder@51fe.createLoadDraftCoverRunnable$1L");
                        return;
                    }
                    final VideoCoverConfig videoCoverConfig = C0C64.LJIILLIIL().LJIIIZ(31744, "personal_page_cover_resize_switch", true, false) ? new VideoCoverConfig(c0m6e.LLILLJJLI.getWidth(), c0m6e.LLILLJJLI.getHeight(), Bitmap.Config.ARGB_8888) : null;
                    final ?? r82 = new IEffectService.OnVideoCoverCallback() { // from class: X.0M6D
                        @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                        public final void onGetVideoCoverFailed(int i2) {
                            final C0M6E c0m6e2 = c0m6e;
                            AwemeDraft awemeDraft3 = awemeDraft2;
                            final SmartImageView smartImageView = c0m6e2.LLILLJJLI;
                            final int i3 = i;
                            final boolean z3 = z2;
                            final Function0 function02 = function0;
                            c0m6e2.getClass();
                            if (awemeDraft3 != null) {
                                ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().infoService().videoCover(awemeDraft3, new IAVInfoService.IGetInfoCallback() { // from class: X.0M6C
                                    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
                                    public final void finish(Object obj) {
                                        SafeHandler safeHandler;
                                        SafeHandler safeHandler2;
                                        final C0M6E c0m6e3 = c0m6e2;
                                        final int i4 = i3;
                                        final SmartImageView smartImageView2 = smartImageView;
                                        final Function0 function03 = function02;
                                        final boolean z4 = z3;
                                        Bitmap bitmap = (Bitmap) obj;
                                        if (i4 != c0m6e3.LLIZ.get()) {
                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                            sbLIZ3.append("bindVideoThumbnail: stale effect cover result, skip. seq=");
                                            sbLIZ3.append(i4);
                                            C201955140j.LIZIZ("AbsDraftBoxViewHolder", C2188811AlT.LIZIZ(sbLIZ3));
                                            return;
                                        }
                                        if (smartImageView2 != null && bitmap != null) {
                                            C0M6A c0m6a = new C0M6A(c0m6e3, i4, smartImageView2, bitmap, function03);
                                            IAVDraftService iAVDraftServiceLIZ = C0M6K.LIZ();
                                            if (iAVDraftServiceLIZ != null && iAVDraftServiceLIZ.enableDraftEntranceShowOpt() && (safeHandler2 = c0m6e3.LLILZLL) != null) {
                                                safeHandler2.post(c0m6a);
                                                return;
                                            } else {
                                                C0M66.LIZ(c0m6a);
                                                return;
                                            }
                                        }
                                        Runnable runnable = new Runnable() { // from class: X.0M69
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                C0M6E c0m6e4 = c0m6e3;
                                                int i5 = i4;
                                                boolean z5 = z4;
                                                SmartImageView smartImageView3 = smartImageView2;
                                                Function0 function04 = function03;
                                                c0m6e4.getClass();
                                                C1C7U.LIZ("AbsDraftBoxViewHolder@51fe.lambda$setCoverImage$4$1L");
                                                if (i5 != c0m6e4.LLIZ.get()) {
                                                    C1C7U.LIZIZ("AbsDraftBoxViewHolder@51fe.lambda$setCoverImage$4$1L");
                                                    return;
                                                }
                                                if (!z5 && smartImageView3 != null) {
                                                    c0m6e4.LLJ = null;
                                                    smartImageView3.setPlaceholderImage((Drawable) null);
                                                    smartImageView3.setImageDrawable(null);
                                                }
                                                if (function04 != null) {
                                                    function04.invoke();
                                                }
                                                C1C7U.LIZIZ("AbsDraftBoxViewHolder@51fe.lambda$setCoverImage$4$1L");
                                            }
                                        };
                                        IAVDraftService iAVDraftServiceLIZ2 = C0M6K.LIZ();
                                        if (iAVDraftServiceLIZ2 != null && iAVDraftServiceLIZ2.enableDraftEntranceShowOpt() && (safeHandler = c0m6e3.LLILZLL) != null) {
                                            safeHandler.post(runnable);
                                        } else {
                                            C0M66.LIZ(runnable);
                                        }
                                    }
                                });
                            }
                        }

                        @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                        public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                            SafeHandler safeHandler;
                            C0M6E c0m6e2 = c0m6e;
                            C0M6A c0m6a = new C0M6A(c0m6e2, i, c0m6e2.LLILLJJLI, bitmap, function0);
                            IAVDraftService iAVDraftServiceLIZ = C0M6K.LIZ();
                            if (iAVDraftServiceLIZ != null && iAVDraftServiceLIZ.enableDraftEntranceShowOpt() && (safeHandler = c0m6e2.LLILZLL) != null) {
                                safeHandler.post(c0m6a);
                            } else {
                                C0M66.LIZ(c0m6a);
                            }
                        }
                    };
                    if (C0C64.LJIILLIIL().LJIIIZ(31744, "draft_box_cover_load_anr_fix", true, true)) {
                        C0CNO.LIZ(C15O7.LJI, new Function0() { // from class: X.0M5x
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                IExternalService iExternalService2 = iExternalService;
                                iExternalService2.draftService().loadThumbCover(awemeDraft2, videoCoverConfig, r82);
                                return Unit.LIZ;
                            }
                        });
                    } else {
                        iExternalService.draftService().loadThumbCover(awemeDraft2, videoCoverConfig, r82);
                    }
                    C1C7U.LIZIZ("AbsDraftBoxViewHolder@51fe.createLoadDraftCoverRunnable$1L");
                }
            };
            C0CNO.LIZ(C15O7.LJI, new Function0() { // from class: X.0M5w
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    final C0M6E c0m6e = c562830M5p2;
                    C553680Lna c553680Lna2 = c553680Lna;
                    final int i = iIncrementAndGet;
                    final Function0 function0 = awS552S0100000_8;
                    final Runnable runnable = r8;
                    c0m6e.getClass();
                    C1C7U.LIZ("AbsDraftBoxViewHolder@51fe.bindVideoThumbnail$1L");
                    final AwemeDraft awemeDraft2 = c553680Lna2.LIZIZ;
                    if (awemeDraft2 == null) {
                        c0m6e.LLIZLLLIL.LIZJ(false);
                    } else {
                        CreativeToolsBizPluginService.LIZ.getClass();
                        CreativeToolsBizPluginService creativeToolsBizPluginServiceLIZ = C0LOV.LIZ();
                        if (creativeToolsBizPluginServiceLIZ == null || creativeToolsBizPluginServiceLIZ.LIZ()) {
                            IAIRemixService.LIZ.getClass();
                            final InterfaceC562800M5m interfaceC562800M5mLIZIZ = C563030M6j.LIZ().LIZIZ();
                            C23250099c.LIZLLL(C0M61.LIZ, null, null, new C562920M5y(interfaceC562800M5mLIZIZ, new C0M60() { // from class: X.0M62
                                @Override // X.C0M60
                                public final void LIZ(boolean z2) {
                                    C0M6E c0m6e2 = c0m6e;
                                    int i2 = i;
                                    Runnable runnable2 = runnable;
                                    InterfaceC562800M5m interfaceC562800M5m = interfaceC562800M5mLIZIZ;
                                    AwemeDraft awemeDraft3 = awemeDraft2;
                                    Function0 function02 = function0;
                                    c0m6e2.getClass();
                                    C1C7U.LIZ("AbsDraftBoxViewHolder@51fe.bindAIRemixVideoCoverAsync$1L");
                                    if (i2 != c0m6e2.LLIZ.get()) {
                                        C1C7U.LIZIZ("AbsDraftBoxViewHolder@51fe.bindAIRemixVideoCoverAsync$1L");
                                        return;
                                    }
                                    if (!z2) {
                                        c0m6e2.LLIZLLLIL.LIZJ(false);
                                        runnable2.run();
                                        C1C7U.LIZIZ("AbsDraftBoxViewHolder@51fe.bindAIRemixVideoCoverAsync$1L");
                                    } else {
                                        C23250099c.LIZLLL(C0M61.LIZ, null, null, new C0M63(interfaceC562800M5m, new C0M67(c0m6e2, i2, runnable2, awemeDraft3, function02), null), 3);
                                        C1C7U.LIZIZ("AbsDraftBoxViewHolder@51fe.bindAIRemixVideoCoverAsync$1L");
                                    }
                                }
                            }, null), 3);
                        } else {
                            c0m6e.LLIZLLLIL.LIZJ(false);
                            creativeToolsBizPluginServiceLIZ.LIZLLL("airemix_draft_box", false);
                            runnable.run();
                        }
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AbsDraftBoxViewHolder@51fe.bindVideoThumbnail$1L");
                    return unit;
                }
            });
            if (!z) {
                r8.run();
            }
        }
        C562830M5p c562830M5p3 = (C562830M5p) this.l0;
        C553680Lna c553680Lna2 = (C553680Lna) this.l1;
        if (c562830M5p3.LLJI != null) {
            String string = c562830M5p3.LLILZIL.getResources().getString(2131847721);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(string);
            sbLIZ2.append(": ");
            sbLIZ2.append(c553680Lna2.LIZ);
            c562830M5p3.LLJI.setText(C2188811AlT.LIZIZ(sbLIZ2));
            c562830M5p3.LLJJJJ = c553680Lna2.LIZ;
            long j = c553680Lna2.LJFF;
            c562830M5p3.LLJJJJJIL = j;
            if (j > 0) {
                c562830M5p3.LLJI.setTuxFont(62);
            }
        }
        ((C562830M5p) this.l0).S5((C553680Lna) this.l1);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = C562880M5u.LJFF;
        if (j2 != -1) {
            jCurrentTimeMillis = j2;
        }
        C562880M5u.LJFF = jCurrentTimeMillis;
        if (C562880M5u.LIZ) {
            return;
        }
        C562880M5u.LIZ = true;
        C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0M5t
            public static void LIZ() {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZLLL(C562880M5u.LIZJ - C562880M5u.LIZIZ, "duration_data_fetch_prepare");
                c2344009Gk.LIZLLL(C562880M5u.LIZLLL - C562880M5u.LIZJ, "duration_data_fetch");
                c2344009Gk.LIZLLL(C562880M5u.LJ - C562880M5u.LIZLLL, "duration_entrance_bind_part");
                c2344009Gk.LIZLLL(C562880M5u.LJFF - C562880M5u.LJ, "duration_entrance_bind_full");
                c2344009Gk.LIZLLL(C562880M5u.LJ - C562880M5u.LIZIZ, "duration_total_part");
                c2344009Gk.LIZLLL(C562880M5u.LJFF - C562880M5u.LIZIZ, "duration_total_full");
                C20684815ws.LJIILLIIL("draft_entrance_show_performance", c2344009Gk.LIZ);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("DraftEntranceShowPerformanceMobHelper@f7b2.mobDraftEntranceShow$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("DraftEntranceShowPerformanceMobHelper@f7b2.mobDraftEntranceShow$1");
            }
        });
    }

    public final void LIZ$13() {
        C553990Lo5 c553990Lo5;
        InterfaceC554250LoV toolTipOperator$tools_ai_uikit_df_release;
        C555080Lpq textConfig$tools_ai_uikit_df_release;
        Function1<MentionDataItem, String> function1;
        final String strInvoke;
        C553990Lo5 c553990Lo52 = ((C554270LoX) this.l0).LLJJJIL;
        if (c553990Lo52 != null && c553990Lo52.isFollowPathMode$tools_ai_uikit_df_release() && !((C554270LoX) this.l0).LLJJJJ) {
            List list = (List) this.l1;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((C554260LoW) it2.next()).LLILLL) {
                    }
                }
            }
            ((C554270LoX) this.l0).LLJJJJ = true;
            List list2 = (List) this.l1;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (!C549450Lgl.LIZIZ(((C554260LoW) obj).LL)) {
                    arrayList.add(obj);
                }
            }
            final C554270LoX c554270LoX = (C554270LoX) this.l0;
            List list3 = (List) this.l1;
            C554260LoW c554260LoW = (C554260LoW) C13LP.LJJJLL(arrayList);
            if (c554260LoW == null || (textConfig$tools_ai_uikit_df_release = c554270LoX.LLJJJIL.getTextConfig$tools_ai_uikit_df_release()) == null || (function1 = textConfig$tools_ai_uikit_df_release.LJIILL) == null || (strInvoke = function1.invoke(c554260LoW.LL)) == null) {
                return;
            }
            final int iIndexOf = list3.indexOf(c554260LoW);
            C547140Ld2 c547140Ld2 = C546820LcW.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("find no permission item: list ");
            sbLIZ.append(list3);
            sbLIZ.append(", \n itemIndex: ");
            sbLIZ.append(iIndexOf);
            sbLIZ.append(", \n item: ");
            sbLIZ.append(c554260LoW);
            c547140Ld2.LIZ("InputMentionListScene", C2188811AlT.LIZIZ(sbLIZ));
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLLLLLJIL = c554270LoX.LLLLLJIL();
            if (viewOnAttachStateChangeListenerC20604515jvLLLLLJIL != null) {
                HandlerHook.viewPostDelay(viewOnAttachStateChangeListenerC20604515jvLLLLLJIL, new Runnable() { // from class: X.0LoU
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
                        InterfaceC554250LoV toolTipOperator$tools_ai_uikit_df_release2;
                        C1C7U.LIZ("MentionListScene@9cb4.initObservers$2$1$3$1");
                        try {
                            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLLLLLJIL2 = c554270LoX.LLLLLJIL();
                            if (viewOnAttachStateChangeListenerC20604515jvLLLLLJIL2 != null && (viewHolderFindViewHolderForAdapterPosition = viewOnAttachStateChangeListenerC20604515jvLLLLLJIL2.findViewHolderForAdapterPosition(iIndexOf)) != null && (toolTipOperator$tools_ai_uikit_df_release2 = c554270LoX.LLJJJIL.getToolTipOperator$tools_ai_uikit_df_release()) != null) {
                                toolTipOperator$tools_ai_uikit_df_release2.LIZIZ(1100, viewHolderFindViewHolderForAdapterPosition.itemView, strInvoke);
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("MentionListScene@9cb4.initObservers$2$1$3$1");
                    }
                }, 300L);
                return;
            }
            return;
        }
        C554270LoX c554270LoX2 = (C554270LoX) this.l0;
        if (!c554270LoX2.LLJJJJ || (c553990Lo5 = c554270LoX2.LLJJJIL) == null || (toolTipOperator$tools_ai_uikit_df_release = c553990Lo5.getToolTipOperator$tools_ai_uikit_df_release()) == null) {
            return;
        }
        toolTipOperator$tools_ai_uikit_df_release.LIZ(1100);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$14() {
        /*
            r10 = this;
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment r0 = (com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.LLII()
            r9 = 0
            if (r0 == 0) goto Lb7
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r0.getLayoutManager()
        Lf:
            boolean r0 = r1 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r0 == 0) goto Lb4
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
        L15:
            r7 = 0
            if (r1 == 0) goto Lb1
            int r8 = r1.findLastCompletelyVisibleItemPosition()
        L1c:
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment r0 = (com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.LLII()
            if (r0 == 0) goto Lae
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r0.getLayoutManager()
        L2a:
            boolean r0 = r1 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r0 == 0) goto L34
            if (r1 == 0) goto L34
            android.view.View r9 = r1.findViewByPosition(r8)
        L34:
            r6 = 1
            if (r9 == 0) goto Lac
            r0 = 2
            int[] r0 = new int[r0]
            r9.getLocationOnScreen(r0)
            r5 = r0[r7]
            r4 = r0[r6]
            int r3 = r9.getWidth()
            int r3 = r3 + r5
            int r2 = r9.getHeight()
            int r2 = r2 + r4
            android.content.Context r0 = r9.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = r0.widthPixels
            int r0 = r0.heightPixels
            if (r5 < 0) goto Lac
            if (r4 < 0) goto Lac
            if (r3 > r1) goto Lac
            if (r2 > r0) goto Lac
            r1 = 1
        L64:
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment r0 = (com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment) r0
            X.0M2a r0 = r0.VR()
            int r0 = r0.getItemCount()
            int r0 = r0 - r6
            if (r8 != r0) goto L92
            if (r1 == 0) goto L92
            java.lang.Object r0 = r10.l1
            com.ss.android.ugc.aweme.tools.draft.draftbox.widgets.NoScrollBehavior r0 = (com.ss.android.ugc.aweme.tools.draft.draftbox.widgets.NoScrollBehavior) r0
            if (r0 == 0) goto L80
            r0.LIZ = r7
            r0.setTopAndBottomOffset(r7)
        L80:
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment r0 = (com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment) r0
            X.01GW r0 = r0.LLILLJJLI
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L91
            r0.requestLayout()
        L91:
            return
        L92:
            java.lang.Object r0 = r10.l1
            com.ss.android.ugc.aweme.tools.draft.draftbox.widgets.NoScrollBehavior r0 = (com.ss.android.ugc.aweme.tools.draft.draftbox.widgets.NoScrollBehavior) r0
            if (r0 == 0) goto L9a
            r0.LIZ = r6
        L9a:
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment r0 = (com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment) r0
            X.01GW r0 = r0.LLILLJJLI
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L91
            r0.requestLayout()
            return
        Lac:
            r1 = 0
            goto L64
        Lae:
            r1 = r9
            goto L2a
        Lb1:
            r8 = 0
            goto L1c
        Lb4:
            r1 = r9
            goto L15
        Lb7:
            r1 = r9
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS77S0200000_8.LIZ$14():void");
    }

    public final void LIZ$2() {
        InterfaceC1665500tRU<PortraitStyleItem> interfaceC1665500tRU;
        GridLayoutManager gridLayoutManager;
        C0MX0 c0mx0;
        RecyclerView.LayoutManager layoutManager = ((RecyclerView) this.l0).getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null && (c0mx0 = ((AIPortraitTabFragment) this.l1).LLJI) != null) {
            c0mx0.LLLIIIIL(gridLayoutManager);
        }
        AIPortraitTabViewModel aIPortraitTabViewModelPR = ((AIPortraitTabFragment) this.l1).PR();
        aIPortraitTabViewModelPR.LLILLJJLI.clear();
        Integer num = aIPortraitTabViewModelPR.LLILZLL;
        if (num != null) {
            aIPortraitTabViewModelPR.vQ2(num.intValue());
        }
        aIPortraitTabViewModelPR.LLILLL = false;
        aIPortraitTabViewModelPR.LLILZ = false;
        aIPortraitTabViewModelPR.LLILZIL = false;
        C569820MWm c569820MWm = (C569820MWm) aIPortraitTabViewModelPR.LLJIJIL.getValue();
        if (!c569820MWm.LIZLLL) {
            if (c569820MWm.LJII && c569820MWm.LIZIZ() != null) {
                aIPortraitTabViewModelPR.zQ2();
            } else if (c569820MWm.LIZIZ() == null) {
                aIPortraitTabViewModelPR.wQ2();
            }
        }
        if (c569820MWm.LIZLLL || c569820MWm.LIZIZ() == null || (interfaceC1665500tRU = c569820MWm.LIZJ) == null || !(!interfaceC1665500tRU.isEmpty())) {
            return;
        }
        aIPortraitTabViewModelPR.xQ2();
    }

    public final void LIZ$3() {
        Object c098200Yq;
        try {
            ViewModelProvider viewModelProviderLIZ = C0L3U.LIZ((C19EG) this.l1);
            c098200Yq = viewModelProviderLIZ != null ? (AutoCutProcessViewModel) viewModelProviderLIZ.get(AutoCutProcessViewModel.class) : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        AutoCutProcessViewModel autoCutProcessViewModel = (AutoCutProcessViewModel) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        if (autoCutProcessViewModel != null) {
            autoCutProcessViewModel.vQ2(((AutoCutModel) this.l0).templateList);
        }
        C201955140j.LJIILJJIL(C1398350mUb.LIZIZ, "AutoCutEditHelper#templateList_update: setTemplateList called in onRecommendMusicListSuccess, size=" + ((AutoCutModel) this.l0).templateList.size());
    }

    public final void LIZ$4() {
        int measuredWidth = ((TextView) this.l0).getMeasuredWidth();
        int iLJIIIIZZ = (C14KQ.LJIIIIZZ(((MvChoosePhotoScene) this.l1).getSceneContext()) - (measuredWidth * 2)) - ((int) C12ES.LIZJ(60.0f, ((MvChoosePhotoScene) this.l1).getSceneContext()));
        MvChoosePhotoScene mvChoosePhotoScene = (MvChoosePhotoScene) this.l1;
        TextView textView = mvChoosePhotoScene.titleTextView;
        if (textView != null) {
            textView.setMaxWidth((!mvChoosePhotoScene.choosePhotoConfig.LIZ || mvChoosePhotoScene.isEditorProReplace()) ? Math.max(measuredWidth, iLJIIIIZZ) : Math.min((int) C12ES.LIZJ(130.0f, ((MvChoosePhotoScene) this.l1).getSceneContext()), iLJIIIIZZ));
        }
        C786410Ut5.LLIL((TextView) this.l0, 8);
        ((TextView) this.l0).setTextSize(1, 17.0f);
    }

    public final void LIZ$5() {
        int iLJIIIIZZ;
        ImageView imageView = ((MvChoosePhotoScene) this.l0).backBtn;
        if (imageView != null) {
            Context context = (Context) this.l1;
            iLJIIIIZZ = (C14KQ.LJIIIIZZ(context) - (imageView.getMeasuredWidth() * 2)) - ((int) C12ES.LIZJ(60.0f, context));
        } else {
            iLJIIIIZZ = C14KQ.LJIIIIZZ((Context) this.l1) - ((int) C12ES.LIZJ(60.0f, (Context) this.l1));
        }
        MvChoosePhotoScene mvChoosePhotoScene = (MvChoosePhotoScene) this.l0;
        TextView textView = mvChoosePhotoScene.titleTextView;
        if (textView != null) {
            if (mvChoosePhotoScene.choosePhotoConfig.LIZ && !mvChoosePhotoScene.isEditorProReplace()) {
                iLJIIIIZZ = Math.min((int) C12ES.LIZJ(130.0f, (Context) this.l1), iLJIIIIZZ);
            }
            textView.setMaxWidth(iLJIIIIZZ);
        }
    }

    public final void LIZ$6() {
        ((PreviewVideoScene) this.l0).LLLI = new CountDownLatch(1);
        C527420KmK c527420KmK = C527420KmK.LIZ;
        TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) this.l1;
        CreativeInfo creativeInfo = ((PreviewVideoScene) this.l0).LLJZIJLIL;
        c527420KmK.getClass();
        MediaModel mediaModelLIZIZ = C527420KmK.LIZIZ(creativeInfo, tikTokMediaModel);
        if (mediaModelLIZIZ != null) {
            TikTokMediaModel tikTokMediaModel2 = (TikTokMediaModel) this.l1;
            LivePhotoInfo livePhotoInfo = tikTokMediaModel2.livePhotoInfo;
            if (livePhotoInfo != null) {
                livePhotoInfo.setVideoPath(mediaModelLIZIZ.LJFF());
                livePhotoInfo.setVideoDuration(mediaModelLIZIZ.duration);
            } else {
                tikTokMediaModel2.livePhotoInfo = new LivePhotoInfo(mediaModelLIZIZ.LJFF(), mediaModelLIZIZ.duration, "LIVE_PHOTO", false);
            }
            C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
            String str = ((PreviewVideoScene) this.l0).LLJJIJIIJIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("livePhoto=");
            sbLIZ.append(((TikTokMediaModel) this.l1).livePhotoInfo);
            C201955140j.LIZLLL(c533790Kwb, str, C2188811AlT.LIZIZ(sbLIZ));
        } else {
            C533790Kwb c533790Kwb2 = C533790Kwb.LIZIZ;
            String str2 = ((PreviewVideoScene) this.l0).LLJJIJIIJIL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("failed to extract live photo from ");
            sbLIZ2.append(((TikTokMediaModel) this.l1).LJFF());
            C537680L6w.LIZ(c533790Kwb2, str2, C2188811AlT.LIZIZ(sbLIZ2), null);
        }
        CountDownLatch countDownLatch = ((PreviewVideoScene) this.l0).LLLI;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$7() {
        /*
            r10 = this;
            java.lang.Object r6 = r10.l0
            android.app.Activity r6 = (android.app.Activity) r6
            java.lang.Object r5 = r10.l1
            android.content.Intent r5 = (android.content.Intent) r5
            com.ss.android.ugc.aweme.shortvideo.util.j r2 = X.C524780Ki4.LIZ
            java.lang.String r1 = "av_video_record_init"
            java.lang.String r0 = "startVideoRecordActivity"
            r2.step(r1, r0)
            Y.ARunnableS87S0000000_8 r1 = new Y.ARunnableS87S0000000_8
            r0 = 3
            r1.<init>(r0)
            java.util.concurrent.ExecutorService r0 = X.C2474509mp.LIZ
            r0.execute(r1)
            boolean r0 = X.C1688680u2s.LJIIJJI(r6, r5)
            r2 = 1
            if (r0 == 0) goto L48
            X.01GW r1 = X.C300050BpT.LIZ
            java.lang.Object r0 = r1.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == r2) goto L3e
            java.lang.Object r0 = r1.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 2
            if (r1 != r0) goto L48
        L3e:
            Y.AObjectS310S0200000_8 r1 = new Y.AObjectS310S0200000_8
            r0 = 4
            r1.<init>(r6, r5, r0)
            X.C1688680u2s.LJI(r6, r5, r1)
            return
        L48:
            boolean r0 = X.C1688680u2s.LJIILL(r5)
            if (r0 == 0) goto L60
            X.C2504709rh.LIZ()
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0MlZ r0 = r0.LJJJJJ()
            r0.preloadVESoAsync()
            lth.o.LJ()
            goto L3e
        L60:
            long r8 = java.lang.System.currentTimeMillis()
            X.1BoT r0 = X.C2216131BoR.LIZ()
            lth.o.LJFF(r0)
            r0 = -1
            java.lang.String r7 = "extra_wait_ve_load_duration"
            long r3 = r5.getLongExtra(r7, r0)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L3e
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r8
            r5.putExtra(r7, r0)
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS77S0200000_8.LIZ$7():void");
    }

    /* JADX WARN: Type inference failed for: r0v40, types: [REQUEST, X.0kbR] */
    /* JADX WARN: Type inference failed for: r0v43, types: [REQUEST, X.0kbR] */
    public final void LIZ$8() {
        Pair<Integer, Integer> pairLIZJ = C097U.LIZJ(((MediaModel) this.l0).LJFF());
        C0MFP c0mfp = (C0MFP) this.l1;
        Size size = new Size(((C0MFP) this.l1).LLLLLLL().getWidth(), ((C0MFP) this.l1).LLLLLLL().getHeight());
        Size size2 = new Size(pairLIZJ.getFirst().intValue(), pairLIZJ.getSecond().intValue());
        c0mfp.getClass();
        Size sizeLLLLLJIL = c0mfp.LLLLLJIL((size.getHeight() * 1.0f) / size.getWidth(), (size2.getHeight() * 1.0f) / size2.getWidth());
        ((C0MFP) this.l1).LLLLLILLIL = (sizeLLLLLJIL.getHeight() * 1.0f) / sizeLLLLLJIL.getWidth();
        SmartImageView smartImageViewLLLLLLJ = ((C0MFP) this.l1).LLLLLLJ();
        C0ID9 c0id9 = new C0ID9(12);
        smartImageViewLLLLLLJ.setAspectRatio((sizeLLLLLJIL.getWidth() * 1.0f) / sizeLLLLLJIL.getHeight());
        smartImageViewLLLLLLJ.setOutlineProvider(c0id9);
        smartImageViewLLLLLLJ.setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) smartImageViewLLLLLLJ.getLayoutParams();
        marginLayoutParams.width = sizeLLLLLJIL.getWidth();
        marginLayoutParams.height = sizeLLLLLJIL.getHeight();
        C786410Ut5.G6(smartImageViewLLLLLLJ, marginLayoutParams);
        SmartImageView smartImageViewLLLLLLJ2 = ((C0MFP) this.l1).LLLLLLJ();
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        MediaModel mediaModel = (MediaModel) this.l0;
        C0MFP c0mfp2 = (C0MFP) this.l1;
        Uri uriLJIILJJIL = C2471909mP.LJIILJJIL(mediaModel.LJFF());
        boolean zLJFF = Intrinsics.LJFF(mediaModel.mimeType, "image/heic");
        final int iLIZLLL = zLJFF ? C2477909nN.LIZLLL(mediaModel.LJFF()) : 0;
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uriLJIILJJIL);
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
        c1325700kbQLIZLLL.LJFF = new C1329360khK(imageDecodeOptionsBuilder);
        c1325700kbQLIZLLL.LIZJ = new C1324630kZh(sizeLLLLLJIL.getWidth(), sizeLLLLLJIL.getHeight());
        if (zLJFF) {
            c1325700kbQLIZLLL.LJIILJJIL = false;
            c1325700kbQLIZLLL.LJIILLIIL = false;
        }
        c1320810kTXLIZJ.LJ = c1325700kbQLIZLLL.LIZ();
        C1325700kbQ c1325700kbQLIZLLL2 = C1325700kbQ.LIZLLL(uriLJIILJJIL);
        if (iLIZLLL != 0) {
            c1325700kbQLIZLLL2.LJIILIIL = new AbstractC1291220jho() { // from class: X.0jhU
                @Override // X.AbstractC1291220jho, X.InterfaceC1291910jiv
                public final C1323050kX9<Bitmap> process(Bitmap bitmap, AbstractC1301670jyf abstractC1301670jyf) {
                    if (bitmap != null && abstractC1301670jyf != null) {
                        Matrix matrix = new Matrix();
                        matrix.setRotate(iLIZLLL);
                        C1323050kX9 c1323050kX9LIZLLL = abstractC1301670jyf.LIZLLL(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix);
                        try {
                            C1323050kX9<Bitmap> c1323050kX9LJFF = C1323050kX9.LJFF(c1323050kX9LIZLLL);
                            if (c1323050kX9LJFF != null) {
                                C1323050kX9.LJII(c1323050kX9LIZLLL);
                                return c1323050kX9LJFF;
                            }
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C1323050kX9.LJII(c1323050kX9LIZLLL);
                            throw th;
                        }
                    }
                    return super.process(bitmap, abstractC1301670jyf);
                }
            };
        }
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder2 = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder2.setBitmapConfig(imageDecodeOptionsBuilder2.LJII);
        c1325700kbQLIZLLL2.LJFF = new C1329360khK(imageDecodeOptionsBuilder2);
        c1320810kTXLIZJ.LIZLLL = c1325700kbQLIZLLL2.LIZ();
        c1320810kTXLIZJ.LJIILJJIL = c0mfp2.LLLLLLJ().getController();
        smartImageViewLLLLLLJ2.setController(c1320810kTXLIZJ.LIZ());
    }

    public final void LIZ$9() {
        Editable editableLLLZIL;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Layout layout = ((C565430MFp) this.l0).getLayout();
        if (layout == null || (editableLLLZIL = C2204961BRm.LLLZIL((C565430MFp) this.l0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOuhdpbF1SbwsUxMXXUeowuwWHRLEUQJ7nth+wOGTW3757vAAtVTxsme0w==", null))) == null) {
            return;
        }
        int compoundPaddingTop = ((C565430MFp) this.l0).getCompoundPaddingTop();
        int compoundPaddingBottom = ((C565430MFp) this.l0).getCompoundPaddingBottom();
        int iLIZIZ = C814420VxA.LIZIZ((((C565430MFp) this.l0).getLineHeight() * ((C565400MFm) this.l1).LLJJL) + compoundPaddingTop + compoundPaddingBottom);
        int lineCount = layout.getLineCount();
        boolean z = true;
        if (lineCount < 1) {
            lineCount = 1;
        }
        boolean z2 = (layout.getLineTop(lineCount) + compoundPaddingTop) + compoundPaddingBottom >= iLIZIZ;
        Object[] spans = editableLLLZIL.getSpans(0, editableLLLZIL.length(), C1325340kaq.class);
        int length = spans.length;
        int i = 0;
        while (true) {
            if (i < length) {
                int spanStart = editableLLLZIL.getSpanStart(spans[i]);
                if (spanStart >= 0 && layout.getLineForOffset(spanStart) == 0) {
                    break;
                } else {
                    i++;
                }
            } else {
                z = false;
                break;
            }
        }
        int iLIZIZ2 = (((C565400MFm) this.l1).LLLLILI().LIZ.LJIJI && z2) ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)) : z ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        ViewGroup.LayoutParams layoutParams = ((C565430MFp) this.l0).getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null || marginLayoutParams.topMargin == iLIZIZ2) {
            return;
        }
        marginLayoutParams.topMargin = iLIZIZ2;
        C565430MFp c565430MFp = (C565430MFp) this.l0;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c565430MFp);
        c565430MFp.setLayoutParams(marginLayoutParams);
    }

    public static final void run$0(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("MvNetDialog@19.dismissDialog$1");
        try {
            if (!C20622515mp.LJIILIIL(((C0MPG) aRunnableS77S0200000_8.l0).LLIZLLLIL)) {
                C0MPG c0mpg = (C0MPG) aRunnableS77S0200000_8.l0;
                c0mpg.dismiss();
                C785410UrT.LIZ(c0mpg);
                ((Function0) aRunnableS77S0200000_8.l1).invoke();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MvNetDialog@19.dismissDialog$1");
    }

    public static final void run$1(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("AutoCutAlbumHelper@9720.startAutoCut$2$onRecommendMusicListSuccess$2");
        try {
            aRunnableS77S0200000_8.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AutoCutAlbumHelper@9720.startAutoCut$2$onRecommendMusicListSuccess$2");
    }

    public static final void run$10(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("MvChoosePhotoScene@c985.initView$11");
        try {
            aRunnableS77S0200000_8.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MvChoosePhotoScene@c985.initView$11");
    }

    public static final void run$11(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        View view = (View) aRunnableS77S0200000_8.l0;
        View view2 = (View) aRunnableS77S0200000_8.l1;
        C1C7U.LIZ("AVMediaChooseBaseFragment@6534.maybeAdjustNoPermissionButtonHeight$1L");
        if (view != null && view2 != null) {
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            Rect rect2 = new Rect();
            view2.getGlobalVisibleRect(rect2);
            if (rect.intersect(rect2)) {
                C426750GoL.LJII(view, null, 36, null, null, true);
            }
        }
        C1C7U.LIZIZ("AVMediaChooseBaseFragment@6534.maybeAdjustNoPermissionButtonHeight$1L");
    }

    public static final void run$12(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("MvChoosePhotoScene@c985.refreshTabIndicatorIfLightRecordTab$1");
        try {
            C1846060y8i.LJIJI((C1846060y8i) aRunnableS77S0200000_8.l0, (ViewPager) aRunnableS77S0200000_8.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MvChoosePhotoScene@c985.refreshTabIndicatorIfLightRecordTab$1");
    }

    public static final void run$13(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("PreviewVideoScene@5654.setMediaModel$1");
        try {
            aRunnableS77S0200000_8.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreviewVideoScene@5654.setMediaModel$1");
    }

    public static final void run$14(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("EditCaptionScene@d05b.showLoading$1$1");
        try {
            EditCaptionScene editCaptionScene = (EditCaptionScene) aRunnableS77S0200000_8.l0;
            TextView textView = editCaptionScene.LLLLJ;
            if (textView == null) {
                textView = null;
            }
            textView.setText(editCaptionScene.getResources().getString(2131826902, (Integer) aRunnableS77S0200000_8.l1));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditCaptionScene@d05b.showLoading$1$1");
    }

    public static final void run$15(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("VideoRecordPermissionActivity@14a8.lambda$startVideoRecordActivity$8$1");
        try {
            VideoRecordPermissionActivity videoRecordPermissionActivity = (VideoRecordPermissionActivity) aRunnableS77S0200000_8.l1;
            C1688680u2s.LJIIIZ(videoRecordPermissionActivity, videoRecordPermissionActivity.getIntent(), (List) aRunnableS77S0200000_8.l0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoRecordPermissionActivity@14a8.lambda$startVideoRecordActivity$8$1");
    }

    public static final void run$16(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        Activity activity = (Activity) aRunnableS77S0200000_8.l0;
        Intent intent = (Intent) aRunnableS77S0200000_8.l1;
        C1C7U.LIZ("AVToolsHelper@51fc.goRecordActivity$1L");
        C1660680tJi.LIZ().LJIILLIIL(activity, intent);
        C1C7U.LIZIZ("AVToolsHelper@51fc.goRecordActivity$1L");
    }

    public static final void run$17(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        Activity activity = (Activity) aRunnableS77S0200000_8.l0;
        Intent intent = (Intent) aRunnableS77S0200000_8.l1;
        C1C7U.LIZ("AVToolsHelper@51fc.goRecordActivity$2L");
        C1660680tJi.LIZ().LJIILLIIL(activity, intent);
        C1C7U.LIZIZ("AVToolsHelper@51fc.goRecordActivity$2L");
    }

    public static final void run$18(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("AVToolsHelper@51fc.startRecordActivity2SkipPermissionActivity$1");
        try {
            aRunnableS77S0200000_8.LIZ$7();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AVToolsHelper@51fc.startRecordActivity2SkipPermissionActivity$1");
    }

    public static final void run$19(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("TextToImageEditContainerScene@c934.onActivityCreated$2$1");
        try {
            if (((C571970Mbz) aRunnableS77S0200000_8.l0).LIZ) {
                ((C572260McS) aRunnableS77S0200000_8.l1).LLLIZZ();
            } else {
                ((C572260McS) aRunnableS77S0200000_8.l1).LLLIILIL();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TextToImageEditContainerScene@c934.onActivityCreated$2$1");
    }

    public static final void run$2(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("MentionEditGroupScene@d123.onViewCreated$1");
        try {
            if (((View) aRunnableS77S0200000_8.l0).getParent() != null) {
                ((C557410Ltb) aRunnableS77S0200000_8.l1).LLLLILI();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MentionEditGroupScene@d123.onViewCreated$1");
    }

    public static final void run$20(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        NewDraftViewHolder newDraftViewHolder;
        C1C7U.LIZ("NewDraftViewHolder$BindAwemeDraftRunnable@816.run$1");
        try {
            C0M39 c0m39 = (C0M39) aRunnableS77S0200000_8.l0;
            if (!c0m39.LLILZ && (newDraftViewHolder = c0m39.LLILLL.get()) != null) {
                newDraftViewHolder.N5((AwemeDraft) aRunnableS77S0200000_8.l1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NewDraftViewHolder$BindAwemeDraftRunnable@816.run$1");
    }

    public static final void run$21(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("AILivePhotoPromptV2Scene@d033.updatePreview$1");
        try {
            aRunnableS77S0200000_8.LIZ$8();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AILivePhotoPromptV2Scene@d033.updatePreview$1");
    }

    public static final void run$22(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("RecallLocalMediaAuthPreviewScene@b442.adjustAuthCardLayout$1");
        try {
            if (((View) aRunnableS77S0200000_8.l0).getParent() != null) {
                ((C0MR9) aRunnableS77S0200000_8.l1).LLLLILI();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RecallLocalMediaAuthPreviewScene@b442.adjustAuthCardLayout$1");
    }

    public static final void run$23(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("RecordStickerLogicComponent@6428.effectDownloadListener$1$onDownloadProgress$1");
        try {
            ((l0) aRunnableS77S0200000_8.l0).k.setValue((Effect) aRunnableS77S0200000_8.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RecordStickerLogicComponent@6428.effectDownloadListener$1$onDownloadProgress$1");
    }

    public static final void run$24(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("InputBoxScene@fda4.requestUpdateEditTextTopMarginForFirstLineImage$1");
        try {
            aRunnableS77S0200000_8.LIZ$9();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InputBoxScene@fda4.requestUpdateEditTextTopMarginForFirstLineImage$1");
    }

    public static final void run$25(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("InputBoxScene@fda4.showSoftInput$1");
        try {
            C565400MFm.LLLLZ((C565400MFm) aRunnableS77S0200000_8.l1, (C565430MFp) aRunnableS77S0200000_8.l0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InputBoxScene@fda4.showSoftInput$1");
    }

    public static final void run$26(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        int length;
        C1C7U.LIZ("InputBoxScene@fda4.initObservers$22$1");
        try {
            ((C565430MFp) aRunnableS77S0200000_8.l0).requestFocus();
            C565430MFp c565430MFp = (C565430MFp) aRunnableS77S0200000_8.l0;
            Editable editableLLLZIL = C2204961BRm.LLLZIL(c565430MFp, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOuhdpbF1SbwsUxMXXUeowuwWHRLEUQJ7nth+wOGTW3757vAAtVTxsme0w==", null));
            if (editableLLLZIL != null) {
                length = editableLLLZIL.length();
            } else {
                length = 0;
            }
            c565430MFp.setSelection(length);
            ((C565400MFm) aRunnableS77S0200000_8.l1).LLLLLZL(true);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InputBoxScene@fda4.initObservers$22$1");
    }

    public static final void run$27(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("AsyncTaskExecutor@1f25.executeAsync$2");
        try {
            aRunnableS77S0200000_8.LIZ$10();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AsyncTaskExecutor@1f25.executeAsync$2");
    }

    public static final void run$28(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("AIPlaygroundBaseScene@969a.showErrorToastIfNeed$2");
        try {
            C384040F3y c384040F3y = C384040F3y.LIZ;
            View view = (View) aRunnableS77S0200000_8.l0;
            C377760ErW c377760ErW = (C377760ErW) aRunnableS77S0200000_8.l1;
            c384040F3y.getClass();
            if (c377760ErW != null) {
                String strLIZ = C384040F3y.LIZ(view.getContext(), c377760ErW);
                C1389890mGx c1389890mGx = new C1389890mGx(view);
                c1389890mGx.LIZLLL(8000L);
                c1389890mGx.LJIIJ(strLIZ);
                c1389890mGx.LIZ.LIZ.LJFF = false;
                c1389890mGx.LJIIJJI();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AIPlaygroundBaseScene@969a.showErrorToastIfNeed$2");
    }

    public static final void run$29(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("LayoutRenderGlobal@31d.loadResourcesMeta$2");
        try {
            ((C0MSO) aRunnableS77S0200000_8.l0).LIZIZ((C0MSN) aRunnableS77S0200000_8.l1, false);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LayoutRenderGlobal@31d.loadResourcesMeta$2");
    }

    public static final void run$3(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreText2ImageComponent@277e.onViewCreated$1");
        try {
            aRunnableS77S0200000_8.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreText2ImageComponent@277e.onViewCreated$1");
    }

    public static final void run$30(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("VideoTermsView@c142.initView$6$onGlobalLayout$2");
        try {
            ((LinearLayout) aRunnableS77S0200000_8.l0).requestLayout();
            ((C21578619ce) aRunnableS77S0200000_8.l1).requestLayout();
            ((C21578619ce) aRunnableS77S0200000_8.l1).setScrollY(0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoTermsView@c142.initView$6$onGlobalLayout$2");
    }

    public static final void run$31(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("OnThisDayStickerHelper@fc53.animateStickersToRemove$1$1");
        try {
            C786410Ut5.LJJJZ((View) aRunnableS77S0200000_8.l1, ((C576250Mit) aRunnableS77S0200000_8.l0).LLJILJILJ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OnThisDayStickerHelper@fc53.animateStickersToRemove$1$1");
    }

    public static final void run$32(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("M2MigrationHasDraftViewHolder@2bb8.bind$1");
        try {
            aRunnableS77S0200000_8.LIZ$11();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("M2MigrationHasDraftViewHolder@2bb8.bind$1");
    }

    public static final void run$33(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("DraftBoxTidyViewHolder@e9d6.bind$1");
        try {
            aRunnableS77S0200000_8.LIZ$12();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DraftBoxTidyViewHolder@e9d6.bind$1");
    }

    public static final void run$34(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("MentionListScene@9cb4.initObservers$2$1");
        try {
            aRunnableS77S0200000_8.LIZ$13();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MentionListScene@9cb4.initObservers$2$1");
    }

    public static final void run$35(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("OnThisDayPhotoMvChosenResultImpl@f2ca.showNetworkError$1$1");
        try {
            ((C0L3H) aRunnableS77S0200000_8.l0).LIZJ();
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.message(((Activity) aRunnableS77S0200000_8.l1).getString(2131837956));
            creativeToastBuilder.duration(3000L);
            ((C1390360mHi) C1390390mHl.LIZ.createToast((Activity) aRunnableS77S0200000_8.l1, 6016, creativeToastBuilder)).show();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OnThisDayPhotoMvChosenResultImpl@f2ca.showNetworkError$1$1");
    }

    public static final void run$36(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        C571470MbB c571470MbB = (C571470MbB) aRunnableS77S0200000_8.l0;
        Intent intent = (Intent) aRunnableS77S0200000_8.l1;
        c571470MbB.getClass();
        C201955140j.LJII(C0MAY.LIZIZ, "DraftEditHelper NLEDraftBuilder fetch audio enhance model failed");
        c571470MbB.LIZ(intent);
    }

    public static final void run$37(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("SAALauncher@a6aa.launchPageInSAAActivityInternal$pushScene$1$dispatchEnterAnimEnd$1");
        try {
            ((AbstractC214814194y) aRunnableS77S0200000_8.l0).onEnterAnimationComplete();
            if (((AbstractC214814194y) aRunnableS77S0200000_8.l0).getChangeTranslucentOnAnimEnd() && ((NavigationScene) aRunnableS77S0200000_8.l1).LLLLLIL((AbstractC214814194y) aRunnableS77S0200000_8.l0)) {
                ((NavigationScene) aRunnableS77S0200000_8.l1).LLLILZ((AbstractC214814194y) aRunnableS77S0200000_8.l0, EnumC569750MWf.FROM_TRANSLUCENT);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SAALauncher@a6aa.launchPageInSAAActivityInternal$pushScene$1$dispatchEnterAnimEnd$1");
    }

    public static final void run$38(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("OnThisDayCutOptimizedVideoChosenHandler@95f4.showNetworkError$1$1");
        try {
            ((C0L3D) aRunnableS77S0200000_8.l0).LJIIJJI();
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.message(((Activity) aRunnableS77S0200000_8.l1).getString(2131837956));
            creativeToastBuilder.duration(3000L);
            ((C1390360mHi) C1390390mHl.LIZ.createToast((Activity) aRunnableS77S0200000_8.l1, 6016, creativeToastBuilder)).show();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OnThisDayCutOptimizedVideoChosenHandler@95f4.showNetworkError$1$1");
    }

    public static final void run$39(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("DraftBoxFragment@80e.updateScrollable$1$1");
        try {
            aRunnableS77S0200000_8.LIZ$14();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DraftBoxFragment@80e.updateScrollable$1$1");
    }

    public static final void run$4(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("ImageVideoSeparateModeSwitchComponent@6927.switchMode$2");
        try {
            ((C578250Mm7) aRunnableS77S0200000_8.l0).B3((C578340MmG) aRunnableS77S0200000_8.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImageVideoSeparateModeSwitchComponent@6927.switchMode$2");
    }

    public static final void run$40(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C197039127h c197039127h;
        C1C7U.LIZ("CheckPointRestorePushView@f62c.<init>$3$1");
        try {
            if (C0MV8.LIZ() && (c197039127h = ((C0MVC) aRunnableS77S0200000_8.l0).LLILZIL) != null) {
                c197039127h.setTextSize(0, ((C197039127h) aRunnableS77S0200000_8.l1).getTextSize());
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CheckPointRestorePushView@f62c.<init>$3$1");
    }

    public static final void run$41(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("CheckPointServiceImpl@1176.cancelRestoreWithCallbackInternal$1");
        try {
            RecordScene recordScene = (RecordScene) aRunnableS77S0200000_8.l0;
            if (recordScene != null) {
                C0MVS.LIZ(C0MVS.LIZIZ(recordScene.creativeInfo));
                C1443030nef c1443030nefLJII = C1443030nef.LJII();
                RecordScene recordScene2 = (RecordScene) aRunnableS77S0200000_8.l0;
                c1443030nefLJII.getClass();
                C1443030nef.LJIIJ(recordScene2);
                C1439190nYT.LIZJ();
                Function0 function0 = (Function0) aRunnableS77S0200000_8.l1;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CheckPointServiceImpl@1176.cancelRestoreWithCallbackInternal$1");
    }

    public static final void run$42(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        long jLongValue;
        String string;
        C1C7U.LIZ("DraftBoxFreeUpComponent@84c7.updateDraftText$1$1");
        try {
            long j = ((C0M12) aRunnableS77S0200000_8.l0).LIZJ;
            Long l = (Long) aRunnableS77S0200000_8.l1;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            String strLIZ = C0M1F.LIZ(j - jLongValue);
            TuxTextView tuxTextView = ((C0M12) aRunnableS77S0200000_8.l0).LIZIZ;
            if (tuxTextView != null) {
                Resources resources = tuxTextView.getResources();
                if (resources != null) {
                    string = resources.getString(2131821840, strLIZ);
                } else {
                    string = null;
                }
                tuxTextView.setText(string);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DraftBoxFreeUpComponent@84c7.updateDraftText$1$1");
    }

    public static final void run$5(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("AIPortraitTabFragment@e881.onResume$1$1");
        try {
            aRunnableS77S0200000_8.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AIPortraitTabFragment@e881.onResume$1$1");
    }

    public static final void run$6(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("AutoCutEditHelper@aa47.getAutoCutProgressListener$listener$1$onRecommendMusicListSuccess$2$1");
        try {
            aRunnableS77S0200000_8.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AutoCutEditHelper@aa47.getAutoCutProgressListener$listener$1$onRecommendMusicListSuccess$2$1");
    }

    public static final void run$7(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("ScanFaceEffectComponent@ddfc.reloadScanFaceEffect$1$1");
        try {
            ((C0MIK) aRunnableS77S0200000_8.l0).LIZ.LIZIZ((Effect) aRunnableS77S0200000_8.l1, true);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ScanFaceEffectComponent@ddfc.reloadScanFaceEffect$1$1");
    }

    public static final void run$8(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("ChooseMediaViewModel@1996.setStateFix$1");
        try {
            ((ChooseMediaViewModel) aRunnableS77S0200000_8.l0).setStateImmediate((Function1) aRunnableS77S0200000_8.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ChooseMediaViewModel@1996.setStateFix$1");
    }

    public static final void run$9(ARunnableS77S0200000_8 aRunnableS77S0200000_8) {
        boolean zLIZ;
        C1C7U.LIZ("MvChoosePhotoScene@c985.changeTextWidth$1$1");
        try {
            aRunnableS77S0200000_8.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MvChoosePhotoScene@c985.changeTextWidth$1$1");
    }

    public ARunnableS77S0200000_8(Activity activity, Intent intent, int i) {
        this.$t = i;
        switch (i) {
            case 16:
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                this.l0 = activity;
                this.l1 = intent;
                break;
            default:
                this.l0 = activity;
                this.l1 = intent;
                break;
        }
    }

    public ARunnableS77S0200000_8(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public ARunnableS77S0200000_8(int i, C553680Lna c553680Lna, C562830M5p c562830M5p, int i2) {
        this.$t = i2;
        this.l0 = c562830M5p;
        this.l1 = c553680Lna;
    }

    public ARunnableS77S0200000_8(C0M6J c0m6j, C553680Lna c553680Lna, int i, int i2) {
        this.$t = i2;
        this.l0 = c0m6j;
        this.l1 = c553680Lna;
    }

    public ARunnableS77S0200000_8(C571470MbB c571470MbB, Context context, Intent intent, int i) {
        this.$t = i;
        this.l0 = c571470MbB;
        this.l1 = intent;
    }

    public ARunnableS77S0200000_8(C1417080myo c1417080myo, AutoCutModel autoCutModel, C19EG c19eg, int i) {
        this.$t = i;
        this.l0 = autoCutModel;
        this.l1 = c19eg;
    }

    public ARunnableS77S0200000_8(C1417100myq c1417100myq, AutoCutModel autoCutModel, C19EG c19eg, int i) {
        this.$t = i;
        this.l0 = autoCutModel;
        this.l1 = c19eg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS77S0200000_8(C20184713yP c20184713yP, C20184713yP c20184713yP2, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        this.$t = function1;
        this.l0 = c20184713yP2;
        this.l1 = function0;
    }
}
