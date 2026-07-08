package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

/* JADX INFO: renamed from: X.13hw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20082613hw extends ViewGroup {
    public final HashMap<C20084713iH, C20053713dH> LL;
    public final HashMap<C20053713dH, C20084713iH> LLILLJJLI;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C20053713dH c20053713dH = this.LL.get(childAt);
            if (childAt.isLayoutRequested() && c20053713dH != null) {
                C20053713dH.LJJLI(c20053713dH, false, 7);
            }
        }
    }

    public final HashMap<C20084713iH, C20053713dH> getHolderToLayoutNode() {
        return this.LL;
    }

    public final HashMap<C20053713dH, C20084713iH> getLayoutNodeToHolder() {
        return this.LLILLJJLI;
    }

    public C20082613hw(Context context) {
        super(context);
        setClipChildren(false);
        this.LL = new HashMap<>();
        this.LLILLJJLI = new HashMap<>();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            C1696250uF5.LIZ("widthMeasureSpec should be EXACTLY");
        }
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            C1696250uF5.LIZ("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        for (C20084713iH c20084713iH : this.LL.keySet()) {
            int i4 = c20084713iH.LLJJJ;
            if (i4 != Integer.MIN_VALUE && (i3 = c20084713iH.LLJJJIL) != Integer.MIN_VALUE) {
                c20084713iH.measure(i4, i3);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (ViewGroup viewGroup : this.LL.keySet()) {
            viewGroup.layout(viewGroup.getLeft(), viewGroup.getTop(), viewGroup.getRight(), viewGroup.getBottom());
        }
    }
}
