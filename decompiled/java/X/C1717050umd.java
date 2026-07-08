package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.generalpostpayment.GeneralPostPaymentApi;
import com.ss.android.ugc.aweme.ecommerce.network.IECRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0umd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1717050umd {
    public static final /* synthetic */ C1717050umd LIZ = new C1717050umd();

    public static GeneralPostPaymentApi LIZ(String str) {
        InterfaceC859903Xp interfaceC859903XpCreateBuilder;
        C01K1 c01k1Build;
        IECRetrofitFactory iECRetrofitFactory = (IECRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IECRetrofitFactory.class, false, false, false, 14, null);
        if (iECRetrofitFactory != null && (interfaceC859903XpCreateBuilder = iECRetrofitFactory.createBuilder(str)) != null && (c01k1Build = interfaceC859903XpCreateBuilder.build()) != null) {
            return (GeneralPostPaymentApi) c01k1Build.create(GeneralPostPaymentApi.class);
        }
        return null;
    }
}
