package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0J6p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C486650J6p extends FrameLayout {
    static {
        C341940Daq.LIZ(8.0d);
    }

    public C486650J6p(Context context) {
        super(context);
    }

    public final void LIZ(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            motionEvent.getX();
            motionEvent.getY();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        super.onInterceptTouchEvent(motionEvent);
        LIZ(motionEvent);
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        LIZ(motionEvent);
        return true;
    }

    public C486650J6p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
