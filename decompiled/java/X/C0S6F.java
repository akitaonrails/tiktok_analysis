package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0S6F, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S6F extends C09AY implements Function0<IMixFeedService> {
    public C0S6F() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.mix.services.IMixFeedService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IMixFeedService invoke() {
        return ServiceManager.get().getService(IMixFeedService.class);
    }
}
