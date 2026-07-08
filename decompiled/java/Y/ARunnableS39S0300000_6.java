package Y;

import X.C054G;
import X.C09RD;
import X.C0H4Q;
import X.C0HZL;
import X.C0P0T;
import X.C0PEM;
import X.C0SU0;
import X.C1091400eVW;
import X.C11VU;
import X.C1245110iVR;
import X.C1394210mNv;
import X.C1394540mOS;
import X.C13MK;
import X.C1733010vCN;
import X.C1759470vt3;
import X.C1764390w0z;
import X.C197004125y;
import X.C19ME;
import X.C1C7U;
import X.C21646719nd;
import X.C21647019ng;
import X.C2188811AlT;
import X.C23250099c;
import X.C259800zU;
import X.C418440Gaw;
import X.C418580GbA;
import X.C422190Ggz;
import X.C423150GiX;
import X.C423160GiY;
import X.C423180Gia;
import X.C426750GoL;
import X.C428600GrK;
import X.C432020Gwq;
import X.C434150H0r;
import X.C437880HFa;
import X.C439101nJ;
import X.C440750HQb;
import X.C440820HQi;
import X.C440830HQj;
import X.C450720Hlu;
import X.C497740JfY;
import X.C731940SnQ;
import X.C786410Ut5;
import X.C814420VxA;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.pipo.stellar.base.fragment.StellarFragment;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.poll.PollCreateFragment;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.model.EnhancedBrandLogo;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.live.toplives.notifications.LiveNotificationItem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v2.MixStudioResultsPageV2Assem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.feed.NoticeItem;

/* JADX INFO: loaded from: classes7.dex */
public class ARunnableS39S0300000_6 implements Runnable {
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$0() {
        Object objInvoke;
        Object objInvoke2;
        StellarFragment stellarFragment = (StellarFragment) this.l0;
        View view = (View) this.l1;
        View view2 = (View) this.l2;
        stellarFragment.getClass();
        if (view != null) {
            AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(492);
            AFwS234S0000000_5 aFwS234S0000000_5 = AFwS234S0000000_5.get$arr$(514);
            Function1<? super View, AnimatorSet> function1 = stellarFragment.LLJILJILJ;
            if (function1 == null || (objInvoke = function1.invoke(view)) == null) {
                objInvoke = aFwS236S0000000_6.invoke(view);
            }
            Function1<? super View, AnimatorSet> function12 = stellarFragment.LLJILLL;
            if (function12 == null || (objInvoke2 = function12.invoke(view2)) == null) {
                objInvoke2 = aFwS234S0000000_5.invoke(view2);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objInvoke, objInvoke2);
            animatorSet.start();
        }
    }

    public final void LIZ$1() {
        if (!((PollCreateFragment) this.l0).isAdded() || ((PollCreateFragment) this.l0).getView() == null || ((View) this.l1).getParent() == null) {
            ((Function0) this.l2).invoke();
            return;
        }
        View view = ((PollCreateFragment) this.l0).LLJI;
        if (view == null) {
            ((Function0) this.l2).invoke();
        } else {
            view.animate().translationY(view.getHeight()).setDuration(220L).withEndAction(new ARunnableS104S0100000_4((Function0) this.l2, 13)).start();
        }
    }

    public final void LIZ$10() {
        if (((ViewGroup) this.l0).getParent() != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((ViewGroup) this.l0, "translationY", 0.0f, r3.getHeight());
            ((C1764390w0z) this.l1).LIZJ = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setInterpolator(new PathInterpolator(0.33f, 0.0f, 0.25f, 1.0f));
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.addListener(new ALAdapterS1S0300000_6((ViewGroup) this.l0, (C1764390w0z) this.l1, (Function0) this.l2, 10));
            C786410Ut5.Pd(objectAnimatorOfFloat);
        }
    }

    public final void LIZ$11() {
        if (((ViewGroup) this.l0).getParent() != null) {
            C786410Ut5.bd(r1.getHeight(), (ViewGroup) this.l0);
            C786410Ut5.LJLZ(0, (ViewGroup) this.l0);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((ViewGroup) this.l0, "translationY", r2.getHeight(), 0.0f);
            ((C1764390w0z) this.l1).LIZIZ = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setInterpolator(new PathInterpolator(0.33f, 0.0f, 0.25f, 1.0f));
            objectAnimatorOfFloat.setDuration(400L);
            objectAnimatorOfFloat.addListener(new ALAdapterS3S0100000_6((Function0) this.l2, 48));
            C786410Ut5.Pd(objectAnimatorOfFloat);
        }
    }

