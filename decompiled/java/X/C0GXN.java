package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0GXN, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GXN extends FrameLayout {
    public float LL;

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return true;
    }

    private final void setDragAreaHeight(float f) {
        this.LL = f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y;
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        float f = this.LL;
        if (motionEvent != null) {
            y = motionEvent.getY();
        } else {
            y = Float.MAX_VALUE;
        }
        if (f <= y) {
            setNestedScrollingEnabled(false);
            return true;
        }
        setNestedScrollingEnabled(true);
        return zDispatchTouchEvent;
    }

    public C0GXN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float dimension = Float.MAX_VALUE;
        this.LL = Float.MAX_VALUE;
        TypedArray typedArrayObtainStyledAttributes = null;
        if (attributeSet != null) {
            try {
                try {
                    typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BottomSheetContainer);
                    if (typedArrayObtainStyledAttributes != null) {
                        dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.BottomSheetContainer_touchAreaHeight, Float.MAX_VALUE);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (typedArrayObtainStyledAttributes == null) {
                        return;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (typedArrayObtainStyledAttributes != null) {
                    typedArrayObtainStyledAttributes.recycle();
                }
                throw th;
            }
        }
        this.LL = dimension;
        if (typedArrayObtainStyledAttributes != null) {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
