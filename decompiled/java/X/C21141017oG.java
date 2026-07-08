package X;

import com.ss.android.ugc.aweme.commercialize.navigate.ICommerceNavigateService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.17oG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21141017oG extends C09AY implements Function0<ICommerceNavigateService> {
    public C21141017oG() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.commercialize.navigate.ICommerceNavigateService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ICommerceNavigateService invoke() {
        return ServiceManager.get().getService(ICommerceNavigateService.class);
    }
}
