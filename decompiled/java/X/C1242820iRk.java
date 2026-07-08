package X;

import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0iRk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1242820iRk {
    public static final C1242820iRk LIZ = new C1242820iRk();

    public static InterfaceC1249740icu LIZ() {
        return ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).orderCenterService();
    }
}
