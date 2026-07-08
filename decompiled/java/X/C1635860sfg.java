package X;

import Y.ACListenerS159S0100000_25;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: X.0sfg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1635860sfg {
    public final View LIZ;

    public C1635860sfg(View view) {
        this.LIZ = view;
        if (!C1621340sIG.LIZ()) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: X.0GgI
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action != 1 && action != 3) {
                            return false;
                        }
                        view2.animate().alpha(1.0f).setDuration(200L).start();
                        return false;
                    }
                    view2.animate().alpha(0.5f).setDuration(200L).start();
                    return false;
                }
            });
        }
    }

    public final void LIZ(ACListenerS159S0100000_25 aCListenerS159S0100000_25) {
        C786410Ut5.I7(aCListenerS159S0100000_25, this.LIZ);
    }
}
