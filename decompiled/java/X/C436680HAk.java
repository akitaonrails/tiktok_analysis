package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;

/* JADX INFO: renamed from: X.0HAk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C436680HAk extends HorizontalScrollView {
    public boolean LL;

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LL && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LL && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setScrollable(boolean z) {
        this.LL = z;
    }

    public C436680HAk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = true;
    }
}
