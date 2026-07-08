package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.runnable.RunnableBlockConfigs;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Af0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2184801Af0 extends C09AY implements Function0<RunnableBlockConfigs> {
    public C2184801Af0() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final RunnableBlockConfigs invoke() {
        RunnableBlockConfigs runnableBlockConfigs;
        RunnableBlockConfigs runnableBlockConfigs2;
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            RunnableBlockConfigs runnableBlockConfigs3 = C2184791Aez.LIZIZ;
            RunnableBlockConfigs runnableBlockConfigs4 = (RunnableBlockConfigs) c0c64LJIILLIIL.LJJIIJ(true, "system_launch_runnable_block_milo_config", 31744, RunnableBlockConfigs.class, runnableBlockConfigs3, 2);
            if (runnableBlockConfigs4 == null) {
                C2184791Aez.LIZ.getClass();
                runnableBlockConfigs2 = runnableBlockConfigs3;
            } else {
                runnableBlockConfigs2 = runnableBlockConfigs4;
            }
            C189200o6.m2constructorimpl(runnableBlockConfigs2);
            runnableBlockConfigs = runnableBlockConfigs2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            runnableBlockConfigs = c098200Yq;
        }
        if (C189200o6.m5exceptionOrNullimpl(runnableBlockConfigs) == null) {
            return runnableBlockConfigs;
        }
        C2184791Aez.LIZ.getClass();
        return C2184791Aez.LIZIZ;
    }
}
