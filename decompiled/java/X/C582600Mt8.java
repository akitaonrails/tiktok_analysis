package X;

import com.bytedance.otis.perf.monitor.message.MessageMonitorManager;

/* JADX INFO: renamed from: X.0Mt8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C582600Mt8 {
    public static boolean LIZ = true;

    public static final void LIZ(String str) {
        if (!C285360BGk.LIZ() || !C2162308dZ.LJI(C1BWL.LIZ())) {
            return;
        }
        MessageMonitorManager.INSTANCE.beginStage(str, "feed_total");
    }

    public static final void LIZIZ(String str) {
        if (!C285360BGk.LIZ() || !C2162308dZ.LJI(C1BWL.LIZ())) {
            return;
        }
        MessageMonitorManager.INSTANCE.endStage(str);
    }
}
