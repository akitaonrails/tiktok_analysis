package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0sDO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1618320sDO extends ConstraintLayout {
    public Function1<? super MotionEvent, Unit> LL;

    public final Function1<MotionEvent, Unit> getOnDispatchTouchEvent() {
        return this.LL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C1561220qjI.LIZ.getClass();
        if (!C1561220qjI.LIZ()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        Function1<? super MotionEvent, Unit> function1 = this.LL;
        if (function1 != null) {
            function1.invoke(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setOnDispatchTouchEvent(Function1<? super MotionEvent, Unit> function1) {
        this.LL = function1;
    }

    public C1618320sDO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
