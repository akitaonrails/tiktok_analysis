package X;

import Y.AAListenerS317S0100000_6;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0HEy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC437860HEy extends FrameLayout {
    public final C01GW LL;
    public final AnimatorSet LLILLJJLI;
    public final AnimatorSet LLILLL;
    public boolean LLILZ;

    public abstract View LIZ();

    public final void LIZIZ() {
        if (this.LLILZ) {
            this.LLILZ = false;
            if (this.LLILLJJLI.isRunning()) {
                this.LLILLJJLI.cancel();
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "translationY", getTranslationY(), getHeight());
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 0.0f);
            this.LLILLL.setDuration(200L);
            this.LLILLL.setInterpolator(new C21388018n0());
            this.LLILLL.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
            this.LLILLL.start();
            this.LLILLL.addListener(new AAListenerS317S0100000_6(this, 21));
        }
    }

    public final View getView() {
        return (View) this.LL.getValue();
    }

    public final void setShow(boolean z) {
        this.LLILZ = z;
    }

    public AbstractC437860HEy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC437860HEy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C452501pT.LIZIZ(new C437870HEz(this));
        this.LLILLJJLI = new AnimatorSet();
        this.LLILLL = new AnimatorSet();
    }
}
