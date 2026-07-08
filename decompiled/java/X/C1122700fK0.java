package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.servicerouting.ServiceRoutingDetector;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fK0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122700fK0 extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ ServiceRoutingDetector LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122700fK0(ServiceRoutingDetector serviceRoutingDetector) {
        super(0);
        this.LL = serviceRoutingDetector;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z;
        EnumC1122660fJw.Companion.getClass();
        List<EnumC1122660fJw> list = EnumC1122660fJw.ROUTABLE_SKUS;
        ServiceRoutingDetector serviceRoutingDetector = this.LL;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = false;
        } else {
            Iterator<EnumC1122660fJw> it2 = list.iterator();
            while (it2.hasNext()) {
                if (serviceRoutingDetector.LLJJIII.LIZ(it2.next())) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
