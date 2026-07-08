package X;

import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N45, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N45 implements Runnable {
    public static final C0N45 LL = new C0N45();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LiveJatoHelper@2a6.onWatchRoomFirstFrame$1");
        try {
            if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                C2183961Ade.LIZ("first_frame");
            } else {
                C786410Ut5.LJJZZIII(C2183961Ade.LIZIZ, LL);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveJatoHelper@2a6.onWatchRoomFirstFrame$1");
    }
}
