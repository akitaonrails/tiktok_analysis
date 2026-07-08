package X;

import android.animation.Animator;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0SnR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C731950SnR implements Animator.AnimatorListener {
    public final Boolean LL = Boolean.FALSE;
    public Aweme LLILLJJLI;
    public final /* synthetic */ C731940SnQ LLILLL;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    public C731950SnR(C731940SnQ c731940SnQ) {
        this.LLILLL = c731940SnQ;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.LLILLL.LJIIIZ(false);
        this.LLILLL.LJFF(this.LLILLJJLI);
        this.LLILLL.removeAnimatorListener(this);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.LLILLL.LJIIIZ(false);
        if (this.LL.booleanValue()) {
            this.LLILLL.LJ(Boolean.FALSE);
        }
        this.LLILLL.getClass();
        this.LLILLL.LJFF(this.LLILLJJLI);
        this.LLILLL.removeAnimatorListener(this);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.LL.booleanValue()) {
            this.LLILLL.LJ(Boolean.TRUE);
        }
        if (!C589300N9k.LIZIZ()) {
            this.LLILLL.LJIIIZ(true);
        }
    }

    public C731950SnR(C731940SnQ c731940SnQ, Aweme aweme) {
        this.LLILLL = c731940SnQ;
        this.LLILLJJLI = aweme;
    }
}
