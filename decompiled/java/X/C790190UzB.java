package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0UzB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C790190UzB {
    public static final C790190UzB LIZLLL = new C790190UzB();
    public final HashMap<Long, WeakReference<TTVideoEngine>> LIZ = new HashMap<>();
    public long LIZIZ;
    public long LIZJ;

    public final synchronized long LIZ() {
        long j;
        j = this.LIZIZ;
        this.LIZIZ = 0L;
        try {
            Iterator<WeakReference<TTVideoEngine>> it2 = this.LIZ.values().iterator();
            while (it2.hasNext()) {
                TTVideoEngine tTVideoEngine = it2.next().get();
                if (tTVideoEngine != null) {
                    long jLJJJLZIJ = tTVideoEngine.LJJJLZIJ(81);
                    if (jLJJJLZIJ > 0) {
                        j += jLJJJLZIJ;
                    }
                }
            }
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get play waste data size: ");
            sbLIZ.append(j);
            TTVideoEngineLog.d("VideoInfoCollecor", C2188811AlT.LIZIZ(sbLIZ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return j;
        }
        return j;
    }
}
