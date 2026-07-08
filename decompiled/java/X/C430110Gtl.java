package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Gtl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430110Gtl {
    public static final void LIZ(View view, Function0<Unit> function0) {
        if (view == null) {
            return;
        }
        C786410Ut5.x3(view.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC462880IDe(view, (Function0) function0, 4));
    }

    public static final void LIZIZ(View view, Function0<Unit> function0) {
        if (view == null) {
            return;
        }
        view.addOnLayoutChangeListener(new C0IDO(view, function0, 0));
    }
}
