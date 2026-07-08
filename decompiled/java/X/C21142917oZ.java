package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS278S0000000_32;

/* JADX INFO: renamed from: X.17oZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21142917oZ extends ConstraintLayout {
    public Function1<? super MotionEvent, Unit> LL;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.LL.invoke(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setDispatchTouchEventListener(Function1<? super MotionEvent, Unit> function1) {
        this.LL = function1;
    }

    public C21142917oZ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C21142917oZ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = AFwS278S0000000_32.get$arr$(34);
    }
}
