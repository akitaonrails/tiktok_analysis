package Y;

import X.AbstractC2254741DMy;
import X.C0TI7;
import X.C0VSJ;
import X.C1017580caS;
import X.C1040010dAd;
import X.C1282850jUJ;
import X.C1283030jUb;
import X.C12ES;
import X.C1321640kUs;
import X.C1867350yh3;
import X.C1C7U;
import X.C1D41;
import X.C1DJL;
import X.C1DO9;
import X.C1DOG;
import X.C1DOH;
import X.C1DOI;
import X.C1DTM;
import X.C1DTS;
import X.C1DXY;
import X.C1DYS;
import X.C1DYT;
import X.C1DZ6;
import X.C1DZD;
import X.C1ED4;
import X.C21388418n4;
import X.C2179971ATj;
import X.C2183341Ace;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2249361D2g;
import X.C2250011D4t;
import X.C2252251DDj;
import X.C2253401DHu;
import X.C2254071DKj;
import X.C2254301DLg;
import X.C2254731DMx;
import X.C2259821Dci;
import X.C2259831Dcj;
import X.C2259841Dck;
import X.C2259851Dcl;
import X.C2260931DeV;
import X.C2261011Ded;
import X.C2261031Def;
import X.C2261041Deg;
import X.C2261061Dei;
import X.C2273721Dz8;
import X.C2484209oO;
import X.C444960Hcc;
import X.C786410Ut5;
import X.C844470XAv;
import X.C988710bpt;
import X.EnumC1159870gHx;
import X.InterfaceC1283430jVF;
import X.InterfaceC2254081DKk;
import X.InterfaceC2254691DMt;
import X.InterfaceC2273731Dz9;
import X.ViewOnTouchListenerC2260921DeU;
import X.ViewTreeObserverOnDrawListenerC2254101DKm;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.util.AndroidRuntimeException;
import android.view.OrientationEventListener;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.bytedance.android.live.livepullstream.PullStreamService;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.otis.resource.psi.ResourcePsiMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttvecamera.b0;
import com.ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.ui.component.b1;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.vesdk.VECameraCapture;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.runtime.VEEditorResManager;
import com.tts.oecverify.BdTuring;
import java.lang.ref.Reference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes36.dex */
public class ARunnableS135S0100000_35 implements Runnable {
    public final int $t;
    public Object l0;

    public static final void run$27(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        ((ResourcePsiMonitor) aRunnableS135S0100000_35.l0).lambda$setGcUnionEnabled$1();
    }

