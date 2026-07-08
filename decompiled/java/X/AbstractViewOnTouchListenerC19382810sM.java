package X;

import Y.ALAdapterS13S0300000_29;
import Y.ALAdapterS23S0200000_29;
import android.animation.Animator;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: X.10sM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractViewOnTouchListenerC19382810sM implements View.OnTouchListener {
    public abstract Animator LIZ(View view);

    public abstract void LIZIZ(MotionEvent motionEvent, View view);

    public abstract Animator LIZJ(View view);

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Animator animatorLIZ = LIZ(view);
            animatorLIZ.addListener(new ALAdapterS23S0200000_29(this, view, motionEvent, 2));
            animatorLIZ.start();
            return true;
        }
        if (motionEvent.getAction() == 1) {
            Animator animatorLIZJ = LIZJ(view);
            animatorLIZJ.addListener(new ALAdapterS13S0300000_29(this, view, motionEvent, 0));
            animatorLIZJ.start();
            return true;
        }
        if (motionEvent.getAction() == 3) {
            LIZJ(view).start();
        }
        return false;
    }
}
