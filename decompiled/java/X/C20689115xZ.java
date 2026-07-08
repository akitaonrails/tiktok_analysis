package X;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: X.15xZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20689115xZ extends FrameLayout {
    public boolean LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;

    public C20689115xZ(Context context) {
        super(context);
        this.LL = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.LL) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (isChildrenDrawingOrderEnabled() && this.LLILLL && (view instanceof C1710130ubT)) {
            this.LLILLL = false;
        }
    }

    @Override // android.view.ViewGroup
    public void setChildrenDrawingOrderEnabled(boolean z) {
        super.setChildrenDrawingOrderEnabled(z);
    }

    public void setDrawAnimationViewToFront(boolean z) {
        if (isChildrenDrawingOrderEnabled()) {
            this.LLILLJJLI = z;
            invalidate();
            return;
        }
        throw new IllegalStateException("please invoke setChildrenDrawingOrderEnabled(true) first");
    }

    public void setTouchEnabled(boolean z) {
        this.LL = z;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        if (this.LLILLJJLI && this.LLILLL) {
            if (i2 == i - 1) {
                return 0;
            }
            return i2 + 1;
        }
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (!isChildrenDrawingOrderEnabled()) {
            return;
        }
        Class<?> cls = view.getClass();
        if (cls != FrameLayout.class && cls != LinearLayout.class && cls != RelativeLayout.class && (view instanceof C1710130ubT)) {
            if (i == 0) {
                if (!this.LLILLL) {
                    this.LLILLL = true;
                    return;
                }
                throw new IllegalStateException("AnimationContainerLayout is already added");
            }
            throw new IllegalArgumentException("AnimationContainerLayout should add to 0");
        }
        if (!this.LLILLL || i != 0) {
        } else {
            throw new IllegalArgumentException("only AnimationContainerLayout can be added to 0");
        }
    }
}