    public final void LIZ$12() {
        if (((ViewGroup) this.l0).getParent() != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((ViewGroup) this.l0, "translationY", 0.0f, r3.getHeight());
            ((C1759470vt3) this.l1).LIZIZ = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setInterpolator(new PathInterpolator(0.33f, 0.0f, 0.25f, 1.0f));
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.addListener(new ALAdapterS3S0200000_6((Function0) this.l2, (ViewGroup) this.l0, 37));
            C786410Ut5.Pd(objectAnimatorOfFloat);
        }
    }

    public final void LIZ$13() {
        if (((ViewGroup) this.l0).getParent() != null) {
            C786410Ut5.bd(r1.getHeight(), (ViewGroup) this.l0);
            C786410Ut5.LJLZ(0, (ViewGroup) this.l0);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((ViewGroup) this.l0, "translationY", r2.getHeight(), 0.0f);
            ((C1759470vt3) this.l1).LIZ = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setInterpolator(new PathInterpolator(0.33f, 0.0f, 0.25f, 1.0f));
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.addListener(new ALAdapterS3S0100000_6((Function0) this.l2, 60));
            C786410Ut5.Pd(objectAnimatorOfFloat);
        }
    }

    public final void LIZ$14() {
        int width = ((LiveNotificationItem) this.l0).I5().getWidth();
        TextPaint textPaint = new TextPaint(((LiveNotificationItem) this.l0).I5().getPaint());
        LiveNotificationItem liveNotificationItem = (LiveNotificationItem) this.l0;
        C054G c054g = liveNotificationItem.LLJILJILJ;
        if (c054g != null) {
            C23250099c.LIZLLL(c054g, C0PEM.LIZJ, null, new C0H4Q(liveNotificationItem, (SpannableStringBuilder) this.l1, (NoticeItem) this.l2, width, textPaint, null), 2);
        }
    }

    public final void LIZ$15() {
        if (((View) this.l0).getParent() == null) {
            return;
        }
        View viewFindViewById = ((View) this.l0).findViewById(R.id.o4q);
        if ((viewFindViewById == null && (viewFindViewById = ((View) this.l0).findViewById(R.id.m__)) == null) || ((View) this.l0).getParent() == null) {
            return;
        }
        ((View) this.l1).measure(0, 0);
        int measuredWidth = ((View) this.l1).getMeasuredWidth();
        ((PopupWindow) this.l2).setHeight(((View) this.l1).getMeasuredHeight());
        int[] iArr = new int[2];
        ((View) this.l0).getLocationOnScreen(iArr);
        int i = iArr[0];
        int[] iArr2 = new int[2];
        viewFindViewById.getLocationOnScreen(iArr2);
        int i2 = iArr2[0];
        C786410Ut5.i3((PopupWindow) this.l2, (View) this.l0, ((View) this.l0).getLayoutDirection() == 1 ? i2 - ((View) this.l0).getWidth() : ((i2 + viewFindViewById.getWidth()) - i) - measuredWidth, -((int) C497740JfY.LIZIZ(8.0f)));
    }

