package X;

import Y.AAListenerS343S0100000_33;
import Y.AUListenerS280S0100000_33;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.19rt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21673119rt {
    public ValueAnimator LIZ;
    public int LIZIZ;
    public float LIZJ;
    public final LinkedList<View> LIZLLL = new LinkedList<>();
    public final ViewGroup LJ;
    public InterfaceC21673219ru LJFF;

    public final void LIZ() {
        ValueAnimator valueAnimator = this.LIZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.LIZ = null;
        }
        if (this.LIZIZ == 2) {
            this.LIZ = ValueAnimator.ofFloat(1.0f, 0.5f);
        } else {
            this.LIZ = ValueAnimator.ofFloat(0.5f, 1.0f);
        }
        this.LIZ.setDuration(300L);
        this.LIZ.setInterpolator(new LinearInterpolator());
        this.LIZ.addUpdateListener(new AUListenerS280S0100000_33(this, 31));
        this.LIZ.addListener(new AAListenerS343S0100000_33(this, 6));
        this.LIZ.start();
    }

    public C21673119rt(ViewGroup viewGroup) {
        this.LJ = viewGroup;
    }

    public final void LIZIZ(float f) {
        for (View view : this.LIZLLL) {
            C786410Ut5.T4(view, f);
            if (f == 0.0f) {
                view.setEnabled(false);
            }
            if (f == 1.0f) {
                view.setEnabled(true);
            }
        }
    }
}
