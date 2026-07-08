package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: renamed from: X.0Km7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C527290Km7 extends ViewPager {
    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getCurrentItem() == 0 && getChildCount() == 0) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getCurrentItem() == 0 && getChildCount() == 0) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public C527290Km7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
