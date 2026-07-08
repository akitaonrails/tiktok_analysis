package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0gnj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1179570gnj extends FrameLayout {
    public float LL;
    public float LLILLJJLI;
    public long LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public Function2<? super Float, ? super Float, Unit> LLILZLL;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Function2<? super Float, ? super Float, Unit> function2;
        if (!this.LLILZ && motionEvent != null) {
            if (motionEvent.getAction() == 0) {
                this.LL = motionEvent.getX();
                this.LLILLJJLI = motionEvent.getY();
                this.LLILLL = System.currentTimeMillis();
            }
            if (motionEvent.getAction() == 1) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.LL) < 20.0f && Math.abs(y - this.LLILLJJLI) < 20.0f && System.currentTimeMillis() - this.LLILLL < 120 && (function2 = this.LLILZLL) != null) {
                    function2.invoke(Float.valueOf(this.LL), Float.valueOf(this.LLILLJJLI));
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LLILZIL) {
            requestDisallowInterceptTouchEvent(true);
        }
        if (this.LLILZ) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setDisallowInterceptTouchEvent$poi_release(boolean z) {
        this.LLILZIL = z;
    }

    public C1179570gnj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
