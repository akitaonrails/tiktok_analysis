package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.0p3m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1497040p3m {
    public volatile C1497030p3l LIZ;
    public final /* synthetic */ C1497050p3n LIZIZ;

    public final void LIZIZ() {
        if (this.LIZ == null) {
            synchronized (this) {
                try {
                    if (this.LIZ == null) {
                        this.LIZ = new C1497030p3l();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public C1497040p3m(C1497050p3n c1497050p3n) {
        this.LIZIZ = c1497050p3n;
    }

    public final void LIZ(n nVar) {
        boolean zLJ;
        int iLJIIJJI;
        String strLIZJ;
        LIZIZ();
        C1497030p3l c1497030p3l = this.LIZ;
        ((ReentrantReadWriteLock) c1497030p3l.LJIIJ).writeLock().lock();
        k kVarLJJIIZ = nVar.LJJIIZ("scc_cs_enable_prefetch");
        if (kVarLJJIIZ == null) {
            zLJ = false;
        } else {
            zLJ = kVarLJJIIZ.LJ();
        }
        c1497030p3l.LJI = zLJ;
        k kVarLJJIIZ2 = nVar.LJJIIZ("scc_cs_max_wait_time");
        if (kVarLJJIIZ2 == null) {
            iLJIIJJI = LSPassThroughRecordSizeConfig.DEFAULT;
        } else {
            iLJIIJJI = kVarLJJIIZ2.LJIIJJI();
        }
        c1497030p3l.LJII = iLJIIJJI;
        if (iLJIIJJI <= 0) {
            c1497030p3l.LJII = LSPassThroughRecordSizeConfig.DEFAULT;
        }
        int i = c1497030p3l.LJII;
        if (i > c1497030p3l.LJIIIZ) {
            c1497030p3l.LJIIIZ = i;
        }
        k kVarLJJIIZ3 = nVar.LJJIIZ("scc_cs_allow_list");
        if (kVarLJJIIZ3 == null) {
            strLIZJ = null;
        } else {
            strLIZJ = C1934607hw.LIZJ(kVarLJJIIZ3.LJIIL());
        }
        c1497030p3l.LIZIZ = strLIZJ;
        k kVarLJJIIZ4 = nVar.LJJIIZ("scc_seclink_scene");
        if (kVarLJJIIZ4 != null) {
            c1497030p3l.LJIIIIZZ = kVarLJJIIZ4.LJIL();
        }
        ((ReentrantReadWriteLock) c1497030p3l.LJIIJ).writeLock().unlock();
    }
}
