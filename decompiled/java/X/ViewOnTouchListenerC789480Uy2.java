package X;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: X.0Uy2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ViewOnTouchListenerC789480Uy2 implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            C786410Ut5.Ob(view, 0.96f);
            C786410Ut5.pc(view, 0.96f);
            C786410Ut5.T4(view, 0.64f);
            return false;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        }
        C786410Ut5.Ob(view, 1.0f);
        C786410Ut5.pc(view, 1.0f);
        C786410Ut5.T4(view, 1.0f);
        return false;
    }
}
