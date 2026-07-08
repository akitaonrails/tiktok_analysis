package X;

import com.benchmark.collection_api.BXCollectionAPI;
import com.benchmark.collection_api.ByteBenchCollectionDowngrade;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.18aZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21310918aZ implements BXCollectionAPI {
    public static final String LIZ;
    public static final AtomicBoolean LIZIZ;
    public static final AtomicBoolean LIZJ;
    public static final AtomicBoolean LIZLLL;
    public static volatile ByteBenchCollectionDowngrade LJ;

    static {
        String name = C21310918aZ.class.getName();
        LIZ = name;
        LIZIZ = new AtomicBoolean(false);
        LIZJ = new AtomicBoolean(false);
        LIZLLL = new AtomicBoolean(false);
        LJ = new ByteBenchCollectionDowngrade();
        C806930Vl5.LJ(name);
    }

    public static BXCollectionAPI LIZJ() {
        try {
            return (C20191713zX.LIZ == null || !C20191713zX.LIZ()) ? LJ : (BXCollectionAPI) ServiceManager.get().getService(BXCollectionAPI.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return LJ;
        }
    }

    @Override // com.benchmark.collection_api.BXCollectionAPI
    public final void LIZ() {
        if (LIZJ.get()) {
            C806930Vl5.LIZJ(LIZ);
            BXCollectionAPI bXCollectionAPILIZJ = LIZJ();
            if (bXCollectionAPILIZJ != null) {
                bXCollectionAPILIZJ.LIZ();
                LIZIZ.set(true);
            }
        }
    }

    @Override // com.benchmark.collection_api.BXCollectionAPI
    public final int stop() {
        AtomicBoolean atomicBoolean = LIZLLL;
        if (!atomicBoolean.get()) {
            return -4;
        }
        C806930Vl5.LIZJ(LIZ);
        BXCollectionAPI bXCollectionAPILIZJ = LIZJ();
        if (bXCollectionAPILIZJ == null) {
            return -200;
        }
        int iStop = bXCollectionAPILIZJ.stop();
        atomicBoolean.set(false);
        return iStop;
    }

    @Override // com.benchmark.collection_api.BXCollectionAPI
    public final int LIZIZ(C21310718aX c21310718aX) {
        if (!LIZJ.compareAndSet(false, true)) {
            return 0;
        }
        C806930Vl5.LIZJ(LIZ);
        BXCollectionAPI bXCollectionAPILIZJ = LIZJ();
        if (bXCollectionAPILIZJ != null) {
            return bXCollectionAPILIZJ.LIZIZ(c21310718aX);
        }
        return -200;
    }

    @Override // com.benchmark.collection_api.BXCollectionAPI
    public final int start(int i) {
        AtomicBoolean atomicBoolean = LIZLLL;
        if (!atomicBoolean.get() && LIZIZ.get()) {
            C806930Vl5.LIZJ(LIZ);
            BXCollectionAPI bXCollectionAPILIZJ = LIZJ();
            if (bXCollectionAPILIZJ != null) {
                int iStart = bXCollectionAPILIZJ.start(i);
                atomicBoolean.set(true);
                return iStart;
            }
            return -200;
        }
        return -4;
    }
}
