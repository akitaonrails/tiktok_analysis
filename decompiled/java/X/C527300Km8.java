package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: renamed from: X.0Km8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C527300Km8 extends ViewPager {
    public boolean LL;

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = this.LL;
        if (z) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (!z) {
            return false;
        }
        throw new C1954807lC();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = this.LL;
        if (z) {
            return super.onTouchEvent(motionEvent);
        }
        if (!z) {
            return false;
        }
        throw new C1954807lC();
    }

    public final void setSwipePagingEnabled(boolean z) {
        this.LL = z;
    }

    public C527300Km8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
