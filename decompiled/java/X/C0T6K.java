package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T6K, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T6K {
    public static final void LIZ(View view, Function0<Unit> function0) {
        if (view.getViewTreeObserver().isAlive() && view.isAttachedToWindow()) {
            C786410Ut5.w3(view.getViewTreeObserver(), new C0T6D(view, function0));
        } else {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC786060UsW(view, function0, 4));
        }
    }
}
