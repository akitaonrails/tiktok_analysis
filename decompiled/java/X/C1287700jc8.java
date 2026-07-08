package X;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0jc8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1287700jc8 {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1287720jcA());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1287690jc7());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1287710jc9());

    public static Handler LIZ() {
        return (Handler) LIZIZ.getValue();
    }

    public static final void LIZIZ(Runnable runnable) {
        C01GW c01gw = LIZJ;
        if (Intrinsics.LJFF(((Handler) c01gw.getValue()).getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            C786410Ut5.LJJZZIII((Handler) c01gw.getValue(), runnable);
        }
    }

    public static final void LIZJ(Runnable runnable) {
        if (Intrinsics.LJFF(LIZ().getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            C786410Ut5.LJJZZIII(LIZ(), runnable);
        }
    }
}
