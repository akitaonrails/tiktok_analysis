package X;

import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0GXT, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GXT {
    public boolean LIZ;
    public final ValueAnimator LIZIZ;

    public C0GXT(AFwS192S0000000_6 aFwS192S0000000_6, AUListenerS256S0100000_6 aUListenerS256S0100000_6) {
        ValueAnimator valueAnimator = (ValueAnimator) aFwS192S0000000_6.invoke();
        this.LIZIZ = valueAnimator;
        valueAnimator.addUpdateListener(aUListenerS256S0100000_6);
    }
}
