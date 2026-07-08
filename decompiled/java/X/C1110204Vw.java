package X;

import com.bytedance.pumbaa.hybrid.domain.HybridDomainServiceImpl;
import com.bytedance.pumbaa.hybrid.domain.IHybridDomainService;

/* JADX INFO: renamed from: X.04Vw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1110204Vw {
    public static final IHybridDomainService LIZ() {
        Object objLIZ = C04TD.LIZ(IHybridDomainService.class, false);
        if (objLIZ != null) {
            return (IHybridDomainService) objLIZ;
        }
        if (C04TD.LJJIJLIJ == null) {
            synchronized (IHybridDomainService.class) {
                if (C04TD.LJJIJLIJ == null) {
                    C04TD.LJJIJLIJ = new HybridDomainServiceImpl();
                }
            }
        }
        return C04TD.LJJIJLIJ;
    }
}
