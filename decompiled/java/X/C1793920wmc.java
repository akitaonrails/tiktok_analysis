package X;

import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import com.bytedance.globalpayment.service.manager.iap.IapExternalService;

/* JADX INFO: renamed from: X.0wmc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1793920wmc {
    public static final IapExternalService LIZ() {
        return PaymentServiceManager.get().getIapExternalService();
    }
}
