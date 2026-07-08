package X;

import com.bytedance.applog.AppLog;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09jp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2455909jp {
    public static final long LIZ = TimeUnit.DAYS.toMillis(1);
    public static volatile boolean LIZIZ = false;
    public static volatile AtomicReference<InterfaceC2211051BgF> LIZJ = new AtomicReference<>();

    public static int LIZ() {
        Keva repo = Keva.getRepo("perf_job_keep_warm");
        long jCurrentTimeMillis = System.currentTimeMillis() / LIZ;
        if (repo.getLong("foreground_open_utc_day", Long.MIN_VALUE) != jCurrentTimeMillis) {
            repo.storeLong("foreground_open_utc_day", jCurrentTimeMillis);
            repo.storeInt("foreground_open_count", 0);
            return 0;
        }
        int i = repo.getInt("foreground_open_count", 0);
        int iMax = Math.max(0, Math.min(i, 2));
        if (i != iMax) {
            repo.storeInt("foreground_open_count", iMax);
        }
        return iMax;
    }

    public static void LIZIZ() {
        if (LIZIZ) {
            return;
        }
        LIZIZ = true;
        if (LIZJ.get() == null) {
            AtomicReference<InterfaceC2211051BgF> atomicReference = LIZJ;
            InterfaceC2211051BgF interfaceC2211051BgF = new InterfaceC2211051BgF() { // from class: X.09jo
                @Override // X.InterfaceC2211051BgF
                public final void LIZIZ(long j, String str) {
                }

                @Override // X.InterfaceC2211051BgF
                public final void LIZJ(String str, long j, JSONObject jSONObject) {
                }

                @Override // X.InterfaceC2211051BgF
                public final void LIZ(String str, long j, JSONObject jSONObject) {
                    try {
                        Keva.getRepo("perf_job_keep_warm").storeLong("terminate_utc_day", System.currentTimeMillis() / C2455909jp.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            };
            while (true) {
                if (atomicReference.compareAndSet(null, interfaceC2211051BgF)) {
                    AppLog.addSessionHook(LIZJ.get());
                    break;
                } else if (atomicReference.get() == null) {
                }
            }
        }
        try {
            int iMin = Math.min(LIZ() + 1, 2);
            Keva repo = Keva.getRepo("perf_job_keep_warm");
            repo.storeLong("foreground_open_utc_day", System.currentTimeMillis() / LIZ);
            repo.storeInt("foreground_open_count", iMin);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
