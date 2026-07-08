package X;

import com.bytedance.pumbaa.hybrid.engine.api.IHybridEngine;
import com.bytedance.pumbaa.hybrid.engine.impl.HybridEngineService;

/* JADX INFO: renamed from: X.04Tu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1104804Tu {
    public static final IHybridEngine LIZ() {
        Object objLIZ = C04TD.LIZ(IHybridEngine.class, false);
        if (objLIZ != null) {
            return (IHybridEngine) objLIZ;
        }
        if (C04TD.LJJIL == null) {
            synchronized (IHybridEngine.class) {
                if (C04TD.LJJIL == null) {
                    C04TD.LJJIL = new HybridEngineService();
                }
            }
        }
        return C04TD.LJJIL;
    }
}
