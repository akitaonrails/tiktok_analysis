package X;

import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04aj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1125504aj extends C09AY implements Function0<IECommerceService> {
    public C1125504aj() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ecommerce.service.IECommerceService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IECommerceService invoke() {
        return ServiceManager.get().getService(IECommerceService.class);
    }
}
