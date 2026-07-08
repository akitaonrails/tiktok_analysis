package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0GXI, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GXI extends FrameLayout {
    public Function1<? super MotionEvent, Boolean> LL;

    public final Function1<MotionEvent, Boolean> getOnTouchEventDispatch() {
        return this.LL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Function1<? super MotionEvent, Boolean> function1 = this.LL;
        if (function1 != null) {
            Boolean boolInvoke = function1.invoke(motionEvent);
            if (boolInvoke != null) {
                return boolInvoke.booleanValue();
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setOnTouchEventDispatch(Function1<? super MotionEvent, Boolean> function1) {
        this.LL = function1;
    }

    public C0GXI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
