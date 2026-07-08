package X;

import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;

/* JADX INFO: renamed from: X.0DIM, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DIM {
    public static final C0DIM LIZ = new C0DIM();

    public static Aweme LIZ() {
        IFeedService iFeedServiceLIZIZ;
        InterfaceC1008930cMV interfaceC1008930cMVLJ;
        Aweme awemeLJIIIIZZ;
        ICommerceService iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi$default(ICommerceService.class, false, false, false, 14, null);
        if (iCommerceService != null && (iFeedServiceLIZIZ = iCommerceService.LIZIZ()) != null && (interfaceC1008930cMVLJ = iFeedServiceLIZIZ.LJ()) != null && (awemeLJIIIIZZ = interfaceC1008930cMVLJ.LJIIIIZZ()) != null) {
            return awemeLJIIIIZZ;
        }
        C1019830ce5 c1019830ce5LIZ = C988850bq7.LIZ();
        if (c1019830ce5LIZ != null) {
            return c1019830ce5LIZ.LJIIL;
        }
        return null;
    }
}
