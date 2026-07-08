package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: X.16BC, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public abstract class C16BC<V extends View> {
    public boolean getInsetDodgeRect(C16G0 c16g0, V v, Rect rect) {
        return false;
    }

    public int getScrimColor(C16G0 c16g0, V v) {
        return -16777216;
    }

    public float getScrimOpacity(C16G0 c16g0, V v) {
        return 0.0f;
    }

    public boolean layoutDependsOn(C16G0 c16g0, V v, View view) {
        return false;
    }

    public C20246014Ju onApplyWindowInsets(C16G0 c16g0, V v, C20246014Ju c20246014Ju) {
        return c20246014Ju;
    }

    public void onAttachedToLayoutParams(C16G1 c16g1) {
    }

    public boolean onDependentViewChanged(C16G0 c16g0, V v, View view) {
        return false;
    }

    public void onDependentViewRemoved(C16G0 c16g0, V v, View view) {
    }

    public void onDetachedFromLayoutParams() {
    }

    public boolean onInterceptTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) {
        return false;
    }

    public boolean onLayoutChild(C16G0 c16g0, V v, int i) {
        return false;
    }

    public boolean onMeasureChild(C16G0 c16g0, V v, int i, int i2, int i3, int i4) {
        return false;
    }

    public boolean onNestedFling(C16G0 c16g0, V v, View view, float f, float f2, boolean z) {
        return false;
    }

    public boolean onNestedPreFling(C16G0 c16g0, V v, View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(C16G0 c16g0, V v, View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(C16G0 c16g0, V v, View view, int i, int i2, int i3, int i4) {
    }

    public void onNestedScrollAccepted(C16G0 c16g0, V v, View view, View view2, int i) {
    }

    public boolean onRequestChildRectangleOnScreen(C16G0 c16g0, V v, Rect rect, boolean z) {
        return false;
    }

    public void onRestoreInstanceState(C16G0 c16g0, V v, Parcelable parcelable) {
    }

    public boolean onStartNestedScroll(C16G0 c16g0, V v, View view, View view2, int i) {
        return false;
    }

    public void onStopNestedScroll(C16G0 c16g0, V v, View view) {
    }

    public boolean onTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) {
        return false;
    }

    public C16BC() {
    }

    public static Object getTag(View view) {
        return ((C16G1) view.getLayoutParams()).LJIIZILJ;
    }

    public C16BC(Context context, AttributeSet attributeSet) {
    }

    public static void setTag(View view, Object obj) {
        ((C16G1) view.getLayoutParams()).LJIIZILJ = obj;
    }

    public boolean blocksInteractionBelow(C16G0 c16g0, V v) {
        if (getScrimOpacity(c16g0, v) > 0.0f) {
            return true;
        }
        return false;
    }

    public Parcelable onSaveInstanceState(C16G0 c16g0, V v) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public void onStopNestedScroll(C16G0 c16g0, V v, View view, int i) {
        if (i == 0) {
            onStopNestedScroll(c16g0, v, view);
        }
    }

    public void onNestedScrollAccepted(C16G0 c16g0, V v, View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(c16g0, v, view, view2, i);
        }
    }

    public boolean onStartNestedScroll(C16G0 c16g0, V v, View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(c16g0, v, view, view2, i);
        }
        return false;
    }

    public void onNestedPreScroll(C16G0 c16g0, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(c16g0, v, view, i, i2, iArr);
        }
    }

    public void onNestedScroll(C16G0 c16g0, V v, View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(c16g0, v, view, i, i2, i3, i4);
        }
    }

    public void onNestedScroll(C16G0 c16g0, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        onNestedScroll(c16g0, v, view, i, i2, i3, i4, i5);
    }
}
