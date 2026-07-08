package X;

import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterCoreModel;
import com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0cg4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1021060cg4 {
    public final CRouterCoreModel LIZ;
    public final AbstractC1025510cnF LIZIZ;
    public final Map<String, Object> LIZJ;

    public /* synthetic */ C1021060cg4(CRouterCoreModel cRouterCoreModel, AbstractC1025510cnF abstractC1025510cnF, int i) {
        this((i & 1) != 0 ? null : cRouterCoreModel, (i & 2) != 0 ? ((ICRouterAdapterDelegate) ServiceManager.get().getService(ICRouterAdapterDelegate.class)).LJIJI() : abstractC1025510cnF, (i & 4) != 0 ? new LinkedHashMap() : null);
    }

    public C1021060cg4(CRouterCoreModel cRouterCoreModel, AbstractC1025510cnF abstractC1025510cnF, Map<String, Object> map) {
        this.LIZ = cRouterCoreModel;
        this.LIZIZ = abstractC1025510cnF;
        this.LIZJ = map;
    }
}
