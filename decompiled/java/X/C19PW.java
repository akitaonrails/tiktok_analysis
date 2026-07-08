package X;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: X.19PW, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19PW implements ValueAnimator.AnimatorUpdateListener {
    public final byte LL;
    public final /* synthetic */ C19PV LLILLJJLI;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.LL;
        if (b == 0) {
            this.LLILLJJLI.LLJJJJ = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        } else if (1 == b) {
            C19PV c19pv = this.LLILLJJLI;
            if (c19pv.LLIZLLLIL) {
                valueAnimator.cancel();
                return;
            }
            c19pv.LLJILJILJ = ((Integer) valueAnimator.getAnimatedValue()).intValue() / 2;
        } else if (2 == b) {
            this.LLILLJJLI.LLJJI = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        } else if (3 == b) {
            this.LLILLJJLI.LLJJIJIIJIL = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        } else if (4 == b) {
            this.LLILLJJLI.LLJJIJIL = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        }
        this.LLILLJJLI.invalidate();
    }

    public C19PW(C19PV c19pv, byte b) {
        this.LLILLJJLI = c19pv;
        this.LL = b;
    }
}
