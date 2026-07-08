package X;

import Y.ARunnableS81S0200000_12;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T6J, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T6J {
    public static final void LIZ(final View view, final Function0<Unit> function0) {
        final C013C c013c = new C013C();
        ViewTreeObserver.OnDrawListener onDrawListener = new ViewTreeObserver.OnDrawListener() { // from class: X.0T6A
            @Override // android.view.ViewTreeObserver.OnDrawListener
            public final void onDraw() {
                if (c013c.element) {
                    return;
                }
                function0.invoke();
                c013c.element = true;
                View view2 = view;
                HandlerHook.viewPost(view2, new ARunnableS81S0200000_12(this, view2, 68));
            }
        };
        if (view.getViewTreeObserver().isAlive() && view.isAttachedToWindow()) {
            C786410Ut5.w3(view.getViewTreeObserver(), onDrawListener);
        } else {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC786060UsW(view, onDrawListener, 1));
        }
    }
}
