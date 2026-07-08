package X;

import com.ss.android.ugc.aweme.ecommerce.service.IEcomMonitorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04Wy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1113004Wy extends C09AY implements Function0<List<? extends InterfaceC1326220kcG>> {
    public C1113004Wy() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends InterfaceC1326220kcG> invoke() {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ServiceManager.get().getServices(IEcomMonitorService.class).iterator();
        while (it2.hasNext()) {
            arrayList.addAll(((IEcomMonitorService) it2.next()).LIZ());
        }
        return C13LP.LLIIII(arrayList);
    }
}
