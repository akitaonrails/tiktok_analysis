package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Gls, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425220Gls extends ViewOnAttachStateChangeListenerC20604515jv {
    public float LLILZ;
    public Function1<? super MotionEvent, Unit> LLILZIL;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Function1<? super MotionEvent, Unit> function1 = this.LLILZIL;
        if (function1 != null) {
            function1.invoke(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setFlingXRatio(float f) {
        this.LLILZ = f;
    }

    public final void setOnTouchEvent(Function1<? super MotionEvent, Unit> function1) {
        this.LLILZIL = function1;
    }

    public C425220Gls(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean fling(int i, int i2) {
        return super.fling((int) (i * this.LLILZ), i2);
    }

    public C425220Gls(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZ = 1.0f;
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
