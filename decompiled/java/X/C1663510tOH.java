package X;

import Y.ALAdapterS19S0200000_25;
import Y.ALAdapterS20S0100000_25;
import Y.ARunnableS94S0200000_25;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0tOH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1663510tOH extends AbstractC1662050tLv {
    public final C1654400t9a LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;

    private final View getBgView() {
        return (View) this.LLILLJJLI.getValue();
    }

    private final C1295960jpS getLottieView() {
        return (C1295960jpS) this.LLILZIL.getValue();
    }

    private final TuxTextView getTagView() {
        return (TuxTextView) this.LLILLL.getValue();
    }

    private final TuxTextView getTitle() {
        return (TuxTextView) this.LLILZ.getValue();
    }

    public final void l0() {
        TuxTextView title;
        getLottieView().removeAllAnimatorListeners();
        getLottieView().addAnimatorListener(new ALAdapterS20S0100000_25(this, 8));
        getLottieView().playAnimation();
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[3];
        AnimatorSet animatorSet2 = new AnimatorSet();
        View bgView = getBgView();
        if (bgView != null && (title = getTitle()) != null) {
            bgView.setPivotX(C1388580mEq.LIZIZ(title.getContext()) ? 0.0f : title.getMeasuredWidth());
            ViewGroup.LayoutParams layoutParams = bgView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = title.getMeasuredWidth();
            C786410Ut5.W5(bgView, layoutParams);
            C786410Ut5.Ob(bgView, 0.0f);
            C786410Ut5.T4(bgView, 0.0f);
            animatorSet2.setStartDelay(1000L);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(bgView, (Property<View, Float>) View.SCALE_X, 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILIIL());
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(bgView, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
            objectAnimatorOfFloat2.setDuration(300L);
            objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LJIILIIL());
            animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        }
        animatorArr[0] = animatorSet2;
        AnimatorSet animatorSet3 = new AnimatorSet();
        TuxTextView title2 = getTitle();
        if (title2 != null) {
            C786410Ut5.Vc(title2, C418440Gaw.LIZIZ(8));
            C786410Ut5.B5(title2, 0.0f);
            animatorSet3.setStartDelay(1000L);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(title2, (Property<TuxTextView, Float>) View.TRANSLATION_X, C418440Gaw.LIZIZ(8), 0.0f);
            objectAnimatorOfFloat3.setDuration(300L);
            objectAnimatorOfFloat3.setInterpolator(C1619980sG4.LJIILIIL());
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(title2, (Property<TuxTextView, Float>) View.ALPHA, 0.0f, 1.0f);
            objectAnimatorOfFloat4.setDuration(300L);
            objectAnimatorOfFloat4.setInterpolator(C1619980sG4.LJIILIIL());
            animatorSet3.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        }
        animatorArr[1] = animatorSet3;
        AnimatorSet animatorSet4 = new AnimatorSet();
        TuxTextView tagView = getTagView();
        if (tagView != null) {
            tagView.setPivotX(tagView.getWidth() / 2.0f);
            tagView.setPivotY(tagView.getHeight() / 2.0f);
            C786410Ut5.ic(tagView, 0.0f);
            C786410Ut5.Dc(tagView, 0.0f);
            C786410Ut5.Gb(tagView, C1388580mEq.LIZIZ(tagView.getContext()) ? -15.0f : 15.0f);
            animatorSet4.setStartDelay(1300L);
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(tagView, (Property<TuxTextView, Float>) ViewGroup.ROTATION, -tagView.getRotation(), 10.0f - tagView.getRotation(), (-10.0f) - tagView.getRotation(), 6.0f - tagView.getRotation(), (-6.0f) - tagView.getRotation(), -tagView.getRotation());
            objectAnimatorOfFloat5.setDuration(750L);
            objectAnimatorOfFloat5.setInterpolator(C1619980sG4.LIZLLL());
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(tagView, (Property<TuxTextView, Float>) View.SCALE_X, 0.0f, 1.0f);
            objectAnimatorOfFloat6.setDuration(300L);
            objectAnimatorOfFloat6.setInterpolator(C1619980sG4.LIZLLL());
            ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(tagView, (Property<TuxTextView, Float>) View.SCALE_Y, 0.0f, 1.0f);
            objectAnimatorOfFloat7.setDuration(300L);
            objectAnimatorOfFloat7.setInterpolator(C1619980sG4.LIZLLL());
            animatorSet4.playTogether(objectAnimatorOfFloat5, objectAnimatorOfFloat6, objectAnimatorOfFloat7);
        }
        animatorArr[2] = animatorSet4;
        animatorSet.playTogether(animatorArr);
        animatorSet.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getLottieView().removeAllAnimatorListeners();
        C786410Ut5.LJLLLLLL(0, this.LL.LIZJ);
    }

    public C1663510tOH(C1654400t9a c1654400t9a, Context context) {
        super(context, null, 0);
        this.LL = c1654400t9a;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 901));
        this.LLILLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 894));
        this.LLILZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 895));
        this.LLILZIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 902));
        setClipChildren(false);
        C786410Ut5.Sd(R.layout.wy, C786410Ut5.ne(context), this);
        View bgView = getBgView();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.ze);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
        bgView.setBackground(c384050F3z.LIZ(context));
        TuxTextView tagView = getTagView();
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.ee);
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        tagView.setBackground(c384050F3z2.LIZ(context));
        C786410Ut5.b2(this, 4);
    }

    @Override // X.AbstractC1662050tLv
    public final void h0(Function0 function0, boolean z) {
        ViewGroup viewGroup;
        if (z && getVisibility() == 0) {
            AnimatorSet animatorSet = new AnimatorSet();
            Animator[] animatorArr = new Animator[3];
            AnimatorSet animatorSet2 = new AnimatorSet();
            View bgView = getBgView();
            if (bgView != null) {
                animatorSet2.setStartDelay(600L);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(bgView, (Property<View, Float>) View.SCALE_X, 1.0f, 0.0f);
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILIIL());
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(bgView, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
                objectAnimatorOfFloat2.setDuration(300L);
                objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LJIILIIL());
                animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            }
            animatorArr[0] = animatorSet2;
            AnimatorSet animatorSet3 = new AnimatorSet();
            TuxTextView title = getTitle();
            if (title != null) {
                animatorSet3.setStartDelay(600L);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(title, (Property<TuxTextView, Float>) View.TRANSLATION_X, 0.0f, C418440Gaw.LIZIZ(8));
                objectAnimatorOfFloat3.setDuration(300L);
                objectAnimatorOfFloat3.setInterpolator(C1619980sG4.LJIILIIL());
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(title, (Property<TuxTextView, Float>) View.ALPHA, 1.0f, 0.0f);
                objectAnimatorOfFloat4.setDuration(300L);
                objectAnimatorOfFloat4.setInterpolator(C1619980sG4.LJIILIIL());
                animatorSet3.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
            }
            animatorArr[1] = animatorSet3;
            AnimatorSet animatorSet4 = new AnimatorSet();
            TuxTextView tagView = getTagView();
            if (tagView != null) {
                animatorSet4.setStartDelay(300L);
                ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(tagView, (Property<TuxTextView, Float>) View.SCALE_X, 1.0f, 0.0f);
                objectAnimatorOfFloat5.setDuration(300L);
                objectAnimatorOfFloat5.setInterpolator(C1619980sG4.LJIILIIL());
                ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(tagView, (Property<TuxTextView, Float>) View.SCALE_Y, 1.0f, 0.0f);
                objectAnimatorOfFloat6.setDuration(300L);
                objectAnimatorOfFloat6.setInterpolator(C1619980sG4.LJIILIIL());
                animatorSet4.playTogether(objectAnimatorOfFloat5, objectAnimatorOfFloat6);
            }
            animatorArr[2] = animatorSet4;
            animatorSet.playTogether(animatorArr);
            animatorSet.addListener(new ALAdapterS19S0200000_25(this, function0, 4));
            animatorSet.start();
            return;
        }
        C786410Ut5.b2(this, 4);
        ViewParent parent = getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            viewGroup.setClipChildren(true);
        }
        C786410Ut5.LJLLLLLL(0, this.LL.LIZJ);
        function0.invoke();
    }

    @Override // X.AbstractC1662050tLv
    public final void i0(final C1662100tM0 c1662100tM0, View view) {
        ViewGroup viewGroup;
        int i;
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        int i2 = 0;
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
        }
        getTagView().setText(c1662100tM0.LIZIZ);
        getTitle().setText(c1662100tM0.LIZJ);
        TuxTextView tagView = getTagView();
        if (C123100dR.LIZ(c1662100tM0.LIZIZ)) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLZLL(tagView, i);
        TuxTextView title = getTitle();
        if (!C123100dR.LIZ(c1662100tM0.LIZJ)) {
            i2 = 8;
        }
        C786410Ut5.LLLLZLL(title, i2);
        C786410Ut5.b2(this, 4);
        Integer num = c1662100tM0.LJFF;
        if (num != null) {
            getLottieView().setAnimation(num.intValue());
        }
        getLottieView().addLottieOnCompositionLoadedListener(new InterfaceC1296230jpt() { // from class: X.0tOI
            @Override // X.InterfaceC1296230jpt
            public final void LIZ(C1294720jnS c1294720jnS) {
                C1663510tOH c1663510tOH = this;
                HandlerHook.viewPost(c1663510tOH, new ARunnableS94S0200000_25(c1662100tM0, c1663510tOH, 26));
            }
        });
    }
}
