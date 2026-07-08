package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.0Udq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C776960Udq extends LinearLayout {
    public View.OnTouchListener LL;

    public C776960Udq(Context context) {
        super(context, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.LL;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setDetectLayoutListener(View.OnTouchListener onTouchListener) {
        this.LL = onTouchListener;
    }
}
