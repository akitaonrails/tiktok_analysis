package X;

import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.0oW8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1476180oW8 {
    public long LIZ;
    public long LIZIZ;
    public final ReentrantLock LIZJ = new ReentrantLock();
    public final HashMap<String, C1476260oWG> LIZLLL = new HashMap<>();

    public final void LIZIZ(String str) {
        C1476260oWG c1476260oWG = this.LIZLLL.get(str);
        if (c1476260oWG == null) {
            return;
        }
        if (c1476260oWG.LIZ > this.LIZIZ && !c1476260oWG.LJ) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("trigger preload ");
            sbLIZ.append(str);
            sbLIZ.append(" playable buffer is: ");
            sbLIZ.append(c1476260oWG.LIZ);
            TTVideoEngineLog.d("PreloadUtil", C2188811AlT.LIZIZ(sbLIZ));
            DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
            long j = c1476260oWG.LIZ;
            C1476170oW7 c1476170oW7 = dataLoaderHelper.LIZ;
            if (c1476170oW7 != null) {
                c1476170oW7.LJ(9, 0L, j, "");
            }
            c1476260oWG.LJ = true;
        }
        if (!c1476260oWG.LIZLLL) {
            long j2 = c1476260oWG.LIZJ;
            if (j2 <= 0 || c1476260oWG.LIZ + c1476260oWG.LIZIZ + 1000 < j2) {
                if (c1476260oWG.LIZ < this.LIZ) {
                    DataLoaderHelper dataLoaderHelper2 = C805420Vie.LIZ;
                    long jLIZJ = dataLoaderHelper2.LIZLLL.LIZJ() + dataLoaderHelper2.LJ.LIZJ() + dataLoaderHelper2.LIZJ.LIZJ();
                    if (c1476260oWG.LJ && jLIZJ > 0) {
                        LIZ("low_buffer", str);
                        c1476260oWG.LJ = false;
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (!c1476260oWG.LJ) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cached video trigger preload ");
            sbLIZ2.append(str);
            sbLIZ2.append(" playable buffer is: ");
            sbLIZ2.append(c1476260oWG.LIZ);
            TTVideoEngineLog.d("PreloadUtil", C2188811AlT.LIZIZ(sbLIZ2));
            DataLoaderHelper dataLoaderHelper3 = C805420Vie.LIZ;
            long j3 = c1476260oWG.LIZ;
            C1476170oW7 c1476170oW72 = dataLoaderHelper3.LIZ;
            if (c1476170oW72 != null) {
                c1476170oW72.LJ(9, 0L, j3, "");
            }
            c1476260oWG.LJ = true;
        }
    }

    public static void LIZ(String str, String str2) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancel preload because:");
        sbLIZ.append(str);
        sbLIZ.append(" traceId:");
        sbLIZ.append(str2);
        TTVideoEngineLog.d("PreloadUtil", C2188811AlT.LIZIZ(sbLIZ));
        DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
        dataLoaderHelper.LJIJJLI();
        C1476170oW7 c1476170oW7 = dataLoaderHelper.LIZ;
        if (c1476170oW7 != null) {
            c1476170oW7.LJ(8, 0L, 0L, str);
        }
    }

    public final void LIZJ(int i, long j, String str) {
        this.LIZJ.lock();
        if (!this.LIZLLL.containsKey(str)) {
            if (this.LIZLLL.size() >= 2) {
                this.LIZLLL.clear();
            }
            this.LIZLLL.put(str, new C1476260oWG());
        }
        C1476260oWG c1476260oWG = this.LIZLLL.get(str);
        if (c1476260oWG == null) {
            this.LIZJ.unlock();
            return;
        }
        if (i != 22) {
            if (i != 23) {
                if (i != 25) {
                    if (i == 27) {
                        c1476260oWG.LIZ = j;
                        LIZIZ(str);
                    }
                } else {
                    LIZ("buffering", str);
                }
            } else {
                c1476260oWG.LIZIZ = j;
                LIZIZ(str);
            }
        } else {
            c1476260oWG.LIZJ = j;
        }
        this.LIZJ.unlock();
    }
}
