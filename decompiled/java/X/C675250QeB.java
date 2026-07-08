package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ab.EcVSearchLoadMoreConfig;

/* JADX INFO: renamed from: X.0QeB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C675250QeB {
    public static final EcVSearchLoadMoreConfig LIZ = new EcVSearchLoadMoreConfig(20);

    public static int LIZ() {
        Object c098200Yq;
        try {
            c098200Yq = (EcVSearchLoadMoreConfig) C0C64.LJIILLIIL().LJJII(EcVSearchLoadMoreConfig.class, LIZ, "load_more_config", true);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        EcVSearchLoadMoreConfig ecVSearchLoadMoreConfig = (EcVSearchLoadMoreConfig) c098200Yq;
        if (ecVSearchLoadMoreConfig == null) {
            ecVSearchLoadMoreConfig = LIZ;
        }
        return ecVSearchLoadMoreConfig.reqCount;
    }
}
