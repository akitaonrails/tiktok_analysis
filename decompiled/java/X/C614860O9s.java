package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.service.optimistic.IPoiCollectService;
import com.ss.android.ugc.aweme.localservice.service.optimistic.PoiCollectEmptyService;
import java.util.List;

/* JADX INFO: renamed from: X.0O9s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C614860O9s implements IPoiCollectService {
    public static final C614860O9s LIZIZ = new C614860O9s();
    public final /* synthetic */ IPoiCollectService LIZ;

    @Override // com.ss.android.ugc.aweme.localservice.service.optimistic.IPoiCollectService
    public final void LIZIZ(C614810O9n c614810O9n) {
        this.LIZ.LIZIZ(c614810O9n);
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.optimistic.IPoiCollectService
    public final void LIZJ(C614840O9q c614840O9q) {
        this.LIZ.LIZJ(c614840O9q);
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.optimistic.IPoiCollectService
    public final void LIZLLL(C614810O9n c614810O9n, List list) {
        this.LIZ.LIZLLL(c614810O9n, list);
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.optimistic.IPoiCollectService
    public final InterfaceC346201Wa<C612220Nzo<C614810O9n>> subscribe() {
        return this.LIZ.subscribe();
    }

    public C614860O9s() {
        IPoiCollectService iPoiCollectService = (IPoiCollectService) PluggableExtentionKt.pluggableSpi$default(IPoiCollectService.class, false, false, false, 14, null);
        this.LIZ = iPoiCollectService == null ? new PoiCollectEmptyService() : iPoiCollectService;
    }
}
