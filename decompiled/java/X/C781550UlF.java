package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UlF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C781550UlF extends RunnableC781530UlD {
    public Function1<RecyclerView, Unit> LLJ;
    public View.OnTouchListener LLJI;
    public boolean LLJIJIL;

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        return (canScrollVertically(1) || this.LLJIJIL) ? 1.0f : 0.0f;
    }

    @Override // X.RunnableC781530UlD, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Function1<RecyclerView, Unit> function1 = this.LLJ;
        if (function1 != null) {
            function1.invoke(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        return super.getTopFadingEdgeStrength();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.LLJI;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setOnDispatchTouchEventListener(View.OnTouchListener onTouchListener) {
        this.LLJI = onTouchListener;
    }

    public void setRecyclerPreDetachListener(Function1<RecyclerView, Unit> function1) {
        this.LLJ = function1;
    }

    public C781550UlF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C781550UlF(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
