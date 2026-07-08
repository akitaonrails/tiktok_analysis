package X;

import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: X.0c23, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class RunnableC996250c23 implements Runnable {
    public final /* synthetic */ C1145830fvJ LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    public RunnableC996250c23(C1145830fvJ c1145830fvJ, int i, long j) {
        this.LL = c1145830fvJ;
        this.LLILLJJLI = i;
        this.LLILLL = j;
    }

    public final void LIZ() {
        this.LL.LIZ();
        if (this.LLILLJJLI == 0) {
            C20441214yg.LIZIZ("ScrollTextView", "Scroll speed is 0");
            return;
        }
        if (this.LL.LL.getWidth() <= this.LL.getWidth()) {
            C20441214yg.LIZIZ("ScrollTextView", "Text is smaller than width, no need to scroll");
            return;
        }
        C1145830fvJ c1145830fvJ = this.LL;
        int width = c1145830fvJ.LLILLJJLI ? 0 : c1145830fvJ.LL.getWidth() - this.LL.getWidth();
        long width2 = (long) (((this.LL.LL.getWidth() - this.LL.getWidth()) / this.LLILLJJLI) * 1000);
        long j = this.LLILLL;
        if (width2 > j) {
            width2 = j;
        }
        if (width2 > 0) {
            C1145830fvJ c1145830fvJ2 = this.LL;
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(c1145830fvJ2, "scrollX", width);
            objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
            objectAnimatorOfInt.setDuration(width2);
            C786410Ut5.Pd(objectAnimatorOfInt);
            c1145830fvJ2.LLILZIL = objectAnimatorOfInt;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ScrollTextView@32c.startScroll$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ScrollTextView@32c.startScroll$1");
    }
}
