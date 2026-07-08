package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DWP, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DWP extends ViewOnAttachStateChangeListenerC20604515jv {
    public boolean LLILZ;
    public final int LLILZIL;
    public Function1<? super Boolean, Unit> LLILZLL;

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        if (super.canScrollVertically(i) && this.LLILZ) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (numValueOf.intValue() == 0) {
                this.LLILZ = true;
                Function1<? super Boolean, Unit> function1 = this.LLILZLL;
                if (function1 != null) {
                    function1.invoke(Boolean.TRUE);
                }
                if (findChildViewUnder((int) motionEvent.getX(), (int) motionEvent.getY()) == null) {
                    this.LLILZ = false;
                    getParent().getParent().requestDisallowInterceptTouchEvent(false);
                    return false;
                }
                if (canScrollVertically(1) || canScrollVertically(-1)) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (numValueOf.intValue() == 1 || numValueOf.intValue() == 3) {
                Function1<? super Boolean, Unit> function12 = this.LLILZLL;
                if (function12 != null) {
                    function12.invoke(Boolean.FALSE);
                }
                getParent().getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        Function1<? super Boolean, Unit> function1;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (numValueOf.intValue() == 0) {
                if (findChildViewUnder(motionEvent.getX(), motionEvent.getY()) == null) {
                    return false;
                }
            } else if ((numValueOf.intValue() == 1 || numValueOf.intValue() == 3) && (function1 = this.LLILZLL) != null) {
                function1.invoke(Boolean.FALSE);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public C0DWP(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.LLILZIL > 0) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode == 0 || size > this.LLILZIL) {
                i2 = View.MeasureSpec.makeMeasureSpec(this.LLILZIL, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i, i2);
    }

    public C0DWP(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZ = true;
        this.LLILZIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(154));
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
