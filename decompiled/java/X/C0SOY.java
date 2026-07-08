package X;

import Y.AAListenerS136S0300000_11;
import Y.AUListenerS219S0200000_11;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;

/* JADX INFO: renamed from: X.0SOY, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SOY extends C0SOZ {
    public final int LJIIJJI;
    public final EnumC707300Rom LJIIL;
    public final C0GSG LJIILIIL;
    public final /* synthetic */ C0SOW LJIILJJIL;

    @Override // X.C0SOX, X.AbstractC720520SOc
    public final int LJ() {
        return (super.LJ() + this.LJIIJJI) - this.LJIILJJIL.getDotSize();
    }

    @Override // X.C0SOZ, X.C0SOX, X.AbstractC720520SOc
    public final EnumC707300Rom LIZLLL() {
        return this.LJIIL;
    }

    @Override // X.AbstractC720520SOc
    public final void LJIIIZ(int i) {
        Animator animator = this.LJIILJJIL.LLJILJIL;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.LJIILJJIL.LLJILJILJ;
        if (animator2 != null) {
            animator2.cancel();
        }
        super.LJIIIZ(i);
    }

    @Override // X.AbstractC720520SOc
    public final void LJIILJJIL(float f) {
        this.LJIILIIL.LIZ(f);
    }

    @Override // X.C0SOX
    public final void LJIILL(int i) {
        if (!(((ImageView) ListProtector.get(this.LJIILJJIL.LLIZ, i)).getDrawable() instanceof C0GSG)) {
            super.LJIILL(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SOY(C0SOW c0sow, Context context) {
        super(c0sow);
        this.LJIILJJIL = c0sow;
        this.LJIIJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        this.LJIIL = EnumC707300Rom.PROGRESS_BAR;
        this.LJIILIIL = new C0GSG(context);
    }

    @Override // X.C0SOX, X.AbstractC720520SOc
    public final void LJIIJ(int i, long j) {
        ImageView imageViewLIZLLL = this.LJIILJJIL.LIZLLL(i);
        if (imageViewLIZLLL == null) {
            return;
        }
        this.LJIILIIL.LIZ(0.0f);
        imageViewLIZLLL.setImageDrawable(this.LJIILIIL);
        if (j <= 0) {
            C786410Ut5.V4(imageViewLIZLLL, 1.0f);
            C0SOW c0sow = this.LJIILJJIL;
            int i2 = this.LJIIJJI;
            c0sow.getClass();
            C0SOW.LJIILJJIL(i2, imageViewLIZLLL);
            return;
        }
        Animator animator = this.LJIILJJIL.LLJILJIL;
        if (animator != null) {
            animator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(imageViewLIZLLL.getWidth(), this.LJIIJJI);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS219S0200000_11(this.LJIILJJIL, imageViewLIZLLL, 9));
        valueAnimatorOfInt.setDuration(j);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageViewLIZLLL, "alpha", imageViewLIZLLL.getAlpha(), 1.0f);
        objectAnimatorOfFloat.setDuration(j);
        AnimatorSet animatorSet = new AnimatorSet();
        C0SOW c0sow2 = this.LJIILJJIL;
        animatorSet.playTogether(valueAnimatorOfInt, objectAnimatorOfFloat);
        animatorSet.addListener(new AAListenerS136S0300000_11(c0sow2, this, imageViewLIZLLL, 1));
        animatorSet.start();
        this.LJIILJJIL.LLJILJIL = animatorSet;
    }

    @Override // X.C0SOX, X.AbstractC720520SOc
    public final void LJIIJJI(int i, long j) {
        ImageView imageViewLIZLLL = this.LJIILJJIL.LIZLLL(i);
        if (imageViewLIZLLL == null) {
            return;
        }
        this.LJIILJJIL.LJII(imageViewLIZLLL);
        if (j <= 0) {
            C786410Ut5.V4(imageViewLIZLLL, LIZ());
            C0SOW.LJIILJJIL(this.LJIILJJIL.getDotSize(), imageViewLIZLLL);
            return;
        }
        Animator animator = this.LJIILJJIL.LLJILJILJ;
        if (animator != null) {
            animator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(imageViewLIZLLL.getWidth(), this.LJIILJJIL.getDotSize());
        valueAnimatorOfInt.addUpdateListener(new AUListenerS219S0200000_11(this.LJIILJJIL, imageViewLIZLLL, 10));
        valueAnimatorOfInt.setDuration(j);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageViewLIZLLL, "alpha", imageViewLIZLLL.getAlpha(), LIZ());
        objectAnimatorOfFloat.setDuration(j);
        AnimatorSet animatorSet = new AnimatorSet();
        C0SOW c0sow = this.LJIILJJIL;
        animatorSet.playTogether(valueAnimatorOfInt, objectAnimatorOfFloat);
        animatorSet.addListener(new AAListenerS136S0300000_11(c0sow, this, imageViewLIZLLL, 2));
        animatorSet.start();
        this.LJIILJJIL.LLJILJILJ = animatorSet;
    }
}
