package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: X.0Rrl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C709150Rrl extends RelativeLayout {
    public View.OnTouchListener LL;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.LL;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setInterceptTouchListener(View.OnTouchListener onTouchListener) {
        this.LL = onTouchListener;
    }

    public C709150Rrl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
