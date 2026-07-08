package X;

import Y.AUListenerS268S0100000_19;
import android.animation.ValueAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ipj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1257690ipj {
    public final ValueAnimator LIZ;
    public final ValueAnimator LIZIZ;
    public boolean LIZJ;
    public Function1<? super ValueAnimator, Unit> LIZLLL;

    public C1257690ipj() {
        float[] fArr = new float[2];
        fArr[0] = C268330AfP.LJII() ? 0.17f : 0.5f;
        fArr[1] = 1.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        this.LIZ = valueAnimatorOfFloat;
        float[] fArr2 = new float[2];
        fArr2[0] = 1.0f;
        fArr2[1] = C268330AfP.LJII() ? 0.17f : 0.5f;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fArr2);
        this.LIZIZ = valueAnimatorOfFloat2;
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS268S0100000_19(this, 19));
        valueAnimatorOfFloat.setDuration(0L);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS268S0100000_19(this, 20));
        valueAnimatorOfFloat2.setDuration(0L);
    }
}
