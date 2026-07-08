package X;

import Y.AAListenerS144S0300000_32;
import Y.AAListenerS277S0200000_31;
import Y.AAListenerS342S0100000_32;
import Y.ACListenerS166S0100000_32;
import Y.AUListenerS234S0200000_32;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import avg.f;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS159S0400000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import mf.a;

/* JADX INFO: renamed from: X.18YN, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18YN extends FrameLayout {
    public static final float LLJJIJIIJIL = C418440Gaw.LIZIZ(12);
    public C21300518Xj LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public Animator LLIZLLLIL;
    public Animator LLJ;
    public EnumC1160140gIO LLJI;
    public final C01GW LLJIJIL;
    public Function0<Unit> LLJILJIL;
    public View LLJILJILJ;
    public View LLJILLL;
    public boolean LLJJ;
    public View LLJJI;
    public int[] LLJJIII;
    public ValueAnimator LLJJIJI;

    private final ViewGroup getActionListContainer() {
        return (ViewGroup) this.LLILZLL.getValue();
    }

    private final View getBottomOverlay() {
        return (View) this.LLILLL.getValue();
    }

    private final ViewGroup getReactionContainer() {
        return (ViewGroup) this.LLIZ.getValue();
    }

    private final View getTopOverlay() {
        return (View) this.LLILLJJLI.getValue();
    }

    public final AnimatorSet LIZJ() {
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.LLJJ) {
            C786410Ut5.LJLLLLLL(0, getFullOverlay());
            getCurNonNullItemView().setPivotX(getCurNonNullItemView().getWidth() / 2);
            animatorSet.playTogether(ObjectAnimator.ofFloat(getFullOverlay(), "alpha", 0.85f));
        } else {
            animatorSet.playTogether(ObjectAnimator.ofFloat(getTopOverlay(), "alpha", 0.85f), ObjectAnimator.ofFloat(getBottomOverlay(), "alpha", 0.85f));
        }
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(C1619980sG4.LJIIIZ());
        return animatorSet;
    }

    public final FrameLayout getClonedViewContainer() {
        return (FrameLayout) this.LLILZIL.getValue();
    }

    public final View getCurNonNullItemView() {
        View view = this.LLJILJILJ;
        if (view != null) {
            return view;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final View getFullOverlay() {
        return (View) this.LLILZ.getValue();
    }

    public final C422190Ggz getMessageLongPressDecorationHelper() {
        return (C422190Ggz) this.LLJIJIL.getValue();
    }

    public final EnumC1160140gIO getCurrentDisplayState$im_messagelist_infra_release() {
        return this.LLJI;
    }

    public final Function0<Unit> getDismissCallback() {
        return this.LLJILJIL;
    }

    public final void setCurrentDisplayState$im_messagelist_infra_release(EnumC1160140gIO enumC1160140gIO) {
        this.LLJI = enumC1160140gIO;
    }

    public final void setDismissCallback(Function0<Unit> function0) {
        this.LLJILJIL = function0;
    }

    public C18YN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new C21300518Xj(0, 0, 7);
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 860));
        this.LLILLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 864));
        this.LLILZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 858));
        this.LLILZIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 857));
        this.LLILZLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 863));
        this.LLIZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 859));
        this.LLJI = EnumC1160140gIO.HIDDEN;
        this.LLJIJIL = C1509305vX.LIZ(AFwS201S0000000_14.get$arr$(598));
        FrameLayout.inflate(context, R.layout.dmh, this);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zm, context);
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            getTopOverlay().setBackground(new ColorDrawable(iIntValue));
            getBottomOverlay().setBackground(new ColorDrawable(iIntValue));
            getFullOverlay().setBackground(new ColorDrawable(iIntValue));
            C786410Ut5.T4(getTopOverlay(), 0.0f);
            C786410Ut5.T4(getBottomOverlay(), 0.0f);
            C786410Ut5.T4(getFullOverlay(), 0.0f);
        }
        View.OnClickListener aCListenerS166S0100000_32 = new ACListenerS166S0100000_32(this, 130);
        a aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS166S0100000_32) : aCListenerS166S0100000_32);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    public static Object LIZLLL(View view, InterfaceC1364105Vn interfaceC1364105Vn) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        if (view.isLaidOut() && !view.isLayoutRequested()) {
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            c23260099m.resumeWith(unit);
        } else {
            view.addOnLayoutChangeListener(new C19LV(c23260099m, 1));
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }

    public static int LJ(int i, View view) {
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i3 = 0;
        try {
            View viewFindViewById = view.findViewById(i);
            if (viewFindViewById.getVisibility() == 8) {
                return 0;
            }
            int height = viewFindViewById.getHeight();
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                i2 = marginLayoutParams2.topMargin;
            } else {
                i2 = 0;
            }
            int i4 = height + i2;
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                i3 = marginLayoutParams.bottomMargin;
            }
            return i4 + i3;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return i3;
        }
    }

    public final void LJIIIIZZ(View view, boolean z) {
        int height;
        int i;
        int i2;
        if (this.LLJI == EnumC1160140gIO.HIDDEN) {
            return;
        }
        view.setElevation(5.0f);
        int[] iArr = this.LLJJIII;
        if (iArr == null) {
            return;
        }
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr2);
        int i3 = iArr[1] - iArr2[1];
        C786410Ut5.Fd(view, iArr[0] - iArr2[0]);
        int height2 = getHeight();
        if (height2 <= 0) {
            return;
        }
        if (z) {
            height = getReactionContainer().getHeight();
        } else {
            height = 0;
        }
        int height3 = view.getHeight();
        int height4 = getActionListContainer().getHeight();
        if (height > 0) {
            i = this.LL.LIZ;
        } else {
            i = 0;
        }
        if (height4 > 0) {
            i2 = this.LL.LIZ;
        } else {
            i2 = 0;
        }
        C21300518Xj c21300518Xj = this.LL;
        int i4 = c21300518Xj.LIZIZ + height + i + height3 + i2 + height4 + c21300518Xj.LIZJ;
        C786410Ut5.Md(getClonedViewContainer(), i3);
        if (i4 <= height2) {
            int i5 = i3 + height3;
            C21300518Xj c21300518Xj2 = this.LL;
            if (i5 <= ((height2 - i2) - height4) - c21300518Xj2.LIZJ) {
                int i6 = c21300518Xj2.LIZIZ + height + i;
                if (i3 < i6) {
                    C786410Ut5.Kd((i6 - height) - i, getReactionContainer());
                    C786410Ut5.Kd(height3 + i6 + i2, getActionListContainer());
                    Animator animator = this.LLIZLLLIL;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getClonedViewContainer(), "y", i6);
                    objectAnimatorOfFloat.setStartDelay(200L);
                    objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIIIZ());
                    objectAnimatorOfFloat.setDuration(200L);
                    C786410Ut5.Pd(objectAnimatorOfFloat);
                    this.LLIZLLLIL = objectAnimatorOfFloat;
                    return;
                }
                C786410Ut5.Kd((i3 - height) - i, getReactionContainer());
                C786410Ut5.Kd(i5 + i2, getActionListContainer());
                return;
            }
        }
        int i7 = (((height2 - this.LL.LIZJ) - height4) - i2) - height3;
        C786410Ut5.Kd(Math.max(r1.LIZIZ, (i7 - height) - i), getReactionContainer());
        C786410Ut5.Kd(height3 + i7 + i2, getActionListContainer());
        Animator animator2 = this.LLIZLLLIL;
        if (animator2 != null) {
            animator2.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(getClonedViewContainer(), "y", i7);
        objectAnimatorOfFloat2.setStartDelay(200L);
        objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LJIIIZ());
        objectAnimatorOfFloat2.setDuration(200L);
        C786410Ut5.Pd(objectAnimatorOfFloat2);
        this.LLIZLLLIL = objectAnimatorOfFloat2;
    }

    public final void LJII(View view, boolean z, C18WK c18wk) {
        View view2;
        int height;
        int i;
        int i2;
        int i3;
        FrameLayout.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        if (this.LLJI == EnumC1160140gIO.HIDDEN) {
            return;
        }
        view.setElevation(5.0f);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr2);
        int i4 = iArr[1] - iArr2[1];
        Object parent = view.getParent();
        if (!(parent instanceof View) || (view2 = (View) parent) == null) {
            view2 = view;
        }
        int[] iArr3 = new int[2];
        view2.getLocationOnScreen(iArr3);
        int height2 = getHeight();
        if (height2 <= 0) {
            return;
        }
        int i5 = iArr3[1] - iArr2[1];
        int height3 = view2.getHeight();
        int i6 = (height2 - i5) - height3;
        int i7 = 0;
        if (z) {
            height = getReactionContainer().getHeight();
        } else {
            height = 0;
        }
        int height4 = view.getHeight() - view.getPaddingBottom();
        Iterator<Integer> it2 = c18wk.LIZIZ.iterator();
        while (it2.hasNext()) {
            int iLJ = LJ(it2.next().intValue(), view);
            i4 += iLJ;
            height4 -= iLJ;
        }
        Iterator<Integer> it3 = c18wk.LIZJ.iterator();
        while (it3.hasNext()) {
            height4 -= LJ(it3.next().intValue(), view);
        }
        int height5 = getActionListContainer().getHeight();
        if (height > 0) {
            i = this.LL.LIZ;
        } else {
            i = 0;
        }
        if (height5 > 0) {
            i7 = this.LL.LIZ;
        }
        C21300518Xj c21300518Xj = this.LL;
        int i8 = c21300518Xj.LIZIZ + height + i + height4;
        int i9 = i8 + i7 + height5 + c21300518Xj.LIZJ;
        ViewGroup.LayoutParams layoutParams3 = getTopOverlay().getLayoutParams();
        if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams3) != null) {
            layoutParams2.height = i5;
            C786410Ut5.W5(getTopOverlay(), layoutParams2);
        }
        ViewGroup.LayoutParams layoutParams4 = getBottomOverlay().getLayoutParams();
        if ((layoutParams4 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams4) != null) {
            layoutParams.height = i6;
            C786410Ut5.W5(getBottomOverlay(), layoutParams);
        }
        if (i9 <= height2 && i8 <= view2.getHeight() + view2.getY() && height4 <= height3) {
            C21300518Xj c21300518Xj2 = this.LL;
            int i10 = c21300518Xj2.LIZJ;
            if (height4 + i7 + height5 + i10 <= i6 + height3 && (i2 = i4 + height4) <= (i3 = i5 + height3) && i2 <= ((height2 - i7) - height5) - i10) {
                int i11 = c21300518Xj2.LIZIZ + height + i;
                if (i11 + height4 <= i3 && i4 >= i11 && i4 >= i5) {
                    C786410Ut5.Kd((i4 - height) - i, getReactionContainer());
                    C786410Ut5.Kd(i2 + i7, getActionListContainer());
                    return;
                } else {
                    int iMax = Math.max(i11, i5);
                    LIZ(this, (iMax - height) - i, iMax - i4, height4 + iMax + i7, view);
                    return;
                }
            }
        }
        int iMin = Math.min((((height2 - this.LL.LIZJ) - height5) - i7) - height4, (i5 + height3) - height4);
        LIZ(this, Math.max(this.LL.LIZIZ, (iMin - height) - i), iMin - i4, height4 + iMin + i7, view);
    }

    public static void LIZIZ(C18YN c18yn, final View view, float f, final float f2) {
        ValueAnimator valueAnimator = c18yn.LLJJIJI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        view.setClipToOutline(true);
        C18YV c18yv = new C18YV(f);
        view.setOutlineProvider(c18yv);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJIIIZ());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS234S0200000_32(c18yv, view, 15));
        final Function0 function0 = null;
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: X.14x6
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (f2 == 0.0f) {
                    view.setClipToOutline(false);
                }
                Function0 function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }
        });
        valueAnimatorOfFloat.start();
        c18yn.LLJJIJI = valueAnimatorOfFloat;
    }

    public static void LIZ(C18YN c18yn, int i, int i2, int i3, View view) {
        C786410Ut5.Kd(i, c18yn.getReactionContainer());
        C786410Ut5.Kd(i3, c18yn.getActionListContainer());
        Animator animator = c18yn.LLIZLLLIL;
        if (animator != null) {
            animator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", i2);
        objectAnimatorOfFloat.setStartDelay(200L);
        objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIIIZ());
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.addListener(new AAListenerS277S0200000_31(null, view, 5));
        C786410Ut5.Pd(objectAnimatorOfFloat);
        c18yn.LLIZLLLIL = objectAnimatorOfFloat;
    }

    public final void LJI(C18YE c18ye, C18YL c18yl, C18YK c18yk, C18YK c18yk2, C18YJ c18yj, C18YQ c18yq) {
        Integer numValueOf;
        C789260Uxg c789260Uxg;
        View view;
        InterfaceC789250Uxf interfaceC789250Uxf = c18yl.LIZ;
        if (interfaceC789250Uxf instanceof C789240Uxe) {
            this.LLJJ = false;
            C789240Uxe c789240Uxe = (C789240Uxe) interfaceC789250Uxf;
            View viewFindContainingItemView = c18ye.LIZIZ.findContainingItemView(c789240Uxe.LIZ);
            if (viewFindContainingItemView == null) {
                viewFindContainingItemView = c789240Uxe.LIZ;
            }
            this.LLJILJILJ = viewFindContainingItemView;
        } else if (interfaceC789250Uxf instanceof C789260Uxg) {
            this.LLJJ = true;
            C789260Uxg c789260Uxg2 = (C789260Uxg) interfaceC789250Uxf;
            View view2 = c789260Uxg2.LIZ;
            this.LLJJI = view2;
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            this.LLJJIII = iArr;
            View viewInvoke = c789260Uxg2.LIZIZ.invoke();
            this.LLJILLL = viewInvoke;
            C786410Ut5.LJJJJIZL(getClonedViewContainer());
            getClonedViewContainer().addView(viewInvoke);
            C786410Ut5.LJLLLLLL(4, getClonedViewContainer());
            this.LLJILJILJ = viewInvoke;
        } else {
            throw new C1954807lC();
        }
        if (c18yl.LIZIZ == EnumC912790ZrR.MIDDLE) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        this.LLJI = EnumC1160140gIO.VISIBLE;
        c18yq.onShow();
        if (!this.LLJJ) {
            Iterator<Integer> it2 = c18yl.LIZJ.LIZ.iterator();
            while (it2.hasNext()) {
                try {
                    C786410Ut5.T4(getCurNonNullItemView().findViewById(it2.next().intValue()), 0.0f);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        C786410Ut5.ed(getCurNonNullItemView(), 0.0f);
        InterfaceC789250Uxf interfaceC789250Uxf2 = c18yl.LIZ;
        if ((interfaceC789250Uxf2 instanceof C789260Uxg) && (c789260Uxg = (C789260Uxg) interfaceC789250Uxf2) != null && (view = c789260Uxg.LIZ) != null) {
            numValueOf = Integer.valueOf(view.getWidth());
        } else {
            numValueOf = null;
        }
        c18yj.LIZ().LJIIIIZZ(getReactionContainer(), c18yk2, c18ye, c18yl, numValueOf);
        c18yj.LIZIZ().LJIIIIZZ(getActionListContainer(), c18yk, c18ye, c18yl, numValueOf);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c18ye.LIZLLL), null, null, new C18YM(this, c18ye, c18yk2, c18yj, c18yk, c18yl, c18yq, null), 3);
    }

    public final boolean LJFF(final Enum r19, final C18YE c18ye, final C18YL c18yl, C18YK c18yk, C18YK c18yk2, C18YJ c18yj, final C18YQ c18yq, final AwS576S0100000_32 awS576S0100000_32) {
        Animator animator;
        View view;
        Animator animatorLIZ;
        View view2;
        Animator animatorLIZ2;
        setClipChildren(true);
        setClipToPadding(true);
        if (this.LLJI != EnumC1160140gIO.VISIBLE || ((animator = this.LLJ) != null && animator.isRunning())) {
            return false;
        }
        Animator animator2 = this.LLIZLLLIL;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.LLIZLLLIL = null;
        ValueAnimator valueAnimator = this.LLJJIJI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLJJIJI = null;
        this.LLJI = EnumC1160140gIO.HIDDEN;
        final boolean z = this.LLJJ;
        AnimatorSet animatorSet = new AnimatorSet();
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        C18YF c18yfLIZ = c18yj.LIZ();
        c18yfLIZ.getClass();
        if (c18yk2.LJJII() && (view2 = c18yfLIZ.LIZ) != null && (animatorLIZ2 = c18yfLIZ.LIZ(view2, c18yk2, c18yl)) != null) {
            c13dvLIZIZ.add(animatorLIZ2);
        }
        C912880Zra c912880ZraLIZIZ = c18yj.LIZIZ();
        c912880ZraLIZIZ.getClass();
        if (c18yk.LJJII() && (view = c912880ZraLIZIZ.LIZ) != null && (animatorLIZ = c912880ZraLIZIZ.LIZ(view, c18yk, c18yl)) != null) {
            c13dvLIZIZ.add(animatorLIZ);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        if (this.LLJJ) {
            if (getFullOverlay().getVisibility() == 0) {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(getFullOverlay(), "alpha", 0.0f));
                animatorSet2.setDuration(200L);
                animatorSet2.setInterpolator(C1619980sG4.LJIIIZ());
            }
        } else if (getTopOverlay().getVisibility() == 0 && getBottomOverlay().getVisibility() == 0) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(getTopOverlay(), "alpha", 0.0f), ObjectAnimator.ofFloat(getBottomOverlay(), "alpha", 0.0f));
            animatorSet2.setDuration(200L);
            animatorSet2.setInterpolator(C1619980sG4.LJIIIZ());
        }
        c13dvLIZIZ.add(animatorSet2);
        animatorSet.playTogether(C1697820uHc.LIZ(c13dvLIZIZ));
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: X.18YO
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator3) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator3) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator3) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator3) {
                int i;
                c18yq.LIZ(r19);
                C18YN c18yn = this;
                C18YE c18ye2 = c18ye;
                C18YL c18yl2 = c18yl;
                AwS159S0400000_32 awS159S0400000_32 = new AwS159S0400000_32(c18yq, (C18YT<Object>) r19, (Object) c18yn, (C18YN) awS576S0100000_32, (Function0<Unit>) 10);
                if (c18yn.LLJJ) {
                    View view3 = c18yn.LLJJI;
                    int[] iArr = c18yn.LLJJIII;
                    int[] iArr2 = new int[2];
                    c18yn.getLocationOnScreen(iArr2);
                    if (iArr != null) {
                        i = iArr[1];
                    } else {
                        i = 0;
                    }
                    int i2 = i - iArr2[1];
                    Animator animator4 = c18yn.LLIZLLLIL;
                    if (animator4 != null) {
                        animator4.cancel();
                    }
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c18yn.getClonedViewContainer(), "y", i2);
                    objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIIIZ());
                    objectAnimatorOfFloat.setDuration(200L);
                    objectAnimatorOfFloat.addListener(new AAListenerS342S0100000_32(c18yn, 8));
                    objectAnimatorOfFloat.addListener(new AAListenerS144S0300000_32(view3, c18yn, awS159S0400000_32, 2));
                    C786410Ut5.Pd(objectAnimatorOfFloat);
                    c18yn.LLIZLLLIL = objectAnimatorOfFloat;
                    return;
                }
                View curNonNullItemView = c18yn.getCurNonNullItemView();
                Animator animator5 = c18yn.LLIZLLLIL;
                if (animator5 != null) {
                    animator5.cancel();
                }
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(curNonNullItemView, "translationY", 0.0f);
                objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LJIIIZ());
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.addListener(new AAListenerS342S0100000_32(curNonNullItemView, 10));
                C786410Ut5.Pd(objectAnimatorOfFloat2);
                c18yn.LLIZLLLIL = objectAnimatorOfFloat2;
                Iterator<Integer> it2 = c18yl2.LIZJ.LIZ.iterator();
                while (it2.hasNext()) {
                    try {
                        C786410Ut5.T4(c18yn.getCurNonNullItemView().findViewById(it2.next().intValue()), 1.0f);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                c18yn.getMessageLongPressDecorationHelper().LIZ(c18ye2.LIZIZ, null, c18ye2.LIZJ);
            }
        });
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: X.18YR
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator3) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator3) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator3) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator3) {
                if (!z) {
                    c18yq.LIZIZ(r19);
                    C786410Ut5.LJLLLLLL(4, this);
                    this.LLJILJILJ = null;
                    Function0 function0 = awS576S0100000_32;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            }
        });
        animatorSet.setInterpolator(C1619980sG4.LJIIIZ());
        animatorSet.setDuration(200L);
        animatorSet.start();
        this.LLJ = animatorSet;
        return true;
    }
}
