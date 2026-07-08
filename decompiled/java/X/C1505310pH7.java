package X;

import Y.ARunnableS11S2100000_23;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: X.0pH7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1505310pH7 implements InterfaceC1505500pHQ {
    public static final /* synthetic */ int LIZJ = 0;
    public Keva LIZ;
    public boolean LIZIZ;

    public final Keva LIZJ() {
        Keva keva = this.LIZ;
        if (keva != null || this.LIZIZ) {
            return keva;
        }
        if (C1505180pGu.LIZ) {
            System.currentTimeMillis();
        }
        synchronized ("client_portraits_saver_kv_fp") {
            try {
                if (this.LIZ == null) {
                    this.LIZ = KevaImpl.getRepoSync("client_portraits_saver_kv_fp", 0);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LIZIZ = true;
        return this.LIZ;
    }

    @Override // X.InterfaceC1505500pHQ
    public final String LIZIZ(String str) {
        Keva kevaLIZJ;
        if (str == null || (kevaLIZJ = LIZJ()) == null) {
            return null;
        }
        return kevaLIZJ.getString(str, null);
    }

    @Override // X.InterfaceC1505500pHQ
    public final void LIZ(String str, String str2) {
        if (str != null) {
            if (C1505180pGu.LIZJ == null) {
                C1505180pGu.LIZJ = C807400Vlq.LJ();
            }
            ScheduledExecutorService scheduledExecutorService = C1505180pGu.LIZJ;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.execute(new ARunnableS11S2100000_23(this, str2, str, 3));
            }
        }
    }
}
