package X;

import android.view.MotionEvent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0R9J, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R9J extends C21648719nx {
    public final C0R9L LL;
    public final InterfaceC691050R8t LLILLJJLI;
    public final Runnable LLILLL;
    public final Function1<MotionEvent, Boolean> LLILZ;

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.LL.handleDoubleClick(motionEvent);
        return super.onDoubleTap(motionEvent);
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        Function1<MotionEvent, Boolean> function1 = this.LLILZ;
        if (function1 != null && function1.invoke(motionEvent).booleanValue()) {
            return;
        }
        this.LLILLL.run();
        this.LLILLJJLI.LIZ(1);
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.LLILLJJLI.LIZ(3);
        return super.onSingleTapConfirmed(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0R9J(C0R9L c0r9l, InterfaceC691050R8t interfaceC691050R8t, Runnable runnable, Function1<? super MotionEvent, Boolean> function1) {
        this.LL = c0r9l;
        this.LLILLJJLI = interfaceC691050R8t;
        this.LLILLL = runnable;
        this.LLILZ = function1;
    }
}
