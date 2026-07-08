package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

/* JADX INFO: renamed from: X.0kQ8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1318700kQ8 extends ScrollView {
    public boolean LL;
    public boolean LLILLJJLI;

    public final void LIZ(int i) {
        super.scrollTo(0, i);
    }

    @Override // android.widget.ScrollView
    public final int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        if (this.LL) {
            return 0;
        }
        return super.computeScrollDeltaToGetChildRectOnScreen(rect);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (C788530UwV.LIZ("dispatchScrollViewTouchEvent")) {
            C2188191AkT.LIZLLL();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLILLJJLI) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setForbidScroll(boolean z) {
        this.LLILLJJLI = z;
    }

    public C1318700kQ8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void scrollTo(int i, int i2) {
        if (this.LLILLJJLI) {
            return;
        }
        super.scrollTo(i, i2);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.LLILLJJLI && super.onNestedFling(view, f, f2, z)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        if (this.LLILLJJLI) {
            return;
        }
        super.onNestedScroll(view, i, i2, i3, i4);
    }
}
