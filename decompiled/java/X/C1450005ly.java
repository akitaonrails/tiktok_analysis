package X;

import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import y5o.n0;

/* JADX INFO: renamed from: X.05ly, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1450005ly extends C2217421BqW implements Function1<MotionEvent, Unit> {
    public C1450005ly(Object obj) {
        super(1, obj, n0.class, "onDispatchTouchEvent", "onDispatchTouchEvent(Landroid/view/MotionEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MotionEvent motionEvent) {
        n0 n0Var = (n0) this.receiver;
        n0Var.LLJJJJJIL.setValue(Boolean.FALSE);
        n0Var.LLLLIL().LIZIZ.invoke(motionEvent);
        return Unit.LIZ;
    }
}
