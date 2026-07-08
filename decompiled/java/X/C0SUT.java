package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: X.0SUT, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public class C0SUT extends RelativeLayout {
    public C0SUN LL;

    public final C0SUN getBackgroundTouchListener() {
        return this.LL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C0SUN c0sun;
        C0SUN c0sun2 = this.LL;
        if (c0sun2 != null && c0sun2.LIZJ() && (c0sun = this.LL) != null) {
            c0sun.LIZLLL(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setBackgroundTouchListener(C0SUN c0sun) {
        this.LL = c0sun;
    }

    public C0SUT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
