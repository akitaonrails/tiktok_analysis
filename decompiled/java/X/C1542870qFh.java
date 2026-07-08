package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qFh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1542870qFh {
    public static void LIZ(C1542800qFa c1542800qFa) {
        if (C1542900qFk.LJ.compareAndSet(false, true)) {
            C1542900qFk.LJFF = c1542800qFa;
            C1238404sw c1238404sw = C1542900qFk.LJI;
            synchronized (c1238404sw) {
                try {
                    c1238404sw.LIZ("repository_Init", new JSONObject().put("init", true));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            int i = C2187451AjH.LIZ;
            InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
        }
    }
}
