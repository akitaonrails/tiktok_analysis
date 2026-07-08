package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingDepService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.0pct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1518810pct implements InterfaceC1519000pdC {
    public static final C1518810pct LIZ = new C1518810pct();
    public static final EnumC1518970pd9 LIZIZ = EnumC1518970pd9.APP_LEVEL;
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final AtomicInteger LIZLLL = new AtomicInteger(0);
    public static final AtomicLong LJ = new AtomicLong(0);

    @Override // X.InterfaceC1519000pdC
    public final boolean LIZIZ(C1518830pcv c1518830pcv) {
        return true;
    }

    @Override // X.InterfaceC1519000pdC
    public final String getTag() {
        return "GeoBlockingGlobalStrategy";
    }

    @Override // X.InterfaceC1519000pdC
    public final boolean LIZJ() {
        return !LIZJ.get() && System.currentTimeMillis() - LJ.get() >= Math.max(2500L, ((long) LIZLLL.get()) * 500);
    }

    @Override // X.InterfaceC1519000pdC
    public final void reset() {
        LIZLLL.set(0);
        LIZJ.set(false);
    }

    @Override // X.InterfaceC1519000pdC
    public final EnumC1518970pd9 getLevel() {
        return LIZIZ;
    }

    @Override // X.InterfaceC1519000pdC
    public final void LIZ(C1518830pcv c1518830pcv) {
        synchronized (this) {
            try {
                if (LIZ.LIZJ()) {
                    if (LIZLLL.incrementAndGet() >= 10) {
                        return;
                    }
                    LJ.set(System.currentTimeMillis());
                    ((IGeoBlockingDepService) ServiceManager.get().getService(IGeoBlockingDepService.class)).LIZJ(c1518830pcv);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
