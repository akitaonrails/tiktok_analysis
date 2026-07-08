package X;

import android.os.HandlerThread;
import com.bytedance.android.livesdk.livesetting.performance.LiveThreadOptSetting;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0jwf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1300430jwf {
    public static HandlerThread LIZ;

    public static void LIZ() {
        HandlerThread handlerThread = LIZ;
        if (Intrinsics.LJFF(handlerThread != null ? handlerThread.getName() : null, "watch_live_timer")) {
            HandlerThread handlerThread2 = LIZ;
            if (handlerThread2 != null) {
                handlerThread2.quitSafely();
            }
            LIZ = null;
        }
    }

    public static void LIZIZ() {
        if (LIZ != null) {
            LIZ();
        }
        if (LiveThreadOptSetting.INSTANCE.enableUniHandlerThr()) {
            LIZ = C08MD.LIZIZ();
            return;
        }
        HandlerThread handlerThread = new HandlerThread("watch_live_timer");
        LIZ = handlerThread;
        handlerThread.start();
    }
}
