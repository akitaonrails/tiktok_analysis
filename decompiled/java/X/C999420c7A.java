package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0c7A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C999420c7A extends FrameLayout {
    public View LL;
    public View LLILLJJLI;
    public ObjectAnimator LLILLL;
    public ObjectAnimator LLILZ;
    public AnimatorSet LLILZIL;

    public final void LIZ() {
        if (this.LLILZIL.isStarted()) {
            this.LLILZIL.cancel();
        }
        if (this.LLILLL.isStarted()) {
            this.LLILLL.cancel();
        }
        if (this.LLILZ.isStarted()) {
            this.LLILZ.cancel();
        }
        int visibility = getVisibility();
        setVisibility(4);
        C1602160rnK.LIZIZ(visibility, 4, this);
    }

    public C999420c7A(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View viewSd = C786410Ut5.Sd(R.layout.i_5, C786410Ut5.ne(context), this);
        this.LLILLJJLI = viewSd;
        View viewFindViewById = viewSd.findViewById(R.id.mps);
        this.LL = viewFindViewById;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewFindViewById, "scaleX", 0.05f, 1.0f);
        this.LLILLL = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(800L);
        this.LLILLL.setRepeatCount(-1);
        this.LLILLL.setInterpolator(new C21388418n4());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LL, "scaleX", 1.0f, 0.05f);
        this.LLILZ = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setDuration(100L);
        this.LLILZ.setRepeatCount(-1);
        this.LLILZ.setInterpolator(new C21388418n4());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(this.LLILLL, this.LLILZ);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.LLILZIL = animatorSet2;
        animatorSet2.play(animatorSet);
    }
}
