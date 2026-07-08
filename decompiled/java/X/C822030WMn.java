package X;

import com.bytedance.pumbaa.hybrid.governance.network.HybridTrafficColoringModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0WMn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C822030WMn {
    public static final HybridTrafficColoringModel LIZ;

    static {
        new C822030WMn();
        LIZ = new HybridTrafficColoringModel(false, false, false, false, false);
    }

    public static final HybridTrafficColoringModel LIZ() {
        Object c098200Yq;
        try {
            c098200Yq = (HybridTrafficColoringModel) C0C64.LJIILLIIL().LJJII(HybridTrafficColoringModel.class, LIZ, "hybrid_traffic_coloring_settings", true);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        HybridTrafficColoringModel hybridTrafficColoringModel = (HybridTrafficColoringModel) c098200Yq;
        return hybridTrafficColoringModel == null ? LIZ : hybridTrafficColoringModel;
    }
}
