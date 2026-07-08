package X;

import com.ss.ttlivestreamer.core.opengl.GLThread;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0jBS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1271160jBS {
    public static final C1271180jBU LIZ;

    static {
        C1271180jBU c1271180jBU = new C1271180jBU();
        LIZ = c1271180jBU;
        EnumC1270220j9w enumC1270220j9w = EnumC1270220j9w.WORK_THREAD;
        ((HashMap) c1271180jBU.LIZ).put(enumC1270220j9w, new C1271200jBW(enumC1270220j9w));
        EnumC1270220j9w enumC1270220j9w2 = EnumC1270220j9w.GRK_THREAD;
        ((HashMap) c1271180jBU.LIZ).put(enumC1270220j9w2, new C1271200jBW(enumC1270220j9w2));
        EnumC1270220j9w enumC1270220j9w3 = EnumC1270220j9w.VIDEO_CAPTURE;
        ((HashMap) c1271180jBU.LIZ).put(enumC1270220j9w3, new C1271200jBW(enumC1270220j9w3));
    }

    public static SafeHandlerThread LIZIZ() {
        C1271180jBU c1271180jBU = LIZ;
        C1271200jBW c1271200jBW = c1271180jBU == null ? null : (C1271200jBW) ((HashMap) c1271180jBU.LIZ).get(EnumC1270220j9w.WORK_THREAD);
        return (c1271200jBW == null || c1271200jBW.LIZ == null) ? false : c1271200jBW.LIZIZ ? C1273730jFb.LIZIZ(c1271200jBW.LIZJ, "LiveCoreWorkThread") : C1273730jFb.LIZIZ(0, "LiveCoreWorkThread");
    }

    public static GLThread LIZ(EnumC1270220j9w enumC1270220j9w, String str) {
        C1271200jBW c1271200jBW;
        GLThread gLThreadLIZ;
        C1271180jBU c1271180jBU = LIZ;
        if (c1271180jBU == null) {
            c1271200jBW = null;
        } else {
            c1271200jBW = (C1271200jBW) ((HashMap) c1271180jBU.LIZ).get(enumC1270220j9w);
        }
        if (c1271200jBW != null && c1271200jBW.LIZ != null && c1271200jBW.LIZIZ) {
            gLThreadLIZ = C1273730jFb.LIZ(c1271200jBW.LIZJ, str);
        } else {
            gLThreadLIZ = C1273730jFb.LIZ(0, str);
        }
        if (C1273690jFX.LIZ()) {
            gLThreadLIZ.enableGpuHint();
        }
        return gLThreadLIZ;
    }
}
