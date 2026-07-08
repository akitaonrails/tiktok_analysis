package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Qch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C674330Qch extends RelativeLayout {
    public Function1<? super MotionEvent, Unit> LL;

    public final Function1<MotionEvent, Unit> getTouchHandle() {
        return this.LL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Function1<? super MotionEvent, Unit> function1 = this.LL;
        if (function1 != null) {
            function1.invoke(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setTouchHandle(Function1<? super MotionEvent, Unit> function1) {
        this.LL = function1;
    }

    public C674330Qch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
