package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* JADX INFO: renamed from: X.117T, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C117T extends C117S {
    public boolean LLILZIL;

    public C117T(Context context) {
        super(context);
        this.LLILZIL = true;
    }

    @Override // X.C117S, X.C21594419fC, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LLILZIL) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // X.C117S, X.C21594419fC, androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLILZIL) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setSwipeEnabled(boolean z) {
        this.LLILZIL = z;
    }

    public C117T(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZIL = true;
    }
}
