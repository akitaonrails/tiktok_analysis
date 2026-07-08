package X;

import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.ecommerce.IECommerceHybridService;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.mallentry.route.EcMallRouteInterceptor;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04Vu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1110004Vu extends C09AY implements Function0<List<IInterceptor>> {
    public C1110004Vu() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<IInterceptor> invoke() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new EcMallRouteInterceptor());
        arrayList.addAll(((IECommerceHybridService) ServiceManager.get().getService(IECommerceHybridService.class)).LJ());
        return arrayList;
    }
}
