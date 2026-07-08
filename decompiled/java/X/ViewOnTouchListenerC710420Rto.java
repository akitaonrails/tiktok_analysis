package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: X.0Rto, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class ViewOnTouchListenerC710420Rto implements View.OnTouchListener {
    public String LL;
    public float LLILLJJLI;
    public float LLILLL;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Context context;
        Integer numValueOf;
        if (view != null && (context = view.getContext()) != null) {
            int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
                if (numValueOf.intValue() == 0) {
                    this.LLILLJJLI = motionEvent.getRawX();
                    this.LLILLL = motionEvent.getRawY();
                    return false;
                }
                if (numValueOf.intValue() != 2 || !C0COM.LIZ()) {
                    return false;
                }
                C01GW<C0RGG> c01gw = C0RGG.LJ;
                if (!C586380MzE.LIZ().LIZIZ(this.LL)) {
                    return false;
                }
                float fAbs = Math.abs(this.LLILLJJLI - motionEvent.getRawX());
                float fAbs2 = Math.abs(this.LLILLL - motionEvent.getRawY());
                float f = scaledTouchSlop;
                if (fAbs <= f && fAbs2 <= f) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }
}
