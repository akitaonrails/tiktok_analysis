package X;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0T8y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C742060T8y {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(380));

    public static void LIZ(Runnable runnable) {
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            C786410Ut5.LJJZZIII((Handler) LIZ.getValue(), runnable);
        }
    }
}
