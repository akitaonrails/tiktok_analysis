package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03ES, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03ES extends FrameLayout {
    public Function1<? super MotionEvent, Boolean> LL;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Function1<? super MotionEvent, Boolean> function1 = this.LL;
        if (function1 != null) {
            return function1.invoke(motionEvent).booleanValue();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setInterceptListener(Function1<? super MotionEvent, Boolean> function1) {
        this.LL = function1;
    }

    public C03ES(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
