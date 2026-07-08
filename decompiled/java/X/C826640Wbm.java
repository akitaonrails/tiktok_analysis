package X;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.pumbaa.base2.interfaces.ISoLoader;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: renamed from: X.0Wbm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C826640Wbm {
    public static final C826640Wbm LIZ = new C826640Wbm();
    public static final C826650Wbn LIZIZ = new ISoLoader() { // from class: X.0Wbn
        @Override // com.bytedance.pumbaa.base2.interfaces.ISoLoader
        public final void loadSo(String str) {
            LoadSoLancet.LIZJ(str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF(str);
            LoadSoLancet.LJ(jUptimeMillis, str);
            LoadSoLancet.LIZLLL(jUptimeMillis, str);
            LoadSoLancet.LIZIZ(str);
        }
    };
    public static final ISoLoader LIZJ;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Wbn] */
    static {
        ISoLoader iSoLoader;
        try {
            iSoLoader = (ISoLoader) ServiceManager.get().getService(ISoLoader.class, false, false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            iSoLoader = LIZIZ;
        }
        if (iSoLoader == null) {
            iSoLoader = LIZIZ;
        }
        LIZJ = iSoLoader;
    }

    public static final boolean LIZ(String str) {
        boolean z = true;
        try {
            LIZJ.loadSo(str);
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadSo failed, soName: ");
            sbLIZ.append(str);
            sbLIZ.append(", isSystemLoader: ");
            if (LIZJ != LIZIZ) {
                z = false;
            }
            sbLIZ.append(z);
            C823280WRi.LIZJ(C2188811AlT.LIZIZ(sbLIZ), "so_load_failed", th);
            return false;
        }
    }
}
