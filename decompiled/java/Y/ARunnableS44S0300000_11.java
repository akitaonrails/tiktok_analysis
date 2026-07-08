package Y;

import X.AbstractC468201s0;
import X.AnonymousClass1916;
import X.C013C;
import X.C0R52;
import X.C0RF0;
import X.C0RTH;
import X.C0SQR;
import X.C0STV;
import X.C0STW;
import X.C1022620cia;
import X.C1317740kOa;
import X.C1324840ka2;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1365840leA;
import X.C1365870leD;
import X.C1578630rBN;
import X.C16F4;
import X.C19EG;
import X.C1C7U;
import X.C20673215v0;
import X.C21415018rM;
import X.C2188811AlT;
import X.C259800zU;
import X.C698250RaB;
import X.C698280RaE;
import X.C698770Rb1;
import X.C699060RbU;
import X.C699100RbY;
import X.C708460Rqe;
import X.C731940SnQ;
import X.C733530Spz;
import X.C738490Sxz;
import X.C738500Sy0;
import X.C786410Ut5;
import X.C799570VYd;
import X.EnumC1334360kpO;
import X.InterfaceC1320380kSq;
import X.ViewTreeObserverOnGlobalLayoutListenerC1775930wJb;
import X.ViewTreeObserverOnGlobalLayoutListenerC1775950wJd;
import X.ViewTreeObserverOnPreDrawListenerC1756060vnY;
import X.ViewTreeObserverOnPreDrawListenerC1756070vnZ;
import Y.ARunnableS44S0300000_11;
import Y.ARunnableS80S0200000_11;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.feed.AdDescAreaReplaceServiceImpl;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.ui.bottom.banner.FeedBottomBannerView;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.DescAreaInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.ui.fragment.PostModeDetailRootFragment;
import com.ss.android.ugc.aweme.video.hashtag.feedback.KeyboardStateViewModel;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS590S0100000_11;
import p5a.a;

