package X;

import com.ss.android.ugc.aweme.ecommerce.service.IEcommerceInternalJSBridgeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.04Zt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1120304Zt {
    public static final C1120304Zt LIZ = new C1120304Zt();
    public static volatile boolean LIZIZ;

    public static void LIZ() {
        if (LIZIZ) {
            return;
        }
        LIZIZ = true;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ServiceManager.get().getServices(IEcommerceInternalJSBridgeService.class).iterator();
        while (it2.hasNext()) {
            arrayList.addAll(((IEcommerceInternalJSBridgeService) it2.next()).LIZ());
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C1543490qGh.LIZIZ((Class) it3.next(), null, 6);
        }
    }
}
