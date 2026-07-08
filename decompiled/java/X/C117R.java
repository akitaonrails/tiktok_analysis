package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* JADX INFO: renamed from: X.117R, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C117R extends C21594419fC {
    public boolean LLILZIL;

    @Override // X.C21594419fC, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LLILZIL) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // X.C21594419fC, androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLILZIL) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setSwipeEnabled(boolean z) {
        this.LLILZIL = z;
    }

    public C117R(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZIL = true;
    }
}
