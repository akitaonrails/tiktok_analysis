package X;

import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0S02, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S02 extends C09AY implements Function0<IFeedService> {
    public C0S02() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ IFeedService invoke() {
        return ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZIZ();
    }
}