/* JADX INFO: loaded from: classes12.dex */
public class ARunnableS44S0300000_11 implements Runnable {
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instruction units count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS44S0300000_11.LIZ$0():void");
    }

    public final void LIZ$1() {
        C0RF0 c0rf0;
        Fragment fragment;
        C19EG activity;
        if (C1578630rBN.LJIIIZ((InteractBottomBannerAssem) this.l0) || (c0rf0 = ((InteractBottomBannerAssem) this.l0).jm().LIZLLL) == null || (fragment = c0rf0.LIZJ) == null || (activity = fragment.getActivity()) == null || ((InteractBottomBannerAssem) this.l0).Gp()) {
            return;
        }
        C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new ARunnableS44S0300000_11((FeedBottomBannerConfig) this.l2, (InteractBottomBannerAssem) this.l0, C20673215v0.LIZJ(((Integer) this.l1).intValue(), activity), 8));
    }

    public final void LIZ$2() {
        if (((C698250RaB) this.l0).LIZLLL) {
            return;
        }
        C698280RaE c698280RaE = ((C698250RaB) this.l0).LJ;
        C698280RaE c698280RaE2 = (C698280RaE) this.l1;
        if (c698280RaE == c698280RaE2 && ((C698250RaB) this.l0).LIZ.invoke(Long.valueOf(c698280RaE2.LIZIZ), ((C698280RaE) this.l1).LIZ).booleanValue()) {
            ((Function1) this.l2).invoke((C698280RaE) this.l1);
        }
    }

    public final void LIZ$3() {
        if (((C698250RaB) this.l0).LIZLLL) {
            return;
        }
        C698770Rb1 c698770Rb1 = ((C698250RaB) this.l0).LJFF;
        C698770Rb1 c698770Rb12 = (C698770Rb1) this.l1;
        if (c698770Rb1 == c698770Rb12 && ((C698250RaB) this.l0).LIZ.invoke(Long.valueOf(c698770Rb12.LIZIZ), ((C698770Rb1) this.l1).LIZ).booleanValue()) {
            ((Function1) this.l2).invoke((C698770Rb1) this.l1);
        }
    }

    public final void LIZ$4() {
        try {
            ((C731940SnQ) this.l0).setImageDrawable(((VideoDiggAssem) this.l1).LLLFZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid like effect drawable for aid: ");
            sbLIZ.append(((VideoItemParams) this.l2).getAweme().getAid());
            C1022620cia.LIZIZ("VideoDiggAssem", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LIZ$5() {
        PostModeDetailRootFragment postModeDetailRootFragment;
        AnonymousClass1916 anonymousClass1916;
        C013C c013c = (C013C) this.l0;
        if (c013c.element) {
            return;
        }
        c013c.element = true;
        C0SQR c0sqr = (C0SQR) this.l1;
        c0sqr.LLIZLLLIL = true;
        MutableLiveData<Boolean> mutableLiveData = c0sqr.LL.LJIIIIZZ.LLJZ;
        T t = ((C259800zU) this.l2).element;
        mutableLiveData.removeObserver(t != 0 ? (Observer) t : null);
        C0SQR c0sqr2 = (C0SQR) this.l1;
        SAFTikTokFragment sAFTikTokFragmentLJIILLIIL = c0sqr2.LL.LJIILLIIL();
        if (!(sAFTikTokFragmentLJIILLIIL instanceof PostModeDetailRootFragment) || (postModeDetailRootFragment = (PostModeDetailRootFragment) sAFTikTokFragmentLJIILLIIL) == null || (anonymousClass1916 = postModeDetailRootFragment.LLJJJJLIIL) == null) {
            c0sqr2.LL.LIZIZ.startPostponedEnterTransition();
        } else {
            anonymousClass1916.LJIILIIL(true);
        }
    }

    public final void LIZ$6() {
        Context context;
        final AdDescAreaReplaceServiceImpl adDescAreaReplaceServiceImpl = (AdDescAreaReplaceServiceImpl) this.l0;
        DescAreaInfo descAreaInfo = (DescAreaInfo) this.l1;
        final Function0<Unit> function0 = (Function0) this.l2;
        adDescAreaReplaceServiceImpl.getClass();
        String str = descAreaInfo.icon;
        if (str == null || str.length() == 0) {
            adDescAreaReplaceServiceImpl.LJFF = null;
            adDescAreaReplaceServiceImpl.LJII(function0);
            return;
        }
        C21415018rM c21415018rM = adDescAreaReplaceServiceImpl.LIZLLL;
        if (c21415018rM == null || (context = c21415018rM.getContext()) == null) {
            return;
        }
        int i = (int) (14 * context.getResources().getDisplayMetrics().density);
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        c1331670kl3LJIIIZ.LJIIIIZZ = i;
        c1331670kl3LJIIIZ.LJIIIZ = i;
        c1331670kl3LJIIIZ.LJJIII = EnumC1334360kpO.HIGH;
        c1331670kl3LJIIIZ.LIZLLL("desc_area_replace");
        c1331670kl3LJIIIZ.LJJIJL(context);
        c1331670kl3LJIIIZ.LJJII(new AbstractC468201s0() { // from class: X.0SXk
            @Override // X.InterfaceC1331910klR
            public final void LIZ(Bitmap bitmap) {
                boolean z;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("executeIconLoad: icon load success, bitmap=");
                if (bitmap != null) {
                    z = true;
                } else {
                    z = false;
                }
                sbLIZ.append(z);
                C2188811AlT.LIZIZ(sbLIZ);
                AdDescAreaReplaceServiceImpl adDescAreaReplaceServiceImpl2 = adDescAreaReplaceServiceImpl;
                C786410Ut5.LJJZZIII(adDescAreaReplaceServiceImpl2.LIZJ, new ARunnableS44S0300000_11(function0, adDescAreaReplaceServiceImpl2, bitmap, 16));
            }

            @Override // X.InterfaceC1331910klR
            public final void onFailed(Throwable th) {
                String message;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("executeIconLoad: icon load failed, error=");
                if (th != null) {
                    message = th.getMessage();
                } else {
                    message = null;
                }
                sbLIZ.append(message);
                sbLIZ.append(", show text only");
                C2188811AlT.LIZIZ(sbLIZ);
                AdDescAreaReplaceServiceImpl adDescAreaReplaceServiceImpl2 = adDescAreaReplaceServiceImpl;
                C786410Ut5.LJJZZIII(adDescAreaReplaceServiceImpl2.LIZJ, new ARunnableS80S0200000_11(adDescAreaReplaceServiceImpl2, function0, 70));
            }
        });
    }

    public final void LIZ$7() {
        ((ConstraintLayout) this.l0).animate().scaleX(((C733530Spz) this.l1).LIZLLL).scaleY(((C733530Spz) this.l1).LIZLLL).setDuration(150L).withEndAction(new ARunnableS80S0200000_11((VideoShareAssem) this.l2, (C733530Spz) this.l1, 77)).start();
    }

    public static final void run$0(ARunnableS44S0300000_11 aRunnableS44S0300000_11) {
        boolean zLIZ;
        C1C7U.LIZ("ECTrackNodeKt@a105.trackFullScreen$1$1");
        try {
            C786410Ut5.D3(((View) aRunnableS44S0300000_11.l0).getViewTreeObserver(), (ViewTreeObserverOnPreDrawListenerC1756070vnZ) aRunnableS44S0300000_11.l1);
            C786410Ut5.C3(((View) aRunnableS44S0300000_11.l0).getViewTreeObserver(), (ViewTreeObserverOnGlobalLayoutListenerC1775930wJb) aRunnableS44S0300000_11.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ECTrackNodeKt@a105.trackFullScreen$1$1");
    }

    public static final void run$1(ARunnableS44S0300000_11 aRunnableS44S0300000_11) {
        boolean zLIZ;
        C1C7U.LIZ("IECPageTrackNode@a6c2.trackFirstScreen$1$1");
        try {
            C786410Ut5.D3(((View) aRunnableS44S0300000_11.l0).getViewTreeObserver(), (ViewTreeObserverOnPreDrawListenerC1756060vnY) aRunnableS44S0300000_11.l1);
            C786410Ut5.C3(((View) aRunnableS44S0300000_11.l0).getViewTreeObserver(), (ViewTreeObserverOnGlobalLayoutListenerC1775950wJd) aRunnableS44S0300000_11.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IECPageTrackNode@a6c2.trackFirstScreen$1$1");
    }

    public static final void run$10(ARunnableS44S0300000_11 aRunnableS44S0300000_11) {
        boolean zLIZ;
        C1C7U.LIZ("AdTagAnim@dc50.startAnim$1$1");
        try {
            C708460Rqe.LIZJ((ViewGroup) aRunnableS44S0300000_11.l1, (View) aRunnableS44S0300000_11.l2, (ViewGroup) aRunnableS44S0300000_11.l0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AdTagAnim@dc50.startAnim$1$1");
    }

    public static final void run$11(ARunnableS44S0300000_11 aRunnableS44S0300000_11) {
        boolean zLIZ;
        C1C7U.LIZ("AsyncSlotStrategyCoordinator@10b3.enqueueBind$1");
        try {
            aRunnableS44S0300000_11.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AsyncSlotStrategyCoordinator@10b3.enqueueBind$1");
    }

    public static final void run$12(ARunnableS44S0300000_11 aRunnableS44S0300000_11) {
        boolean zLIZ;
        C1C7U.LIZ("AsyncSlotStrategyCoordinator@10b3.enqueueExecute$1");
        try {
            aRunnableS44S0300000_11.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AsyncSlotStrategyCoordinator@10b3.enqueueExecute$1");
    }

    public static final void run$13(ARunnableS44S0300000_11 aRunnableS44S0300000_11) {
        boolean zLIZ;
        C1C7U.LIZ("DiggPanelComponent@c22c.processLikeEffect$2$1");
        try {
            C16F4 c16f4 = (C16F4) aRunnableS44S0300000_11.l0;
            if (c16f4 != null) {
                c16f4.LIZJ(((MotionEvent) aRunnableS44S0300000_11.l1).getRawX(), ((MotionEvent) aRunnableS44S0300000_11.l1).getRawY(), (Aweme) aRunnableS44S0300000_11.l2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DiggPanelComponent@c22c.processLikeEffect$2$1");
    }

    public static final void run$14(ARunnableS44S0300000_11 aRunnableS44S0300000_11) {
        boolean zLIZ;
        C1C7U.LIZ("VideoDiggAssem@a0f1.processLikeEffect$1$1");
        try {
            aRunnableS44S0300000_11.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoDiggAssem@a0f1.processLikeEffect$1$1");
    }

    public static final void run$15(ARunnableS44S0300000_11 aRunnableS44S0300000_11) {
        boolean zLIZ;
        C1C7U.LIZ("PostModeAnimationComponent@7126.startTransitionAfterImageLoad$exploreTimeoutRunnable$1");
        try {
            aRunnableS44S0300000_11.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PostModeAnimationComponent@7126.startTransitionAfterImageLoad$exploreTimeoutRunnable$1");
    }

    public static final void run$16(ARunnableS44S0300000_11 aRunnableS44S0300000_11) {
        boolean zLIZ;
        C1C7U.LIZ("AdDescAreaReplaceServiceImpl@4642.executeIconLoad$1$onCompleted$1");
        try {
            ((AdDescAreaReplaceServiceImpl) aRunnableS44S0300000_11.l0).LJFF = (Bitmap) aRunnableS44S0300000_11.l1;
            ((AdDescAreaReplaceServiceImpl) aRunnableS44S0300000_11.l0).LJII((Function0) aRunnableS44S0300000_11.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AdDescAreaReplaceServiceImpl@4642.executeIconLoad$1$onCompleted$1");
    }

    public static final void run$17(ARunnableS44S0300000_11 aRunnableS44S0300000_11) {
        boolean zLIZ;
        C1C7U.LIZ("AdDescAreaReplaceServiceImpl@4642.tryStartDescAreaReplace$1");
        try {
            aRunnableS44S0300000_11.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AdDescAreaReplaceServiceImpl@4642.tryStartDescAreaReplace$1");
    }

    public static final void run$18(ARunnableS44S0300000_11 aRunnableS44S0300000_11) {
        boolean zLIZ;
        C1C7U.LIZ("VideoShareAssem@b354.showStayHomeGuideAnimation$1");
        try {
            C1324840ka2.LIZ((RemoteImageView) aRunnableS44S0300000_11.l0, R.drawable.bbv);
            ((ConstraintLayout) aRunnableS44S0300000_11.l1).animate().scaleX(1.16f).scaleY(1.16f).setDuration(150L).withEndAction(new ARunnableS80S0200000_11((ConstraintLayout) aRunnableS44S0300000_11.l1, (VideoShareAssem) aRunnableS44S0300000_11.l2, 76)).start();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoShareAssem@b354.showStayHomeGuideAnimation$1");
    }

    public static final void run$19(ARunnableS44S0300000_11 aRunnableS44S0300000_11) {
        boolean zLIZ;
        C1C7U.LIZ("VideoShareAssem@b354.setShareAnimate$1$1");
        try {
            aRunnableS44S0300000_11.LIZ$7();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoShareAssem@b354.setShareAnimate$1$1");
    }

    public static final void run$2(ARunnableS44S0300000_11 aRunnableS44S0300000_11) {
        boolean zLIZ;
        C1C7U.LIZ("Assem$UIThreadTaskExecutor@942b.execute$1$1");
        try {
            ((C738500Sy0) aRunnableS44S0300000_11.l0).LIZJ((C738490Sxz) aRunnableS44S0300000_11.l1, ((C259800zU) aRunnableS44S0300000_11.l2).element);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("Assem$UIThreadTaskExecutor@942b.execute$1$1");
    }

    public static final void run$20(ARunnableS44S0300000_11 aRunnableS44S0300000_11) {
        boolean zLIZ;
        C1C7U.LIZ("VideoShareAssem@b354.setShareAnimate$1");
        try {
            ((ConstraintLayout) aRunnableS44S0300000_11.l0).animate().scaleX(1.08f).scaleY(1.08f).setDuration(150L).withEndAction(new ARunnableS44S0300000_11((VideoShareAssem) aRunnableS44S0300000_11.l2, (ConstraintLayout) aRunnableS44S0300000_11.l0, (C733530Spz) aRunnableS44S0300000_11.l1, 19)).start();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoShareAssem@b354.setShareAnimate$1");
    }

    public static final void run$21(ARunnableS44S0300000_11 aRunnableS44S0300000_11) {
        boolean zLIZ;
        C1C7U.LIZ("PhotoModeHierarchy@fada.setPlaceholderImage$1");
        try {
            C0STW c0stw = ((C0STV) aRunnableS44S0300000_11.l0).LJII;
            if (c0stw != null) {
                c0stw.LIZ((Drawable) aRunnableS44S0300000_11.l1);
            }
            Drawable drawable = (Drawable) aRunnableS44S0300000_11.l1;
            if (!(drawable instanceof C1317740kOa)) {
                C0STV c0stv = (C0STV) aRunnableS44S0300000_11.l0;
                super/*X.0kk5*/.LJJIFFI(drawable, c0stv.LJIIJJI());
            } else {
                super/*X.0kk5*/.LJJIFFI(drawable, (InterfaceC1320380kSq) aRunnableS44S0300000_11.l2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PhotoModeHierarchy@fada.setPlaceholderImage$1");
    }

    public static final void run$22(ARunnableS44S0300000_11 aRunnableS44S0300000_11) {
        boolean zLIZ;
        C1C7U.LIZ("KeyboardStateViewModel@f4b1.addNeedDismissKeyboardListener$1");
        try {
            ((KeyboardStateViewModel) aRunnableS44S0300000_11.l0).LLILZ.observe((LifecycleOwner) aRunnableS44S0300000_11.l1, (Observer) aRunnableS44S0300000_11.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("KeyboardStateViewModel@f4b1.addNeedDismissKeyboardListener$1");
    }

    public static final void run$23(ARunnableS44S0300000_11 aRunnableS44S0300000_11) {
        boolean zLIZ;
        C1C7U.LIZ("KeyboardStateViewModel@f4b1.addNeedShowingKeyboardListener$1");
        try {
            ((KeyboardStateViewModel) aRunnableS44S0300000_11.l0).LLILLJJLI.observe((LifecycleOwner) aRunnableS44S0300000_11.l1, (Observer) aRunnableS44S0300000_11.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("KeyboardStateViewModel@f4b1.addNeedShowingKeyboardListener$1");
    }

    public static final void run$24(ARunnableS44S0300000_11 aRunnableS44S0300000_11) {
        boolean zLIZ;
        C1C7U.LIZ("ShareToast@d04e.shareCompleteStart$2");
        try {
            C1365840leA.LJ((C1365870leD) aRunnableS44S0300000_11.l0, (C0R52) aRunnableS44S0300000_11.l1, (Aweme) aRunnableS44S0300000_11.l2, 0L);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ShareToast@d04e.shareCompleteStart$2");
    }

    public static final void run$25(ARunnableS44S0300000_11 aRunnableS44S0300000_11) {
        boolean zLIZ;
        C1C7U.LIZ("ShareToast@d04e.shareCompleteStart$shareCompleteStartRunnable$1");
        try {
            C1365840leA.LIZ.getClass();
            C1365840leA.LIZJ = null;
            C1365840leA.LJ((C1365870leD) aRunnableS44S0300000_11.l0, (C0R52) aRunnableS44S0300000_11.l1, (Aweme) aRunnableS44S0300000_11.l2, 0L);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ShareToast@d04e.shareCompleteStart$shareCompleteStartRunnable$1");
    }

    public static final void run$26(ARunnableS44S0300000_11 aRunnableS44S0300000_11) {
        boolean zLIZ;
        C1C7U.LIZ("ComponentPriorityMaker@4add.doExecuteReportFunnelMobEvent$4");
        try {
            ((C699060RbU) aRunnableS44S0300000_11.l0).LJJIJIL((Aweme) aRunnableS44S0300000_11.l1, (C699100RbY) aRunnableS44S0300000_11.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ComponentPriorityMaker@4add.doExecuteReportFunnelMobEvent$4");
    }

    public static final void run$3(ARunnableS44S0300000_11 aRunnableS44S0300000_11) {
        boolean zLIZ;
        C1C7U.LIZ("Assembler@49f9.reusedLogicAssemPreload$1");
        try {
            ((Assembler) aRunnableS44S0300000_11.l0).JQ2((LifecycleOwner) aRunnableS44S0300000_11.l1, new AwS590S0100000_11((Function1) aRunnableS44S0300000_11.l2, (Function1<? super C0RTH, Unit>) 24));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("Assembler@49f9.reusedLogicAssemPreload$1");
    }

    public static final void run$4(ARunnableS44S0300000_11 aRunnableS44S0300000_11) {
        boolean zLIZ;
        C1C7U.LIZ("Assembler@49f9.reusedUiContentAssemPreload$1");
        try {
            ((Assembler) aRunnableS44S0300000_11.l0).JQ2((LifecycleOwner) aRunnableS44S0300000_11.l1, new AwS590S0100000_11((Function1) aRunnableS44S0300000_11.l2, (Function1<? super C0RTH, Unit>) 25));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("Assembler@49f9.reusedUiContentAssemPreload$1");
    }

    public static final void run$5(ARunnableS44S0300000_11 aRunnableS44S0300000_11) {
        boolean zLIZ;
        C1C7U.LIZ("Assembler@49f9.reusedUiSlotAssemPreload$1");
        try {
            ((Assembler) aRunnableS44S0300000_11.l0).JQ2((LifecycleOwner) aRunnableS44S0300000_11.l1, new AwS590S0100000_11((Function1) aRunnableS44S0300000_11.l2, (Function1<? super C0RTH, Unit>) 26));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("Assembler@49f9.reusedUiSlotAssemPreload$1");
    }

    public static final void run$6(ARunnableS44S0300000_11 aRunnableS44S0300000_11) {
        boolean zLIZ;
        C1C7U.LIZ("VideoCommentAssem@5078.configClickListener$3");
        try {
            ((VideoCommentAssem) aRunnableS44S0300000_11.l0).Up((View) aRunnableS44S0300000_11.l1, (a) aRunnableS44S0300000_11.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoCommentAssem@5078.configClickListener$3");
    }

    public static final void run$7(ARunnableS44S0300000_11 aRunnableS44S0300000_11) {
        boolean zLIZ;
        C1C7U.LIZ("FeedPhotoLayoutComponent@3920.updateComponentsViewRect$1$1");
        try {
            aRunnableS44S0300000_11.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedPhotoLayoutComponent@3920.updateComponentsViewRect$1$1");
    }

    public static final void run$8(ARunnableS44S0300000_11 aRunnableS44S0300000_11) {
        boolean zLIZ;
        C1C7U.LIZ("InteractBottomBannerAssem@96c0.inflateAsync$1$1");
        try {
            if (!C1578630rBN.LJIIIZ((InteractBottomBannerAssem) aRunnableS44S0300000_11.l0) && !((InteractBottomBannerAssem) aRunnableS44S0300000_11.l0).Gp()) {
                FeedBottomBannerView feedBottomBannerView = ((InteractBottomBannerAssem) aRunnableS44S0300000_11.l0).LLJZIJLIL;
                if (feedBottomBannerView != null) {
                    feedBottomBannerView.setInteractionArea((View) aRunnableS44S0300000_11.l1);
                }
                FeedBottomBannerConfig.Callback callback = ((FeedBottomBannerConfig) aRunnableS44S0300000_11.l2).interactionLayoutCallback;
                if (callback != null) {
                    callback.onFinishedInflate((View) aRunnableS44S0300000_11.l1);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractBottomBannerAssem@96c0.inflateAsync$1$1");
    }

    public static final void run$9(ARunnableS44S0300000_11 aRunnableS44S0300000_11) {
        boolean zLIZ;
        C1C7U.LIZ("InteractBottomBannerAssem@96c0.inflateAsync$1");
        try {
            aRunnableS44S0300000_11.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractBottomBannerAssem@96c0.inflateAsync$1");
    }

    public ARunnableS44S0300000_11(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj3;
        this.l2 = obj;
    }
}
