package X;

import android.os.Handler;
import com.ss.ttlivestreamer.core.opengl.GLThread;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0jBP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1271130jBP implements InterfaceC1271140jBQ {
    public final C1271090jBL LIZ;
    public final GLThread LIZIZ;
    public final Handler LIZJ;
    public final Map<String, C1274460jGm> LIZLLL = new ConcurrentHashMap();

    public C1271130jBP(C1271090jBL c1271090jBL) {
        this.LIZ = c1271090jBL;
        GLThread gLThreadLIZ = C1273730jFb.LIZ(0, "GLInteractVideoSinkFactory");
        this.LIZIZ = gLThreadLIZ;
        gLThreadLIZ.start();
        this.LIZJ = gLThreadLIZ.getHandler();
    }

    public final C1274460jGm LIZ(String str, boolean z, int i, boolean z2, boolean z3, boolean z4, C1273190jEj c1273190jEj) {
        C1274460jGm c1274460jGm = new C1274460jGm(str, z, i, z2, this.LIZ, this.LIZJ, z3, z4);
        this.LIZ.LLILZIL.getClass();
        ((ConcurrentHashMap) this.LIZLLL).put(str, c1274460jGm);
        return c1274460jGm;
    }
}
