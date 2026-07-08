package X;

import Y.ALAdapterS5S0210000_32;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Vibrator;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: renamed from: X.19KL, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19KL extends C19KJ {
    public C1664680tQA<C390640FTi> LLJIJIL;
    public LifecycleOwner LLJILJIL;
    public View LLJILJILJ;
    public C1295960jpS LLJILLL;
    public boolean LLJJ;
    public Vibrator LLJJI;

    public C19KL(Context context) {
        super(context, null, 0);
    }

    public final void LIZIZ(View view, boolean z) {
        C1295960jpS c1295960jpS;
        if (z && (c1295960jpS = this.LLJILLL) != null) {
            c1295960jpS.setMinAndMaxProgress(1.0f, 1.0f);
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", !z ? 1 : 0, z ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJII());
        objectAnimatorOfFloat.addListener(new ALAdapterS5S0210000_32(view, this, z, 3));
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }
}
