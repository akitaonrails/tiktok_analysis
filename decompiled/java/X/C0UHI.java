package X;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UHI, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UHI {
    public static final void LIZ(Runnable runnable) {
        Handler handlerLIZ = C0IK5.LIZ();
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            C786410Ut5.LJJZZIII(handlerLIZ, runnable);
        }
    }
}
