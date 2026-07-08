package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.boost.ThreadBoostConfigs;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AfU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2185101AfU extends C09AY implements Function0<ThreadBoostConfigs> {
    public C2185101AfU() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final ThreadBoostConfigs invoke() {
        ThreadBoostConfigs threadBoostConfigs;
        ThreadBoostConfigs threadBoostConfigs2;
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            ThreadBoostConfigs threadBoostConfigs3 = C2185121AfW.LIZIZ;
            ThreadBoostConfigs threadBoostConfigs4 = (ThreadBoostConfigs) c0c64LJIILLIIL.LJJIIJ(true, "all_stage_thread_boost", 31744, ThreadBoostConfigs.class, threadBoostConfigs3, 2);
            if (threadBoostConfigs4 == null) {
                C2185121AfW.LIZ.getClass();
                threadBoostConfigs2 = threadBoostConfigs3;
            } else {
                threadBoostConfigs2 = threadBoostConfigs4;
            }
            C189200o6.m2constructorimpl(threadBoostConfigs2);
            threadBoostConfigs = threadBoostConfigs2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            threadBoostConfigs = c098200Yq;
        }
        if (C189200o6.m5exceptionOrNullimpl(threadBoostConfigs) == null) {
            return threadBoostConfigs;
        }
        C2185121AfW.LIZ.getClass();
        return C2185121AfW.LIZIZ;
    }
}
