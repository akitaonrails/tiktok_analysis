package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.0RGD, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RGD extends LinearLayout {
    public boolean LL;
    public View.OnTouchListener LLILLJJLI;

    public final View.OnTouchListener getDispatchOnTouchListener() {
        return this.LLILLJJLI;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.LL = false;
        }
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (zDispatchTouchEvent && motionEvent != null && motionEvent.getAction() == 0) {
            this.LL = true;
        }
        if (this.LL && (onTouchListener = this.LLILLJJLI) != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        return zDispatchTouchEvent;
    }

    public final void setDispatchOnTouchListener(View.OnTouchListener onTouchListener) {
        this.LLILLJJLI = onTouchListener;
    }

    public C0RGD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
