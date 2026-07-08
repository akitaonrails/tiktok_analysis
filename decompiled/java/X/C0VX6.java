package X;

import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VX6, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VX6 implements InterfaceC795660VJc {
    public static long[] LIZ;
    public static final C0VX6 LIZIZ = new C0VX6();

    @Override // X.InterfaceC795660VJc
    public final void LIZ(Thread thread, long[] jArr) {
        if (Intrinsics.LJFF(thread, Looper.getMainLooper().getThread())) {
            LIZ = jArr;
        }
    }
}