    public final void LIZ$16() {
        SmartImageView smartImageView = ((C1733010vCN) this.l0).LLJI;
        if (smartImageView != null) {
            C786410Ut5.G6(smartImageView, (ViewGroup.LayoutParams) this.l1);
        }
        C1733010vCN c1733010vCN = (C1733010vCN) this.l0;
        SmartImageView smartImageView2 = c1733010vCN.LLJI;
        if (smartImageView2 != null) {
            smartImageView2.setBackground(new BitmapDrawable(c1733010vCN.getResources(), (Bitmap) this.l2));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("background:");
        SmartImageView smartImageView3 = ((C1733010vCN) this.l0).LLJI;
        sbLIZ.append(smartImageView3 != null ? smartImageView3.getBackground() : null);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ$17() {
        Float f;
        if (((RecyclerView) this.l0).getParent() != null) {
            for (View view : new C09RD((RecyclerView) this.l1)) {
                if (!Intrinsics.LJFF(view, ((C422190Ggz) this.l2).LIZIZ)) {
                    C422190Ggz c422190Ggz = (C422190Ggz) this.l2;
                    if (c422190Ggz.LIZIZ != null || !Intrinsics.LJFF(c422190Ggz.LIZ, view)) {
                        Object animatedValue = ((C422190Ggz) this.l2).LIZLLL.getAnimatedValue();
                        C786410Ut5.T4(view, Math.max(0.15f, Math.min(1.0f - ((!(animatedValue instanceof Float) || (f = (Float) animatedValue) == null) ? 0.0f : f.floatValue()), 1.0f)));
                    }
                }
                if (Intrinsics.LJFF(view, ((C422190Ggz) this.l2).LIZIZ)) {
                    C786410Ut5.T4(view, 1.0f);
                }
            }
        }
    }

    public final void LIZ$2() {
        Integer height;
        Integer width;
        C428600GrK c428600GrK = (C428600GrK) this.l0;
        if (c428600GrK != null) {
            SmartImageView smartImageView = (SmartImageView) this.l1;
            EnhancedBrandLogo enhancedBrandLogo = (EnhancedBrandLogo) this.l2;
            ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
            if (layoutParams != null) {
                Image image = enhancedBrandLogo.topBrand;
                double dIntValue = ((double) ((image == null || (width = image.getWidth()) == null) ? c428600GrK.LIZ : width.intValue())) * 1.0d * ((double) smartImageView.getHeight());
                Image image2 = enhancedBrandLogo.topBrand;
                layoutParams.width = C814420VxA.LIZ(dIntValue / ((double) ((image2 == null || (height = image2.getHeight()) == null) ? c428600GrK.LIZIZ : height.intValue())));
            }
            smartImageView.requestLayout();
        }
    }

    public final void LIZ$3() {
        Activity activity = (Activity) this.l0;
        final Lifecycle lifecycle = (Lifecycle) this.l1;
        AwS585S0100000_6 awS585S0100000_6 = new AwS585S0100000_6((View) this.l2, 217);
        if (lifecycle.getCurrentState() == Lifecycle.State.RESUMED) {
            C450720Hlu c450720Hlu = new C450720Hlu(activity);
            awS585S0100000_6.invoke(c450720Hlu);
            final C0P0T c0p0tLIZIZ = c450720Hlu.LIZIZ();
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.gamora.editor.toolbar.EditToolbarHelperKt$showMessageToolTipWithLifecycle$lifecycleObserver$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event != Lifecycle.Event.ON_PAUSE) {
                        return;
                    }
                    if (c0p0tLIZIZ.isShowing()) {
                        c0p0tLIZIZ.dismiss();
                    }
                    lifecycle.removeObserver(this);
                }
            });
            c0p0tLIZIZ.show();
        }
    }

    public final void LIZ$4() {
        int left = ((TuxIconView) this.l0).getLeft();
        TuxTextView productOriginPriceFromXml = ((C432020Gwq) this.l1).getProductOriginPriceFromXml();
        if (productOriginPriceFromXml != null) {
            productOriginPriceFromXml.measure(0, 0);
        }
        TuxTextView productDistcountFromXml = ((C432020Gwq) this.l1).getProductDistcountFromXml();
        if (productDistcountFromXml != null) {
            productDistcountFromXml.measure(0, 0);
        }
        TuxTextView productOriginPriceFromXml2 = ((C432020Gwq) this.l1).getProductOriginPriceFromXml();
        int measuredWidth = productOriginPriceFromXml2 != null ? productOriginPriceFromXml2.getMeasuredWidth() : 0;
        TuxTextView productDistcountFromXml2 = ((C432020Gwq) this.l1).getProductDistcountFromXml();
        int measuredWidth2 = productDistcountFromXml2 != null ? productDistcountFromXml2.getMeasuredWidth() : 0;
        int right = ((TuxTextView) this.l2).getRight() + measuredWidth + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(4.0f)));
        if (measuredWidth2 + right + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(2.0f))) > left) {
            TuxTextView productDistcountFromXml3 = ((C432020Gwq) this.l1).getProductDistcountFromXml();
            if (productDistcountFromXml3 != null) {
                C786410Ut5.LLLLZLL(productDistcountFromXml3, 8);
            }
        } else {
            TuxTextView productDistcountFromXml4 = ((C432020Gwq) this.l1).getProductDistcountFromXml();
            if (productDistcountFromXml4 != null) {
                C786410Ut5.LLLLZLL(productDistcountFromXml4, 0);
            }
        }
        if (right > left) {
            C786410Ut5.F((C432020Gwq) this.l1, 8);
        } else {
            C786410Ut5.F((C432020Gwq) this.l1, 0);
        }
    }

    public final void LIZ$5() {
        C423160GiY c423160GiY = new C423160GiY((Activity) this.l0);
        c423160GiY.LIZJ = 2131848882;
        c423160GiY.LIZIZ = Mp4ScreenVideoLoadTimeout.CONTROL;
        c423160GiY.LIZLLL = true;
        C423150GiX c423150GiX = new C423150GiX(c423160GiY);
        c423150GiX.getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
        int measuredWidth = c423150GiX.getContentView().getMeasuredWidth();
        C418580GbA c418580GbA = c423150GiX.LLIZLLLIL;
        if (c418580GbA == null) {
            c418580GbA = null;
        }
        float padding = ((measuredWidth - (c418580GbA.getPADDING() * 4)) - ((View) this.l1).getMeasuredWidth()) + C11VU.LIZIZ(8.0f, (Activity) this.l0);
        float fLIZIZ = C11VU.LIZIZ(3.0f, (Activity) this.l0) + padding;
        C423180Gia c423180Gia = (C423180Gia) this.l2;
        Activity activity = (Activity) this.l0;
        c423180Gia.getClass();
        if (activity == null || activity.getResources().getConfiguration().getLayoutDirection() != 1) {
            c423150GiX.LJJIIJZLJL(4.0f, 0, (View) this.l1);
        } else {
            c423150GiX.LJJIIJZLJL(fLIZIZ, -((int) padding), (View) this.l1);
        }
        ((C423180Gia) this.l2).LIZ.LIZJ();
    }

    public final void LIZ$6() {
        View view = (View) this.l0;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((View) this.l0, "alpha", view != null ? view.getAlpha() : 0.0f, 0.0f);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = (ValueAnimator.AnimatorUpdateListener) this.l1;
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.addListener(new AAListenerS317S0100000_6((Animator.AnimatorListener) this.l2, 44));
        objectAnimatorOfFloat.setDuration(300L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public final void LIZ$7() {
        RelativeLayout.LayoutParams layoutParams;
        int iLIZJ = ((C1245110iVR) this.l0).LIZJ() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(19));
        if (iLIZJ < 0) {
            iLIZJ = 0;
        }
        int height = ((RelativeLayout) this.l1).getHeight() - iLIZJ;
        if (height < 0) {
            height = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = ((View) this.l2).getLayoutParams();
        if ((layoutParams2 instanceof RelativeLayout.LayoutParams) && (layoutParams = (RelativeLayout.LayoutParams) layoutParams2) != null) {
            View view = (View) this.l2;
            if (layoutParams.topMargin != iLIZJ || layoutParams.height != height) {
                layoutParams.topMargin = iLIZJ;
                layoutParams.height = height;
                C786410Ut5.W5(view, layoutParams);
            }
        }
        C786410Ut5.LJLLLLLL(0, (View) this.l2);
    }

    public final void LIZ$8() {
        View view = (View) this.l0;
        if (view != null) {
            C1091400eVW.LIZ((TextView) this.l1, view);
            ((ViewGroup.MarginLayoutParams) ((C19ME) this.l2)).bottomMargin = C439101nJ.LIZ(32);
            C786410Ut5.g6((TextView) this.l1, (C19ME) this.l2);
        }
        C786410Ut5.S4(1.0f, (TextView) this.l1);
        C786410Ut5.Mb(0.0f, (TextView) this.l1);
        C786410Ut5.nc(0.0f, (TextView) this.l1);
        ObjectAnimator duration = ObjectAnimator.ofFloat((TextView) this.l1, (Property<TextView, Float>) View.SCALE_X, 0.0f, 1.2f).setDuration(280L);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat((TextView) this.l1, (Property<TextView, Float>) View.SCALE_X, 1.2f, 1.0f).setDuration(120L);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat((TextView) this.l1, (Property<TextView, Float>) View.SCALE_Y, 0.0f, 1.2f).setDuration(280L);
        ObjectAnimator duration4 = ObjectAnimator.ofFloat((TextView) this.l1, (Property<TextView, Float>) View.SCALE_Y, 1.2f, 1.0f).setDuration(120L);
        PathInterpolator pathInterpolator = new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(duration);
        animatorSet.play(duration2).after(280L);
        animatorSet.play(duration3);
        animatorSet.play(duration4).after(280L);
        animatorSet.setInterpolator(pathInterpolator);
        ObjectAnimator duration5 = ObjectAnimator.ofFloat((TextView) this.l1, (Property<TextView, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(280L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(animatorSet);
        animatorSet2.play(duration5).after(2500L);
        animatorSet2.addListener(new ALAdapterS3S0200000_6(animatorSet2, (TextView) this.l1, 29));
        animatorSet2.start();
    }

    public final void LIZ$9() {
        if (((SeekBar) this.l0).getParent() != null) {
            C437880HFa c437880HFa = (C437880HFa) this.l1;
            SeekBar seekBar = (SeekBar) this.l0;
            c437880HFa.getClass();
            float width = ((seekBar.getWidth() - seekBar.getPaddingStart()) - seekBar.getPaddingEnd()) * (seekBar.getProgress() / seekBar.getMax());
            float paddingStart = seekBar.getPaddingStart() + width;
            float paddingEnd = (seekBar.getPaddingEnd() + r4) - width;
            if (C426750GoL.LIZLLL(c437880HFa.LIZ)) {
                paddingStart = paddingEnd;
            }
            C786410Ut5.Hd((ImageView) this.l2, (paddingStart + ((SeekBar) this.l0).getLeft()) - (((ImageView) this.l2).getWidth() / 2));
        }
    }

    public static final void run$0(ARunnableS39S0300000_6 aRunnableS39S0300000_6) {
        boolean zLIZ;
        C1C7U.LIZ("StellarFragment@cf07.initLoading$2$1$1$1");
        try {
            aRunnableS39S0300000_6.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StellarFragment@cf07.initLoading$2$1$1$1");
    }

    public static final void run$1(ARunnableS39S0300000_6 aRunnableS39S0300000_6) {
        boolean zLIZ;
        C1C7U.LIZ("PollCreateFragment@b279.playExitAnimation$1");
        try {
            aRunnableS39S0300000_6.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PollCreateFragment@b279.playExitAnimation$1");
    }

    public static final void run$10(ARunnableS39S0300000_6 aRunnableS39S0300000_6) {
        boolean zLIZ;
        C1C7U.LIZ("LiveReplayPlayerUIUtil@2b13.hideViewWithAnimation$1");
        try {
            aRunnableS39S0300000_6.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveReplayPlayerUIUtil@2b13.hideViewWithAnimation$1");
    }

    public static final void run$11(ARunnableS39S0300000_6 aRunnableS39S0300000_6) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileBgEditHelper@6e35.injectContentSheetLayer$1");
        try {
            aRunnableS39S0300000_6.LIZ$7();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileBgEditHelper@6e35.injectContentSheetLayer$1");
    }

    public static final void run$12(ARunnableS39S0300000_6 aRunnableS39S0300000_6) {
        boolean zLIZ;
        C1C7U.LIZ("PoiReviewsNavAssem@1ad8.constructReviewCenterIconAnimeParams$2");
        try {
            TuxIconView tuxIconView = (TuxIconView) aRunnableS39S0300000_6.l0;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            }
            ((C21647019ng) aRunnableS39S0300000_6.l1).LJI(true);
            ((C21647019ng) aRunnableS39S0300000_6.l2).LJI(true);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiReviewsNavAssem@1ad8.constructReviewCenterIconAnimeParams$2");
    }

    public static final void run$13(ARunnableS39S0300000_6 aRunnableS39S0300000_6) {
        boolean zLIZ;
        C1C7U.LIZ("TitleBarHintManager@a8df.animateThoughtBubbleRowForExpanded$1");
        try {
            C786410Ut5.LJLLLLLL(8, (View) aRunnableS39S0300000_6.l0);
            C786410Ut5.LJLLLLLL(8, ((C21646719nd) aRunnableS39S0300000_6.l1).LIZJ);
            C786410Ut5.ed((View) aRunnableS39S0300000_6.l2, 0.0f);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TitleBarHintManager@a8df.animateThoughtBubbleRowForExpanded$1");
    }

    public static final void run$14(ARunnableS39S0300000_6 aRunnableS39S0300000_6) {
        boolean zLIZ;
        C1C7U.LIZ("FriendsShareInviteContentView@6be9.takeFollowIconAnimation$firstStep$1");
        try {
            ((TuxIconView) aRunnableS39S0300000_6.l0).animate().scaleX(1.06f).scaleY(1.06f).setInterpolator((Interpolator) aRunnableS39S0300000_6.l1).setDuration(50L).withEndAction((Runnable) aRunnableS39S0300000_6.l2).start();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FriendsShareInviteContentView@6be9.takeFollowIconAnimation$firstStep$1");
    }

    public static final void run$15(ARunnableS39S0300000_6 aRunnableS39S0300000_6) {
        boolean zLIZ;
        C1C7U.LIZ("FriendsShareInviteContentView@6be9.takeFollowIconAnimation$secondStep$1");
        try {
            ((TuxIconView) aRunnableS39S0300000_6.l0).animate().scaleX(0.0f).scaleY(0.0f).setDuration(150L).setInterpolator((Interpolator) aRunnableS39S0300000_6.l1).withEndAction((Runnable) aRunnableS39S0300000_6.l2).start();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FriendsShareInviteContentView@6be9.takeFollowIconAnimation$secondStep$1");
    }

    public static final void run$16(ARunnableS39S0300000_6 aRunnableS39S0300000_6) {
        boolean zLIZ;
        C1C7U.LIZ("LiveQuickChargeAnimationHelper@8b9d.showRechargePropertyAnimation$1");
        try {
            aRunnableS39S0300000_6.LIZ$8();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveQuickChargeAnimationHelper@8b9d.showRechargePropertyAnimation$1");
    }

    public static final void run$17(ARunnableS39S0300000_6 aRunnableS39S0300000_6) {
        boolean zLIZ;
        C1C7U.LIZ("TakoSubConversationHelper@6526.showConversationDrawerTip$2$1");
        try {
            if (((Boolean) ((Function0) aRunnableS39S0300000_6.l0).invoke()).booleanValue()) {
                C13MK.LIZLLL(new AwS407S0200000_6((View) aRunnableS39S0300000_6.l1, (Function0) aRunnableS39S0300000_6.l2, 82));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoSubConversationHelper@6526.showConversationDrawerTip$2$1");
    }

    public static final void run$18(ARunnableS39S0300000_6 aRunnableS39S0300000_6) {
        boolean zLIZ;
        C1C7U.LIZ("EffectBottomAction@1b7c.updateUI$1");
        try {
            if (((View) aRunnableS39S0300000_6.l0).getParent() != null) {
                TextView textView = (TextView) aRunnableS39S0300000_6.l1;
                ((C1394210mNv) aRunnableS39S0300000_6.l2).getClass();
                textView.setText(2131857979);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EffectBottomAction@1b7c.updateUI$1");
    }

    public static final void run$19(ARunnableS39S0300000_6 aRunnableS39S0300000_6) {
        boolean zLIZ;
        C1C7U.LIZ("MDPSquareTemplateBottomAction@2131.updateUI$1");
        try {
            if (((View) aRunnableS39S0300000_6.l0).getParent() != null) {
                TextView textView = (TextView) aRunnableS39S0300000_6.l1;
                ((C1394540mOS) aRunnableS39S0300000_6.l2).getClass();
                textView.setText(2131857993);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MDPSquareTemplateBottomAction@2131.updateUI$1");
    }

    public static final void run$2(ARunnableS39S0300000_6 aRunnableS39S0300000_6) {
        boolean zLIZ;
        C1C7U.LIZ("AnchorBizUtils@b393.fillSellerBrandInfo$1$1$1");
        try {
            aRunnableS39S0300000_6.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnchorBizUtils@b393.fillSellerBrandInfo$1$1$1");
    }

    public static final void run$20(ARunnableS39S0300000_6 aRunnableS39S0300000_6) {
        boolean zLIZ;
        C1C7U.LIZ("EmojiSliderReactionManager@96b6.initAverageHeader$1");
        try {
            aRunnableS39S0300000_6.LIZ$9();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EmojiSliderReactionManager@96b6.initAverageHeader$1");
    }

    public static final void run$21(ARunnableS39S0300000_6 aRunnableS39S0300000_6) {
        boolean zLIZ;
        C1C7U.LIZ("SeaPdpBottomMynaBannerMgr@c0be.doPopupBottomHideAnimation$1");
        try {
            aRunnableS39S0300000_6.LIZ$10();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SeaPdpBottomMynaBannerMgr@c0be.doPopupBottomHideAnimation$1");
    }

    public static final void run$22(ARunnableS39S0300000_6 aRunnableS39S0300000_6) {
        boolean zLIZ;
        C1C7U.LIZ("SeaPdpBottomMynaBannerMgr@c0be.doPopupBottomShowAnimation$1");
        try {
            aRunnableS39S0300000_6.LIZ$11();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SeaPdpBottomMynaBannerMgr@c0be.doPopupBottomShowAnimation$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$23(ARunnableS39S0300000_6 aRunnableS39S0300000_6) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileInfoNicknameBadgeManager@3696.showAlertBadge$1");
        try {
            ((C0HZL) aRunnableS39S0300000_6.l0).LJ((Drawable) ((C259800zU) aRunnableS39S0300000_6.l1).element, (TuxTextView) aRunnableS39S0300000_6.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileInfoNicknameBadgeManager@3696.showAlertBadge$1");
    }

    public static final void run$24(ARunnableS39S0300000_6 aRunnableS39S0300000_6) {
        boolean zLIZ;
        C440750HQb c440750HQb;
        C1C7U.LIZ("MixStudioResultsPageV2Assem@459e.onIndexUpdate$1");
        try {
            C440750HQb c440750HQb2 = ((MixStudioResultsPageV2Assem) aRunnableS39S0300000_6.l0).LLLJL;
            if (c440750HQb2 != null && c440750HQb2.getParent() != null && (c440750HQb = ((MixStudioResultsPageV2Assem) aRunnableS39S0300000_6.l0).LLLJL) != null) {
                c440750HQb.LIZ((C440830HQj) aRunnableS39S0300000_6.l1, (C440820HQi) aRunnableS39S0300000_6.l2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MixStudioResultsPageV2Assem@459e.onIndexUpdate$1");
    }

    public static final void run$25(ARunnableS39S0300000_6 aRunnableS39S0300000_6) {
        boolean zLIZ;
        C1C7U.LIZ("PdpPopupMgr@c3e4.doPopupBottomHideAnimation$1");
        try {
            aRunnableS39S0300000_6.LIZ$12();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PdpPopupMgr@c3e4.doPopupBottomHideAnimation$1");
    }

    public static final void run$26(ARunnableS39S0300000_6 aRunnableS39S0300000_6) {
        boolean zLIZ;
        C1C7U.LIZ("PdpPopupMgr@c3e4.doPopupBottomShowAnimation$1");
        try {
            aRunnableS39S0300000_6.LIZ$13();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PdpPopupMgr@c3e4.doPopupBottomShowAnimation$1");
    }

    public static final void run$27(ARunnableS39S0300000_6 aRunnableS39S0300000_6) {
        boolean zLIZ;
        C1C7U.LIZ("LiveNotificationItem@bfb8.bindTitleText$1$3");
        try {
            aRunnableS39S0300000_6.LIZ$14();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveNotificationItem@bfb8.bindTitleText$1$3");
    }

    public static final void run$28(ARunnableS39S0300000_6 aRunnableS39S0300000_6) {
        boolean zLIZ;
        C1C7U.LIZ("MultiGuestPreviewLiveUtilKt@a517.showMaxPosPopup$2");
        try {
            aRunnableS39S0300000_6.LIZ$15();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MultiGuestPreviewLiveUtilKt@a517.showMaxPosPopup$2");
    }

    public static final void run$29(ARunnableS39S0300000_6 aRunnableS39S0300000_6) {
        boolean zLIZ;
        C1C7U.LIZ("ECBillboardContentView@5ff7.showPic$2$1$onCompleted$1");
        try {
            aRunnableS39S0300000_6.LIZ$16();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ECBillboardContentView@5ff7.showPic$2$1$onCompleted$1");
    }

    public static final void run$3(ARunnableS39S0300000_6 aRunnableS39S0300000_6) {
        boolean zLIZ;
        C1C7U.LIZ("VideoDiggAssem@a0f1.commerceLikeEffectDiggToLike$1$1");
        try {
            ((C731940SnQ) aRunnableS39S0300000_6.l0).LJIIJJI((View) aRunnableS39S0300000_6.l1, (Aweme) aRunnableS39S0300000_6.l2);
            System.currentTimeMillis();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoDiggAssem@a0f1.commerceLikeEffectDiggToLike$1$1");
    }

    public static final void run$30(ARunnableS39S0300000_6 aRunnableS39S0300000_6) {
        boolean zLIZ;
        C1C7U.LIZ("MessageLongPressDecorationHelper@9454.updateState$$inlined$postWhenAttached$1");
        try {
            aRunnableS39S0300000_6.LIZ$17();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MessageLongPressDecorationHelper@9454.updateState$$inlined$postWhenAttached$1");
    }

    public static final void run$4(ARunnableS39S0300000_6 aRunnableS39S0300000_6) {
        boolean zLIZ;
        C1C7U.LIZ("PostModeCommentListFragmentV2@35e6.scrollToDescriptionArea$1$1");
        try {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((PostModeCommentListFragmentV2) aRunnableS39S0300000_6.l0), null, null, new C434150H0r((C0SU0) aRunnableS39S0300000_6.l1, (Float) aRunnableS39S0300000_6.l2, null), 3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PostModeCommentListFragmentV2@35e6.scrollToDescriptionArea$1$1");
    }

    public static final void run$5(ARunnableS39S0300000_6 aRunnableS39S0300000_6) {
        boolean zLIZ;
        C1C7U.LIZ("ITransitionAnimatorView@e36a.fadeOutFadeIn$1$1$1");
        try {
            C786410Ut5.LJLLLLLL(8, (View) aRunnableS39S0300000_6.l0);
            ((C21647019ng) aRunnableS39S0300000_6.l1).LJI(true);
            ((Function0) aRunnableS39S0300000_6.l2).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ITransitionAnimatorView@e36a.fadeOutFadeIn$1$1$1");
    }

    public static final void run$6(ARunnableS39S0300000_6 aRunnableS39S0300000_6) {
        boolean zLIZ;
        C1C7U.LIZ("EditLyricStickerEffectWrapperScene@d4d6.translatePanel$runTranslateAnim$1");
        try {
            ((Function0) aRunnableS39S0300000_6.l0).invoke();
            View viewLLLLLJIL = ((C197004125y) aRunnableS39S0300000_6.l1).LLLLLJIL();
            if (viewLLLLLJIL != null) {
                viewLLLLLJIL.setClickable(true);
            }
            ((Function0) aRunnableS39S0300000_6.l2).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditLyricStickerEffectWrapperScene@d4d6.translatePanel$runTranslateAnim$1");
    }

    public static final void run$7(ARunnableS39S0300000_6 aRunnableS39S0300000_6) {
        boolean zLIZ;
        C1C7U.LIZ("EditToolbarHelperKt@3637.showPhotoModeAutoCutMessageToolTip$$inlined$postDelayed$1");
        try {
            aRunnableS39S0300000_6.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditToolbarHelperKt@3637.showPhotoModeAutoCutMessageToolTip$$inlined$postDelayed$1");
    }

    public static final void run$8(ARunnableS39S0300000_6 aRunnableS39S0300000_6) {
        boolean zLIZ;
        C1C7U.LIZ("AnchorPanelAdapter@4c56.configDepositInfoAndHorizontalLayout$2");
        try {
            aRunnableS39S0300000_6.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnchorPanelAdapter@4c56.configDepositInfoAndHorizontalLayout$2");
    }

    public static final void run$9(ARunnableS39S0300000_6 aRunnableS39S0300000_6) {
        boolean zLIZ;
        C1C7U.LIZ("FavoriteBubbleManager@c820.handleShow$1");
        try {
            aRunnableS39S0300000_6.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FavoriteBubbleManager@c820.handleShow$1");
    }

    public ARunnableS39S0300000_6(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }

    public ARunnableS39S0300000_6(C731940SnQ c731940SnQ, View view, Aweme aweme, long j, int i) {
        this.$t = i;
        this.l0 = c731940SnQ;
        this.l1 = view;
        this.l2 = aweme;
    }
}
