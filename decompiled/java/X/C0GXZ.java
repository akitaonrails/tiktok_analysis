package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0GXZ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GXZ extends ConstraintLayout {
    public Function0<Unit> LL;

    public C0GXZ() {
        throw null;
    }

    public final Function0<Unit> getOnTouchDispatch() {
        return this.LL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Function0<Unit> function0 = this.LL;
        if (function0 != null) {
            function0.invoke();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setOnTouchDispatch(Function0<Unit> function0) {
        this.LL = function0;
    }

    public C0GXZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
