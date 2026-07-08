package X;

import Y.AUListenerS280S0100000_33;
import android.animation.Animator;
import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.19uN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21688519uN implements Animator.AnimatorListener {
    public final float LL;
    public final float LLILLJJLI;
    public final float LLILLL;
    public final float LLILZ;
    public final RecyclerView.ViewHolder LLILZIL;
    public final int LLILZLL;
    public final ValueAnimator LLIZ;
    public boolean LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public float LLJILJILJ;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.LLJILJILJ = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (!this.LLJILJIL) {
            this.LLILZIL.setIsRecyclable(true);
        }
        this.LLJILJIL = true;
    }

    public C21688519uN(RecyclerView.ViewHolder viewHolder, int i, float f, float f2, float f3, float f4) {
        this.LLILZLL = i;
        this.LLILZIL = viewHolder;
        this.LL = f;
        this.LLILLJJLI = f2;
        this.LLILLL = f3;
        this.LLILZ = f4;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LLIZ = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS280S0100000_33(this, 0));
        valueAnimatorOfFloat.setTarget(viewHolder.itemView);
        valueAnimatorOfFloat.addListener(this);
        this.LLJILJILJ = 0.0f;
    }
}
