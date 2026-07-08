package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0GXJ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GXJ extends FrameLayout {
    public Float LL;
    public Function1<? super MotionEvent, Unit> LLILLJJLI;
    public boolean LLILLL;

    public final boolean getIgnoreMaxDiff() {
        return this.LLILLL;
    }

    public final Function1<MotionEvent, Unit> getTouchHandle() {
        return this.LLILLJJLI;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Float f;
        Function1<? super MotionEvent, Unit> function1;
        if (this.LLILLL) {
            Function1<? super MotionEvent, Unit> function12 = this.LLILLJJLI;
            if (function12 != null) {
                function12.invoke(motionEvent);
            }
        } else if (motionEvent != null) {
            if (motionEvent.getAction() == 0) {
                this.LL = Float.valueOf(motionEvent.getY());
            }
            if (motionEvent.getAction() == 2 && (f = this.LL) != null && Math.abs(f.floatValue() - motionEvent.getY()) > 9.0f && (function1 = this.LLILLJJLI) != null) {
                function1.invoke(motionEvent);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setIgnoreMaxDiff(boolean z) {
        this.LLILLL = z;
    }

    public final void setTouchHandle(Function1<? super MotionEvent, Unit> function1) {
        this.LLILLJJLI = function1;
    }

    public C0GXJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