    public final void LIZ$0() {
        synchronized (this) {
            try {
                ((ViewDataBinding) this.l0).LLILLJJLI = false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        while (true) {
            Reference<? extends ViewDataBinding> referencePoll = ViewDataBinding.LLJJIJIL.poll();
            if (referencePoll == null) {
                break;
            } else if (referencePoll instanceof C1DTS) {
                ((C1DTS) referencePoll).LIZ();
            }
        }
        if (((ViewDataBinding) this.l0).LLILZ.isAttachedToWindow()) {
            ((ViewDataBinding) this.l0).LJFF();
            return;
        }
        View view = ((ViewDataBinding) this.l0).LLILZ;
        C1DTM c1dtm = ViewDataBinding.LLJJJ;
        view.removeOnAttachStateChangeListener(c1dtm);
        ((ViewDataBinding) this.l0).LLILZ.addOnAttachStateChangeListener(c1dtm);
    }

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$1() {
        C2252251DDj c2252251DDj = (C2252251DDj) this.l0;
        if (c2252251DDj.LJFF) {
            int i = c2252251DDj.LJII;
            int i2 = c2252251DDj.LIZLLL;
            if (i == i2) {
                if (c2252251DDj.LJ) {
                    c2252251DDj.LIZ.scrollBy(i2, 0);
                } else {
                    c2252251DDj.LIZ.scrollBy(-i2, 0);
                }
                c2252251DDj.LJII = 0;
                c2252251DDj.LJI++;
            }
            if (c2252251DDj.LJI < c2252251DDj.LIZJ) {
                c2252251DDj.LJII++;
                c2252251DDj.LIZ.scrollBy(c2252251DDj.LJ ? -1 : 1, 0);
            } else {
                c2252251DDj.LJFF = false;
            }
            c2252251DDj.LIZ.invalidate();
            C2252251DDj c2252251DDj2 = (C2252251DDj) this.l0;
            HandlerHook.viewPostDelay(c2252251DDj2.LIZ, new ARunnableS135S0100000_35(c2252251DDj2, 11), 1000 / ((long) c2252251DDj2.LIZIZ));
        }
    }

    public final void LIZ$2() {
        ((C1DOG) this.l0).LL.LJIILIIL();
        boolean zBooleanValue = VEConfigCenter.getInstance().getValue("ve_reverse_opt_storage", false).booleanValue();
        if (!zBooleanValue) {
            C1DOG c1dog = (C1DOG) this.l0;
            c1dog.LLIZ.mVideoPaths = new String[]{c1dog.LLILLL};
        }
        C1DOG c1dog2 = (C1DOG) this.l0;
        if (c1dog2.LLILLJJLI) {
            c1dog2.LLIZ.mReverseAudioPaths = new String[]{c1dog2.LLILZLL};
        }
        VEEditorResManager vEEditorResManager = c1dog2.LLIZ;
        vEEditorResManager.mReverseVideoPath = new String[]{c1dog2.LLILZ};
        vEEditorResManager.mReverseDone = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reverse compileDone: needSeparateAudioPath = ");
        sbLIZ.append(((C1DOG) this.l0).LLILLJJLI);
        C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("reverse compileDone: mOriginalSoundTrackType = ");
        sbLIZ2.append(((C1DOG) this.l0).LLIZ.mOriginalSoundTrackType);
        C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ2));
        C1DOH c1doh = ((C1DOG) this.l0).LLIZLLLIL;
        if (c1doh != null) {
            c1doh.LIZIZ(0);
        }
        if (!zBooleanValue || ((C1DOG) this.l0).LLILLL.isEmpty()) {
            return;
        }
        C0VSJ c0vsj = new C0VSJ(((C1DOG) this.l0).LLILLL);
        if (c0vsj.exists() && c0vsj.isFile()) {
            try {
                if (c0vsj.delete()) {
                    return;
                }
                C2484209oO.LIZJ("VEEditor", "reverse delete all I video file failed");
            } catch (SecurityException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("reverse delete all I video file catch exception: ");
                sbLIZ3.append(e.getMessage());
                C2484209oO.LIZJ("VEEditor", C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
    }

    public final void LIZ$3() {
        C1DYS c1dys = (C1DYS) this.l0;
        if (!c1dys.LIZJ) {
            c1dys.LIZ();
            return;
        }
        if (c1dys.LJIJ == EnumC1159870gHx.LLILLJJLI) {
            HandlerHook.viewRemoveCallbacks(c1dys.LIZ, c1dys.LJIIZILJ);
            Animator animator = c1dys.LJIIIZ;
            if (animator != null) {
                animator.cancel();
            }
            ValueAnimator valueAnimator = (ValueAnimator) c1dys.LJIILLIIL.getValue();
            valueAnimator.setFloatValues(c1dys.LJI, c1dys.LJII);
            float f = c1dys.LIZLLL;
            float f2 = c1dys.LJI;
            float f3 = c1dys.LJII;
            c1dys.LIZIZ(valueAnimator, f3 == f2 ? 0.0f : (f - f2) / (f3 - f2));
            c1dys.LJIIIZ = valueAnimator;
        }
    }

    public final void LIZ$4() {
        C1DYS c1dys = ((C1DYT) this.l0).LLILZIL;
        EnumC1159870gHx enumC1159870gHx = c1dys.LJIJ;
        EnumC1159870gHx enumC1159870gHx2 = EnumC1159870gHx.LLILLJJLI;
        if (enumC1159870gHx != enumC1159870gHx2) {
            HandlerHook.viewRemoveCallbacks(c1dys.LIZ, c1dys.LJIIZILJ);
            Animator animator = c1dys.LJIIIZ;
            if (animator != null) {
                animator.cancel();
            }
            ValueAnimator valueAnimator = (ValueAnimator) c1dys.LJIIL.getValue();
            valueAnimator.start();
            c1dys.LJIIIZ = valueAnimator;
            c1dys.LJIJ = enumC1159870gHx2;
        }
    }

    public final void LIZ$5() {
        C2261031Def c2261031Def = (C2261031Def) this.l0;
        AwemePlayFunModel awemePlayFunModel = c2261031Def.LIZ.LIZLLL;
        float f = (awemePlayFunModel != null ? awemePlayFunModel.showDuration : 0.0f) * LSPassThroughRecordSizeConfig.DEFAULT;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(f > 0.0f ? (long) f : 3000L);
        c2261031Def.LJI(valueAnimatorOfFloat);
        Animator animator = ((C2261031Def) this.l0).LIZJ;
        if (animator != null) {
            animator.start();
        }
        ((C2261031Def) this.l0).LIZ.LJIIJ = System.currentTimeMillis();
        C2260931DeV c2260931DeV = ((C2261031Def) this.l0).LIZ;
        View view = c2260931DeV.LJI;
        View view2 = c2260931DeV.LJFF;
        C786410Ut5.T4(view, 0.0f);
        C786410Ut5.LJLLLLLL(0, view);
        view.measure(0, 0);
        int measuredWidth = view.getMeasuredWidth();
        C2261031Def c2261031Def2 = (C2261031Def) this.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("eggTitleViewWidth: ");
        sbLIZ.append(measuredWidth);
        C2188811AlT.LIZIZ(sbLIZ);
        c2261031Def2.getClass();
        C786410Ut5.Jc(view, C444960Hcc.LIZIZ() ? (view2.getTranslationX() - (view2.getWidth() / 2.0f)) + (measuredWidth / 2.0f) : (view2.getTranslationX() + (view2.getWidth() / 2.0f)) - (measuredWidth / 2.0f));
        float translationY = view2.getTranslationY();
        C2261031Def c2261031Def3 = (C2261031Def) this.l0;
        float f2 = translationY + c2261031Def3.LIZ.LIZIZ.LIZ;
        C844470XAv.LIZ.getClass();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", C12ES.LIZJ(25.0f, C844470XAv.LIZ()) + f2, f2);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
        c2261031Def3.LIZLLL = animatorSet;
        Animator animator2 = ((C2261031Def) this.l0).LIZLLL;
        if (animator2 != null) {
            animator2.addListener(new ALAdapterS28S0100000_35((C2261031Def) this.l0, 6));
        }
        Animator animator3 = ((C2261031Def) this.l0).LIZLLL;
        if (animator3 != null) {
            animator3.start();
        }
        C2260931DeV c2260931DeV2 = ((C2261031Def) this.l0).LIZ;
        Point point = new Point((int) view2.getTranslationX(), (int) view2.getTranslationY());
        Point point2 = new Point((int) view.getTranslationX(), (int) f2);
        ViewOnTouchListenerC2260921DeU viewOnTouchListenerC2260921DeU = c2260931DeV2.LIZ;
        viewOnTouchListenerC2260921DeU.getClass();
        C1017580caS.LIZIZ(viewOnTouchListenerC2260921DeU.LLIZ, true, "show_in_center", point, point2);
    }

    public final void LIZ$6() {
        PointF pointF;
        C2261011Ded c2261011Ded = (C2261011Ded) this.l0;
        C2260931DeV c2260931DeV = c2261011Ded.LIZ;
        AwemePlayFunModel awemePlayFunModel = c2260931DeV.LIZLLL;
        float f = (awemePlayFunModel != null ? awemePlayFunModel.startDuration : 0.0f) * LSPassThroughRecordSizeConfig.DEFAULT;
        C2261041Deg c2261041Deg = new C2261041Deg();
        c2261041Deg.LIZ = f;
        if (awemePlayFunModel == null) {
            pointF = new PointF(0.0f, 0.0f);
        } else {
            View view = (View) c2260931DeV.LIZ.getParent();
            C988710bpt c988710bpt = c2261011Ded.LIZ.LJIIJJI;
            int width = c988710bpt != null ? c988710bpt.LIZ : view.getWidth();
            C988710bpt c988710bpt2 = c2261011Ded.LIZ.LJIIJJI;
            int width2 = c988710bpt2 != null ? c988710bpt2.LIZIZ : view.getWidth();
            int width3 = width < view.getWidth() ? (view.getWidth() - width) / 2 : 0;
            int height = width2 < view.getHeight() ? (view.getHeight() - width2) / 2 : 0;
            int width4 = width > view.getWidth() ? (width - view.getWidth()) / 2 : 0;
            int height2 = width2 > view.getHeight() ? (width2 - view.getHeight()) / 2 : 0;
            int i = c2261011Ded.LIZ.LIZIZ.LIZ;
            float f2 = (width * awemePlayFunModel.positionX) - width4;
            float f3 = i / 2;
            float f4 = (f2 - f3) + width3;
            if (C444960Hcc.LIZIZ()) {
                f4 = -((view.getWidth() - i) - f4);
            }
            pointF = new PointF(f4, (((width2 * awemePlayFunModel.positionY) - height2) - f3) + height);
        }
        c2261041Deg.LIZIZ = pointF.x;
        c2261041Deg.LIZJ = pointF.y;
        C2261011Ded c2261011Ded2 = (C2261011Ded) this.l0;
        float f5 = c2261011Ded2.LIZ.LIZIZ.LIZJ;
        if (C444960Hcc.LIZIZ()) {
            f5 = -f5;
        }
        C2260931DeV c2260931DeV2 = c2261011Ded2.LIZ;
        float f6 = c2260931DeV2.LIZIZ.LIZIZ;
        c2260931DeV2.LIZ.getLocationOnScreen(new int[2]);
        PointF pointF2 = new PointF(f5, f6 - r0[1]);
        c2261041Deg.LJFF = pointF2.x;
        c2261041Deg.LJI = pointF2.y;
        c2261041Deg.LJ = awemePlayFunModel != null ? awemePlayFunModel.angle : 0;
        c2261041Deg.LIZLLL = 0.0f;
        C2261061Dei c2261061DeiLIZ = c2261041Deg.LIZ();
        C2261011Ded c2261011Ded3 = (C2261011Ded) this.l0;
        C2260931DeV c2260931DeV3 = c2261011Ded3.LIZ;
        int i2 = c2260931DeV3.LIZIZ.LIZ;
        View view2 = c2260931DeV3.LJFF;
        view2.setPivotX(i2 / 2.0f);
        view2.setPivotY(r2.LIZ / 2.0f);
        C786410Ut5.Jc(view2, c2261061DeiLIZ.LIZIZ);
        C786410Ut5.ed(view2, c2261061DeiLIZ.LIZJ);
        C786410Ut5.Ob(view2, c2261061DeiLIZ.LIZLLL);
        C786410Ut5.pc(view2, c2261061DeiLIZ.LIZLLL);
        C786410Ut5.Ab(view2, c2261061DeiLIZ.LJ);
        Path path = new Path();
        path.moveTo(c2261061DeiLIZ.LIZIZ, c2261061DeiLIZ.LIZJ);
        path.lineTo(c2261061DeiLIZ.LJFF, c2261061DeiLIZ.LJI);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, "translationX", "translationY", path);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, "scaleX", c2261061DeiLIZ.LIZLLL, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, "ScaleY", c2261061DeiLIZ.LIZLLL, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view2, "rotation", c2261061DeiLIZ.LJ, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        float f7 = c2261061DeiLIZ.LIZ;
        animatorSet.setDuration(f7 > 0.0f ? (long) f7 : 500L);
        animatorSet.setInterpolator(new C21388418n4());
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4);
        c2261011Ded3.LJI(animatorSet);
        C786410Ut5.T4(((C2261011Ded) this.l0).LIZ.LJFF, 1.0f);
        Animator animator = ((C2261011Ded) this.l0).LIZJ;
        if (animator != null) {
            animator.start();
        }
        ((C2261011Ded) this.l0).LIZ.getClass();
        long j = ((long) f) / ((long) 2);
        C786410Ut5.T4(((C2261011Ded) this.l0).LIZ.LJ, 0.0f);
        C2261011Ded c2261011Ded4 = (C2261011Ded) this.l0;
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(c2261011Ded4.LIZ.LJ, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat5.setDuration(j);
        c2261011Ded4.LIZLLL = objectAnimatorOfFloat5;
        Animator animator2 = ((C2261011Ded) this.l0).LIZLLL;
        if (animator2 != null) {
            animator2.setStartDelay(j);
        }
        Animator animator3 = ((C2261011Ded) this.l0).LIZLLL;
        if (animator3 != null) {
            animator3.start();
        }
        C2260931DeV c2260931DeV4 = ((C2261011Ded) this.l0).LIZ;
        Point point = new Point((int) c2261061DeiLIZ.LIZIZ, (int) c2261061DeiLIZ.LIZJ);
        ViewOnTouchListenerC2260921DeU viewOnTouchListenerC2260921DeU = c2260931DeV4.LIZ;
        viewOnTouchListenerC2260921DeU.getClass();
        C1017580caS.LIZIZ(viewOnTouchListenerC2260921DeU.LLIZ, true, "start_expand", point, null);
    }

    public static final void run$0(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        try {
            aRunnableS135S0100000_35.LIZ$0();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public static final void run$1(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        PullStreamService pullStreamService = (PullStreamService) aRunnableS135S0100000_35.l0;
        C1C7U.LIZ("PullStreamService@76ad.onInit$1L");
        pullStreamService.getClass();
        C0TI7.LIZ = new C1ED4();
        C1C7U.LIZIZ("PullStreamService@76ad.onInit$1L");
    }

    public static final void run$10(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        boolean zLIZ;
        C1C7U.LIZ("TECamera2$CameraStateCallback@a425.onDisconnected$1");
        try {
            C2254731DMx c2254731DMx = (C2254731DMx) aRunnableS135S0100000_35.l0;
            c2254731DMx.LLFFF(c2254731DMx.LJIL);
            C2254731DMx c2254731DMx2 = (C2254731DMx) aRunnableS135S0100000_35.l0;
            InterfaceC2254691DMt interfaceC2254691DMt = c2254731DMx2.LIZLLL;
            if (interfaceC2254691DMt != null) {
                interfaceC2254691DMt.LIZJ(c2254731DMx2.LJJJLIIL, c2254731DMx2.LIZIZ.LLILLJJLI, -409, "Camera onDisconnected");
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TECamera2$CameraStateCallback@a425.onDisconnected$1");
    }

    public static final void run$11(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        boolean zLIZ;
        C1C7U.LIZ("MarqueeLinearLayout$Marquee@96c5.action$1$1");
        try {
            ((C2252251DDj) aRunnableS135S0100000_35.l0).LJIIIIZZ.run();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MarqueeLinearLayout$Marquee@96c5.action$1$1");
    }

    public static final void run$12(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        boolean zLIZ;
        C1C7U.LIZ("MarqueeLinearLayout$Marquee@96c5.action$1");
        try {
            aRunnableS135S0100000_35.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MarqueeLinearLayout$Marquee@96c5.action$1");
    }

    public static final void run$13(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        ViewTreeObserverOnDrawListenerC2254101DKm viewTreeObserverOnDrawListenerC2254101DKm = (ViewTreeObserverOnDrawListenerC2254101DKm) aRunnableS135S0100000_35.l0;
        viewTreeObserverOnDrawListenerC2254101DKm.getClass();
        C1C7U.LIZ("CommonCameraLogicComponent@aa1e.<init>$2$onDraw$1L");
        InterfaceC2254081DKk interfaceC2254081DKk = viewTreeObserverOnDrawListenerC2254101DKm.LL.LLLIIL;
        if (interfaceC2254081DKk != null) {
            C786410Ut5.B3(interfaceC2254081DKk.getViewFunction().getView().getViewTreeObserver(), viewTreeObserverOnDrawListenerC2254101DKm);
        }
        C1C7U.LIZIZ("CommonCameraLogicComponent@aa1e.<init>$2$onDraw$1L");
    }

    public static final void run$14(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        C2254071DKj.T9((C2254071DKj) aRunnableS135S0100000_35.l0);
    }

    public static final void run$15(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        C2253401DHu.Gd((C2253401DHu) aRunnableS135S0100000_35.l0);
    }

    public static final void run$16(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        C2254071DKj.Z7((C2254071DKj) aRunnableS135S0100000_35.l0);
    }

    public static final void run$17(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        C2254071DKj.j9((C2254071DKj) aRunnableS135S0100000_35.l0);
    }

    public static final void run$18(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        b1.hf((b1) aRunnableS135S0100000_35.l0);
    }

    public static final void run$19(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        C2254301DLg c2254301DLg = (C2254301DLg) aRunnableS135S0100000_35.l0;
        c2254301DLg.getClass();
        C1C7U.LIZ("TERecorder@aadd.<init>$1$onCallback$1L");
        ((VECameraCapture) c2254301DLg.LIZ.LJJJJJ).LJJIIJZLJL();
        C1C7U.LIZIZ("TERecorder@aadd.<init>$1$onCallback$1L");
    }

    public static final void run$2(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        boolean zLIZ;
        C1C7U.LIZ("ReusedUIContentAssem@9d2.onStop$1$1");
        try {
            super/*com.bytedance.assem.arch.reused.ReusedAssem*/.onStop();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ReusedUIContentAssem@9d2.onStop$1$1");
    }

    public static final void run$20(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        boolean zLIZ;
        C1C7U.LIZ("VEEditor@7fe9.genReverseVideoWithEditor$1$onCallback$1");
        try {
            aRunnableS135S0100000_35.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VEEditor@7fe9.genReverseVideoWithEditor$1$onCallback$1");
    }

    public static final void run$21(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        boolean zLIZ;
        C1C7U.LIZ("VEEditor@7fe9.genReverseVideoWithEditor$2$onCallback$1");
        try {
            ((C1DOI) aRunnableS135S0100000_35.l0).LL.LJIILIIL();
            C1DOH c1doh = ((C1DOI) aRunnableS135S0100000_35.l0).LLILLJJLI;
            if (c1doh != null) {
                c1doh.LIZIZ(-1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VEEditor@7fe9.genReverseVideoWithEditor$2$onCallback$1");
    }

    public static final void run$22(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        C2250011D4t c2250011D4t = (C2250011D4t) aRunnableS135S0100000_35.l0;
        c2250011D4t.getClass();
        C1C7U.LIZ("BwProbeServiceImpl@c209.setupProgressTracker$1L");
        if (c2250011D4t.LJIL && c2250011D4t.LIZLLL.LIZJ) {
            C1282850jUJ c1282850jUJLJFF = c2250011D4t.LJFF();
            if (c1282850jUJLJFF == null) {
                C1C7U.LIZIZ("BwProbeServiceImpl@c209.setupProgressTracker$1L");
                return;
            }
            C2249361D2g c2249361D2g = new C2249361D2g();
            try {
                c2249361D2g.LIZ = new JSONObject(c1282850jUJLJFF.LIZLLL).optInt("level");
                c2249361D2g.LIZIZ = c1282850jUJLJFF.LIZIZ;
                c2249361D2g.LIZJ = c2250011D4t.LJJIJL;
                C1D41 c1d41 = c2250011D4t.LIZ;
                if (c1d41 != null) {
                    c1d41.LIZIZ(c2249361D2g);
                }
                int i = c2250011D4t.LJJIJL + 1;
                c2250011D4t.LJJIJL = i;
                if (i >= 10) {
                    AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("setupProgressTracker progress over limit");
                    InterfaceC1283430jVF interfaceC1283430jVF = C1283030jUb.LIZ.LIZ;
                    if (interfaceC1283430jVF != null) {
                        interfaceC1283430jVF.LJFF("BwProbeServiceImpl.setupProgressTracker", androidRuntimeException);
                    }
                    c2250011D4t.LJJIJL = 0;
                    HashMap map = (HashMap) C1867350yh3.LIZ;
                    Timer timer = (Timer) map.get("probe_progress_task");
                    if (timer != null) {
                        timer.cancel();
                        map.remove("probe_progress_task");
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C1C7U.LIZIZ("BwProbeServiceImpl@c209.setupProgressTracker$1L");
    }

    public static final void run$23(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        C1DO9 c1do9 = (C1DO9) aRunnableS135S0100000_35.l0;
        C1C7U.LIZ("EEBlockUtils@e8b6.callBlock$1L");
        c1do9.onSuccess();
        C1C7U.LIZIZ("EEBlockUtils@e8b6.callBlock$1L");
    }

    public static final void run$24(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        C1DZ6 c1dz6 = (C1DZ6) aRunnableS135S0100000_35.l0;
        String str = C1DZ6.LLLF;
        C1C7U.LIZ("VideoSeekBar@40f6.<init>$1L");
        c1dz6.LJ(C1DZD.TIMEOUT);
        c1dz6.LLJLLIL = false;
        C1C7U.LIZIZ("VideoSeekBar@40f6.<init>$1L");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.1Dz7] */
    public static final void run$25(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        InterfaceC2273731Dz9 interfaceC2273731Dz9 = (InterfaceC2273731Dz9) aRunnableS135S0100000_35.l0;
        C1C7U.LIZ("ScreenOrientationUtils@cf8c.registerListener$1L");
        if (C2273721Dz8.LIZJ == null) {
            C844470XAv.LIZ.getClass();
            final Context contextLIZ = C844470XAv.LIZ();
            C2273721Dz8.LIZJ = new OrientationEventListener(contextLIZ) { // from class: X.1Dz7
                @Override // android.view.OrientationEventListener
                public final void onOrientationChanged(int i) {
                    if (i == -1) {
                        return;
                    }
                    if (i <= 340 && i >= 20) {
                        if (i > 70) {
                            if (i < 110) {
                                if (C2273721Dz8.LIZ == 90) {
                                    return;
                                } else {
                                    C2273721Dz8.LIZ = 90;
                                }
                            } else if (i > 160) {
                                if (i < 200) {
                                    if (C2273721Dz8.LIZ == 180) {
                                        return;
                                    } else {
                                        C2273721Dz8.LIZ = 180;
                                    }
                                } else if (i <= 250 || i >= 290 || C2273721Dz8.LIZ == 270) {
                                    return;
                                } else {
                                    C2273721Dz8.LIZ = 270;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (C2273721Dz8.LIZ == 0) {
                        return;
                    } else {
                        C2273721Dz8.LIZ = 0;
                    }
                    int i2 = C2273721Dz8.LIZ;
                    HashSet<InterfaceC2273731Dz9> hashSet = C2273721Dz8.LIZIZ;
                    if (!hashSet.isEmpty()) {
                        Iterator<InterfaceC2273731Dz9> it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            it2.next().LIZ(i2);
                        }
                    }
                }
            };
        }
        C2273721Dz8.LIZIZ.add(interfaceC2273731Dz9);
        if (!C2273721Dz8.LIZLLL) {
            C2273721Dz8.LIZLLL = true;
            C2273721Dz8.LIZJ.enable();
        }
        C1C7U.LIZIZ("ScreenOrientationUtils@cf8c.registerListener$1L");
    }

    public static final void run$26(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        InterfaceC2273731Dz9 interfaceC2273731Dz9 = (InterfaceC2273731Dz9) aRunnableS135S0100000_35.l0;
        C1C7U.LIZ("ScreenOrientationUtils@cf8c.unRegisterListener$1L");
        HashSet<InterfaceC2273731Dz9> hashSet = C2273721Dz8.LIZIZ;
        hashSet.remove(interfaceC2273731Dz9);
        if (hashSet.isEmpty()) {
            C2273721Dz8.LIZLLL = false;
            C2273721Dz8.LIZJ.disable();
        }
        C1C7U.LIZIZ("ScreenOrientationUtils@cf8c.unRegisterListener$1L");
    }

    public static final void run$28(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        ResourcePsiMonitor.lambda$runNativePrepAsync$3((Runnable) aRunnableS135S0100000_35.l0);
    }

    public static final void run$29(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        boolean zLIZ;
        C1C7U.LIZ("SizeSlider$AnimatorHelper@e9c2.delayCollapse$1");
        try {
            aRunnableS135S0100000_35.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SizeSlider$AnimatorHelper@e9c2.delayCollapse$1");
    }

    public static final void run$3(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        boolean zLIZ;
        C1C7U.LIZ("ReusedUIContentAssem@9d2.onDestroy$1$1");
        try {
            super/*com.bytedance.assem.arch.reused.ReusedUIAssem*/.onDestroy();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ReusedUIContentAssem@9d2.onDestroy$1$1");
    }

    public static final void run$30(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        boolean zLIZ;
        C1C7U.LIZ("SizeSlider@cd4e.showRunnable$1");
        try {
            aRunnableS135S0100000_35.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SizeSlider@cd4e.showRunnable$1");
    }

    public static final void run$31(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        boolean zLIZ;
        C1C7U.LIZ("EggShowState@22cb.handle$1");
        try {
            aRunnableS135S0100000_35.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EggShowState@22cb.handle$1");
    }

    public static final void run$32(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        boolean zLIZ;
        C1C7U.LIZ("ExpandState@dcb7.handle$1");
        try {
            aRunnableS135S0100000_35.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExpandState@dcb7.handle$1");
    }

    public static final void run$33(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        C2259841Dck c2259841Dck = (C2259841Dck) aRunnableS135S0100000_35.l0;
        C1C7U.LIZ("TTMFinalFeatureInfo@a201.<init>$1L");
        c2259841Dck.LIZ(false);
        C1C7U.LIZIZ("TTMFinalFeatureInfo@a201.<init>$1L");
    }

    public static final void run$34(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        C2259831Dcj c2259831Dcj = (C2259831Dcj) aRunnableS135S0100000_35.l0;
        C1C7U.LIZ("TTMIntermediateFeatureInfo@7e88.executeElimination$1L");
        c2259831Dcj.LIZ(false);
        C1C7U.LIZIZ("TTMIntermediateFeatureInfo@7e88.executeElimination$1L");
    }

    public static final void run$35(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        C2259831Dcj c2259831Dcj = (C2259831Dcj) aRunnableS135S0100000_35.l0;
        C1C7U.LIZ("TTMIntermediateFeatureInfo@7e88.<init>$1L");
        C2259831Dcj.LJIIIIZZ(c2259831Dcj, "", false, 0, 6);
        C1C7U.LIZIZ("TTMIntermediateFeatureInfo@7e88.<init>$1L");
    }

    public static final void run$36(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        C2259821Dci c2259821Dci = (C2259821Dci) aRunnableS135S0100000_35.l0;
        C1C7U.LIZ("TTMIntermediatePolymerizationFeatureInfo@a27a.<init>$1L");
        c2259821Dci.LJIIIIZZ(true);
        C1C7U.LIZIZ("TTMIntermediatePolymerizationFeatureInfo@a27a.<init>$1L");
    }

    public static final void run$37(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        C2259821Dci c2259821Dci = (C2259821Dci) aRunnableS135S0100000_35.l0;
        C1C7U.LIZ("TTMIntermediatePolymerizationFeatureInfo@a27a.executeElimination$1L");
        c2259821Dci.LIZ(false);
        C1C7U.LIZIZ("TTMIntermediatePolymerizationFeatureInfo@a27a.executeElimination$1L");
    }

    public static final void run$38(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        C2259851Dcl c2259851Dcl = (C2259851Dcl) aRunnableS135S0100000_35.l0;
        C1C7U.LIZ("TTMStrategyFeatureInfo@f4c6.<init>$1L");
        c2259851Dcl.LIZ(false);
        C1C7U.LIZIZ("TTMStrategyFeatureInfo@f4c6.<init>$1L");
    }

    public static final void run$39(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        boolean zLIZ;
        C1C7U.LIZ("IABProgressBarAnimationHandler@dc2d.delayTriggerLoadingAnimationInFirstOnShow$1");
        try {
            C1DXY c1dxy = (C1DXY) aRunnableS135S0100000_35.l0;
            c1dxy.LJIIIZ = true;
            c1dxy.LIZ(C1040010dAd.LIZIZ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IABProgressBarAnimationHandler@dc2d.delayTriggerLoadingAnimationInFirstOnShow$1");
    }

    public static final void run$4(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        boolean zLIZ;
        C1C7U.LIZ("ReusedUIContentAssem@9d2.onPause$1$1");
        try {
            super/*com.bytedance.assem.arch.reused.ReusedAssem*/.onPause();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ReusedUIContentAssem@9d2.onPause$1$1");
    }

    public static final void run$40(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        boolean zLIZ;
        C1C7U.LIZ("TECameraModeBase@80c5.<field>$2");
        try {
            ((AbstractC2254741DMy) aRunnableS135S0100000_35.l0).LJIIIIZZ.LJIIIIZZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TECameraModeBase@80c5.<field>$2");
    }

    public static final void run$5(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        boolean zLIZ;
        C1C7U.LIZ("ReusedUIContentAssem@9d2.onResume$1$1");
        try {
            super/*com.bytedance.assem.arch.reused.ReusedAssem*/.onResume();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ReusedUIContentAssem@9d2.onResume$1$1");
    }

    public static final void run$6(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        boolean zLIZ;
        C1C7U.LIZ("ReusedUIContentAssem@9d2.onStart$1$1");
        try {
            super/*com.bytedance.assem.arch.reused.ReusedAssem*/.onStart();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ReusedUIContentAssem@9d2.onStart$1$1");
    }

    public static final void run$7(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        boolean zLIZ;
        C1C7U.LIZ("TECameraServer@d252.<field>$1$onPreviewError$1");
        try {
            C1321640kUs.LIZ("TECameraServer-onPreviewError-handlePreviewingFallback");
            ((C1DJL) aRunnableS135S0100000_35.l0).LIZ.handlePreviewingFallback();
            C1321640kUs.LIZIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TECameraServer@d252.<field>$1$onPreviewError$1");
    }

    public static final void run$8(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        boolean zLIZ;
        C1C7U.LIZ("TECameraServer@d252.<field>$1$onPreviewError$2");
        try {
            b0 b0Var = ((C1DJL) aRunnableS135S0100000_35.l0).LIZ;
            b0Var.start(b0Var.mCameraClient);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TECameraServer@d252.<field>$1$onPreviewError$2");
    }

    public static final void run$9(ARunnableS135S0100000_35 aRunnableS135S0100000_35) {
        boolean zLIZ;
        C1C7U.LIZ("TECamera2$CameraStateCallback@a425.onOpened$1");
        try {
            C2254731DMx c2254731DMx = (C2254731DMx) aRunnableS135S0100000_35.l0;
            InterfaceC2254691DMt interfaceC2254691DMt = c2254731DMx.LIZLLL;
            if (interfaceC2254691DMt != null) {
                interfaceC2254691DMt.LIZIZ(c2254731DMx.LIZIZ.LLILLJJLI, 0, c2254731DMx, c2254731DMx.LJJJLIIL, "Open Camera Success!");
            } else {
                int i = C2187451AjH.LIZ;
                C2183341Ace.LIZIZ("TECamera2", "mCameraEvents is null!");
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TECamera2$CameraStateCallback@a425.onOpened$1");
    }

    public ARunnableS135S0100000_35(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
