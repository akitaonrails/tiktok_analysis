package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03C5, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03C5 extends FrameLayout {
    public int LL;
    public Function1<? super Integer, Unit> LLILLJJLI;
    public boolean LLILLL;

    public final boolean getInterceptTouchEvent() {
        return this.LLILLL;
    }

    public final Function1<Integer, Unit> getOnHeightChange() {
        return this.LLILLJJLI;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LLILLL) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setInterceptTouchEvent(boolean z) {
        this.LLILLL = z;
    }

    public final void setOnHeightChange(Function1<? super Integer, Unit> function1) {
        this.LLILLJJLI = function1;
    }

    public C03C5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.LL != getMeasuredHeight()) {
            int measuredHeight = getMeasuredHeight();
            this.LL = measuredHeight;
            Function1<? super Integer, Unit> function1 = this.LLILLJJLI;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(measuredHeight));
            }
        }
    }
}
