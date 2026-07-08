package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19E3, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19E3 extends FrameLayout {
    public Function0<Unit> LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public final GestureDetector LLILZ;

    public final Function0<Unit> getOnSingleTap() {
        return this.LL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.LLILLJJLI) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.LLILZ.onTouchEvent(motionEvent);
        if (this.LLILLL) {
            this.LLILLL = false;
            Function0<Unit> function0 = this.LL;
            if (function0 != null) {
                function0.invoke();
                return true;
            }
            return true;
        }
        return true;
    }

    public final void setOnSingleTap(Function0<Unit> function0) {
        this.LL = function0;
    }

    public final void setTapDismissActive(boolean z) {
        this.LLILLJJLI = z;
    }

    public C19E3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        GestureDetector gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: X.19E7
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                this.LL.LLILLL = true;
                return true;
            }
        });
        gestureDetector.setIsLongpressEnabled(false);
        this.LLILZ = gestureDetector;
    }
}
