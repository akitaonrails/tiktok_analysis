package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: renamed from: X.0Kmg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C527640Kmg extends ViewPager {
    public final boolean LL;

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LL) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public C527640Kmg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = true;
    }
}
