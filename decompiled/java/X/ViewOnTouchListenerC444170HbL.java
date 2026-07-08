package X;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: X.0HbL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ViewOnTouchListenerC444170HbL implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return false;
            }
            C444160HbK.LIZ(view, false);
            return false;
        }
        C444160HbK.LIZ(view, true);
        return false;
    }
}
