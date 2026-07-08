package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Gh4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C422240Gh4 extends C19YU {
    public float LLLF;
    public float LLLFF;
    public Function1<? super MotionEvent, Boolean> LLLFFI;

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        Function1<? super MotionEvent, Boolean> function1;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (numValueOf.intValue() == 0) {
                this.LLLF = motionEvent.getX();
                this.LLLFF = motionEvent.getY();
            } else if (numValueOf.intValue() == 2) {
                if (Math.abs(motionEvent.getY() - this.LLLFF) > Math.abs(motionEvent.getX() - this.LLLF) && (function1 = this.LLLFFI) != null && function1.invoke(motionEvent).booleanValue()) {
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onInterceptTouchEvent222 ");
                    sbLIZ.append(Integer.valueOf(motionEvent.getAction()));
                    C20441214yg.LIZIZ("MixTabLayout", C2188811AlT.LIZIZ(sbLIZ));
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setTouchInterceptor$livegame_impl_release(Function1<? super MotionEvent, Boolean> function1) {
        this.LLLFFI = function1;
    }

    public C422240Gh4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
