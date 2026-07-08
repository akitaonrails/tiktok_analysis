package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0EGd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C361730EGd extends ConstraintLayout {
    public Function1<? super MotionEvent, Boolean> LL;

    public C361730EGd() {
        throw null;
    }

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

    public C361730EGd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
