package X;

import android.os.Looper;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.0xwh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838610xwh {
    public static CoroutineContext LIZ() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return C1838750xwv.LLJIJIL.getValue();
        }
        CoroutineContext coroutineContext = C1838750xwv.LLJILJIL.get();
        if (coroutineContext != null) {
            return coroutineContext;
        }
        "no AndroidUiDispatcher for this thread".toString();
        throw new IllegalStateException("no AndroidUiDispatcher for this thread");
    }
}
