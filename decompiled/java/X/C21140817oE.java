package X;

import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.17oE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21140817oE extends C09AY implements Function0<IFeedService> {
    public C21140817oE() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final IFeedService invoke() {
        return ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZIZ();
    }
}
