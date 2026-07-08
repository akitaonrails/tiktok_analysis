package X;

import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.ecommerce.IECommerceHybridService;
import com.ss.android.ugc.aweme.ecommerce.compliance.interceptor.ECComplianceRouterInterceptor;
import com.ss.android.ugc.aweme.ecommerce.core.router.BtmRouterInterceptor;
import com.ss.android.ugc.aweme.ecommerce.core.router.ECRouterInterceptor;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomAddressInterceptor;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomPaymentInterceptor;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomPipoIntercepter;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04af, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1125104af extends C09AY implements Function0<List<IInterceptor>> {
    public final /* synthetic */ ECommerceService LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1125104af(ECommerceService eCommerceService) {
        super(0);
        this.LL = eCommerceService;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<IInterceptor> invoke() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.LL.fallbackInterceptor);
        arrayList.add(new BtmRouterInterceptor());
        if (C1124704ab.LIZ()) {
            arrayList.add(new ECComplianceRouterInterceptor());
        }
        arrayList.add(new ECRouterInterceptor());
        arrayList.add(new EcomPipoIntercepter());
        arrayList.add(new EcomPaymentInterceptor());
        arrayList.add(new EcomAddressInterceptor());
        arrayList.addAll(((IECommerceHybridService) ServiceManager.get().getService(IECommerceHybridService.class)).LJ());
        return arrayList;
    }
}
