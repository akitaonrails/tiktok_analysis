package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IPineDramaLynxCardService;

/* JADX INFO: renamed from: X.0s2I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1611440s2I {
    public static final /* synthetic */ C1611440s2I LIZ = new C1611440s2I();

    public static IPineDramaLynxCardService LIZ() {
        IPineDramaLynxCardService iPineDramaLynxCardService = (IPineDramaLynxCardService) PluggableExtentionKt.pluggableSpi$default(IPineDramaLynxCardService.class, false, false, false, 14, null);
        return iPineDramaLynxCardService == null ? new IPineDramaLynxCardService() { // from class: X.0s2J
            @Override // com.ss.android.ugc.aweme.service.IPineDramaLynxCardService
            public final void LIZ(InterfaceC1107590evd interfaceC1107590evd) {
            }

            @Override // com.ss.android.ugc.aweme.service.IPineDramaLynxCardService
            public final boolean LIZIZ() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.service.IPineDramaLynxCardService
            public final boolean LIZJ() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.service.IPineDramaLynxCardService
            public final void LIZLLL() {
            }

            @Override // com.ss.android.ugc.aweme.service.IPineDramaLynxCardService
            public final void LJ() {
            }
        } : iPineDramaLynxCardService;
    }
}
