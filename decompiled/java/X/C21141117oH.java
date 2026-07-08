package X;

import com.ss.android.ugc.aweme.commercialize.profile.api.ad.profilepage.ICommerceProfilePageService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.17oH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21141117oH extends C09AY implements Function0<ICommerceProfilePageService> {
    public C21141117oH() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.commercialize.profile.api.ad.profilepage.ICommerceProfilePageService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ICommerceProfilePageService invoke() {
        return ServiceManager.get().getService(ICommerceProfilePageService.class);
    }
}
