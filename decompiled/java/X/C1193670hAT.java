package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS256S0000000_18;

/* JADX INFO: renamed from: X.0hAT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1193670hAT extends ConstraintLayout {
    public Function1<? super MotionEvent, Unit> LL;

    public final Function1<MotionEvent, Unit> getDispatchEventListener() {
        return this.LL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.LL.invoke(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setDispatchEventListener(Function1<? super MotionEvent, Unit> function1) {
        this.LL = function1;
    }

    public C1193670hAT(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1193670hAT(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = AFwS256S0000000_18.get$arr$(546);
    }
}
