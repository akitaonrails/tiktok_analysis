package X;

import Y.ALAdapterS12S0100000_16;
import Y.ARunnableS116S0100000_16;
import Y.AUListenerS265S0100000_16;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0bzM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C994580bzM extends FrameLayout {
    public final C16F5 LL;
    public final C16F5 LLILLJJLI;
    public final FrameLayout LLILLL;
    public LifecycleOwner LLILZ;
    public final LifecycleEventObserver LLILZIL;
    public EnumC994530bzH LLILZLL;
    public Animator LLIZ;
    public AnimatorSet LLIZLLLIL;
    public final ARunnableS116S0100000_16 LLJ;

    public final void LIZIZ() {
        this.LLILZLL = EnumC994530bzH.LL;
        C786410Ut5.k5(this.LL, 1.0f);
        C786410Ut5.k5(this.LLILLJJLI, 0.0f);
        C786410Ut5.LLJJJJ(this.LL, 0);
        C786410Ut5.LLJJJJ(this.LLILLJJLI, 8);
        FrameLayout frameLayout = this.LLILLL;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -2;
        } else {
            layoutParams = null;
        }
        C786410Ut5.a6(frameLayout, layoutParams);
        this.LLILLL.requestLayout();
    }

    public final void LIZJ() {
        HandlerHook.viewRemoveCallbacks(this, this.LLJ);
        Animator animator = this.LLIZ;
        if (animator != null) {
            animator.cancel();
        }
        this.LLIZ = null;
        AnimatorSet animatorSet = this.LLIZLLLIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLIZLLLIL = null;
    }

    public final int LIZLLL() {
        this.LL.setText(getContext().getString(2131856721));
        this.LL.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return this.LL.getMeasuredWidth() + this.LLILLL.getPaddingLeft() + this.LLILLL.getPaddingRight();
    }

    public final void LIZ() {
        LIZJ();
        this.LLILLJJLI.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = this.LLILLJJLI.getMeasuredWidth() + this.LLILLL.getPaddingLeft() + this.LLILLL.getPaddingRight() + C439101nJ.LIZ(4);
        int width = this.LLILLL.getWidth();
        if ((width <= 0 && (width = LIZLLL()) <= 0) || measuredWidth <= 0) {
            HandlerHook.viewPost(this.LLILLL, new ARunnableS116S0100000_16(this, 12));
            return;
        }
        FrameLayout frameLayout = this.LLILLL;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = width;
        } else {
            layoutParams = null;
        }
        C786410Ut5.a6(frameLayout, layoutParams);
        this.LLILLL.requestLayout();
        C786410Ut5.LLJJJJ(this.LLILLJJLI, 0);
        this.LLILZLL = EnumC994530bzH.LLILLJJLI;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(width, measuredWidth);
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.addUpdateListener(new AUListenerS265S0100000_16(this, 13));
        valueAnimatorOfInt.addListener(new ALAdapterS12S0100000_16(this, 0));
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LL, (Property<C16F5, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LLILLJJLI, (Property<C16F5, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(300L);
        objectAnimatorOfFloat2.setStartDelay(140L);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        this.LLIZ = valueAnimatorOfInt;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfInt, objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.LLIZLLLIL = animatorSet;
        animatorSet.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Lifecycle lifecycle;
        super.onDetachedFromWindow();
        HandlerHook.viewRemoveCallbacks(this, this.LLJ);
        LIZJ();
        LifecycleOwner lifecycleOwner = this.LLILZ;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this.LLILZIL);
        }
        this.LLILZ = null;
    }

    public final void setCountdown(Integer num) {
        EnumC994530bzH enumC994530bzH;
        if (num == null) {
            HandlerHook.viewRemoveCallbacks(this, this.LLJ);
            LIZIZ();
            LIZJ();
            return;
        }
        if (num.intValue() <= 0) {
            enumC994530bzH = EnumC994530bzH.LL;
        } else {
            enumC994530bzH = EnumC994530bzH.LLILLJJLI;
        }
        EnumC994530bzH enumC994530bzH2 = this.LLILZLL;
        if (enumC994530bzH2 == enumC994530bzH) {
            if (enumC994530bzH == EnumC994530bzH.LLILLJJLI) {
                HandlerHook.viewRemoveCallbacks(this, this.LLJ);
                this.LLILLJJLI.setText(getContext().getString(2131856722, num));
                return;
            }
            return;
        }
        EnumC994530bzH enumC994530bzH3 = EnumC994530bzH.LL;
        if (enumC994530bzH2 == enumC994530bzH3 && enumC994530bzH == EnumC994530bzH.LLILLJJLI) {
            this.LLILLJJLI.setText(getContext().getString(2131856722, num));
            LIZ();
        } else {
            if (enumC994530bzH2 != EnumC994530bzH.LLILLJJLI || enumC994530bzH != enumC994530bzH3) {
                return;
            }
            this.LLILLJJLI.setText(getContext().getString(2131856722, 0));
            HandlerHook.viewRemoveCallbacks(this, this.LLJ);
            HandlerHook.viewPostDelay(this, this.LLJ, 100L);
        }
    }

    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        Lifecycle lifecycle2;
        LifecycleOwner lifecycleOwner2 = this.LLILZ;
        if (lifecycleOwner2 != null && (lifecycle2 = lifecycleOwner2.getLifecycle()) != null) {
            lifecycle2.removeObserver(this.LLILZIL);
        }
        this.LLILZ = lifecycleOwner;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this.LLILZIL);
        }
    }

    public C994580bzM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZIL = new LifecycleEventObserver() { // from class: com.bytedance.android.live.liveinteract.competition.takestage.view.NextTurnCountdownView$lifecycleObserver$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    this.LL.LIZJ();
                }
            }
        };
        this.LLILZLL = EnumC994530bzH.LL;
        this.LLJ = new ARunnableS116S0100000_16(this, 13);
        FrameLayout.inflate(context, R.layout.hu9, this);
        this.LLILLL = (FrameLayout) findViewById(R.id.eux);
        C16F5 c16f5 = (C16F5) findViewById(R.id.xpb);
        this.LL = c16f5;
        C16F5 c16f52 = (C16F5) findViewById(R.id.xpa);
        this.LLILLJJLI = c16f52;
        c16f5.setText(context.getString(2131856721));
        c16f52.setText(context.getString(2131856722, 0));
        C786410Ut5.k5(this.LL, 1.0f);
        C786410Ut5.k5(this.LLILLJJLI, 0.0f);
        C786410Ut5.LLJJJJ(c16f5, 0);
        C786410Ut5.LLJJJJ(c16f52, 8);
    }
}
