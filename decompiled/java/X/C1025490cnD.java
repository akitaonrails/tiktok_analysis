package X;

import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterCoreModel;
import com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0cnD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1025490cnD {
    public static final AbstractC1025510cnF LIZ(AbstractC1025510cnF abstractC1025510cnF, C1025520cnG c1025520cnG, CRouterCoreModel cRouterCoreModel, Object obj) {
        AbstractC1025510cnF abstractC1025510cnFLIZ;
        ICRouterAdapterDelegate iCRouterAdapterDelegate = (ICRouterAdapterDelegate) ServiceManager.get().getService(ICRouterAdapterDelegate.class);
        C1025480cnC c1025480cnC = new C1025480cnC(abstractC1025510cnF, c1025520cnG, cRouterCoreModel, obj);
        for (AbstractC1025500cnE abstractC1025500cnE : iCRouterAdapterDelegate.LJJIIZI()) {
            if (abstractC1025500cnE.LIZIZ(c1025480cnC)) {
                abstractC1025510cnFLIZ = abstractC1025500cnE.LIZ(c1025480cnC);
            } else {
                abstractC1025510cnFLIZ = c1025480cnC.LIZ;
            }
            c1025480cnC = new C1025480cnC(abstractC1025510cnFLIZ, c1025480cnC.LIZIZ, c1025480cnC.LIZJ, c1025480cnC.LIZLLL);
        }
        return c1025480cnC.LIZ;
    }
}
