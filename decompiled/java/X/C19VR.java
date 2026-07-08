package X;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: renamed from: X.19VR, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19VR {
    public static OnBackInvokedDispatcher LIZ(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback LIZIZ(final Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new OnBackInvokedCallback() { // from class: X.19Vj
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                runnable.run();
            }
        };
    }

    public static void LIZJ(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    public static void LIZLLL(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
