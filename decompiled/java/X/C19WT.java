package X;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AppCompatDelegateImpl;
import java.util.Objects;

/* JADX INFO: renamed from: X.19WT, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19WT {
    public static OnBackInvokedDispatcher LIZ(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback LIZIZ(Object obj, final AppCompatDelegateImpl appCompatDelegateImpl) {
        Objects.requireNonNull(appCompatDelegateImpl);
        OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: X.19WY
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                appCompatDelegateImpl.LJJJJZI();
            }
        };
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
        return onBackInvokedCallback;
    }

    public static void LIZJ(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
