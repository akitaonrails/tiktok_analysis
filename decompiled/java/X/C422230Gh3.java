package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Gh3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C422230Gh3 extends LinearLayout {
    public Function1<? super MotionEvent, Unit> LL;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Function1<? super MotionEvent, Unit> function1 = this.LL;
        if (function1 != null) {
            function1.invoke(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setDispatchTouchEventListener(Function1<? super MotionEvent, Unit> function1) {
        this.LL = function1;
    }

    public C422230Gh3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
