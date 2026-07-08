package Y;

import X.C09JN;
import X.C0HGO;
import X.C0HGP;
import X.C0HGQ;
import X.C0HI2;
import X.C0PEM;
import X.C1171630gav;
import X.C11JF;
import X.C11PQ;
import X.C12ES;
import X.C1389890mGx;
import X.C13LQ;
import X.C1429400nIg;
import X.C1609220ryi;
import X.C1609500rzA;
import X.C1619980sG4;
import X.C16F5;
import X.C1901500za8;
import X.C1910890zpH;
import X.C1C7U;
import X.C1DFH;
import X.C20441214yg;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.C423470Gj3;
import X.C445390HdJ;
import X.C497740JfY;
import X.InterfaceC497601wk;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.AigcWallpaperGuestViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.quickconnect.MultiGuestAnchorQuickConnectViewModel;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.widgets.giftwidget.presenter.FastGiftConfirmDialog;
import com.bytedance.tiktok.homepage.mainpagefragment.SocialAvatarIconFlipPrerequisiteViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.detail.panel.AnalyticsDetailPanel;
import com.ss.android.ugc.aweme.hangout.component.push.MultiGuestTopLivePushCardFragment;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import com.ss.android.ugc.aweme.model.api.response.ProfileNaviInfoResponse;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.tiktok.privacy.api.phl.model.PrivacyHighlightsForTeens;
import com.ss.android.ugc.tiktok.privacy.api.phl.vm.PhlViewModel;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class AfS175S0100000_6 implements C09JN {
    public final int $t;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                accept$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                accept$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                accept$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                accept$13(this, obj);
                break;
            case 14:
                accept$14(this, obj);
                break;
            case 15:
                accept$15(this, obj);
                break;
            case 16:
                accept$16(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                accept$17(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                accept$18(this, obj);
                break;
            case 19:
                accept$19(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                accept$20(this, obj);
                break;
        }
    }

    public AfS175S0100000_6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void accept$0(AfS175S0100000_6 afS175S0100000_6, Object obj) {
        C1C7U.LIZ("MultiGuestAnchorQuickConnectViewModel@f5b1.startQuickConnectCountdown$2");
        C20441214yg.LJIIIZ("MultiGuestAnchorQuickConnectViewModel_countdown", String.valueOf(obj));
        ((MultiGuestAnchorQuickConnectViewModel) afS175S0100000_6.l0).LLILLL.onNext(obj);
        C1C7U.LIZIZ("MultiGuestAnchorQuickConnectViewModel@f5b1.startQuickConnectCountdown$2");
    }

    public static final void accept$1(AfS175S0100000_6 afS175S0100000_6, Object obj) {
        ObjectAnimator objectAnimatorOfFloat;
        C1C7U.LIZ("MultiGuestIconQuickConnectAnimationHelper@eaa0.trySetupCountDownTimerListener$1");
        Long l = (Long) obj;
        if (l.longValue() > 10) {
            View view = ((C423470Gj3) afS175S0100000_6.l0).LIZJ;
            if (view != null) {
                C12ES.LJIILL(0, view);
            }
        } else if (l.longValue() == 10) {
            ((C423470Gj3) afS175S0100000_6.l0).LIZIZ(l.longValue());
            C423470Gj3 c423470Gj3 = (C423470Gj3) afS175S0100000_6.l0;
            c423470Gj3.getClass();
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator[] objectAnimatorArr = new ObjectAnimator[2];
            View view2 = c423470Gj3.LIZJ;
            ObjectAnimator objectAnimatorOfFloat2 = null;
            if (view2 != null) {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
                objectAnimatorOfFloat.setDuration(600L);
                objectAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
            } else {
                objectAnimatorOfFloat = null;
            }
            objectAnimatorArr[0] = objectAnimatorOfFloat;
            TuxTextView tuxTextView = c423470Gj3.LJIIIIZZ;
            if (tuxTextView != null) {
                objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(tuxTextView, (Property<TuxTextView, Float>) View.ALPHA, 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(600L);
                objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LIZLLL());
            }
            objectAnimatorArr[1] = objectAnimatorOfFloat2;
            animatorSet.playTogether(C13LQ.LJIJI(objectAnimatorArr));
            animatorSet.start();
        } else {
            ((C423470Gj3) afS175S0100000_6.l0).LIZIZ(l.longValue());
        }
        C1C7U.LIZIZ("MultiGuestIconQuickConnectAnimationHelper@eaa0.trySetupCountDownTimerListener$1");
    }

    public static final void accept$10(AfS175S0100000_6 afS175S0100000_6, Object obj) {
        C1C7U.LIZ("PhlViewModel@4645.getPrivacyHighlightsVideos$2");
        ((PhlViewModel) afS175S0100000_6.l0).LLILZLL.setValue(Boolean.FALSE);
        C1C7U.LIZIZ("PhlViewModel@4645.getPrivacyHighlightsVideos$2");
    }

    public static final void accept$11(AfS175S0100000_6 afS175S0100000_6, Object obj) {
        C1C7U.LIZ("AigcWallpaperGuestViewModel@bde9.startInviteCountDown$2");
        Long l = (Long) obj;
        if (l.longValue() <= 0) {
            AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel = (AigcWallpaperGuestViewModel) afS175S0100000_6.l0;
            C11JF c11jf = aigcWallpaperGuestViewModel.LLJJIJI;
            if (c11jf != null) {
                c11jf.dispose();
            }
            aigcWallpaperGuestViewModel.LLJJIJI = null;
            InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(aigcWallpaperGuestViewModel);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C0HGQ(aigcWallpaperGuestViewModel, null), 2);
        } else {
            AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel2 = (AigcWallpaperGuestViewModel) afS175S0100000_6.l0;
            long jLongValue = l.longValue();
            aigcWallpaperGuestViewModel2.getClass();
            InterfaceC497601wk viewModelScope2 = ViewModelKt.getViewModelScope(aigcWallpaperGuestViewModel2);
            C1DFH c1dfh2 = C0PEM.LIZ;
            C23250099c.LIZLLL(viewModelScope2, C2107308Nj.LIZ, null, new C0HGP(aigcWallpaperGuestViewModel2, jLongValue, null), 2);
        }
        C1C7U.LIZIZ("AigcWallpaperGuestViewModel@bde9.startInviteCountDown$2");
    }

    public static final void accept$12(AfS175S0100000_6 afS175S0100000_6, Object obj) {
        C1C7U.LIZ("AigcWallpaperGuestViewModel@bde9.startInviteCountDown$3");
        C20441214yg.LJFF("AigcWallpaperGuestViewModelTAG", "AigcInviteCountDown failed, ", (Throwable) obj);
        AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel = (AigcWallpaperGuestViewModel) afS175S0100000_6.l0;
        C11JF c11jf = aigcWallpaperGuestViewModel.LLJJIJI;
        if (c11jf != null) {
            c11jf.dispose();
        }
        aigcWallpaperGuestViewModel.LLJJIJI = null;
        C1C7U.LIZIZ("AigcWallpaperGuestViewModel@bde9.startInviteCountDown$3");
    }

    public static final void accept$13(AfS175S0100000_6 afS175S0100000_6, Object obj) {
        C1C7U.LIZ("AigcWallpaperGuestViewModel@bde9.startTotalTimeCountDown$2");
        Long l = (Long) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("guest edit countdown: ");
        sbLIZ.append(l);
        C20441214yg.LIZIZ("AigcWallpaperGuestViewModelTAG", C2188811AlT.LIZIZ(sbLIZ));
        ((AigcWallpaperGuestViewModel) afS175S0100000_6.l0).LLJJJIL.postValue(Integer.valueOf((int) l.longValue()));
        if (l.longValue() <= 0) {
            C20441214yg.LJIIL("AigcWallpaperGuestViewModelTAG", "guest edit countdown totalCountDownTimeout");
            AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel = (AigcWallpaperGuestViewModel) afS175S0100000_6.l0;
            aigcWallpaperGuestViewModel.FQ2();
            InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(aigcWallpaperGuestViewModel);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C0HGO(aigcWallpaperGuestViewModel, null), 2);
        }
        C1C7U.LIZIZ("AigcWallpaperGuestViewModel@bde9.startTotalTimeCountDown$2");
    }

    public static final void accept$14(AfS175S0100000_6 afS175S0100000_6, Object obj) {
        C1C7U.LIZ("AigcWallpaperGuestViewModel@bde9.startTotalTimeCountDown$3");
        C20441214yg.LJFF("AigcWallpaperGuestViewModelTAG", "aigc Total coutdown failed, ", (Throwable) obj);
        ((AigcWallpaperGuestViewModel) afS175S0100000_6.l0).FQ2();
        C1C7U.LIZIZ("AigcWallpaperGuestViewModel@bde9.startTotalTimeCountDown$3");
    }

    public static final void accept$15(AfS175S0100000_6 afS175S0100000_6, Object obj) {
        C1C7U.LIZ("SummaryPageUnlockViewPresenter@4a7.bindDualAvatar$1$1");
        ((TuxIconView) afS175S0100000_6.l0).setImageBitmap((Bitmap) obj);
        C1C7U.LIZIZ("SummaryPageUnlockViewPresenter@4a7.bindDualAvatar$1$1");
    }

    public static final void accept$16(AfS175S0100000_6 afS175S0100000_6, Object obj) {
        C1C7U.LIZ("MultiGuestTopLivePushCardFragment@df29.autoDestroy$1");
        ((MultiGuestTopLivePushCardFragment) afS175S0100000_6.l0).dismiss();
        C1C7U.LIZIZ("MultiGuestTopLivePushCardFragment@df29.autoDestroy$1");
    }

    public static final void accept$17(AfS175S0100000_6 afS175S0100000_6, Object obj) {
        C1C7U.LIZ("MultiCoHostSettingsFragment@804c.backGroundAnimation$1");
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(C497740JfY.LJFF(R.color.a_v)), Integer.valueOf(C497740JfY.LJFF(R.color.aak)));
        View view = (View) afS175S0100000_6.l0;
        valueAnimatorOfObject.setDuration(1700L);
        valueAnimatorOfObject.setRepeatCount(0);
        valueAnimatorOfObject.addUpdateListener(new AUListenerS256S0100000_6(view, 128));
        valueAnimatorOfObject.start();
        C1C7U.LIZIZ("MultiCoHostSettingsFragment@804c.backGroundAnimation$1");
    }

    public static final void accept$18(AfS175S0100000_6 afS175S0100000_6, Object obj) {
        C1C7U.LIZ("AvatarRingView@35dc.controlAnimation$1");
        C1609220ryi c1609220ryi = (C1609220ryi) afS175S0100000_6.l0;
        float fFloatValue = ((Float) obj).floatValue();
        if (fFloatValue != c1609220ryi.LLJILJIL) {
            ValueAnimator valueAnimator = c1609220ryi.LLJIJIL;
            if (valueAnimator != null) {
                if (valueAnimator.isRunning()) {
                    valueAnimator.cancel();
                }
                valueAnimator.removeAllListeners();
                valueAnimator.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(c1609220ryi.LLJILJIL, fFloatValue);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS11S0100001_6(c1609220ryi, fFloatValue, 0));
            valueAnimatorOfFloat.setDuration((long) (Math.abs(fFloatValue - c1609220ryi.LLJILJIL) * 2000));
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.start();
            c1609220ryi.LLJIJIL = valueAnimatorOfFloat;
        }
        C1C7U.LIZIZ("AvatarRingView@35dc.controlAnimation$1");
    }

    public static final void accept$19(AfS175S0100000_6 afS175S0100000_6, Object obj) {
        ProfileNaviDataModel profileNaviDataModel;
        C1C7U.LIZ("ProfileNaviActivity@dab9.fetchNavi$1");
        ProfileNaviInfoResponse profileNaviInfoResponse = (ProfileNaviInfoResponse) obj;
        if (profileNaviInfoResponse != null) {
            Function1 function1 = (Function1) afS175S0100000_6.l0;
            if (profileNaviInfoResponse.error_code == 0 && (profileNaviDataModel = profileNaviInfoResponse.navi) != null) {
                function1.invoke(profileNaviDataModel);
            }
        }
        C1C7U.LIZIZ("ProfileNaviActivity@dab9.fetchNavi$1");
    }

    public static final void accept$2(AfS175S0100000_6 afS175S0100000_6, Object obj) {
        C1C7U.LIZ("FastGiftConfirmDialog@e3a5.onViewCreated$1$4$1");
        int iLIZIZ = (int) C497740JfY.LIZIZ(28.0f);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap((Bitmap) obj, iLIZIZ, iLIZIZ, true);
        FastGiftConfirmDialog fastGiftConfirmDialog = (FastGiftConfirmDialog) afS175S0100000_6.l0;
        View viewFindViewById = fastGiftConfirmDialog.LLILZIL;
        if (viewFindViewById == null) {
            View view = fastGiftConfirmDialog.getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.izq);
            } else {
                viewFindViewById = null;
            }
            fastGiftConfirmDialog.LLILZIL = (C16F5) viewFindViewById;
        }
        ((AppCompatTextView) viewFindViewById).setCompoundDrawablesWithIntrinsicBounds(new BitmapDrawable(((FastGiftConfirmDialog) afS175S0100000_6.l0).getResources(), bitmapCreateScaledBitmap), (Drawable) null, (Drawable) null, (Drawable) null);
        C1C7U.LIZIZ("FastGiftConfirmDialog@e3a5.onViewCreated$1$4$1");
    }

    public static final void accept$20(AfS175S0100000_6 afS175S0100000_6, Object obj) {
        C1C7U.LIZ("SocPubAvatarFrameLayout@82d8.observeProgressIfNeed$1");
        C1609500rzA c1609500rzA = (C1609500rzA) afS175S0100000_6.l0;
        float fFloatValue = ((Float) obj).floatValue();
        if (fFloatValue != c1609500rzA.LLJJIJI) {
            ValueAnimator valueAnimator = c1609500rzA.LLJJJ;
            if (valueAnimator != null) {
                if (valueAnimator.isRunning()) {
                    valueAnimator.cancel();
                }
                valueAnimator.removeAllListeners();
                valueAnimator.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(c1609500rzA.LLJJIJI, fFloatValue);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS11S0100001_6(c1609500rzA, fFloatValue, 1));
            valueAnimatorOfFloat.setDuration((long) (Math.abs(fFloatValue - c1609500rzA.LLJJIJI) * 2000));
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.start();
            c1609500rzA.LLJJJ = valueAnimatorOfFloat;
        }
        C1C7U.LIZIZ("SocPubAvatarFrameLayout@82d8.observeProgressIfNeed$1");
    }

    public static final void accept$3(AfS175S0100000_6 afS175S0100000_6, Object obj) {
        C1C7U.LIZ("SocialAvatarIconFlipPrerequisiteViewModel@7f93.onPrepared$1");
        C0HI2 c0hi2 = (C0HI2) obj;
        boolean z = false;
        if (c0hi2 != null && c0hi2.LIZ) {
            SocialAvatarIconFlipPrerequisiteViewModel socialAvatarIconFlipPrerequisiteViewModel = (SocialAvatarIconFlipPrerequisiteViewModel) afS175S0100000_6.l0;
            if (c0hi2 != null) {
                z = c0hi2.LIZIZ;
            }
            socialAvatarIconFlipPrerequisiteViewModel.LLIZ = z;
        } else {
            SocialAvatarIconFlipPrerequisiteViewModel socialAvatarIconFlipPrerequisiteViewModel2 = (SocialAvatarIconFlipPrerequisiteViewModel) afS175S0100000_6.l0;
            socialAvatarIconFlipPrerequisiteViewModel2.LLIZ = false;
            socialAvatarIconFlipPrerequisiteViewModel2.LLIZLLLIL = false;
        }
        C1910890zpH logger = ((SocialAvatarIconFlipPrerequisiteViewModel) afS175S0100000_6.l0).getLogger();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getIconFlipColdStartEntranceEnabledState get it as ");
        sbLIZ.append(c0hi2);
        logger.LIZ("iconFlipVM", C2188811AlT.LIZIZ(sbLIZ));
        ((SocialAvatarIconFlipPrerequisiteViewModel) afS175S0100000_6.l0).vQ2();
        C1C7U.LIZIZ("SocialAvatarIconFlipPrerequisiteViewModel@7f93.onPrepared$1");
    }

    public static final void accept$4(AfS175S0100000_6 afS175S0100000_6, Object obj) {
        C1C7U.LIZ("AnalyticsDetailPanel@358c.getInsightsDataForGraph$2");
        C1389890mGx c1389890mGx = new C1389890mGx(((AnalyticsDetailPanel) afS175S0100000_6.l0).activity);
        c1389890mGx.LJIIIZ(R.string.txq);
        c1389890mGx.LJIIJJI();
        C1C7U.LIZIZ("AnalyticsDetailPanel@358c.getInsightsDataForGraph$2");
    }

    public static final void accept$5(AfS175S0100000_6 afS175S0100000_6, Object obj) {
        C1C7U.LIZ("AnalyticsDetailPanel@358c.getInsightsDataForGraphV2$2");
        C1389890mGx c1389890mGx = new C1389890mGx(((AnalyticsDetailPanel) afS175S0100000_6.l0).activity);
        c1389890mGx.LJIIIZ(R.string.txq);
        c1389890mGx.LJIIJJI();
        C1C7U.LIZIZ("AnalyticsDetailPanel@358c.getInsightsDataForGraphV2$2");
    }

    public static final void accept$6(AfS175S0100000_6 afS175S0100000_6, Object obj) {
        C1C7U.LIZ("CollectionListChooseAssem$CollectionVH@6c1b.onBindItemView$7$1$1");
        ((AppCompatImageView) ((C1171630gav) afS175S0100000_6.l0).itemView.findViewById(R.id.e5t)).setImageBitmap((Bitmap) obj);
        C1C7U.LIZIZ("CollectionListChooseAssem$CollectionVH@6c1b.onBindItemView$7$1$1");
    }

    public static final void accept$7(AfS175S0100000_6 afS175S0100000_6, Object obj) {
        C1C7U.LIZ("FloatingBubbleViewManager@855e.setAvatarView$2");
        ((C1901500za8) afS175S0100000_6.l0).LIZIZ().setImageBitmap((Bitmap) obj);
        C1C7U.LIZIZ("FloatingBubbleViewManager@855e.setAvatarView$2");
    }

    public static final void accept$8(AfS175S0100000_6 afS175S0100000_6, Object obj) {
        C1C7U.LIZ("AddYoursRecommendManager@6e64.observeAddYoursRecommendResult$2$1");
        C1429400nIg.LIZ.getClass();
        C23250099c.LIZLLL((InterfaceC497601wk) C1429400nIg.LIZJ.getValue(), null, null, new C445390HdJ((String) obj, (C11PQ) afS175S0100000_6.l0, null), 3);
        C1C7U.LIZIZ("AddYoursRecommendManager@6e64.observeAddYoursRecommendResult$2$1");
    }

    public static final void accept$9(AfS175S0100000_6 afS175S0100000_6, Object obj) {
        C1C7U.LIZ("PhlViewModel@4645.getPrivacyHighlightsVideos$1");
        PrivacyHighlightsForTeens privacyHighlightsForTeens = (PrivacyHighlightsForTeens) obj;
        ((PhlViewModel) afS175S0100000_6.l0).LLILZLL.setValue(Boolean.TRUE);
        ((PhlViewModel) afS175S0100000_6.l0).LLILLJJLI.setValue(privacyHighlightsForTeens.pageTitle);
        ((PhlViewModel) afS175S0100000_6.l0).LLILLL.setValue(privacyHighlightsForTeens.pageDesc);
        ((PhlViewModel) afS175S0100000_6.l0).LLILZ.setValue(privacyHighlightsForTeens.videoList);
        ((PhlViewModel) afS175S0100000_6.l0).LLILZIL.setValue(privacyHighlightsForTeens.pageButton);
        ((PhlViewModel) afS175S0100000_6.l0).LLIZ.setValue(privacyHighlightsForTeens.approveInfo);
        C1C7U.LIZIZ("PhlViewModel@4645.getPrivacyHighlightsVideos$1");
    }
}
