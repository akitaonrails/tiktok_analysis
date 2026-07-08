package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: renamed from: X.04E7, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04E7 extends ViewPager {
    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public C04E7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setClipChildren(false);
        setFadingEdgeLength(0);
    }
}
