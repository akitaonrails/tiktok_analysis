package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.SelectAddressInfo;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.AddressBase;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomAddressInterceptor;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.03r2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C971803r2 extends C09AY implements Function2<List<? extends Region>, AddressBase, Unit> {
    public final /* synthetic */ EcomAddressInterceptor LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Object LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C971803r2(EcomAddressInterceptor ecomAddressInterceptor, boolean z, Object obj, int i) {
        super(2);
        this.LL = ecomAddressInterceptor;
        this.LLILLJJLI = z;
        this.LLILLL = obj;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(List<? extends Region> list, AddressBase addressBase) {
        List<? extends Region> list2 = list;
        EcomAddressInterceptor ecomAddressInterceptor = this.LL;
        boolean z = this.LLILLJJLI;
        ecomAddressInterceptor.getClass();
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ("ec_delivery_address_select", C1741890vQh.LJIIIIZZ(new SelectAddressInfo(null, list2, 2)));
        if (z) {
            C973303rH.LL.LIZJ(null, new ArrayList(list2));
        }
        EcomAddressInterceptor ecomAddressInterceptor2 = this.LL;
        Object obj = this.LLILLL;
        int i = this.LLILZ;
        ecomAddressInterceptor2.getClass();
        EcomAddressInterceptor.LIZ(2, i, obj, list2);
        return Unit.LIZ;
    }
}
