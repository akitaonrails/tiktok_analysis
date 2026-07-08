package Y;

import X.AbstractC19391210ti;
import X.AbstractViewOnTouchListenerC19382810sM;
import X.C013C;
import X.C118300cf;
import X.C11FU;
import X.C11FV;
import X.C12EJ;
import X.C19391510tl;
import X.C19393810u8;
import X.C194434115c;
import X.C19510111Ut;
import X.C19510411Uw;
import X.C19510511Ux;
import X.C19735612Jm;
import X.C19737212Kc;
import X.C19737512Kf;
import X.C19768512Wd;
import X.C418440Gaw;
import X.C814420VxA;
import X.EnumC19384410sc;
import X.InterfaceC1631620sYq;
import X.InterfaceC1645910svt;
import X.InterfaceC19510211Uu;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.search.sug.ui.comon.EcOnSearchTouchListener;
import com.ss.android.ugc.aweme.pipfeed.vm.PipFeedWindowVM;
import com.ss.android.ugc.aweme.search.common.communicate.OnSearchTouchListener;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.security.SecureRandom;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes30.dex */
public class ALAdapterS23S0200000_29 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case 5:
                onAnimationCancel$1(this, animator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onAnimationCancel$2(this, animator);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onAnimationCancel$3(this, animator);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            case 2:
                onAnimationEnd$2(this, animator);
                break;
            case 3:
                onAnimationEnd$3(this, animator);
                break;
            case 4:
                onAnimationEnd$4(this, animator);
                break;
            case 5:
                onAnimationEnd$5(this, animator);
                break;
            case 6:
                onAnimationEnd$6(this, animator);
                break;
            case 7:
                onAnimationEnd$7(this, animator);
                break;
            case 8:
                onAnimationEnd$8(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationEnd$9(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationEnd$10(this, animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
            case 14:
            default:
                super.onAnimationEnd(animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationEnd$11(this, animator);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationEnd$12(this, animator);
                break;
            case 15:
                onAnimationEnd$13(this, animator);
                break;
            case 16:
                onAnimationEnd$14(this, animator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onAnimationEnd$15(this, animator);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onAnimationEnd$16(this, animator);
                break;
            case 19:
                onAnimationEnd$17(this, animator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onAnimationEnd$18(this, animator);
                break;
            case 21:
                onAnimationEnd$19(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (22 - this.$t != 0) {
            super.onAnimationEnd(animator, z);
        } else {
            onAnimationEnd$0(this, animator, z);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationRepeat$0(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
            default:
                super.onAnimationRepeat(animator);
                break;
            case 14:
                onAnimationRepeat$1(this, animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 6:
                onAnimationStart$1(this, animator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onAnimationStart$2(this, animator);
                break;
            case 22:
                onAnimationStart$3(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS23S0200000_29 aLAdapterS23S0200000_29, Animator animator) {
        ((C013C) aLAdapterS23S0200000_29.l1).element = true;
        ((C12EJ) aLAdapterS23S0200000_29.l0).getClass();
    }

    public static final void onAnimationCancel$1(ALAdapterS23S0200000_29 aLAdapterS23S0200000_29, Animator animator) {
        C194434115c c194434115c = (C194434115c) aLAdapterS23S0200000_29.l0;
        if (c194434115c.LLIZ == animator) {
            c194434115c.LLIZ = null;
        }
    }

    public static final void onAnimationCancel$2(ALAdapterS23S0200000_29 aLAdapterS23S0200000_29, Animator animator) {
        super.onAnimationCancel(animator);
        ((View) aLAdapterS23S0200000_29.l0).setEnabled(true);
    }

    public static final void onAnimationCancel$3(ALAdapterS23S0200000_29 aLAdapterS23S0200000_29, Animator animator) {
        super.onAnimationCancel(animator);
        ((View) aLAdapterS23S0200000_29.l0).dispatchTouchEvent(C19393810u8.LIZ(((Number) ((Pair) aLAdapterS23S0200000_29.l1).getFirst()).floatValue(), ((Number) ((Pair) aLAdapterS23S0200000_29.l1).getSecond()).floatValue(), 3));
    }

    public static final void onAnimationEnd$0(ALAdapterS23S0200000_29 aLAdapterS23S0200000_29, Animator animator) {
        ((C12EJ) aLAdapterS23S0200000_29.l0).getClass();
        if (!((C013C) aLAdapterS23S0200000_29.l1).element) {
            ((C12EJ) aLAdapterS23S0200000_29.l0).LIZJ();
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS23S0200000_29 aLAdapterS23S0200000_29, Animator animator) {
        ((C19510111Ut) aLAdapterS23S0200000_29.l1).LIZ.LIZ();
        ((C19510111Ut) aLAdapterS23S0200000_29.l1).LIZ();
        ((InterfaceC19510211Uu) aLAdapterS23S0200000_29.l0).LIZ();
    }

    public static final void onAnimationEnd$10(ALAdapterS23S0200000_29 aLAdapterS23S0200000_29, Animator animator) {
        ((C19735612Jm) aLAdapterS23S0200000_29.l1).LIZ.LIZ();
        ((C19735612Jm) aLAdapterS23S0200000_29.l1).LIZ();
        ((InterfaceC19510211Uu) aLAdapterS23S0200000_29.l0).LIZ();
    }

    public static final void onAnimationEnd$11(ALAdapterS23S0200000_29 aLAdapterS23S0200000_29, Animator animator) {
        InterfaceC1645910svt interfaceC1645910svt = ((C19737212Kc) aLAdapterS23S0200000_29.l0).LJFF;
        if (interfaceC1645910svt != null) {
            interfaceC1645910svt.LIZ();
        }
        InterfaceC19510211Uu interfaceC19510211Uu = (InterfaceC19510211Uu) aLAdapterS23S0200000_29.l1;
        if (interfaceC19510211Uu != null) {
            interfaceC19510211Uu.LIZ();
        }
    }

    public static final void onAnimationEnd$12(ALAdapterS23S0200000_29 aLAdapterS23S0200000_29, Animator animator) {
        InterfaceC1645910svt interfaceC1645910svt = ((C19737212Kc) aLAdapterS23S0200000_29.l0).LJFF;
        if (interfaceC1645910svt != null) {
            interfaceC1645910svt.LIZIZ();
        }
        InterfaceC19510211Uu interfaceC19510211Uu = (InterfaceC19510211Uu) aLAdapterS23S0200000_29.l1;
        if (interfaceC19510211Uu != null) {
            interfaceC19510211Uu.LIZIZ();
        }
    }

    public static final void onAnimationEnd$13(ALAdapterS23S0200000_29 aLAdapterS23S0200000_29, Animator animator) {
        InterfaceC1645910svt interfaceC1645910svt = ((C19510511Ux) aLAdapterS23S0200000_29.l0).LIZJ;
        if (interfaceC1645910svt != null) {
            interfaceC1645910svt.LIZ();
        }
        InterfaceC19510211Uu interfaceC19510211Uu = (InterfaceC19510211Uu) aLAdapterS23S0200000_29.l1;
        if (interfaceC19510211Uu != null) {
            interfaceC19510211Uu.LIZ();
        }
    }

    public static final void onAnimationEnd$14(ALAdapterS23S0200000_29 aLAdapterS23S0200000_29, Animator animator) {
        InterfaceC1645910svt interfaceC1645910svt = ((C19510511Ux) aLAdapterS23S0200000_29.l0).LIZJ;
        if (interfaceC1645910svt != null) {
            interfaceC1645910svt.LIZIZ();
        }
        InterfaceC19510211Uu interfaceC19510211Uu = (InterfaceC19510211Uu) aLAdapterS23S0200000_29.l1;
        if (interfaceC19510211Uu != null) {
            interfaceC19510211Uu.LIZIZ();
        }
    }

    public static final void onAnimationEnd$15(ALAdapterS23S0200000_29 aLAdapterS23S0200000_29, Animator animator) {
        super.onAnimationEnd(animator);
        ((View) aLAdapterS23S0200000_29.l0).setEnabled(true);
        CutMultiVideoViewModel cutMultiVideoViewModel = ((C19768512Wd) aLAdapterS23S0200000_29.l1).LLJJJ;
        if (cutMultiVideoViewModel == null) {
            cutMultiVideoViewModel = null;
        }
        cutMultiVideoViewModel.LLILZLL.setValue(null);
    }

    public static final void onAnimationEnd$16(ALAdapterS23S0200000_29 aLAdapterS23S0200000_29, Animator animator) {
        super.onAnimationEnd(animator);
        ((View) aLAdapterS23S0200000_29.l0).dispatchTouchEvent(C19393810u8.LIZ(((Number) ((Pair) aLAdapterS23S0200000_29.l1).getFirst()).floatValue(), ((Number) ((Pair) aLAdapterS23S0200000_29.l1).getSecond()).floatValue(), 1));
    }

    public static final void onAnimationEnd$17(ALAdapterS23S0200000_29 aLAdapterS23S0200000_29, Animator animator) {
        if (!((C19510411Uw) aLAdapterS23S0200000_29.l0).LIZIZ.isAttachedToWindow()) {
            return;
        }
        InterfaceC1645910svt interfaceC1645910svt = ((C19510411Uw) aLAdapterS23S0200000_29.l0).LJIIIZ;
        if (interfaceC1645910svt != null) {
            interfaceC1645910svt.LIZ();
        }
        C19510411Uw c19510411Uw = (C19510411Uw) aLAdapterS23S0200000_29.l0;
        HandlerHook.viewPost(c19510411Uw.LIZ, new ARunnableS129S0100000_29(c19510411Uw, 212));
        InterfaceC19510211Uu interfaceC19510211Uu = (InterfaceC19510211Uu) aLAdapterS23S0200000_29.l1;
        if (interfaceC19510211Uu != null) {
            interfaceC19510211Uu.LIZ();
        }
    }

    public static final void onAnimationEnd$18(ALAdapterS23S0200000_29 aLAdapterS23S0200000_29, Animator animator) {
        super.onAnimationEnd(animator);
        if (!((C19510411Uw) aLAdapterS23S0200000_29.l0).LIZIZ.isAttachedToWindow()) {
            return;
        }
        InterfaceC1645910svt interfaceC1645910svt = ((C19510411Uw) aLAdapterS23S0200000_29.l0).LJIIIZ;
        if (interfaceC1645910svt != null) {
            interfaceC1645910svt.LIZIZ();
        }
        InterfaceC19510211Uu interfaceC19510211Uu = (InterfaceC19510211Uu) aLAdapterS23S0200000_29.l1;
        if (interfaceC19510211Uu != null) {
            interfaceC19510211Uu.LIZIZ();
        }
    }

    public static final void onAnimationEnd$19(ALAdapterS23S0200000_29 aLAdapterS23S0200000_29, Animator animator) {
        PipFeedWindowVM pipFeedWindowVM = (PipFeedWindowVM) aLAdapterS23S0200000_29.l0;
        EnumC19384410sc enumC19384410sc = (EnumC19384410sc) aLAdapterS23S0200000_29.l1;
        pipFeedWindowVM.LLILZIL = enumC19384410sc;
        Iterator<InterfaceC1631620sYq<Float, EnumC19384410sc, EnumC19384410sc, Unit>> it2 = pipFeedWindowVM.LLILZLL.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(Float.valueOf(1.0f), enumC19384410sc, enumC19384410sc);
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS23S0200000_29 aLAdapterS23S0200000_29, Animator animator) {
        super.onAnimationEnd(animator);
        ((AbstractViewOnTouchListenerC19382810sM) aLAdapterS23S0200000_29.l1).getClass();
    }

    public static final void onAnimationEnd$3(ALAdapterS23S0200000_29 aLAdapterS23S0200000_29, Animator animator) {
        HandlerHook.viewPostDelay((View) aLAdapterS23S0200000_29.l0, (Runnable) aLAdapterS23S0200000_29.l1, 3000L);
    }

    public static final void onAnimationEnd$4(ALAdapterS23S0200000_29 aLAdapterS23S0200000_29, Animator animator) {
        super.onAnimationEnd(animator);
        ((EcOnSearchTouchListener) aLAdapterS23S0200000_29.l1).getClass();
    }

    public static final void onAnimationEnd$5(ALAdapterS23S0200000_29 aLAdapterS23S0200000_29, Animator animator) {
        C194434115c c194434115c = (C194434115c) aLAdapterS23S0200000_29.l0;
        if (c194434115c.LLIZ == animator) {
            c194434115c.LLIZ = null;
        }
        ((Function0) aLAdapterS23S0200000_29.l1).invoke();
    }

    public static final void onAnimationEnd$6(ALAdapterS23S0200000_29 aLAdapterS23S0200000_29, Animator animator) {
        ((AnimatorSet) aLAdapterS23S0200000_29.l0).start();
        C11FV c11fv = ((C11FU) aLAdapterS23S0200000_29.l1).LLILLJJLI;
        if (c11fv != null) {
            c11fv.onStateChange(1);
        }
    }

    public static final void onAnimationEnd$7(ALAdapterS23S0200000_29 aLAdapterS23S0200000_29, Animator animator) {
        super.onAnimationEnd(animator);
        ((OnSearchTouchListener) aLAdapterS23S0200000_29.l0).getClass();
    }

    public static final void onAnimationEnd$8(ALAdapterS23S0200000_29 aLAdapterS23S0200000_29, Animator animator) {
        ((C19737512Kf) aLAdapterS23S0200000_29.l1).LIZ.LIZ();
        ((C19737512Kf) aLAdapterS23S0200000_29.l1).LIZ();
        ((InterfaceC19510211Uu) aLAdapterS23S0200000_29.l0).LIZ();
    }

    public static final void onAnimationEnd$9(ALAdapterS23S0200000_29 aLAdapterS23S0200000_29, Animator animator) {
        super.onAnimationEnd(animator);
        ((C19737512Kf) aLAdapterS23S0200000_29.l1).LIZ.LIZIZ();
        ((C19737512Kf) aLAdapterS23S0200000_29.l1).getClass();
        ((InterfaceC19510211Uu) aLAdapterS23S0200000_29.l0).LIZIZ();
    }

    public static final void onAnimationRepeat$0(ALAdapterS23S0200000_29 aLAdapterS23S0200000_29, Animator animator) {
        int i;
        C118300cf c118300cf = (C118300cf) aLAdapterS23S0200000_29.l0;
        if (((SecureRandom) aLAdapterS23S0200000_29.l1).nextBoolean()) {
            i = 1;
        } else {
            i = -1;
        }
        c118300cf.element = i;
    }

    public static final void onAnimationRepeat$1(ALAdapterS23S0200000_29 aLAdapterS23S0200000_29, Animator animator) {
        int i;
        C118300cf c118300cf = (C118300cf) aLAdapterS23S0200000_29.l0;
        if (((SecureRandom) aLAdapterS23S0200000_29.l1).nextBoolean()) {
            i = 1;
        } else {
            i = -1;
        }
        c118300cf.element = i;
    }

    public static final void onAnimationStart$0(ALAdapterS23S0200000_29 aLAdapterS23S0200000_29, Animator animator) {
        ((C12EJ) aLAdapterS23S0200000_29.l0).getClass();
    }

    public static final void onAnimationStart$1(ALAdapterS23S0200000_29 aLAdapterS23S0200000_29, Animator animator) {
        C11FV c11fv = ((C11FU) aLAdapterS23S0200000_29.l1).LLILLJJLI;
        if (c11fv != null) {
            c11fv.onStateChange(0);
        }
    }

    public static final void onAnimationStart$2(ALAdapterS23S0200000_29 aLAdapterS23S0200000_29, Animator animator) {
        super.onAnimationStart(animator);
        ((View) aLAdapterS23S0200000_29.l0).setEnabled(false);
    }

    public static final void onAnimationStart$3(ALAdapterS23S0200000_29 aLAdapterS23S0200000_29, Animator animator) {
        ((AbstractC19391210ti) aLAdapterS23S0200000_29.l0).LJIILL.add((Animator) aLAdapterS23S0200000_29.l1);
    }

    public ALAdapterS23S0200000_29(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onAnimationEnd$0(ALAdapterS23S0200000_29 aLAdapterS23S0200000_29, Animator animator, boolean z) {
        WindowManager.LayoutParams layoutParams;
        ((AbstractC19391210ti) aLAdapterS23S0200000_29.l0).LJIILL.remove((Animator) aLAdapterS23S0200000_29.l1);
        AbstractC19391210ti abstractC19391210ti = (AbstractC19391210ti) aLAdapterS23S0200000_29.l0;
        abstractC19391210ti.getClass();
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        C19391510tl c19391510tl = abstractC19391210ti.LJFF;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (c19391510tl != null) {
            layoutParams2 = c19391510tl.getLayoutParams();
        }
        if ((layoutParams2 instanceof WindowManager.LayoutParams) && (layoutParams = (WindowManager.LayoutParams) layoutParams2) != null) {
            int i = layoutParams.x;
            int i2 = layoutParams.width;
            int i3 = (i2 / 2) + i;
            int i4 = abstractC19391210ti.LJIIJ;
            if (i3 > i4 / 2 && Math.abs(((i + i2) + AbstractC19391210ti.LJIJ) - i4) > iLIZIZ) {
                abstractC19391210ti.LJIIIIZZ(layoutParams.width, layoutParams.height);
                abstractC19391210ti.LJI(new Point(abstractC19391210ti.LIZLLL.right, layoutParams.y));
            }
        }
    }

    public ALAdapterS23S0200000_29(AbstractViewOnTouchListenerC19382810sM abstractViewOnTouchListenerC19382810sM, View view, MotionEvent motionEvent, int i) {
        this.$t = i;
        this.l1 = abstractViewOnTouchListenerC19382810sM;
        this.l0 = view;
    }

    public ALAdapterS23S0200000_29(EcOnSearchTouchListener ecOnSearchTouchListener, View view, MotionEvent motionEvent, int i) {
        this.$t = i;
        this.l1 = ecOnSearchTouchListener;
        this.l0 = view;
    }

    public ALAdapterS23S0200000_29(OnSearchTouchListener onSearchTouchListener, View view, MotionEvent motionEvent, int i) {
        this.$t = i;
        this.l0 = onSearchTouchListener;
        this.l1 = view;
    }
}
