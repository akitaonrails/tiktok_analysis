package X;

import android.app.Application;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0Vp0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C809360Vp0 {
    public static volatile Application LIZ;
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public static void LIZ(Application application) {
        if (LIZIZ.getAndSet(true)) {
            return;
        }
        LIZ = application;
        if (!C0V4R.LJII(application)) {
            return;
        }
        LIZ.registerActivityLifecycleCallbacks(C813110Vv3.LIZJ());
    }
}
