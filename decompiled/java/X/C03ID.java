package X;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: X.03ID, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03ID implements View.OnTouchListener {
    public final float LL = 0.5f;
    public final float LLILLJJLI = 1.0f;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return false;
            }
            C786410Ut5.T4(view, this.LLILLJJLI);
            return false;
        }
        C786410Ut5.T4(view, this.LL);
        return false;
    }
}
