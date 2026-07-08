package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0Ec2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368160Ec2 extends ValueAnimator {
    public final ArrayList<ValueAnimator.AnimatorUpdateListener> LL = new ArrayList<>();
    public final ArrayList<Animator.AnimatorListener> LLILLJJLI = new ArrayList<>();

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        super.removeAllListeners();
        this.LLILLJJLI.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        super.removeAllUpdateListeners();
        this.LL.clear();
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        super.addListener(animatorListener);
        if (animatorListener != null) {
            this.LLILLJJLI.add(animatorListener);
        }
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        super.addUpdateListener(animatorUpdateListener);
        if (animatorUpdateListener != null) {
            this.LL.add(animatorUpdateListener);
        }
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        super.removeListener(animatorListener);
        if (animatorListener != null) {
            this.LLILLJJLI.remove(animatorListener);
        }
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        super.removeUpdateListener(animatorUpdateListener);
        if (animatorUpdateListener != null) {
            this.LL.remove(animatorUpdateListener);
        }
    }

    @Override // android.animation.ValueAnimator
    public final void setFloatValues(float... fArr) {
        super.setFloatValues(Arrays.copyOf(fArr, fArr.length));
    }

    @Override // android.animation.ValueAnimator
    public final void setIntValues(int... iArr) {
        super.setIntValues(Arrays.copyOf(iArr, iArr.length));
    }
}
