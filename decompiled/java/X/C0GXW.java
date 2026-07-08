package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0GXW, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GXW extends FrameLayout {
    public boolean LL;
    public Function1<? super MotionEvent, Unit> LLILLJJLI;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.LL) {
            Function1<? super MotionEvent, Unit> function1 = this.LLILLJJLI;
            if (function1 != null) {
                function1.invoke(motionEvent);
                return true;
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setHideKeyBoard$ecommerce_influencer_release(Function1<? super MotionEvent, Unit> function1) {
        this.LLILLJJLI = function1;
    }

    public final void setInterceptTouchEvent$ecommerce_influencer_release(boolean z) {
        this.LL = z;
    }

    public C0GXW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
