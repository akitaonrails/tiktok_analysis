package X;

import com.bytedance.pumbaa.hybrid.governance.api.lifecycle.HybridLifecycleServiceImpl;
import com.bytedance.pumbaa.hybrid.governance.api.lifecycle.IHybridLifecycleService;

/* JADX INFO: renamed from: X.04TG, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04TG {
    public static final IHybridLifecycleService LIZ() {
        Object objLIZ = C04TD.LIZ(IHybridLifecycleService.class, false);
        if (objLIZ != null) {
            return (IHybridLifecycleService) objLIZ;
        }
        if (C04TD.LJJJI == null) {
            synchronized (IHybridLifecycleService.class) {
                if (C04TD.LJJJI == null) {
                    C04TD.LJJJI = new HybridLifecycleServiceImpl();
                }
            }
        }
        return C04TD.LJJJI;
    }
}
