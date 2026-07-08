package X;

import Y.ALAdapterS19S0200000_25;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: X.0tEh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class ViewOnTouchListenerC1657570tEh implements View.OnTouchListener {
    public final float LL;
    public final long LLILLJJLI;
    public final View LLILLL;
    public boolean LLILZ;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return false;
            }
            ViewPropertyAnimator duration = this.LLILLL.animate().scaleX(1.0f).scaleY(1.0f).setDuration(this.LLILLJJLI);
            if (this.LLILZ) {
                duration.setListener(new ALAdapterS19S0200000_25(this, duration, 2));
            }
            duration.start();
            return false;
        }
        this.LLILLL.animate().scaleX(this.LL).scaleY(this.LL).setDuration(this.LLILLJJLI).start();
        return false;
    }

    public ViewOnTouchListenerC1657570tEh(float f, long j, View view) {
        this.LL = f;
        this.LLILLJJLI = j;
        this.LLILLL = view;
    }
}
