package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.EffectManager;

/* JADX INFO: renamed from: X.0uT2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1704900uT2<P> {
    public volatile EffectManager LIZ;

    public abstract EffectManager LJIJJLI();

    public final P LJIL() {
        P p = (P) this.LIZ;
        if (p != null) {
            return p;
        }
        synchronized (this) {
            try {
                P p3 = (P) this.LIZ;
                if (p3 != null) {
                    return p3;
                }
                this.LIZ = LJIJJLI();
                C1706630uVp.LIZ("EpResourceProvider", "epInstance from create");
                return (P) this.LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
