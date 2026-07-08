package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0J33, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J33 extends C16FB {
    public Function1<? super MotionEvent, Unit> LLLFZ;

    @Override // X.C16FB, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Function1<? super MotionEvent, Unit> function1 = this.LLLFZ;
        if (function1 != null) {
            function1.invoke(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setOnInterceptListener(Function1<? super MotionEvent, Unit> function1) {
        this.LLLFZ = function1;
    }

    public C0J33(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setScrollMode(EnumC481060Itk.REFRESH);
        setNestedHeader(new C446160HeY(context));
    }
}
