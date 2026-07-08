package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Km6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C527280Km6 extends ViewPager {
    public Boolean disableSwiping;
    public boolean smoothScroll;

    public C527280Km6(Context context) {
        this(context, null);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (Intrinsics.LJFF(this.disableSwiping, Boolean.FALSE)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (Intrinsics.LJFF(this.disableSwiping, Boolean.FALSE)) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        super.setCurrentItem(i, this.smoothScroll);
    }

    public final void setDisableSwiping(Boolean bool) {
        this.disableSwiping = bool;
    }

    public final void setSmoothScroll(boolean z) {
        this.smoothScroll = z;
    }

    public C527280Km6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.disableSwiping = Boolean.FALSE;
        this.smoothScroll = true;
    }
}
