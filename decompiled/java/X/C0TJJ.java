package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0TJJ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TJJ extends C09AY implements Function0<IPipFeedService> {
    public C0TJJ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IPipFeedService invoke() {
        return ServiceManager.get().getService(IPipFeedService.class);
    }
}
