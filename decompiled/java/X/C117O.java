package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* JADX INFO: renamed from: X.117O, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C117O extends C21594419fC {
    public boolean LLILZIL;

    @Override // X.C21594419fC, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.LLILZIL && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // X.C21594419fC, androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.LLILZIL && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // X.C21594419fC, androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        super.setCurrentItem(i, false);
    }

    public void setNoScroll(boolean z) {
        this.LLILZIL = z;
    }

    public C117O(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZIL = true;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
    }

    @Override // X.C21594419fC, androidx.viewpager.widget.ViewPager
    public final void setCurrentItem(int i, boolean z) {
        super.setCurrentItem(i, z);
    }
}
