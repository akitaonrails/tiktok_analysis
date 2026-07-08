package X;

import Y.AUListenerS269S0100000_20;
import android.animation.ValueAnimator;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;

/* JADX INFO: renamed from: X.0kjt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1330950kjt {
    public static ValueAnimator LIZ(AnimatedDrawable2 animatedDrawable2) {
        int loopCount;
        if (animatedDrawable2.LLILLJJLI) {
            loopCount = animatedDrawable2.LL;
        } else {
            InterfaceC1330960kju interfaceC1330960kju = animatedDrawable2.LLILLL;
            if (interfaceC1330960kju == null) {
                loopCount = 0;
            } else {
                loopCount = interfaceC1330960kju.getLoopCount();
            }
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, (int) animatedDrawable2.LIZLLL());
        valueAnimator.setDuration(animatedDrawable2.LIZLLL());
        if (loopCount == 0) {
            loopCount = -1;
        }
        valueAnimator.setRepeatCount(loopCount);
        valueAnimator.setRepeatMode(1);
        valueAnimator.setInterpolator(null);
        valueAnimator.addUpdateListener(new AUListenerS269S0100000_20(animatedDrawable2, 20));
        return valueAnimator;
    }
}
